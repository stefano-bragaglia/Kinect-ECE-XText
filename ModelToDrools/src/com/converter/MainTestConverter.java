package com.converter;

import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.Event;
import org.xtext.ecerule.model.ExpContext;
import org.xtext.ecerule.model.Model;
import org.xtext.ecerule.model.Statement;
import org.xtext.ecerule.model.conditions.relations.LessDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;
import org.xtext.ecerule.model.expressions.ParameterDescr;

public class MainTestConverter {

	public static void main(String[] args) {
		
		//1) inserimento statement java
		
		Model model = new Model();
		Statement statement = new Statement();
		Event event = new Event();
		String eventName = "PersonaSuBilancia";
		event.setEventName(eventName);
		event.addEventFeature("pesata");
		statement.setEvent(event);
		 								

		ExpContext expContext = new ExpContext();
		ConditionInterface condContainer = new LessDescr(new ParameterDescr("pesata") ,new NumberDescr(100));
		expContext.setFinalCondition(condContainer);		
		statement.addExpContext(expContext);

								
		
		model.add("StmPersonaSuBilancia", statement);
		
		
		
		
		//2) traduzione in statement drools 
		ModelConverter mc = new ModelConverter(model);
		
		
		
		
		

	}

}
