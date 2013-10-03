package org.xtext.ecerule.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.ecerule.services.EceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'on'", "'set'", "','", "';'", "'to'", "'in'", "'if'", "'true'", "'false'", "'OR'", "'AND'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'switch'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'now'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_FLOAT=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalEceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEceParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g"; }



     	private EceGrammarAccess grammarAccess;
     	
        public InternalEceParser(TokenStream input, EceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DroolsModel";	
       	}
       	
       	@Override
       	protected EceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDroolsModel"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:67:1: entryRuleDroolsModel returns [EObject current=null] : iv_ruleDroolsModel= ruleDroolsModel EOF ;
    public final EObject entryRuleDroolsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroolsModel = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:68:2: (iv_ruleDroolsModel= ruleDroolsModel EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:69:2: iv_ruleDroolsModel= ruleDroolsModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDroolsModelRule()); 
            }
            pushFollow(FOLLOW_ruleDroolsModel_in_entryRuleDroolsModel75);
            iv_ruleDroolsModel=ruleDroolsModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDroolsModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDroolsModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDroolsModel"


    // $ANTLR start "ruleDroolsModel"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:76:1: ruleDroolsModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleDroolsModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:79:28: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:80:1: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:80:1: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:81:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:81:1: (lv_statements_0_0= ruleStatement )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:82:3: lv_statements_0_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDroolsModelAccess().getStatementsStatementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleDroolsModel130);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDroolsModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_0_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDroolsModel"


    // $ANTLR start "entryRuleStatement"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:106:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:107:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:108:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement166);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:115:1: ruleStatement returns [EObject current=null] : (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_event_1_0 = null;

        EObject lv_fluent_3_0 = null;

        EObject lv_fluent_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:118:28: ( (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* otherlv_6= ';' ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:119:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* otherlv_6= ';' )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:119:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* otherlv_6= ';' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:119:3: otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleStatement213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getOnKeyword_0());
                  
            }
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:123:1: ( (lv_event_1_0= ruleEvent ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:124:1: (lv_event_1_0= ruleEvent )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:124:1: (lv_event_1_0= ruleEvent )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:125:3: lv_event_1_0= ruleEvent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEvent_in_ruleStatement234);
            lv_event_1_0=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatementRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_1_0, 
                      		"Event");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStatement246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getSetKeyword_2());
                  
            }
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:145:1: ( (lv_fluent_3_0= ruleFluent ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:146:1: (lv_fluent_3_0= ruleFluent )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:146:1: (lv_fluent_3_0= ruleFluent )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:147:3: lv_fluent_3_0= ruleFluent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFluent_in_ruleStatement267);
            lv_fluent_3_0=ruleFluent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatementRule());
              	        }
                     		add(
                     			current, 
                     			"fluent",
                      		lv_fluent_3_0, 
                      		"Fluent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:163:2: (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:163:4: otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleStatement280); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:167:1: ( (lv_fluent_5_0= ruleFluent ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:168:1: (lv_fluent_5_0= ruleFluent )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:168:1: (lv_fluent_5_0= ruleFluent )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:169:3: lv_fluent_5_0= ruleFluent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFluent_in_ruleStatement301);
            	    lv_fluent_5_0=ruleFluent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fluent",
            	              		lv_fluent_5_0, 
            	              		"Fluent");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleStatement315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:197:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:198:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:199:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent351);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent361); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:206:1: ruleEvent returns [EObject current=null] : ( (lv_eventName_0_0= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_eventName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:209:28: ( ( (lv_eventName_0_0= RULE_ID ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:210:1: ( (lv_eventName_0_0= RULE_ID ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:210:1: ( (lv_eventName_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:211:1: (lv_eventName_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:211:1: (lv_eventName_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:212:3: lv_eventName_0_0= RULE_ID
            {
            lv_eventName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_eventName_0_0, grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEventRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"eventName",
                      		lv_eventName_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleFluent"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:236:1: entryRuleFluent returns [EObject current=null] : iv_ruleFluent= ruleFluent EOF ;
    public final EObject entryRuleFluent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFluent = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:237:2: (iv_ruleFluent= ruleFluent EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:238:2: iv_ruleFluent= ruleFluent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFluentRule()); 
            }
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent442);
            iv_ruleFluent=ruleFluent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFluent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent452); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFluent"


    // $ANTLR start "ruleFluent"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:245:1: ruleFluent returns [EObject current=null] : ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? ) ;
    public final EObject ruleFluent() throws RecognitionException {
        EObject current = null;

        Token lv_fluentName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_valuePart_2_0 = null;

        EObject lv_timePart_4_0 = null;

        EObject lv_condPart_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:248:28: ( ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:249:1: ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:249:1: ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:249:2: ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )?
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:249:2: ( (lv_fluentName_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:250:1: (lv_fluentName_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:250:1: (lv_fluentName_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:251:3: lv_fluentName_0_0= RULE_ID
            {
            lv_fluentName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFluent494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_fluentName_0_0, grammarAccess.getFluentAccess().getFluentNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFluentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"fluentName",
                      		lv_fluentName_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:267:2: (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:267:4: otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) )
            {
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleFluent512); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFluentAccess().getToKeyword_1_0());
                  
            }
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:271:1: ( (lv_valuePart_2_0= ruleToRule ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:272:1: (lv_valuePart_2_0= ruleToRule )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:272:1: (lv_valuePart_2_0= ruleToRule )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:273:3: lv_valuePart_2_0= ruleToRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleToRule_in_ruleFluent533);
            lv_valuePart_2_0=ruleToRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFluentRule());
              	        }
                     		set(
                     			current, 
                     			"valuePart",
                      		lv_valuePart_2_0, 
                      		"ToRule");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:289:3: (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:289:5: otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFluent547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFluentAccess().getInKeyword_2_0());
                          
                    }
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:293:1: ( (lv_timePart_4_0= ruleInRule ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:294:1: (lv_timePart_4_0= ruleInRule )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:294:1: (lv_timePart_4_0= ruleInRule )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:295:3: lv_timePart_4_0= ruleInRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInRule_in_ruleFluent568);
                    lv_timePart_4_0=ruleInRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFluentRule());
                      	        }
                             		set(
                             			current, 
                             			"timePart",
                              		lv_timePart_4_0, 
                              		"InRule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:311:4: (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:311:6: otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleFluent583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFluentAccess().getIfKeyword_3_0());
                          
                    }
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:315:1: ( (lv_condPart_6_0= ruleConditionRule ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:316:1: (lv_condPart_6_0= ruleConditionRule )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:316:1: (lv_condPart_6_0= ruleConditionRule )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:317:3: lv_condPart_6_0= ruleConditionRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionRule_in_ruleFluent604);
                    lv_condPart_6_0=ruleConditionRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFluentRule());
                      	        }
                             		set(
                             			current, 
                             			"condPart",
                              		lv_condPart_6_0, 
                              		"ConditionRule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFluent"


    // $ANTLR start "entryRuleToRule"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:341:1: entryRuleToRule returns [EObject current=null] : iv_ruleToRule= ruleToRule EOF ;
    public final EObject entryRuleToRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:342:2: (iv_ruleToRule= ruleToRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:343:2: iv_ruleToRule= ruleToRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getToRuleRule()); 
            }
            pushFollow(FOLLOW_ruleToRule_in_entryRuleToRule642);
            iv_ruleToRule=ruleToRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleToRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleToRule652); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToRule"


    // $ANTLR start "ruleToRule"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:350:1: ruleToRule returns [EObject current=null] : ( ( (lv_expression_0_0= ruleStringExpr ) ) | ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) ) | ( (lv_expression_2_0= ruleswitchExpr ) ) | ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) ) | ( (lv_expression_4_0= ruleMutationExpr ) ) ) ;
    public final EObject ruleToRule() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_expression_1_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:353:28: ( ( ( (lv_expression_0_0= ruleStringExpr ) ) | ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) ) | ( (lv_expression_2_0= ruleswitchExpr ) ) | ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) ) | ( (lv_expression_4_0= ruleMutationExpr ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:354:1: ( ( (lv_expression_0_0= ruleStringExpr ) ) | ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) ) | ( (lv_expression_2_0= ruleswitchExpr ) ) | ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) ) | ( (lv_expression_4_0= ruleMutationExpr ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:354:1: ( ( (lv_expression_0_0= ruleStringExpr ) ) | ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) ) | ( (lv_expression_2_0= ruleswitchExpr ) ) | ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) ) | ( (lv_expression_4_0= ruleMutationExpr ) ) )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:354:2: ( (lv_expression_0_0= ruleStringExpr ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:354:2: ( (lv_expression_0_0= ruleStringExpr ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:355:1: (lv_expression_0_0= ruleStringExpr )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:355:1: (lv_expression_0_0= ruleStringExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:356:3: lv_expression_0_0= ruleStringExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionStringExprParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStringExpr_in_ruleToRule698);
                    lv_expression_0_0=ruleStringExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getToRuleRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_0_0, 
                              		"StringExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:373:6: ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:373:6: ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:373:7: ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:378:1: (lv_expression_1_0= ruleBoolExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:379:3: lv_expression_1_0= ruleBoolExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionBoolExprParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBoolExpr_in_ruleToRule735);
                    lv_expression_1_0=ruleBoolExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getToRuleRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_1_0, 
                              		"BoolExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:396:6: ( (lv_expression_2_0= ruleswitchExpr ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:396:6: ( (lv_expression_2_0= ruleswitchExpr ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:397:1: (lv_expression_2_0= ruleswitchExpr )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:397:1: (lv_expression_2_0= ruleswitchExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:398:3: lv_expression_2_0= ruleswitchExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionSwitchExprParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleswitchExpr_in_ruleToRule762);
                    lv_expression_2_0=ruleswitchExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getToRuleRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"switchExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:415:6: ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:415:6: ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:415:7: ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:419:5: ( (lv_expression_3_0= ruleFloatExpr ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:420:1: (lv_expression_3_0= ruleFloatExpr )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:420:1: (lv_expression_3_0= ruleFloatExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:421:3: lv_expression_3_0= ruleFloatExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionFloatExprParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFloatExpr_in_ruleToRule802);
                    lv_expression_3_0=ruleFloatExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getToRuleRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_3_0, 
                              		"FloatExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:438:6: ( (lv_expression_4_0= ruleMutationExpr ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:438:6: ( (lv_expression_4_0= ruleMutationExpr ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:439:1: (lv_expression_4_0= ruleMutationExpr )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:439:1: (lv_expression_4_0= ruleMutationExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:440:3: lv_expression_4_0= ruleMutationExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionMutationExprParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMutationExpr_in_ruleToRule830);
                    lv_expression_4_0=ruleMutationExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getToRuleRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"MutationExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToRule"


    // $ANTLR start "entryRuleStringExpr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:464:1: entryRuleStringExpr returns [EObject current=null] : iv_ruleStringExpr= ruleStringExpr EOF ;
    public final EObject entryRuleStringExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:465:2: (iv_ruleStringExpr= ruleStringExpr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:466:2: iv_ruleStringExpr= ruleStringExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringExprRule()); 
            }
            pushFollow(FOLLOW_ruleStringExpr_in_entryRuleStringExpr866);
            iv_ruleStringExpr=ruleStringExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpr876); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringExpr"


    // $ANTLR start "ruleStringExpr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:473:1: ruleStringExpr returns [EObject current=null] : (this_Str_0= ruleStr | this_FluentWhoseValue_1= ruleFluentWhoseValue ) ;
    public final EObject ruleStringExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Str_0 = null;

        EObject this_FluentWhoseValue_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:476:28: ( (this_Str_0= ruleStr | this_FluentWhoseValue_1= ruleFluentWhoseValue ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:477:1: (this_Str_0= ruleStr | this_FluentWhoseValue_1= ruleFluentWhoseValue )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:477:1: (this_Str_0= ruleStr | this_FluentWhoseValue_1= ruleFluentWhoseValue )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:478:5: this_Str_0= ruleStr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStringExprAccess().getStrParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStr_in_ruleStringExpr923);
                    this_Str_0=ruleStr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Str_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:488:5: this_FluentWhoseValue_1= ruleFluentWhoseValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStringExprAccess().getFluentWhoseValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFluentWhoseValue_in_ruleStringExpr950);
                    this_FluentWhoseValue_1=ruleFluentWhoseValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FluentWhoseValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringExpr"


    // $ANTLR start "entryRuleBoolExpr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:504:1: entryRuleBoolExpr returns [EObject current=null] : iv_ruleBoolExpr= ruleBoolExpr EOF ;
    public final EObject entryRuleBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:505:2: (iv_ruleBoolExpr= ruleBoolExpr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:506:2: iv_ruleBoolExpr= ruleBoolExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExprRule()); 
            }
            pushFollow(FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr985);
            iv_ruleBoolExpr=ruleBoolExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpr995); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpr"


    // $ANTLR start "ruleBoolExpr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:513:1: ruleBoolExpr returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) | this_Or_2= ruleOr ) ;
    public final EObject ruleBoolExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        EObject this_Or_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:516:28: ( ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) | this_Or_2= ruleOr ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:517:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) | this_Or_2= ruleOr )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:517:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) | this_Or_2= ruleOr )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:517:2: ( (lv_value_0_0= 'true' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:517:2: ( (lv_value_0_0= 'true' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:518:1: (lv_value_0_0= 'true' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:518:1: (lv_value_0_0= 'true' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:519:3: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)match(input,19,FOLLOW_19_in_ruleBoolExpr1038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_0, grammarAccess.getBoolExprAccess().getValueTrueKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoolExprRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_0, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:533:6: ( (lv_value_1_0= 'false' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:533:6: ( (lv_value_1_0= 'false' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:534:1: (lv_value_1_0= 'false' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:534:1: (lv_value_1_0= 'false' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:535:3: lv_value_1_0= 'false'
                    {
                    lv_value_1_0=(Token)match(input,20,FOLLOW_20_in_ruleBoolExpr1075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_1_0, grammarAccess.getBoolExprAccess().getValueFalseKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoolExprRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_1_0, "false");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:550:5: this_Or_2= ruleOr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBoolExprAccess().getOrParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOr_in_ruleBoolExpr1116);
                    this_Or_2=ruleOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Or_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolExpr"


    // $ANTLR start "entryRuleOr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:566:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:567:2: (iv_ruleOr= ruleOr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:568:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1151);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1161); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:575:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:578:28: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:579:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:579:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:580:5: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAnd_in_ruleOr1208);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_And_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:588:1: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:588:2: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:588:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:589:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleOr1229); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:598:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:599:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:599:1: (lv_right_3_0= ruleAnd )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:600:3: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr1250);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"And");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:624:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:625:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:626:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd1288);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd1298); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:633:1: ruleAnd returns [EObject current=null] : ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) | ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* ) ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;

        EObject this_Equality_4 = null;

        EObject lv_right_7_0 = null;

        EObject this_Comparison_8 = null;

        EObject lv_right_11_0 = null;

        EObject this_Comparison_12 = null;

        EObject lv_right_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:636:28: ( ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) | ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:637:1: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) | ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:637:1: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) | ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* ) )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:637:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:637:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:638:5: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEquality_in_ruleAnd1346);
                    this_Equality_0=ruleEquality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Equality_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:646:1: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:646:2: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:646:2: ()
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:647:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getAndAccess().getAndLeftAction_0_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAnd1367); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_0_1_1());
                    	          
                    	    }
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:656:1: ( (lv_right_3_0= ruleEquality ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:657:1: (lv_right_3_0= ruleEquality )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:657:1: (lv_right_3_0= ruleEquality )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:658:3: lv_right_3_0= ruleEquality
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_0_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd1388);
                    	    lv_right_3_0=ruleEquality();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAndRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"right",
                    	              		lv_right_3_0, 
                    	              		"Equality");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:675:6: ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:675:6: ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:675:7: ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )*
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:675:7: ( ( ruleEquality )=>this_Equality_4= ruleEquality )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:675:8: ( ruleEquality )=>this_Equality_4= ruleEquality
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEquality_in_ruleAnd1426);
                    this_Equality_4=ruleEquality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Equality_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:684:2: ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==22) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:684:3: () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:684:3: ()
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:685:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getAndAccess().getAndLeftAction_1_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleAnd1448); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getAndAccess().getANDKeyword_1_1_1());
                    	          
                    	    }
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:694:1: ( (lv_right_7_0= ruleComparison ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:695:1: (lv_right_7_0= ruleComparison )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:695:1: (lv_right_7_0= ruleComparison )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:696:3: lv_right_7_0= ruleComparison
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComparison_in_ruleAnd1469);
                    	    lv_right_7_0=ruleComparison();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAndRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"right",
                    	              		lv_right_7_0, 
                    	              		"Comparison");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:713:6: ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:713:6: ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:713:7: ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )*
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:713:7: ( ( ruleComparison )=>this_Comparison_8= ruleComparison )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:713:8: ( ruleComparison )=>this_Comparison_8= ruleComparison
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAndAccess().getComparisonParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComparison_in_ruleAnd1507);
                    this_Comparison_8=ruleComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Comparison_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:722:2: ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==22) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:722:3: () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:722:3: ()
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:723:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getAndAccess().getAndLeftAction_2_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleAnd1529); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getAndAccess().getANDKeyword_2_1_1());
                    	          
                    	    }
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:732:1: ( (lv_right_11_0= ruleComparison ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:733:1: (lv_right_11_0= ruleComparison )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:733:1: (lv_right_11_0= ruleComparison )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:734:3: lv_right_11_0= ruleComparison
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_2_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComparison_in_ruleAnd1550);
                    	    lv_right_11_0=ruleComparison();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAndRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"right",
                    	              		lv_right_11_0, 
                    	              		"Comparison");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:751:6: ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:751:6: ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:751:7: ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )*
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:751:7: ( ( ruleComparison )=>this_Comparison_12= ruleComparison )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:751:8: ( ruleComparison )=>this_Comparison_12= ruleComparison
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAndAccess().getComparisonParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComparison_in_ruleAnd1588);
                    this_Comparison_12=ruleComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Comparison_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:760:2: ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==22) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:760:3: () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:760:3: ()
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:761:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getAndAccess().getAndLeftAction_3_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleAnd1610); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getAndAccess().getANDKeyword_3_1_1());
                    	          
                    	    }
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:770:1: ( (lv_right_15_0= ruleEquality ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:771:1: (lv_right_15_0= ruleEquality )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:771:1: (lv_right_15_0= ruleEquality )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:772:3: lv_right_15_0= ruleEquality
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_3_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd1631);
                    	    lv_right_15_0=ruleEquality();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAndRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"right",
                    	              		lv_right_15_0, 
                    	              		"Equality");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:796:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:797:2: (iv_ruleEquality= ruleEquality EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:798:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality1670);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality1680); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:805:1: ruleEquality returns [EObject current=null] : ( (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) ) | ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* ) ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_6_1=null;
        Token lv_op_6_2=null;
        EObject this_FloatExpr_0 = null;

        EObject lv_right_3_0 = null;

        EObject this_StringExpr_4 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:808:28: ( ( (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) ) | ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:809:1: ( (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) ) | ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:809:1: ( (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) ) | ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:809:2: (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:809:2: (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:810:5: this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEqualityAccess().getFloatExprParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatExpr_in_ruleEquality1728);
                    this_FloatExpr_0=ruleFloatExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:818:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:818:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:818:2: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:819:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEqualityAccess().getEqualityLeftAction_0_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:824:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:825:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:825:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:826:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:826:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==23) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==24) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:827:3: lv_op_2_1= '=='
                            {
                            lv_op_2_1=(Token)match(input,23,FOLLOW_23_in_ruleEquality1757); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_0_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEqualityRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:839:8: lv_op_2_2= '!='
                            {
                            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_ruleEquality1786); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_0_1_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEqualityRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:854:2: ( (lv_right_3_0= ruleFloatExpr ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:855:1: (lv_right_3_0= ruleFloatExpr )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:855:1: (lv_right_3_0= ruleFloatExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:856:3: lv_right_3_0= ruleFloatExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualityAccess().getRightFloatExprParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFloatExpr_in_ruleEquality1823);
                    lv_right_3_0=ruleFloatExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEqualityRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"FloatExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:873:6: ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:873:6: ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:873:7: ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )*
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:873:7: ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:873:8: ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEqualityAccess().getStringExprParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpr_in_ruleEquality1860);
                    this_StringExpr_4=ruleStringExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringExpr_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:882:2: ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=23 && LA16_0<=24)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:882:3: () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:882:3: ()
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:883:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getEqualityAccess().getEqualityLeftAction_1_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:888:2: ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:889:1: ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:889:1: ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:890:1: (lv_op_6_1= '==' | lv_op_6_2= '!=' )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:890:1: (lv_op_6_1= '==' | lv_op_6_2= '!=' )
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==23) ) {
                    	        alt15=1;
                    	    }
                    	    else if ( (LA15_0==24) ) {
                    	        alt15=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 15, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:891:3: lv_op_6_1= '=='
                    	            {
                    	            lv_op_6_1=(Token)match(input,23,FOLLOW_23_in_ruleEquality1890); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      newLeafNode(lv_op_6_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_1_0_0());
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getEqualityRule());
                    	              	        }
                    	                     		setWithLastConsumed(current, "op", lv_op_6_1, null);
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:903:8: lv_op_6_2= '!='
                    	            {
                    	            lv_op_6_2=(Token)match(input,24,FOLLOW_24_in_ruleEquality1919); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      newLeafNode(lv_op_6_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_1_0_1());
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getEqualityRule());
                    	              	        }
                    	                     		setWithLastConsumed(current, "op", lv_op_6_2, null);
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:918:2: ( (lv_right_7_0= ruleStringExpr ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:919:1: (lv_right_7_0= ruleStringExpr )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:919:1: (lv_right_7_0= ruleStringExpr )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:920:3: lv_right_7_0= ruleStringExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEqualityAccess().getRightStringExprParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleStringExpr_in_ruleEquality1956);
                    	    lv_right_7_0=ruleStringExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEqualityRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"right",
                    	              		lv_right_7_0, 
                    	              		"StringExpr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:944:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:945:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:946:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1995);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison2005); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:953:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:956:28: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:957:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:957:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:958:5: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison2052);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PlusOrMinus_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:966:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=25 && LA19_0<=28)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:966:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:966:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:967:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:972:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:973:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:973:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:974:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:974:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt18=4;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:975:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,25,FOLLOW_25_in_ruleComparison2081); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComparisonRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:987:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,26,FOLLOW_26_in_ruleComparison2110); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComparisonRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:999:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,27,FOLLOW_27_in_ruleComparison2139); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComparisonRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1011:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,28,FOLLOW_28_in_ruleComparison2168); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComparisonRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1026:2: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1027:1: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1027:1: (lv_right_3_0= rulePlusOrMinus )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1028:3: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison2205);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"PlusOrMinus");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleswitchExpr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1052:1: entryRuleswitchExpr returns [EObject current=null] : iv_ruleswitchExpr= ruleswitchExpr EOF ;
    public final EObject entryRuleswitchExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleswitchExpr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1053:2: (iv_ruleswitchExpr= ruleswitchExpr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1054:2: iv_ruleswitchExpr= ruleswitchExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchExprRule()); 
            }
            pushFollow(FOLLOW_ruleswitchExpr_in_entryRuleswitchExpr2243);
            iv_ruleswitchExpr=ruleswitchExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleswitchExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleswitchExpr2253); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleswitchExpr"


    // $ANTLR start "ruleswitchExpr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1061:1: ruleswitchExpr returns [EObject current=null] : ( (lv_value_0_0= 'switch' ) ) ;
    public final EObject ruleswitchExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1064:28: ( ( (lv_value_0_0= 'switch' ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1065:1: ( (lv_value_0_0= 'switch' ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1065:1: ( (lv_value_0_0= 'switch' ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1066:1: (lv_value_0_0= 'switch' )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1066:1: (lv_value_0_0= 'switch' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1067:3: lv_value_0_0= 'switch'
            {
            lv_value_0_0=(Token)match(input,29,FOLLOW_29_in_ruleswitchExpr2295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_value_0_0, grammarAccess.getSwitchExprAccess().getValueSwitchKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitchExprRule());
              	        }
                     		setWithLastConsumed(current, "value", lv_value_0_0, "switch");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleswitchExpr"


    // $ANTLR start "entryRuleMutationExpr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1088:1: entryRuleMutationExpr returns [EObject current=null] : iv_ruleMutationExpr= ruleMutationExpr EOF ;
    public final EObject entryRuleMutationExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMutationExpr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1089:2: (iv_ruleMutationExpr= ruleMutationExpr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1090:2: iv_ruleMutationExpr= ruleMutationExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMutationExprRule()); 
            }
            pushFollow(FOLLOW_ruleMutationExpr_in_entryRuleMutationExpr2343);
            iv_ruleMutationExpr=ruleMutationExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMutationExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMutationExpr2353); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMutationExpr"


    // $ANTLR start "ruleMutationExpr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1097:1: ruleMutationExpr returns [EObject current=null] : ( ( ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) ) ) this_FLOAT_1= RULE_FLOAT ) ;
    public final EObject ruleMutationExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1100:28: ( ( ( ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) ) ) this_FLOAT_1= RULE_FLOAT ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1101:1: ( ( ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) ) ) this_FLOAT_1= RULE_FLOAT )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1101:1: ( ( ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) ) ) this_FLOAT_1= RULE_FLOAT )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1101:2: ( ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) ) ) this_FLOAT_1= RULE_FLOAT
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1101:2: ( ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1102:1: ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1102:1: ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1103:1: (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1103:1: (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt20=1;
                }
                break;
            case 31:
                {
                alt20=2;
                }
                break;
            case 32:
                {
                alt20=3;
                }
                break;
            case 33:
                {
                alt20=4;
                }
                break;
            case 34:
                {
                alt20=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1104:3: lv_value_0_1= '+'
                    {
                    lv_value_0_1=(Token)match(input,30,FOLLOW_30_in_ruleMutationExpr2398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_1, grammarAccess.getMutationExprAccess().getValuePlusSignKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMutationExprRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1116:8: lv_value_0_2= '-'
                    {
                    lv_value_0_2=(Token)match(input,31,FOLLOW_31_in_ruleMutationExpr2427); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_2, grammarAccess.getMutationExprAccess().getValueHyphenMinusKeyword_0_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMutationExprRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1128:8: lv_value_0_3= '*'
                    {
                    lv_value_0_3=(Token)match(input,32,FOLLOW_32_in_ruleMutationExpr2456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_3, grammarAccess.getMutationExprAccess().getValueAsteriskKeyword_0_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMutationExprRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1140:8: lv_value_0_4= '/'
                    {
                    lv_value_0_4=(Token)match(input,33,FOLLOW_33_in_ruleMutationExpr2485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_4, grammarAccess.getMutationExprAccess().getValueSolidusKeyword_0_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMutationExprRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_4, null);
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1152:8: lv_value_0_5= '^'
                    {
                    lv_value_0_5=(Token)match(input,34,FOLLOW_34_in_ruleMutationExpr2514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_5, grammarAccess.getMutationExprAccess().getValueCircumflexAccentKeyword_0_0_4());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMutationExprRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_5, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMutationExpr2541); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_FLOAT_1, grammarAccess.getMutationExprAccess().getFLOATTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMutationExpr"


    // $ANTLR start "entryRuleFloatExpr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1179:1: entryRuleFloatExpr returns [EObject current=null] : iv_ruleFloatExpr= ruleFloatExpr EOF ;
    public final EObject entryRuleFloatExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatExpr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1180:2: (iv_ruleFloatExpr= ruleFloatExpr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1181:2: iv_ruleFloatExpr= ruleFloatExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatExprRule()); 
            }
            pushFollow(FOLLOW_ruleFloatExpr_in_entryRuleFloatExpr2576);
            iv_ruleFloatExpr=ruleFloatExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatExpr2586); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatExpr"


    // $ANTLR start "ruleFloatExpr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1188:1: ruleFloatExpr returns [EObject current=null] : ( ( ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueCalculated_1_0= rulePlusOrMinus ) ) | ( ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue ) ) ) ;
    public final EObject ruleFloatExpr() throws RecognitionException {
        EObject current = null;

        Token lv_valueDirect_0_0=null;
        EObject lv_valueCalculated_1_0 = null;

        EObject lv_valueOfFluent_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1191:28: ( ( ( ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueCalculated_1_0= rulePlusOrMinus ) ) | ( ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1192:1: ( ( ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueCalculated_1_0= rulePlusOrMinus ) ) | ( ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1192:1: ( ( ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueCalculated_1_0= rulePlusOrMinus ) ) | ( ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue ) ) )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred7_InternalEce()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==RULE_ID) ) {
                int LA21_2 = input.LA(2);

                if ( (true) ) {
                    alt21=2;
                }
                else if ( (synpred8_InternalEce()) ) {
                    alt21=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1192:2: ( ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1192:2: ( ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1192:3: ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1198:1: (lv_valueDirect_0_0= RULE_INT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1199:3: lv_valueDirect_0_0= RULE_INT
                    {
                    lv_valueDirect_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloatExpr2639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_valueDirect_0_0, grammarAccess.getFloatExprAccess().getValueDirectINTTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFloatExprRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"valueDirect",
                              		lv_valueDirect_0_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1216:6: ( (lv_valueCalculated_1_0= rulePlusOrMinus ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1216:6: ( (lv_valueCalculated_1_0= rulePlusOrMinus ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1217:1: (lv_valueCalculated_1_0= rulePlusOrMinus )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1217:1: (lv_valueCalculated_1_0= rulePlusOrMinus )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1218:3: lv_valueCalculated_1_0= rulePlusOrMinus
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFloatExprAccess().getValueCalculatedPlusOrMinusParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleFloatExpr2671);
                    lv_valueCalculated_1_0=rulePlusOrMinus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFloatExprRule());
                      	        }
                             		set(
                             			current, 
                             			"valueCalculated",
                              		lv_valueCalculated_1_0, 
                              		"PlusOrMinus");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1235:6: ( ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1235:6: ( ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1235:7: ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1240:1: (lv_valueOfFluent_2_0= ruleFluentWhoseValue )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1241:3: lv_valueOfFluent_2_0= ruleFluentWhoseValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFloatExprAccess().getValueOfFluentFluentWhoseValueParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFluentWhoseValue_in_ruleFloatExpr2708);
                    lv_valueOfFluent_2_0=ruleFluentWhoseValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFloatExprRule());
                      	        }
                             		set(
                             			current, 
                             			"valueOfFluent",
                              		lv_valueOfFluent_2_0, 
                              		"FluentWhoseValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatExpr"


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1265:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1266:2: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1267:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2744);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus2754); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1274:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1277:28: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1278:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1278:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1279:5: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2801);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MulOrDiv_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1287:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=30 && LA23_0<=31)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1287:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1287:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==30) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==31) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1287:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1287:3: ( () otherlv_2= '+' )
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1287:4: () otherlv_2= '+'
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1287:4: ()
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1288:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePlusOrMinus2824); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1298:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1298:6: ( () otherlv_4= '-' )
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1298:7: () otherlv_4= '-'
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1298:7: ()
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1299:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,31,FOLLOW_31_in_rulePlusOrMinus2853); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1308:3: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1309:1: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1309:1: (lv_right_5_0= ruleMulOrDiv )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1310:3: lv_right_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2876);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"MulOrDiv");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1334:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1335:2: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1336:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2914);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv2924); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1343:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1346:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1347:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1347:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1348:5: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv2971);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Primary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1356:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=32 && LA25_0<=35)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1356:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1356:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1357:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1362:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1363:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1363:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1364:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1364:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
            	    int alt24=4;
            	    switch ( input.LA(1) ) {
            	    case 32:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1365:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,32,FOLLOW_32_in_ruleMulOrDiv3000); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1377:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,33,FOLLOW_33_in_ruleMulOrDiv3029); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1389:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,35,FOLLOW_35_in_ruleMulOrDiv3058); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1401:8: lv_op_2_4= '^'
            	            {
            	            lv_op_2_4=(Token)match(input,34,FOLLOW_34_in_ruleMulOrDiv3087); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1416:2: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1417:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1417:1: (lv_right_3_0= rulePrimary )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1418:3: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv3124);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Primary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1442:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1443:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1444:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary3162);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary3172); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1451:1: rulePrimary returns [EObject current=null] : ( ( (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueOfFluent_1_0= ruleFluentWhoseValue ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_valueDirect_0_0=null;
        EObject lv_valueOfFluent_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1454:28: ( ( ( (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueOfFluent_1_0= ruleFluentWhoseValue ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1455:1: ( ( (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueOfFluent_1_0= ruleFluentWhoseValue ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1455:1: ( ( (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueOfFluent_1_0= ruleFluentWhoseValue ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1455:2: ( (lv_valueDirect_0_0= RULE_INT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1455:2: ( (lv_valueDirect_0_0= RULE_INT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1456:1: (lv_valueDirect_0_0= RULE_INT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1456:1: (lv_valueDirect_0_0= RULE_INT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1457:3: lv_valueDirect_0_0= RULE_INT
                    {
                    lv_valueDirect_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrimary3214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_valueDirect_0_0, grammarAccess.getPrimaryAccess().getValueDirectINTTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"valueDirect",
                              		lv_valueDirect_0_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1474:6: ( (lv_valueOfFluent_1_0= ruleFluentWhoseValue ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1474:6: ( (lv_valueOfFluent_1_0= ruleFluentWhoseValue ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1475:1: (lv_valueOfFluent_1_0= ruleFluentWhoseValue )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1475:1: (lv_valueOfFluent_1_0= ruleFluentWhoseValue )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1476:3: lv_valueOfFluent_1_0= ruleFluentWhoseValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryAccess().getValueOfFluentFluentWhoseValueParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFluentWhoseValue_in_rulePrimary3246);
                    lv_valueOfFluent_1_0=ruleFluentWhoseValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      	        }
                             		set(
                             			current, 
                             			"valueOfFluent",
                              		lv_valueOfFluent_1_0, 
                              		"FluentWhoseValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleFluentWhoseValue"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1500:1: entryRuleFluentWhoseValue returns [EObject current=null] : iv_ruleFluentWhoseValue= ruleFluentWhoseValue EOF ;
    public final EObject entryRuleFluentWhoseValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFluentWhoseValue = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1501:2: (iv_ruleFluentWhoseValue= ruleFluentWhoseValue EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1502:2: iv_ruleFluentWhoseValue= ruleFluentWhoseValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFluentWhoseValueRule()); 
            }
            pushFollow(FOLLOW_ruleFluentWhoseValue_in_entryRuleFluentWhoseValue3282);
            iv_ruleFluentWhoseValue=ruleFluentWhoseValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFluentWhoseValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluentWhoseValue3292); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFluentWhoseValue"


    // $ANTLR start "ruleFluentWhoseValue"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1509:1: ruleFluentWhoseValue returns [EObject current=null] : ( (lv_fluentWhoseValueName_0_0= RULE_ID ) ) ;
    public final EObject ruleFluentWhoseValue() throws RecognitionException {
        EObject current = null;

        Token lv_fluentWhoseValueName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1512:28: ( ( (lv_fluentWhoseValueName_0_0= RULE_ID ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1513:1: ( (lv_fluentWhoseValueName_0_0= RULE_ID ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1513:1: ( (lv_fluentWhoseValueName_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1514:1: (lv_fluentWhoseValueName_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1514:1: (lv_fluentWhoseValueName_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1515:3: lv_fluentWhoseValueName_0_0= RULE_ID
            {
            lv_fluentWhoseValueName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFluentWhoseValue3333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_fluentWhoseValueName_0_0, grammarAccess.getFluentWhoseValueAccess().getFluentWhoseValueNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFluentWhoseValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"fluentWhoseValueName",
                      		lv_fluentWhoseValueName_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFluentWhoseValue"


    // $ANTLR start "entryRuleStr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1539:1: entryRuleStr returns [EObject current=null] : iv_ruleStr= ruleStr EOF ;
    public final EObject entryRuleStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1540:2: (iv_ruleStr= ruleStr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1541:2: iv_ruleStr= ruleStr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStrRule()); 
            }
            pushFollow(FOLLOW_ruleStr_in_entryRuleStr3373);
            iv_ruleStr=ruleStr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStr3383); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStr"


    // $ANTLR start "ruleStr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1548:1: ruleStr returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1551:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1552:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1552:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1553:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1553:1: (lv_value_0_0= RULE_STRING )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1554:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStr3424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStrAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStrRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStr"


    // $ANTLR start "entryRuleInRule"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1578:1: entryRuleInRule returns [EObject current=null] : iv_ruleInRule= ruleInRule EOF ;
    public final EObject entryRuleInRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1579:2: (iv_ruleInRule= ruleInRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1580:2: iv_ruleInRule= ruleInRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInRuleRule()); 
            }
            pushFollow(FOLLOW_ruleInRule_in_entryRuleInRule3464);
            iv_ruleInRule=ruleInRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInRule3474); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInRule"


    // $ANTLR start "ruleInRule"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1587:1: ruleInRule returns [EObject current=null] : ( ( (lv_time_0_0= RULE_INT ) ) | ( (lv_currentTime_1_0= 'now' ) ) ) ;
    public final EObject ruleInRule() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;
        Token lv_currentTime_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1590:28: ( ( ( (lv_time_0_0= RULE_INT ) ) | ( (lv_currentTime_1_0= 'now' ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1591:1: ( ( (lv_time_0_0= RULE_INT ) ) | ( (lv_currentTime_1_0= 'now' ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1591:1: ( ( (lv_time_0_0= RULE_INT ) ) | ( (lv_currentTime_1_0= 'now' ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT) ) {
                alt27=1;
            }
            else if ( (LA27_0==36) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1591:2: ( (lv_time_0_0= RULE_INT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1591:2: ( (lv_time_0_0= RULE_INT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1592:1: (lv_time_0_0= RULE_INT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1592:1: (lv_time_0_0= RULE_INT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1593:3: lv_time_0_0= RULE_INT
                    {
                    lv_time_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInRule3516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_time_0_0, grammarAccess.getInRuleAccess().getTimeINTTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInRuleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"time",
                              		lv_time_0_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1610:6: ( (lv_currentTime_1_0= 'now' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1610:6: ( (lv_currentTime_1_0= 'now' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1611:1: (lv_currentTime_1_0= 'now' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1611:1: (lv_currentTime_1_0= 'now' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1612:3: lv_currentTime_1_0= 'now'
                    {
                    lv_currentTime_1_0=(Token)match(input,36,FOLLOW_36_in_ruleInRule3545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_currentTime_1_0, grammarAccess.getInRuleAccess().getCurrentTimeNowKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInRuleRule());
                      	        }
                             		setWithLastConsumed(current, "currentTime", lv_currentTime_1_0, "now");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInRule"


    // $ANTLR start "entryRuleConditionRule"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1633:1: entryRuleConditionRule returns [EObject current=null] : iv_ruleConditionRule= ruleConditionRule EOF ;
    public final EObject entryRuleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1634:2: (iv_ruleConditionRule= ruleConditionRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1635:2: iv_ruleConditionRule= ruleConditionRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRuleRule()); 
            }
            pushFollow(FOLLOW_ruleConditionRule_in_entryRuleConditionRule3594);
            iv_ruleConditionRule=ruleConditionRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionRule3604); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionRule"


    // $ANTLR start "ruleConditionRule"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1642:1: ruleConditionRule returns [EObject current=null] : ( (lv_condition_0_0= ruleBoolExpr ) ) ;
    public final EObject ruleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1645:28: ( ( (lv_condition_0_0= ruleBoolExpr ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1646:1: ( (lv_condition_0_0= ruleBoolExpr ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1646:1: ( (lv_condition_0_0= ruleBoolExpr ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1647:1: (lv_condition_0_0= ruleBoolExpr )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1647:1: (lv_condition_0_0= ruleBoolExpr )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1648:3: lv_condition_0_0= ruleBoolExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionRuleAccess().getConditionBoolExprParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBoolExpr_in_ruleConditionRule3649);
            lv_condition_0_0=ruleBoolExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionRuleRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_0_0, 
                      		"BoolExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionRule"

    // $ANTLR start synpred1_InternalEce
    public final void synpred1_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:373:7: ( ( ruleBoolExpr ) )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:374:1: ( ruleBoolExpr )
        {
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:374:1: ( ruleBoolExpr )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:375:1: ruleBoolExpr
        {
        pushFollow(FOLLOW_ruleBoolExpr_in_synpred1_InternalEce718);
        ruleBoolExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalEce

    // $ANTLR start synpred2_InternalEce
    public final void synpred2_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:415:7: ( ( ( ruleFloatExpr ) ) )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:415:8: ( ( ruleFloatExpr ) )
        {
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:415:8: ( ( ruleFloatExpr ) )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:416:1: ( ruleFloatExpr )
        {
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:416:1: ( ruleFloatExpr )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:417:1: ruleFloatExpr
        {
        pushFollow(FOLLOW_ruleFloatExpr_in_synpred2_InternalEce783);
        ruleFloatExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalEce

    // $ANTLR start synpred3_InternalEce
    public final void synpred3_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:675:8: ( ruleEquality )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:675:10: ruleEquality
        {
        pushFollow(FOLLOW_ruleEquality_in_synpred3_InternalEce1410);
        ruleEquality();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalEce

    // $ANTLR start synpred4_InternalEce
    public final void synpred4_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:713:8: ( ruleComparison )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:713:10: ruleComparison
        {
        pushFollow(FOLLOW_ruleComparison_in_synpred4_InternalEce1491);
        ruleComparison();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalEce

    // $ANTLR start synpred5_InternalEce
    public final void synpred5_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:751:8: ( ruleComparison )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:751:10: ruleComparison
        {
        pushFollow(FOLLOW_ruleComparison_in_synpred5_InternalEce1572);
        ruleComparison();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalEce

    // $ANTLR start synpred6_InternalEce
    public final void synpred6_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:873:8: ( ruleStringExpr )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:873:10: ruleStringExpr
        {
        pushFollow(FOLLOW_ruleStringExpr_in_synpred6_InternalEce1844);
        ruleStringExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalEce

    // $ANTLR start synpred7_InternalEce
    public final void synpred7_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1192:3: ( ( RULE_INT ) )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1193:1: ( RULE_INT )
        {
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1193:1: ( RULE_INT )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1194:1: RULE_INT
        {
        match(input,RULE_INT,FOLLOW_RULE_INT_in_synpred7_InternalEce2625); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalEce

    // $ANTLR start synpred8_InternalEce
    public final void synpred8_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1235:7: ( ( ruleFluentWhoseValue ) )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1236:1: ( ruleFluentWhoseValue )
        {
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1236:1: ( ruleFluentWhoseValue )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1237:1: ruleFluentWhoseValue
        {
        pushFollow(FOLLOW_ruleFluentWhoseValue_in_synpred8_InternalEce2691);
        ruleFluentWhoseValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalEce

    // Delegated rules

    public final boolean synpred2_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalEce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalEce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalEce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalEce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalEce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA5_eotS =
        "\12\uffff";
    static final String DFA5_eofS =
        "\12\uffff";
    static final String DFA5_minS =
        "\1\4\2\0\2\uffff\1\0\4\uffff";
    static final String DFA5_maxS =
        "\1\42\2\0\2\uffff\1\0\4\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\2\2\1\uffff\1\3\1\5\1\1\1\4";
    static final String DFA5_specialS =
        "\1\0\1\3\1\2\2\uffff\1\1\4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\1\uffff\1\5\1\1\13\uffff\1\3\1\4\10\uffff\1\6\5\7",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "354:1: ( ( (lv_expression_0_0= ruleStringExpr ) ) | ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) ) | ( (lv_expression_2_0= ruleswitchExpr ) ) | ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) ) | ( (lv_expression_4_0= ruleMutationExpr ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                         
                        int index5_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_0==RULE_STRING) ) {s = 1;}

                        else if ( (LA5_0==RULE_ID) ) {s = 2;}

                        else if ( (LA5_0==19) && (synpred1_InternalEce())) {s = 3;}

                        else if ( (LA5_0==20) && (synpred1_InternalEce())) {s = 4;}

                        else if ( (LA5_0==RULE_INT) ) {s = 5;}

                        else if ( (LA5_0==29) ) {s = 6;}

                        else if ( ((LA5_0>=30 && LA5_0<=34)) ) {s = 7;}

                         
                        input.seek(index5_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_5 = input.LA(1);

                         
                        int index5_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalEce()) ) {s = 4;}

                        else if ( (synpred2_InternalEce()) ) {s = 9;}

                         
                        input.seek(index5_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_2 = input.LA(1);

                         
                        int index5_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 8;}

                        else if ( (synpred1_InternalEce()) ) {s = 4;}

                        else if ( (synpred2_InternalEce()) ) {s = 9;}

                         
                        input.seek(index5_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_1 = input.LA(1);

                         
                        int index5_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 8;}

                        else if ( (synpred1_InternalEce()) ) {s = 4;}

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\34\uffff";
    static final String DFA13_eofS =
        "\34\uffff";
    static final String DFA13_minS =
        "\1\4\1\27\2\0\10\4\4\uffff\4\27\2\0\4\4\2\27";
    static final String DFA13_maxS =
        "\1\7\1\43\2\0\10\6\4\uffff\4\43\2\0\4\6\2\43";
    static final String DFA13_acceptS =
        "\14\uffff\1\3\1\4\1\1\1\2\14\uffff";
    static final String DFA13_specialS =
        "\1\uffff\1\0\1\4\1\1\20\uffff\1\3\1\2\6\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\uffff\1\1\1\3",
            "\1\12\1\13\5\uffff\1\10\1\11\1\4\1\5\1\7\1\6",
            "\1\uffff",
            "\1\uffff",
            "\1\21\1\uffff\1\20",
            "\1\21\1\uffff\1\20",
            "\1\21\1\uffff\1\20",
            "\1\21\1\uffff\1\20",
            "\1\23\1\uffff\1\22",
            "\1\23\1\uffff\1\22",
            "\1\25\1\uffff\1\24",
            "\1\25\1\uffff\1\24",
            "",
            "",
            "",
            "",
            "\1\12\1\13\5\uffff\1\10\1\11\1\4\1\5\1\7\1\6",
            "\1\12\1\13\5\uffff\1\10\1\11\1\4\1\5\1\7\1\6",
            "\1\12\1\13\5\uffff\1\10\1\11\1\26\1\27\1\31\1\30",
            "\1\12\1\13\5\uffff\1\10\1\11\1\26\1\27\1\31\1\30",
            "\1\uffff",
            "\1\uffff",
            "\1\33\1\uffff\1\32",
            "\1\33\1\uffff\1\32",
            "\1\33\1\uffff\1\32",
            "\1\33\1\uffff\1\32",
            "\1\12\1\13\5\uffff\1\10\1\11\1\26\1\27\1\31\1\30",
            "\1\12\1\13\5\uffff\1\10\1\11\1\26\1\27\1\31\1\30"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "637:1: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) | ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_1 = input.LA(1);

                         
                        int index13_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_1==32) ) {s = 4;}

                        else if ( (LA13_1==33) ) {s = 5;}

                        else if ( (LA13_1==35) ) {s = 6;}

                        else if ( (LA13_1==34) ) {s = 7;}

                        else if ( (LA13_1==30) ) {s = 8;}

                        else if ( (LA13_1==31) ) {s = 9;}

                        else if ( (LA13_1==23) ) {s = 10;}

                        else if ( (LA13_1==24) ) {s = 11;}

                        else if ( (synpred4_InternalEce()) ) {s = 12;}

                        else if ( (synpred5_InternalEce()) ) {s = 13;}

                         
                        input.seek(index13_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 14;}

                        else if ( (synpred3_InternalEce()) ) {s = 15;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_21 = input.LA(1);

                         
                        int index13_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 14;}

                        else if ( (synpred3_InternalEce()) ) {s = 15;}

                         
                        input.seek(index13_21);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_20 = input.LA(1);

                         
                        int index13_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 14;}

                        else if ( (synpred3_InternalEce()) ) {s = 15;}

                         
                        input.seek(index13_20);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 14;}

                        else if ( (synpred3_InternalEce()) ) {s = 15;}

                        else if ( (synpred4_InternalEce()) ) {s = 12;}

                        else if ( (synpred5_InternalEce()) ) {s = 13;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\17\uffff";
    static final String DFA17_eofS =
        "\2\uffff\1\14\14\uffff";
    static final String DFA17_minS =
        "\1\4\1\uffff\1\16\1\uffff\2\4\7\uffff\1\0\1\uffff";
    static final String DFA17_maxS =
        "\1\7\1\uffff\1\43\1\uffff\2\7\7\uffff\1\0\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\2\uffff\7\2\1\uffff\1\2";
    static final String DFA17_specialS =
        "\1\3\1\uffff\1\2\1\uffff\1\0\1\4\7\uffff\1\1\1\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\uffff\1\1\1\3",
            "",
            "\1\12\1\13\1\uffff\1\10\1\11\2\uffff\1\7\1\6\1\4\1\5\5\uffff"+
            "\6\1",
            "",
            "\1\15\1\uffff\1\1\1\16",
            "\1\15\1\uffff\1\1\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "809:1: ( (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) ) | ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_4==RULE_INT) ) {s = 1;}

                        else if ( (LA17_4==RULE_ID) ) {s = 13;}

                        else if ( (LA17_4==RULE_STRING) && (synpred6_InternalEce())) {s = 14;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_13 = input.LA(1);

                         
                        int index17_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred6_InternalEce()) ) {s = 14;}

                         
                        input.seek(index17_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_2==23) ) {s = 4;}

                        else if ( (LA17_2==24) ) {s = 5;}

                        else if ( (LA17_2==22) && (synpred6_InternalEce())) {s = 6;}

                        else if ( (LA17_2==21) && (synpred6_InternalEce())) {s = 7;}

                        else if ( (LA17_2==17) && (synpred6_InternalEce())) {s = 8;}

                        else if ( (LA17_2==18) && (synpred6_InternalEce())) {s = 9;}

                        else if ( (LA17_2==14) && (synpred6_InternalEce())) {s = 10;}

                        else if ( (LA17_2==15) && (synpred6_InternalEce())) {s = 11;}

                        else if ( (LA17_2==EOF) && (synpred6_InternalEce())) {s = 12;}

                        else if ( ((LA17_2>=30 && LA17_2<=35)) ) {s = 1;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_0 = input.LA(1);

                         
                        int index17_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_0==RULE_INT) ) {s = 1;}

                        else if ( (LA17_0==RULE_ID) ) {s = 2;}

                        else if ( (LA17_0==RULE_STRING) && (synpred6_InternalEce())) {s = 3;}

                         
                        input.seek(index17_0);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_5==RULE_STRING) && (synpred6_InternalEce())) {s = 14;}

                        else if ( (LA17_5==RULE_ID) ) {s = 13;}

                        else if ( (LA17_5==RULE_INT) ) {s = 1;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleDroolsModel_in_entryRuleDroolsModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDroolsModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDroolsModel130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStatement213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatement234 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStatement246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFluent_in_ruleStatement267 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleStatement280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFluent_in_ruleStatement301 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleStatement315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFluent494 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFluent512 = new BitSet(new long[]{0x00000007E01800D0L});
    public static final BitSet FOLLOW_ruleToRule_in_ruleFluent533 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_ruleFluent547 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_ruleInRule_in_ruleFluent568 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleFluent583 = new BitSet(new long[]{0x00000000001800D0L});
    public static final BitSet FOLLOW_ruleConditionRule_in_ruleFluent604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_entryRuleToRule642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToRule652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpr_in_ruleToRule698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleToRule735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitchExpr_in_ruleToRule762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_ruleToRule802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMutationExpr_in_ruleToRule830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpr_in_entryRuleStringExpr866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpr876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStr_in_ruleStringExpr923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_ruleStringExpr950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpr995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBoolExpr1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBoolExpr1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleBoolExpr1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1208 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleOr1229 = new BitSet(new long[]{0x00000000001800D0L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1250 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd1288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1346 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAnd1367 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1388 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1426 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAnd1448 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleAnd1469 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleAnd1507 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAnd1529 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleAnd1550 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleAnd1588 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAnd1610 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1631 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality1670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_ruleEquality1728 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleEquality1757 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_24_in_ruleEquality1786 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_ruleEquality1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpr_in_ruleEquality1860 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleEquality1890 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_24_in_ruleEquality1919 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleStringExpr_in_ruleEquality1956 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison2052 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_25_in_ruleComparison2081 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_26_in_ruleComparison2110 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_27_in_ruleComparison2139 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_28_in_ruleComparison2168 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison2205 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_ruleswitchExpr_in_entryRuleswitchExpr2243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleswitchExpr2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleswitchExpr2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMutationExpr_in_entryRuleMutationExpr2343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMutationExpr2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMutationExpr2398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_31_in_ruleMutationExpr2427 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32_in_ruleMutationExpr2456 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_33_in_ruleMutationExpr2485 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_34_in_ruleMutationExpr2514 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMutationExpr2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_entryRuleFloatExpr2576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatExpr2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloatExpr2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleFloatExpr2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_ruleFloatExpr2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2801 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_30_in_rulePlusOrMinus2824 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_31_in_rulePlusOrMinus2853 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2876 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv2971 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_32_in_ruleMulOrDiv3000 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_33_in_ruleMulOrDiv3029 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_35_in_ruleMulOrDiv3058 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_34_in_ruleMulOrDiv3087 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv3124 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary3162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrimary3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_rulePrimary3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_entryRuleFluentWhoseValue3282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluentWhoseValue3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFluentWhoseValue3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStr_in_entryRuleStr3373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStr3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStr3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_entryRuleInRule3464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInRule3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInRule3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInRule3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_entryRuleConditionRule3594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionRule3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleConditionRule3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_synpred1_InternalEce718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_synpred2_InternalEce783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_synpred3_InternalEce1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_synpred4_InternalEce1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_synpred5_InternalEce1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpr_in_synpred6_InternalEce1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_synpred7_InternalEce2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_synpred8_InternalEce2691 = new BitSet(new long[]{0x0000000000000002L});

}