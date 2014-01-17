package org.ece.main;

import java.io.FileNotFoundException;

import org.ece.reasoner.Reasoner;
import org.model.ConditionInterface;
import org.model.Event;
import org.model.ExpContext;
import org.model.ExpressionInterface;
import org.model.Model;
import org.model.Statement;
import org.model.Time;
import org.model.conditions.relations.SameDescr;
import org.model.expressions.NumberDescr;
import org.model.expressions.SampleDescr;

import applet.Background;


public class MainLaucher {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("*****Sono dentro a MainLauncher");
		System.out.println();

		
		// ---------------------------------------------------
		//se braccio a T, mi aspetto braccio abbassato dopo 10 
		Statement statement;
		Event event;
		String eventName;
		ExpressionInterface exprContainer;
		ConditionInterface condContainer;
		// EcContext ecContext;
		ExpContext expContext;
		Time time;

		Model model = new Model();

		statement = new Statement();
		event = new Event();
		eventName = "LeftArmStretched";
		event.setEventName(eventName);
		statement.setEvent(event);

		expContext = new ExpContext();

		condContainer = new SameDescr(new SampleDescr("LeftArmLowered"),
				new NumberDescr(0));
		expContext.setFinalCondition(condContainer);

		time = new Time();
		time.setAllenOp("after");
		time.setTimeValue(10);
		expContext.setTime(time);

		statement.addExpContext(expContext);

		model.add("Stm_LeftArmStrethced", statement);
		// ---------------------------------------------------
		
		
		//Model model = MainEce.getModel();
		
		
		
		Reasoner eceReasoner = new Reasoner();
		eceReasoner.setModel(model);
		eceReasoner.init();
		eceReasoner.start();
		
		
		//reasoner.notifyEvent("LeftArmStrethced", new HashMap<String, Object>()); //al tempo 0
	
		//reasoner.notifyEvent("LeftArmLowered", new HashMap<String, Object>(), reasoner.getCurrentTime()+9);
		
		
		Background bkg = new Background(false);
		bkg.setReasoner(eceReasoner);
		
		
		
		
		
		
		//reasoner.stop();
		
		System.out.println();
		System.out.println("Done.");
		
		
	}
	



	
}
