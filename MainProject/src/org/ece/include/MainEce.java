package org.ece.include;

	import org.xtext.ecerule.model.*;
	import org.xtext.ecerule.model.conditions.*;
	import org.xtext.ecerule.model.conditions.compounds.*;
	import org.xtext.ecerule.model.conditions.relations.*;
	import org.xtext.ecerule.model.expressions.*;
	import org.xtext.ecerule.model.expressions.operations.*;
	
	public class MainEce {
		
		public static Model getModel() {	
			
			Statement statement;
			Event event;
			String eventName;
			ExpressionInterface exprContainer;
			ConditionInterface condContainer;
			//EcContext ecContext;
			ExpContext expContext;
			Time time;
			
			Model model = new Model();
			
			
		statement = new Statement();
event = new Event();
eventName = "Start";
event.setEventName(eventName);
statement.setEvent(event);
 								//ecContext = new EcContext();
//statement.addEcContext(ecContext);


													model.add("StmStart", statement);


		statement = new Statement();
event = new Event();
eventName = "LeftArmStretched";
event.setEventName(eventName);
statement.setEvent(event);
 								
expContext = new ExpContext();

condContainer = new SameDescr(new SampleDescr("LeftArmLowered")
,new NumberDescr(1));
expContext.setFinalCondition(condContainer);

time = new Time();
time.setAllenOp("after");
		time.setTimeValue(10);
expContext.setTime(time);

statement.addExpContext(expContext);

													model.add("StmLeftArmStretched", statement);


			
			return model;
		}	
	}
