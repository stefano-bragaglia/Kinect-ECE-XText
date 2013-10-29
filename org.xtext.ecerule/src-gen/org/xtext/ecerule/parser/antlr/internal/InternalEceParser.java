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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'on'", "';'", "'('", "','", "')'", "'set'", "'expect'", "'if'", "'before'", "'after'", "'in'", "'to'", "'OR'", "'AND'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'true'", "'false'", "'at'", "'now'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
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
    public static final int T__38=38;
    public static final int T__39=39;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:306:1: ruleContextsList returns [EObject current=null] : ( ( (lv_ecContextsList_0_0= ruleEcContextsList ) )? (otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) ) )? ) ;
    public final EObject ruleContextsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ecContextsList_0_0 = null;

        EObject lv_expContextsList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:309:28: ( ( ( (lv_ecContextsList_0_0= ruleEcContextsList ) )? (otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) ) )? ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:310:1: ( ( (lv_ecContextsList_0_0= ruleEcContextsList ) )? (otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) ) )? )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:310:1: ( ( (lv_ecContextsList_0_0= ruleEcContextsList ) )? (otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) ) )? )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:310:2: ( (lv_ecContextsList_0_0= ruleEcContextsList ) )? (otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) ) )?
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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:328:3: (otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:328:5: otherlv_1= ',' ( (lv_expContextsList_2_0= ruleExpContextsList ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleContextsList641); 

                        	newLeafNode(otherlv_1, grammarAccess.getContextsListAccess().getCommaKeyword_1_0());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:332:1: ( (lv_expContextsList_2_0= ruleExpContextsList ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:333:1: (lv_expContextsList_2_0= ruleExpContextsList )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:333:1: (lv_expContextsList_2_0= ruleExpContextsList )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:334:3: lv_expContextsList_2_0= ruleExpContextsList
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextsListAccess().getExpContextsListExpContextsListParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpContextsList_in_ruleContextsList662);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:358:1: entryRuleEcContextsList returns [EObject current=null] : iv_ruleEcContextsList= ruleEcContextsList EOF ;
    public final EObject entryRuleEcContextsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEcContextsList = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:359:2: (iv_ruleEcContextsList= ruleEcContextsList EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:360:2: iv_ruleEcContextsList= ruleEcContextsList EOF
            {
             newCompositeNode(grammarAccess.getEcContextsListRule()); 
            pushFollow(FOLLOW_ruleEcContextsList_in_entryRuleEcContextsList700);
            iv_ruleEcContextsList=ruleEcContextsList();

            state._fsp--;

             current =iv_ruleEcContextsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEcContextsList710); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:367:1: ruleEcContextsList returns [EObject current=null] : ( ( (lv_ecContexts_0_0= ruleEcContext ) ) (otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) ) )* ) ;
    public final EObject ruleEcContextsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ecContexts_0_0 = null;

        EObject lv_ecContexts_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:370:28: ( ( ( (lv_ecContexts_0_0= ruleEcContext ) ) (otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:371:1: ( ( (lv_ecContexts_0_0= ruleEcContext ) ) (otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:371:1: ( ( (lv_ecContexts_0_0= ruleEcContext ) ) (otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:371:2: ( (lv_ecContexts_0_0= ruleEcContext ) ) (otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) ) )*
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:371:2: ( (lv_ecContexts_0_0= ruleEcContext ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:372:1: (lv_ecContexts_0_0= ruleEcContext )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:372:1: (lv_ecContexts_0_0= ruleEcContext )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:373:3: lv_ecContexts_0_0= ruleEcContext
            {
             
            	        newCompositeNode(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEcContext_in_ruleEcContextsList756);
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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:389:2: (otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==17) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:389:4: otherlv_1= ',' ( (lv_ecContexts_2_0= ruleEcContext ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleEcContextsList769); 

            	        	newLeafNode(otherlv_1, grammarAccess.getEcContextsListAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:393:1: ( (lv_ecContexts_2_0= ruleEcContext ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:394:1: (lv_ecContexts_2_0= ruleEcContext )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:394:1: (lv_ecContexts_2_0= ruleEcContext )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:395:3: lv_ecContexts_2_0= ruleEcContext
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEcContext_in_ruleEcContextsList790);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:419:1: entryRuleExpContextsList returns [EObject current=null] : iv_ruleExpContextsList= ruleExpContextsList EOF ;
    public final EObject entryRuleExpContextsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpContextsList = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:420:2: (iv_ruleExpContextsList= ruleExpContextsList EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:421:2: iv_ruleExpContextsList= ruleExpContextsList EOF
            {
             newCompositeNode(grammarAccess.getExpContextsListRule()); 
            pushFollow(FOLLOW_ruleExpContextsList_in_entryRuleExpContextsList828);
            iv_ruleExpContextsList=ruleExpContextsList();

            state._fsp--;

             current =iv_ruleExpContextsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpContextsList838); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:428:1: ruleExpContextsList returns [EObject current=null] : ( ( (lv_expContexts_0_0= ruleExpContext ) ) (otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) ) )* ) ;
    public final EObject ruleExpContextsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expContexts_0_0 = null;

        EObject lv_expContexts_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:431:28: ( ( ( (lv_expContexts_0_0= ruleExpContext ) ) (otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:432:1: ( ( (lv_expContexts_0_0= ruleExpContext ) ) (otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:432:1: ( ( (lv_expContexts_0_0= ruleExpContext ) ) (otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:432:2: ( (lv_expContexts_0_0= ruleExpContext ) ) (otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) ) )*
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:432:2: ( (lv_expContexts_0_0= ruleExpContext ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:433:1: (lv_expContexts_0_0= ruleExpContext )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:433:1: (lv_expContexts_0_0= ruleExpContext )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:434:3: lv_expContexts_0_0= ruleExpContext
            {
             
            	        newCompositeNode(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpContext_in_ruleExpContextsList884);
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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:450:2: (otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:450:4: otherlv_1= ',' ( (lv_expContexts_2_0= ruleExpContext ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleExpContextsList897); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExpContextsListAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:454:1: ( (lv_expContexts_2_0= ruleExpContext ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:455:1: (lv_expContexts_2_0= ruleExpContext )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:455:1: (lv_expContexts_2_0= ruleExpContext )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:456:3: lv_expContexts_2_0= ruleExpContext
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpContext_in_ruleExpContextsList918);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:480:1: entryRuleEcContext returns [EObject current=null] : iv_ruleEcContext= ruleEcContext EOF ;
    public final EObject entryRuleEcContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEcContext = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:481:2: (iv_ruleEcContext= ruleEcContext EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:482:2: iv_ruleEcContext= ruleEcContext EOF
            {
             newCompositeNode(grammarAccess.getEcContextRule()); 
            pushFollow(FOLLOW_ruleEcContext_in_entryRuleEcContext956);
            iv_ruleEcContext=ruleEcContext();

            state._fsp--;

             current =iv_ruleEcContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEcContext966); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:489:1: ruleEcContext returns [EObject current=null] : (otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) (otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) ) )* ) ;
    public final EObject ruleEcContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fluent_1_0 = null;

        EObject lv_fluent_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:492:28: ( (otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) (otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:493:1: (otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) (otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:493:1: (otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) (otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:493:3: otherlv_0= 'set' ( (lv_fluent_1_0= ruleFluent ) ) (otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEcContext1003); 

                	newLeafNode(otherlv_0, grammarAccess.getEcContextAccess().getSetKeyword_0());
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:497:1: ( (lv_fluent_1_0= ruleFluent ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:498:1: (lv_fluent_1_0= ruleFluent )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:498:1: (lv_fluent_1_0= ruleFluent )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:499:3: lv_fluent_1_0= ruleFluent
            {
             
            	        newCompositeNode(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFluent_in_ruleEcContext1024);
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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:515:2: (otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:515:4: otherlv_2= ',' ( (lv_fluent_3_0= ruleFluent ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEcContext1037); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEcContextAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:519:1: ( (lv_fluent_3_0= ruleFluent ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:520:1: (lv_fluent_3_0= ruleFluent )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:520:1: (lv_fluent_3_0= ruleFluent )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:521:3: lv_fluent_3_0= ruleFluent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFluent_in_ruleEcContext1058);
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
            	    break loop8;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:545:1: entryRuleExpContext returns [EObject current=null] : iv_ruleExpContext= ruleExpContext EOF ;
    public final EObject entryRuleExpContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpContext = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:546:2: (iv_ruleExpContext= ruleExpContext EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:547:2: iv_ruleExpContext= ruleExpContext EOF
            {
             newCompositeNode(grammarAccess.getExpContextRule()); 
            pushFollow(FOLLOW_ruleExpContext_in_entryRuleExpContext1096);
            iv_ruleExpContext=ruleExpContext();

            state._fsp--;

             current =iv_ruleExpContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpContext1106); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:554:1: ruleExpContext returns [EObject current=null] : (otherlv_0= 'expect' ( (lv_finalCondition_1_0= ruleConditionRule ) ) ( ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= rulePlusOrMinus ) ) )? (otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) ) )? ) ;
    public final EObject ruleExpContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_finalCondition_1_0 = null;

        EObject lv_allenOp_2_0 = null;

        EObject lv_time_3_0 = null;

        EObject lv_initialCondition_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:557:28: ( (otherlv_0= 'expect' ( (lv_finalCondition_1_0= ruleConditionRule ) ) ( ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= rulePlusOrMinus ) ) )? (otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) ) )? ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:558:1: (otherlv_0= 'expect' ( (lv_finalCondition_1_0= ruleConditionRule ) ) ( ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= rulePlusOrMinus ) ) )? (otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) ) )? )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:558:1: (otherlv_0= 'expect' ( (lv_finalCondition_1_0= ruleConditionRule ) ) ( ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= rulePlusOrMinus ) ) )? (otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) ) )? )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:558:3: otherlv_0= 'expect' ( (lv_finalCondition_1_0= ruleConditionRule ) ) ( ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= rulePlusOrMinus ) ) )? (otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleExpContext1143); 

                	newLeafNode(otherlv_0, grammarAccess.getExpContextAccess().getExpectKeyword_0());
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:562:1: ( (lv_finalCondition_1_0= ruleConditionRule ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:563:1: (lv_finalCondition_1_0= ruleConditionRule )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:563:1: (lv_finalCondition_1_0= ruleConditionRule )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:564:3: lv_finalCondition_1_0= ruleConditionRule
            {
             
            	        newCompositeNode(grammarAccess.getExpContextAccess().getFinalConditionConditionRuleParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionRule_in_ruleExpContext1164);
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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:580:2: ( ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= rulePlusOrMinus ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=20 && LA9_0<=22)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:580:3: ( (lv_allenOp_2_0= ruleAllenOp ) ) ( (lv_time_3_0= rulePlusOrMinus ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:580:3: ( (lv_allenOp_2_0= ruleAllenOp ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:581:1: (lv_allenOp_2_0= ruleAllenOp )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:581:1: (lv_allenOp_2_0= ruleAllenOp )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:582:3: lv_allenOp_2_0= ruleAllenOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpContextAccess().getAllenOpAllenOpParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAllenOp_in_ruleExpContext1186);
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

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:598:2: ( (lv_time_3_0= rulePlusOrMinus ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:599:1: (lv_time_3_0= rulePlusOrMinus )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:599:1: (lv_time_3_0= rulePlusOrMinus )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:600:3: lv_time_3_0= rulePlusOrMinus
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpContextAccess().getTimePlusOrMinusParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleExpContext1207);
                    lv_time_3_0=rulePlusOrMinus();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpContextRule());
                    	        }
                           		set(
                           			current, 
                           			"time",
                            		lv_time_3_0, 
                            		"PlusOrMinus");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:616:4: (otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:616:6: otherlv_4= 'if' ( (lv_initialCondition_5_0= ruleConditionRule ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleExpContext1222); 

                        	newLeafNode(otherlv_4, grammarAccess.getExpContextAccess().getIfKeyword_3_0());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:620:1: ( (lv_initialCondition_5_0= ruleConditionRule ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:621:1: (lv_initialCondition_5_0= ruleConditionRule )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:621:1: (lv_initialCondition_5_0= ruleConditionRule )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:622:3: lv_initialCondition_5_0= ruleConditionRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpContextAccess().getInitialConditionConditionRuleParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConditionRule_in_ruleExpContext1243);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:646:1: entryRuleAllenOp returns [EObject current=null] : iv_ruleAllenOp= ruleAllenOp EOF ;
    public final EObject entryRuleAllenOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllenOp = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:647:2: (iv_ruleAllenOp= ruleAllenOp EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:648:2: iv_ruleAllenOp= ruleAllenOp EOF
            {
             newCompositeNode(grammarAccess.getAllenOpRule()); 
            pushFollow(FOLLOW_ruleAllenOp_in_entryRuleAllenOp1281);
            iv_ruleAllenOp=ruleAllenOp();

            state._fsp--;

             current =iv_ruleAllenOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllenOp1291); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:655:1: ruleAllenOp returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) ) ) ) ;
    public final EObject ruleAllenOp() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token lv_value_1_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:658:28: ( ( () ( ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:659:1: ( () ( ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:659:1: ( () ( ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:659:2: () ( ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:659:2: ()
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:660:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAllenOpAccess().getAllenOperatorAction_0(),
                        current);
                

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:665:2: ( ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:666:1: ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:666:1: ( (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:667:1: (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:667:1: (lv_value_1_1= 'before' | lv_value_1_2= 'after' | lv_value_1_3= 'in' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case 21:
                {
                alt11=2;
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:668:3: lv_value_1_1= 'before'
                    {
                    lv_value_1_1=(Token)match(input,20,FOLLOW_20_in_ruleAllenOp1345); 

                            newLeafNode(lv_value_1_1, grammarAccess.getAllenOpAccess().getValueBeforeKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllenOpRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:680:8: lv_value_1_2= 'after'
                    {
                    lv_value_1_2=(Token)match(input,21,FOLLOW_21_in_ruleAllenOp1374); 

                            newLeafNode(lv_value_1_2, grammarAccess.getAllenOpAccess().getValueAfterKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllenOpRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:692:8: lv_value_1_3= 'in'
                    {
                    lv_value_1_3=(Token)match(input,22,FOLLOW_22_in_ruleAllenOp1403); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:715:1: entryRuleFluent returns [EObject current=null] : iv_ruleFluent= ruleFluent EOF ;
    public final EObject entryRuleFluent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFluent = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:716:2: (iv_ruleFluent= ruleFluent EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:717:2: iv_ruleFluent= ruleFluent EOF
            {
             newCompositeNode(grammarAccess.getFluentRule()); 
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent1455);
            iv_ruleFluent=ruleFluent();

            state._fsp--;

             current =iv_ruleFluent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent1465); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:724:1: ruleFluent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? ) ;
    public final EObject ruleFluent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_valuePart_2_0 = null;

        EObject lv_timePart_4_0 = null;

        EObject lv_condPart_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:727:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:728:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:728:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )? )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:728:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) ) (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )? (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )?
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:728:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:729:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:729:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:730:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFluent1507); 

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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:746:2: (otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:746:4: otherlv_1= 'to' ( (lv_valuePart_2_0= ruleToRule ) )
            {
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleFluent1525); 

                	newLeafNode(otherlv_1, grammarAccess.getFluentAccess().getToKeyword_1_0());
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:750:1: ( (lv_valuePart_2_0= ruleToRule ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:751:1: (lv_valuePart_2_0= ruleToRule )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:751:1: (lv_valuePart_2_0= ruleToRule )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:752:3: lv_valuePart_2_0= ruleToRule
            {
             
            	        newCompositeNode(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
            	    
            pushFollow(FOLLOW_ruleToRule_in_ruleFluent1546);
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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:768:3: (otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:768:5: otherlv_3= 'in' ( (lv_timePart_4_0= ruleInRule ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleFluent1560); 

                        	newLeafNode(otherlv_3, grammarAccess.getFluentAccess().getInKeyword_2_0());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:772:1: ( (lv_timePart_4_0= ruleInRule ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:773:1: (lv_timePart_4_0= ruleInRule )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:773:1: (lv_timePart_4_0= ruleInRule )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:774:3: lv_timePart_4_0= ruleInRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInRule_in_ruleFluent1581);
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

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:790:4: (otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:790:6: otherlv_5= 'if' ( (lv_condPart_6_0= ruleConditionRule ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleFluent1596); 

                        	newLeafNode(otherlv_5, grammarAccess.getFluentAccess().getIfKeyword_3_0());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:794:1: ( (lv_condPart_6_0= ruleConditionRule ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:795:1: (lv_condPart_6_0= ruleConditionRule )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:795:1: (lv_condPart_6_0= ruleConditionRule )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:796:3: lv_condPart_6_0= ruleConditionRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConditionRule_in_ruleFluent1617);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:820:1: entryRuleConditionRule returns [EObject current=null] : iv_ruleConditionRule= ruleConditionRule EOF ;
    public final EObject entryRuleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:821:2: (iv_ruleConditionRule= ruleConditionRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:822:2: iv_ruleConditionRule= ruleConditionRule EOF
            {
             newCompositeNode(grammarAccess.getConditionRuleRule()); 
            pushFollow(FOLLOW_ruleConditionRule_in_entryRuleConditionRule1655);
            iv_ruleConditionRule=ruleConditionRule();

            state._fsp--;

             current =iv_ruleConditionRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionRule1665); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:829:1: ruleConditionRule returns [EObject current=null] : ( () ( (lv_condition_1_0= ruleExpression ) ) ) ;
    public final EObject ruleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:832:28: ( ( () ( (lv_condition_1_0= ruleExpression ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:833:1: ( () ( (lv_condition_1_0= ruleExpression ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:833:1: ( () ( (lv_condition_1_0= ruleExpression ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:833:2: () ( (lv_condition_1_0= ruleExpression ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:833:2: ()
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:834:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConditionRuleAccess().getExpressionAction_0(),
                        current);
                

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:839:2: ( (lv_condition_1_0= ruleExpression ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:840:1: (lv_condition_1_0= ruleExpression )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:840:1: (lv_condition_1_0= ruleExpression )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:841:3: lv_condition_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getConditionRuleAccess().getConditionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleConditionRule1720);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:865:1: entryRuleToRule returns [EObject current=null] : iv_ruleToRule= ruleToRule EOF ;
    public final EObject entryRuleToRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:866:2: (iv_ruleToRule= ruleToRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:867:2: iv_ruleToRule= ruleToRule EOF
            {
             newCompositeNode(grammarAccess.getToRuleRule()); 
            pushFollow(FOLLOW_ruleToRule_in_entryRuleToRule1756);
            iv_ruleToRule=ruleToRule();

            state._fsp--;

             current =iv_ruleToRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToRule1766); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:874:1: ruleToRule returns [EObject current=null] : ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) ) ;
    public final EObject ruleToRule() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:877:28: ( ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:878:1: ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:878:1: ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:878:2: () ( (lv_expression_1_0= rulePlusOrMinus ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:878:2: ()
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:879:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getToRuleAccess().getExpressionAction_0(),
                        current);
                

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:884:2: ( (lv_expression_1_0= rulePlusOrMinus ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:885:1: (lv_expression_1_0= rulePlusOrMinus )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:885:1: (lv_expression_1_0= rulePlusOrMinus )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:886:3: lv_expression_1_0= rulePlusOrMinus
            {
             
            	        newCompositeNode(grammarAccess.getToRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleToRule1821);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:910:1: entryRuleInRule returns [EObject current=null] : iv_ruleInRule= ruleInRule EOF ;
    public final EObject entryRuleInRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInRule = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:911:2: (iv_ruleInRule= ruleInRule EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:912:2: iv_ruleInRule= ruleInRule EOF
            {
             newCompositeNode(grammarAccess.getInRuleRule()); 
            pushFollow(FOLLOW_ruleInRule_in_entryRuleInRule1857);
            iv_ruleInRule=ruleInRule();

            state._fsp--;

             current =iv_ruleInRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInRule1867); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:919:1: ruleInRule returns [EObject current=null] : ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) ) ;
    public final EObject ruleInRule() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:922:28: ( ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:923:1: ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:923:1: ( () ( (lv_expression_1_0= rulePlusOrMinus ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:923:2: () ( (lv_expression_1_0= rulePlusOrMinus ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:923:2: ()
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:924:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInRuleAccess().getExpressionAction_0(),
                        current);
                

            }

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:929:2: ( (lv_expression_1_0= rulePlusOrMinus ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:930:1: (lv_expression_1_0= rulePlusOrMinus )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:930:1: (lv_expression_1_0= rulePlusOrMinus )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:931:3: lv_expression_1_0= rulePlusOrMinus
            {
             
            	        newCompositeNode(grammarAccess.getInRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleInRule1922);
            lv_expression_1_0=rulePlusOrMinus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInRuleRule());
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
    // $ANTLR end "ruleInRule"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:955:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:956:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:957:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1958);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1968); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:964:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:967:28: (this_Or_0= ruleOr )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:969:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleExpression2014);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:985:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:986:2: (iv_ruleOr= ruleOr EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:987:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr2048);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr2058); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:994:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:997:28: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:998:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:998:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:999:5: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr2105);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1007:1: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1007:2: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1007:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1008:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleOr2126); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1017:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1018:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1018:1: (lv_right_3_0= ruleAnd )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1019:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr2147);
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
            	    break loop14;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1043:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1044:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1045:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd2185);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd2195); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1052:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1055:28: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1056:1: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1056:1: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1057:5: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEquality_in_ruleAnd2242);
            this_Equality_0=ruleEquality();

            state._fsp--;

             
                    current = this_Equality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1065:1: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1065:2: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1065:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1066:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAnd2263); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	        
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1075:1: ( (lv_right_3_0= ruleEquality ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1076:1: (lv_right_3_0= ruleEquality )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1076:1: (lv_right_3_0= ruleEquality )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1077:3: lv_right_3_0= ruleEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd2284);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1101:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1102:2: (iv_ruleEquality= ruleEquality EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1103:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality2322);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality2332); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1110:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1113:28: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1114:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1114:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1115:5: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleEquality2379);
            this_Comparison_0=ruleComparison();

            state._fsp--;

             
                    current = this_Comparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1123:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=26 && LA17_0<=27)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1123:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1123:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1124:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1129:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1130:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1130:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1131:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1131:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==26) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==27) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1132:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,26,FOLLOW_26_in_ruleEquality2408); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1144:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,27,FOLLOW_27_in_ruleEquality2437); 

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

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1159:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1160:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1160:1: (lv_right_3_0= ruleComparison )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1161:3: lv_right_3_0= ruleComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparison_in_ruleEquality2474);
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1185:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1186:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1187:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison2512);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison2522); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1194:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1197:28: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1198:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1198:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1199:5: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison2569);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;

             
                    current = this_PlusOrMinus_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1207:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=28 && LA19_0<=31)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1207:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1207:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1208:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1213:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1214:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1214:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1215:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1215:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt18=4;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case 31:
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
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1216:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,28,FOLLOW_28_in_ruleComparison2598); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1228:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,29,FOLLOW_29_in_ruleComparison2627); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1240:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,30,FOLLOW_30_in_ruleComparison2656); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1252:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,31,FOLLOW_31_in_ruleComparison2685); 

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

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1267:2: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1268:1: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1268:1: (lv_right_3_0= rulePlusOrMinus )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1269:3: lv_right_3_0= rulePlusOrMinus
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison2722);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1293:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1294:2: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1295:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2760);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus2770); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1302:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1305:28: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1306:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1306:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1307:5: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2817);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;

             
                    current = this_MulOrDiv_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1315:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=32 && LA21_0<=33)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1315:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1315:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==32) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==33) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1315:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1315:3: ( () otherlv_2= '+' )
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1315:4: () otherlv_2= '+'
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1315:4: ()
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1316:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,32,FOLLOW_32_in_rulePlusOrMinus2840); 

            	                	newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1326:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1326:6: ( () otherlv_4= '-' )
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1326:7: () otherlv_4= '-'
            	            {
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1326:7: ()
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1327:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,33,FOLLOW_33_in_rulePlusOrMinus2869); 

            	                	newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1336:3: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1337:1: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1337:1: (lv_right_5_0= ruleMulOrDiv )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1338:3: lv_right_5_0= ruleMulOrDiv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2892);
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1362:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1363:2: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1364:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2930);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv2940); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1371:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1374:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1375:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1375:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1376:5: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv2987);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1384:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=34 && LA23_0<=37)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1384:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1384:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1385:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1390:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1391:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1391:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1392:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1392:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' | lv_op_2_4= '^' )
            	    int alt22=4;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    case 37:
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
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1393:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_34_in_ruleMulOrDiv3016); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1405:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_35_in_ruleMulOrDiv3045); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1417:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,36,FOLLOW_36_in_ruleMulOrDiv3074); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1429:8: lv_op_2_4= '^'
            	            {
            	            lv_op_2_4=(Token)match(input,37,FOLLOW_37_in_ruleMulOrDiv3103); 

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

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1444:2: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1445:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1445:1: (lv_right_3_0= rulePrimary )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1446:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv3140);
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
            	    break loop23;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1470:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1471:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1472:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary3178);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary3188); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1479:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1482:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1483:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1483:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt24=1;
                }
                break;
            case 38:
                {
                alt24=2;
                }
                break;
            case RULE_ID:
            case RULE_FLOAT:
            case RULE_INT:
            case 39:
            case 40:
            case 42:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1483:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1483:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1483:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePrimary3226); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimary3248);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_rulePrimary3259); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1501:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1501:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1501:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1501:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1502:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,38,FOLLOW_38_in_rulePrimary3288); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1511:1: ( (lv_expression_5_0= rulePrimary ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1512:1: (lv_expression_5_0= rulePrimary )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1512:1: (lv_expression_5_0= rulePrimary )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1513:3: lv_expression_5_0= rulePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimary_in_rulePrimary3309);
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1531:5: this_Atomic_6= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary3338);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1547:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1548:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1549:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic3373);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic3383); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1556:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? ) | ( () ( (lv_value_11_0= 'now' ) ) ) ) ;
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
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1559:28: ( ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? ) | ( () ( (lv_value_11_0= 'now' ) ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1560:1: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? ) | ( () ( (lv_value_11_0= 'now' ) ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1560:1: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? ) | ( () ( (lv_value_11_0= 'now' ) ) ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt27=1;
                }
                break;
            case RULE_INT:
                {
                alt27=2;
                }
                break;
            case 39:
            case 40:
                {
                alt27=3;
                }
                break;
            case RULE_ID:
                {
                alt27=4;
                }
                break;
            case 42:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1560:2: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1560:2: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1560:3: () ( (lv_value_1_0= RULE_FLOAT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1560:3: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1561:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getFloatConstantAction_0_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1566:2: ( (lv_value_1_0= RULE_FLOAT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1567:1: (lv_value_1_0= RULE_FLOAT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1567:1: (lv_value_1_0= RULE_FLOAT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1568:3: lv_value_1_0= RULE_FLOAT
                    {
                    lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleAtomic3435); 

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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1585:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1585:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1585:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1585:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1586:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getIntConstantAction_1_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1591:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1592:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1592:1: (lv_value_3_0= RULE_INT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1593:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic3474); 

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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1610:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1610:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1610:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1610:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1611:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1616:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1617:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1617:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1618:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1618:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==39) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==40) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1619:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,39,FOLLOW_39_in_ruleAtomic3516); 

                                    newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1631:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,40,FOLLOW_40_in_ruleAtomic3545); 

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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1647:6: ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1647:6: ( () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )? )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1647:7: () ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )?
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1647:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1648:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getReferenceAction_3_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1653:2: ( (otherlv_7= RULE_ID ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1654:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1654:1: (otherlv_7= RULE_ID )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1655:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic3598); 

                    		newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getRefReferenceTypeCrossReference_3_1_0()); 
                    	

                    }


                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1666:2: (otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==41) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1666:4: otherlv_8= 'at' ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) )
                            {
                            otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleAtomic3611); 

                                	newLeafNode(otherlv_8, grammarAccess.getAtomicAccess().getAtKeyword_3_2_0());
                                
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1670:1: ( (lv_fluentValueSample_9_0= ruleAtTimePrimary ) )
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1671:1: (lv_fluentValueSample_9_0= ruleAtTimePrimary )
                            {
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1671:1: (lv_fluentValueSample_9_0= ruleAtTimePrimary )
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1672:3: lv_fluentValueSample_9_0= ruleAtTimePrimary
                            {
                             
                            	        newCompositeNode(grammarAccess.getAtomicAccess().getFluentValueSampleAtTimePrimaryParserRuleCall_3_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAtTimePrimary_in_ruleAtomic3632);
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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1689:6: ( () ( (lv_value_11_0= 'now' ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1689:6: ( () ( (lv_value_11_0= 'now' ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1689:7: () ( (lv_value_11_0= 'now' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1689:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1690:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getCurrentTimeAction_4_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1695:2: ( (lv_value_11_0= 'now' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1696:1: (lv_value_11_0= 'now' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1696:1: (lv_value_11_0= 'now' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1697:3: lv_value_11_0= 'now'
                    {
                    lv_value_11_0=(Token)match(input,42,FOLLOW_42_in_ruleAtomic3669); 

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


    // $ANTLR start "entryRuleAtTimeExpression"
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1720:1: entryRuleAtTimeExpression returns [EObject current=null] : iv_ruleAtTimeExpression= ruleAtTimeExpression EOF ;
    public final EObject entryRuleAtTimeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtTimeExpression = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1721:2: (iv_ruleAtTimeExpression= ruleAtTimeExpression EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1722:2: iv_ruleAtTimeExpression= ruleAtTimeExpression EOF
            {
             newCompositeNode(grammarAccess.getAtTimeExpressionRule()); 
            pushFollow(FOLLOW_ruleAtTimeExpression_in_entryRuleAtTimeExpression3721);
            iv_ruleAtTimeExpression=ruleAtTimeExpression();

            state._fsp--;

             current =iv_ruleAtTimeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimeExpression3731); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1729:1: ruleAtTimeExpression returns [EObject current=null] : (this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )* ) ;
    public final EObject ruleAtTimeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AtTimePrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1732:28: ( (this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )* ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1733:1: (this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )* )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1733:1: (this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1734:5: this_AtTimePrimary_0= ruleAtTimePrimary ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAtTimeExpressionAccess().getAtTimePrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtTimePrimary_in_ruleAtTimeExpression3778);
            this_AtTimePrimary_0=ruleAtTimePrimary();

            state._fsp--;

             
                    current = this_AtTimePrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1742:1: ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=32 && LA29_0<=33)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1742:2: () ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) ) ( (lv_right_3_0= ruleAtTimePrimary ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1742:2: ()
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1743:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1748:2: ( ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1749:1: ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1749:1: ( (lv_op_2_1= '-' | lv_op_2_2= '+' ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1750:1: (lv_op_2_1= '-' | lv_op_2_2= '+' )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1750:1: (lv_op_2_1= '-' | lv_op_2_2= '+' )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==33) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==32) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1751:3: lv_op_2_1= '-'
            	            {
            	            lv_op_2_1=(Token)match(input,33,FOLLOW_33_in_ruleAtTimeExpression3807); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getAtTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAtTimeExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1763:8: lv_op_2_2= '+'
            	            {
            	            lv_op_2_2=(Token)match(input,32,FOLLOW_32_in_ruleAtTimeExpression3836); 

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

            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1778:2: ( (lv_right_3_0= ruleAtTimePrimary ) )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1779:1: (lv_right_3_0= ruleAtTimePrimary )
            	    {
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1779:1: (lv_right_3_0= ruleAtTimePrimary )
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1780:3: lv_right_3_0= ruleAtTimePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAtTimeExpressionAccess().getRightAtTimePrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtTimePrimary_in_ruleAtTimeExpression3873);
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
            	    break loop29;
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1804:1: entryRuleAtTimePrimary returns [EObject current=null] : iv_ruleAtTimePrimary= ruleAtTimePrimary EOF ;
    public final EObject entryRuleAtTimePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtTimePrimary = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1805:2: (iv_ruleAtTimePrimary= ruleAtTimePrimary EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1806:2: iv_ruleAtTimePrimary= ruleAtTimePrimary EOF
            {
             newCompositeNode(grammarAccess.getAtTimePrimaryRule()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_entryRuleAtTimePrimary3911);
            iv_ruleAtTimePrimary=ruleAtTimePrimary();

            state._fsp--;

             current =iv_ruleAtTimePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimePrimary3921); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1813:1: ruleAtTimePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' ) | this_AtTimeAtomic_3= ruleAtTimeAtomic ) ;
    public final EObject ruleAtTimePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AtTimeExpression_1 = null;

        EObject this_AtTimeAtomic_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1816:28: ( ( (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' ) | this_AtTimeAtomic_3= ruleAtTimeAtomic ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1817:1: ( (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' ) | this_AtTimeAtomic_3= ruleAtTimeAtomic )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1817:1: ( (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' ) | this_AtTimeAtomic_3= ruleAtTimeAtomic )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_INT||LA30_0==42) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1817:2: (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1817:2: (otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1817:4: otherlv_0= '(' this_AtTimeExpression_1= ruleAtTimeExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAtTimePrimary3959); 

                        	newLeafNode(otherlv_0, grammarAccess.getAtTimePrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getAtTimePrimaryAccess().getAtTimeExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleAtTimeExpression_in_ruleAtTimePrimary3981);
                    this_AtTimeExpression_1=ruleAtTimeExpression();

                    state._fsp--;

                     
                            current = this_AtTimeExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAtTimePrimary3992); 

                        	newLeafNode(otherlv_2, grammarAccess.getAtTimePrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1836:5: this_AtTimeAtomic_3= ruleAtTimeAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getAtTimePrimaryAccess().getAtTimeAtomicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtTimeAtomic_in_ruleAtTimePrimary4021);
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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1852:1: entryRuleAtTimeAtomic returns [EObject current=null] : iv_ruleAtTimeAtomic= ruleAtTimeAtomic EOF ;
    public final EObject entryRuleAtTimeAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtTimeAtomic = null;


        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1853:2: (iv_ruleAtTimeAtomic= ruleAtTimeAtomic EOF )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1854:2: iv_ruleAtTimeAtomic= ruleAtTimeAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtTimeAtomicRule()); 
            pushFollow(FOLLOW_ruleAtTimeAtomic_in_entryRuleAtTimeAtomic4056);
            iv_ruleAtTimeAtomic=ruleAtTimeAtomic();

            state._fsp--;

             current =iv_ruleAtTimeAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimeAtomic4066); 

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
    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1861:1: ruleAtTimeAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_atTimeValue_3_0= 'now' ) ) ) ) ;
    public final EObject ruleAtTimeAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_atTimeValue_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1864:28: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_atTimeValue_3_0= 'now' ) ) ) ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1865:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_atTimeValue_3_0= 'now' ) ) ) )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1865:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_atTimeValue_3_0= 'now' ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                alt31=1;
            }
            else if ( (LA31_0==42) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1865:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1865:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1865:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1865:3: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1866:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtTimeAtomicAccess().getAtTimeIntConstantAction_0_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1871:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1872:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1872:1: (lv_value_1_0= RULE_INT )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1873:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtTimeAtomic4118); 

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
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1890:6: ( () ( (lv_atTimeValue_3_0= 'now' ) ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1890:6: ( () ( (lv_atTimeValue_3_0= 'now' ) ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1890:7: () ( (lv_atTimeValue_3_0= 'now' ) )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1890:7: ()
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1891:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtTimeAtomicAccess().getAtTimeCurrentTimeAction_1_0(),
                                current);
                        

                    }

                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1896:2: ( (lv_atTimeValue_3_0= 'now' ) )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1897:1: (lv_atTimeValue_3_0= 'now' )
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1897:1: (lv_atTimeValue_3_0= 'now' )
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1898:3: lv_atTimeValue_3_0= 'now'
                    {
                    lv_atTimeValue_3_0=(Token)match(input,42,FOLLOW_42_in_ruleAtTimeAtomic4158); 

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
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatement234 = new BitSet(new long[]{0x000000000002A000L});
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
    public static final BitSet FOLLOW_ruleEcContextsList_in_ruleContextsList627 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleContextsList641 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleExpContextsList_in_ruleContextsList662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContextsList_in_entryRuleEcContextsList700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEcContextsList710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContext_in_ruleEcContextsList756 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEcContextsList769 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleEcContext_in_ruleEcContextsList790 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleExpContextsList_in_entryRuleExpContextsList828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpContextsList838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContext_in_ruleExpContextsList884 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleExpContextsList897 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleExpContext_in_ruleExpContextsList918 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleEcContext_in_entryRuleEcContext956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEcContext966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEcContext1003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFluent_in_ruleEcContext1024 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEcContext1037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFluent_in_ruleEcContext1058 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleExpContext_in_entryRuleExpContext1096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpContext1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleExpContext1143 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_ruleConditionRule_in_ruleExpContext1164 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_ruleAllenOp_in_ruleExpContext1186 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleExpContext1207 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleExpContext1222 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_ruleConditionRule_in_ruleExpContext1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllenOp_in_entryRuleAllenOp1281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllenOp1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAllenOp1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAllenOp1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAllenOp1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent1455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFluent1507 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFluent1525 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_ruleToRule_in_ruleFluent1546 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_22_in_ruleFluent1560 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_ruleInRule_in_ruleFluent1581 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleFluent1596 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_ruleConditionRule_in_ruleFluent1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_entryRuleConditionRule1655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionRule1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditionRule1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_entryRuleToRule1756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToRule1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleToRule1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_entryRuleInRule1857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInRule1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleInRule1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr2048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr2105 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleOr2126 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr2147 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd2185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd2242 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleAnd2263 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd2284 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality2322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality2379 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_ruleEquality2408 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_27_in_ruleEquality2437 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality2474 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison2512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison2569 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_28_in_ruleComparison2598 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_29_in_ruleComparison2627 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_30_in_ruleComparison2656 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_31_in_ruleComparison2685 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison2722 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2817 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_32_in_rulePlusOrMinus2840 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_33_in_rulePlusOrMinus2869 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2892 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv2987 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_34_in_ruleMulOrDiv3016 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_35_in_ruleMulOrDiv3045 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_36_in_ruleMulOrDiv3074 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_37_in_ruleMulOrDiv3103 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv3140 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary3178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimary3226 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimary3248 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimary3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePrimary3288 = new BitSet(new long[]{0x000005C000004070L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePrimary3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic3373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleAtomic3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAtomic3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAtomic3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic3598 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleAtomic3611 = new BitSet(new long[]{0x0000040000004040L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_ruleAtomic3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAtomic3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeExpression_in_entryRuleAtTimeExpression3721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimeExpression3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_ruleAtTimeExpression3778 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_33_in_ruleAtTimeExpression3807 = new BitSet(new long[]{0x0000040000004040L});
    public static final BitSet FOLLOW_32_in_ruleAtTimeExpression3836 = new BitSet(new long[]{0x0000040000004040L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_ruleAtTimeExpression3873 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_entryRuleAtTimePrimary3911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimePrimary3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAtTimePrimary3959 = new BitSet(new long[]{0x0000040000004040L});
    public static final BitSet FOLLOW_ruleAtTimeExpression_in_ruleAtTimePrimary3981 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAtTimePrimary3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeAtomic_in_ruleAtTimePrimary4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeAtomic_in_entryRuleAtTimeAtomic4056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimeAtomic4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtTimeAtomic4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAtTimeAtomic4158 = new BitSet(new long[]{0x0000000000000002L});

}