package com.junittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.conditions.compounds.AndDescr;
import org.xtext.ecerule.model.conditions.compounds.OrDescr;
import org.xtext.ecerule.model.conditions.relations.LessDescr;
import org.xtext.ecerule.model.conditions.relations.MoreDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;

public class testCompoundsJunit {

	@SuppressWarnings("restriction")
	@Test
	public void testAndSimple() {	//AND
		ConditionInterface condContainer = new AndDescr(new MoreDescr(new NumberDescr(15),new NumberDescr(8)),new LessDescr(new NumberDescr(3),new NumberDescr(7)));
        boolean result = condContainer.validate();
        assertEquals(result, true);
        
        condContainer = new AndDescr(new MoreDescr(new NumberDescr(2),new NumberDescr(8)),new LessDescr(new NumberDescr(3),new NumberDescr(7)));
        result = condContainer.validate();
        assertEquals(result, false);
        
        condContainer = new AndDescr(new MoreDescr(new NumberDescr(2),new NumberDescr(8)),new LessDescr(new NumberDescr(25),new NumberDescr(7)));
        result = condContainer.validate();
        assertEquals(result, false);
        
		condContainer = new AndDescr(new MoreDescr(new NumberDescr(15),new NumberDescr(8)),new LessDescr(new NumberDescr(25),new NumberDescr(7)));
		result = condContainer.validate();
        assertEquals(result, false);
		
	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testAndTriple() {	//AND AND
		ConditionInterface condContainer = new AndDescr(new AndDescr(new LessDescr( new NumberDescr(1),new NumberDescr(3)),new LessDescr( new NumberDescr(3),new NumberDescr(7))),new LessDescr( new NumberDescr(7),new NumberDescr(9)));
		boolean result = condContainer.validate();
        assertEquals(result, true);
        
        condContainer = new AndDescr(new AndDescr(new LessDescr( new NumberDescr(1),new NumberDescr(3)),new LessDescr( new NumberDescr(11),new NumberDescr(7))),new LessDescr( new NumberDescr(7),new NumberDescr(9)));
		result = condContainer.validate();
        assertEquals(result, false);
        
        condContainer = new AndDescr(new AndDescr(new LessDescr( new NumberDescr(1),new NumberDescr(3)),new LessDescr( new NumberDescr(11),new NumberDescr(7))),new LessDescr( new NumberDescr(20),new NumberDescr(9)));
		result = condContainer.validate();
        assertEquals(result, false);
        
        condContainer = new AndDescr(new AndDescr(new LessDescr( new NumberDescr(15),new NumberDescr(3)),new LessDescr( new NumberDescr(11),new NumberDescr(7))),new LessDescr( new NumberDescr(20),new NumberDescr(9)));
		result = condContainer.validate();
        assertEquals(result, false);
	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testOrSimple() {	//OR
		ConditionInterface condContainer = new OrDescr(new MoreDescr(new NumberDescr(15),new NumberDescr(8)),new LessDescr(new NumberDescr(3),new NumberDescr(7)));
        boolean result = condContainer.validate();
        assertEquals(result, true);

        condContainer = new OrDescr(new MoreDescr(new NumberDescr(5),new NumberDescr(8)),new LessDescr(new NumberDescr(3),new NumberDescr(7)));
        result = condContainer.validate();
        assertEquals(result, true);
        
        condContainer = new OrDescr(new MoreDescr(new NumberDescr(15),new NumberDescr(8)),new LessDescr(new NumberDescr(10),new NumberDescr(7)));
        result = condContainer.validate();
        assertEquals(result, true);
        
        condContainer = new OrDescr(new MoreDescr(new NumberDescr(5),new NumberDescr(8)),new LessDescr(new NumberDescr(10),new NumberDescr(7)));
        result = condContainer.validate();
        assertEquals(result, false);
       
	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testOrTriple() {	//OR OR
		ConditionInterface condContainer = new OrDescr(new OrDescr(new LessDescr( new NumberDescr(1),new NumberDescr(3)),new LessDescr( new NumberDescr(3),new NumberDescr(7))),new LessDescr( new NumberDescr(7),new NumberDescr(9)));
		boolean result = condContainer.validate();
        assertEquals(result, true);
        
        condContainer = new OrDescr(new OrDescr(new LessDescr( new NumberDescr(10),new NumberDescr(3)),new LessDescr( new NumberDescr(3),new NumberDescr(7))),new LessDescr( new NumberDescr(7),new NumberDescr(9)));
		result = condContainer.validate();
        assertEquals(result, true);
        
        condContainer = new OrDescr(new OrDescr(new LessDescr( new NumberDescr(10),new NumberDescr(3)),new LessDescr( new NumberDescr(30),new NumberDescr(7))),new LessDescr( new NumberDescr(7),new NumberDescr(9)));
		result = condContainer.validate();
        assertEquals(result, true);
        
        condContainer = new OrDescr(new OrDescr(new LessDescr( new NumberDescr(10),new NumberDescr(3)),new LessDescr( new NumberDescr(30),new NumberDescr(7))),new LessDescr( new NumberDescr(70),new NumberDescr(9)));
		result = condContainer.validate();
        assertEquals(result, false);
	}

}
