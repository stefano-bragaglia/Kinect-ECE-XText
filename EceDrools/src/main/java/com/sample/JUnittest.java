package com.sample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.ExpressionInterface;
import org.xtext.ecerule.model.conditions.relations.DifferentDescr;
import org.xtext.ecerule.model.conditions.relations.LessDescr;
import org.xtext.ecerule.model.conditions.relations.LessEqualsDescr;
import org.xtext.ecerule.model.conditions.relations.MoreDescr;
import org.xtext.ecerule.model.conditions.relations.MoreEqualsDescr;
import org.xtext.ecerule.model.conditions.relations.SameDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;
import org.xtext.ecerule.model.expressions.operations.MinusDescr;
import org.xtext.ecerule.model.expressions.operations.ModulusDescr;
import org.xtext.ecerule.model.expressions.operations.MultDescr;
import org.xtext.ecerule.model.expressions.operations.ObelusDescr;
import org.xtext.ecerule.model.expressions.operations.PlusDescr;

public class JUnittest {

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
	public void testLess() {
		ConditionInterface condContainer = new LessDescr(new NumberDescr(7), new NumberDescr(3));
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
	
	//**********************************************************************************************
	
	@SuppressWarnings("restriction")
	@Test
	public void testMinus() {
		ExpressionInterface exprContainer = new MinusDescr(new NumberDescr(7), new NumberDescr(3));
        double result = exprContainer.validate();
        assertEquals(4, result, 0);
	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testPlus() {
		ExpressionInterface exprContainer = new PlusDescr(new NumberDescr(7), new NumberDescr(3));
        double result = exprContainer.validate();
        assertEquals(10, result, 0);
	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testModulus() {
		ExpressionInterface exprContainer = new ModulusDescr(new NumberDescr(10), new NumberDescr(3));
        double result = exprContainer.validate();
        assertEquals(1, result, 0);
	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testObelus() { //divisione
		ExpressionInterface exprContainer = new ObelusDescr(new NumberDescr(12), new NumberDescr(3));
        double result = exprContainer.validate();
        assertEquals(4, result, 0);
	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testMult() { //divisione
		ExpressionInterface exprContainer = new MultDescr(new NumberDescr(4), new NumberDescr(3));
        double result = exprContainer.validate();
        assertEquals(12, result, 0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
