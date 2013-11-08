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
	public void testAndSimple() {
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
	public void testOrSimple() {
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

}
