package com.junittest;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;
import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.conditions.relations.DifferentDescr;
import org.xtext.ecerule.model.conditions.relations.LessDescr;
import org.xtext.ecerule.model.conditions.relations.LessEqualsDescr;
import org.xtext.ecerule.model.conditions.relations.MoreDescr;
import org.xtext.ecerule.model.conditions.relations.MoreEqualsDescr;
import org.xtext.ecerule.model.conditions.relations.SameDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;

public class testRelationsJunit {

	@SuppressWarnings("restriction")
	@Test
	public void testMoreEquals() {
		ConditionInterface condContainer = new MoreEqualsDescr(new NumberDescr(7), new NumberDescr(3));
        boolean result = condContainer.validate();
        assertEquals(result, true);
        condContainer = new MoreEqualsDescr(new NumberDescr(2), new NumberDescr(7));
        result = condContainer.validate();
        assertEquals(result, false);
	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testLessEquals() {
		ConditionInterface condContainer = new LessEqualsDescr(new NumberDescr(7), new NumberDescr(3));
        boolean result = condContainer.validate();
        assertEquals(result, false);
        condContainer = new LessEqualsDescr(new NumberDescr(2), new NumberDescr(7));
        result = condContainer.validate();
        assertEquals(result, true);
	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testMore() {
		ConditionInterface condContainer = new MoreDescr(new NumberDescr(15),new NumberDescr(8));
        boolean result = condContainer.validate();
        assertEquals(result, true);
        condContainer = new MoreDescr(new NumberDescr(2), new NumberDescr(7));
        result = condContainer.validate();
        assertEquals(result, false);
	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testLess() {
		ConditionInterface condContainer = new LessDescr(new NumberDescr(25),new NumberDescr(7));
        boolean result = condContainer.validate();
        assertEquals(result, false);
        condContainer = new LessDescr(new NumberDescr(2), new NumberDescr(7));
        result = condContainer.validate();
        assertEquals(result, true);
	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testDifferent() {
		ConditionInterface condContainer = new DifferentDescr(new NumberDescr(7), new NumberDescr(3));
        boolean result = condContainer.validate();
        assertEquals(result, true);
        condContainer = new DifferentDescr(new NumberDescr(2), new NumberDescr(2));
        result = condContainer.validate();
        assertEquals(result, false);
	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testSame() {
		ConditionInterface condContainer = new SameDescr(new NumberDescr(7), new NumberDescr(3));
        boolean result = condContainer.validate();
        assertEquals(result, false);
        condContainer = new SameDescr(new NumberDescr(2), new NumberDescr(2));
        result = condContainer.validate();
        assertEquals(result, true);
	}

}
