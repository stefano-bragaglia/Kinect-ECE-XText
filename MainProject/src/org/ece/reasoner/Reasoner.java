package org.ece.reasoner;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.ece.generation.GenerateDeclarationsDrl;
import org.ece.generation.GenerateExpectationDrl;
import org.ece.generation.GenerateExpectationDrl_visitor;
import org.xtext.ecerule.model.Model;

import rec.Builder;
import rec.Session;
import rec.config.Clock;
import rec.config.Mode;

public class Reasoner {
	Model model;
	static Session session;

	public Reasoner() {

	}

	// set the model of statements
	public void setModel(Model model) {
		this.model = model;
	}

	//generate required .drl and configure reasoner
	public void init() throws FileNotFoundException {
		// generate declarations
		GenerateDeclarationsDrl gdd = new GenerateDeclarationsDrl(model);
		gdd.generateDRL("src/org/ece/rules/r2_Declarations.drl");

		// generate specific expectation rules
//		GenerateExpectationDrl ged = new GenerateExpectationDrl(model);  //to remove
//		ged.generateDRL("src/org/ece/rules/r7_SingleGenerated.drl"); //to remove
		GenerateExpectationDrl_visitor gedv = new GenerateExpectationDrl_visitor(model);
		gedv.generateDRL("src/org/ece/rules/r7_SingleGenerated.drl");
		
		
		

		// Thread.currentThread().sleep(5000);

		Builder builder = new Builder();
		builder.setMode(Mode.FULL);
		builder.setClock(Clock.PSEUDO); // commentare se REALTIME

		//builder.addResource("r7_SingleGenerated.drl"); //to remove
		builder.addResource("r7_SingleGenerated.drl");
		builder.addResource("r3_TempDeclarations.drl");
		builder.addResource("r2_Declarations.drl");

		session = builder.build();

	}

	// start drools
	public void start() {
		session.start();
	}

	// notify event without advance time
	public void notifyEvent(String name, Map<String, Object> params) {
		session.notify(name, params);
	}
	
	// notify event with advance time
	public static void notifyEvent(String name, Map<String, Object> params, long startTime) {
		long advance = startTime - session.getClock().getCurrentTime();
		advanceTime(advance);
		session.notify(name, params);
		
	}
	
	public static void advanceTime(long advance){
		session.getClock().advanceTime(advance, TimeUnit.MILLISECONDS);
	}
	
	

	// stop drools
	public void stop() {
		session.stop();
	}
	
	
	
	
	
	
	//da rimuovere, serve solo per test
	public long getCurrentTime(){
		return session.getClock().getCurrentTime();
	}

}
