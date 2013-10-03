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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'on'", "'set'", "','", "'expect'", "';'", "'to'", "'in'", "'if'", "'true'", "'false'", "'OR'", "'AND'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'switch'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'now'"
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
    public static final int T__37=37;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:115:1: ruleStatement returns [EObject current=null] : (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* (otherlv_6= 'expect' ( (lv_exp_7_0= ruleExpFluent ) ) (otherlv_8= ',' ( (lv_exp_9_0= ruleExpFluent ) ) )* )? otherlv_10= ';' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_event_1_0 = null;

        EObject lv_fluent_3_0 = null;

        EObject lv_fluent_5_0 = null;

        EObject lv_exp_7_0 = null;

        EObject lv_exp_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:118:28: ( (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* (otherlv_6= 'expect' ( (lv_exp_7_0= ruleExpFluent ) ) (otherlv_8= ',' ( (lv_exp_9_0= ruleExpFluent ) ) )* )? otherlv_10= ';' ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:119:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* (otherlv_6= 'expect' ( (lv_exp_7_0= ruleExpFluent ) ) (otherlv_8= ',' ( (lv_exp_9_0= ruleExpFluent ) ) )* )? otherlv_10= ';' )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:119:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* (otherlv_6= 'expect' ( (lv_exp_7_0= ruleExpFluent ) ) (otherlv_8= ',' ( (lv_exp_9_0= ruleExpFluent ) ) )* )? otherlv_10= ';' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:119:3: otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) otherlv_2= 'set' ( (lv_fluent_3_0= ruleFluent ) ) (otherlv_4= ',' ( (lv_fluent_5_0= ruleFluent ) ) )* (otherlv_6= 'expect' ( (lv_exp_7_0= ruleExpFluent ) ) (otherlv_8= ',' ( (lv_exp_9_0= ruleExpFluent ) ) )* )? otherlv_10= ';'
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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:185:4: (otherlv_6= 'expect' ( (lv_exp_7_0= ruleExpFluent ) ) (otherlv_8= ',' ( (lv_exp_9_0= ruleExpFluent ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:185:6: otherlv_6= 'expect' ( (lv_exp_7_0= ruleExpFluent ) ) (otherlv_8= ',' ( (lv_exp_9_0= ruleExpFluent ) ) )*
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleStatement316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getExpectKeyword_5_0());
                          
                    }
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:189:1: ( (lv_exp_7_0= ruleExpFluent ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:190:1: (lv_exp_7_0= ruleExpFluent )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:190:1: (lv_exp_7_0= ruleExpFluent )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:191:3: lv_exp_7_0= ruleExpFluent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpExpFluentParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpFluent_in_ruleStatement337);
                    lv_exp_7_0=ruleExpFluent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		add(
                             			current, 
                             			"exp",
                              		lv_exp_7_0, 
                              		"ExpFluent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:207:2: (otherlv_8= ',' ( (lv_exp_9_0= ruleExpFluent ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:207:4: otherlv_8= ',' ( (lv_exp_9_0= ruleExpFluent ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleStatement350); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:211:1: ( (lv_exp_9_0= ruleExpFluent ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:212:1: (lv_exp_9_0= ruleExpFluent )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:212:1: (lv_exp_9_0= ruleExpFluent )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:213:3: lv_exp_9_0= ruleExpFluent
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStatementAccess().getExpExpFluentParserRuleCall_5_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpFluent_in_ruleStatement371);
                    	    lv_exp_9_0=ruleExpFluent();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"exp",
                    	              		lv_exp_9_0, 
                    	              		"ExpFluent");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleStatement387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getSemicolonKeyword_6());
                  
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:241:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:242:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:243:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent423);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent433); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:250:1: ruleEvent returns [EObject current=null] : ( (lv_eventName_0_0= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_eventName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:253:28: ( ( (lv_eventName_0_0= RULE_ID ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:254:1: ( (lv_eventName_0_0= RULE_ID ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:254:1: ( (lv_eventName_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:255:1: (lv_eventName_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:255:1: (lv_eventName_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:256:3: lv_eventName_0_0= RULE_ID
            {
            lv_eventName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent474); if (state.failed) return current;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:280:1: entryRuleFluent returns [EObject current=null] : iv_ruleFluent= ruleFluent EOF ;
    public final EObject entryRuleFluent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFluent = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:281:2: (iv_ruleFluent= ruleFluent EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:282:2: iv_ruleFluent= ruleFluent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFluentRule()); 
            }
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent514);
            iv_ruleFluent=ruleFluent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFluent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent524); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:289:1: ruleFluent returns [EObject current=null] : ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:292:28: ( ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:293:1: ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:293:1: ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:293:2: ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )?
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:293:2: ( (lv_fluentName_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:294:1: (lv_fluentName_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:294:1: (lv_fluentName_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:295:3: lv_fluentName_0_0= RULE_ID
            {
            lv_fluentName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFluent566); if (state.failed) return current;
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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:311:2: (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:311:4: otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) )
            {
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleFluent584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFluentAccess().getToKeyword_1_0());
                  
            }
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:315:1: ( (lv_valuePart_2_0= ruleToRule ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:316:1: (lv_valuePart_2_0= ruleToRule )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:316:1: (lv_valuePart_2_0= ruleToRule )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:317:3: lv_valuePart_2_0= ruleToRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleToRule_in_ruleFluent605);
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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:333:3: (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:333:5: otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleFluent619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFluentAccess().getInKeyword_2_0());
                          
                    }
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:337:1: ( (lv_timePart_4_0= ruleInRule ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:338:1: (lv_timePart_4_0= ruleInRule )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:338:1: (lv_timePart_4_0= ruleInRule )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:339:3: lv_timePart_4_0= ruleInRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInRule_in_ruleFluent640);
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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:355:4: (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:355:6: otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleFluent655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFluentAccess().getIfKeyword_3_0());
                          
                    }
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:359:1: ( (lv_condPart_6_0= ruleConditionRule ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:360:1: (lv_condPart_6_0= ruleConditionRule )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:360:1: (lv_condPart_6_0= ruleConditionRule )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:361:3: lv_condPart_6_0= ruleConditionRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionRule_in_ruleFluent676);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:385:1: entryRuleToRule returns [EObject current=null] : iv_ruleToRule= ruleToRule EOF ;
    public final EObject entryRuleToRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:386:2: (iv_ruleToRule= ruleToRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:387:2: iv_ruleToRule= ruleToRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getToRuleRule()); 
            }
            pushFollow(FOLLOW_ruleToRule_in_entryRuleToRule714);
            iv_ruleToRule=ruleToRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleToRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleToRule724); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:394:1: ruleToRule returns [EObject current=null] : ( ( (lv_expression_0_0= ruleStringExpr ) ) | ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) ) | ( (lv_expression_2_0= ruleswitchExpr ) ) | ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) ) | ( (lv_expression_4_0= ruleMutationExpr ) ) ) ;
    public final EObject ruleToRule() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_expression_1_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:397:28: ( ( ( (lv_expression_0_0= ruleStringExpr ) ) | ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) ) | ( (lv_expression_2_0= ruleswitchExpr ) ) | ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) ) | ( (lv_expression_4_0= ruleMutationExpr ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:398:1: ( ( (lv_expression_0_0= ruleStringExpr ) ) | ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) ) | ( (lv_expression_2_0= ruleswitchExpr ) ) | ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) ) | ( (lv_expression_4_0= ruleMutationExpr ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:398:1: ( ( (lv_expression_0_0= ruleStringExpr ) ) | ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) ) | ( (lv_expression_2_0= ruleswitchExpr ) ) | ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) ) | ( (lv_expression_4_0= ruleMutationExpr ) ) )
            int alt7=5;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:398:2: ( (lv_expression_0_0= ruleStringExpr ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:398:2: ( (lv_expression_0_0= ruleStringExpr ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:399:1: (lv_expression_0_0= ruleStringExpr )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:399:1: (lv_expression_0_0= ruleStringExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:400:3: lv_expression_0_0= ruleStringExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionStringExprParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStringExpr_in_ruleToRule770);
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:417:6: ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:417:6: ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:417:7: ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:422:1: (lv_expression_1_0= ruleBoolExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:423:3: lv_expression_1_0= ruleBoolExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionBoolExprParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBoolExpr_in_ruleToRule807);
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:440:6: ( (lv_expression_2_0= ruleswitchExpr ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:440:6: ( (lv_expression_2_0= ruleswitchExpr ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:441:1: (lv_expression_2_0= ruleswitchExpr )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:441:1: (lv_expression_2_0= ruleswitchExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:442:3: lv_expression_2_0= ruleswitchExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionSwitchExprParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleswitchExpr_in_ruleToRule834);
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:459:6: ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:459:6: ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:459:7: ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:463:5: ( (lv_expression_3_0= ruleFloatExpr ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:464:1: (lv_expression_3_0= ruleFloatExpr )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:464:1: (lv_expression_3_0= ruleFloatExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:465:3: lv_expression_3_0= ruleFloatExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionFloatExprParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFloatExpr_in_ruleToRule874);
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:482:6: ( (lv_expression_4_0= ruleMutationExpr ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:482:6: ( (lv_expression_4_0= ruleMutationExpr ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:483:1: (lv_expression_4_0= ruleMutationExpr )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:483:1: (lv_expression_4_0= ruleMutationExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:484:3: lv_expression_4_0= ruleMutationExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionMutationExprParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMutationExpr_in_ruleToRule902);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:508:1: entryRuleStringExpr returns [EObject current=null] : iv_ruleStringExpr= ruleStringExpr EOF ;
    public final EObject entryRuleStringExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:509:2: (iv_ruleStringExpr= ruleStringExpr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:510:2: iv_ruleStringExpr= ruleStringExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringExprRule()); 
            }
            pushFollow(FOLLOW_ruleStringExpr_in_entryRuleStringExpr938);
            iv_ruleStringExpr=ruleStringExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpr948); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:517:1: ruleStringExpr returns [EObject current=null] : (this_Str_0= ruleStr | this_FluentWhoseValue_1= ruleFluentWhoseValue ) ;
    public final EObject ruleStringExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Str_0 = null;

        EObject this_FluentWhoseValue_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:520:28: ( (this_Str_0= ruleStr | this_FluentWhoseValue_1= ruleFluentWhoseValue ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:521:1: (this_Str_0= ruleStr | this_FluentWhoseValue_1= ruleFluentWhoseValue )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:521:1: (this_Str_0= ruleStr | this_FluentWhoseValue_1= ruleFluentWhoseValue )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:522:5: this_Str_0= ruleStr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStringExprAccess().getStrParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStr_in_ruleStringExpr995);
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:532:5: this_FluentWhoseValue_1= ruleFluentWhoseValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStringExprAccess().getFluentWhoseValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFluentWhoseValue_in_ruleStringExpr1022);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:548:1: entryRuleBoolExpr returns [EObject current=null] : iv_ruleBoolExpr= ruleBoolExpr EOF ;
    public final EObject entryRuleBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:549:2: (iv_ruleBoolExpr= ruleBoolExpr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:550:2: iv_ruleBoolExpr= ruleBoolExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExprRule()); 
            }
            pushFollow(FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr1057);
            iv_ruleBoolExpr=ruleBoolExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpr1067); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:557:1: ruleBoolExpr returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) | this_Or_2= ruleOr ) ;
    public final EObject ruleBoolExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        EObject this_Or_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:560:28: ( ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) | this_Or_2= ruleOr ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:561:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) | this_Or_2= ruleOr )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:561:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) | this_Or_2= ruleOr )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:561:2: ( (lv_value_0_0= 'true' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:561:2: ( (lv_value_0_0= 'true' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:562:1: (lv_value_0_0= 'true' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:562:1: (lv_value_0_0= 'true' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:563:3: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)match(input,20,FOLLOW_20_in_ruleBoolExpr1110); if (state.failed) return current;
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:577:6: ( (lv_value_1_0= 'false' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:577:6: ( (lv_value_1_0= 'false' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:578:1: (lv_value_1_0= 'false' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:578:1: (lv_value_1_0= 'false' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:579:3: lv_value_1_0= 'false'
                    {
                    lv_value_1_0=(Token)match(input,21,FOLLOW_21_in_ruleBoolExpr1147); if (state.failed) return current;
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:594:5: this_Or_2= ruleOr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBoolExprAccess().getOrParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOr_in_ruleBoolExpr1188);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:610:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:611:2: (iv_ruleOr= ruleOr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:612:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1223);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1233); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:619:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:622:28: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:623:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:623:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:624:5: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAnd_in_ruleOr1280);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_And_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:632:1: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:632:2: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:632:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:633:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleOr1301); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:642:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:643:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:643:1: (lv_right_3_0= ruleAnd )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:644:3: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr1322);
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
            	    break loop10;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:668:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:669:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:670:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd1360);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd1370); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:677:1: ruleAnd returns [EObject current=null] : ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) | ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* ) ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:680:28: ( ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) | ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:681:1: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) | ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:681:1: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) | ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* ) )
            int alt15=4;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:681:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:681:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:682:5: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEquality_in_ruleAnd1418);
                    this_Equality_0=ruleEquality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Equality_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:690:1: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==23) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:690:2: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:690:2: ()
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:691:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getAndAccess().getAndLeftAction_0_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleAnd1439); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_0_1_1());
                    	          
                    	    }
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:700:1: ( (lv_right_3_0= ruleEquality ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:701:1: (lv_right_3_0= ruleEquality )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:701:1: (lv_right_3_0= ruleEquality )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:702:3: lv_right_3_0= ruleEquality
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_0_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd1460);
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
                    	    break loop11;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:719:6: ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:719:6: ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:719:7: ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )*
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:719:7: ( ( ruleEquality )=>this_Equality_4= ruleEquality )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:719:8: ( ruleEquality )=>this_Equality_4= ruleEquality
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEquality_in_ruleAnd1498);
                    this_Equality_4=ruleEquality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Equality_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:728:2: ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==23) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:728:3: () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:728:3: ()
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:729:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getAndAccess().getAndLeftAction_1_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleAnd1520); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getAndAccess().getANDKeyword_1_1_1());
                    	          
                    	    }
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:738:1: ( (lv_right_7_0= ruleComparison ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:739:1: (lv_right_7_0= ruleComparison )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:739:1: (lv_right_7_0= ruleComparison )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:740:3: lv_right_7_0= ruleComparison
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComparison_in_ruleAnd1541);
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
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:757:6: ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:757:6: ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:757:7: ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )*
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:757:7: ( ( ruleComparison )=>this_Comparison_8= ruleComparison )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:757:8: ( ruleComparison )=>this_Comparison_8= ruleComparison
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAndAccess().getComparisonParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComparison_in_ruleAnd1579);
                    this_Comparison_8=ruleComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Comparison_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:766:2: ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==23) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:766:3: () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:766:3: ()
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:767:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getAndAccess().getAndLeftAction_2_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleAnd1601); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getAndAccess().getANDKeyword_2_1_1());
                    	          
                    	    }
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:776:1: ( (lv_right_11_0= ruleComparison ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:777:1: (lv_right_11_0= ruleComparison )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:777:1: (lv_right_11_0= ruleComparison )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:778:3: lv_right_11_0= ruleComparison
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_2_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComparison_in_ruleAnd1622);
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
                    	    break loop13;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:795:6: ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:795:6: ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:795:7: ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )*
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:795:7: ( ( ruleComparison )=>this_Comparison_12= ruleComparison )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:795:8: ( ruleComparison )=>this_Comparison_12= ruleComparison
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAndAccess().getComparisonParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComparison_in_ruleAnd1660);
                    this_Comparison_12=ruleComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Comparison_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:804:2: ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==23) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:804:3: () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:804:3: ()
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:805:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getAndAccess().getAndLeftAction_3_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleAnd1682); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getAndAccess().getANDKeyword_3_1_1());
                    	          
                    	    }
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:814:1: ( (lv_right_15_0= ruleEquality ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:815:1: (lv_right_15_0= ruleEquality )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:815:1: (lv_right_15_0= ruleEquality )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:816:3: lv_right_15_0= ruleEquality
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_3_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd1703);
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
                    	    break loop14;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:840:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:841:2: (iv_ruleEquality= ruleEquality EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:842:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality1742);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality1752); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:849:1: ruleEquality returns [EObject current=null] : ( (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) ) | ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* ) ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:852:28: ( ( (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) ) | ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:853:1: ( (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) ) | ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:853:1: ( (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) ) | ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:853:2: (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:853:2: (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:854:5: this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEqualityAccess().getFloatExprParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatExpr_in_ruleEquality1800);
                    this_FloatExpr_0=ruleFloatExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:862:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:862:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:862:2: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:863:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEqualityAccess().getEqualityLeftAction_0_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:868:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:869:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:869:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:870:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:870:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==24) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==25) ) {
                        alt16=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:871:3: lv_op_2_1= '=='
                            {
                            lv_op_2_1=(Token)match(input,24,FOLLOW_24_in_ruleEquality1829); if (state.failed) return current;
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
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:883:8: lv_op_2_2= '!='
                            {
                            lv_op_2_2=(Token)match(input,25,FOLLOW_25_in_ruleEquality1858); if (state.failed) return current;
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

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:898:2: ( (lv_right_3_0= ruleFloatExpr ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:899:1: (lv_right_3_0= ruleFloatExpr )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:899:1: (lv_right_3_0= ruleFloatExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:900:3: lv_right_3_0= ruleFloatExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualityAccess().getRightFloatExprParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFloatExpr_in_ruleEquality1895);
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:917:6: ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:917:6: ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:917:7: ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )*
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:917:7: ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:917:8: ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEqualityAccess().getStringExprParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpr_in_ruleEquality1932);
                    this_StringExpr_4=ruleStringExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringExpr_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:926:2: ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=24 && LA18_0<=25)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:926:3: () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:926:3: ()
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:927:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getEqualityAccess().getEqualityLeftAction_1_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:932:2: ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:933:1: ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:933:1: ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:934:1: (lv_op_6_1= '==' | lv_op_6_2= '!=' )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:934:1: (lv_op_6_1= '==' | lv_op_6_2= '!=' )
                    	    int alt17=2;
                    	    int LA17_0 = input.LA(1);

                    	    if ( (LA17_0==24) ) {
                    	        alt17=1;
                    	    }
                    	    else if ( (LA17_0==25) ) {
                    	        alt17=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 17, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt17) {
                    	        case 1 :
                    	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:935:3: lv_op_6_1= '=='
                    	            {
                    	            lv_op_6_1=(Token)match(input,24,FOLLOW_24_in_ruleEquality1962); if (state.failed) return current;
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
                    	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:947:8: lv_op_6_2= '!='
                    	            {
                    	            lv_op_6_2=(Token)match(input,25,FOLLOW_25_in_ruleEquality1991); if (state.failed) return current;
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

                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:962:2: ( (lv_right_7_0= ruleStringExpr ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:963:1: (lv_right_7_0= ruleStringExpr )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:963:1: (lv_right_7_0= ruleStringExpr )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:964:3: lv_right_7_0= ruleStringExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEqualityAccess().getRightStringExprParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleStringExpr_in_ruleEquality2028);
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
                    	    break loop18;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:988:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:989:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:990:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison2067);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison2077); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:997:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1000:28: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1001:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1001:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1002:5: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison2124);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PlusOrMinus_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1010:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=26 && LA21_0<=29)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1010:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1010:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1011:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1016:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1017:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1017:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1018:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1018:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 26:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt20=4;
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
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1019:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,26,FOLLOW_26_in_ruleComparison2153); if (state.failed) return current;
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
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1031:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,27,FOLLOW_27_in_ruleComparison2182); if (state.failed) return current;
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
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1043:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,28,FOLLOW_28_in_ruleComparison2211); if (state.failed) return current;
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
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1055:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,29,FOLLOW_29_in_ruleComparison2240); if (state.failed) return current;
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

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1070:2: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1071:1: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1071:1: (lv_right_3_0= rulePlusOrMinus )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1072:3: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison2277);
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
            	    break loop21;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1096:1: entryRuleswitchExpr returns [EObject current=null] : iv_ruleswitchExpr= ruleswitchExpr EOF ;
    public final EObject entryRuleswitchExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleswitchExpr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1097:2: (iv_ruleswitchExpr= ruleswitchExpr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1098:2: iv_ruleswitchExpr= ruleswitchExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchExprRule()); 
            }
            pushFollow(FOLLOW_ruleswitchExpr_in_entryRuleswitchExpr2315);
            iv_ruleswitchExpr=ruleswitchExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleswitchExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleswitchExpr2325); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1105:1: ruleswitchExpr returns [EObject current=null] : ( (lv_value_0_0= 'switch' ) ) ;
    public final EObject ruleswitchExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1108:28: ( ( (lv_value_0_0= 'switch' ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1109:1: ( (lv_value_0_0= 'switch' ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1109:1: ( (lv_value_0_0= 'switch' ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1110:1: (lv_value_0_0= 'switch' )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1110:1: (lv_value_0_0= 'switch' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1111:3: lv_value_0_0= 'switch'
            {
            lv_value_0_0=(Token)match(input,30,FOLLOW_30_in_ruleswitchExpr2367); if (state.failed) return current;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1132:1: entryRuleMutationExpr returns [EObject current=null] : iv_ruleMutationExpr= ruleMutationExpr EOF ;
    public final EObject entryRuleMutationExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMutationExpr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1133:2: (iv_ruleMutationExpr= ruleMutationExpr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1134:2: iv_ruleMutationExpr= ruleMutationExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMutationExprRule()); 
            }
            pushFollow(FOLLOW_ruleMutationExpr_in_entryRuleMutationExpr2415);
            iv_ruleMutationExpr=ruleMutationExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMutationExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMutationExpr2425); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1141:1: ruleMutationExpr returns [EObject current=null] : ( ( ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) ) ) this_FLOAT_1= RULE_FLOAT ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1144:28: ( ( ( ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) ) ) this_FLOAT_1= RULE_FLOAT ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1145:1: ( ( ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) ) ) this_FLOAT_1= RULE_FLOAT )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1145:1: ( ( ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) ) ) this_FLOAT_1= RULE_FLOAT )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1145:2: ( ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) ) ) this_FLOAT_1= RULE_FLOAT
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1145:2: ( ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1146:1: ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1146:1: ( (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1147:1: (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1147:1: (lv_value_0_1= '+' | lv_value_0_2= '-' | lv_value_0_3= '*' | lv_value_0_4= '/' | lv_value_0_5= '^' )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt22=1;
                }
                break;
            case 32:
                {
                alt22=2;
                }
                break;
            case 33:
                {
                alt22=3;
                }
                break;
            case 34:
                {
                alt22=4;
                }
                break;
            case 35:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1148:3: lv_value_0_1= '+'
                    {
                    lv_value_0_1=(Token)match(input,31,FOLLOW_31_in_ruleMutationExpr2470); if (state.failed) return current;
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1160:8: lv_value_0_2= '-'
                    {
                    lv_value_0_2=(Token)match(input,32,FOLLOW_32_in_ruleMutationExpr2499); if (state.failed) return current;
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1172:8: lv_value_0_3= '*'
                    {
                    lv_value_0_3=(Token)match(input,33,FOLLOW_33_in_ruleMutationExpr2528); if (state.failed) return current;
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1184:8: lv_value_0_4= '/'
                    {
                    lv_value_0_4=(Token)match(input,34,FOLLOW_34_in_ruleMutationExpr2557); if (state.failed) return current;
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1196:8: lv_value_0_5= '^'
                    {
                    lv_value_0_5=(Token)match(input,35,FOLLOW_35_in_ruleMutationExpr2586); if (state.failed) return current;
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

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMutationExpr2613); if (state.failed) return current;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1223:1: entryRuleFloatExpr returns [EObject current=null] : iv_ruleFloatExpr= ruleFloatExpr EOF ;
    public final EObject entryRuleFloatExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatExpr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1224:2: (iv_ruleFloatExpr= ruleFloatExpr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1225:2: iv_ruleFloatExpr= ruleFloatExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatExprRule()); 
            }
            pushFollow(FOLLOW_ruleFloatExpr_in_entryRuleFloatExpr2648);
            iv_ruleFloatExpr=ruleFloatExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatExpr2658); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1232:1: ruleFloatExpr returns [EObject current=null] : ( ( ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueCalculated_1_0= rulePlusOrMinus ) ) | ( ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue ) ) ) ;
    public final EObject ruleFloatExpr() throws RecognitionException {
        EObject current = null;

        Token lv_valueDirect_0_0=null;
        EObject lv_valueCalculated_1_0 = null;

        EObject lv_valueOfFluent_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1235:28: ( ( ( ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueCalculated_1_0= rulePlusOrMinus ) ) | ( ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1236:1: ( ( ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueCalculated_1_0= rulePlusOrMinus ) ) | ( ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1236:1: ( ( ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueCalculated_1_0= rulePlusOrMinus ) ) | ( ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue ) ) )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred7_InternalEce()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==RULE_ID) ) {
                int LA23_2 = input.LA(2);

                if ( (true) ) {
                    alt23=2;
                }
                else if ( (synpred8_InternalEce()) ) {
                    alt23=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1236:2: ( ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1236:2: ( ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1236:3: ( ( RULE_INT ) )=> (lv_valueDirect_0_0= RULE_INT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1242:1: (lv_valueDirect_0_0= RULE_INT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1243:3: lv_valueDirect_0_0= RULE_INT
                    {
                    lv_valueDirect_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloatExpr2711); if (state.failed) return current;
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1260:6: ( (lv_valueCalculated_1_0= rulePlusOrMinus ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1260:6: ( (lv_valueCalculated_1_0= rulePlusOrMinus ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1261:1: (lv_valueCalculated_1_0= rulePlusOrMinus )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1261:1: (lv_valueCalculated_1_0= rulePlusOrMinus )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1262:3: lv_valueCalculated_1_0= rulePlusOrMinus
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFloatExprAccess().getValueCalculatedPlusOrMinusParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleFloatExpr2743);
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1279:6: ( ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1279:6: ( ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1279:7: ( ( ruleFluentWhoseValue ) )=> (lv_valueOfFluent_2_0= ruleFluentWhoseValue )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1284:1: (lv_valueOfFluent_2_0= ruleFluentWhoseValue )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1285:3: lv_valueOfFluent_2_0= ruleFluentWhoseValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFloatExprAccess().getValueOfFluentFluentWhoseValueParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFluentWhoseValue_in_ruleFloatExpr2780);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1309:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1310:2: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1311:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2816);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus2826); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1318:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1321:28: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1322:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1322:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1323:5: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2873);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MulOrDiv_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1331:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=31 && LA25_0<=32)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1331:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1331:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==31) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==32) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1331:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1331:3: ( () otherlv_2= '+' )
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1331:4: () otherlv_2= '+'
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1331:4: ()
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1332:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulePlusOrMinus2896); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1342:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1342:6: ( () otherlv_4= '-' )
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1342:7: () otherlv_4= '-'
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1342:7: ()
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1343:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,32,FOLLOW_32_in_rulePlusOrMinus2925); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1352:3: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1353:1: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1353:1: (lv_right_5_0= ruleMulOrDiv )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1354:3: lv_right_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2948);
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1378:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1379:2: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1380:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2986);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv2996); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1387:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1390:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1391:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1391:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1392:5: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv3043);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Primary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1400:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=33 && LA27_0<=36)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1400:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1400:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1401:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1406:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1407:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1407:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1408:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1408:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
            	    int alt26=4;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt26=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1409:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,33,FOLLOW_33_in_ruleMulOrDiv3072); if (state.failed) return current;
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
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1421:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,34,FOLLOW_34_in_ruleMulOrDiv3101); if (state.failed) return current;
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
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1433:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,36,FOLLOW_36_in_ruleMulOrDiv3130); if (state.failed) return current;
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
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1445:8: lv_op_2_4= '^'
            	            {
            	            lv_op_2_4=(Token)match(input,35,FOLLOW_35_in_ruleMulOrDiv3159); if (state.failed) return current;
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

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1460:2: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1461:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1461:1: (lv_right_3_0= rulePrimary )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1462:3: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv3196);
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
            	    break loop27;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1486:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1487:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1488:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary3234);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary3244); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1495:1: rulePrimary returns [EObject current=null] : ( ( (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueOfFluent_1_0= ruleFluentWhoseValue ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_valueDirect_0_0=null;
        EObject lv_valueOfFluent_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1498:28: ( ( ( (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueOfFluent_1_0= ruleFluentWhoseValue ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1499:1: ( ( (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueOfFluent_1_0= ruleFluentWhoseValue ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1499:1: ( ( (lv_valueDirect_0_0= RULE_INT ) ) | ( (lv_valueOfFluent_1_0= ruleFluentWhoseValue ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1499:2: ( (lv_valueDirect_0_0= RULE_INT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1499:2: ( (lv_valueDirect_0_0= RULE_INT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1500:1: (lv_valueDirect_0_0= RULE_INT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1500:1: (lv_valueDirect_0_0= RULE_INT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1501:3: lv_valueDirect_0_0= RULE_INT
                    {
                    lv_valueDirect_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrimary3286); if (state.failed) return current;
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1518:6: ( (lv_valueOfFluent_1_0= ruleFluentWhoseValue ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1518:6: ( (lv_valueOfFluent_1_0= ruleFluentWhoseValue ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1519:1: (lv_valueOfFluent_1_0= ruleFluentWhoseValue )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1519:1: (lv_valueOfFluent_1_0= ruleFluentWhoseValue )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1520:3: lv_valueOfFluent_1_0= ruleFluentWhoseValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryAccess().getValueOfFluentFluentWhoseValueParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFluentWhoseValue_in_rulePrimary3318);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1544:1: entryRuleFluentWhoseValue returns [EObject current=null] : iv_ruleFluentWhoseValue= ruleFluentWhoseValue EOF ;
    public final EObject entryRuleFluentWhoseValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFluentWhoseValue = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1545:2: (iv_ruleFluentWhoseValue= ruleFluentWhoseValue EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1546:2: iv_ruleFluentWhoseValue= ruleFluentWhoseValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFluentWhoseValueRule()); 
            }
            pushFollow(FOLLOW_ruleFluentWhoseValue_in_entryRuleFluentWhoseValue3354);
            iv_ruleFluentWhoseValue=ruleFluentWhoseValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFluentWhoseValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluentWhoseValue3364); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1553:1: ruleFluentWhoseValue returns [EObject current=null] : ( (lv_fluentWhoseValueName_0_0= RULE_ID ) ) ;
    public final EObject ruleFluentWhoseValue() throws RecognitionException {
        EObject current = null;

        Token lv_fluentWhoseValueName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1556:28: ( ( (lv_fluentWhoseValueName_0_0= RULE_ID ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1557:1: ( (lv_fluentWhoseValueName_0_0= RULE_ID ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1557:1: ( (lv_fluentWhoseValueName_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1558:1: (lv_fluentWhoseValueName_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1558:1: (lv_fluentWhoseValueName_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1559:3: lv_fluentWhoseValueName_0_0= RULE_ID
            {
            lv_fluentWhoseValueName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFluentWhoseValue3405); if (state.failed) return current;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1583:1: entryRuleStr returns [EObject current=null] : iv_ruleStr= ruleStr EOF ;
    public final EObject entryRuleStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1584:2: (iv_ruleStr= ruleStr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1585:2: iv_ruleStr= ruleStr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStrRule()); 
            }
            pushFollow(FOLLOW_ruleStr_in_entryRuleStr3445);
            iv_ruleStr=ruleStr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStr3455); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1592:1: ruleStr returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1595:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1596:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1596:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1597:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1597:1: (lv_value_0_0= RULE_STRING )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1598:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStr3496); if (state.failed) return current;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1622:1: entryRuleInRule returns [EObject current=null] : iv_ruleInRule= ruleInRule EOF ;
    public final EObject entryRuleInRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1623:2: (iv_ruleInRule= ruleInRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1624:2: iv_ruleInRule= ruleInRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInRuleRule()); 
            }
            pushFollow(FOLLOW_ruleInRule_in_entryRuleInRule3536);
            iv_ruleInRule=ruleInRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInRule3546); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1631:1: ruleInRule returns [EObject current=null] : ( ( (lv_time_0_0= RULE_INT ) ) | ( (lv_currentTime_1_0= 'now' ) ) ) ;
    public final EObject ruleInRule() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;
        Token lv_currentTime_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1634:28: ( ( ( (lv_time_0_0= RULE_INT ) ) | ( (lv_currentTime_1_0= 'now' ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1635:1: ( ( (lv_time_0_0= RULE_INT ) ) | ( (lv_currentTime_1_0= 'now' ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1635:1: ( ( (lv_time_0_0= RULE_INT ) ) | ( (lv_currentTime_1_0= 'now' ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            else if ( (LA29_0==37) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1635:2: ( (lv_time_0_0= RULE_INT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1635:2: ( (lv_time_0_0= RULE_INT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1636:1: (lv_time_0_0= RULE_INT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1636:1: (lv_time_0_0= RULE_INT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1637:3: lv_time_0_0= RULE_INT
                    {
                    lv_time_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInRule3588); if (state.failed) return current;
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1654:6: ( (lv_currentTime_1_0= 'now' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1654:6: ( (lv_currentTime_1_0= 'now' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1655:1: (lv_currentTime_1_0= 'now' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1655:1: (lv_currentTime_1_0= 'now' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1656:3: lv_currentTime_1_0= 'now'
                    {
                    lv_currentTime_1_0=(Token)match(input,37,FOLLOW_37_in_ruleInRule3617); if (state.failed) return current;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1677:1: entryRuleConditionRule returns [EObject current=null] : iv_ruleConditionRule= ruleConditionRule EOF ;
    public final EObject entryRuleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1678:2: (iv_ruleConditionRule= ruleConditionRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1679:2: iv_ruleConditionRule= ruleConditionRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRuleRule()); 
            }
            pushFollow(FOLLOW_ruleConditionRule_in_entryRuleConditionRule3666);
            iv_ruleConditionRule=ruleConditionRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionRule3676); if (state.failed) return current;

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1686:1: ruleConditionRule returns [EObject current=null] : ( (lv_condition_0_0= ruleBoolExpr ) ) ;
    public final EObject ruleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1689:28: ( ( (lv_condition_0_0= ruleBoolExpr ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1690:1: ( (lv_condition_0_0= ruleBoolExpr ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1690:1: ( (lv_condition_0_0= ruleBoolExpr ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1691:1: (lv_condition_0_0= ruleBoolExpr )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1691:1: (lv_condition_0_0= ruleBoolExpr )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1692:3: lv_condition_0_0= ruleBoolExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionRuleAccess().getConditionBoolExprParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBoolExpr_in_ruleConditionRule3721);
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


    // $ANTLR start "entryRuleExpFluent"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1716:1: entryRuleExpFluent returns [EObject current=null] : iv_ruleExpFluent= ruleExpFluent EOF ;
    public final EObject entryRuleExpFluent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpFluent = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1717:2: (iv_ruleExpFluent= ruleExpFluent EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1718:2: iv_ruleExpFluent= ruleExpFluent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpFluentRule()); 
            }
            pushFollow(FOLLOW_ruleExpFluent_in_entryRuleExpFluent3756);
            iv_ruleExpFluent=ruleExpFluent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpFluent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpFluent3766); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpFluent"


    // $ANTLR start "ruleExpFluent"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1725:1: ruleExpFluent returns [EObject current=null] : ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? ) ;
    public final EObject ruleExpFluent() throws RecognitionException {
        EObject current = null;

        Token lv_fluentName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_valuePart_2_0 = null;

        EObject lv_timePart_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1728:28: ( ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1729:1: ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1729:1: ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1729:2: ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )?
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1729:2: ( (lv_fluentName_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1730:1: (lv_fluentName_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1730:1: (lv_fluentName_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1731:3: lv_fluentName_0_0= RULE_ID
            {
            lv_fluentName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpFluent3808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_fluentName_0_0, grammarAccess.getExpFluentAccess().getFluentNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExpFluentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"fluentName",
                      		lv_fluentName_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1747:2: (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1747:4: otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) )
            {
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleExpFluent3826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpFluentAccess().getToKeyword_1_0());
                  
            }
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1751:1: ( (lv_valuePart_2_0= ruleToRule ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1752:1: (lv_valuePart_2_0= ruleToRule )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1752:1: (lv_valuePart_2_0= ruleToRule )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1753:3: lv_valuePart_2_0= ruleToRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleToRule_in_ruleExpFluent3847);
            lv_valuePart_2_0=ruleToRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpFluentRule());
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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1769:3: (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1769:5: otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleExpFluent3861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExpFluentAccess().getInKeyword_2_0());
                          
                    }
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1773:1: ( (lv_timePart_4_0= ruleInRule ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1774:1: (lv_timePart_4_0= ruleInRule )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1774:1: (lv_timePart_4_0= ruleInRule )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1775:3: lv_timePart_4_0= ruleInRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInRule_in_ruleExpFluent3882);
                    lv_timePart_4_0=ruleInRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpFluentRule());
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
    // $ANTLR end "ruleExpFluent"

    // $ANTLR start synpred1_InternalEce
    public final void synpred1_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:417:7: ( ( ruleBoolExpr ) )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:418:1: ( ruleBoolExpr )
        {
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:418:1: ( ruleBoolExpr )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:419:1: ruleBoolExpr
        {
        pushFollow(FOLLOW_ruleBoolExpr_in_synpred1_InternalEce790);
        ruleBoolExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalEce

    // $ANTLR start synpred2_InternalEce
    public final void synpred2_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:459:7: ( ( ( ruleFloatExpr ) ) )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:459:8: ( ( ruleFloatExpr ) )
        {
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:459:8: ( ( ruleFloatExpr ) )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:460:1: ( ruleFloatExpr )
        {
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:460:1: ( ruleFloatExpr )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:461:1: ruleFloatExpr
        {
        pushFollow(FOLLOW_ruleFloatExpr_in_synpred2_InternalEce855);
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
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:719:8: ( ruleEquality )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:719:10: ruleEquality
        {
        pushFollow(FOLLOW_ruleEquality_in_synpred3_InternalEce1482);
        ruleEquality();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalEce

    // $ANTLR start synpred4_InternalEce
    public final void synpred4_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:757:8: ( ruleComparison )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:757:10: ruleComparison
        {
        pushFollow(FOLLOW_ruleComparison_in_synpred4_InternalEce1563);
        ruleComparison();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalEce

    // $ANTLR start synpred5_InternalEce
    public final void synpred5_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:795:8: ( ruleComparison )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:795:10: ruleComparison
        {
        pushFollow(FOLLOW_ruleComparison_in_synpred5_InternalEce1644);
        ruleComparison();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalEce

    // $ANTLR start synpred6_InternalEce
    public final void synpred6_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:917:8: ( ruleStringExpr )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:917:10: ruleStringExpr
        {
        pushFollow(FOLLOW_ruleStringExpr_in_synpred6_InternalEce1916);
        ruleStringExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalEce

    // $ANTLR start synpred7_InternalEce
    public final void synpred7_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1236:3: ( ( RULE_INT ) )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1237:1: ( RULE_INT )
        {
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1237:1: ( RULE_INT )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1238:1: RULE_INT
        {
        match(input,RULE_INT,FOLLOW_RULE_INT_in_synpred7_InternalEce2697); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalEce

    // $ANTLR start synpred8_InternalEce
    public final void synpred8_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1279:7: ( ( ruleFluentWhoseValue ) )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1280:1: ( ruleFluentWhoseValue )
        {
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1280:1: ( ruleFluentWhoseValue )
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1281:1: ruleFluentWhoseValue
        {
        pushFollow(FOLLOW_ruleFluentWhoseValue_in_synpred8_InternalEce2763);
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


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\4\2\0\2\uffff\1\0\4\uffff";
    static final String DFA7_maxS =
        "\1\43\2\0\2\uffff\1\0\4\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\2\2\1\uffff\1\3\1\5\1\1\1\4";
    static final String DFA7_specialS =
        "\1\3\1\1\1\0\2\uffff\1\2\4\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\uffff\1\5\1\1\14\uffff\1\3\1\4\10\uffff\1\6\5\7",
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "398:1: ( ( (lv_expression_0_0= ruleStringExpr ) ) | ( ( ( ruleBoolExpr ) )=> (lv_expression_1_0= ruleBoolExpr ) ) | ( (lv_expression_2_0= ruleswitchExpr ) ) | ( ( ( ( ruleFloatExpr ) ) )=> ( (lv_expression_3_0= ruleFloatExpr ) ) ) | ( (lv_expression_4_0= ruleMutationExpr ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 8;}

                        else if ( (synpred1_InternalEce()) ) {s = 4;}

                        else if ( (synpred2_InternalEce()) ) {s = 9;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 8;}

                        else if ( (synpred1_InternalEce()) ) {s = 4;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalEce()) ) {s = 4;}

                        else if ( (synpred2_InternalEce()) ) {s = 9;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_0 = input.LA(1);

                         
                        int index7_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_0==RULE_STRING) ) {s = 1;}

                        else if ( (LA7_0==RULE_ID) ) {s = 2;}

                        else if ( (LA7_0==20) && (synpred1_InternalEce())) {s = 3;}

                        else if ( (LA7_0==21) && (synpred1_InternalEce())) {s = 4;}

                        else if ( (LA7_0==RULE_INT) ) {s = 5;}

                        else if ( (LA7_0==30) ) {s = 6;}

                        else if ( ((LA7_0>=31 && LA7_0<=35)) ) {s = 7;}

                         
                        input.seek(index7_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\34\uffff";
    static final String DFA15_eofS =
        "\34\uffff";
    static final String DFA15_minS =
        "\1\4\1\30\2\0\10\4\4\uffff\4\30\2\0\4\4\2\30";
    static final String DFA15_maxS =
        "\1\7\1\44\2\0\10\6\4\uffff\4\44\2\0\4\6\2\44";
    static final String DFA15_acceptS =
        "\14\uffff\1\3\1\4\1\1\1\2\14\uffff";
    static final String DFA15_specialS =
        "\1\uffff\1\4\1\1\1\2\20\uffff\1\0\1\3\6\uffff}>";
    static final String[] DFA15_transitionS = {
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "681:1: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) | ( ( ( ruleEquality )=>this_Equality_4= ruleEquality ) ( () otherlv_6= 'AND' ( (lv_right_7_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_8= ruleComparison ) ( () otherlv_10= 'AND' ( (lv_right_11_0= ruleComparison ) ) )* ) | ( ( ( ruleComparison )=>this_Comparison_12= ruleComparison ) ( () otherlv_14= 'AND' ( (lv_right_15_0= ruleEquality ) ) )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_20 = input.LA(1);

                         
                        int index15_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 14;}

                        else if ( (synpred3_InternalEce()) ) {s = 15;}

                         
                        input.seek(index15_20);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 14;}

                        else if ( (synpred3_InternalEce()) ) {s = 15;}

                        else if ( (synpred4_InternalEce()) ) {s = 12;}

                        else if ( (synpred5_InternalEce()) ) {s = 13;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 14;}

                        else if ( (synpred3_InternalEce()) ) {s = 15;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_21 = input.LA(1);

                         
                        int index15_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 14;}

                        else if ( (synpred3_InternalEce()) ) {s = 15;}

                         
                        input.seek(index15_21);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_1==33) ) {s = 4;}

                        else if ( (LA15_1==34) ) {s = 5;}

                        else if ( (LA15_1==36) ) {s = 6;}

                        else if ( (LA15_1==35) ) {s = 7;}

                        else if ( (LA15_1==31) ) {s = 8;}

                        else if ( (LA15_1==32) ) {s = 9;}

                        else if ( (LA15_1==24) ) {s = 10;}

                        else if ( (LA15_1==25) ) {s = 11;}

                        else if ( (synpred4_InternalEce()) ) {s = 12;}

                        else if ( (synpred5_InternalEce()) ) {s = 13;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\20\uffff";
    static final String DFA19_eofS =
        "\2\uffff\1\15\15\uffff";
    static final String DFA19_minS =
        "\1\4\1\uffff\1\16\1\uffff\2\4\10\uffff\1\0\1\uffff";
    static final String DFA19_maxS =
        "\1\7\1\uffff\1\44\1\uffff\2\7\10\uffff\1\0\1\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\2\uffff\10\2\1\uffff\1\2";
    static final String DFA19_specialS =
        "\1\1\1\uffff\1\0\1\uffff\1\2\1\3\10\uffff\1\4\1\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\1\uffff\1\1\1\3",
            "",
            "\1\12\1\13\1\14\1\uffff\1\10\1\11\2\uffff\1\7\1\6\1\4\1\5"+
            "\5\uffff\6\1",
            "",
            "\1\16\1\uffff\1\1\1\17",
            "\1\16\1\uffff\1\1\1\17",
            "",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "853:1: ( (this_FloatExpr_0= ruleFloatExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleFloatExpr ) ) ) ) | ( ( ( ruleStringExpr )=>this_StringExpr_4= ruleStringExpr ) ( () ( ( (lv_op_6_1= '==' | lv_op_6_2= '!=' ) ) ) ( (lv_right_7_0= ruleStringExpr ) ) )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_2==24) ) {s = 4;}

                        else if ( (LA19_2==25) ) {s = 5;}

                        else if ( (LA19_2==23) && (synpred6_InternalEce())) {s = 6;}

                        else if ( (LA19_2==22) && (synpred6_InternalEce())) {s = 7;}

                        else if ( (LA19_2==18) && (synpred6_InternalEce())) {s = 8;}

                        else if ( (LA19_2==19) && (synpred6_InternalEce())) {s = 9;}

                        else if ( (LA19_2==14) && (synpred6_InternalEce())) {s = 10;}

                        else if ( (LA19_2==15) && (synpred6_InternalEce())) {s = 11;}

                        else if ( (LA19_2==16) && (synpred6_InternalEce())) {s = 12;}

                        else if ( (LA19_2==EOF) && (synpred6_InternalEce())) {s = 13;}

                        else if ( ((LA19_2>=31 && LA19_2<=36)) ) {s = 1;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_0==RULE_INT) ) {s = 1;}

                        else if ( (LA19_0==RULE_ID) ) {s = 2;}

                        else if ( (LA19_0==RULE_STRING) && (synpred6_InternalEce())) {s = 3;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_4 = input.LA(1);

                         
                        int index19_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_4==RULE_INT) ) {s = 1;}

                        else if ( (LA19_4==RULE_ID) ) {s = 14;}

                        else if ( (LA19_4==RULE_STRING) && (synpred6_InternalEce())) {s = 15;}

                         
                        input.seek(index19_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_5==RULE_STRING) && (synpred6_InternalEce())) {s = 15;}

                        else if ( (LA19_5==RULE_ID) ) {s = 14;}

                        else if ( (LA19_5==RULE_INT) ) {s = 1;}

                         
                        input.seek(index19_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_14 = input.LA(1);

                         
                        int index19_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred6_InternalEce()) ) {s = 15;}

                         
                        input.seek(index19_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
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
    public static final BitSet FOLLOW_ruleFluent_in_ruleStatement267 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14_in_ruleStatement280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFluent_in_ruleStatement301 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_15_in_ruleStatement316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExpFluent_in_ruleStatement337 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleStatement350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExpFluent_in_ruleStatement371 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleStatement387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFluent566 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFluent584 = new BitSet(new long[]{0x0000000FC03000D0L});
    public static final BitSet FOLLOW_ruleToRule_in_ruleFluent605 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleFluent619 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_ruleInRule_in_ruleFluent640 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleFluent655 = new BitSet(new long[]{0x00000000003000D0L});
    public static final BitSet FOLLOW_ruleConditionRule_in_ruleFluent676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_entryRuleToRule714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToRule724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpr_in_ruleToRule770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleToRule807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitchExpr_in_ruleToRule834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_ruleToRule874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMutationExpr_in_ruleToRule902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpr_in_entryRuleStringExpr938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpr948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStr_in_ruleStringExpr995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_ruleStringExpr1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr1057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpr1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBoolExpr1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBoolExpr1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleBoolExpr1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1280 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleOr1301 = new BitSet(new long[]{0x00000000003000D0L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1322 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1418 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleAnd1439 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1460 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1498 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleAnd1520 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleAnd1541 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleAnd1579 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleAnd1601 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleAnd1622 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleAnd1660 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleAnd1682 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1703 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_ruleEquality1800 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleEquality1829 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_25_in_ruleEquality1858 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_ruleEquality1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpr_in_ruleEquality1932 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_ruleEquality1962 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_25_in_ruleEquality1991 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleStringExpr_in_ruleEquality2028 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison2067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison2124 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_26_in_ruleComparison2153 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_27_in_ruleComparison2182 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_28_in_ruleComparison2211 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_29_in_ruleComparison2240 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison2277 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_ruleswitchExpr_in_entryRuleswitchExpr2315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleswitchExpr2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleswitchExpr2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMutationExpr_in_entryRuleMutationExpr2415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMutationExpr2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMutationExpr2470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32_in_ruleMutationExpr2499 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_33_in_ruleMutationExpr2528 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_34_in_ruleMutationExpr2557 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_35_in_ruleMutationExpr2586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMutationExpr2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_entryRuleFloatExpr2648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatExpr2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloatExpr2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleFloatExpr2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_ruleFloatExpr2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2873 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_rulePlusOrMinus2896 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_32_in_rulePlusOrMinus2925 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2948 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv3043 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_33_in_ruleMulOrDiv3072 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_34_in_ruleMulOrDiv3101 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_36_in_ruleMulOrDiv3130 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_35_in_ruleMulOrDiv3159 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv3196 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary3234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrimary3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_rulePrimary3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_entryRuleFluentWhoseValue3354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluentWhoseValue3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFluentWhoseValue3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStr_in_entryRuleStr3445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStr3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStr3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_entryRuleInRule3536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInRule3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInRule3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleInRule3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_entryRuleConditionRule3666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionRule3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleConditionRule3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpFluent_in_entryRuleExpFluent3756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpFluent3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpFluent3808 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExpFluent3826 = new BitSet(new long[]{0x0000000FC03000D0L});
    public static final BitSet FOLLOW_ruleToRule_in_ruleExpFluent3847 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleExpFluent3861 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_ruleInRule_in_ruleExpFluent3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_synpred1_InternalEce790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_synpred2_InternalEce855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_synpred3_InternalEce1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_synpred4_InternalEce1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_synpred5_InternalEce1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpr_in_synpred6_InternalEce1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_synpred7_InternalEce2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_synpred8_InternalEce2763 = new BitSet(new long[]{0x0000000000000002L});

}