//Serve se e la conditizione iniziale dev'essere valutata runtime e può dipendere da ad esempio dei valori
//disponibili solo a runtime come tempo di arrivo dell'evento o suoi parametri

package com.sample.onestep;

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
import org.gradle.TransfCondiVisitor;
import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.ExpContext;
import org.xtext.ecerule.model.ExpContextInterface;
import org.xtext.ecerule.model.conditions.relations.LessDescr;
import org.xtext.ecerule.model.conditions.relations.MoreDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;
import org.xtext.ecerule.model.expressions.SampleDescr;
import org.xtext.ecerule.model.expressions.operations.MinusDescr;
import org.xtext.ecerule.model.expressions.operations.PlusDescr;

import com.sample.EceStatement;
import com.sample.Event;
import com.sample.Fluent;

public class DroolsTest_onestep {

	static StringBuilder strbuild;

    public static final void main(String[] args) {
        try {
        	//COMPILAZIONE **********************************************************************
        	
            KnowledgeBase kbase = readKnowledgeBase("com/sample/onestep/SingleFactory.drl");
            StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
            KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
            //-------------------------------------------------
            
            ConditionInterface initialCondition = new MoreDescr(new MinusDescr(new SampleDescr("Paperino"), new NumberDescr(8)), new SampleDescr("Pippo"));
    		ConditionInterface finalCondition = new LessDescr(new PlusDescr(new SampleDescr("Pippo"), new SampleDescr("Pluto")), new PlusDescr(new SampleDescr("Topolino"), new NumberDescr(5)));
    		
    		ExpContextInterface expContext = new ExpContext();
    		expContext.setInitialCondition(initialCondition);
    		expContext.setFinalCondition(finalCondition);
    		
    		TransfCondiVisitor visitor1 = new TransfCondiVisitor();
    		expContext.getInitialCondition().accept(visitor1);
    		String initialStrCondition = visitor1.getOutputString();
    		
    		TransfCondiVisitor visitor2 = new TransfCondiVisitor();
    		expContext.getFinalCondition().accept(visitor2);
    		String finalStrCondition = visitor2.getOutputString();
            
            
            EceStatement eceStm = new EceStatement("SiAlza", initialStrCondition, finalStrCondition, "System.out.println(\"<code if fulfilled>\");", "System.out.println(\"<code if violated>\");");
            ksession.insert(eceStm);
            
//            //on SiDistende expect Inginocchiato==true after 10 if age=="young", codeFulf="<code if fulfilled>", codeViol="<code if violated>"; 
//            eceStm= new EceStatement("SiDistende", "age==\"young\"", "Inginocchiato==true after 10", "<code if fulfilled>", "<code if violated>");
//            ksession.insert(eceStm);
            
            
            
            strbuild = new StringBuilder("");
            strbuild.append("package com.sample.onestep\n\n");
            strbuild.append("import com.sample.*;\n\n");
            
            ksession.setGlobal("strbuild", strbuild);
            Random random = new Random();
            ksession.setGlobal("random", random);

            ksession.fireAllRules();
            logger.close();
            //stamp();
            generateDRL("src/main/rules/com/sample/onestep/SingleGenerated.drl");
            
            
            
    
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
            
        	
            ksession2.fireAllRules();
            
            Thread.sleep(5000);
            
            Event evSiAlza = new Event();
        	evSiAlza.setName("SiAlza");
        	ksession2.insert(evSiAlza);
        	
        	Fluent flSeduto = new Fluent();
        	flSeduto.setName("Seduto");
        	flSeduto.setValue("true");
        	ksession2.insert(flSeduto);
        	
        	ksession2.fireAllRules();
            
            logger2.close();
            
            
            
            
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
    	
        System.out.println(path+"\n\n");
        for(int i=0; i<dst.length; i++)
        	out.print(dst[i]);
   }

    

}
