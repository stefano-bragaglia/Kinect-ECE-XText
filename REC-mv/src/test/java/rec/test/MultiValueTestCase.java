/**
 * Test case for the Event Calculus MultiValue in Drools.
 * Narratives long upto %d events, received in any order.
 */

package rec.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.type.FactType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.ObjectFilter;
import org.drools.runtime.StatefulKnowledgeSession;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author stefano
 *
 */
public class MultiValueTestCase {

	private class MVIFilter implements ObjectFilter {
		private Object fluent;
		private long start;
		private long length;
		private double value;
		public MVIFilter(Object fluent, long start, long length, double value) {
			this.fluent = fluent;
			this.start = start;
			this.length = length;
			this.value = value;
		}
		
		public boolean accept(Object paramObject) {
			FactType mvi = base.getFactType(PACKAGE, "MVI");
			return (mvi.getFactClass().isAssignableFrom(paramObject.getClass())
					&& mvi.get(paramObject, "fluent").equals(fluent)
					&& mvi.get(paramObject, "start").equals(start) && mvi.get(
					paramObject, "length").equals(length) && mvi.get(
					paramObject, "value").equals(value));
		}
	}

	private static String PACKAGE = "rec.test"; 
	
	private static KnowledgeBase base;

	private static final long inf = Long.MAX_VALUE;

	private static KnowledgeRuntimeLogger logger;

	private static final String RESOURCE = "General_multivalue_test.drl";

	private static StatefulKnowledgeSession session;

	private static final long tdef = 0;
	
	private static final long t0 = 2;

	private static final long t1 = 5;

	private static final long t2 = 10;

//	private static final long t3 = 15;

//	private static final long t4 = 20;

	private static final double vdef = 0.0;
	
	private static final double v0 = 0.3;

	private static final double v1 = 0.6;
	
	private static final double v2 = 0.9;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setupTestCase() throws Exception {
		KnowledgeBuilder builder = KnowledgeBuilderFactory
				.newKnowledgeBuilder();
		builder.add(ResourceFactory.newClassPathResource(RESOURCE),
				ResourceType.DRL);
		KnowledgeBuilderErrors errors = builder.getErrors();
		if (errors.size() > 0) {
			for (KnowledgeBuilderError error : errors)
				System.err.println(error);
			throw new IllegalArgumentException("Could not parse knowledge.");
		}
		base = KnowledgeBaseFactory.newKnowledgeBase();
		base.addKnowledgePackages(builder.getKnowledgePackages());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void closeTest() throws Exception {
		logger.close();
		System.gc();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void startTest() throws Exception {
		session = base.newStatefulKnowledgeSession();
		logger = KnowledgeRuntimeLoggerFactory.newFileLogger(session,
				"testcase");
	}


	private Object newSample(Object fluent, long time, double value) {
		Object result = null;
		try {
			FactType factType = base.getFactType(PACKAGE, "Sample");
			result = factType.newInstance();
			factType.set(result, "event", null);
			factType.set(result, "fluent", fluent);
			factType.set(result, "time", time);
			factType.set(result, "value", value);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return result;
	}

	private Object newFluent() {
		Object result = null;
		try {
			result = base.getFactType(PACKAGE, "Fluent").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Test
	public void testEmpty() {
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(0, objects.size());
	}


	@Test
	public void testFluent() {
		Object fluent = newFluent();

		session.insert(fluent);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(2, objects.size());
		assertTrue(objects.contains(fluent));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, inf, vdef)).size());
	}

	
	@Test
	public void testSample_A0() {
		Object fluent = newFluent();
		Object sample0 = newSample(fluent, t0, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(sample0);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(4, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(sample0));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, inf-t0, v0)).size());
	}
	
	@Test
	public void testSample_A1() {
		Object fluent = newFluent();
		Object sample0 = newSample(fluent, t0, v1);

		session.insert(fluent);
		session.insert(sample0);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(4, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(sample0));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, inf-t0, v1)).size());
	}
	
	@Test
	public void testSample0_A0A0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		System.out.println(objects.size());
		assertEquals(5, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
//		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, inf, v0)).size());
	}
	
	@Test
	public void testSample0_A0B1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
//		System.out.println(new ArrayList(objects));
		assertEquals(6, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, inf-t1, v1)).size());
	}

	@Test
	public void testSample0_B1A0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(6, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(a));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, inf-t1, v1)).size());
	}

	@Test
	public void testSample1_A0B1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t1, v0);
		Object b = newSample(fluent, t0, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(6, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, inf-t1, v0)).size());
	}

	@Test
	public void testSample1_B1A0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t1, v0);
		Object b = newSample(fluent, t0, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(6, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, inf-t1, v0)).size());
	}

	@Test
	public void testSample2_A1B0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(6, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, inf-t1, v0)).size());
	}

	@Test
	public void testSample2_B0A1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(6, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, inf-t1, v0)).size());
	}

	@Test
	public void testSample3_A1B0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t1, v1);
		Object b = newSample(fluent, t0, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(6, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, inf-t1, v1)).size());
	}

	@Test
	public void testSample3_B0A1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t1, v1);
		Object b = newSample(fluent, t0, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(6, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, inf-t1, v1)).size());
	}
	
	@Test
	public void testSample4_A0B0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
//		System.out.println(new ArrayList(objects));
		assertEquals(5, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, inf-t0, v0)).size());
	}
	
	@Test
	public void testSample4_B0A0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(5, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, inf-t0, v0)).size());
	}
	
	@Test
	public void testSample5_A0B0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t1, v0);
		Object b = newSample(fluent, t0, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(5, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, inf-t0, v0)).size());
	}
	
	@Test
	public void testSample5_B0A0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t1, v0);
		Object b = newSample(fluent, t0, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(5, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, inf-t0, v0)).size());
	}
	
	@Test
	public void testSample6_A1B1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(5, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, inf-t0, v1)).size());
	}
	
	@Test
	public void testSample6_B1A1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(5, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, inf-t0, v1)).size());
	}
	
	@Test
	public void testSample7_A1B1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t1, v1);
		Object b = newSample(fluent, t0, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(5, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, inf-t0, v1)).size());
	}
	
	@Test
	public void testSample7_B1A1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t1, v1);
		Object b = newSample(fluent, t0, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();

		Collection<Object> objects = session.getObjects();
		assertEquals(5, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, inf-t0, v1)).size());
	}
	
	@Test
	public void testSample1_A0B1C2() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v1);
		Object c = newSample(fluent, t2, v2);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v2)).size());
	}
	
	@Test
	public void testSample1_A0B2C1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v2);
		Object c = newSample(fluent, t2, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v1)).size());
	}
	
	@Test
	public void testSample1_A1B0C2() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v0);
		Object c = newSample(fluent, t2, v2);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v2)).size());
	}
	
	@Test
	public void testSample1_A1B2C0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v2);
		Object c = newSample(fluent, t2, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v0)).size());
	}
	
	@Test
	public void testSample1_A2B0C1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v2);
		Object b = newSample(fluent, t1, v0);
		Object c = newSample(fluent, t2, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v1)).size());
	}
	
	@Test
	public void testSample1_A2B1C0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v2);
		Object b = newSample(fluent, t1, v1);
		Object c = newSample(fluent, t2, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v0)).size());
	}
	
	@Test
	public void testSample2_A0B1C2() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v1);
		Object c = newSample(fluent, t2, v2);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v2)).size());
	}
	
	@Test
	public void testSample2_A0B2C1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v2);
		Object c = newSample(fluent, t2, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v1)).size());
	}
	
	@Test
	public void testSample2_A1B0C2() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v0);
		Object c = newSample(fluent, t2, v2);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v2)).size());
	}
	
	@Test
	public void testSample2_A1B2C0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v2);
		Object c = newSample(fluent, t2, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v0)).size());
	}
	
	@Test
	public void testSample2_A2B0C1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v2);
		Object b = newSample(fluent, t1, v0);
		Object c = newSample(fluent, t2, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v1)).size());
	}
	
	@Test
	public void testSample2_A2B1C0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v2);
		Object b = newSample(fluent, t1, v1);
		Object c = newSample(fluent, t2, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v0)).size());
	}

	@Test
	public void testSample3_A0B1C2() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v1);
		Object c = newSample(fluent, t2, v2);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v2)).size());
	}
	
	@Test
	public void testSample3_A0B2C1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v2);
		Object c = newSample(fluent, t2, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v1)).size());
	}
	
	@Test
	public void testSample3_A1B0C2() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v0);
		Object c = newSample(fluent, t2, v2);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v2)).size());
	}
	
	@Test
	public void testSample3_A1B2C0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v2);
		Object c = newSample(fluent, t2, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v0)).size());
	}
	
	@Test
	public void testSample3_A2B0C1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v2);
		Object b = newSample(fluent, t1, v0);
		Object c = newSample(fluent, t2, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v1)).size());
	}
	
	@Test
	public void testSample3_A2B1C0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v2);
		Object b = newSample(fluent, t1, v1);
		Object c = newSample(fluent, t2, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v0)).size());
	}
	
	@Test
	public void testSample4_A0B1C2() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v1);
		Object c = newSample(fluent, t2, v2);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v2)).size());
	}
	
	@Test
	public void testSample4_A0B2C1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v2);
		Object c = newSample(fluent, t2, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v1)).size());
	}
	
	@Test
	public void testSample4_A1B0C2() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v0);
		Object c = newSample(fluent, t2, v2);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v2)).size());
	}
	
	@Test
	public void testSample4_A1B2C0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v2);
		Object c = newSample(fluent, t2, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v0)).size());
	}
	
	@Test
	public void testSample4_A2B0C1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v2);
		Object b = newSample(fluent, t1, v0);
		Object c = newSample(fluent, t2, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v1)).size());
	}
	
	@Test
	public void testSample4_A2B1C0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v2);
		Object b = newSample(fluent, t1, v1);
		Object c = newSample(fluent, t2, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v0)).size());
	}
	
	@Test
	public void testSample5_A0B1C2() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v1);
		Object c = newSample(fluent, t2, v2);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v2)).size());
	}
	
	@Test
	public void testSample5_A0B2C1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v2);
		Object c = newSample(fluent, t2, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v1)).size());
	}
	
	@Test
	public void testSample5_A1B0C2() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v0);
		Object c = newSample(fluent, t2, v2);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v2)).size());
	}
	
	@Test
	public void testSample5_A1B2C0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v2);
		Object c = newSample(fluent, t2, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v0)).size());
	}
	
	@Test
	public void testSample5_A2B0C1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v2);
		Object b = newSample(fluent, t1, v0);
		Object c = newSample(fluent, t2, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v1)).size());
	}
	
	@Test
	public void testSample5_A2B1C0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v2);
		Object b = newSample(fluent, t1, v1);
		Object c = newSample(fluent, t2, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v0)).size());
	}

	@Test
	public void testSample6_A0B1C2() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v1);
		Object c = newSample(fluent, t2, v2);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v2)).size());
	}
	
	@Test
	public void testSample6_A0B2C1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v0);
		Object b = newSample(fluent, t1, v2);
		Object c = newSample(fluent, t2, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v1)).size());
	}
	
	@Test
	public void testSample6_A1B0C2() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v0);
		Object c = newSample(fluent, t2, v2);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v2)).size());
	}
	
	@Test
	public void testSample6_A1B2C0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v1);
		Object b = newSample(fluent, t1, v2);
		Object c = newSample(fluent, t2, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v0)).size());
	}
	
	@Test
	public void testSample6_A2B0C1() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v2);
		Object b = newSample(fluent, t1, v0);
		Object c = newSample(fluent, t2, v1);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v0)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v1)).size());
	}
	
	@Test
	public void testSample6_A2B1C0() {
		Object fluent = newFluent();
		Object a = newSample(fluent, t0, v2);
		Object b = newSample(fluent, t1, v1);
		Object c = newSample(fluent, t2, v0);

		session.insert(fluent);
		session.fireAllRules();
		session.insert(c);
		session.fireAllRules();
		session.insert(a);
		session.fireAllRules();
		session.insert(b);
		session.fireAllRules();
		
		Collection<Object> objects = session.getObjects();
		assertEquals(8, objects.size());
		assertTrue(objects.contains(fluent));
		assertTrue(objects.contains(a));
		assertTrue(objects.contains(b));
		assertTrue(objects.contains(c));
		assertEquals(1, session.getObjects(new MVIFilter(fluent, tdef, t0, vdef)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t0, t1-t0, v2)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t1, t2-t1, v1)).size());
		assertEquals(1, session.getObjects(new MVIFilter(fluent, t2, inf-t2, v0)).size());
	}

}