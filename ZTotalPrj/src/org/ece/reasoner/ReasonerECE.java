package org.ece.reasoner;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.ece.generation.GenerateDeclarationsDrl;
import org.ece.generation.GenerateExpectationDrl_visitor;
import org.ece.generation.GenerateOperationsDrl;
import org.model.Model;
import org.rec.Builder;
import org.rec.Session;
import org.rec.config.Clock;
import org.rec.config.Mode;

public class ReasonerECE {
	Model model;
	static Session session;

	public ReasonerECE() {

	}

	// set the model of statements
	public void setModel(Model model) {
		this.model = model;
	}

	//generate required .drl and configure reasoner
	public void init() throws FileNotFoundException {
		//generate declarations
		GenerateDeclarationsDrl gdd = new GenerateDeclarationsDrl(model);
		gdd.generateDRL("resources/r2_Declarations.drl");
		
		//generate operation (What should I do if silmple events occur)
		GenerateOperationsDrl god = new GenerateOperationsDrl(model);
		god.generateDRL("resources/r4_Operations.drl");
		
		// generate specific expectation rules (What should I do if fulfilment/violation expectation)
		GenerateExpectationDrl_visitor gedv = new GenerateExpectationDrl_visitor(model);
		gedv.generateDRL("resources/r7_SingleGenerated.drl");
	

		// Thread.currentThread().sleep(5000);

		Builder builder = new Builder();
		builder.setMode(Mode.FULL);
		builder.setClock(Clock.PSEUDO); // commentare se REALTIME

		builder.addResource("r7_SingleGenerated.drl");
		builder.addResource("r4_Operations.drl");
		//builder.addResource("r3_TempDeclarations.drl");
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
