/**
 * 
 */
package org.rec.reasoner;

import java.util.Collection;
import java.util.Observable;
import java.util.concurrent.TimeUnit;


//import rec.dom.Interval;
import org.rec.messages.EventMessage;
import org.support.KnowledgeBase;
import org.support.KnowledgeBaseConfiguration;
import org.support.KnowledgeBaseFactory;
import org.support.builder.KnowledgeBuilder;
import org.support.builder.KnowledgeBuilderError;
import org.support.builder.KnowledgeBuilderErrors;
import org.support.builder.KnowledgeBuilderFactory;
import org.support.builder.ResourceType;
import org.support.conf.EventProcessingOption;
import org.support.definition.type.FactType;
import org.support.event.rule.ObjectInsertedEvent;
import org.support.event.rule.ObjectRetractedEvent;
import org.support.event.rule.ObjectUpdatedEvent;
import org.support.event.rule.WorkingMemoryEventListener;
import org.support.io.ResourceFactory;
import org.support.runtime.ClassObjectFilter;
import org.support.runtime.KnowledgeSessionConfiguration;
import org.support.runtime.StatefulKnowledgeSession;
import org.support.runtime.conf.ClockTypeOption;
import org.support.runtime.rule.FactHandle;
import org.support.time.SessionPseudoClock;

/**
 * @author stefano
 * 
 */
public class Reasoner extends Observable {

	private Integer wait = new Integer(1000);

	private static final String PACKAGE = "rec.dom";

	private static final String[] TYPES = { "MVI", "Sample", "Event", "Fluent" };

	public static Reasoner newReasoner(Model model) {
		if (model == null || !model.isConsistent())
			throw new IllegalArgumentException(
					"Illegal 'model' argument in Reasoner.newReasoner(Model): "
							+ model);
		return new Reasoner(model);
	}

	private SessionPseudoClock clock;

	private WorkingMemoryEventListener eventListener = new WorkingMemoryEventListener() {

		public void objectInserted(ObjectInsertedEvent event) {
			Object object = event.getObject();
			Class<?> objectClass = object.getClass();

			Object[] obj = new Object[3];

			if (mviType.getFactClass().isAssignableFrom(objectClass)) {
				// Parametri Oggetto "MVI":

				// name
				// String name = objectClass.getSimpleName();

				// event

				// start
				Long start = (Long) mviType.get(object, "start");

				// value
				Double value = (Double) mviType.get(object, "value");

				// fluent
				Object fluentObject = (Object) mviType.get(object, "fluent");
				Class<?> objectClass1 = fluentObject.getClass();
				String fluentName = objectClass1.getSimpleName();

				// if (fluentName.equalsIgnoreCase("Repetition") && value > 0)
				// System.err.println("MVI: " + fluentName + " " + start + " "
				// + value);

				obj[0] = fluentName;
				obj[1] = value;
				obj[2] = start;

				setChanged();
				notifyObservers(obj);

				// Interval interval = Interval
				// .getFuzzyInterval(val.doubleValue());
				// notifyObservers(MVIMessage.newMessage(name, fluentName,
				// start,
				// interval));
			}

			if (eventType.getFactClass().isAssignableFrom(objectClass)) {
				String name = objectClass.getSimpleName();
				Long start = (Long) eventType.get(object, "start");

				// System.err.println("Event: " + objectClass.getSimpleName()
				// + " " + start);

				setChanged();
				notifyObservers(EventMessage.newMessage(name, start));
			}
		}

		public void objectRetracted(ObjectRetractedEvent arg0) {
		}

		public void objectUpdated(ObjectUpdatedEvent event) {
			// Object object = event.getObject();
			// Class<?> objectClass = object.getClass();
			//
			// if (mviType.getFactClass().isAssignableFrom(objectClass)) {
			// // name
			// String name = objectClass.getSimpleName();
			//
			// // start
			// Long start = (Long) mviType.get(object, "start");
			//
			// // value
			// Object value = (Object) mviType.get(object, "value");
			//
			// // length
			// // Long length = (Long) mviType.get(object, "length");
			//
			// // fluent
			// Object fluentObject = (Object) mviType.get(object, "fluent");
			// Class<?> objectClass1 = fluentObject.getClass();
			// String fluentName = objectClass1.getSimpleName();
			//
			// // System.err.println("updated MVI: " +
			// // objectClass.getSimpleName()
			// // + " " + fluentName + " " + start + " " + value + " " +
			// // length);
			//
			// setChanged();
			//
			// Double val = (Double) value;
			// Interval interval = Interval
			// .getFuzzyInterval(val.doubleValue());
			// notifyObservers(MVIMessage.newMessage(name, fluentName, start,
			// interval));
			// }

		}

	};

	private FactType eventType;

	private FactType mviType;

	private Model model;

	private boolean pseudo;

	private StatefulKnowledgeSession session;

	private boolean started = false;

	private String general = "General_multivalue.drl",
	// specific = "Demo_sitTOstand.drl";
			specific = "StayInShape.drl";

	private KnowledgeBuilder builder;

	private Reasoner(Model model) {
		if (model == null || !model.isConsistent())
			throw new IllegalArgumentException(
					"Illegal 'model' argument in Reasoner(Model): " + model);
		this.model = model;

		init();

		// System.err.println("Tempo iniziale dello pseudo clock: " +
		// clock.getCurrentTime());
		assert invariant() : "Illegal state in Reasoner(Model)";
	}

	private void init() {

		builder = KnowledgeBuilderFactory.newKnowledgeBuilder();

		// builder.add(ResourceFactory.newClassPathResource(getClass().getResource(general).getFile(),
		// getClass()), ResourceType.DRL);
		// builder.add(ResourceFactory.newClassPathResource(getClass().getResource(specific).getFile(),
		// getClass()), ResourceType.DRL);
		//
		builder.add(
				ResourceFactory.newClassPathResource("rec/reasoner/" + general),
				ResourceType.DRL);
		builder.add(ResourceFactory.newClassPathResource("rec/reasoner/"
				+ specific), ResourceType.DRL);

		for (String resource : model.getResources())
			builder.add(ResourceFactory.newClassPathResource(resource),
					ResourceType.DRL);
		if (builder.hasErrors()) {
			KnowledgeBuilderErrors errors = builder.getErrors();
			for (KnowledgeBuilderError error : errors) {
				System.err.println(error);
			}
			throw new IllegalArgumentException("Could not parse knowledge.");
		}
		KnowledgeBaseConfiguration config = KnowledgeBaseFactory
				.newKnowledgeBaseConfiguration();
		config.setOption(EventProcessingOption.STREAM);

		KnowledgeBase base = KnowledgeBaseFactory.newKnowledgeBase(config);
		base.addKnowledgePackages(builder.getKnowledgePackages());

		eventType = base.getFactType(PACKAGE, "Event");
		mviType = base.getFactType(PACKAGE, "MVI");

		KnowledgeSessionConfiguration ksconfig = KnowledgeBaseFactory
				.newKnowledgeSessionConfiguration();
		pseudo = model.getConfig().getClock().equals(ConfigClock.PSEUDO_TIME);
		ksconfig.setOption(ClockTypeOption.get(pseudo ? "pseudo" : "realtime"));
		session = base.newStatefulKnowledgeSession(ksconfig, null);
		session.addEventListener(eventListener);

		clock = pseudo ? (SessionPseudoClock) session.getSessionClock() : null;

		// set the stringbuilder
		session.setGlobal("wait", wait);
	}

	private int count(String type) {
		Class<?> c = session.getKnowledgeBase().getFactType(PACKAGE, type)
				.getFactClass();
		int result = session.getObjects(new ClassObjectFilter(c)).size();
		assert invariant() : "Illegal state in DroolsTest.count(String)";
		return result;
	}

	public void flush() {
		((SessionPseudoClock) clock).advanceTime(1, TimeUnit.MILLISECONDS);
		session.fireAllRules();
		assert invariant() : "Illegal state in Reasoner.flush()";
	}

	public Model getModel() {
		return model;
	}

	private boolean invariant() {
		return (model != null && model.isConsistent()
				&& (pseudo || clock != null) && session != null);
	}

	/**
	 * @param name
	 *            nome dell'evento.
	 * @param start
	 *            tempo in *msec* dell'evento che stiamo notificando rispetto al
	 *            tempo di avvio del programma.
	 * @return
	 */
	public FactHandle notify(String name, long start, double value) {

		// System.out.println(name + "\t" + start + "\t" + value);

		FactHandle handle = null;
		try {
			long delay = start - clock.getCurrentTime();
			// System.out.println(delay + "\n\t" + start + "\n\t" +
			// clock.getCurrentTime());
			if (delay < 0)
				delay = 0;
			clock.advanceTime(delay, TimeUnit.MILLISECONDS);
			// System.err.println("Tempo: " + clock.getCurrentTime() + " [" +
			// delay + " - " + start + "]");
			FactType facttype = session.getKnowledgeBase().getFactType(PACKAGE,
					name);
			Object p = facttype.newInstance();
			facttype.set(p, "start", start);
			facttype.set(p, "value", value);
			handle = session.insert(p);
			// long elapsed = System.currentTimeMillis();
			session.fireAllRules();
			// elapsed = System.currentTimeMillis() - elapsed;
			// long footprint = Runtime.getRuntime().totalMemory()
			// - Runtime.getRuntime().freeMemory();

			// stamp();

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		assert invariant() : "Illegal state in Reasoner.insert(String, long)";
		return handle;
	}

	public void stamp() {
		String title = "WM's content (";
		int i = 1;
		for (String type : TYPES)
			title += type.charAt(0) + ":" + count(type)
					+ (TYPES.length == i++ ? " = " : " + ");

		Collection<Object> objects = session.getObjects();
		title += objects.size() + "):";
		String line = "-------------------------------------";
		while (line.length() < title.length())
			line += "-";
		System.out.println();
		System.out.println(title);
		System.out.println(line);
		for (Object object : objects)
			System.out.println(object);
		System.out.println();
		assert invariant() : "Illegal state in Reasoner.stamp()";
	}

	public void start() {
		if (!started) {
			try {
				FactType facttype = session.getKnowledgeBase().getFactType(
						PACKAGE, "Initially");
				Object p = facttype.newInstance();
				session.insert(p);
				started = true;
				session.fireAllRules();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		assert invariant() : "Illegal state in Reasoner.start()";
	}

	public void stop() {
		started = false;
		session.dispose();
	}
}
