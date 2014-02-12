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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'on'", "';'", "'('", "','", "')'", "'set'", "'expect'", "'if'", "'onFulf'", "'onViol'", "'before'", "'after'", "'in'", "'to'", "'*'", "'/'", "'%'", "'^'", "'true'", "'false'", "'at'", "'now'", "'=='", "'!='", "'OR'", "'AND'", "'+'", "'-'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
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
    public static final int T__38=38;
    public static final int T__39=39;
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
        	return "EceModel";	
       	}
       	
       	@Override
       	protected EceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEceModel"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:67:1: entryRuleEceModel returns [EObject current=null] : iv_ruleEceModel= ruleEceModel EOF ;
    public final EObject entryRuleEceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEceModel = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:68:2: (iv_ruleEceModel= ruleEceModel EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:69:2: iv_ruleEceModel= ruleEceModel EOF
            {
             newCompositeNode(grammarAccess.getEceModelRule()); 
            pushFollow(FOLLOW_ruleEceModel_in_entryRuleEceModel75);
            iv_ruleEceModel=ruleEceModel();

            state._fsp--;

             current =iv_ruleEceModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEceModel85); 

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
    // $ANTLR end "entryRuleEceModel"


    // $ANTLR start "ruleEceModel"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:76:1: ruleEceModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleEceModel() throws RecognitionException {
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
            	     
            	    	        newCompositeNode(grammarAccess.getEceModelAccess().getStatementsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleEceModel130);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEceModelRule());
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
    // $ANTLR end "ruleEceModel"


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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:115:1: ruleStatement returns [EObject current=null] : (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) ( (lv_contextsList_2_0= ruleContextsList ) ) otherlv_3= ';' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_event_1_0 = null;

        EObject lv_contextsList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:118:28: ( (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) ( (lv_contextsList_2_0= ruleContextsList ) ) otherlv_3= ';' ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:119:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) ( (lv_contextsList_2_0= ruleContextsList ) ) otherlv_3= ';' )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:119:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) ( (lv_contextsList_2_0= ruleContextsList ) ) otherlv_3= ';' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:119:3: otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) ( (lv_contextsList_2_0= ruleContextsList ) ) otherlv_3= ';'
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStatement267); 

                	newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getSemicolonKeyword_3());
                

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:171:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:172:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:173:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent303);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent313); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:180:1: ruleEvent returns [EObject current=null] : ( ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_eventName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:183:28: ( ( ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )? ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:184:1: ( ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )? )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:184:1: ( ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )? )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:184:2: ( (lv_eventName_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )?
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:184:2: ( (lv_eventName_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:185:1: (lv_eventName_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:185:1: (lv_eventName_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:186:3: lv_eventName_0_0= RULE_ID
            {
            lv_eventName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent355); 

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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:202:2: (otherlv_1= '(' ( (lv_params_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleEventFeature ) ) )* otherlv_5= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:202:4: otherlv_1= '(' ( (lv_params_2_0= ruleEventFeature ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleEventFeature ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleEvent373); 

                        	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:206:1: ( (lv_params_2_0= ruleEventFeature ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:207:1: (lv_params_2_0= ruleEventFeature )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:207:1: (lv_params_2_0= ruleEventFeature )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:208:3: lv_params_2_0= ruleEventFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getParamsEventFeatureParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEventFeature_in_ruleEvent394);
                    lv_params_2_0=ruleEventFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_2_0, 
                            		"EventFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:224:2: (otherlv_3= ',' ( (lv_params_4_0= ruleEventFeature ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:224:4: otherlv_3= ',' ( (lv_params_4_0= ruleEventFeature ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEvent407); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:228:1: ( (lv_params_4_0= ruleEventFeature ) )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:229:1: (lv_params_4_0= ruleEventFeature )
                    	    {
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:229:1: (lv_params_4_0= ruleEventFeature )
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:230:3: lv_params_4_0= ruleEventFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getParamsEventFeatureParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEventFeature_in_ruleEvent428);
                    	    lv_params_4_0=ruleEventFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_4_0, 
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

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleEvent442); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:258:1: entryRuleEventFeature returns [EObject current=null] : iv_ruleEventFeature= ruleEventFeature EOF ;
    public final EObject entryRuleEventFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventFeature = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:259:2: (iv_ruleEventFeature= ruleEventFeature EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:260:2: iv_ruleEventFeature= ruleEventFeature EOF
            {
             newCompositeNode(grammarAccess.getEventFeatureRule()); 
            pushFollow(FOLLOW_ruleEventFeature_in_entryRuleEventFeature480);
            iv_ruleEventFeature=ruleEventFeature();

            state._fsp--;

             current =iv_ruleEventFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventFeature490); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:267:1: ruleEventFeature returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEventFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:270:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:271:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:271:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:272:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:272:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:273:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventFeature531); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:297:1: entryRuleContextsList returns [EObject current=null] : iv_ruleContextsList= ruleContextsList EOF ;
    public final EObject entryRuleContextsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextsList = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:298:2: (iv_ruleContextsList= ruleContextsList EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:299:2: iv_ruleContextsList= ruleContextsList EOF
            {
             newCompositeNode(grammarAccess.getContextsListRule()); 
            pushFollow(FOLLOW_ruleContextsList_in_entryRuleContextsList571);
            iv_ruleContextsList=ruleContextsList();

            state._fsp--;

             current =iv_ruleContextsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextsList581); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:306:1: ruleContextsList returns [EObject current=null] : ( ( (lv_ecContextsList_0_0= ruleEcContextsList ) )? ( (lv_expContextsList_1_0= ruleExpContextsList ) )? ) ;
    public final EObject ruleContextsList() throws RecognitionException {
        EObject current = null;

        EObject lv_ecContextsList_0_0 = null;

        EObject lv_expContextsList_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:309:28: ( ( ( (lv_ecContextsList_0_0= ruleEcContextsList ) )? ( (lv_expContextsList_1_0= ruleExpContextsList ) )? ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:310:1: ( ( (lv_ecContextsList_0_0= ruleEcContextsList ) )? ( (lv_expContextsList_1_0= ruleExpContextsList ) )? )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:310:1: ( ( (lv_ecContextsList_0_0= ruleEcContextsList ) )? ( (lv_expContextsList_1_0= ruleExpContextsList ) )? )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:310:2: ( (lv_ecContextsList_0_0= ruleEcContextsList ) )? ( (lv_expContextsList_1_0= ruleExpContextsList ) )?
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:310:2: ( (lv_ecContextsList_0_0= ruleEcContextsList ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:311:1: (lv_ecContextsList_0_0= ruleEcContextsList )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:311:1: (lv_ecContextsList_0_0= ruleEcContextsList )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:312:3: lv_ecContextsList_0_0= ruleEcContextsList
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextsListAccess().getEcContextsListEcContextsListParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEcContextsList_in_ruleContextsList627);
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
                    break;

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:328:3: ( (lv_expContextsList_1_0= ruleExpContextsList ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:329:1: (lv_expContextsList_1_0= ruleExpContextsList )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:329:1: (lv_expContextsList_1_0= ruleExpContextsList )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:330:3: lv_expContextsList_1_0= ruleExpContextsList
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextsListAccess().getExpContextsListExpContextsListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpContextsList_in_ruleContextsList649);
                    lv_expContextsList_1_0=ruleExpContextsList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextsListRule());
                    	        }
                           		set(
                           			current, 
                           			"expContextsList",
                            		lv_expContextsList_1_0, 
                            		"ExpContextsList");
                    	        afterParserOrEnumRuleCall();
                    	    

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
            pushFollow(FOLLOW_ruleEcContextsList_in_entryRuleEcContextsList686);
            iv_ruleEcContextsList=ruleEcContextsList();

            state._fsp--;

             current =iv_ruleEcContextsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEcContextsList696); 

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
            	    
            pushFollow(FOLLOW_ruleEcContext_in_ruleEcContextsList742);
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
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:385:4: otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleEcContextsList755); 

            	        	newLeafNode(otherlv_1, grammarAccess.getEcContextsListAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:389:1: ( (lv_ecContexts_2_0= ruleEcContext ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:390:1: (lv_ecContexts_2_0= ruleEcContext )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:390:1: (lv_ecContexts_2_0= ruleEcContext )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:391:3: lv_ecContexts_2_0= ruleEcContext
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEcContext_in_ruleEcContextsList776);
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
            pushFollow(FOLLOW_ruleExpContextsList_in_entryRuleExpContextsList814);
            iv_ruleExpContextsList=ruleExpContextsList();

            state._fsp--;

             current =iv_ruleExpContextsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpContextsList824); 

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
            	    
            pushFollow(FOLLOW_ruleExpContext_in_ruleExpContextsList870);
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
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:446:4: otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleExpContextsList883); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExpContextsListAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:450:1: ( (lv_expContexts_2_0= ruleExpContext ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:451:1: (lv_expContexts_2_0= ruleExpContext )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:451:1: (lv_expContexts_2_0= ruleExpContext )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:452:3: lv_expContexts_2_0= ruleExpContext
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpContext_in_ruleExpContextsList904);
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
            pushFollow(FOLLOW_ruleEcContext_in_entryRuleEcContext942);
            iv_ruleEcContext=ruleEcContext();

            state._fsp--;

             current =iv_ruleEcContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEcContext952); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:485:1: ruleEcContext returns [EObject current=null] : (otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) ) ;
    public final EObject ruleEcContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fluent_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:488:28: ( (otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:489:1: (otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:489:1: (otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:489:3: otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEcContext989); 

                	newLeafNode(otherlv_0, grammarAccess.getEcContextAccess().getSetKeyword_0());
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:493:1: ( (lv_fluent_1_0= ruleFluent ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:494:1: (lv_fluent_1_0= ruleFluent )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:494:1: (lv_fluent_1_0= ruleFluent )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:495:3: lv_fluent_1_0= ruleFluent
            {
             
            	        newCompositeNode(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFluent_in_ruleEcContext1010);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:519:1: entryRuleExpContext returns [EObject current=null] : iv_ruleExpContext= ruleExpContext EOF ;
    public final EObject entryRuleExpContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpContext = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:520:2: (iv_ruleExpContext= ruleExpContext EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:521:2: iv_ruleExpContext= ruleExpContext EOF
            {
             newCompositeNode(grammarAccess.getExpContextRule()); 
            pushFollow(FOLLOW_ruleExpContext_in_entryRuleExpContext1046);
            iv_ruleExpContext=ruleExpContext();

            state._fsp--;

             current =iv_ruleExpContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpContext1056); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:528:1: ruleExpContext returns [EObject current=null] : (otherlv_0= 'expect' ( (lv_finalCondition_1_0= ruleConditionRule ) ) ( ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= RULE_INT ) ) )? (otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) ) )? (otherlv_6= 'onFulf' ( (lv_actionF_7_0= RULE_ID ) ) )? (otherlv_8= 'onViol' ( (lv_actionV_9_0= RULE_ID ) ) )? ) ;
    public final EObject ruleExpContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_time_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_actionF_7_0=null;
        Token otherlv_8=null;
        Token lv_actionV_9_0=null;
        EObject lv_finalCondition_1_0 = null;

        EObject lv_allenOp_2_0 = null;

        EObject lv_initialCondition_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:531:28: ( (otherlv_0= 'expect' ( (lv_finalCondition_1_0= ruleConditionRule ) ) ( ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= RULE_INT ) ) )? (otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) ) )? (otherlv_6= 'onFulf' ( (lv_actionF_7_0= RULE_ID ) ) )? (otherlv_8= 'onViol' ( (lv_actionV_9_0= RULE_ID ) ) )? ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:532:1: (otherlv_0= 'expect' ( (lv_finalCondition_1_0= ruleConditionRule ) ) ( ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= RULE_INT ) ) )? (otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) ) )? (otherlv_6= 'onFulf' ( (lv_actionF_7_0= RULE_ID ) ) )? (otherlv_8= 'onViol' ( (lv_actionV_9_0= RULE_ID ) ) )? )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:532:1: (otherlv_0= 'expect' ( (lv_finalCondition_1_0= ruleConditionRule ) ) ( ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= RULE_INT ) ) )? (otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) ) )? (otherlv_6= 'onFulf' ( (lv_actionF_7_0= RULE_ID ) ) )? (otherlv_8= 'onViol' ( (lv_actionV_9_0= RULE_ID ) ) )? )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:532:3: otherlv_0= 'expect' ( (lv_finalCondition_1_0= ruleConditionRule ) ) ( ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= RULE_INT ) ) )? (otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) ) )? (otherlv_6= 'onFulf' ( (lv_actionF_7_0= RULE_ID ) ) )? (otherlv_8= 'onViol' ( (lv_actionV_9_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleExpContext1093); 

                	newLeafNode(otherlv_0, grammarAccess.getExpContextAccess().getExpectKeyword_0());
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:536:1: ( (lv_finalCondition_1_0= ruleConditionRule ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:537:1: (lv_finalCondition_1_0= ruleConditionRule )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:537:1: (lv_finalCondition_1_0= ruleConditionRule )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:538:3: lv_finalCondition_1_0= ruleConditionRule
            {
             
            	        newCompositeNode(grammarAccess.getExpContextAccess().getFinalConditionConditionRuleParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionRule_in_ruleExpContext1114);
            lv_finalCondition_1_0=ruleConditionRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpContextRule());
            	        }
                   		set(
                   			current, 
                   			"finalCondition",
                    		lv_finalCondition_1_0, 
                    		"ConditionRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:554:2: ( ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= RULE_INT ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=22 && LA8_0<=24)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:554:3: ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:554:3: ( (lv_allenOp_2_0= ruleAllenOp ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:555:1: (lv_allenOp_2_0= ruleAllenOp )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:555:1: (lv_allenOp_2_0= ruleAllenOp )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:556:3: lv_allenOp_2_0= ruleAllenOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpContextAccess().getAllenOpAllenOpParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAllenOp_in_ruleExpContext1136);
                    lv_allenOp_2_0=ruleAllenOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpContextRule());
                    	        }
                           		set(
                           			current, 
                           			"allenOp",
                            		lv_allenOp_2_0, 
                            		"AllenOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:572:2: ( (lv_time_3_0= RULE_INT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:573:1: (lv_time_3_0= RULE_INT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:573:1: (lv_time_3_0= RULE_INT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:574:3: lv_time_3_0= RULE_INT
                    {
                    lv_time_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExpContext1153); 

                    			newLeafNode(lv_time_3_0, grammarAccess.getExpContextAccess().getTimeINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpContextRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"time",
                            		lv_time_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:590:4: (otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:590:6: otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleExpContext1173); 

                        	newLeafNode(otherlv_4, grammarAccess.getExpContextAccess().getIfKeyword_3_0());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:594:1: ( (lv_initialCondition_5_0= ruleConditionRule ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:595:1: (lv_initialCondition_5_0= ruleConditionRule )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:595:1: (lv_initialCondition_5_0= ruleConditionRule )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:596:3: lv_initialCondition_5_0= ruleConditionRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpContextAccess().getInitialConditionConditionRuleParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConditionRule_in_ruleExpContext1194);
                    lv_initialCondition_5_0=ruleConditionRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpContextRule());
                    	        }
                           		set(
                           			current, 
                           			"initialCondition",
                            		lv_initialCondition_5_0, 
                            		"ConditionRule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:612:4: (otherlv_6= 'onFulf' ( (lv_actionF_7_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:612:6: otherlv_6= 'onFulf' ( (lv_actionF_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleExpContext1209); 

                        	newLeafNode(otherlv_6, grammarAccess.getExpContextAccess().getOnFulfKeyword_4_0());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:616:1: ( (lv_actionF_7_0= RULE_ID ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:617:1: (lv_actionF_7_0= RULE_ID )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:617:1: (lv_actionF_7_0= RULE_ID )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:618:3: lv_actionF_7_0= RULE_ID
                    {
                    lv_actionF_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpContext1226); 

                    			newLeafNode(lv_actionF_7_0, grammarAccess.getExpContextAccess().getActionFIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpContextRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"actionF",
                            		lv_actionF_7_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:634:4: (otherlv_8= 'onViol' ( (lv_actionV_9_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:634:6: otherlv_8= 'onViol' ( (lv_actionV_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleExpContext1246); 

                        	newLeafNode(otherlv_8, grammarAccess.getExpContextAccess().getOnViolKeyword_5_0());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:638:1: ( (lv_actionV_9_0= RULE_ID ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:639:1: (lv_actionV_9_0= RULE_ID )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:639:1: (lv_actionV_9_0= RULE_ID )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:640:3: lv_actionV_9_0= RULE_ID
                    {
                    lv_actionV_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpContext1263); 

                    			newLeafNode(lv_actionV_9_0, grammarAccess.getExpContextAccess().getActionVIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpContextRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"actionV",
                            		lv_actionV_9_0, 
                            		"ID");
                    	    

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
    // $ANTLR end "ruleExpContext"


    // $ANTLR start "entryRuleAllenOp"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:664:1: entryRuleAllenOp returns [EObject current=null] : iv_ruleAllenOp= ruleAllenOp EOF ;
    public final EObject entryRuleAllenOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllenOp = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:665:2: (iv_ruleAllenOp= ruleAllenOp EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:666:2: iv_ruleAllenOp= ruleAllenOp EOF
            {
             newCompositeNode(grammarAccess.getAllenOpRule()); 
            pushFollow(FOLLOW_ruleAllenOp_in_entryRuleAllenOp1306);
            iv_ruleAllenOp=ruleAllenOp();

            state._fsp--;

             current =iv_ruleAllenOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllenOp1316); 

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
    // $ANTLR end "entryRuleAllenOp"


    // $ANTLR start "ruleAllenOp"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:673:1: ruleAllenOp returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) ) ) ) ;
    public final EObject ruleAllenOp() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token lv_value_1_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:676:28: ( ( () ( ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:677:1: ( () ( ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:677:1: ( () ( ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:677:2: () ( ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:677:2: ()
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:678:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAllenOpAccess().getAllenOperatorAction_0(),
                        current);
                

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:683:2: ( ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:684:1: ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:684:1: ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:685:1: (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:685:1: (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:686:3: lv_value_1_1= 'before'
                    {
                    lv_value_1_1=(Token)match(input,22,FOLLOW_22_in_ruleAllenOp1370); 

                            newLeafNode(lv_value_1_1, grammarAccess.getAllenOpAccess().getValueBeforeKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllenOpRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:698:8: lv_value_1_2= 'after'
                    {
                    lv_value_1_2=(Token)match(input,23,FOLLOW_23_in_ruleAllenOp1399); 

                            newLeafNode(lv_value_1_2, grammarAccess.getAllenOpAccess().getValueAfterKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllenOpRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:710:8: lv_value_1_3= 'in'
                    {
                    lv_value_1_3=(Token)match(input,24,FOLLOW_24_in_ruleAllenOp1428); 

                            newLeafNode(lv_value_1_3, grammarAccess.getAllenOpAccess().getValueInKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllenOpRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_3, null);
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleAllenOp"


    // $ANTLR start "entryRuleFluent"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:733:1: entryRuleFluent returns [EObject current=null] : iv_ruleFluent= ruleFluent EOF ;
    public final EObject entryRuleFluent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFluent = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:734:2: (iv_ruleFluent= ruleFluent EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:735:2: iv_ruleFluent= ruleFluent EOF
            {
             newCompositeNode(grammarAccess.getFluentRule()); 
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent1480);
            iv_ruleFluent=ruleFluent();

            state._fsp--;

             current =iv_ruleFluent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent1490); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:742:1: ruleFluent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'if' ( (lv_condPart_4_0= ruleConditionRule ) ) )? ) ;
    public final EObject ruleFluent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_valuePart_2_0 = null;

        EObject lv_condPart_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:745:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'if' ( (lv_condPart_4_0= ruleConditionRule ) ) )? ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:746:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'if' ( (lv_condPart_4_0= ruleConditionRule ) ) )? )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:746:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'if' ( (lv_condPart_4_0= ruleConditionRule ) ) )? )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:746:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'if' ( (lv_condPart_4_0= ruleConditionRule ) ) )?
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:746:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:747:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:747:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:748:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFluent1532); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFluentAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFluentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:764:2: (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:764:4: otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) )
            {
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleFluent1550); 

                	newLeafNode(otherlv_1, grammarAccess.getFluentAccess().getToKeyword_1_0());
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:768:1: ( (lv_valuePart_2_0= ruleToRule ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:769:1: (lv_valuePart_2_0= ruleToRule )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:769:1: (lv_valuePart_2_0= ruleToRule )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:770:3: lv_valuePart_2_0= ruleToRule
            {
             
            	        newCompositeNode(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
            	    
            pushFollow(FOLLOW_ruleToRule_in_ruleFluent1571);
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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:786:3: (otherlv_3= 'if' ( (lv_condPart_4_0= ruleConditionRule ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:786:5: otherlv_3= 'if' ( (lv_condPart_4_0= ruleConditionRule ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFluent1585); 

                        	newLeafNode(otherlv_3, grammarAccess.getFluentAccess().getIfKeyword_2_0());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:790:1: ( (lv_condPart_4_0= ruleConditionRule ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:791:1: (lv_condPart_4_0= ruleConditionRule )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:791:1: (lv_condPart_4_0= ruleConditionRule )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:792:3: lv_condPart_4_0= ruleConditionRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConditionRule_in_ruleFluent1606);
                    lv_condPart_4_0=ruleConditionRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFluentRule());
                    	        }
                           		set(
                           			current, 
                           			"condPart",
                            		lv_condPart_4_0, 
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


    // $ANTLR start "entryRuleToRule"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:816:1: entryRuleToRule returns [EObject current=null] : iv_ruleToRule= ruleToRule EOF ;
    public final EObject entryRuleToRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:817:2: (iv_ruleToRule= ruleToRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:818:2: iv_ruleToRule= ruleToRule EOF
            {
             newCompositeNode(grammarAccess.getToRuleRule()); 
            pushFollow(FOLLOW_ruleToRule_in_entryRuleToRule1644);
            iv_ruleToRule=ruleToRule();

            state._fsp--;

             current =iv_ruleToRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToRule1654); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:825:1: ruleToRule returns [EObject current=null] : ( (lv_expression_0_0= ruleMulOrDiv ) ) ;
    public final EObject ruleToRule() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:828:28: ( ( (lv_expression_0_0= ruleMulOrDiv ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:829:1: ( (lv_expression_0_0= ruleMulOrDiv ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:829:1: ( (lv_expression_0_0= ruleMulOrDiv ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:830:1: (lv_expression_0_0= ruleMulOrDiv )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:830:1: (lv_expression_0_0= ruleMulOrDiv )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:831:3: lv_expression_0_0= ruleMulOrDiv
            {
             
            	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionMulOrDivParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleMulOrDiv_in_ruleToRule1699);
            lv_expression_0_0=ruleMulOrDiv();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getToRuleRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"MulOrDiv");
            	        afterParserOrEnumRuleCall();
            	    

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


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:855:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:856:2: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:857:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv1734);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv1744); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:864:1: ruleMulOrDiv returns [EObject current=null] : (this_Atomic_0= ruleAtomic ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_Atomic_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:867:28: ( (this_Atomic_0= ruleAtomic ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:868:1: (this_Atomic_0= ruleAtomic ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:868:1: (this_Atomic_0= ruleAtomic ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:869:5: this_Atomic_0= ruleAtomic ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMulOrDivAccess().getAtomicParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtomic_in_ruleMulOrDiv1791);
            this_Atomic_0=ruleAtomic();

            state._fsp--;

             
                    current = this_Atomic_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:877:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=26 && LA15_0<=29)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:877:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= ruleAtomic ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:877:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:878:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:883:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:884:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:884:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:885:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:885:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
            	    int alt14=4;
            	    switch ( input.LA(1) ) {
            	    case 26:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case 29:
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
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:886:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,26,FOLLOW_26_in_ruleMulOrDiv1820); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:898:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,27,FOLLOW_27_in_ruleMulOrDiv1849); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:910:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,28,FOLLOW_28_in_ruleMulOrDiv1878); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:922:8: lv_op_2_4= '^'
            	            {
            	            lv_op_2_4=(Token)match(input,29,FOLLOW_29_in_ruleMulOrDiv1907); 

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

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:937:2: ( (lv_right_3_0= ruleAtomic ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:938:1: (lv_right_3_0= ruleAtomic )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:938:1: (lv_right_3_0= ruleAtomic )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:939:3: lv_right_3_0= ruleAtomic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMulOrDivAccess().getRightAtomicParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomic_in_ruleMulOrDiv1944);
            	    lv_right_3_0=ruleAtomic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Atomic");
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleAtomic"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:963:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:964:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:965:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1982);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1992); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:972:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? ) | ( () ( (lv_value_11_0= 'now' ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_value_11_0=null;
        EObject lv_fluentValueSample_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:975:28: ( ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? ) | ( () ( (lv_value_11_0= 'now' ) ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:976:1: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? ) | ( () ( (lv_value_11_0= 'now' ) ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:976:1: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? ) | ( () ( (lv_value_11_0= 'now' ) ) ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
                {
                alt18=2;
                }
                break;
            case 30:
            case 31:
                {
                alt18=3;
                }
                break;
            case RULE_ID:
                {
                alt18=4;
                }
                break;
            case 33:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:976:2: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:976:2: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:976:3: () ( (lv_value_1_0= RULE_FLOAT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:976:3: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:977:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getFloatConstantAction_0_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:982:2: ( (lv_value_1_0= RULE_FLOAT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:983:1: (lv_value_1_0= RULE_FLOAT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:983:1: (lv_value_1_0= RULE_FLOAT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:984:3: lv_value_1_0= RULE_FLOAT
                    {
                    lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleAtomic2044); 

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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1001:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1001:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1001:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1001:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1002:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getIntConstantAction_1_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1007:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1008:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1008:1: (lv_value_3_0= RULE_INT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1009:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic2083); 

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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1026:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1026:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1026:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1026:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1027:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1032:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1033:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1033:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1034:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1034:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==30) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==31) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1035:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,30,FOLLOW_30_in_ruleAtomic2125); 

                                    newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1047:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,31,FOLLOW_31_in_ruleAtomic2154); 

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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1063:6: ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1063:6: ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1063:7: () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )?
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1063:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1064:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getReferenceAction_3_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1069:2: ( (otherlv_7= RULE_ID ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1070:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1070:1: (otherlv_7= RULE_ID )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1071:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic2207); 

                    		newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getRefReferenceTypeCrossReference_3_1_0()); 
                    	

                    }


                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1082:2: (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==32) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1082:4: otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) )
                            {
                            otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleAtomic2220); 

                                	newLeafNode(otherlv_8, grammarAccess.getAtomicAccess().getAtKeyword_3_2_0());
                                
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1086:1: ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) )
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1087:1: (lv_fluentValueSample_9_0= ruleAtTimePrimary )
                            {
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1087:1: (lv_fluentValueSample_9_0= ruleAtTimePrimary )
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1088:3: lv_fluentValueSample_9_0= ruleAtTimePrimary
                            {
                             
                            	        newCompositeNode(grammarAccess.getAtomicAccess().getFluentValueSampleAtTimePrimaryParserRuleCall_3_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAtTimePrimary_in_ruleAtomic2241);
                            lv_fluentValueSample_9_0=ruleAtTimePrimary();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"fluentValueSample",
                                    		lv_fluentValueSample_9_0, 
                                    		"AtTimePrimary");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1105:6: ( () ( (lv_value_11_0= 'now' ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1105:6: ( () ( (lv_value_11_0= 'now' ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1105:7: () ( (lv_value_11_0= 'now' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1105:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1106:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getCurrentTimeAction_4_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1111:2: ( (lv_value_11_0= 'now' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1112:1: (lv_value_11_0= 'now' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1112:1: (lv_value_11_0= 'now' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1113:3: lv_value_11_0= 'now'
                    {
                    lv_value_11_0=(Token)match(input,33,FOLLOW_33_in_ruleAtomic2278); 

                            newLeafNode(lv_value_11_0, grammarAccess.getAtomicAccess().getValueNowKeyword_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_11_0, "now");
                    	    

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


    // $ANTLR start "entryRuleEquality"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1136:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1137:2: (iv_ruleEquality= ruleEquality EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1138:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality2330);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality2340); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1145:1: ruleEquality returns [EObject current=null] : (this_Atomic_0= ruleAtomic ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Atomic_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1148:28: ( (this_Atomic_0= ruleAtomic ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1149:1: (this_Atomic_0= ruleAtomic ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1149:1: (this_Atomic_0= ruleAtomic ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1150:5: this_Atomic_0= ruleAtomic ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityAccess().getAtomicParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtomic_in_ruleEquality2387);
            this_Atomic_0=ruleAtomic();

            state._fsp--;

             
                    current = this_Atomic_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1158:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=34 && LA20_0<=35)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1158:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleAtomic ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1158:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1159:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1164:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1165:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1165:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1166:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1166:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==34) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==35) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1167:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_34_in_ruleEquality2416); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1179:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_35_in_ruleEquality2445); 

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

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1194:2: ( (lv_right_3_0= ruleAtomic ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1195:1: (lv_right_3_0= ruleAtomic )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1195:1: (lv_right_3_0= ruleAtomic )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1196:3: lv_right_3_0= ruleAtomic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightAtomicParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomic_in_ruleEquality2482);
            	    lv_right_3_0=ruleAtomic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Atomic");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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


    // $ANTLR start "entryRuleConditionRule"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1220:1: entryRuleConditionRule returns [EObject current=null] : iv_ruleConditionRule= ruleConditionRule EOF ;
    public final EObject entryRuleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1221:2: (iv_ruleConditionRule= ruleConditionRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1222:2: iv_ruleConditionRule= ruleConditionRule EOF
            {
             newCompositeNode(grammarAccess.getConditionRuleRule()); 
            pushFollow(FOLLOW_ruleConditionRule_in_entryRuleConditionRule2520);
            iv_ruleConditionRule=ruleConditionRule();

            state._fsp--;

             current =iv_ruleConditionRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionRule2530); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1229:1: ruleConditionRule returns [EObject current=null] : ( (lv_condition_0_0= ruleEquality ) ) ;
    public final EObject ruleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1232:28: ( ( (lv_condition_0_0= ruleEquality ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1233:1: ( (lv_condition_0_0= ruleEquality ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1233:1: ( (lv_condition_0_0= ruleEquality ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1234:1: (lv_condition_0_0= ruleEquality )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1234:1: (lv_condition_0_0= ruleEquality )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1235:3: lv_condition_0_0= ruleEquality
            {
             
            	        newCompositeNode(grammarAccess.getConditionRuleAccess().getConditionEqualityParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEquality_in_ruleConditionRule2575);
            lv_condition_0_0=ruleEquality();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRuleRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_0_0, 
                    		"Equality");
            	        afterParserOrEnumRuleCall();
            	    

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


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1259:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1260:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1261:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2610);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2620); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1268:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1271:28: (this_Or_0= ruleOr )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1273:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleExpression2666);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1289:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1290:2: (iv_ruleOr= ruleOr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1291:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr2700);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr2710); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1298:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1301:28: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1302:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1302:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1303:5: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr2757);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1311:1: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==36) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1311:2: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1311:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1312:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleOr2778); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1321:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1322:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1322:1: (lv_right_3_0= ruleAnd )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1323:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr2799);
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
            	    break loop21;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1347:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1348:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1349:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd2837);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd2847); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1356:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1359:28: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1360:1: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1360:1: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1361:5: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEquality_in_ruleAnd2894);
            this_Equality_0=ruleEquality();

            state._fsp--;

             
                    current = this_Equality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1369:1: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1369:2: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1369:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1370:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleAnd2915); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1379:1: ( (lv_right_3_0= ruleEquality ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1380:1: (lv_right_3_0= ruleEquality )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1380:1: (lv_right_3_0= ruleEquality )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1381:3: lv_right_3_0= ruleEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd2936);
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
            	    break loop22;
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


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1407:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1408:2: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1409:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2976);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus2986); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1416:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1419:28: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1420:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1420:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1421:5: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus3033);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;

             
                    current = this_MulOrDiv_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1429:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=38 && LA24_0<=39)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1429:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1429:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==38) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==39) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1429:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1429:3: ( () otherlv_2= '+' )
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1429:4: () otherlv_2= '+'
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1429:4: ()
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1430:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,38,FOLLOW_38_in_rulePlusOrMinus3056); 

            	                	newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1440:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1440:6: ( () otherlv_4= '-' )
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1440:7: () otherlv_4= '-'
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1440:7: ()
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1441:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,39,FOLLOW_39_in_rulePlusOrMinus3085); 

            	                	newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1450:3: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1451:1: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1451:1: (lv_right_5_0= ruleMulOrDiv )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1452:3: lv_right_5_0= ruleMulOrDiv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus3108);
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
            	    break loop24;
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


    // $ANTLR start "entryRulePrimary"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1476:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1477:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1478:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary3146);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary3156); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1485:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1488:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1489:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1489:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt25=1;
                }
                break;
            case 40:
                {
                alt25=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case 30:
            case 31:
            case 33:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1489:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1489:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1489:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePrimary3194); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimary3216);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_rulePrimary3227); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1507:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1507:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1507:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1507:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1508:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_40_in_rulePrimary3256); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1517:1: ( (lv_expression_5_0= rulePrimary ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1518:1: (lv_expression_5_0= rulePrimary )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1518:1: (lv_expression_5_0= rulePrimary )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1519:3: lv_expression_5_0= rulePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimary_in_rulePrimary3277);
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1537:5: this_Atomic_6= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary3306);
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


    // $ANTLR start "entryRuleAtTimeExpression"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1555:1: entryRuleAtTimeExpression returns [EObject current=null] : iv_ruleAtTimeExpression= ruleAtTimeExpression EOF ;
    public final EObject entryRuleAtTimeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtTimeExpression = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1556:2: (iv_ruleAtTimeExpression= ruleAtTimeExpression EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1557:2: iv_ruleAtTimeExpression= ruleAtTimeExpression EOF
            {
             newCompositeNode(grammarAccess.getAtTimeExpressionRule()); 
            pushFollow(FOLLOW_ruleAtTimeExpression_in_entryRuleAtTimeExpression3343);
            iv_ruleAtTimeExpression=ruleAtTimeExpression();

            state._fsp--;

             current =iv_ruleAtTimeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimeExpression3353); 

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
    // $ANTLR end "entryRuleAtTimeExpression"


    // $ANTLR start "ruleAtTimeExpression"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1564:1: ruleAtTimeExpression returns [EObject current=null] : (this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )* ) ;
    public final EObject ruleAtTimeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AtTimePrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1567:28: ( (this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1568:1: (this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1568:1: (this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1569:5: this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAtTimeExpressionAccess().getAtTimePrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtTimePrimary_in_ruleAtTimeExpression3400);
            this_AtTimePrimary_0=ruleAtTimePrimary();

            state._fsp--;

             
                    current = this_AtTimePrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1577:1: ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=38 && LA27_0<=39)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1577:2: () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1577:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1578:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1583:2: ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1584:1: ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1584:1: ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1585:1: (lv_op_2_1= '-' | lv_op_2_2= '+' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1585:1: (lv_op_2_1= '-' | lv_op_2_2= '+' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==39) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==38) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1586:3: lv_op_2_1= '-'
            	            {
            	            lv_op_2_1=(Token)match(input,39,FOLLOW_39_in_ruleAtTimeExpression3429); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getAtTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAtTimeExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1598:8: lv_op_2_2= '+'
            	            {
            	            lv_op_2_2=(Token)match(input,38,FOLLOW_38_in_ruleAtTimeExpression3458); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getAtTimeExpressionAccess().getOpPlusSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAtTimeExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1613:2: ( (lv_right_3_0= ruleAtTimePrimary ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1614:1: (lv_right_3_0= ruleAtTimePrimary )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1614:1: (lv_right_3_0= ruleAtTimePrimary )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1615:3: lv_right_3_0= ruleAtTimePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAtTimeExpressionAccess().getRightAtTimePrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtTimePrimary_in_ruleAtTimeExpression3495);
            	    lv_right_3_0=ruleAtTimePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAtTimeExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"AtTimePrimary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleAtTimeExpression"


    // $ANTLR start "entryRuleAtTimePrimary"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1639:1: entryRuleAtTimePrimary returns [EObject current=null] : iv_ruleAtTimePrimary= ruleAtTimePrimary EOF ;
    public final EObject entryRuleAtTimePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtTimePrimary = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1640:2: (iv_ruleAtTimePrimary= ruleAtTimePrimary EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1641:2: iv_ruleAtTimePrimary= ruleAtTimePrimary EOF
            {
             newCompositeNode(grammarAccess.getAtTimePrimaryRule()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_entryRuleAtTimePrimary3533);
            iv_ruleAtTimePrimary=ruleAtTimePrimary();

            state._fsp--;

             current =iv_ruleAtTimePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimePrimary3543); 

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
    // $ANTLR end "entryRuleAtTimePrimary"


    // $ANTLR start "ruleAtTimePrimary"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1648:1: ruleAtTimePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' ) | this_AtTimeAtomic_3= ruleAtTimeAtomic ) ;
    public final EObject ruleAtTimePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AtTimeExpression_1 = null;

        EObject this_AtTimeAtomic_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1651:28: ( ( (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' ) | this_AtTimeAtomic_3= ruleAtTimeAtomic ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1652:1: ( (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' ) | this_AtTimeAtomic_3= ruleAtTimeAtomic )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1652:1: ( (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' ) | this_AtTimeAtomic_3= ruleAtTimeAtomic )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_INT||LA28_0==33) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1652:2: (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1652:2: (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1652:4: otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAtTimePrimary3581); 

                        	newLeafNode(otherlv_0, grammarAccess.getAtTimePrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getAtTimePrimaryAccess().getAtTimeExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleAtTimeExpression_in_ruleAtTimePrimary3603);
                    this_AtTimeExpression_1=ruleAtTimeExpression();

                    state._fsp--;

                     
                            current = this_AtTimeExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAtTimePrimary3614); 

                        	newLeafNode(otherlv_2, grammarAccess.getAtTimePrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1671:5: this_AtTimeAtomic_3= ruleAtTimeAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getAtTimePrimaryAccess().getAtTimeAtomicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtTimeAtomic_in_ruleAtTimePrimary3643);
                    this_AtTimeAtomic_3=ruleAtTimeAtomic();

                    state._fsp--;

                     
                            current = this_AtTimeAtomic_3; 
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
    // $ANTLR end "ruleAtTimePrimary"


    // $ANTLR start "entryRuleAtTimeAtomic"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1687:1: entryRuleAtTimeAtomic returns [EObject current=null] : iv_ruleAtTimeAtomic= ruleAtTimeAtomic EOF ;
    public final EObject entryRuleAtTimeAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtTimeAtomic = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1688:2: (iv_ruleAtTimeAtomic= ruleAtTimeAtomic EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1689:2: iv_ruleAtTimeAtomic= ruleAtTimeAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtTimeAtomicRule()); 
            pushFollow(FOLLOW_ruleAtTimeAtomic_in_entryRuleAtTimeAtomic3678);
            iv_ruleAtTimeAtomic=ruleAtTimeAtomic();

            state._fsp--;

             current =iv_ruleAtTimeAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimeAtomic3688); 

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
    // $ANTLR end "entryRuleAtTimeAtomic"


    // $ANTLR start "ruleAtTimeAtomic"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1696:1: ruleAtTimeAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_atTimeValue_3_0= 'now' ) ) ) ) ;
    public final EObject ruleAtTimeAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_atTimeValue_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1699:28: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_atTimeValue_3_0= 'now' ) ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1700:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_atTimeValue_3_0= 'now' ) ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1700:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_atTimeValue_3_0= 'now' ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            else if ( (LA29_0==33) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1700:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1700:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1700:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1700:3: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1701:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtTimeAtomicAccess().getAtTimeIntConstantAction_0_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1706:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1707:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1707:1: (lv_value_1_0= RULE_INT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1708:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtTimeAtomic3740); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getAtTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtTimeAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1725:6: ( () ( (lv_atTimeValue_3_0= 'now' ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1725:6: ( () ( (lv_atTimeValue_3_0= 'now' ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1725:7: () ( (lv_atTimeValue_3_0= 'now' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1725:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1726:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtTimeAtomicAccess().getAtTimeCurrentTimeAction_1_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1731:2: ( (lv_atTimeValue_3_0= 'now' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1732:1: (lv_atTimeValue_3_0= 'now' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1732:1: (lv_atTimeValue_3_0= 'now' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1733:3: lv_atTimeValue_3_0= 'now'
                    {
                    lv_atTimeValue_3_0=(Token)match(input,33,FOLLOW_33_in_ruleAtTimeAtomic3780); 

                            newLeafNode(lv_atTimeValue_3_0, grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtTimeAtomicRule());
                    	        }
                           		setWithLastConsumed(current, "atTimeValue", lv_atTimeValue_3_0, "now");
                    	    

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
    // $ANTLR end "ruleAtTimeAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleEceModel_in_entryRuleEceModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEceModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleEceModel130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStatement213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatement234 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_ruleContextsList_in_ruleStatement255 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStatement267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent355 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleEvent373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventFeature_in_ruleEvent394 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleEvent407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventFeature_in_ruleEvent428 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleEvent442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_entryRuleEventFeature480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventFeature490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventFeature531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextsList_in_entryRuleContextsList571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextsList581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContextsList_in_ruleContextsList627 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleExpContextsList_in_ruleContextsList649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContextsList_in_entryRuleEcContextsList686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEcContextsList696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContext_in_ruleEcContextsList742 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEcContextsList755 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleEcContext_in_ruleEcContextsList776 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleExpContextsList_in_entryRuleExpContextsList814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpContextsList824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContext_in_ruleExpContextsList870 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleExpContextsList883 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleExpContext_in_ruleExpContextsList904 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleEcContext_in_entryRuleEcContext942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEcContext952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEcContext989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFluent_in_ruleEcContext1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContext_in_entryRuleExpContext1046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpContext1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleExpContext1093 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_ruleConditionRule_in_ruleExpContext1114 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_ruleAllenOp_in_ruleExpContext1136 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExpContext1153 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_19_in_ruleExpContext1173 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_ruleConditionRule_in_ruleExpContext1194 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleExpContext1209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpContext1226 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleExpContext1246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpContext1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllenOp_in_entryRuleAllenOp1306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllenOp1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAllenOp1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAllenOp1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAllenOp1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent1480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFluent1532 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFluent1550 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_ruleToRule_in_ruleFluent1571 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleFluent1585 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_ruleConditionRule_in_ruleFluent1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_entryRuleToRule1644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToRule1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_ruleToRule1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv1734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleMulOrDiv1791 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_26_in_ruleMulOrDiv1820 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_27_in_ruleMulOrDiv1849 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_28_in_ruleMulOrDiv1878 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_29_in_ruleMulOrDiv1907 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleMulOrDiv1944 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleAtomic2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAtomic2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAtomic2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic2207 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleAtomic2220 = new BitSet(new long[]{0x0000000200004020L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_ruleAtomic2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAtomic2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality2330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleEquality2387 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleEquality2416 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_35_in_ruleEquality2445 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleEquality2482 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_entryRuleConditionRule2520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionRule2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleConditionRule2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr2700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr2757 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleOr2778 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr2799 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd2837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd2894 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleAnd2915 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd2936 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus3033 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_38_in_rulePlusOrMinus3056 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_39_in_rulePlusOrMinus3085 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus3108 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary3146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimary3194 = new BitSet(new long[]{0x00000002C0000070L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimary3216 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimary3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePrimary3256 = new BitSet(new long[]{0x00000102C0004070L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePrimary3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeExpression_in_entryRuleAtTimeExpression3343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimeExpression3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_ruleAtTimeExpression3400 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_39_in_ruleAtTimeExpression3429 = new BitSet(new long[]{0x0000000200004020L});
    public static final BitSet FOLLOW_38_in_ruleAtTimeExpression3458 = new BitSet(new long[]{0x0000000200004020L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_ruleAtTimeExpression3495 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_entryRuleAtTimePrimary3533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimePrimary3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAtTimePrimary3581 = new BitSet(new long[]{0x0000000200004020L});
    public static final BitSet FOLLOW_ruleAtTimeExpression_in_ruleAtTimePrimary3603 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAtTimePrimary3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeAtomic_in_ruleAtTimePrimary3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeAtomic_in_entryRuleAtTimeAtomic3678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimeAtomic3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtTimeAtomic3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAtTimeAtomic3780 = new BitSet(new long[]{0x0000000000000002L});

}