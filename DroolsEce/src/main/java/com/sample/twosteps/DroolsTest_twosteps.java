//O faccio più fasi dove l'output drl della fase precedente è l'input per la fase sucessiva 
//oppure devo riunire le fasi, ma devo aggiungere dinamicamente le regole create (drl) alla 
//sessione drools corrente (non sembra funzionare semplicemente aggiornando modificando il drl...)

package com.sample.twosteps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
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

import com.sample.EceStatement;
import com.sample.Event;
import com.sample.Fluent;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest_twosteps {
	
	static StringBuilder strbuild;

    public static final void main(String[] args) {
        try {
        	//FASE 1 **********************************************************************
        	
            KnowledgeBase kbase = readKnowledgeBase("com/sample/twosteps/Factory_1.drl");
            StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
            KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
            //-------------------------------------------------
            
            //on Sialza expect Seduto==true, codeFulf="<code if fulfilled>", codeViol="<code if violated>"; 
            EceStatement eceStm = new EceStatement("SiAlza", "", "Fluent(name==\\\"Seduto\\\", value==\\\"true\\\")", "System.out.println(\\\"<code if fulfilled>\\\");", "System.out.println(\\\"<code if violated>\\\");");
            ksession.insert(eceStm);
            
//            //on SiDistende expect Inginocchiato==true after 10, codeFulf="<code if fulfilled>", codeViol="<code if violated>"; 
//            eceStm= new EceStatement("SiDistende", "", "Inginocchiato==true after 10", "<code if fulfilled>", "<code if violated>");
//            ksession.insert(eceStm);
//            
//            //on RuotaTestaSX expect TestaRuotataDX==true after 10, codeFulf="<code if fulfilled>", codeViol="<code if violated>"; 
//            eceStm= new EceStatement("RuotaTestaSX", "", "TestaRuotataDX==true after 10", "<code if fulfilled>", "<code if violated>");
//            ksession.insert(eceStm);
            
            
            strbuild = new StringBuilder("");
            
            strbuild.append("package com.sample.twosteps\n\n");
            
            strbuild.append("declare Expectation\n");
            	strbuild.append("\tevent: String\n");
            	strbuild.append("\tfinCond: String\n");
            	strbuild.append("\tcodeViol: String\n");
            	strbuild.append("\tcodeFulf: String\n");
            	strbuild.append("\tcodeViol: String\n");
            strbuild.append("end\n\n");
            
            
            
            
           
            
            ksession.setGlobal("strbuild", strbuild);
            Random random = new Random();
            ksession.setGlobal("random", random);
            
            ksession.fireAllRules();
            logger.close();
            //stamp();
            generateDRL("src/main/rules/com/sample/twosteps/Generated_1.drl");
            
            
            
            Thread.sleep(1000);
            
            //FASE 2 **********************************************************************
            strbuild = new StringBuilder("");
            generateDRL("src/main/rules/com/sample/twosteps/Generated_2.drl"); //resetto Generated_2
            Thread.sleep(1000);
            
            KnowledgeBase kbase2 = readKnowledgeBase("com/sample/twosteps/Generated_1.drl", "com/sample/twosteps/Factory_2.drl", "com/sample/twosteps/Generated_2.drl");
            StatefulKnowledgeSession ksession2 = kbase2.newStatefulKnowledgeSession();
            KnowledgeRuntimeLogger logger2 = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession2, "test2");
            //-------------------------------------------------
            
            strbuild = new StringBuilder("");
            
            strbuild.append("package com.sample.twosteps\n\n");
            strbuild.append("import com.sample.*;\n\n");
            
            strbuild.append("declare Event\n");
        		strbuild.append("\t@role(event)\n");
        	strbuild.append("end\n\n");
        	
        	//*********************************************
        	strbuild.append("rule \"Rule Find Event\"\n");
        	strbuild.append("when\n");
        	
    			strbuild.append("\t$ev: Event($n: name)\n");
    		
    		strbuild.append("then\n");
    	
    		strbuild.append("\tSystem.out.println(\"L'evento \" +$n+ \" è arrivato\");\n\n");
    	
    		strbuild.append("end\n\n\n");
    		
    		
    		//generateDRL("src/main/rules/com/sample/twosteps/Generated_2.drl");
    	
    	//*************************************************
        	
        	
        	
    		Event evSiAlza = new Event();
        	evSiAlza.setName("SiAlza");
        	ksession2.insert(evSiAlza);
        	
        	Fluent flSeduto = new Fluent();
        	flSeduto.setName("Seduto");
        	flSeduto.setValue("true");
        	ksession2.insert(flSeduto);
        	
            
            ksession2.setGlobal("strbuild", strbuild);
            Random random2 = new Random();
            ksession2.setGlobal("random", random2);
            
            ksession2.fireAllRules();
            logger2.close();
            //stamp();
            generateDRL("src/main/rules/com/sample/twosteps/Generated_2.drl");
            
            
            
            
            
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    private static KnowledgeBase readKnowledgeBase(String fileName) throws Exception {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource(fileName), ResourceType.DRL);
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        return kbase;
    }
    
    private static KnowledgeBase readKnowledgeBase(String fileName1, String fileName2) throws Exception {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource(fileName1), ResourceType.DRL);
        kbuilder.add(ResourceFactory.newClassPathResource(fileName2), ResourceType.DRL);
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        return kbase;
    }
    
    private static KnowledgeBase readKnowledgeBase(String fileName1, String fileName2, String fileName3) throws Exception {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource(fileName1), ResourceType.DRL);
        kbuilder.add(ResourceFactory.newClassPathResource(fileName2), ResourceType.DRL);
        kbuilder.add(ResourceFactory.newClassPathResource(fileName3), ResourceType.DRL);
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        return kbase;
    }
    
    private static void stamp() throws InstantiationException, IllegalAccessException{
    	
    	char[] dst = new char[strbuild.length()];
    	strbuild.getChars(0, strbuild.length(), dst, 0);
        
    	System.out.println("\n\n.drl GENERATO:\n\n");
        for(int i=0; i<dst.length; i++)
        	System.out.print(dst[i]);
    }
    
    private static void generateDRL(String path) throws FileNotFoundException{
   	 	FileOutputStream file = new FileOutputStream(path);
        PrintStream out = new PrintStream(file);
        
        char[] dst = new char[strbuild.length()];
    	 strbuild.getChars(0, strbuild.length(), dst, 0);
    	
        System.out.println("Generated "+path+"\n\n");
        for(int i=0; i<dst.length; i++)
        	out.print(dst[i]);
   }

    
}
