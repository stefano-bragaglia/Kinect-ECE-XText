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

@SuppressWarnings("all")
public class InternalEceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'on'", "'('", "','", "')'", "'set'", "'dafare'", "'to'", "'in'", "'if'", "'OR'", "'AND'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'true'", "'false'"
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
    public static final int RULE_FLOAT=6;
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
    public static final int RULE_INT=5;
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
             newCompositeNode(grammarAccess.getDroolsModelRule()); 
            pushFollow(FOLLOW_ruleDroolsModel_in_entryRuleDroolsModel75);
            iv_ruleDroolsModel=ruleDroolsModel();

            state._fsp--;

             current =iv_ruleDroolsModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDroolsModel85); 

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
            	     
            	    	        newCompositeNode(grammarAccess.getDroolsModelAccess().getStatementsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleDroolsModel130);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement166);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement176); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:115:1: ruleStatement returns [EObject current=null] : (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) ( (lv_contextsList_2_0= ruleContextsList ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_event_1_0 = null;

        EObject lv_contextsList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:118:28: ( (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) ( (lv_contextsList_2_0= ruleContextsList ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:119:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) ( (lv_contextsList_2_0= ruleContextsList ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:119:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) ( (lv_contextsList_2_0= ruleContextsList ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:119:3: otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) ( (lv_contextsList_2_0= ruleContextsList ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleStatement213); 

                	newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getOnKeyword_0());
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:123:1: ( (lv_event_1_0= ruleEvent ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:124:1: (lv_event_1_0= ruleEvent )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:124:1: (lv_event_1_0= ruleEvent )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:125:3: lv_event_1_0= ruleEvent
            {
             
            	        newCompositeNode(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEvent_in_ruleStatement234);
            lv_event_1_0=ruleEvent();

            state._fsp--;


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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:141:2: ( (lv_contextsList_2_0= ruleContextsList ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:142:1: (lv_contextsList_2_0= ruleContextsList )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:142:1: (lv_contextsList_2_0= ruleContextsList )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:143:3: lv_contextsList_2_0= ruleContextsList
            {
             
            	        newCompositeNode(grammarAccess.getStatementAccess().getContextsListContextsListParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleContextsList_in_ruleStatement255);
            lv_contextsList_2_0=ruleContextsList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	        }
                   		set(
                   			current, 
                   			"contextsList",
                    		lv_contextsList_2_0, 
                    		"ContextsList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:167:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:168:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:169:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent291);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent301); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:176:1: ruleEvent returns [EObject current=null] : ( ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_eventName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_2_0 = null;

        EObject lv_param_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:179:28: ( ( ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )? ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:180:1: ( ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )? )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:180:1: ( ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )? )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:180:2: ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )?
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:180:2: ( (lv_eventName_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:181:1: (lv_eventName_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:181:1: (lv_eventName_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:182:3: lv_eventName_0_0= RULE_ID
            {
            lv_eventName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent343); 

            			newLeafNode(lv_eventName_0_0, grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0()); 
            		

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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:198:2: (otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:198:4: otherlv_1= '(' ( (lv_param_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEvent361); 

                        	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:202:1: ( (lv_param_2_0= ruleEventFeature ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:203:1: (lv_param_2_0= ruleEventFeature )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:203:1: (lv_param_2_0= ruleEventFeature )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:204:3: lv_param_2_0= ruleEventFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getParamEventFeatureParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEventFeature_in_ruleEvent382);
                    lv_param_2_0=ruleEventFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"param",
                            		lv_param_2_0, 
                            		"EventFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:220:2: (otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:220:4: otherlv_3= ',' ( (lv_param_4_0= ruleEventFeature ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEvent395); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:224:1: ( (lv_param_4_0= ruleEventFeature ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:225:1: (lv_param_4_0= ruleEventFeature )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:225:1: (lv_param_4_0= ruleEventFeature )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:226:3: lv_param_4_0= ruleEventFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getParamEventFeatureParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEventFeature_in_ruleEvent416);
                    	    lv_param_4_0=ruleEventFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"param",
                    	            		lv_param_4_0, 
                    	            		"EventFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleEvent430); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getRightParenthesisKeyword_1_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleEventFeature"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:254:1: entryRuleEventFeature returns [EObject current=null] : iv_ruleEventFeature= ruleEventFeature EOF ;
    public final EObject entryRuleEventFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventFeature = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:255:2: (iv_ruleEventFeature= ruleEventFeature EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:256:2: iv_ruleEventFeature= ruleEventFeature EOF
            {
             newCompositeNode(grammarAccess.getEventFeatureRule()); 
            pushFollow(FOLLOW_ruleEventFeature_in_entryRuleEventFeature468);
            iv_ruleEventFeature=ruleEventFeature();

            state._fsp--;

             current =iv_ruleEventFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventFeature478); 

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
    // $ANTLR end "entryRuleEventFeature"


    // $ANTLR start "ruleEventFeature"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:263:1: ruleEventFeature returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEventFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:266:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:267:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:267:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:268:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:268:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:269:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventFeature519); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventFeature"


    // $ANTLR start "entryRuleContextsList"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:293:1: entryRuleContextsList returns [EObject current=null] : iv_ruleContextsList= ruleContextsList EOF ;
    public final EObject entryRuleContextsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextsList = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:294:2: (iv_ruleContextsList= ruleContextsList EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:295:2: iv_ruleContextsList= ruleContextsList EOF
            {
             newCompositeNode(grammarAccess.getContextsListRule()); 
            pushFollow(FOLLOW_ruleContextsList_in_entryRuleContextsList559);
            iv_ruleContextsList=ruleContextsList();

            state._fsp--;

             current =iv_ruleContextsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextsList569); 

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
    // $ANTLR end "entryRuleContextsList"


    // $ANTLR start "ruleContextsList"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:302:1: ruleContextsList returns [EObject current=null] : ( ( (lv_ecContextsList_0_0= ruleEcContextsList ) ) (otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) ) )* ) ;
    public final EObject ruleContextsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ecContextsList_0_0 = null;

        EObject lv_expContextsList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:305:28: ( ( ( (lv_ecContextsList_0_0= ruleEcContextsList ) ) (otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:306:1: ( ( (lv_ecContextsList_0_0= ruleEcContextsList ) ) (otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:306:1: ( ( (lv_ecContextsList_0_0= ruleEcContextsList ) ) (otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:306:2: ( (lv_ecContextsList_0_0= ruleEcContextsList ) ) (otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) ) )*
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:306:2: ( (lv_ecContextsList_0_0= ruleEcContextsList ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:307:1: (lv_ecContextsList_0_0= ruleEcContextsList )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:307:1: (lv_ecContextsList_0_0= ruleEcContextsList )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:308:3: lv_ecContextsList_0_0= ruleEcContextsList
            {
             
            	        newCompositeNode(grammarAccess.getContextsListAccess().getEcContextsListEcContextsListParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEcContextsList_in_ruleContextsList615);
            lv_ecContextsList_0_0=ruleEcContextsList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextsListRule());
            	        }
                   		set(
                   			current, 
                   			"ecContextsList",
                    		lv_ecContextsList_0_0, 
                    		"EcContextsList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:324:2: (otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:324:4: otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleContextsList628); 

            	        	newLeafNode(otherlv_1, grammarAccess.getContextsListAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:328:1: ( (lv_expContextsList_2_0= ruleExpContextsList ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:329:1: (lv_expContextsList_2_0= ruleExpContextsList )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:329:1: (lv_expContextsList_2_0= ruleExpContextsList )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:330:3: lv_expContextsList_2_0= ruleExpContextsList
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContextsListAccess().getExpContextsListExpContextsListParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpContextsList_in_ruleContextsList649);
            	    lv_expContextsList_2_0=ruleExpContextsList();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContextsListRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"expContextsList",
            	            		lv_expContextsList_2_0, 
            	            		"ExpContextsList");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextsList"


    // $ANTLR start "entryRuleEcContextsList"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:354:1: entryRuleEcContextsList returns [EObject current=null] : iv_ruleEcContextsList= ruleEcContextsList EOF ;
    public final EObject entryRuleEcContextsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEcContextsList = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:355:2: (iv_ruleEcContextsList= ruleEcContextsList EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:356:2: iv_ruleEcContextsList= ruleEcContextsList EOF
            {
             newCompositeNode(grammarAccess.getEcContextsListRule()); 
            pushFollow(FOLLOW_ruleEcContextsList_in_entryRuleEcContextsList687);
            iv_ruleEcContextsList=ruleEcContextsList();

            state._fsp--;

             current =iv_ruleEcContextsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEcContextsList697); 

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
    // $ANTLR end "entryRuleEcContextsList"


    // $ANTLR start "ruleEcContextsList"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:363:1: ruleEcContextsList returns [EObject current=null] : ( ( (lv_ecContexts_0_0= ruleEcContext ) ) (otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) ) )* ) ;
    public final EObject ruleEcContextsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ecContexts_0_0 = null;

        EObject lv_ecContexts_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:366:28: ( ( ( (lv_ecContexts_0_0= ruleEcContext ) ) (otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:367:1: ( ( (lv_ecContexts_0_0= ruleEcContext ) ) (otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:367:1: ( ( (lv_ecContexts_0_0= ruleEcContext ) ) (otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:367:2: ( (lv_ecContexts_0_0= ruleEcContext ) ) (otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) ) )*
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:367:2: ( (lv_ecContexts_0_0= ruleEcContext ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:368:1: (lv_ecContexts_0_0= ruleEcContext )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:368:1: (lv_ecContexts_0_0= ruleEcContext )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:369:3: lv_ecContexts_0_0= ruleEcContext
            {
             
            	        newCompositeNode(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEcContext_in_ruleEcContextsList743);
            lv_ecContexts_0_0=ruleEcContext();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEcContextsListRule());
            	        }
                   		add(
                   			current, 
                   			"ecContexts",
                    		lv_ecContexts_0_0, 
                    		"EcContext");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:385:2: (otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==16) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:385:4: otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleEcContextsList756); 

            	        	newLeafNode(otherlv_1, grammarAccess.getEcContextsListAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:389:1: ( (lv_ecContexts_2_0= ruleEcContext ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:390:1: (lv_ecContexts_2_0= ruleEcContext )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:390:1: (lv_ecContexts_2_0= ruleEcContext )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:391:3: lv_ecContexts_2_0= ruleEcContext
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEcContext_in_ruleEcContextsList777);
            	    lv_ecContexts_2_0=ruleEcContext();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEcContextsListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ecContexts",
            	            		lv_ecContexts_2_0, 
            	            		"EcContext");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEcContextsList"


    // $ANTLR start "entryRuleExpContextsList"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:415:1: entryRuleExpContextsList returns [EObject current=null] : iv_ruleExpContextsList= ruleExpContextsList EOF ;
    public final EObject entryRuleExpContextsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpContextsList = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:416:2: (iv_ruleExpContextsList= ruleExpContextsList EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:417:2: iv_ruleExpContextsList= ruleExpContextsList EOF
            {
             newCompositeNode(grammarAccess.getExpContextsListRule()); 
            pushFollow(FOLLOW_ruleExpContextsList_in_entryRuleExpContextsList815);
            iv_ruleExpContextsList=ruleExpContextsList();

            state._fsp--;

             current =iv_ruleExpContextsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpContextsList825); 

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
    // $ANTLR end "entryRuleExpContextsList"


    // $ANTLR start "ruleExpContextsList"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:424:1: ruleExpContextsList returns [EObject current=null] : ( ( (lv_expContexts_0_0= ruleExpContext ) ) (otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) ) )* ) ;
    public final EObject ruleExpContextsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expContexts_0_0 = null;

        EObject lv_expContexts_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:427:28: ( ( ( (lv_expContexts_0_0= ruleExpContext ) ) (otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:428:1: ( ( (lv_expContexts_0_0= ruleExpContext ) ) (otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:428:1: ( ( (lv_expContexts_0_0= ruleExpContext ) ) (otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:428:2: ( (lv_expContexts_0_0= ruleExpContext ) ) (otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) ) )*
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:428:2: ( (lv_expContexts_0_0= ruleExpContext ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:429:1: (lv_expContexts_0_0= ruleExpContext )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:429:1: (lv_expContexts_0_0= ruleExpContext )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:430:3: lv_expContexts_0_0= ruleExpContext
            {
             
            	        newCompositeNode(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpContext_in_ruleExpContextsList871);
            lv_expContexts_0_0=ruleExpContext();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpContextsListRule());
            	        }
                   		add(
                   			current, 
                   			"expContexts",
                    		lv_expContexts_0_0, 
                    		"ExpContext");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:446:2: (otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==17) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:446:4: otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleExpContextsList884); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExpContextsListAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:450:1: ( (lv_expContexts_2_0= ruleExpContext ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:451:1: (lv_expContexts_2_0= ruleExpContext )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:451:1: (lv_expContexts_2_0= ruleExpContext )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:452:3: lv_expContexts_2_0= ruleExpContext
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpContext_in_ruleExpContextsList905);
            	    lv_expContexts_2_0=ruleExpContext();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpContextsListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expContexts",
            	            		lv_expContexts_2_0, 
            	            		"ExpContext");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpContextsList"


    // $ANTLR start "entryRuleEcContext"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:476:1: entryRuleEcContext returns [EObject current=null] : iv_ruleEcContext= ruleEcContext EOF ;
    public final EObject entryRuleEcContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEcContext = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:477:2: (iv_ruleEcContext= ruleEcContext EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:478:2: iv_ruleEcContext= ruleEcContext EOF
            {
             newCompositeNode(grammarAccess.getEcContextRule()); 
            pushFollow(FOLLOW_ruleEcContext_in_entryRuleEcContext943);
            iv_ruleEcContext=ruleEcContext();

            state._fsp--;

             current =iv_ruleEcContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEcContext953); 

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
    // $ANTLR end "entryRuleEcContext"


    // $ANTLR start "ruleEcContext"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:485:1: ruleEcContext returns [EObject current=null] : (otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) (otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) ) )* ) ;
    public final EObject ruleEcContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fluent_1_0 = null;

        EObject lv_fluent_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:488:28: ( (otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) (otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:489:1: (otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) (otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:489:1: (otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) (otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:489:3: otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) (otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleEcContext990); 

                	newLeafNode(otherlv_0, grammarAccess.getEcContextAccess().getSetKeyword_0());
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:493:1: ( (lv_fluent_1_0= ruleFluent ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:494:1: (lv_fluent_1_0= ruleFluent )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:494:1: (lv_fluent_1_0= ruleFluent )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:495:3: lv_fluent_1_0= ruleFluent
            {
             
            	        newCompositeNode(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFluent_in_ruleEcContext1011);
            lv_fluent_1_0=ruleFluent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEcContextRule());
            	        }
                   		add(
                   			current, 
                   			"fluent",
                    		lv_fluent_1_0, 
                    		"Fluent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:511:2: (otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==RULE_ID) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:511:4: otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEcContext1024); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEcContextAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:515:1: ( (lv_fluent_3_0= ruleFluent ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:516:1: (lv_fluent_3_0= ruleFluent )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:516:1: (lv_fluent_3_0= ruleFluent )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:517:3: lv_fluent_3_0= ruleFluent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFluent_in_ruleEcContext1045);
            	    lv_fluent_3_0=ruleFluent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEcContextRule());
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
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEcContext"


    // $ANTLR start "entryRuleExpContext"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:541:1: entryRuleExpContext returns [EObject current=null] : iv_ruleExpContext= ruleExpContext EOF ;
    public final EObject entryRuleExpContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpContext = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:542:2: (iv_ruleExpContext= ruleExpContext EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:543:2: iv_ruleExpContext= ruleExpContext EOF
            {
             newCompositeNode(grammarAccess.getExpContextRule()); 
            pushFollow(FOLLOW_ruleExpContext_in_entryRuleExpContext1083);
            iv_ruleExpContext=ruleExpContext();

            state._fsp--;

             current =iv_ruleExpContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpContext1093); 

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
    // $ANTLR end "entryRuleExpContext"


    // $ANTLR start "ruleExpContext"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:550:1: ruleExpContext returns [EObject current=null] : ( (lv_dafare_0_0= 'dafare' ) ) ;
    public final EObject ruleExpContext() throws RecognitionException {
        EObject current = null;

        Token lv_dafare_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:553:28: ( ( (lv_dafare_0_0= 'dafare' ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:554:1: ( (lv_dafare_0_0= 'dafare' ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:554:1: ( (lv_dafare_0_0= 'dafare' ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:555:1: (lv_dafare_0_0= 'dafare' )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:555:1: (lv_dafare_0_0= 'dafare' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:556:3: lv_dafare_0_0= 'dafare'
            {
            lv_dafare_0_0=(Token)match(input,17,FOLLOW_17_in_ruleExpContext1135); 

                    newLeafNode(lv_dafare_0_0, grammarAccess.getExpContextAccess().getDafareDafareKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExpContextRule());
            	        }
                   		setWithLastConsumed(current, "dafare", lv_dafare_0_0, "dafare");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpContext"


    // $ANTLR start "entryRuleFluent"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:577:1: entryRuleFluent returns [EObject current=null] : iv_ruleFluent= ruleFluent EOF ;
    public final EObject entryRuleFluent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFluent = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:578:2: (iv_ruleFluent= ruleFluent EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:579:2: iv_ruleFluent= ruleFluent EOF
            {
             newCompositeNode(grammarAccess.getFluentRule()); 
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent1183);
            iv_ruleFluent=ruleFluent();

            state._fsp--;

             current =iv_ruleFluent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent1193); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:586:1: ruleFluent returns [EObject current=null] : ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:589:28: ( ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:590:1: ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:590:1: ( ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:590:2: ( (lv_fluentName_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )?
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:590:2: ( (lv_fluentName_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:591:1: (lv_fluentName_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:591:1: (lv_fluentName_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:592:3: lv_fluentName_0_0= RULE_ID
            {
            lv_fluentName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFluent1235); 

            			newLeafNode(lv_fluentName_0_0, grammarAccess.getFluentAccess().getFluentNameIDTerminalRuleCall_0_0()); 
            		

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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:608:2: (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:608:4: otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) )
            {
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleFluent1253); 

                	newLeafNode(otherlv_1, grammarAccess.getFluentAccess().getToKeyword_1_0());
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:612:1: ( (lv_valuePart_2_0= ruleToRule ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:613:1: (lv_valuePart_2_0= ruleToRule )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:613:1: (lv_valuePart_2_0= ruleToRule )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:614:3: lv_valuePart_2_0= ruleToRule
            {
             
            	        newCompositeNode(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
            	    
            pushFollow(FOLLOW_ruleToRule_in_ruleFluent1274);
            lv_valuePart_2_0=ruleToRule();

            state._fsp--;


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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:630:3: (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:630:5: otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFluent1288); 

                        	newLeafNode(otherlv_3, grammarAccess.getFluentAccess().getInKeyword_2_0());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:634:1: ( (lv_timePart_4_0= ruleInRule ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:635:1: (lv_timePart_4_0= ruleInRule )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:635:1: (lv_timePart_4_0= ruleInRule )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:636:3: lv_timePart_4_0= ruleInRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInRule_in_ruleFluent1309);
                    lv_timePart_4_0=ruleInRule();

                    state._fsp--;


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
                    break;

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:652:4: (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:652:6: otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleFluent1324); 

                        	newLeafNode(otherlv_5, grammarAccess.getFluentAccess().getIfKeyword_3_0());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:656:1: ( (lv_condPart_6_0= ruleConditionRule ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:657:1: (lv_condPart_6_0= ruleConditionRule )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:657:1: (lv_condPart_6_0= ruleConditionRule )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:658:3: lv_condPart_6_0= ruleConditionRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConditionRule_in_ruleFluent1345);
                    lv_condPart_6_0=ruleConditionRule();

                    state._fsp--;


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
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleConditionRule"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:682:1: entryRuleConditionRule returns [EObject current=null] : iv_ruleConditionRule= ruleConditionRule EOF ;
    public final EObject entryRuleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:683:2: (iv_ruleConditionRule= ruleConditionRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:684:2: iv_ruleConditionRule= ruleConditionRule EOF
            {
             newCompositeNode(grammarAccess.getConditionRuleRule()); 
            pushFollow(FOLLOW_ruleConditionRule_in_entryRuleConditionRule1383);
            iv_ruleConditionRule=ruleConditionRule();

            state._fsp--;

             current =iv_ruleConditionRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionRule1393); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:691:1: ruleConditionRule returns [EObject current=null] : ( () ( (lv_condition_1_0= ruleExpression ) ) ) ;
    public final EObject ruleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:694:28: ( ( () ( (lv_condition_1_0= ruleExpression ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:695:1: ( () ( (lv_condition_1_0= ruleExpression ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:695:1: ( () ( (lv_condition_1_0= ruleExpression ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:695:2: () ( (lv_condition_1_0= ruleExpression ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:695:2: ()
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:696:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConditionRuleAccess().getExpressionAction_0(),
                        current);
                

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:701:2: ( (lv_condition_1_0= ruleExpression ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:702:1: (lv_condition_1_0= ruleExpression )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:702:1: (lv_condition_1_0= ruleExpression )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:703:3: lv_condition_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getConditionRuleAccess().getConditionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleConditionRule1448);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRuleRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleToRule"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:727:1: entryRuleToRule returns [EObject current=null] : iv_ruleToRule= ruleToRule EOF ;
    public final EObject entryRuleToRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:728:2: (iv_ruleToRule= ruleToRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:729:2: iv_ruleToRule= ruleToRule EOF
            {
             newCompositeNode(grammarAccess.getToRuleRule()); 
            pushFollow(FOLLOW_ruleToRule_in_entryRuleToRule1484);
            iv_ruleToRule=ruleToRule();

            state._fsp--;

             current =iv_ruleToRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToRule1494); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:736:1: ruleToRule returns [EObject current=null] : ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) ) ;
    public final EObject ruleToRule() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:739:28: ( ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:740:1: ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:740:1: ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:740:2: () ( (lv_expression_1_0= rulePlusOrMinus ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:740:2: ()
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:741:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getToRuleAccess().getExpressionAction_0(),
                        current);
                

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:746:2: ( (lv_expression_1_0= rulePlusOrMinus ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:747:1: (lv_expression_1_0= rulePlusOrMinus )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:747:1: (lv_expression_1_0= rulePlusOrMinus )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:748:3: lv_expression_1_0= rulePlusOrMinus
            {
             
            	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleToRule1549);
            lv_expression_1_0=rulePlusOrMinus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getToRuleRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"PlusOrMinus");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleInRule"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:772:1: entryRuleInRule returns [EObject current=null] : iv_ruleInRule= ruleInRule EOF ;
    public final EObject entryRuleInRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:773:2: (iv_ruleInRule= ruleInRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:774:2: iv_ruleInRule= ruleInRule EOF
            {
             newCompositeNode(grammarAccess.getInRuleRule()); 
            pushFollow(FOLLOW_ruleInRule_in_entryRuleInRule1585);
            iv_ruleInRule=ruleInRule();

            state._fsp--;

             current =iv_ruleInRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInRule1595); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:781:1: ruleInRule returns [EObject current=null] : ( (lv_time_0_0= RULE_INT ) ) ;
    public final EObject ruleInRule() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:784:28: ( ( (lv_time_0_0= RULE_INT ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:785:1: ( (lv_time_0_0= RULE_INT ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:785:1: ( (lv_time_0_0= RULE_INT ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:786:1: (lv_time_0_0= RULE_INT )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:786:1: (lv_time_0_0= RULE_INT )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:787:3: lv_time_0_0= RULE_INT
            {
            lv_time_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInRule1636); 

            			newLeafNode(lv_time_0_0, grammarAccess.getInRuleAccess().getTimeINTTerminalRuleCall_0()); 
            		

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

             leaveRule(); 
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


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:811:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:812:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:813:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1676);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1686); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:820:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:823:28: (this_Or_0= ruleOr )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:825:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleExpression1732);
            this_Or_0=ruleOr();

            state._fsp--;

             
                    current = this_Or_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:841:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:842:2: (iv_ruleOr= ruleOr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:843:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1766);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1776); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:850:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:853:28: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:854:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:854:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:855:5: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr1823);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:863:1: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:863:2: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:863:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:864:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleOr1844); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:873:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:874:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:874:1: (lv_right_3_0= ruleAnd )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:875:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr1865);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:899:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:900:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:901:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd1903);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd1913); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:908:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:911:28: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:912:1: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:912:1: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:913:5: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEquality_in_ruleAnd1960);
            this_Equality_0=ruleEquality();

            state._fsp--;

             
                    current = this_Equality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:921:1: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:921:2: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:921:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:922:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAnd1981); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:931:1: ( (lv_right_3_0= ruleEquality ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:932:1: (lv_right_3_0= ruleEquality )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:932:1: (lv_right_3_0= ruleEquality )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:933:3: lv_right_3_0= ruleEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd2002);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:957:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:958:2: (iv_ruleEquality= ruleEquality EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:959:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality2040);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality2050); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:966:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:969:28: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:970:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:970:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:971:5: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleEquality2097);
            this_Comparison_0=ruleComparison();

            state._fsp--;

             
                    current = this_Comparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:979:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=23 && LA13_0<=24)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:979:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:979:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:980:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:985:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:986:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:986:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:987:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:987:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==23) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==24) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:988:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,23,FOLLOW_23_in_ruleEquality2126); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1000:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_ruleEquality2155); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1015:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1016:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1016:1: (lv_right_3_0= ruleComparison )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1017:3: lv_right_3_0= ruleComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparison_in_ruleEquality2192);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Comparison");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1041:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1042:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1043:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison2230);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison2240); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1050:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1053:28: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1054:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1054:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1055:5: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison2287);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;

             
                    current = this_PlusOrMinus_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1063:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=25 && LA15_0<=28)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1063:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1063:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1064:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1069:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1070:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1070:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1071:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1071:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt14=4;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt14=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1072:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,25,FOLLOW_25_in_ruleComparison2316); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1084:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,26,FOLLOW_26_in_ruleComparison2345); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1096:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,27,FOLLOW_27_in_ruleComparison2374); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1108:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,28,FOLLOW_28_in_ruleComparison2403); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1123:2: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1124:1: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1124:1: (lv_right_3_0= rulePlusOrMinus )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1125:3: lv_right_3_0= rulePlusOrMinus
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison2440);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1149:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1150:2: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1151:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2478);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus2488); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1158:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1161:28: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1162:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1162:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1163:5: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2535);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;

             
                    current = this_MulOrDiv_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1171:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=29 && LA17_0<=30)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1171:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1171:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==29) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==30) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1171:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1171:3: ( () otherlv_2= '+' )
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1171:4: () otherlv_2= '+'
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1171:4: ()
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1172:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePlusOrMinus2558); 

            	                	newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1182:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1182:6: ( () otherlv_4= '-' )
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1182:7: () otherlv_4= '-'
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1182:7: ()
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1183:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,30,FOLLOW_30_in_rulePlusOrMinus2587); 

            	                	newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1192:3: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1193:1: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1193:1: (lv_right_5_0= ruleMulOrDiv )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1194:3: lv_right_5_0= ruleMulOrDiv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2610);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1218:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1219:2: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1220:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2648);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv2658); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1227:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1230:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1231:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1231:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1232:5: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv2705);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1240:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=31 && LA19_0<=34)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1240:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1240:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1241:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1246:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1247:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1247:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1248:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1248:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
            	    int alt18=4;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1249:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,31,FOLLOW_31_in_ruleMulOrDiv2734); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1261:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,32,FOLLOW_32_in_ruleMulOrDiv2763); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1273:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,33,FOLLOW_33_in_ruleMulOrDiv2792); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1285:8: lv_op_2_4= '^'
            	            {
            	            lv_op_2_4=(Token)match(input,34,FOLLOW_34_in_ruleMulOrDiv2821); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1300:2: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1301:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1301:1: (lv_right_3_0= rulePrimary )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1302:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv2858);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1326:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1327:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1328:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary2896);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary2906); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1335:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1338:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1339:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1339:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt20=1;
                }
                break;
            case 35:
                {
                alt20=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case 36:
            case 37:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1339:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1339:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1339:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePrimary2944); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimary2966);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePrimary2977); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1357:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1357:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1357:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1357:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1358:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_rulePrimary3006); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1367:1: ( (lv_expression_5_0= rulePrimary ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1368:1: (lv_expression_5_0= rulePrimary )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1368:1: (lv_expression_5_0= rulePrimary )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1369:3: lv_expression_5_0= rulePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimary_in_rulePrimary3027);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"Primary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1387:5: this_Atomic_6= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary3056);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleAtomic"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1403:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1404:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1405:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic3091);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic3101); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1412:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1415:28: ( ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1416:1: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1416:1: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt22=1;
                }
                break;
            case RULE_INT:
                {
                alt22=2;
                }
                break;
            case 36:
            case 37:
                {
                alt22=3;
                }
                break;
            case RULE_ID:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1416:2: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1416:2: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1416:3: () ( (lv_value_1_0= RULE_FLOAT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1416:3: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1417:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getFloatConstantAction_0_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1422:2: ( (lv_value_1_0= RULE_FLOAT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1423:1: (lv_value_1_0= RULE_FLOAT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1423:1: (lv_value_1_0= RULE_FLOAT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1424:3: lv_value_1_0= RULE_FLOAT
                    {
                    lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleAtomic3153); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"FLOAT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1441:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1441:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1441:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1441:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1442:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getIntConstantAction_1_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1447:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1448:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1448:1: (lv_value_3_0= RULE_INT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1449:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic3192); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1466:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1466:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1466:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1466:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1467:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1472:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1473:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1473:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1474:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1474:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==36) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==37) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1475:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,36,FOLLOW_36_in_ruleAtomic3234); 

                                    newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1487:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,37,FOLLOW_37_in_ruleAtomic3263); 

                                    newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1503:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1503:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1503:7: () ( (otherlv_7= RULE_ID ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1503:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1504:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getFeatureRefAction_3_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1509:2: ( (otherlv_7= RULE_ID ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1510:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1510:1: (otherlv_7= RULE_ID )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1511:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic3316); 

                    		newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getParamEventFeatureCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDroolsModel_in_entryRuleDroolsModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDroolsModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDroolsModel130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStatement213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatement234 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleContextsList_in_ruleStatement255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent343 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleEvent361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventFeature_in_ruleEvent382 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleEvent395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventFeature_in_ruleEvent416 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleEvent430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_entryRuleEventFeature468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventFeature478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventFeature519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextsList_in_entryRuleContextsList559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextsList569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContextsList_in_ruleContextsList615 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleContextsList628 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleExpContextsList_in_ruleContextsList649 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleEcContextsList_in_entryRuleEcContextsList687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEcContextsList697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContext_in_ruleEcContextsList743 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleEcContextsList756 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleEcContext_in_ruleEcContextsList777 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleExpContextsList_in_entryRuleExpContextsList815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpContextsList825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContext_in_ruleExpContextsList871 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleExpContextsList884 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleExpContext_in_ruleExpContextsList905 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleEcContext_in_entryRuleEcContext943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEcContext953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEcContext990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFluent_in_ruleEcContext1011 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleEcContext1024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFluent_in_ruleEcContext1045 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleExpContext_in_entryRuleExpContext1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpContext1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleExpContext1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent1183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFluent1235 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFluent1253 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_ruleToRule_in_ruleFluent1274 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleFluent1288 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInRule_in_ruleFluent1309 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFluent1324 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_ruleConditionRule_in_ruleFluent1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_entryRuleConditionRule1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionRule1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditionRule1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_entryRuleToRule1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToRule1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleToRule1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_entryRuleInRule1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInRule1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInRule1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1823 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleOr1844 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1865 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd1903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1960 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAnd1981 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd2002 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality2097 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleEquality2126 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_24_in_ruleEquality2155 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality2192 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison2230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison2287 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_25_in_ruleComparison2316 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_26_in_ruleComparison2345 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_27_in_ruleComparison2374 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_28_in_ruleComparison2403 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison2440 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2535 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_29_in_rulePlusOrMinus2558 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_30_in_rulePlusOrMinus2587 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2610 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv2705 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_31_in_ruleMulOrDiv2734 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_32_in_ruleMulOrDiv2763 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_33_in_ruleMulOrDiv2792 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_34_in_ruleMulOrDiv2821 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv2858 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary2896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePrimary2944 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimary2966 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrimary2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrimary3006 = new BitSet(new long[]{0x0000003800002070L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePrimary3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic3091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleAtomic3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAtomic3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAtomic3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic3316 = new BitSet(new long[]{0x0000000000000002L});

}