package com.junittest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.conditions.NotDescr;
import org.xtext.ecerule.model.conditions.compounds.AndDescr;
import org.xtext.ecerule.model.conditions.relations.LessDescr;
import org.xtext.ecerule.model.conditions.relations.MoreDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;

public class testNotJunit {

	@Test
	public void testNot() {
		ConditionInterface condContainer = new NotDescr(new LessDescr( new NumberDescr(3),new NumberDescr(7)));
        boolean result = condContainer.validate();
        assertEquals(result, false);
        
        condContainer = new NotDescr(new LessDescr( new NumberDescr(30),new NumberDescr(7)));
        result = condContainer.validate();
        assertEquals(result, true);
	}

}
