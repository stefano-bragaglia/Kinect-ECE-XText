package org.ece.main;

import java.io.FileNotFoundException;
import java.util.HashMap;

import org.ece.include.MainEce;
import org.ece.reasoner.ReasonerECE;
import org.model.ActionAftExpectEval;
import org.model.ConditionInterface;
import org.model.EcContext;
import org.model.Event;
import org.model.ExpContext;
import org.model.ExpressionInterface;
import org.model.Fluent;
import org.model.FluentInterface;
import org.model.Model;
import org.model.Statement;
import org.model.Time;
import org.model.conditions.relations.SameDescr;
import org.model.expressions.NumberDescr;
import org.model.expressions.SampleDescr;
import org.model.expressions.operations.MultDescr;

import applet.Background;


public class MainLaucher {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println();

		
		// ---------------------------------------------------------------------------
		//se braccio a T, mi aspetto braccio abbassato dopo 10 
		Statement statement;
		Event event;
		String eventName;
		ExpressionInterface exprContainer;
		ConditionInterface condContainer;
		FluentInterface fluent;
		EcContext ecContext;
		ExpContext expContext;
		Time time;

		Model model = new Model();

////////////////////////////////////////////////////////////////		
		
//inizializzo tutti i fluenti a -1
		statement = new Statement();
		
		event = new Event();
		eventName = "Start";
		event.setEventName(eventName);
		statement.setEvent(event);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArm");
		exprContainer = new NumberDescr(-1);
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArmStrConf");
		exprContainer = new NumberDescr(-1);
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArmLowConf");
		exprContainer = new NumberDescr(-1);
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		ecContext = new EcContext();
		fluent = new Fluent("Score");
		exprContainer = new NumberDescr(-1);
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		model.add("Stm_Start", statement);
		
		
		
		
		
//se c'è un evento braccio alzato, setta la posa del braccio a 1 
//e salva la confidenza in un fluente
//inoltre, lancia un'aspettativa
		statement = new Statement();
		
		event = new Event();
		eventName = "LeftArmStr";
		event.setEventName(eventName);
		event.addEventFeature("poseConf");
		statement.setEvent(event);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArm");
		exprContainer = new NumberDescr(1);
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArmStrConf");
		exprContainer = new SampleDescr("poseConf");
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		expContext = new ExpContext();
		condContainer = new SameDescr(new SampleDescr("LeftArm"), new NumberDescr(0));
		expContext.setFinalCondition(condContainer);
		time = new Time();
		time.setAllenOp("before");
		time.setTimeValue(10);
		expContext.setTime(time);
		expContext.setActionOnFulf(new ActionAftExpectEval("MyExpectationFulf"));
		expContext.setActionOnViol(new ActionAftExpectEval("MyExpectationViol"));
		statement.addExpContext(expContext);
		
		
		
		model.add("Stm_LeftArmStr", statement);
		
		
		
		
//se c'è un evento braccio abbassato, setta la posa del braccio a 0 
//e salva la confidenza in un fluente
		statement = new Statement();
		
		event = new Event();
		eventName = "LeftArmLow";
		event.setEventName(eventName);
		event.addEventFeature("poseConf");
		statement.setEvent(event);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArm");
		exprContainer = new NumberDescr(0);
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArmLowConf");
		exprContainer = new SampleDescr("poseConf");
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		model.add("Stm_LeftArmLow", statement);
		
		
		
//se c'è un "evento interno" setta lo score al prodotto delle
//confidenze delle due pose attraversate
		
		statement = new Statement();
		
		event = new Event();
		eventName = "MyExpectationFulf";
		event.setEventName(eventName);
		statement.setEvent(event);
		
		ecContext = new EcContext();
		fluent = new Fluent("Score");
		exprContainer = new MultDescr(new SampleDescr("LeftArmStrConf"), new SampleDescr("LeftArmLowConf"));
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		model.add("Stm_MyExpectationFulf", statement);
		
		
/////////////////////////////////////////////////////////////////
		
		
		//Model model = MainEce.getModel();
		
		
		
		ReasonerECE eceReasoner = new ReasonerECE();
		eceReasoner.setModel(model);
		eceReasoner.init();
		eceReasoner.start();
		
		
	
		
		
		eceReasoner.notifyEvent("Start", new HashMap<String, Object>(), eceReasoner.getCurrentTime()+1);
	
		HashMap hm = new HashMap<String, Object>();
		hm.put("confidence", 95);
		eceReasoner.notifyEvent("LeftArmStr", hm, eceReasoner.getCurrentTime()+1);
		
		hm = new HashMap<String, Object>();
		hm.put("confidence", 91);
		eceReasoner.notifyEvent("LeftArmLow", hm, eceReasoner.getCurrentTime()+1);
		
		//evento interno (in realtà lanciato da una regola!
		//eceReasoner.notifyEvent("MyExpectationFulf", new HashMap<String, Object>(), eceReasoner.getCurrentTime()+1);
		                         
//		eceReasoner.notifyEvent("LeftArmLowered", new HashMap<String, Object>(), eceReasoner.getCurrentTime()+1);
//		eceReasoner.notifyEvent("LeftArmLowered", new HashMap<String, Object>(), eceReasoner.getCurrentTime()+1);
//		
//		eceReasoner.notifyEvent("LeftArmStretched", new HashMap<String, Object>(), eceReasoner.getCurrentTime()+1);
//		eceReasoner.notifyEvent("LeftArmStretched", new HashMap<String, Object>(), eceReasoner.getCurrentTime()+1);
//		
//		eceReasoner.notifyEvent("LeftArmLowered", new HashMap<String, Object>(), eceReasoner.getCurrentTime()+1);
		
//		Background bkg = new Background(false);
//		bkg.setReasoner(eceReasoner);
	
		
		
		
		
		
		//reasoner.stop();
		
		System.out.println();
		System.out.println("Done.");
		
		
	}
	



	
}
