package org.xtext.ecerule.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.ecerule.services.EceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'before'", "'after'", "'in'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'%'", "'^'", "'true'", "'false'", "'-'", "'+'", "'on'", "';'", "'('", "')'", "','", "'set'", "'expect'", "'if'", "'to'", "'OR'", "'AND'", "'!'", "'at'", "'now'"
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
    public String getGrammarFileName() { return "../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g"; }


     
     	private EceGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EceGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleEceModel"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:60:1: entryRuleEceModel : ruleEceModel EOF ;
    public final void entryRuleEceModel() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:61:1: ( ruleEceModel EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:62:1: ruleEceModel EOF
            {
             before(grammarAccess.getEceModelRule()); 
            pushFollow(FOLLOW_ruleEceModel_in_entryRuleEceModel61);
            ruleEceModel();

            state._fsp--;

             after(grammarAccess.getEceModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEceModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEceModel"


    // $ANTLR start "ruleEceModel"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:69:1: ruleEceModel : ( ( rule__EceModel__StatementsAssignment )* ) ;
    public final void ruleEceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:73:2: ( ( ( rule__EceModel__StatementsAssignment )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:74:1: ( ( rule__EceModel__StatementsAssignment )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:74:1: ( ( rule__EceModel__StatementsAssignment )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:75:1: ( rule__EceModel__StatementsAssignment )*
            {
             before(grammarAccess.getEceModelAccess().getStatementsAssignment()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:76:1: ( rule__EceModel__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:76:2: rule__EceModel__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__EceModel__StatementsAssignment_in_ruleEceModel94);
            	    rule__EceModel__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getEceModelAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEceModel"


    // $ANTLR start "entryRuleStatement"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:88:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:89:1: ( ruleStatement EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:90:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement122);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:97:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:101:2: ( ( ( rule__Statement__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:102:1: ( ( rule__Statement__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:102:1: ( ( rule__Statement__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:103:1: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:104:1: ( rule__Statement__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:104:2: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_rule__Statement__Group__0_in_ruleStatement155);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:116:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:117:1: ( ruleEvent EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:118:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent182);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:125:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:129:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:130:1: ( ( rule__Event__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:130:1: ( ( rule__Event__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:131:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:132:1: ( rule__Event__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:132:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent215);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEventFeature"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:144:1: entryRuleEventFeature : ruleEventFeature EOF ;
    public final void entryRuleEventFeature() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:145:1: ( ruleEventFeature EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:146:1: ruleEventFeature EOF
            {
             before(grammarAccess.getEventFeatureRule()); 
            pushFollow(FOLLOW_ruleEventFeature_in_entryRuleEventFeature242);
            ruleEventFeature();

            state._fsp--;

             after(grammarAccess.getEventFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventFeature249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventFeature"


    // $ANTLR start "ruleEventFeature"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:153:1: ruleEventFeature : ( ( rule__EventFeature__NameAssignment ) ) ;
    public final void ruleEventFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:157:2: ( ( ( rule__EventFeature__NameAssignment ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:158:1: ( ( rule__EventFeature__NameAssignment ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:158:1: ( ( rule__EventFeature__NameAssignment ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:159:1: ( rule__EventFeature__NameAssignment )
            {
             before(grammarAccess.getEventFeatureAccess().getNameAssignment()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:160:1: ( rule__EventFeature__NameAssignment )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:160:2: rule__EventFeature__NameAssignment
            {
            pushFollow(FOLLOW_rule__EventFeature__NameAssignment_in_ruleEventFeature275);
            rule__EventFeature__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEventFeatureAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventFeature"


    // $ANTLR start "entryRuleContextsList"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:172:1: entryRuleContextsList : ruleContextsList EOF ;
    public final void entryRuleContextsList() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:173:1: ( ruleContextsList EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:174:1: ruleContextsList EOF
            {
             before(grammarAccess.getContextsListRule()); 
            pushFollow(FOLLOW_ruleContextsList_in_entryRuleContextsList302);
            ruleContextsList();

            state._fsp--;

             after(grammarAccess.getContextsListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextsList309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContextsList"


    // $ANTLR start "ruleContextsList"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:181:1: ruleContextsList : ( ( rule__ContextsList__Group__0 ) ) ;
    public final void ruleContextsList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:185:2: ( ( ( rule__ContextsList__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:186:1: ( ( rule__ContextsList__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:186:1: ( ( rule__ContextsList__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:187:1: ( rule__ContextsList__Group__0 )
            {
             before(grammarAccess.getContextsListAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:188:1: ( rule__ContextsList__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:188:2: rule__ContextsList__Group__0
            {
            pushFollow(FOLLOW_rule__ContextsList__Group__0_in_ruleContextsList335);
            rule__ContextsList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextsListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextsList"


    // $ANTLR start "entryRuleEcContextsList"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:200:1: entryRuleEcContextsList : ruleEcContextsList EOF ;
    public final void entryRuleEcContextsList() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:201:1: ( ruleEcContextsList EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:202:1: ruleEcContextsList EOF
            {
             before(grammarAccess.getEcContextsListRule()); 
            pushFollow(FOLLOW_ruleEcContextsList_in_entryRuleEcContextsList362);
            ruleEcContextsList();

            state._fsp--;

             after(grammarAccess.getEcContextsListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEcContextsList369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEcContextsList"


    // $ANTLR start "ruleEcContextsList"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:209:1: ruleEcContextsList : ( ( rule__EcContextsList__Group__0 ) ) ;
    public final void ruleEcContextsList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:213:2: ( ( ( rule__EcContextsList__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:214:1: ( ( rule__EcContextsList__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:214:1: ( ( rule__EcContextsList__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:215:1: ( rule__EcContextsList__Group__0 )
            {
             before(grammarAccess.getEcContextsListAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:216:1: ( rule__EcContextsList__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:216:2: rule__EcContextsList__Group__0
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group__0_in_ruleEcContextsList395);
            rule__EcContextsList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEcContextsListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEcContextsList"


    // $ANTLR start "entryRuleExpContextsList"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:228:1: entryRuleExpContextsList : ruleExpContextsList EOF ;
    public final void entryRuleExpContextsList() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:229:1: ( ruleExpContextsList EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:230:1: ruleExpContextsList EOF
            {
             before(grammarAccess.getExpContextsListRule()); 
            pushFollow(FOLLOW_ruleExpContextsList_in_entryRuleExpContextsList422);
            ruleExpContextsList();

            state._fsp--;

             after(grammarAccess.getExpContextsListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpContextsList429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpContextsList"


    // $ANTLR start "ruleExpContextsList"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:237:1: ruleExpContextsList : ( ( rule__ExpContextsList__Group__0 ) ) ;
    public final void ruleExpContextsList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:241:2: ( ( ( rule__ExpContextsList__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:242:1: ( ( rule__ExpContextsList__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:242:1: ( ( rule__ExpContextsList__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:243:1: ( rule__ExpContextsList__Group__0 )
            {
             before(grammarAccess.getExpContextsListAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:244:1: ( rule__ExpContextsList__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:244:2: rule__ExpContextsList__Group__0
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group__0_in_ruleExpContextsList455);
            rule__ExpContextsList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpContextsListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpContextsList"


    // $ANTLR start "entryRuleEcContext"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:256:1: entryRuleEcContext : ruleEcContext EOF ;
    public final void entryRuleEcContext() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:257:1: ( ruleEcContext EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:258:1: ruleEcContext EOF
            {
             before(grammarAccess.getEcContextRule()); 
            pushFollow(FOLLOW_ruleEcContext_in_entryRuleEcContext482);
            ruleEcContext();

            state._fsp--;

             after(grammarAccess.getEcContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEcContext489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEcContext"


    // $ANTLR start "ruleEcContext"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:265:1: ruleEcContext : ( ( rule__EcContext__Group__0 ) ) ;
    public final void ruleEcContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:269:2: ( ( ( rule__EcContext__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:270:1: ( ( rule__EcContext__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:270:1: ( ( rule__EcContext__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:271:1: ( rule__EcContext__Group__0 )
            {
             before(grammarAccess.getEcContextAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:272:1: ( rule__EcContext__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:272:2: rule__EcContext__Group__0
            {
            pushFollow(FOLLOW_rule__EcContext__Group__0_in_ruleEcContext515);
            rule__EcContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEcContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEcContext"


    // $ANTLR start "entryRuleExpContext"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:284:1: entryRuleExpContext : ruleExpContext EOF ;
    public final void entryRuleExpContext() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:285:1: ( ruleExpContext EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:286:1: ruleExpContext EOF
            {
             before(grammarAccess.getExpContextRule()); 
            pushFollow(FOLLOW_ruleExpContext_in_entryRuleExpContext542);
            ruleExpContext();

            state._fsp--;

             after(grammarAccess.getExpContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpContext549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpContext"


    // $ANTLR start "ruleExpContext"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:293:1: ruleExpContext : ( ( rule__ExpContext__Group__0 ) ) ;
    public final void ruleExpContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:297:2: ( ( ( rule__ExpContext__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:298:1: ( ( rule__ExpContext__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:298:1: ( ( rule__ExpContext__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:299:1: ( rule__ExpContext__Group__0 )
            {
             before(grammarAccess.getExpContextAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:300:1: ( rule__ExpContext__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:300:2: rule__ExpContext__Group__0
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__0_in_ruleExpContext575);
            rule__ExpContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpContext"


    // $ANTLR start "entryRuleAllenOp"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:312:1: entryRuleAllenOp : ruleAllenOp EOF ;
    public final void entryRuleAllenOp() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:313:1: ( ruleAllenOp EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:314:1: ruleAllenOp EOF
            {
             before(grammarAccess.getAllenOpRule()); 
            pushFollow(FOLLOW_ruleAllenOp_in_entryRuleAllenOp602);
            ruleAllenOp();

            state._fsp--;

             after(grammarAccess.getAllenOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllenOp609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllenOp"


    // $ANTLR start "ruleAllenOp"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:321:1: ruleAllenOp : ( ( rule__AllenOp__Group__0 ) ) ;
    public final void ruleAllenOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:325:2: ( ( ( rule__AllenOp__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:326:1: ( ( rule__AllenOp__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:326:1: ( ( rule__AllenOp__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:327:1: ( rule__AllenOp__Group__0 )
            {
             before(grammarAccess.getAllenOpAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:328:1: ( rule__AllenOp__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:328:2: rule__AllenOp__Group__0
            {
            pushFollow(FOLLOW_rule__AllenOp__Group__0_in_ruleAllenOp635);
            rule__AllenOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllenOpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllenOp"


    // $ANTLR start "entryRuleFluent"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:340:1: entryRuleFluent : ruleFluent EOF ;
    public final void entryRuleFluent() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:341:1: ( ruleFluent EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:342:1: ruleFluent EOF
            {
             before(grammarAccess.getFluentRule()); 
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent662);
            ruleFluent();

            state._fsp--;

             after(grammarAccess.getFluentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFluent"


    // $ANTLR start "ruleFluent"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:349:1: ruleFluent : ( ( rule__Fluent__Group__0 ) ) ;
    public final void ruleFluent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:353:2: ( ( ( rule__Fluent__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:354:1: ( ( rule__Fluent__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:354:1: ( ( rule__Fluent__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:355:1: ( rule__Fluent__Group__0 )
            {
             before(grammarAccess.getFluentAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:356:1: ( rule__Fluent__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:356:2: rule__Fluent__Group__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0_in_ruleFluent695);
            rule__Fluent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFluent"


    // $ANTLR start "entryRuleConditionRule"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:368:1: entryRuleConditionRule : ruleConditionRule EOF ;
    public final void entryRuleConditionRule() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:369:1: ( ruleConditionRule EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:370:1: ruleConditionRule EOF
            {
             before(grammarAccess.getConditionRuleRule()); 
            pushFollow(FOLLOW_ruleConditionRule_in_entryRuleConditionRule722);
            ruleConditionRule();

            state._fsp--;

             after(grammarAccess.getConditionRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionRule729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionRule"


    // $ANTLR start "ruleConditionRule"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:377:1: ruleConditionRule : ( ( rule__ConditionRule__Group__0 ) ) ;
    public final void ruleConditionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:381:2: ( ( ( rule__ConditionRule__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:382:1: ( ( rule__ConditionRule__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:382:1: ( ( rule__ConditionRule__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:383:1: ( rule__ConditionRule__Group__0 )
            {
             before(grammarAccess.getConditionRuleAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:384:1: ( rule__ConditionRule__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:384:2: rule__ConditionRule__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__0_in_ruleConditionRule755);
            rule__ConditionRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionRule"


    // $ANTLR start "entryRuleToRule"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:396:1: entryRuleToRule : ruleToRule EOF ;
    public final void entryRuleToRule() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:397:1: ( ruleToRule EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:398:1: ruleToRule EOF
            {
             before(grammarAccess.getToRuleRule()); 
            pushFollow(FOLLOW_ruleToRule_in_entryRuleToRule782);
            ruleToRule();

            state._fsp--;

             after(grammarAccess.getToRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToRule789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleToRule"


    // $ANTLR start "ruleToRule"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:405:1: ruleToRule : ( ( rule__ToRule__Group__0 ) ) ;
    public final void ruleToRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:409:2: ( ( ( rule__ToRule__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:410:1: ( ( rule__ToRule__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:410:1: ( ( rule__ToRule__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:411:1: ( rule__ToRule__Group__0 )
            {
             before(grammarAccess.getToRuleAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:412:1: ( rule__ToRule__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:412:2: rule__ToRule__Group__0
            {
            pushFollow(FOLLOW_rule__ToRule__Group__0_in_ruleToRule815);
            rule__ToRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleToRule"


    // $ANTLR start "entryRuleInRule"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:424:1: entryRuleInRule : ruleInRule EOF ;
    public final void entryRuleInRule() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:425:1: ( ruleInRule EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:426:1: ruleInRule EOF
            {
             before(grammarAccess.getInRuleRule()); 
            pushFollow(FOLLOW_ruleInRule_in_entryRuleInRule842);
            ruleInRule();

            state._fsp--;

             after(grammarAccess.getInRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInRule849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInRule"


    // $ANTLR start "ruleInRule"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:433:1: ruleInRule : ( ( rule__InRule__Group__0 ) ) ;
    public final void ruleInRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:437:2: ( ( ( rule__InRule__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:438:1: ( ( rule__InRule__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:438:1: ( ( rule__InRule__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:439:1: ( rule__InRule__Group__0 )
            {
             before(grammarAccess.getInRuleAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:440:1: ( rule__InRule__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:440:2: rule__InRule__Group__0
            {
            pushFollow(FOLLOW_rule__InRule__Group__0_in_ruleInRule875);
            rule__InRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInRule"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:452:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:453:1: ( ruleExpression EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:454:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression902);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:461:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:465:2: ( ( ruleOr ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:466:1: ( ruleOr )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:466:1: ( ruleOr )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:467:1: ruleOr
            {
             before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            pushFollow(FOLLOW_ruleOr_in_ruleExpression935);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:480:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:481:1: ( ruleOr EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:482:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr961);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:489:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:493:2: ( ( ( rule__Or__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:494:1: ( ( rule__Or__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:494:1: ( ( rule__Or__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:495:1: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:496:1: ( rule__Or__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:496:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr994);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:508:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:509:1: ( ruleAnd EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:510:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd1021);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:517:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:521:2: ( ( ( rule__And__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:522:1: ( ( rule__And__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:522:1: ( ( rule__And__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:523:1: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:524:1: ( rule__And__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:524:2: rule__And__Group__0
            {
            pushFollow(FOLLOW_rule__And__Group__0_in_ruleAnd1054);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:536:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:537:1: ( ruleEquality EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:538:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality1081);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:545:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:549:2: ( ( ( rule__Equality__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:550:1: ( ( rule__Equality__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:550:1: ( ( rule__Equality__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:551:1: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:552:1: ( rule__Equality__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:552:2: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_rule__Equality__Group__0_in_ruleEquality1114);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:564:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:565:1: ( ruleComparison EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:566:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1141);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:573:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:577:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:578:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:578:1: ( ( rule__Comparison__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:579:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:580:1: ( rule__Comparison__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:580:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison1174);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:592:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:593:1: ( rulePlusOrMinus EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:594:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus1201);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:601:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:605:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:606:1: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:606:1: ( ( rule__PlusOrMinus__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:607:1: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:608:1: ( rule__PlusOrMinus__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:608:2: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus1234);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:620:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:621:1: ( ruleMulOrDiv EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:622:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv1261);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:629:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:633:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:634:1: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:634:1: ( ( rule__MulOrDiv__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:635:1: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:636:1: ( rule__MulOrDiv__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:636:2: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv1294);
            rule__MulOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:648:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:649:1: ( rulePrimary EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:650:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1321);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:657:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:661:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:662:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:662:1: ( ( rule__Primary__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:663:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:664:1: ( rule__Primary__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:664:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary1354);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:676:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:677:1: ( ruleAtomic EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:678:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1381);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:685:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:689:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:690:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:690:1: ( ( rule__Atomic__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:691:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:692:1: ( rule__Atomic__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:692:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1414);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleAtTimeExpression"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:706:1: entryRuleAtTimeExpression : ruleAtTimeExpression EOF ;
    public final void entryRuleAtTimeExpression() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:707:1: ( ruleAtTimeExpression EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:708:1: ruleAtTimeExpression EOF
            {
             before(grammarAccess.getAtTimeExpressionRule()); 
            pushFollow(FOLLOW_ruleAtTimeExpression_in_entryRuleAtTimeExpression1443);
            ruleAtTimeExpression();

            state._fsp--;

             after(grammarAccess.getAtTimeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimeExpression1450); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtTimeExpression"


    // $ANTLR start "ruleAtTimeExpression"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:715:1: ruleAtTimeExpression : ( ( rule__AtTimeExpression__Group__0 ) ) ;
    public final void ruleAtTimeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:719:2: ( ( ( rule__AtTimeExpression__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:720:1: ( ( rule__AtTimeExpression__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:720:1: ( ( rule__AtTimeExpression__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:721:1: ( rule__AtTimeExpression__Group__0 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:722:1: ( rule__AtTimeExpression__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:722:2: rule__AtTimeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group__0_in_ruleAtTimeExpression1476);
            rule__AtTimeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtTimeExpression"


    // $ANTLR start "entryRuleAtTimePrimary"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:734:1: entryRuleAtTimePrimary : ruleAtTimePrimary EOF ;
    public final void entryRuleAtTimePrimary() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:735:1: ( ruleAtTimePrimary EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:736:1: ruleAtTimePrimary EOF
            {
             before(grammarAccess.getAtTimePrimaryRule()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_entryRuleAtTimePrimary1503);
            ruleAtTimePrimary();

            state._fsp--;

             after(grammarAccess.getAtTimePrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimePrimary1510); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtTimePrimary"


    // $ANTLR start "ruleAtTimePrimary"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:743:1: ruleAtTimePrimary : ( ( rule__AtTimePrimary__Alternatives ) ) ;
    public final void ruleAtTimePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:747:2: ( ( ( rule__AtTimePrimary__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:748:1: ( ( rule__AtTimePrimary__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:748:1: ( ( rule__AtTimePrimary__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:749:1: ( rule__AtTimePrimary__Alternatives )
            {
             before(grammarAccess.getAtTimePrimaryAccess().getAlternatives()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:750:1: ( rule__AtTimePrimary__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:750:2: rule__AtTimePrimary__Alternatives
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Alternatives_in_ruleAtTimePrimary1536);
            rule__AtTimePrimary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtTimePrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtTimePrimary"


    // $ANTLR start "entryRuleAtTimeAtomic"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:762:1: entryRuleAtTimeAtomic : ruleAtTimeAtomic EOF ;
    public final void entryRuleAtTimeAtomic() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:763:1: ( ruleAtTimeAtomic EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:764:1: ruleAtTimeAtomic EOF
            {
             before(grammarAccess.getAtTimeAtomicRule()); 
            pushFollow(FOLLOW_ruleAtTimeAtomic_in_entryRuleAtTimeAtomic1563);
            ruleAtTimeAtomic();

            state._fsp--;

             after(grammarAccess.getAtTimeAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtTimeAtomic1570); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtTimeAtomic"


    // $ANTLR start "ruleAtTimeAtomic"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:771:1: ruleAtTimeAtomic : ( ( rule__AtTimeAtomic__Alternatives ) ) ;
    public final void ruleAtTimeAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:775:2: ( ( ( rule__AtTimeAtomic__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:776:1: ( ( rule__AtTimeAtomic__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:776:1: ( ( rule__AtTimeAtomic__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:777:1: ( rule__AtTimeAtomic__Alternatives )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAlternatives()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:778:1: ( rule__AtTimeAtomic__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:778:2: rule__AtTimeAtomic__Alternatives
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Alternatives_in_ruleAtTimeAtomic1596);
            rule__AtTimeAtomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtTimeAtomic"


    // $ANTLR start "rule__AllenOp__ValueAlternatives_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:790:1: rule__AllenOp__ValueAlternatives_1_0 : ( ( 'before' ) | ( 'after' ) | ( 'in' ) );
    public final void rule__AllenOp__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:794:1: ( ( 'before' ) | ( 'after' ) | ( 'in' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:795:1: ( 'before' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:795:1: ( 'before' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:796:1: 'before'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueBeforeKeyword_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__AllenOp__ValueAlternatives_1_01633); 
                     after(grammarAccess.getAllenOpAccess().getValueBeforeKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:803:6: ( 'after' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:803:6: ( 'after' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:804:1: 'after'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueAfterKeyword_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__AllenOp__ValueAlternatives_1_01653); 
                     after(grammarAccess.getAllenOpAccess().getValueAfterKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:811:6: ( 'in' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:811:6: ( 'in' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:812:1: 'in'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueInKeyword_1_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__AllenOp__ValueAlternatives_1_01673); 
                     after(grammarAccess.getAllenOpAccess().getValueInKeyword_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllenOp__ValueAlternatives_1_0"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:824:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:828:1: ( ( '==' ) | ( '!=' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:829:1: ( '==' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:829:1: ( '==' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:830:1: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__Equality__OpAlternatives_1_1_01708); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:837:6: ( '!=' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:837:6: ( '!=' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:838:1: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,16,FOLLOW_16_in_rule__Equality__OpAlternatives_1_1_01728); 
                     after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:850:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:854:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:855:1: ( '>=' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:855:1: ( '>=' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:856:1: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_17_in_rule__Comparison__OpAlternatives_1_1_01763); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:863:6: ( '<=' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:863:6: ( '<=' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:864:1: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,18,FOLLOW_18_in_rule__Comparison__OpAlternatives_1_1_01783); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:871:6: ( '>' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:871:6: ( '>' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:872:1: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,19,FOLLOW_19_in_rule__Comparison__OpAlternatives_1_1_01803); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:879:6: ( '<' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:879:6: ( '<' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:880:1: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,20,FOLLOW_20_in_rule__Comparison__OpAlternatives_1_1_01823); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:892:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:896:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:897:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:897:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:898:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:899:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:899:2: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_01857);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:903:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:903:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:904:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:905:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:905:2: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_01875);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:914:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:918:1: ( ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:919:1: ( '*' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:919:1: ( '*' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:920:1: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__MulOrDiv__OpAlternatives_1_1_01909); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:927:6: ( '/' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:927:6: ( '/' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:928:1: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,22,FOLLOW_22_in_rule__MulOrDiv__OpAlternatives_1_1_01929); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:935:6: ( '%' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:935:6: ( '%' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:936:1: '%'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2()); 
                    match(input,23,FOLLOW_23_in_rule__MulOrDiv__OpAlternatives_1_1_01949); 
                     after(grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:943:6: ( '^' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:943:6: ( '^' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:944:1: '^'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_1_0_3()); 
                    match(input,24,FOLLOW_24_in_rule__MulOrDiv__OpAlternatives_1_1_01969); 
                     after(grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:956:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:960:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 40:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case RULE_FLOAT:
            case RULE_INT:
            case 25:
            case 26:
            case 42:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:961:1: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:961:1: ( ( rule__Primary__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:962:1: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:963:1: ( rule__Primary__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:963:2: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives2003);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:967:6: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:967:6: ( ( rule__Primary__Group_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:968:1: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:969:1: ( rule__Primary__Group_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:969:2: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives2021);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:973:6: ( ruleAtomic )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:973:6: ( ruleAtomic )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:974:1: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__Primary__Alternatives2039);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:984:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:988:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case 25:
            case 26:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            case 42:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:989:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:989:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:990:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:991:1: ( rule__Atomic__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:991:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives2071);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:995:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:995:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:996:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:997:1: ( rule__Atomic__Group_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:997:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives2089);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1001:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1001:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1002:1: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1003:1: ( rule__Atomic__Group_2__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1003:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives2107);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1007:6: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1007:6: ( ( rule__Atomic__Group_3__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1008:1: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1009:1: ( rule__Atomic__Group_3__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1009:2: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives2125);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1013:6: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1013:6: ( ( rule__Atomic__Group_4__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1014:1: ( rule__Atomic__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1015:1: ( rule__Atomic__Group_4__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1015:2: rule__Atomic__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives2143);
                    rule__Atomic__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_2_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1024:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1028:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1029:1: ( 'true' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1029:1: ( 'true' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1030:1: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,25,FOLLOW_25_in_rule__Atomic__ValueAlternatives_2_1_02177); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1037:6: ( 'false' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1037:6: ( 'false' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1038:1: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,26,FOLLOW_26_in_rule__Atomic__ValueAlternatives_2_1_02197); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__AtTimeExpression__OpAlternatives_1_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1051:1: rule__AtTimeExpression__OpAlternatives_1_1_0 : ( ( '-' ) | ( '+' ) );
    public final void rule__AtTimeExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1055:1: ( ( '-' ) | ( '+' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1056:1: ( '-' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1056:1: ( '-' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1057:1: '-'
                    {
                     before(grammarAccess.getAtTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0()); 
                    match(input,27,FOLLOW_27_in_rule__AtTimeExpression__OpAlternatives_1_1_02233); 
                     after(grammarAccess.getAtTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1064:6: ( '+' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1064:6: ( '+' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1065:1: '+'
                    {
                     before(grammarAccess.getAtTimeExpressionAccess().getOpPlusSignKeyword_1_1_0_1()); 
                    match(input,28,FOLLOW_28_in_rule__AtTimeExpression__OpAlternatives_1_1_02253); 
                     after(grammarAccess.getAtTimeExpressionAccess().getOpPlusSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__OpAlternatives_1_1_0"


    // $ANTLR start "rule__AtTimePrimary__Alternatives"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1077:1: rule__AtTimePrimary__Alternatives : ( ( ( rule__AtTimePrimary__Group_0__0 ) ) | ( ruleAtTimeAtomic ) );
    public final void rule__AtTimePrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1081:1: ( ( ( rule__AtTimePrimary__Group_0__0 ) ) | ( ruleAtTimeAtomic ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INT||LA11_0==42) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1082:1: ( ( rule__AtTimePrimary__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1082:1: ( ( rule__AtTimePrimary__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1083:1: ( rule__AtTimePrimary__Group_0__0 )
                    {
                     before(grammarAccess.getAtTimePrimaryAccess().getGroup_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1084:1: ( rule__AtTimePrimary__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1084:2: rule__AtTimePrimary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__0_in_rule__AtTimePrimary__Alternatives2287);
                    rule__AtTimePrimary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtTimePrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1088:6: ( ruleAtTimeAtomic )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1088:6: ( ruleAtTimeAtomic )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1089:1: ruleAtTimeAtomic
                    {
                     before(grammarAccess.getAtTimePrimaryAccess().getAtTimeAtomicParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAtTimeAtomic_in_rule__AtTimePrimary__Alternatives2305);
                    ruleAtTimeAtomic();

                    state._fsp--;

                     after(grammarAccess.getAtTimePrimaryAccess().getAtTimeAtomicParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Alternatives"


    // $ANTLR start "rule__AtTimeAtomic__Alternatives"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1099:1: rule__AtTimeAtomic__Alternatives : ( ( ( rule__AtTimeAtomic__Group_0__0 ) ) | ( ( rule__AtTimeAtomic__Group_1__0 ) ) );
    public final void rule__AtTimeAtomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1103:1: ( ( ( rule__AtTimeAtomic__Group_0__0 ) ) | ( ( rule__AtTimeAtomic__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==42) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1104:1: ( ( rule__AtTimeAtomic__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1104:1: ( ( rule__AtTimeAtomic__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1105:1: ( rule__AtTimeAtomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtTimeAtomicAccess().getGroup_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1106:1: ( rule__AtTimeAtomic__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1106:2: rule__AtTimeAtomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__0_in_rule__AtTimeAtomic__Alternatives2337);
                    rule__AtTimeAtomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtTimeAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1110:6: ( ( rule__AtTimeAtomic__Group_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1110:6: ( ( rule__AtTimeAtomic__Group_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1111:1: ( rule__AtTimeAtomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtTimeAtomicAccess().getGroup_1()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1112:1: ( rule__AtTimeAtomic__Group_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1112:2: rule__AtTimeAtomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__0_in_rule__AtTimeAtomic__Alternatives2355);
                    rule__AtTimeAtomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtTimeAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Alternatives"


    // $ANTLR start "rule__Statement__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1123:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1127:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1128:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02386);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02389);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1135:1: rule__Statement__Group__0__Impl : ( 'on' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1139:1: ( ( 'on' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1140:1: ( 'on' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1140:1: ( 'on' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1141:1: 'on'
            {
             before(grammarAccess.getStatementAccess().getOnKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Statement__Group__0__Impl2417); 
             after(grammarAccess.getStatementAccess().getOnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1154:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1158:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1159:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12448);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12451);
            rule__Statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1166:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__EventAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1170:1: ( ( ( rule__Statement__EventAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1171:1: ( ( rule__Statement__EventAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1171:1: ( ( rule__Statement__EventAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1172:1: ( rule__Statement__EventAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getEventAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1173:1: ( rule__Statement__EventAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1173:2: rule__Statement__EventAssignment_1
            {
            pushFollow(FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl2478);
            rule__Statement__EventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getEventAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1183:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1187:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1188:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22508);
            rule__Statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22511);
            rule__Statement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__2"


    // $ANTLR start "rule__Statement__Group__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1195:1: rule__Statement__Group__2__Impl : ( ( rule__Statement__ContextsListAssignment_2 ) ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1199:1: ( ( ( rule__Statement__ContextsListAssignment_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1200:1: ( ( rule__Statement__ContextsListAssignment_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1200:1: ( ( rule__Statement__ContextsListAssignment_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1201:1: ( rule__Statement__ContextsListAssignment_2 )
            {
             before(grammarAccess.getStatementAccess().getContextsListAssignment_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1202:1: ( rule__Statement__ContextsListAssignment_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1202:2: rule__Statement__ContextsListAssignment_2
            {
            pushFollow(FOLLOW_rule__Statement__ContextsListAssignment_2_in_rule__Statement__Group__2__Impl2538);
            rule__Statement__ContextsListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getContextsListAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__2__Impl"


    // $ANTLR start "rule__Statement__Group__3"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1212:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1216:1: ( rule__Statement__Group__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1217:2: rule__Statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__32568);
            rule__Statement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__3"


    // $ANTLR start "rule__Statement__Group__3__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1223:1: rule__Statement__Group__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1227:1: ( ( ';' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1228:1: ( ';' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1228:1: ( ';' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1229:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Statement__Group__3__Impl2596); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1250:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1254:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1255:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02635);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02638);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1262:1: rule__Event__Group__0__Impl : ( ( rule__Event__EventNameAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1266:1: ( ( ( rule__Event__EventNameAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1267:1: ( ( rule__Event__EventNameAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1267:1: ( ( rule__Event__EventNameAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1268:1: ( rule__Event__EventNameAssignment_0 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1269:1: ( rule__Event__EventNameAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1269:2: rule__Event__EventNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Event__EventNameAssignment_0_in_rule__Event__Group__0__Impl2665);
            rule__Event__EventNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1279:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1283:1: ( rule__Event__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1284:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12695);
            rule__Event__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1290:1: rule__Event__Group__1__Impl : ( ( rule__Event__Group_1__0 )? ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1294:1: ( ( ( rule__Event__Group_1__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1295:1: ( ( rule__Event__Group_1__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1295:1: ( ( rule__Event__Group_1__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1296:1: ( rule__Event__Group_1__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1297:1: ( rule__Event__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1297:2: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl2722);
                    rule__Event__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1311:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1315:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1316:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__02757);
            rule__Event__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__02760);
            rule__Event__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__0"


    // $ANTLR start "rule__Event__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1323:1: rule__Event__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1327:1: ( ( '(' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1328:1: ( '(' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1328:1: ( '(' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1329:1: '('
            {
             before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Event__Group_1__0__Impl2788); 
             after(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__0__Impl"


    // $ANTLR start "rule__Event__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1342:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl rule__Event__Group_1__2 ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1346:1: ( rule__Event__Group_1__1__Impl rule__Event__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1347:2: rule__Event__Group_1__1__Impl rule__Event__Group_1__2
            {
            pushFollow(FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__12819);
            rule__Event__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__2_in_rule__Event__Group_1__12822);
            rule__Event__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__1"


    // $ANTLR start "rule__Event__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1354:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__ParamsAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1358:1: ( ( ( rule__Event__ParamsAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1359:1: ( ( rule__Event__ParamsAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1359:1: ( ( rule__Event__ParamsAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1360:1: ( rule__Event__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getParamsAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1361:1: ( rule__Event__ParamsAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1361:2: rule__Event__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Event__ParamsAssignment_1_1_in_rule__Event__Group_1__1__Impl2849);
            rule__Event__ParamsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getParamsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__1__Impl"


    // $ANTLR start "rule__Event__Group_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1371:1: rule__Event__Group_1__2 : rule__Event__Group_1__2__Impl rule__Event__Group_1__3 ;
    public final void rule__Event__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1375:1: ( rule__Event__Group_1__2__Impl rule__Event__Group_1__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1376:2: rule__Event__Group_1__2__Impl rule__Event__Group_1__3
            {
            pushFollow(FOLLOW_rule__Event__Group_1__2__Impl_in_rule__Event__Group_1__22879);
            rule__Event__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__3_in_rule__Event__Group_1__22882);
            rule__Event__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__2"


    // $ANTLR start "rule__Event__Group_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1383:1: rule__Event__Group_1__2__Impl : ( ( rule__Event__Group_1_2__0 )* ) ;
    public final void rule__Event__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1387:1: ( ( ( rule__Event__Group_1_2__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1388:1: ( ( rule__Event__Group_1_2__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1388:1: ( ( rule__Event__Group_1_2__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1389:1: ( rule__Event__Group_1_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1390:1: ( rule__Event__Group_1_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1390:2: rule__Event__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Event__Group_1_2__0_in_rule__Event__Group_1__2__Impl2909);
            	    rule__Event__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__2__Impl"


    // $ANTLR start "rule__Event__Group_1__3"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1400:1: rule__Event__Group_1__3 : rule__Event__Group_1__3__Impl ;
    public final void rule__Event__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1404:1: ( rule__Event__Group_1__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1405:2: rule__Event__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1__3__Impl_in_rule__Event__Group_1__32940);
            rule__Event__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__3"


    // $ANTLR start "rule__Event__Group_1__3__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1411:1: rule__Event__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Event__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1415:1: ( ( ')' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1416:1: ( ')' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1416:1: ( ')' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1417:1: ')'
            {
             before(grammarAccess.getEventAccess().getRightParenthesisKeyword_1_3()); 
            match(input,32,FOLLOW_32_in_rule__Event__Group_1__3__Impl2968); 
             after(grammarAccess.getEventAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__3__Impl"


    // $ANTLR start "rule__Event__Group_1_2__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1438:1: rule__Event__Group_1_2__0 : rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 ;
    public final void rule__Event__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1442:1: ( rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1443:2: rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1_2__0__Impl_in_rule__Event__Group_1_2__03007);
            rule__Event__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1_2__1_in_rule__Event__Group_1_2__03010);
            rule__Event__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_2__0"


    // $ANTLR start "rule__Event__Group_1_2__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1450:1: rule__Event__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1454:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1455:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1455:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1456:1: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_1_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Event__Group_1_2__0__Impl3038); 
             after(grammarAccess.getEventAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_2__0__Impl"


    // $ANTLR start "rule__Event__Group_1_2__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1469:1: rule__Event__Group_1_2__1 : rule__Event__Group_1_2__1__Impl ;
    public final void rule__Event__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1473:1: ( rule__Event__Group_1_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1474:2: rule__Event__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1_2__1__Impl_in_rule__Event__Group_1_2__13069);
            rule__Event__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_2__1"


    // $ANTLR start "rule__Event__Group_1_2__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1480:1: rule__Event__Group_1_2__1__Impl : ( ( rule__Event__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__Event__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1484:1: ( ( ( rule__Event__ParamsAssignment_1_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1485:1: ( ( rule__Event__ParamsAssignment_1_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1485:1: ( ( rule__Event__ParamsAssignment_1_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1486:1: ( rule__Event__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getEventAccess().getParamsAssignment_1_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1487:1: ( rule__Event__ParamsAssignment_1_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1487:2: rule__Event__ParamsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Event__ParamsAssignment_1_2_1_in_rule__Event__Group_1_2__1__Impl3096);
            rule__Event__ParamsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getParamsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_2__1__Impl"


    // $ANTLR start "rule__ContextsList__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1501:1: rule__ContextsList__Group__0 : rule__ContextsList__Group__0__Impl rule__ContextsList__Group__1 ;
    public final void rule__ContextsList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1505:1: ( rule__ContextsList__Group__0__Impl rule__ContextsList__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1506:2: rule__ContextsList__Group__0__Impl rule__ContextsList__Group__1
            {
            pushFollow(FOLLOW_rule__ContextsList__Group__0__Impl_in_rule__ContextsList__Group__03130);
            rule__ContextsList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextsList__Group__1_in_rule__ContextsList__Group__03133);
            rule__ContextsList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextsList__Group__0"


    // $ANTLR start "rule__ContextsList__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1513:1: rule__ContextsList__Group__0__Impl : ( ( rule__ContextsList__EcContextsListAssignment_0 )? ) ;
    public final void rule__ContextsList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1517:1: ( ( ( rule__ContextsList__EcContextsListAssignment_0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1518:1: ( ( rule__ContextsList__EcContextsListAssignment_0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1518:1: ( ( rule__ContextsList__EcContextsListAssignment_0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1519:1: ( rule__ContextsList__EcContextsListAssignment_0 )?
            {
             before(grammarAccess.getContextsListAccess().getEcContextsListAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1520:1: ( rule__ContextsList__EcContextsListAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1520:2: rule__ContextsList__EcContextsListAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ContextsList__EcContextsListAssignment_0_in_rule__ContextsList__Group__0__Impl3160);
                    rule__ContextsList__EcContextsListAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextsListAccess().getEcContextsListAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextsList__Group__0__Impl"


    // $ANTLR start "rule__ContextsList__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1530:1: rule__ContextsList__Group__1 : rule__ContextsList__Group__1__Impl rule__ContextsList__Group__2 ;
    public final void rule__ContextsList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1534:1: ( rule__ContextsList__Group__1__Impl rule__ContextsList__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1535:2: rule__ContextsList__Group__1__Impl rule__ContextsList__Group__2
            {
            pushFollow(FOLLOW_rule__ContextsList__Group__1__Impl_in_rule__ContextsList__Group__13191);
            rule__ContextsList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextsList__Group__2_in_rule__ContextsList__Group__13194);
            rule__ContextsList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextsList__Group__1"


    // $ANTLR start "rule__ContextsList__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1542:1: rule__ContextsList__Group__1__Impl : ( ',' ) ;
    public final void rule__ContextsList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1546:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1547:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1547:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1548:1: ','
            {
             before(grammarAccess.getContextsListAccess().getCommaKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__ContextsList__Group__1__Impl3222); 
             after(grammarAccess.getContextsListAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextsList__Group__1__Impl"


    // $ANTLR start "rule__ContextsList__Group__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1561:1: rule__ContextsList__Group__2 : rule__ContextsList__Group__2__Impl ;
    public final void rule__ContextsList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1565:1: ( rule__ContextsList__Group__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1566:2: rule__ContextsList__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ContextsList__Group__2__Impl_in_rule__ContextsList__Group__23253);
            rule__ContextsList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextsList__Group__2"


    // $ANTLR start "rule__ContextsList__Group__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1572:1: rule__ContextsList__Group__2__Impl : ( ( rule__ContextsList__ExpContextsListAssignment_2 )? ) ;
    public final void rule__ContextsList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1576:1: ( ( ( rule__ContextsList__ExpContextsListAssignment_2 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1577:1: ( ( rule__ContextsList__ExpContextsListAssignment_2 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1577:1: ( ( rule__ContextsList__ExpContextsListAssignment_2 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1578:1: ( rule__ContextsList__ExpContextsListAssignment_2 )?
            {
             before(grammarAccess.getContextsListAccess().getExpContextsListAssignment_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1579:1: ( rule__ContextsList__ExpContextsListAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1579:2: rule__ContextsList__ExpContextsListAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ContextsList__ExpContextsListAssignment_2_in_rule__ContextsList__Group__2__Impl3280);
                    rule__ContextsList__ExpContextsListAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextsListAccess().getExpContextsListAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextsList__Group__2__Impl"


    // $ANTLR start "rule__EcContextsList__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1595:1: rule__EcContextsList__Group__0 : rule__EcContextsList__Group__0__Impl rule__EcContextsList__Group__1 ;
    public final void rule__EcContextsList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1599:1: ( rule__EcContextsList__Group__0__Impl rule__EcContextsList__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1600:2: rule__EcContextsList__Group__0__Impl rule__EcContextsList__Group__1
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group__0__Impl_in_rule__EcContextsList__Group__03317);
            rule__EcContextsList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContextsList__Group__1_in_rule__EcContextsList__Group__03320);
            rule__EcContextsList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContextsList__Group__0"


    // $ANTLR start "rule__EcContextsList__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1607:1: rule__EcContextsList__Group__0__Impl : ( ( rule__EcContextsList__EcContextsAssignment_0 ) ) ;
    public final void rule__EcContextsList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1611:1: ( ( ( rule__EcContextsList__EcContextsAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1612:1: ( ( rule__EcContextsList__EcContextsAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1612:1: ( ( rule__EcContextsList__EcContextsAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1613:1: ( rule__EcContextsList__EcContextsAssignment_0 )
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1614:1: ( rule__EcContextsList__EcContextsAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1614:2: rule__EcContextsList__EcContextsAssignment_0
            {
            pushFollow(FOLLOW_rule__EcContextsList__EcContextsAssignment_0_in_rule__EcContextsList__Group__0__Impl3347);
            rule__EcContextsList__EcContextsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEcContextsListAccess().getEcContextsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContextsList__Group__0__Impl"


    // $ANTLR start "rule__EcContextsList__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1624:1: rule__EcContextsList__Group__1 : rule__EcContextsList__Group__1__Impl ;
    public final void rule__EcContextsList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1628:1: ( rule__EcContextsList__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1629:2: rule__EcContextsList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group__1__Impl_in_rule__EcContextsList__Group__13377);
            rule__EcContextsList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContextsList__Group__1"


    // $ANTLR start "rule__EcContextsList__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1635:1: rule__EcContextsList__Group__1__Impl : ( ( rule__EcContextsList__Group_1__0 )* ) ;
    public final void rule__EcContextsList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1639:1: ( ( ( rule__EcContextsList__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1640:1: ( ( rule__EcContextsList__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1640:1: ( ( rule__EcContextsList__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1641:1: ( rule__EcContextsList__Group_1__0 )*
            {
             before(grammarAccess.getEcContextsListAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1642:1: ( rule__EcContextsList__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==34) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1642:2: rule__EcContextsList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EcContextsList__Group_1__0_in_rule__EcContextsList__Group__1__Impl3404);
            	    rule__EcContextsList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEcContextsListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContextsList__Group__1__Impl"


    // $ANTLR start "rule__EcContextsList__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1656:1: rule__EcContextsList__Group_1__0 : rule__EcContextsList__Group_1__0__Impl rule__EcContextsList__Group_1__1 ;
    public final void rule__EcContextsList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1660:1: ( rule__EcContextsList__Group_1__0__Impl rule__EcContextsList__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1661:2: rule__EcContextsList__Group_1__0__Impl rule__EcContextsList__Group_1__1
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group_1__0__Impl_in_rule__EcContextsList__Group_1__03439);
            rule__EcContextsList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContextsList__Group_1__1_in_rule__EcContextsList__Group_1__03442);
            rule__EcContextsList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContextsList__Group_1__0"


    // $ANTLR start "rule__EcContextsList__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1668:1: rule__EcContextsList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__EcContextsList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1672:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1673:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1673:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1674:1: ','
            {
             before(grammarAccess.getEcContextsListAccess().getCommaKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__EcContextsList__Group_1__0__Impl3470); 
             after(grammarAccess.getEcContextsListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContextsList__Group_1__0__Impl"


    // $ANTLR start "rule__EcContextsList__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1687:1: rule__EcContextsList__Group_1__1 : rule__EcContextsList__Group_1__1__Impl ;
    public final void rule__EcContextsList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1691:1: ( rule__EcContextsList__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1692:2: rule__EcContextsList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group_1__1__Impl_in_rule__EcContextsList__Group_1__13501);
            rule__EcContextsList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContextsList__Group_1__1"


    // $ANTLR start "rule__EcContextsList__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1698:1: rule__EcContextsList__Group_1__1__Impl : ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) ) ;
    public final void rule__EcContextsList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1702:1: ( ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1703:1: ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1703:1: ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1704:1: ( rule__EcContextsList__EcContextsAssignment_1_1 )
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1705:1: ( rule__EcContextsList__EcContextsAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1705:2: rule__EcContextsList__EcContextsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EcContextsList__EcContextsAssignment_1_1_in_rule__EcContextsList__Group_1__1__Impl3528);
            rule__EcContextsList__EcContextsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEcContextsListAccess().getEcContextsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContextsList__Group_1__1__Impl"


    // $ANTLR start "rule__ExpContextsList__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1719:1: rule__ExpContextsList__Group__0 : rule__ExpContextsList__Group__0__Impl rule__ExpContextsList__Group__1 ;
    public final void rule__ExpContextsList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1723:1: ( rule__ExpContextsList__Group__0__Impl rule__ExpContextsList__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1724:2: rule__ExpContextsList__Group__0__Impl rule__ExpContextsList__Group__1
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group__0__Impl_in_rule__ExpContextsList__Group__03562);
            rule__ExpContextsList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContextsList__Group__1_in_rule__ExpContextsList__Group__03565);
            rule__ExpContextsList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContextsList__Group__0"


    // $ANTLR start "rule__ExpContextsList__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1731:1: rule__ExpContextsList__Group__0__Impl : ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) ) ;
    public final void rule__ExpContextsList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1735:1: ( ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1736:1: ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1736:1: ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1737:1: ( rule__ExpContextsList__ExpContextsAssignment_0 )
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1738:1: ( rule__ExpContextsList__ExpContextsAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1738:2: rule__ExpContextsList__ExpContextsAssignment_0
            {
            pushFollow(FOLLOW_rule__ExpContextsList__ExpContextsAssignment_0_in_rule__ExpContextsList__Group__0__Impl3592);
            rule__ExpContextsList__ExpContextsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpContextsListAccess().getExpContextsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContextsList__Group__0__Impl"


    // $ANTLR start "rule__ExpContextsList__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1748:1: rule__ExpContextsList__Group__1 : rule__ExpContextsList__Group__1__Impl ;
    public final void rule__ExpContextsList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1752:1: ( rule__ExpContextsList__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1753:2: rule__ExpContextsList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group__1__Impl_in_rule__ExpContextsList__Group__13622);
            rule__ExpContextsList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContextsList__Group__1"


    // $ANTLR start "rule__ExpContextsList__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1759:1: rule__ExpContextsList__Group__1__Impl : ( ( rule__ExpContextsList__Group_1__0 )* ) ;
    public final void rule__ExpContextsList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1763:1: ( ( ( rule__ExpContextsList__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1764:1: ( ( rule__ExpContextsList__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1764:1: ( ( rule__ExpContextsList__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1765:1: ( rule__ExpContextsList__Group_1__0 )*
            {
             before(grammarAccess.getExpContextsListAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1766:1: ( rule__ExpContextsList__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1766:2: rule__ExpContextsList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExpContextsList__Group_1__0_in_rule__ExpContextsList__Group__1__Impl3649);
            	    rule__ExpContextsList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getExpContextsListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContextsList__Group__1__Impl"


    // $ANTLR start "rule__ExpContextsList__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1780:1: rule__ExpContextsList__Group_1__0 : rule__ExpContextsList__Group_1__0__Impl rule__ExpContextsList__Group_1__1 ;
    public final void rule__ExpContextsList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1784:1: ( rule__ExpContextsList__Group_1__0__Impl rule__ExpContextsList__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1785:2: rule__ExpContextsList__Group_1__0__Impl rule__ExpContextsList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group_1__0__Impl_in_rule__ExpContextsList__Group_1__03684);
            rule__ExpContextsList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContextsList__Group_1__1_in_rule__ExpContextsList__Group_1__03687);
            rule__ExpContextsList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContextsList__Group_1__0"


    // $ANTLR start "rule__ExpContextsList__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1792:1: rule__ExpContextsList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ExpContextsList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1796:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1797:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1797:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1798:1: ','
            {
             before(grammarAccess.getExpContextsListAccess().getCommaKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__ExpContextsList__Group_1__0__Impl3715); 
             after(grammarAccess.getExpContextsListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContextsList__Group_1__0__Impl"


    // $ANTLR start "rule__ExpContextsList__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1811:1: rule__ExpContextsList__Group_1__1 : rule__ExpContextsList__Group_1__1__Impl ;
    public final void rule__ExpContextsList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1815:1: ( rule__ExpContextsList__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1816:2: rule__ExpContextsList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group_1__1__Impl_in_rule__ExpContextsList__Group_1__13746);
            rule__ExpContextsList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContextsList__Group_1__1"


    // $ANTLR start "rule__ExpContextsList__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1822:1: rule__ExpContextsList__Group_1__1__Impl : ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) ) ;
    public final void rule__ExpContextsList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1826:1: ( ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1827:1: ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1827:1: ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1828:1: ( rule__ExpContextsList__ExpContextsAssignment_1_1 )
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1829:1: ( rule__ExpContextsList__ExpContextsAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1829:2: rule__ExpContextsList__ExpContextsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExpContextsList__ExpContextsAssignment_1_1_in_rule__ExpContextsList__Group_1__1__Impl3773);
            rule__ExpContextsList__ExpContextsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpContextsListAccess().getExpContextsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContextsList__Group_1__1__Impl"


    // $ANTLR start "rule__EcContext__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1843:1: rule__EcContext__Group__0 : rule__EcContext__Group__0__Impl rule__EcContext__Group__1 ;
    public final void rule__EcContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1847:1: ( rule__EcContext__Group__0__Impl rule__EcContext__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1848:2: rule__EcContext__Group__0__Impl rule__EcContext__Group__1
            {
            pushFollow(FOLLOW_rule__EcContext__Group__0__Impl_in_rule__EcContext__Group__03807);
            rule__EcContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContext__Group__1_in_rule__EcContext__Group__03810);
            rule__EcContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContext__Group__0"


    // $ANTLR start "rule__EcContext__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1855:1: rule__EcContext__Group__0__Impl : ( 'set' ) ;
    public final void rule__EcContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1859:1: ( ( 'set' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1860:1: ( 'set' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1860:1: ( 'set' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1861:1: 'set'
            {
             before(grammarAccess.getEcContextAccess().getSetKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__EcContext__Group__0__Impl3838); 
             after(grammarAccess.getEcContextAccess().getSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContext__Group__0__Impl"


    // $ANTLR start "rule__EcContext__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1874:1: rule__EcContext__Group__1 : rule__EcContext__Group__1__Impl ;
    public final void rule__EcContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1878:1: ( rule__EcContext__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1879:2: rule__EcContext__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EcContext__Group__1__Impl_in_rule__EcContext__Group__13869);
            rule__EcContext__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContext__Group__1"


    // $ANTLR start "rule__EcContext__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1885:1: rule__EcContext__Group__1__Impl : ( ( rule__EcContext__FluentAssignment_1 ) ) ;
    public final void rule__EcContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1889:1: ( ( ( rule__EcContext__FluentAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1890:1: ( ( rule__EcContext__FluentAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1890:1: ( ( rule__EcContext__FluentAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1891:1: ( rule__EcContext__FluentAssignment_1 )
            {
             before(grammarAccess.getEcContextAccess().getFluentAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1892:1: ( rule__EcContext__FluentAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1892:2: rule__EcContext__FluentAssignment_1
            {
            pushFollow(FOLLOW_rule__EcContext__FluentAssignment_1_in_rule__EcContext__Group__1__Impl3896);
            rule__EcContext__FluentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEcContextAccess().getFluentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContext__Group__1__Impl"


    // $ANTLR start "rule__ExpContext__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1906:1: rule__ExpContext__Group__0 : rule__ExpContext__Group__0__Impl rule__ExpContext__Group__1 ;
    public final void rule__ExpContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1910:1: ( rule__ExpContext__Group__0__Impl rule__ExpContext__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1911:2: rule__ExpContext__Group__0__Impl rule__ExpContext__Group__1
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__0__Impl_in_rule__ExpContext__Group__03930);
            rule__ExpContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group__1_in_rule__ExpContext__Group__03933);
            rule__ExpContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group__0"


    // $ANTLR start "rule__ExpContext__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1918:1: rule__ExpContext__Group__0__Impl : ( 'expect' ) ;
    public final void rule__ExpContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1922:1: ( ( 'expect' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1923:1: ( 'expect' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1923:1: ( 'expect' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1924:1: 'expect'
            {
             before(grammarAccess.getExpContextAccess().getExpectKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__ExpContext__Group__0__Impl3961); 
             after(grammarAccess.getExpContextAccess().getExpectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group__0__Impl"


    // $ANTLR start "rule__ExpContext__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1937:1: rule__ExpContext__Group__1 : rule__ExpContext__Group__1__Impl rule__ExpContext__Group__2 ;
    public final void rule__ExpContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1941:1: ( rule__ExpContext__Group__1__Impl rule__ExpContext__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1942:2: rule__ExpContext__Group__1__Impl rule__ExpContext__Group__2
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__1__Impl_in_rule__ExpContext__Group__13992);
            rule__ExpContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group__2_in_rule__ExpContext__Group__13995);
            rule__ExpContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group__1"


    // $ANTLR start "rule__ExpContext__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1949:1: rule__ExpContext__Group__1__Impl : ( ( rule__ExpContext__FinalConditionAssignment_1 ) ) ;
    public final void rule__ExpContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1953:1: ( ( ( rule__ExpContext__FinalConditionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1954:1: ( ( rule__ExpContext__FinalConditionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1954:1: ( ( rule__ExpContext__FinalConditionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1955:1: ( rule__ExpContext__FinalConditionAssignment_1 )
            {
             before(grammarAccess.getExpContextAccess().getFinalConditionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1956:1: ( rule__ExpContext__FinalConditionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1956:2: rule__ExpContext__FinalConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__ExpContext__FinalConditionAssignment_1_in_rule__ExpContext__Group__1__Impl4022);
            rule__ExpContext__FinalConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpContextAccess().getFinalConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group__1__Impl"


    // $ANTLR start "rule__ExpContext__Group__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1966:1: rule__ExpContext__Group__2 : rule__ExpContext__Group__2__Impl rule__ExpContext__Group__3 ;
    public final void rule__ExpContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1970:1: ( rule__ExpContext__Group__2__Impl rule__ExpContext__Group__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1971:2: rule__ExpContext__Group__2__Impl rule__ExpContext__Group__3
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__2__Impl_in_rule__ExpContext__Group__24052);
            rule__ExpContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group__3_in_rule__ExpContext__Group__24055);
            rule__ExpContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group__2"


    // $ANTLR start "rule__ExpContext__Group__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1978:1: rule__ExpContext__Group__2__Impl : ( ( rule__ExpContext__Group_2__0 )? ) ;
    public final void rule__ExpContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1982:1: ( ( ( rule__ExpContext__Group_2__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1983:1: ( ( rule__ExpContext__Group_2__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1983:1: ( ( rule__ExpContext__Group_2__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1984:1: ( rule__ExpContext__Group_2__0 )?
            {
             before(grammarAccess.getExpContextAccess().getGroup_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1985:1: ( rule__ExpContext__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=12 && LA19_0<=14)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1985:2: rule__ExpContext__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExpContext__Group_2__0_in_rule__ExpContext__Group__2__Impl4082);
                    rule__ExpContext__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpContextAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group__2__Impl"


    // $ANTLR start "rule__ExpContext__Group__3"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1995:1: rule__ExpContext__Group__3 : rule__ExpContext__Group__3__Impl ;
    public final void rule__ExpContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1999:1: ( rule__ExpContext__Group__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2000:2: rule__ExpContext__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__3__Impl_in_rule__ExpContext__Group__34113);
            rule__ExpContext__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group__3"


    // $ANTLR start "rule__ExpContext__Group__3__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2006:1: rule__ExpContext__Group__3__Impl : ( ( rule__ExpContext__Group_3__0 )? ) ;
    public final void rule__ExpContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2010:1: ( ( ( rule__ExpContext__Group_3__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2011:1: ( ( rule__ExpContext__Group_3__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2011:1: ( ( rule__ExpContext__Group_3__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2012:1: ( rule__ExpContext__Group_3__0 )?
            {
             before(grammarAccess.getExpContextAccess().getGroup_3()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2013:1: ( rule__ExpContext__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2013:2: rule__ExpContext__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExpContext__Group_3__0_in_rule__ExpContext__Group__3__Impl4140);
                    rule__ExpContext__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpContextAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group__3__Impl"


    // $ANTLR start "rule__ExpContext__Group_2__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2031:1: rule__ExpContext__Group_2__0 : rule__ExpContext__Group_2__0__Impl rule__ExpContext__Group_2__1 ;
    public final void rule__ExpContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2035:1: ( rule__ExpContext__Group_2__0__Impl rule__ExpContext__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2036:2: rule__ExpContext__Group_2__0__Impl rule__ExpContext__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_2__0__Impl_in_rule__ExpContext__Group_2__04179);
            rule__ExpContext__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group_2__1_in_rule__ExpContext__Group_2__04182);
            rule__ExpContext__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group_2__0"


    // $ANTLR start "rule__ExpContext__Group_2__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2043:1: rule__ExpContext__Group_2__0__Impl : ( ( rule__ExpContext__AllenOpAssignment_2_0 ) ) ;
    public final void rule__ExpContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2047:1: ( ( ( rule__ExpContext__AllenOpAssignment_2_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2048:1: ( ( rule__ExpContext__AllenOpAssignment_2_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2048:1: ( ( rule__ExpContext__AllenOpAssignment_2_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2049:1: ( rule__ExpContext__AllenOpAssignment_2_0 )
            {
             before(grammarAccess.getExpContextAccess().getAllenOpAssignment_2_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2050:1: ( rule__ExpContext__AllenOpAssignment_2_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2050:2: rule__ExpContext__AllenOpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ExpContext__AllenOpAssignment_2_0_in_rule__ExpContext__Group_2__0__Impl4209);
            rule__ExpContext__AllenOpAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExpContextAccess().getAllenOpAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group_2__0__Impl"


    // $ANTLR start "rule__ExpContext__Group_2__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2060:1: rule__ExpContext__Group_2__1 : rule__ExpContext__Group_2__1__Impl ;
    public final void rule__ExpContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2064:1: ( rule__ExpContext__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2065:2: rule__ExpContext__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_2__1__Impl_in_rule__ExpContext__Group_2__14239);
            rule__ExpContext__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group_2__1"


    // $ANTLR start "rule__ExpContext__Group_2__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2071:1: rule__ExpContext__Group_2__1__Impl : ( ( rule__ExpContext__TimeAssignment_2_1 ) ) ;
    public final void rule__ExpContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2075:1: ( ( ( rule__ExpContext__TimeAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2076:1: ( ( rule__ExpContext__TimeAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2076:1: ( ( rule__ExpContext__TimeAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2077:1: ( rule__ExpContext__TimeAssignment_2_1 )
            {
             before(grammarAccess.getExpContextAccess().getTimeAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2078:1: ( rule__ExpContext__TimeAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2078:2: rule__ExpContext__TimeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExpContext__TimeAssignment_2_1_in_rule__ExpContext__Group_2__1__Impl4266);
            rule__ExpContext__TimeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpContextAccess().getTimeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group_2__1__Impl"


    // $ANTLR start "rule__ExpContext__Group_3__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2092:1: rule__ExpContext__Group_3__0 : rule__ExpContext__Group_3__0__Impl rule__ExpContext__Group_3__1 ;
    public final void rule__ExpContext__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2096:1: ( rule__ExpContext__Group_3__0__Impl rule__ExpContext__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2097:2: rule__ExpContext__Group_3__0__Impl rule__ExpContext__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_3__0__Impl_in_rule__ExpContext__Group_3__04300);
            rule__ExpContext__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group_3__1_in_rule__ExpContext__Group_3__04303);
            rule__ExpContext__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group_3__0"


    // $ANTLR start "rule__ExpContext__Group_3__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2104:1: rule__ExpContext__Group_3__0__Impl : ( 'if' ) ;
    public final void rule__ExpContext__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2108:1: ( ( 'if' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2109:1: ( 'if' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2109:1: ( 'if' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2110:1: 'if'
            {
             before(grammarAccess.getExpContextAccess().getIfKeyword_3_0()); 
            match(input,36,FOLLOW_36_in_rule__ExpContext__Group_3__0__Impl4331); 
             after(grammarAccess.getExpContextAccess().getIfKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group_3__0__Impl"


    // $ANTLR start "rule__ExpContext__Group_3__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2123:1: rule__ExpContext__Group_3__1 : rule__ExpContext__Group_3__1__Impl ;
    public final void rule__ExpContext__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2127:1: ( rule__ExpContext__Group_3__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2128:2: rule__ExpContext__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_3__1__Impl_in_rule__ExpContext__Group_3__14362);
            rule__ExpContext__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group_3__1"


    // $ANTLR start "rule__ExpContext__Group_3__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2134:1: rule__ExpContext__Group_3__1__Impl : ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) ) ;
    public final void rule__ExpContext__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2138:1: ( ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2139:1: ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2139:1: ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2140:1: ( rule__ExpContext__InitialConditionAssignment_3_1 )
            {
             before(grammarAccess.getExpContextAccess().getInitialConditionAssignment_3_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2141:1: ( rule__ExpContext__InitialConditionAssignment_3_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2141:2: rule__ExpContext__InitialConditionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ExpContext__InitialConditionAssignment_3_1_in_rule__ExpContext__Group_3__1__Impl4389);
            rule__ExpContext__InitialConditionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExpContextAccess().getInitialConditionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__Group_3__1__Impl"


    // $ANTLR start "rule__AllenOp__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2155:1: rule__AllenOp__Group__0 : rule__AllenOp__Group__0__Impl rule__AllenOp__Group__1 ;
    public final void rule__AllenOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2159:1: ( rule__AllenOp__Group__0__Impl rule__AllenOp__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2160:2: rule__AllenOp__Group__0__Impl rule__AllenOp__Group__1
            {
            pushFollow(FOLLOW_rule__AllenOp__Group__0__Impl_in_rule__AllenOp__Group__04423);
            rule__AllenOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllenOp__Group__1_in_rule__AllenOp__Group__04426);
            rule__AllenOp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllenOp__Group__0"


    // $ANTLR start "rule__AllenOp__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2167:1: rule__AllenOp__Group__0__Impl : ( () ) ;
    public final void rule__AllenOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2171:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2172:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2172:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2173:1: ()
            {
             before(grammarAccess.getAllenOpAccess().getAllenOperatorAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2174:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2176:1: 
            {
            }

             after(grammarAccess.getAllenOpAccess().getAllenOperatorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllenOp__Group__0__Impl"


    // $ANTLR start "rule__AllenOp__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2186:1: rule__AllenOp__Group__1 : rule__AllenOp__Group__1__Impl ;
    public final void rule__AllenOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2190:1: ( rule__AllenOp__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2191:2: rule__AllenOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AllenOp__Group__1__Impl_in_rule__AllenOp__Group__14484);
            rule__AllenOp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllenOp__Group__1"


    // $ANTLR start "rule__AllenOp__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2197:1: rule__AllenOp__Group__1__Impl : ( ( rule__AllenOp__ValueAssignment_1 ) ) ;
    public final void rule__AllenOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2201:1: ( ( ( rule__AllenOp__ValueAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2202:1: ( ( rule__AllenOp__ValueAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2202:1: ( ( rule__AllenOp__ValueAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2203:1: ( rule__AllenOp__ValueAssignment_1 )
            {
             before(grammarAccess.getAllenOpAccess().getValueAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2204:1: ( rule__AllenOp__ValueAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2204:2: rule__AllenOp__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__AllenOp__ValueAssignment_1_in_rule__AllenOp__Group__1__Impl4511);
            rule__AllenOp__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAllenOpAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllenOp__Group__1__Impl"


    // $ANTLR start "rule__Fluent__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2218:1: rule__Fluent__Group__0 : rule__Fluent__Group__0__Impl rule__Fluent__Group__1 ;
    public final void rule__Fluent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2222:1: ( rule__Fluent__Group__0__Impl rule__Fluent__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2223:2: rule__Fluent__Group__0__Impl rule__Fluent__Group__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__04545);
            rule__Fluent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__04548);
            rule__Fluent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__0"


    // $ANTLR start "rule__Fluent__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2230:1: rule__Fluent__Group__0__Impl : ( ( rule__Fluent__NameAssignment_0 ) ) ;
    public final void rule__Fluent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2234:1: ( ( ( rule__Fluent__NameAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2235:1: ( ( rule__Fluent__NameAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2235:1: ( ( rule__Fluent__NameAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2236:1: ( rule__Fluent__NameAssignment_0 )
            {
             before(grammarAccess.getFluentAccess().getNameAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2237:1: ( rule__Fluent__NameAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2237:2: rule__Fluent__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Fluent__NameAssignment_0_in_rule__Fluent__Group__0__Impl4575);
            rule__Fluent__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__0__Impl"


    // $ANTLR start "rule__Fluent__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2247:1: rule__Fluent__Group__1 : rule__Fluent__Group__1__Impl rule__Fluent__Group__2 ;
    public final void rule__Fluent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2251:1: ( rule__Fluent__Group__1__Impl rule__Fluent__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2252:2: rule__Fluent__Group__1__Impl rule__Fluent__Group__2
            {
            pushFollow(FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__14605);
            rule__Fluent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__14608);
            rule__Fluent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__1"


    // $ANTLR start "rule__Fluent__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2259:1: rule__Fluent__Group__1__Impl : ( ( rule__Fluent__Group_1__0 ) ) ;
    public final void rule__Fluent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2263:1: ( ( ( rule__Fluent__Group_1__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2264:1: ( ( rule__Fluent__Group_1__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2264:1: ( ( rule__Fluent__Group_1__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2265:1: ( rule__Fluent__Group_1__0 )
            {
             before(grammarAccess.getFluentAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2266:1: ( rule__Fluent__Group_1__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2266:2: rule__Fluent__Group_1__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl4635);
            rule__Fluent__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__1__Impl"


    // $ANTLR start "rule__Fluent__Group__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2276:1: rule__Fluent__Group__2 : rule__Fluent__Group__2__Impl rule__Fluent__Group__3 ;
    public final void rule__Fluent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2280:1: ( rule__Fluent__Group__2__Impl rule__Fluent__Group__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2281:2: rule__Fluent__Group__2__Impl rule__Fluent__Group__3
            {
            pushFollow(FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__24665);
            rule__Fluent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__24668);
            rule__Fluent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__2"


    // $ANTLR start "rule__Fluent__Group__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2288:1: rule__Fluent__Group__2__Impl : ( ( rule__Fluent__Group_2__0 )? ) ;
    public final void rule__Fluent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2292:1: ( ( ( rule__Fluent__Group_2__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2293:1: ( ( rule__Fluent__Group_2__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2293:1: ( ( rule__Fluent__Group_2__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2294:1: ( rule__Fluent__Group_2__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2295:1: ( rule__Fluent__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2295:2: rule__Fluent__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl4695);
                    rule__Fluent__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFluentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__2__Impl"


    // $ANTLR start "rule__Fluent__Group__3"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2305:1: rule__Fluent__Group__3 : rule__Fluent__Group__3__Impl ;
    public final void rule__Fluent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2309:1: ( rule__Fluent__Group__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2310:2: rule__Fluent__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__34726);
            rule__Fluent__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__3"


    // $ANTLR start "rule__Fluent__Group__3__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2316:1: rule__Fluent__Group__3__Impl : ( ( rule__Fluent__Group_3__0 )? ) ;
    public final void rule__Fluent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2320:1: ( ( ( rule__Fluent__Group_3__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2321:1: ( ( rule__Fluent__Group_3__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2321:1: ( ( rule__Fluent__Group_3__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2322:1: ( rule__Fluent__Group_3__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_3()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2323:1: ( rule__Fluent__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2323:2: rule__Fluent__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl4753);
                    rule__Fluent__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFluentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group__3__Impl"


    // $ANTLR start "rule__Fluent__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2341:1: rule__Fluent__Group_1__0 : rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 ;
    public final void rule__Fluent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2345:1: ( rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2346:2: rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__04792);
            rule__Fluent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__04795);
            rule__Fluent__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_1__0"


    // $ANTLR start "rule__Fluent__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2353:1: rule__Fluent__Group_1__0__Impl : ( 'to' ) ;
    public final void rule__Fluent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2357:1: ( ( 'to' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2358:1: ( 'to' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2358:1: ( 'to' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2359:1: 'to'
            {
             before(grammarAccess.getFluentAccess().getToKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__Fluent__Group_1__0__Impl4823); 
             after(grammarAccess.getFluentAccess().getToKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_1__0__Impl"


    // $ANTLR start "rule__Fluent__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2372:1: rule__Fluent__Group_1__1 : rule__Fluent__Group_1__1__Impl ;
    public final void rule__Fluent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2376:1: ( rule__Fluent__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2377:2: rule__Fluent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__14854);
            rule__Fluent__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_1__1"


    // $ANTLR start "rule__Fluent__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2383:1: rule__Fluent__Group_1__1__Impl : ( ( rule__Fluent__ValuePartAssignment_1_1 ) ) ;
    public final void rule__Fluent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2387:1: ( ( ( rule__Fluent__ValuePartAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2388:1: ( ( rule__Fluent__ValuePartAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2388:1: ( ( rule__Fluent__ValuePartAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2389:1: ( rule__Fluent__ValuePartAssignment_1_1 )
            {
             before(grammarAccess.getFluentAccess().getValuePartAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2390:1: ( rule__Fluent__ValuePartAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2390:2: rule__Fluent__ValuePartAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Fluent__ValuePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl4881);
            rule__Fluent__ValuePartAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getValuePartAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_1__1__Impl"


    // $ANTLR start "rule__Fluent__Group_2__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2404:1: rule__Fluent__Group_2__0 : rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 ;
    public final void rule__Fluent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2408:1: ( rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2409:2: rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__04915);
            rule__Fluent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__04918);
            rule__Fluent__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_2__0"


    // $ANTLR start "rule__Fluent__Group_2__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2416:1: rule__Fluent__Group_2__0__Impl : ( 'in' ) ;
    public final void rule__Fluent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2420:1: ( ( 'in' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2421:1: ( 'in' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2421:1: ( 'in' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2422:1: 'in'
            {
             before(grammarAccess.getFluentAccess().getInKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Fluent__Group_2__0__Impl4946); 
             after(grammarAccess.getFluentAccess().getInKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_2__0__Impl"


    // $ANTLR start "rule__Fluent__Group_2__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2435:1: rule__Fluent__Group_2__1 : rule__Fluent__Group_2__1__Impl ;
    public final void rule__Fluent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2439:1: ( rule__Fluent__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2440:2: rule__Fluent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__14977);
            rule__Fluent__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_2__1"


    // $ANTLR start "rule__Fluent__Group_2__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2446:1: rule__Fluent__Group_2__1__Impl : ( ( rule__Fluent__TimePartAssignment_2_1 ) ) ;
    public final void rule__Fluent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2450:1: ( ( ( rule__Fluent__TimePartAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2451:1: ( ( rule__Fluent__TimePartAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2451:1: ( ( rule__Fluent__TimePartAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2452:1: ( rule__Fluent__TimePartAssignment_2_1 )
            {
             before(grammarAccess.getFluentAccess().getTimePartAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2453:1: ( rule__Fluent__TimePartAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2453:2: rule__Fluent__TimePartAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Fluent__TimePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl5004);
            rule__Fluent__TimePartAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getTimePartAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_2__1__Impl"


    // $ANTLR start "rule__Fluent__Group_3__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2467:1: rule__Fluent__Group_3__0 : rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 ;
    public final void rule__Fluent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2471:1: ( rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2472:2: rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__05038);
            rule__Fluent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__05041);
            rule__Fluent__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_3__0"


    // $ANTLR start "rule__Fluent__Group_3__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2479:1: rule__Fluent__Group_3__0__Impl : ( 'if' ) ;
    public final void rule__Fluent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2483:1: ( ( 'if' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2484:1: ( 'if' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2484:1: ( 'if' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2485:1: 'if'
            {
             before(grammarAccess.getFluentAccess().getIfKeyword_3_0()); 
            match(input,36,FOLLOW_36_in_rule__Fluent__Group_3__0__Impl5069); 
             after(grammarAccess.getFluentAccess().getIfKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_3__0__Impl"


    // $ANTLR start "rule__Fluent__Group_3__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2498:1: rule__Fluent__Group_3__1 : rule__Fluent__Group_3__1__Impl ;
    public final void rule__Fluent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2502:1: ( rule__Fluent__Group_3__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2503:2: rule__Fluent__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__15100);
            rule__Fluent__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_3__1"


    // $ANTLR start "rule__Fluent__Group_3__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2509:1: rule__Fluent__Group_3__1__Impl : ( ( rule__Fluent__CondPartAssignment_3_1 ) ) ;
    public final void rule__Fluent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2513:1: ( ( ( rule__Fluent__CondPartAssignment_3_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2514:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2514:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2515:1: ( rule__Fluent__CondPartAssignment_3_1 )
            {
             before(grammarAccess.getFluentAccess().getCondPartAssignment_3_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2516:1: ( rule__Fluent__CondPartAssignment_3_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2516:2: rule__Fluent__CondPartAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl5127);
            rule__Fluent__CondPartAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getCondPartAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__Group_3__1__Impl"


    // $ANTLR start "rule__ConditionRule__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2530:1: rule__ConditionRule__Group__0 : rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 ;
    public final void rule__ConditionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2534:1: ( rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2535:2: rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__05161);
            rule__ConditionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__05164);
            rule__ConditionRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__Group__0"


    // $ANTLR start "rule__ConditionRule__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2542:1: rule__ConditionRule__Group__0__Impl : ( () ) ;
    public final void rule__ConditionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2546:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2547:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2547:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2548:1: ()
            {
             before(grammarAccess.getConditionRuleAccess().getExpressionAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2549:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2551:1: 
            {
            }

             after(grammarAccess.getConditionRuleAccess().getExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__Group__0__Impl"


    // $ANTLR start "rule__ConditionRule__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2561:1: rule__ConditionRule__Group__1 : rule__ConditionRule__Group__1__Impl ;
    public final void rule__ConditionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2565:1: ( rule__ConditionRule__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2566:2: rule__ConditionRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__15222);
            rule__ConditionRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__Group__1"


    // $ANTLR start "rule__ConditionRule__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2572:1: rule__ConditionRule__Group__1__Impl : ( ( rule__ConditionRule__ConditionAssignment_1 ) ) ;
    public final void rule__ConditionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2576:1: ( ( ( rule__ConditionRule__ConditionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2577:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2577:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2578:1: ( rule__ConditionRule__ConditionAssignment_1 )
            {
             before(grammarAccess.getConditionRuleAccess().getConditionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2579:1: ( rule__ConditionRule__ConditionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2579:2: rule__ConditionRule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl5249);
            rule__ConditionRule__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionRuleAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__Group__1__Impl"


    // $ANTLR start "rule__ToRule__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2593:1: rule__ToRule__Group__0 : rule__ToRule__Group__0__Impl rule__ToRule__Group__1 ;
    public final void rule__ToRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2597:1: ( rule__ToRule__Group__0__Impl rule__ToRule__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2598:2: rule__ToRule__Group__0__Impl rule__ToRule__Group__1
            {
            pushFollow(FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__05283);
            rule__ToRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__05286);
            rule__ToRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__Group__0"


    // $ANTLR start "rule__ToRule__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2605:1: rule__ToRule__Group__0__Impl : ( () ) ;
    public final void rule__ToRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2609:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2610:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2610:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2611:1: ()
            {
             before(grammarAccess.getToRuleAccess().getExpressionAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2612:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2614:1: 
            {
            }

             after(grammarAccess.getToRuleAccess().getExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__Group__0__Impl"


    // $ANTLR start "rule__ToRule__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2624:1: rule__ToRule__Group__1 : rule__ToRule__Group__1__Impl ;
    public final void rule__ToRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2628:1: ( rule__ToRule__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2629:2: rule__ToRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__15344);
            rule__ToRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__Group__1"


    // $ANTLR start "rule__ToRule__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2635:1: rule__ToRule__Group__1__Impl : ( ( rule__ToRule__ExpressionAssignment_1 ) ) ;
    public final void rule__ToRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2639:1: ( ( ( rule__ToRule__ExpressionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2640:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2640:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2641:1: ( rule__ToRule__ExpressionAssignment_1 )
            {
             before(grammarAccess.getToRuleAccess().getExpressionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2642:1: ( rule__ToRule__ExpressionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2642:2: rule__ToRule__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl5371);
            rule__ToRule__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getToRuleAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__Group__1__Impl"


    // $ANTLR start "rule__InRule__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2656:1: rule__InRule__Group__0 : rule__InRule__Group__0__Impl rule__InRule__Group__1 ;
    public final void rule__InRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2660:1: ( rule__InRule__Group__0__Impl rule__InRule__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2661:2: rule__InRule__Group__0__Impl rule__InRule__Group__1
            {
            pushFollow(FOLLOW_rule__InRule__Group__0__Impl_in_rule__InRule__Group__05405);
            rule__InRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InRule__Group__1_in_rule__InRule__Group__05408);
            rule__InRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRule__Group__0"


    // $ANTLR start "rule__InRule__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2668:1: rule__InRule__Group__0__Impl : ( () ) ;
    public final void rule__InRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2672:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2673:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2673:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2674:1: ()
            {
             before(grammarAccess.getInRuleAccess().getExpressionAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2675:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2677:1: 
            {
            }

             after(grammarAccess.getInRuleAccess().getExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRule__Group__0__Impl"


    // $ANTLR start "rule__InRule__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2687:1: rule__InRule__Group__1 : rule__InRule__Group__1__Impl ;
    public final void rule__InRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2691:1: ( rule__InRule__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2692:2: rule__InRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InRule__Group__1__Impl_in_rule__InRule__Group__15466);
            rule__InRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRule__Group__1"


    // $ANTLR start "rule__InRule__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2698:1: rule__InRule__Group__1__Impl : ( ( rule__InRule__ExpressionAssignment_1 ) ) ;
    public final void rule__InRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2702:1: ( ( ( rule__InRule__ExpressionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2703:1: ( ( rule__InRule__ExpressionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2703:1: ( ( rule__InRule__ExpressionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2704:1: ( rule__InRule__ExpressionAssignment_1 )
            {
             before(grammarAccess.getInRuleAccess().getExpressionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2705:1: ( rule__InRule__ExpressionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2705:2: rule__InRule__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__InRule__ExpressionAssignment_1_in_rule__InRule__Group__1__Impl5493);
            rule__InRule__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInRuleAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRule__Group__1__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2719:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2723:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2724:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__05527);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__05530);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2731:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2735:1: ( ( ruleAnd ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2736:1: ( ruleAnd )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2736:1: ( ruleAnd )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2737:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl5557);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2748:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2752:1: ( rule__Or__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2753:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__15586);
            rule__Or__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2759:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2763:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2764:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2764:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2765:1: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2766:1: ( rule__Or__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2766:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl5613);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2780:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2784:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2785:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__05648);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__05651);
            rule__Or__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2792:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2796:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2797:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2797:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2798:1: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2799:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2801:1: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2811:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2815:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2816:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__15709);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__15712);
            rule__Or__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2823:1: rule__Or__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2827:1: ( ( 'OR' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2828:1: ( 'OR' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2828:1: ( 'OR' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2829:1: 'OR'
            {
             before(grammarAccess.getOrAccess().getORKeyword_1_1()); 
            match(input,38,FOLLOW_38_in_rule__Or__Group_1__1__Impl5740); 
             after(grammarAccess.getOrAccess().getORKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2842:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2846:1: ( rule__Or__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2847:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__25771);
            rule__Or__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2853:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2857:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2858:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2858:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2859:1: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2860:1: ( rule__Or__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2860:2: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl5798);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2876:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2880:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2881:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__05834);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__05837);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2888:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2892:1: ( ( ruleEquality ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2893:1: ( ruleEquality )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2893:1: ( ruleEquality )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2894:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__Group__0__Impl5864);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2905:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2909:1: ( rule__And__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2910:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__15893);
            rule__And__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2916:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2920:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2921:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2921:1: ( ( rule__And__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2922:1: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2923:1: ( rule__And__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2923:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl5920);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2937:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2941:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2942:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__05955);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__05958);
            rule__And__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2949:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2953:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2954:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2954:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2955:1: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2956:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2958:1: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2968:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2972:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2973:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__16016);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__16019);
            rule__And__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2980:1: rule__And__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2984:1: ( ( 'AND' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2985:1: ( 'AND' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2985:1: ( 'AND' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2986:1: 'AND'
            {
             before(grammarAccess.getAndAccess().getANDKeyword_1_1()); 
            match(input,39,FOLLOW_39_in_rule__And__Group_1__1__Impl6047); 
             after(grammarAccess.getAndAccess().getANDKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2999:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3003:1: ( rule__And__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3004:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__26078);
            rule__And__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3010:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3014:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3015:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3015:1: ( ( rule__And__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3016:1: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3017:1: ( rule__And__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3017:2: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl6105);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3033:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3037:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3038:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__06141);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__06144);
            rule__Equality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3045:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3049:1: ( ( ruleComparison ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3050:1: ( ruleComparison )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3050:1: ( ruleComparison )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3051:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl6171);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3062:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3066:1: ( rule__Equality__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3067:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__16200);
            rule__Equality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3073:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3077:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3078:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3078:1: ( ( rule__Equality__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3079:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3080:1: ( rule__Equality__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=15 && LA25_0<=16)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3080:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl6227);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3094:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3098:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3099:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__06262);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__06265);
            rule__Equality__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3106:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3110:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3111:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3111:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3112:1: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3113:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3115:1: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3125:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3129:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3130:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__16323);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__16326);
            rule__Equality__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3137:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3141:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3142:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3142:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3143:1: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3144:1: ( rule__Equality__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3144:2: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl6353);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3154:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3158:1: ( rule__Equality__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3159:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__26383);
            rule__Equality__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3165:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3169:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3170:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3170:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3171:1: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3172:1: ( rule__Equality__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3172:2: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl6410);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3188:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3192:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3193:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06446);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06449);
            rule__Comparison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3200:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3204:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3205:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3205:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3206:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl6476);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3217:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3221:1: ( rule__Comparison__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3222:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16505);
            rule__Comparison__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3228:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3232:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3233:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3233:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3234:1: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3235:1: ( rule__Comparison__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=17 && LA26_0<=20)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3235:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6532);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3249:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3253:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3254:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06567);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06570);
            rule__Comparison__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3261:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3265:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3266:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3266:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3267:1: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3268:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3270:1: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3280:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3284:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3285:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16628);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__16631);
            rule__Comparison__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3292:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3296:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3297:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3297:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3298:1: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3299:1: ( rule__Comparison__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3299:2: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl6658);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3309:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3313:1: ( rule__Comparison__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3314:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__26688);
            rule__Comparison__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3320:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3324:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3325:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3325:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3326:1: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3327:1: ( rule__Comparison__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3327:2: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl6715);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3343:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3347:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3348:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__06751);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__06754);
            rule__PlusOrMinus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3355:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3359:1: ( ( ruleMulOrDiv ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3360:1: ( ruleMulOrDiv )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3360:1: ( ruleMulOrDiv )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3361:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl6781);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3372:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3376:1: ( rule__PlusOrMinus__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3377:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__16810);
            rule__PlusOrMinus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3383:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3387:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3388:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3388:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3389:1: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3390:1: ( rule__PlusOrMinus__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=27 && LA27_0<=28)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3390:2: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl6837);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3404:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3408:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3409:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__06872);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__06875);
            rule__PlusOrMinus__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3416:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3420:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3421:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3421:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3422:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3423:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3423:2: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl6902);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3433:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3437:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3438:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__16932);
            rule__PlusOrMinus__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3444:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3448:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3449:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3449:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3450:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3451:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3451:2: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl6959);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3465:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3469:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3470:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__06993);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__06996);
            rule__PlusOrMinus__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3477:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3481:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3482:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3482:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3483:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3484:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3486:1: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3496:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3500:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3501:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__17054);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3507:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3511:1: ( ( '+' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3512:1: ( '+' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3512:1: ( '+' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3513:1: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,28,FOLLOW_28_in_rule__PlusOrMinus__Group_1_0_0__1__Impl7082); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3530:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3534:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3535:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__07117);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__07120);
            rule__PlusOrMinus__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3542:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3546:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3547:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3547:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3548:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3549:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3551:1: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3561:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3565:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3566:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__17178);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3572:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3576:1: ( ( '-' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3577:1: ( '-' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3577:1: ( '-' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3578:1: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,27,FOLLOW_27_in_rule__PlusOrMinus__Group_1_0_1__1__Impl7206); 
             after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3595:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3599:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3600:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__07241);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__07244);
            rule__MulOrDiv__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3607:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3611:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3612:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3612:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3613:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl7271);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3624:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3628:1: ( rule__MulOrDiv__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3629:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__17300);
            rule__MulOrDiv__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3635:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3639:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3640:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3640:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3641:1: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3642:1: ( rule__MulOrDiv__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=21 && LA28_0<=24)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3642:2: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl7327);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMulOrDivAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3656:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3660:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3661:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__07362);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__07365);
            rule__MulOrDiv__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3668:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3672:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3673:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3673:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3674:1: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3675:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3677:1: 
            {
            }

             after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3687:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3691:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3692:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__17423);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__17426);
            rule__MulOrDiv__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3699:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3703:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3704:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3704:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3705:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3706:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3706:2: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl7453);
            rule__MulOrDiv__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3716:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3720:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3721:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__27483);
            rule__MulOrDiv__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__2"


    // $ANTLR start "rule__MulOrDiv__Group_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3727:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3731:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3732:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3732:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3733:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3734:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3734:2: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl7510);
            rule__MulOrDiv__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3750:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3754:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3755:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__07546);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__07549);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3762:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3766:1: ( ( '(' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3767:1: ( '(' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3767:1: ( '(' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3768:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Primary__Group_0__0__Impl7577); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3781:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3785:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3786:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__17608);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__17611);
            rule__Primary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3793:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3797:1: ( ( ruleExpression ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3798:1: ( ruleExpression )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3798:1: ( ruleExpression )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3799:1: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl7638);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3810:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3814:1: ( rule__Primary__Group_0__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3815:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__27667);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3821:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3825:1: ( ( ')' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3826:1: ( ')' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3826:1: ( ')' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3827:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,32,FOLLOW_32_in_rule__Primary__Group_0__2__Impl7695); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3846:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3850:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3851:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__07732);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__07735);
            rule__Primary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3858:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3862:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3863:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3863:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3864:1: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3865:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3867:1: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3877:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3881:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3882:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__17793);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__17796);
            rule__Primary__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3889:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3893:1: ( ( '!' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3894:1: ( '!' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3894:1: ( '!' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3895:1: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,40,FOLLOW_40_in_rule__Primary__Group_1__1__Impl7824); 
             after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3908:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3912:1: ( rule__Primary__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3913:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__27855);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3919:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3923:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3924:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3924:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3925:1: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3926:1: ( rule__Primary__ExpressionAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3926:2: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl7882);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3942:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3946:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3947:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__07918);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__07921);
            rule__Atomic__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3954:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3958:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3959:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3959:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3960:1: ()
            {
             before(grammarAccess.getAtomicAccess().getFloatConstantAction_0_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3961:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3963:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getFloatConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3973:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3977:1: ( rule__Atomic__Group_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3978:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__17979);
            rule__Atomic__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3984:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3988:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3989:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3989:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3990:1: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3991:1: ( rule__Atomic__ValueAssignment_0_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3991:2: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl8006);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4005:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4009:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4010:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__08040);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__08043);
            rule__Atomic__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4017:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4021:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4022:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4022:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4023:1: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4024:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4026:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4036:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4040:1: ( rule__Atomic__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4041:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__18101);
            rule__Atomic__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4047:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4051:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4052:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4052:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4053:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4054:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4054:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl8128);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4068:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4072:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4073:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__08162);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__08165);
            rule__Atomic__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4080:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4084:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4085:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4085:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4086:1: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4087:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4089:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4099:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4103:1: ( rule__Atomic__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4104:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__18223);
            rule__Atomic__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4110:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4114:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4115:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4115:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4116:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4117:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4117:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl8250);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4131:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4135:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4136:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__08284);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__08287);
            rule__Atomic__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4143:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4147:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4148:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4148:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4149:1: ()
            {
             before(grammarAccess.getAtomicAccess().getReferenceAction_3_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4150:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4152:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getReferenceAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4162:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4166:1: ( rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4167:2: rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__18345);
            rule__Atomic__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__18348);
            rule__Atomic__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4174:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__RefAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4178:1: ( ( ( rule__Atomic__RefAssignment_3_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4179:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4179:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4180:1: ( rule__Atomic__RefAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4181:1: ( rule__Atomic__RefAssignment_3_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4181:2: rule__Atomic__RefAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Atomic__RefAssignment_3_1_in_rule__Atomic__Group_3__1__Impl8375);
            rule__Atomic__RefAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4191:1: rule__Atomic__Group_3__2 : rule__Atomic__Group_3__2__Impl ;
    public final void rule__Atomic__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4195:1: ( rule__Atomic__Group_3__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4196:2: rule__Atomic__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__28405);
            rule__Atomic__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__2"


    // $ANTLR start "rule__Atomic__Group_3__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4202:1: rule__Atomic__Group_3__2__Impl : ( ( rule__Atomic__Group_3_2__0 )? ) ;
    public final void rule__Atomic__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4206:1: ( ( ( rule__Atomic__Group_3_2__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4207:1: ( ( rule__Atomic__Group_3_2__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4207:1: ( ( rule__Atomic__Group_3_2__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4208:1: ( rule__Atomic__Group_3_2__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_3_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4209:1: ( rule__Atomic__Group_3_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4209:2: rule__Atomic__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3_2__0_in_rule__Atomic__Group_3__2__Impl8432);
                    rule__Atomic__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__2__Impl"


    // $ANTLR start "rule__Atomic__Group_3_2__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4225:1: rule__Atomic__Group_3_2__0 : rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1 ;
    public final void rule__Atomic__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4229:1: ( rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4230:2: rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3_2__0__Impl_in_rule__Atomic__Group_3_2__08469);
            rule__Atomic__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3_2__1_in_rule__Atomic__Group_3_2__08472);
            rule__Atomic__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3_2__0"


    // $ANTLR start "rule__Atomic__Group_3_2__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4237:1: rule__Atomic__Group_3_2__0__Impl : ( 'at' ) ;
    public final void rule__Atomic__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4241:1: ( ( 'at' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4242:1: ( 'at' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4242:1: ( 'at' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4243:1: 'at'
            {
             before(grammarAccess.getAtomicAccess().getAtKeyword_3_2_0()); 
            match(input,41,FOLLOW_41_in_rule__Atomic__Group_3_2__0__Impl8500); 
             after(grammarAccess.getAtomicAccess().getAtKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3_2__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4256:1: rule__Atomic__Group_3_2__1 : rule__Atomic__Group_3_2__1__Impl ;
    public final void rule__Atomic__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4260:1: ( rule__Atomic__Group_3_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4261:2: rule__Atomic__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3_2__1__Impl_in_rule__Atomic__Group_3_2__18531);
            rule__Atomic__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3_2__1"


    // $ANTLR start "rule__Atomic__Group_3_2__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4267:1: rule__Atomic__Group_3_2__1__Impl : ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) ) ;
    public final void rule__Atomic__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4271:1: ( ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4272:1: ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4272:1: ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4273:1: ( rule__Atomic__FluentValueSampleAssignment_3_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getFluentValueSampleAssignment_3_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4274:1: ( rule__Atomic__FluentValueSampleAssignment_3_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4274:2: rule__Atomic__FluentValueSampleAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__FluentValueSampleAssignment_3_2_1_in_rule__Atomic__Group_3_2__1__Impl8558);
            rule__Atomic__FluentValueSampleAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getFluentValueSampleAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_4__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4288:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4292:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4293:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__08592);
            rule__Atomic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__08595);
            rule__Atomic__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0"


    // $ANTLR start "rule__Atomic__Group_4__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4300:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4304:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4305:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4305:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4306:1: ()
            {
             before(grammarAccess.getAtomicAccess().getCurrentTimeAction_4_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4307:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4309:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getCurrentTimeAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0__Impl"


    // $ANTLR start "rule__Atomic__Group_4__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4319:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4323:1: ( rule__Atomic__Group_4__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4324:2: rule__Atomic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__18653);
            rule__Atomic__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__1"


    // $ANTLR start "rule__Atomic__Group_4__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4330:1: rule__Atomic__Group_4__1__Impl : ( ( rule__Atomic__ValueAssignment_4_1 ) ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4334:1: ( ( ( rule__Atomic__ValueAssignment_4_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4335:1: ( ( rule__Atomic__ValueAssignment_4_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4335:1: ( ( rule__Atomic__ValueAssignment_4_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4336:1: ( rule__Atomic__ValueAssignment_4_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_4_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4337:1: ( rule__Atomic__ValueAssignment_4_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4337:2: rule__Atomic__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_4_1_in_rule__Atomic__Group_4__1__Impl8680);
            rule__Atomic__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__1__Impl"


    // $ANTLR start "rule__AtTimeExpression__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4351:1: rule__AtTimeExpression__Group__0 : rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1 ;
    public final void rule__AtTimeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4355:1: ( rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4356:2: rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group__0__Impl_in_rule__AtTimeExpression__Group__08714);
            rule__AtTimeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group__1_in_rule__AtTimeExpression__Group__08717);
            rule__AtTimeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group__0"


    // $ANTLR start "rule__AtTimeExpression__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4363:1: rule__AtTimeExpression__Group__0__Impl : ( ruleAtTimePrimary ) ;
    public final void rule__AtTimeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4367:1: ( ( ruleAtTimePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4368:1: ( ruleAtTimePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4368:1: ( ruleAtTimePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4369:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtTimeExpressionAccess().getAtTimePrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__Group__0__Impl8744);
            ruleAtTimePrimary();

            state._fsp--;

             after(grammarAccess.getAtTimeExpressionAccess().getAtTimePrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group__0__Impl"


    // $ANTLR start "rule__AtTimeExpression__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4380:1: rule__AtTimeExpression__Group__1 : rule__AtTimeExpression__Group__1__Impl ;
    public final void rule__AtTimeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4384:1: ( rule__AtTimeExpression__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4385:2: rule__AtTimeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group__1__Impl_in_rule__AtTimeExpression__Group__18773);
            rule__AtTimeExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group__1"


    // $ANTLR start "rule__AtTimeExpression__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4391:1: rule__AtTimeExpression__Group__1__Impl : ( ( rule__AtTimeExpression__Group_1__0 )* ) ;
    public final void rule__AtTimeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4395:1: ( ( ( rule__AtTimeExpression__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4396:1: ( ( rule__AtTimeExpression__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4396:1: ( ( rule__AtTimeExpression__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4397:1: ( rule__AtTimeExpression__Group_1__0 )*
            {
             before(grammarAccess.getAtTimeExpressionAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4398:1: ( rule__AtTimeExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=27 && LA30_0<=28)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4398:2: rule__AtTimeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__0_in_rule__AtTimeExpression__Group__1__Impl8800);
            	    rule__AtTimeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getAtTimeExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group__1__Impl"


    // $ANTLR start "rule__AtTimeExpression__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4412:1: rule__AtTimeExpression__Group_1__0 : rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1 ;
    public final void rule__AtTimeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4416:1: ( rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4417:2: rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__0__Impl_in_rule__AtTimeExpression__Group_1__08835);
            rule__AtTimeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__1_in_rule__AtTimeExpression__Group_1__08838);
            rule__AtTimeExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group_1__0"


    // $ANTLR start "rule__AtTimeExpression__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4424:1: rule__AtTimeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AtTimeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4428:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4429:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4429:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4430:1: ()
            {
             before(grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4431:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4433:1: 
            {
            }

             after(grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AtTimeExpression__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4443:1: rule__AtTimeExpression__Group_1__1 : rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2 ;
    public final void rule__AtTimeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4447:1: ( rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4448:2: rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__1__Impl_in_rule__AtTimeExpression__Group_1__18896);
            rule__AtTimeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__2_in_rule__AtTimeExpression__Group_1__18899);
            rule__AtTimeExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group_1__1"


    // $ANTLR start "rule__AtTimeExpression__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4455:1: rule__AtTimeExpression__Group_1__1__Impl : ( ( rule__AtTimeExpression__OpAssignment_1_1 ) ) ;
    public final void rule__AtTimeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4459:1: ( ( ( rule__AtTimeExpression__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4460:1: ( ( rule__AtTimeExpression__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4460:1: ( ( rule__AtTimeExpression__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4461:1: ( rule__AtTimeExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4462:1: ( rule__AtTimeExpression__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4462:2: rule__AtTimeExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__OpAssignment_1_1_in_rule__AtTimeExpression__Group_1__1__Impl8926);
            rule__AtTimeExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeExpressionAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AtTimeExpression__Group_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4472:1: rule__AtTimeExpression__Group_1__2 : rule__AtTimeExpression__Group_1__2__Impl ;
    public final void rule__AtTimeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4476:1: ( rule__AtTimeExpression__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4477:2: rule__AtTimeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__2__Impl_in_rule__AtTimeExpression__Group_1__28956);
            rule__AtTimeExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group_1__2"


    // $ANTLR start "rule__AtTimeExpression__Group_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4483:1: rule__AtTimeExpression__Group_1__2__Impl : ( ( rule__AtTimeExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AtTimeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4487:1: ( ( ( rule__AtTimeExpression__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4488:1: ( ( rule__AtTimeExpression__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4488:1: ( ( rule__AtTimeExpression__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4489:1: ( rule__AtTimeExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4490:1: ( rule__AtTimeExpression__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4490:2: rule__AtTimeExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__RightAssignment_1_2_in_rule__AtTimeExpression__Group_1__2__Impl8983);
            rule__AtTimeExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AtTimePrimary__Group_0__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4506:1: rule__AtTimePrimary__Group_0__0 : rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1 ;
    public final void rule__AtTimePrimary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4510:1: ( rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4511:2: rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__0__Impl_in_rule__AtTimePrimary__Group_0__09019);
            rule__AtTimePrimary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__1_in_rule__AtTimePrimary__Group_0__09022);
            rule__AtTimePrimary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Group_0__0"


    // $ANTLR start "rule__AtTimePrimary__Group_0__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4518:1: rule__AtTimePrimary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__AtTimePrimary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4522:1: ( ( '(' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4523:1: ( '(' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4523:1: ( '(' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4524:1: '('
            {
             before(grammarAccess.getAtTimePrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__AtTimePrimary__Group_0__0__Impl9050); 
             after(grammarAccess.getAtTimePrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Group_0__0__Impl"


    // $ANTLR start "rule__AtTimePrimary__Group_0__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4537:1: rule__AtTimePrimary__Group_0__1 : rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2 ;
    public final void rule__AtTimePrimary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4541:1: ( rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4542:2: rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__1__Impl_in_rule__AtTimePrimary__Group_0__19081);
            rule__AtTimePrimary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__2_in_rule__AtTimePrimary__Group_0__19084);
            rule__AtTimePrimary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Group_0__1"


    // $ANTLR start "rule__AtTimePrimary__Group_0__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4549:1: rule__AtTimePrimary__Group_0__1__Impl : ( ruleAtTimeExpression ) ;
    public final void rule__AtTimePrimary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4553:1: ( ( ruleAtTimeExpression ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4554:1: ( ruleAtTimeExpression )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4554:1: ( ruleAtTimeExpression )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4555:1: ruleAtTimeExpression
            {
             before(grammarAccess.getAtTimePrimaryAccess().getAtTimeExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleAtTimeExpression_in_rule__AtTimePrimary__Group_0__1__Impl9111);
            ruleAtTimeExpression();

            state._fsp--;

             after(grammarAccess.getAtTimePrimaryAccess().getAtTimeExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Group_0__1__Impl"


    // $ANTLR start "rule__AtTimePrimary__Group_0__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4566:1: rule__AtTimePrimary__Group_0__2 : rule__AtTimePrimary__Group_0__2__Impl ;
    public final void rule__AtTimePrimary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4570:1: ( rule__AtTimePrimary__Group_0__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4571:2: rule__AtTimePrimary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__2__Impl_in_rule__AtTimePrimary__Group_0__29140);
            rule__AtTimePrimary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Group_0__2"


    // $ANTLR start "rule__AtTimePrimary__Group_0__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4577:1: rule__AtTimePrimary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__AtTimePrimary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4581:1: ( ( ')' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4582:1: ( ')' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4582:1: ( ')' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4583:1: ')'
            {
             before(grammarAccess.getAtTimePrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,32,FOLLOW_32_in_rule__AtTimePrimary__Group_0__2__Impl9168); 
             after(grammarAccess.getAtTimePrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimePrimary__Group_0__2__Impl"


    // $ANTLR start "rule__AtTimeAtomic__Group_0__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4602:1: rule__AtTimeAtomic__Group_0__0 : rule__AtTimeAtomic__Group_0__0__Impl rule__AtTimeAtomic__Group_0__1 ;
    public final void rule__AtTimeAtomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4606:1: ( rule__AtTimeAtomic__Group_0__0__Impl rule__AtTimeAtomic__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4607:2: rule__AtTimeAtomic__Group_0__0__Impl rule__AtTimeAtomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__0__Impl_in_rule__AtTimeAtomic__Group_0__09205);
            rule__AtTimeAtomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__1_in_rule__AtTimeAtomic__Group_0__09208);
            rule__AtTimeAtomic__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group_0__0"


    // $ANTLR start "rule__AtTimeAtomic__Group_0__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4614:1: rule__AtTimeAtomic__Group_0__0__Impl : ( () ) ;
    public final void rule__AtTimeAtomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4618:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4619:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4619:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4620:1: ()
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeIntConstantAction_0_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4621:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4623:1: 
            {
            }

             after(grammarAccess.getAtTimeAtomicAccess().getAtTimeIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group_0__0__Impl"


    // $ANTLR start "rule__AtTimeAtomic__Group_0__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4633:1: rule__AtTimeAtomic__Group_0__1 : rule__AtTimeAtomic__Group_0__1__Impl ;
    public final void rule__AtTimeAtomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4637:1: ( rule__AtTimeAtomic__Group_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4638:2: rule__AtTimeAtomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__1__Impl_in_rule__AtTimeAtomic__Group_0__19266);
            rule__AtTimeAtomic__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group_0__1"


    // $ANTLR start "rule__AtTimeAtomic__Group_0__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4644:1: rule__AtTimeAtomic__Group_0__1__Impl : ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) ) ;
    public final void rule__AtTimeAtomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4648:1: ( ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4649:1: ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4649:1: ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4650:1: ( rule__AtTimeAtomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getValueAssignment_0_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4651:1: ( rule__AtTimeAtomic__ValueAssignment_0_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4651:2: rule__AtTimeAtomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__ValueAssignment_0_1_in_rule__AtTimeAtomic__Group_0__1__Impl9293);
            rule__AtTimeAtomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeAtomicAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group_0__1__Impl"


    // $ANTLR start "rule__AtTimeAtomic__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4665:1: rule__AtTimeAtomic__Group_1__0 : rule__AtTimeAtomic__Group_1__0__Impl rule__AtTimeAtomic__Group_1__1 ;
    public final void rule__AtTimeAtomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4669:1: ( rule__AtTimeAtomic__Group_1__0__Impl rule__AtTimeAtomic__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4670:2: rule__AtTimeAtomic__Group_1__0__Impl rule__AtTimeAtomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__0__Impl_in_rule__AtTimeAtomic__Group_1__09327);
            rule__AtTimeAtomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__1_in_rule__AtTimeAtomic__Group_1__09330);
            rule__AtTimeAtomic__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group_1__0"


    // $ANTLR start "rule__AtTimeAtomic__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4677:1: rule__AtTimeAtomic__Group_1__0__Impl : ( () ) ;
    public final void rule__AtTimeAtomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4681:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4682:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4682:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4683:1: ()
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeCurrentTimeAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4684:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4686:1: 
            {
            }

             after(grammarAccess.getAtTimeAtomicAccess().getAtTimeCurrentTimeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group_1__0__Impl"


    // $ANTLR start "rule__AtTimeAtomic__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4696:1: rule__AtTimeAtomic__Group_1__1 : rule__AtTimeAtomic__Group_1__1__Impl ;
    public final void rule__AtTimeAtomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4700:1: ( rule__AtTimeAtomic__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4701:2: rule__AtTimeAtomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__1__Impl_in_rule__AtTimeAtomic__Group_1__19388);
            rule__AtTimeAtomic__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group_1__1"


    // $ANTLR start "rule__AtTimeAtomic__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4707:1: rule__AtTimeAtomic__Group_1__1__Impl : ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) ) ;
    public final void rule__AtTimeAtomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4711:1: ( ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4712:1: ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4712:1: ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4713:1: ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4714:1: ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4714:2: rule__AtTimeAtomic__AtTimeValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__AtTimeValueAssignment_1_1_in_rule__AtTimeAtomic__Group_1__1__Impl9415);
            rule__AtTimeAtomic__AtTimeValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__Group_1__1__Impl"


    // $ANTLR start "rule__EceModel__StatementsAssignment"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4729:1: rule__EceModel__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__EceModel__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4733:1: ( ( ruleStatement ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4734:1: ( ruleStatement )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4734:1: ( ruleStatement )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4735:1: ruleStatement
            {
             before(grammarAccess.getEceModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__EceModel__StatementsAssignment9454);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getEceModelAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EceModel__StatementsAssignment"


    // $ANTLR start "rule__Statement__EventAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4744:1: rule__Statement__EventAssignment_1 : ( ruleEvent ) ;
    public final void rule__Statement__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4748:1: ( ( ruleEvent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4749:1: ( ruleEvent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4749:1: ( ruleEvent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4750:1: ruleEvent
            {
             before(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_19485);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__EventAssignment_1"


    // $ANTLR start "rule__Statement__ContextsListAssignment_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4759:1: rule__Statement__ContextsListAssignment_2 : ( ruleContextsList ) ;
    public final void rule__Statement__ContextsListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4763:1: ( ( ruleContextsList ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4764:1: ( ruleContextsList )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4764:1: ( ruleContextsList )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4765:1: ruleContextsList
            {
             before(grammarAccess.getStatementAccess().getContextsListContextsListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleContextsList_in_rule__Statement__ContextsListAssignment_29516);
            ruleContextsList();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getContextsListContextsListParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ContextsListAssignment_2"


    // $ANTLR start "rule__Event__EventNameAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4774:1: rule__Event__EventNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4778:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4779:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4779:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4780:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_09547); 
             after(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventNameAssignment_0"


    // $ANTLR start "rule__Event__ParamsAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4789:1: rule__Event__ParamsAssignment_1_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4793:1: ( ( ruleEventFeature ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4794:1: ( ruleEventFeature )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4794:1: ( ruleEventFeature )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4795:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamsEventFeatureParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_19578);
            ruleEventFeature();

            state._fsp--;

             after(grammarAccess.getEventAccess().getParamsEventFeatureParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ParamsAssignment_1_1"


    // $ANTLR start "rule__Event__ParamsAssignment_1_2_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4804:1: rule__Event__ParamsAssignment_1_2_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4808:1: ( ( ruleEventFeature ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4809:1: ( ruleEventFeature )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4809:1: ( ruleEventFeature )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4810:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamsEventFeatureParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_2_19609);
            ruleEventFeature();

            state._fsp--;

             after(grammarAccess.getEventAccess().getParamsEventFeatureParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ParamsAssignment_1_2_1"


    // $ANTLR start "rule__EventFeature__NameAssignment"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4819:1: rule__EventFeature__NameAssignment : ( RULE_ID ) ;
    public final void rule__EventFeature__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4823:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4824:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4824:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4825:1: RULE_ID
            {
             before(grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment9640); 
             after(grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventFeature__NameAssignment"


    // $ANTLR start "rule__ContextsList__EcContextsListAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4834:1: rule__ContextsList__EcContextsListAssignment_0 : ( ruleEcContextsList ) ;
    public final void rule__ContextsList__EcContextsListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4838:1: ( ( ruleEcContextsList ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4839:1: ( ruleEcContextsList )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4839:1: ( ruleEcContextsList )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4840:1: ruleEcContextsList
            {
             before(grammarAccess.getContextsListAccess().getEcContextsListEcContextsListParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEcContextsList_in_rule__ContextsList__EcContextsListAssignment_09671);
            ruleEcContextsList();

            state._fsp--;

             after(grammarAccess.getContextsListAccess().getEcContextsListEcContextsListParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextsList__EcContextsListAssignment_0"


    // $ANTLR start "rule__ContextsList__ExpContextsListAssignment_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4849:1: rule__ContextsList__ExpContextsListAssignment_2 : ( ruleExpContextsList ) ;
    public final void rule__ContextsList__ExpContextsListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4853:1: ( ( ruleExpContextsList ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4854:1: ( ruleExpContextsList )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4854:1: ( ruleExpContextsList )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4855:1: ruleExpContextsList
            {
             before(grammarAccess.getContextsListAccess().getExpContextsListExpContextsListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpContextsList_in_rule__ContextsList__ExpContextsListAssignment_29702);
            ruleExpContextsList();

            state._fsp--;

             after(grammarAccess.getContextsListAccess().getExpContextsListExpContextsListParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextsList__ExpContextsListAssignment_2"


    // $ANTLR start "rule__EcContextsList__EcContextsAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4864:1: rule__EcContextsList__EcContextsAssignment_0 : ( ruleEcContext ) ;
    public final void rule__EcContextsList__EcContextsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4868:1: ( ( ruleEcContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4869:1: ( ruleEcContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4869:1: ( ruleEcContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4870:1: ruleEcContext
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_09733);
            ruleEcContext();

            state._fsp--;

             after(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContextsList__EcContextsAssignment_0"


    // $ANTLR start "rule__EcContextsList__EcContextsAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4879:1: rule__EcContextsList__EcContextsAssignment_1_1 : ( ruleEcContext ) ;
    public final void rule__EcContextsList__EcContextsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4883:1: ( ( ruleEcContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4884:1: ( ruleEcContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4884:1: ( ruleEcContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4885:1: ruleEcContext
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_1_19764);
            ruleEcContext();

            state._fsp--;

             after(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContextsList__EcContextsAssignment_1_1"


    // $ANTLR start "rule__ExpContextsList__ExpContextsAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4894:1: rule__ExpContextsList__ExpContextsAssignment_0 : ( ruleExpContext ) ;
    public final void rule__ExpContextsList__ExpContextsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4898:1: ( ( ruleExpContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4899:1: ( ruleExpContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4899:1: ( ruleExpContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4900:1: ruleExpContext
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_09795);
            ruleExpContext();

            state._fsp--;

             after(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContextsList__ExpContextsAssignment_0"


    // $ANTLR start "rule__ExpContextsList__ExpContextsAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4909:1: rule__ExpContextsList__ExpContextsAssignment_1_1 : ( ruleExpContext ) ;
    public final void rule__ExpContextsList__ExpContextsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4913:1: ( ( ruleExpContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4914:1: ( ruleExpContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4914:1: ( ruleExpContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4915:1: ruleExpContext
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_1_19826);
            ruleExpContext();

            state._fsp--;

             after(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContextsList__ExpContextsAssignment_1_1"


    // $ANTLR start "rule__EcContext__FluentAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4924:1: rule__EcContext__FluentAssignment_1 : ( ruleFluent ) ;
    public final void rule__EcContext__FluentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4928:1: ( ( ruleFluent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4929:1: ( ruleFluent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4929:1: ( ruleFluent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4930:1: ruleFluent
            {
             before(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_19857);
            ruleFluent();

            state._fsp--;

             after(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EcContext__FluentAssignment_1"


    // $ANTLR start "rule__ExpContext__FinalConditionAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4939:1: rule__ExpContext__FinalConditionAssignment_1 : ( ruleConditionRule ) ;
    public final void rule__ExpContext__FinalConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4943:1: ( ( ruleConditionRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4944:1: ( ruleConditionRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4944:1: ( ruleConditionRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4945:1: ruleConditionRule
            {
             before(grammarAccess.getExpContextAccess().getFinalConditionConditionRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__ExpContext__FinalConditionAssignment_19888);
            ruleConditionRule();

            state._fsp--;

             after(grammarAccess.getExpContextAccess().getFinalConditionConditionRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__FinalConditionAssignment_1"


    // $ANTLR start "rule__ExpContext__AllenOpAssignment_2_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4954:1: rule__ExpContext__AllenOpAssignment_2_0 : ( ruleAllenOp ) ;
    public final void rule__ExpContext__AllenOpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4958:1: ( ( ruleAllenOp ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4959:1: ( ruleAllenOp )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4959:1: ( ruleAllenOp )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4960:1: ruleAllenOp
            {
             before(grammarAccess.getExpContextAccess().getAllenOpAllenOpParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleAllenOp_in_rule__ExpContext__AllenOpAssignment_2_09919);
            ruleAllenOp();

            state._fsp--;

             after(grammarAccess.getExpContextAccess().getAllenOpAllenOpParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__AllenOpAssignment_2_0"


    // $ANTLR start "rule__ExpContext__TimeAssignment_2_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4969:1: rule__ExpContext__TimeAssignment_2_1 : ( rulePlusOrMinus ) ;
    public final void rule__ExpContext__TimeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4973:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4974:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4974:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4975:1: rulePlusOrMinus
            {
             before(grammarAccess.getExpContextAccess().getTimePlusOrMinusParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__ExpContext__TimeAssignment_2_19950);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getExpContextAccess().getTimePlusOrMinusParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__TimeAssignment_2_1"


    // $ANTLR start "rule__ExpContext__InitialConditionAssignment_3_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4984:1: rule__ExpContext__InitialConditionAssignment_3_1 : ( ruleConditionRule ) ;
    public final void rule__ExpContext__InitialConditionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4988:1: ( ( ruleConditionRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4989:1: ( ruleConditionRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4989:1: ( ruleConditionRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4990:1: ruleConditionRule
            {
             before(grammarAccess.getExpContextAccess().getInitialConditionConditionRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__ExpContext__InitialConditionAssignment_3_19981);
            ruleConditionRule();

            state._fsp--;

             after(grammarAccess.getExpContextAccess().getInitialConditionConditionRuleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpContext__InitialConditionAssignment_3_1"


    // $ANTLR start "rule__AllenOp__ValueAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4999:1: rule__AllenOp__ValueAssignment_1 : ( ( rule__AllenOp__ValueAlternatives_1_0 ) ) ;
    public final void rule__AllenOp__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5003:1: ( ( ( rule__AllenOp__ValueAlternatives_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5004:1: ( ( rule__AllenOp__ValueAlternatives_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5004:1: ( ( rule__AllenOp__ValueAlternatives_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5005:1: ( rule__AllenOp__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getAllenOpAccess().getValueAlternatives_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5006:1: ( rule__AllenOp__ValueAlternatives_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5006:2: rule__AllenOp__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AllenOp__ValueAlternatives_1_0_in_rule__AllenOp__ValueAssignment_110012);
            rule__AllenOp__ValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAllenOpAccess().getValueAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllenOp__ValueAssignment_1"


    // $ANTLR start "rule__Fluent__NameAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5015:1: rule__Fluent__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Fluent__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5019:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5020:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5020:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5021:1: RULE_ID
            {
             before(grammarAccess.getFluentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fluent__NameAssignment_010045); 
             after(grammarAccess.getFluentAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__NameAssignment_0"


    // $ANTLR start "rule__Fluent__ValuePartAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5030:1: rule__Fluent__ValuePartAssignment_1_1 : ( ruleToRule ) ;
    public final void rule__Fluent__ValuePartAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5034:1: ( ( ruleToRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5035:1: ( ruleToRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5035:1: ( ruleToRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5036:1: ruleToRule
            {
             before(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_1_110076);
            ruleToRule();

            state._fsp--;

             after(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__ValuePartAssignment_1_1"


    // $ANTLR start "rule__Fluent__TimePartAssignment_2_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5045:1: rule__Fluent__TimePartAssignment_2_1 : ( ruleInRule ) ;
    public final void rule__Fluent__TimePartAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5049:1: ( ( ruleInRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5050:1: ( ruleInRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5050:1: ( ruleInRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5051:1: ruleInRule
            {
             before(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_2_110107);
            ruleInRule();

            state._fsp--;

             after(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__TimePartAssignment_2_1"


    // $ANTLR start "rule__Fluent__CondPartAssignment_3_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5060:1: rule__Fluent__CondPartAssignment_3_1 : ( ruleConditionRule ) ;
    public final void rule__Fluent__CondPartAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5064:1: ( ( ruleConditionRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5065:1: ( ruleConditionRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5065:1: ( ruleConditionRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5066:1: ruleConditionRule
            {
             before(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_110138);
            ruleConditionRule();

            state._fsp--;

             after(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__CondPartAssignment_3_1"


    // $ANTLR start "rule__ConditionRule__ConditionAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5075:1: rule__ConditionRule__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ConditionRule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5079:1: ( ( ruleExpression ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5080:1: ( ruleExpression )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5080:1: ( ruleExpression )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5081:1: ruleExpression
            {
             before(grammarAccess.getConditionRuleAccess().getConditionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_110169);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConditionRuleAccess().getConditionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__ConditionAssignment_1"


    // $ANTLR start "rule__ToRule__ExpressionAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5090:1: rule__ToRule__ExpressionAssignment_1 : ( rulePlusOrMinus ) ;
    public final void rule__ToRule__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5094:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5095:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5095:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5096:1: rulePlusOrMinus
            {
             before(grammarAccess.getToRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_110200);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getToRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__ExpressionAssignment_1"


    // $ANTLR start "rule__InRule__ExpressionAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5105:1: rule__InRule__ExpressionAssignment_1 : ( rulePlusOrMinus ) ;
    public final void rule__InRule__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5109:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5110:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5110:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5111:1: rulePlusOrMinus
            {
             before(grammarAccess.getInRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__InRule__ExpressionAssignment_110231);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getInRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRule__ExpressionAssignment_1"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5120:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5124:1: ( ( ruleAnd ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5125:1: ( ruleAnd )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5125:1: ( ruleAnd )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5126:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_210262);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5135:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5139:1: ( ( ruleEquality ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5140:1: ( ruleEquality )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5140:1: ( ruleEquality )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5141:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_210293);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5150:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5154:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5155:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5155:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5156:1: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5157:1: ( rule__Equality__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5157:2: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_110324);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5166:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5170:1: ( ( ruleComparison ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5171:1: ( ruleComparison )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5171:1: ( ruleComparison )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5172:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_210357);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5181:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5185:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5186:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5186:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5187:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5188:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5188:2: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_110388);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5197:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5201:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5202:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5202:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5203:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_210421);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5212:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5216:1: ( ( ruleMulOrDiv ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5217:1: ( ruleMulOrDiv )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5217:1: ( ruleMulOrDiv )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5218:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_110452);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5227:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5231:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5232:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5232:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5233:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5234:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5234:2: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_110483);
            rule__MulOrDiv__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5243:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5247:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5248:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5248:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5249:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_210516);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5258:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5262:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5263:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5263:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5264:1: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_210547);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5273:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_FLOAT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5277:1: ( ( RULE_FLOAT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5278:1: ( RULE_FLOAT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5278:1: ( RULE_FLOAT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5279:1: RULE_FLOAT
            {
             before(grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_0_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_110578); 
             after(grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5288:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5292:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5293:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5293:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5294:1: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_110609); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5303:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5307:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5308:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5308:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5309:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5310:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5310:2: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_110640);
            rule__Atomic__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__RefAssignment_3_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5319:1: rule__Atomic__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5323:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5324:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5324:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5325:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getRefReferenceTypeCrossReference_3_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5326:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5327:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getRefReferenceTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_3_110677); 
             after(grammarAccess.getAtomicAccess().getRefReferenceTypeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getRefReferenceTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__RefAssignment_3_1"


    // $ANTLR start "rule__Atomic__FluentValueSampleAssignment_3_2_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5338:1: rule__Atomic__FluentValueSampleAssignment_3_2_1 : ( ruleAtTimePrimary ) ;
    public final void rule__Atomic__FluentValueSampleAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5342:1: ( ( ruleAtTimePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5343:1: ( ruleAtTimePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5343:1: ( ruleAtTimePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5344:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtomicAccess().getFluentValueSampleAtTimePrimaryParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__Atomic__FluentValueSampleAssignment_3_2_110712);
            ruleAtTimePrimary();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getFluentValueSampleAtTimePrimaryParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__FluentValueSampleAssignment_3_2_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_4_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5353:1: rule__Atomic__ValueAssignment_4_1 : ( ( 'now' ) ) ;
    public final void rule__Atomic__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5357:1: ( ( ( 'now' ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5358:1: ( ( 'now' ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5358:1: ( ( 'now' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5359:1: ( 'now' )
            {
             before(grammarAccess.getAtomicAccess().getValueNowKeyword_4_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5360:1: ( 'now' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5361:1: 'now'
            {
             before(grammarAccess.getAtomicAccess().getValueNowKeyword_4_1_0()); 
            match(input,42,FOLLOW_42_in_rule__Atomic__ValueAssignment_4_110748); 
             after(grammarAccess.getAtomicAccess().getValueNowKeyword_4_1_0()); 

            }

             after(grammarAccess.getAtomicAccess().getValueNowKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_4_1"


    // $ANTLR start "rule__AtTimeExpression__OpAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5376:1: rule__AtTimeExpression__OpAssignment_1_1 : ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__AtTimeExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5380:1: ( ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5381:1: ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5381:1: ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5382:1: ( rule__AtTimeExpression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5383:1: ( rule__AtTimeExpression__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5383:2: rule__AtTimeExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__OpAlternatives_1_1_0_in_rule__AtTimeExpression__OpAssignment_1_110787);
            rule__AtTimeExpression__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtTimeExpressionAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__OpAssignment_1_1"


    // $ANTLR start "rule__AtTimeExpression__RightAssignment_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5392:1: rule__AtTimeExpression__RightAssignment_1_2 : ( ruleAtTimePrimary ) ;
    public final void rule__AtTimeExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5396:1: ( ( ruleAtTimePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5397:1: ( ruleAtTimePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5397:1: ( ruleAtTimePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5398:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtTimeExpressionAccess().getRightAtTimePrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__RightAssignment_1_210820);
            ruleAtTimePrimary();

            state._fsp--;

             after(grammarAccess.getAtTimeExpressionAccess().getRightAtTimePrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AtTimeAtomic__ValueAssignment_0_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5407:1: rule__AtTimeAtomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__AtTimeAtomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5411:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5412:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5412:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5413:1: RULE_INT
            {
             before(grammarAccess.getAtTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AtTimeAtomic__ValueAssignment_0_110851); 
             after(grammarAccess.getAtTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__ValueAssignment_0_1"


    // $ANTLR start "rule__AtTimeAtomic__AtTimeValueAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5422:1: rule__AtTimeAtomic__AtTimeValueAssignment_1_1 : ( ( 'now' ) ) ;
    public final void rule__AtTimeAtomic__AtTimeValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5426:1: ( ( ( 'now' ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5427:1: ( ( 'now' ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5427:1: ( ( 'now' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5428:1: ( 'now' )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5429:1: ( 'now' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5430:1: 'now'
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0()); 
            match(input,42,FOLLOW_42_in_rule__AtTimeAtomic__AtTimeValueAssignment_1_110887); 
             after(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0()); 

            }

             after(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtTimeAtomic__AtTimeValueAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleEceModel_in_entryRuleEceModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEceModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EceModel__StatementsAssignment_in_ruleEceModel94 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0_in_ruleStatement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_entryRuleEventFeature242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventFeature249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventFeature__NameAssignment_in_ruleEventFeature275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextsList_in_entryRuleContextsList302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextsList309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group__0_in_ruleContextsList335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContextsList_in_entryRuleEcContextsList362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEcContextsList369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group__0_in_ruleEcContextsList395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContextsList_in_entryRuleExpContextsList422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpContextsList429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group__0_in_ruleExpContextsList455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContext_in_entryRuleEcContext482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEcContext489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group__0_in_ruleEcContext515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContext_in_entryRuleExpContext542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpContext549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__0_in_ruleExpContext575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllenOp_in_entryRuleAllenOp602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllenOp609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__0_in_ruleAllenOp635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0_in_ruleFluent695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_entryRuleConditionRule722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionRule729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__0_in_ruleConditionRule755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_entryRuleToRule782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToRule789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__0_in_ruleToRule815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_entryRuleInRule842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInRule849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__Group__0_in_ruleInRule875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0_in_ruleAnd1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0_in_ruleEquality1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeExpression_in_entryRuleAtTimeExpression1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimeExpression1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__0_in_ruleAtTimeExpression1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_entryRuleAtTimePrimary1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimePrimary1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Alternatives_in_ruleAtTimePrimary1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeAtomic_in_entryRuleAtTimeAtomic1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtTimeAtomic1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Alternatives_in_ruleAtTimeAtomic1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AllenOp__ValueAlternatives_1_01633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AllenOp__ValueAlternatives_1_01653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AllenOp__ValueAlternatives_1_01673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Equality__OpAlternatives_1_1_01708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Equality__OpAlternatives_1_1_01728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Comparison__OpAlternatives_1_1_01763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Comparison__OpAlternatives_1_1_01783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Comparison__OpAlternatives_1_1_01803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Comparison__OpAlternatives_1_1_01823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_01857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_01875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MulOrDiv__OpAlternatives_1_1_01909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MulOrDiv__OpAlternatives_1_1_01929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MulOrDiv__OpAlternatives_1_1_01949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MulOrDiv__OpAlternatives_1_1_01969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Primary__Alternatives2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Atomic__ValueAlternatives_2_1_02177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Atomic__ValueAlternatives_2_1_02197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AtTimeExpression__OpAlternatives_1_1_02233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AtTimeExpression__OpAlternatives_1_1_02253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__0_in_rule__AtTimePrimary__Alternatives2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeAtomic_in_rule__AtTimePrimary__Alternatives2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__0_in_rule__AtTimeAtomic__Alternatives2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__0_in_rule__AtTimeAtomic__Alternatives2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Statement__Group__0__Impl2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12448 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22508 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ContextsListAssignment_2_in_rule__Statement__Group__2__Impl2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__32568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Statement__Group__3__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02635 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventNameAssignment_0_in_rule__Event__Group__0__Impl2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__02757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__02760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Event__Group_1__0__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__12819 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__2_in_rule__Event__Group_1__12822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParamsAssignment_1_1_in_rule__Event__Group_1__1__Impl2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__2__Impl_in_rule__Event__Group_1__22879 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__3_in_rule__Event__Group_1__22882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__0_in_rule__Event__Group_1__2__Impl2909 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__3__Impl_in_rule__Event__Group_1__32940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Event__Group_1__3__Impl2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__0__Impl_in_rule__Event__Group_1_2__03007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__1_in_rule__Event__Group_1_2__03010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Event__Group_1_2__0__Impl3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__1__Impl_in_rule__Event__Group_1_2__13069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParamsAssignment_1_2_1_in_rule__Event__Group_1_2__1__Impl3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group__0__Impl_in_rule__ContextsList__Group__03130 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__ContextsList__Group__1_in_rule__ContextsList__Group__03133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__EcContextsListAssignment_0_in_rule__ContextsList__Group__0__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group__1__Impl_in_rule__ContextsList__Group__13191 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ContextsList__Group__2_in_rule__ContextsList__Group__13194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ContextsList__Group__1__Impl3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group__2__Impl_in_rule__ContextsList__Group__23253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__ExpContextsListAssignment_2_in_rule__ContextsList__Group__2__Impl3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group__0__Impl_in_rule__EcContextsList__Group__03317 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group__1_in_rule__EcContextsList__Group__03320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__EcContextsAssignment_0_in_rule__EcContextsList__Group__0__Impl3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group__1__Impl_in_rule__EcContextsList__Group__13377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__0_in_rule__EcContextsList__Group__1__Impl3404 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__0__Impl_in_rule__EcContextsList__Group_1__03439 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__1_in_rule__EcContextsList__Group_1__03442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EcContextsList__Group_1__0__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__1__Impl_in_rule__EcContextsList__Group_1__13501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__EcContextsAssignment_1_1_in_rule__EcContextsList__Group_1__1__Impl3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group__0__Impl_in_rule__ExpContextsList__Group__03562 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group__1_in_rule__ExpContextsList__Group__03565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__ExpContextsAssignment_0_in_rule__ExpContextsList__Group__0__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group__1__Impl_in_rule__ExpContextsList__Group__13622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__0_in_rule__ExpContextsList__Group__1__Impl3649 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__0__Impl_in_rule__ExpContextsList__Group_1__03684 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__1_in_rule__ExpContextsList__Group_1__03687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ExpContextsList__Group_1__0__Impl3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__1__Impl_in_rule__ExpContextsList__Group_1__13746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__ExpContextsAssignment_1_1_in_rule__ExpContextsList__Group_1__1__Impl3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group__0__Impl_in_rule__EcContext__Group__03807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EcContext__Group__1_in_rule__EcContext__Group__03810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EcContext__Group__0__Impl3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group__1__Impl_in_rule__EcContext__Group__13869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__FluentAssignment_1_in_rule__EcContext__Group__1__Impl3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__0__Impl_in_rule__ExpContext__Group__03930 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__1_in_rule__ExpContext__Group__03933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ExpContext__Group__0__Impl3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__1__Impl_in_rule__ExpContext__Group__13992 = new BitSet(new long[]{0x0000001000007000L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__2_in_rule__ExpContext__Group__13995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__FinalConditionAssignment_1_in_rule__ExpContext__Group__1__Impl4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__2__Impl_in_rule__ExpContext__Group__24052 = new BitSet(new long[]{0x0000001000007000L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__3_in_rule__ExpContext__Group__24055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__0_in_rule__ExpContext__Group__2__Impl4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__3__Impl_in_rule__ExpContext__Group__34113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__0_in_rule__ExpContext__Group__3__Impl4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__0__Impl_in_rule__ExpContext__Group_2__04179 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__1_in_rule__ExpContext__Group_2__04182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__AllenOpAssignment_2_0_in_rule__ExpContext__Group_2__0__Impl4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__1__Impl_in_rule__ExpContext__Group_2__14239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__TimeAssignment_2_1_in_rule__ExpContext__Group_2__1__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__0__Impl_in_rule__ExpContext__Group_3__04300 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__1_in_rule__ExpContext__Group_3__04303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExpContext__Group_3__0__Impl4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__1__Impl_in_rule__ExpContext__Group_3__14362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__InitialConditionAssignment_3_1_in_rule__ExpContext__Group_3__1__Impl4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__0__Impl_in_rule__AllenOp__Group__04423 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__1_in_rule__AllenOp__Group__04426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__1__Impl_in_rule__AllenOp__Group__14484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__ValueAssignment_1_in_rule__AllenOp__Group__1__Impl4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__04545 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__04548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__NameAssignment_0_in_rule__Fluent__Group__0__Impl4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__14605 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__14608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__24665 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__24668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__34726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__04792 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__04795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Fluent__Group_1__0__Impl4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__14854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__ValuePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__04915 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__04918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Fluent__Group_2__0__Impl4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__14977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__TimePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__05038 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__05041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Fluent__Group_3__0__Impl5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__15100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__05161 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__05164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__15222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__05283 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__05286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__15344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__Group__0__Impl_in_rule__InRule__Group__05405 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__InRule__Group__1_in_rule__InRule__Group__05408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__Group__1__Impl_in_rule__InRule__Group__15466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__ExpressionAssignment_1_in_rule__InRule__Group__1__Impl5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__05527 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__05530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__15586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl5613 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__05648 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__05651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__15709 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__15712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Or__Group_1__1__Impl5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__25771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__05834 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__05837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__Group__0__Impl5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__15893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl5920 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__05955 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__05958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__16016 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__16019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__And__Group_1__1__Impl6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__26078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__06141 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__06144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__16200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl6227 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__06262 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__06265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__16323 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__16326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__26383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06446 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6532 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06567 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16628 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__16631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__26688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__06751 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__06754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__16810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl6837 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__06872 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__06875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__16932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl6959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__06993 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__06996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__17054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PlusOrMinus__Group_1_0_0__1__Impl7082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__07117 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__07120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__17178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PlusOrMinus__Group_1_0_1__1__Impl7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__07241 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__07244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl7271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__17300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl7327 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__07362 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__07365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__17423 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__17426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl7453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__27483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__07546 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__07549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Primary__Group_0__0__Impl7577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__17608 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__17611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl7638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__27667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Primary__Group_0__2__Impl7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__07732 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__07735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__17793 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__17796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Primary__Group_1__1__Impl7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__27855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__07918 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__07921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__17979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__08040 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__08043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__18101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl8128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__08162 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__08165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__18223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__08284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__08287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__18345 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__18348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__RefAssignment_3_1_in_rule__Atomic__Group_3__1__Impl8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__28405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__0_in_rule__Atomic__Group_3__2__Impl8432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__0__Impl_in_rule__Atomic__Group_3_2__08469 = new BitSet(new long[]{0x0000040080000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__1_in_rule__Atomic__Group_3_2__08472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Atomic__Group_3_2__0__Impl8500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__1__Impl_in_rule__Atomic__Group_3_2__18531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__FluentValueSampleAssignment_3_2_1_in_rule__Atomic__Group_3_2__1__Impl8558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__08592 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__08595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__18653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_4_1_in_rule__Atomic__Group_4__1__Impl8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__0__Impl_in_rule__AtTimeExpression__Group__08714 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__1_in_rule__AtTimeExpression__Group__08717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__Group__0__Impl8744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__1__Impl_in_rule__AtTimeExpression__Group__18773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__0_in_rule__AtTimeExpression__Group__1__Impl8800 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__0__Impl_in_rule__AtTimeExpression__Group_1__08835 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__1_in_rule__AtTimeExpression__Group_1__08838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__1__Impl_in_rule__AtTimeExpression__Group_1__18896 = new BitSet(new long[]{0x0000040080000040L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__2_in_rule__AtTimeExpression__Group_1__18899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__OpAssignment_1_1_in_rule__AtTimeExpression__Group_1__1__Impl8926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__2__Impl_in_rule__AtTimeExpression__Group_1__28956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__RightAssignment_1_2_in_rule__AtTimeExpression__Group_1__2__Impl8983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__0__Impl_in_rule__AtTimePrimary__Group_0__09019 = new BitSet(new long[]{0x0000040080000040L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__1_in_rule__AtTimePrimary__Group_0__09022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AtTimePrimary__Group_0__0__Impl9050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__1__Impl_in_rule__AtTimePrimary__Group_0__19081 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__2_in_rule__AtTimePrimary__Group_0__19084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeExpression_in_rule__AtTimePrimary__Group_0__1__Impl9111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__2__Impl_in_rule__AtTimePrimary__Group_0__29140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtTimePrimary__Group_0__2__Impl9168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__0__Impl_in_rule__AtTimeAtomic__Group_0__09205 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__1_in_rule__AtTimeAtomic__Group_0__09208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__1__Impl_in_rule__AtTimeAtomic__Group_0__19266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__ValueAssignment_0_1_in_rule__AtTimeAtomic__Group_0__1__Impl9293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__0__Impl_in_rule__AtTimeAtomic__Group_1__09327 = new BitSet(new long[]{0x0000040080000040L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__1_in_rule__AtTimeAtomic__Group_1__09330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__1__Impl_in_rule__AtTimeAtomic__Group_1__19388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__AtTimeValueAssignment_1_1_in_rule__AtTimeAtomic__Group_1__1__Impl9415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__EceModel__StatementsAssignment9454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_19485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextsList_in_rule__Statement__ContextsListAssignment_29516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_09547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_19578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_2_19609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment9640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContextsList_in_rule__ContextsList__EcContextsListAssignment_09671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContextsList_in_rule__ContextsList__ExpContextsListAssignment_29702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_09733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_1_19764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_09795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_1_19826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_19857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__ExpContext__FinalConditionAssignment_19888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllenOp_in_rule__ExpContext__AllenOpAssignment_2_09919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__ExpContext__TimeAssignment_2_19950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__ExpContext__InitialConditionAssignment_3_19981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__ValueAlternatives_1_0_in_rule__AllenOp__ValueAssignment_110012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fluent__NameAssignment_010045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_1_110076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_2_110107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_110138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_110169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_110200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__InRule__ExpressionAssignment_110231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_210262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_210293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_110324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_210357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_110388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_210421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_110452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_110483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_210516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_210547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_110578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_110609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_110640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_3_110677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__Atomic__FluentValueSampleAssignment_3_2_110712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Atomic__ValueAssignment_4_110748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__OpAlternatives_1_1_0_in_rule__AtTimeExpression__OpAssignment_1_110787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__RightAssignment_1_210820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AtTimeAtomic__ValueAssignment_0_110851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__AtTimeAtomic__AtTimeValueAssignment_1_110887 = new BitSet(new long[]{0x0000000000000002L});

}