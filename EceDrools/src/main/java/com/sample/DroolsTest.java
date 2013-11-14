package com.sample;

import org.drools.KnowledgeBase;

import java.io.*;

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
import org.xtext.ecerule.model.*;
import org.xtext.ecerule.model.Time;
import org.xtext.ecerule.model.conditions.relations.MoreEqualsDescr;
import org.xtext.ecerule.model.conditions.relations.SameDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;
import org.xtext.ecerule.model.expressions.SampleDescr;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
            KnowledgeBase kbase = readKnowledgeBase();
            StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
            KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
            // go !
            
            ConditionInterface condContainer = new SameDescr(new SampleDescr("Seduto"),new NumberDescr(1));
            Time time = new Time();
            time.setAllenOp("after");
            time.setTimeValue(10);
            
            ExpContext expCtx = new ExpContext();
            expCtx.setFinalCondition(condContainer);
            expCtx.setTime(time);
            
            Event event = new Event();
            event.setEventName("siAlza");
            
            Statement stm = new Statement();
            stm.addExpContext(expCtx);
            stm.setEvent(event);
            
//          ************************************************************
//			test validate 
//            boolean result = condContainer.validate();
//            System.out.println("Il risultato di 7 >= 2 ?  e': "+result);
            
//          ************************************************************
            
          	
            ksession.insert(stm);
            ksession.fireAllRules();
            logger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static KnowledgeBase readKnowledgeBase() throws Exception {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        
//        kbuilder.add(ResourceFactory.newClassPathResource("Sample.drl"), ResourceType.DRL);
        kbuilder.add(ResourceFactory.newClassPathResource("com/rules/generationrules/DynamicRules.drl"), ResourceType.DRL);
        
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

}
