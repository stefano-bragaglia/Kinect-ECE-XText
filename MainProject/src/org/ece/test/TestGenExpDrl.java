package org.ece.test;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.Event;
import org.xtext.ecerule.model.ExpContext;
import org.xtext.ecerule.model.ExpressionInterface;
import org.xtext.ecerule.model.Model;
import org.xtext.ecerule.model.Statement;
import org.xtext.ecerule.model.Time;
import org.xtext.ecerule.model.conditions.relations.SameDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;
import org.xtext.ecerule.model.expressions.SampleDescr;

import com.sample.EceStatement;
import com.sample.Fluent;

//testa tutti i passaggi dal Model generato dall'editor, ai drl generati per drools.
public class TestGenExpDrl {
	
	static StringBuilder strbuild;

	public static void mainRun(/*String[] args*/) {
		// ------------------------------------------------------
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
		eventName = "AlzatoEv";
		event.setEventName(eventName);
		statement.setEvent(event);

		expContext = new ExpContext();

		condContainer = new SameDescr(new SampleDescr("SedutoFl"),
				new NumberDescr(0));
		expContext.setFinalCondition(condContainer);

		statement.addExpContext(expContext);

		model.add("StmAlzatoEv", statement);
		
		//Model model = MainEce.getModel(); //recupero il model generato dall'editor
		

		// ------------------------------------------------------

		SystemManager sm = new SystemManager(model);

		// COMPILAZIONE
		// **********************************************************************

		try{
			KnowledgeBase kbase = readKnowledgeBase("com/sample/onestep/SingleFactory.drl");
			StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
			KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory
					.newFileLogger(ksession, "test");
			
			List<EceStatement> eceStmList = sm.getEceStmList();
			for (EceStatement eceStm:eceStmList){
				ksession.insert(eceStm);
			}
			
			strbuild = new StringBuilder("");
            strbuild.append("package com.sample.onestep\n\n");
            strbuild.append("import com.sample.*;\n\n");
            
            ksession.setGlobal("strbuild", strbuild);
            Random random = new Random();
            ksession.setGlobal("random", random);

            ksession.fireAllRules();
            logger.close();
            //stamp();
            generateDRL("src/org/ece/rules/SingleGenerated.drl");
			
			
            
            
            //ESECUZIONE ************************************************************************
            
            KnowledgeBase kbase2 = readKnowledgeBase("com/sample/onestep/SingleGenerated.drl");
            StatefulKnowledgeSession ksession2 = kbase2.newStatefulKnowledgeSession();
            KnowledgeRuntimeLogger logger2 = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession2, "test2");
            
            
//            Event evSiAlza = new Event();
//        	evSiAlza.setName("SiAlza");
//        	ksession2.insert(evSiAlza);
//        	
//        	Fluent flSeduto = new Fluent();
//        	flSeduto.setName("Seduto");
//        	flSeduto.setValue("true");
//        	ksession2.insert(flSeduto);
            
        	
//            ksession2.fireAllRules();
//            
//            Thread.sleep(5000);
//            
//            Event evSiAlza = new Event();
//        	evSiAlza.setName("SiAlza");
//        	ksession2.insert(evSiAlza);
//        	
//        	Fluent flSeduto = new Fluent();
//        	flSeduto.setName("Seduto");
//        	flSeduto.setValue("true");
//        	ksession2.insert(flSeduto);
        	
        	ksession2.fireAllRules();
            
            logger2.close();
            
            
            
            
            
			
		}catch (Throwable t) {
            t.printStackTrace();
        }
	

	}

	private static KnowledgeBase readKnowledgeBase(String fileName)
			throws Exception {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource(fileName),
				ResourceType.DRL);
		KnowledgeBuilderErrors errors = kbuilder.getErrors();
		if (errors.size() > 0) {
			for (KnowledgeBuilderError error : errors) {
				System.err.println(error);
			}
			throw new IllegalArgumentException("Could not parse knowledge.");
		}
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		return kbase;
	}
	
	private static void generateDRL(String path) throws FileNotFoundException{
   	 	FileOutputStream file = new FileOutputStream(path);
        PrintStream out = new PrintStream(file);
        
        char[] dst = new char[strbuild.length()];
    	 strbuild.getChars(0, strbuild.length(), dst, 0);
    	
        System.out.println(path+"\n\n");
        for(int i=0; i<dst.length; i++)
        	out.print(dst[i]);
   }

}
