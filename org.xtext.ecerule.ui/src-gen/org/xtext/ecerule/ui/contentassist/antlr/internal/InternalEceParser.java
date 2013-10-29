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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1530:1: rule__ContextsList__Group__1 : rule__ContextsList__Group__1__Impl ;
    public final void rule__ContextsList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1534:1: ( rule__ContextsList__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1535:2: rule__ContextsList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextsList__Group__1__Impl_in_rule__ContextsList__Group__13191);
            rule__ContextsList__Group__1__Impl();

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1541:1: rule__ContextsList__Group__1__Impl : ( ( rule__ContextsList__Group_1__0 )? ) ;
    public final void rule__ContextsList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1545:1: ( ( ( rule__ContextsList__Group_1__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1546:1: ( ( rule__ContextsList__Group_1__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1546:1: ( ( rule__ContextsList__Group_1__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1547:1: ( rule__ContextsList__Group_1__0 )?
            {
             before(grammarAccess.getContextsListAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1548:1: ( rule__ContextsList__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1548:2: rule__ContextsList__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ContextsList__Group_1__0_in_rule__ContextsList__Group__1__Impl3218);
                    rule__ContextsList__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextsListAccess().getGroup_1()); 

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


    // $ANTLR start "rule__ContextsList__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1562:1: rule__ContextsList__Group_1__0 : rule__ContextsList__Group_1__0__Impl rule__ContextsList__Group_1__1 ;
    public final void rule__ContextsList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1566:1: ( rule__ContextsList__Group_1__0__Impl rule__ContextsList__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1567:2: rule__ContextsList__Group_1__0__Impl rule__ContextsList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ContextsList__Group_1__0__Impl_in_rule__ContextsList__Group_1__03253);
            rule__ContextsList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextsList__Group_1__1_in_rule__ContextsList__Group_1__03256);
            rule__ContextsList__Group_1__1();

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
    // $ANTLR end "rule__ContextsList__Group_1__0"


    // $ANTLR start "rule__ContextsList__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1574:1: rule__ContextsList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ContextsList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1578:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1579:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1579:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1580:1: ','
            {
             before(grammarAccess.getContextsListAccess().getCommaKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__ContextsList__Group_1__0__Impl3284); 
             after(grammarAccess.getContextsListAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__ContextsList__Group_1__0__Impl"


    // $ANTLR start "rule__ContextsList__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1593:1: rule__ContextsList__Group_1__1 : rule__ContextsList__Group_1__1__Impl ;
    public final void rule__ContextsList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1597:1: ( rule__ContextsList__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1598:2: rule__ContextsList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextsList__Group_1__1__Impl_in_rule__ContextsList__Group_1__13315);
            rule__ContextsList__Group_1__1__Impl();

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
    // $ANTLR end "rule__ContextsList__Group_1__1"


    // $ANTLR start "rule__ContextsList__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1604:1: rule__ContextsList__Group_1__1__Impl : ( ( rule__ContextsList__ExpContextsListAssignment_1_1 ) ) ;
    public final void rule__ContextsList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1608:1: ( ( ( rule__ContextsList__ExpContextsListAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1609:1: ( ( rule__ContextsList__ExpContextsListAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1609:1: ( ( rule__ContextsList__ExpContextsListAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1610:1: ( rule__ContextsList__ExpContextsListAssignment_1_1 )
            {
             before(grammarAccess.getContextsListAccess().getExpContextsListAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1611:1: ( rule__ContextsList__ExpContextsListAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1611:2: rule__ContextsList__ExpContextsListAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ContextsList__ExpContextsListAssignment_1_1_in_rule__ContextsList__Group_1__1__Impl3342);
            rule__ContextsList__ExpContextsListAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getContextsListAccess().getExpContextsListAssignment_1_1()); 

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
    // $ANTLR end "rule__ContextsList__Group_1__1__Impl"


    // $ANTLR start "rule__EcContextsList__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1625:1: rule__EcContextsList__Group__0 : rule__EcContextsList__Group__0__Impl rule__EcContextsList__Group__1 ;
    public final void rule__EcContextsList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1629:1: ( rule__EcContextsList__Group__0__Impl rule__EcContextsList__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1630:2: rule__EcContextsList__Group__0__Impl rule__EcContextsList__Group__1
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group__0__Impl_in_rule__EcContextsList__Group__03376);
            rule__EcContextsList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContextsList__Group__1_in_rule__EcContextsList__Group__03379);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1637:1: rule__EcContextsList__Group__0__Impl : ( ( rule__EcContextsList__EcContextsAssignment_0 ) ) ;
    public final void rule__EcContextsList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1641:1: ( ( ( rule__EcContextsList__EcContextsAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1642:1: ( ( rule__EcContextsList__EcContextsAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1642:1: ( ( rule__EcContextsList__EcContextsAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1643:1: ( rule__EcContextsList__EcContextsAssignment_0 )
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1644:1: ( rule__EcContextsList__EcContextsAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1644:2: rule__EcContextsList__EcContextsAssignment_0
            {
            pushFollow(FOLLOW_rule__EcContextsList__EcContextsAssignment_0_in_rule__EcContextsList__Group__0__Impl3406);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1654:1: rule__EcContextsList__Group__1 : rule__EcContextsList__Group__1__Impl ;
    public final void rule__EcContextsList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1658:1: ( rule__EcContextsList__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1659:2: rule__EcContextsList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group__1__Impl_in_rule__EcContextsList__Group__13436);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1665:1: rule__EcContextsList__Group__1__Impl : ( ( rule__EcContextsList__Group_1__0 )* ) ;
    public final void rule__EcContextsList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1669:1: ( ( ( rule__EcContextsList__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1670:1: ( ( rule__EcContextsList__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1670:1: ( ( rule__EcContextsList__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1671:1: ( rule__EcContextsList__Group_1__0 )*
            {
             before(grammarAccess.getEcContextsListAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1672:1: ( rule__EcContextsList__Group_1__0 )*
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
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1672:2: rule__EcContextsList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EcContextsList__Group_1__0_in_rule__EcContextsList__Group__1__Impl3463);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1686:1: rule__EcContextsList__Group_1__0 : rule__EcContextsList__Group_1__0__Impl rule__EcContextsList__Group_1__1 ;
    public final void rule__EcContextsList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1690:1: ( rule__EcContextsList__Group_1__0__Impl rule__EcContextsList__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1691:2: rule__EcContextsList__Group_1__0__Impl rule__EcContextsList__Group_1__1
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group_1__0__Impl_in_rule__EcContextsList__Group_1__03498);
            rule__EcContextsList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContextsList__Group_1__1_in_rule__EcContextsList__Group_1__03501);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1698:1: rule__EcContextsList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__EcContextsList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1702:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1703:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1703:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1704:1: ','
            {
             before(grammarAccess.getEcContextsListAccess().getCommaKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__EcContextsList__Group_1__0__Impl3529); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1717:1: rule__EcContextsList__Group_1__1 : rule__EcContextsList__Group_1__1__Impl ;
    public final void rule__EcContextsList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1721:1: ( rule__EcContextsList__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1722:2: rule__EcContextsList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group_1__1__Impl_in_rule__EcContextsList__Group_1__13560);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1728:1: rule__EcContextsList__Group_1__1__Impl : ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) ) ;
    public final void rule__EcContextsList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1732:1: ( ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1733:1: ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1733:1: ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1734:1: ( rule__EcContextsList__EcContextsAssignment_1_1 )
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1735:1: ( rule__EcContextsList__EcContextsAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1735:2: rule__EcContextsList__EcContextsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EcContextsList__EcContextsAssignment_1_1_in_rule__EcContextsList__Group_1__1__Impl3587);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1749:1: rule__ExpContextsList__Group__0 : rule__ExpContextsList__Group__0__Impl rule__ExpContextsList__Group__1 ;
    public final void rule__ExpContextsList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1753:1: ( rule__ExpContextsList__Group__0__Impl rule__ExpContextsList__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1754:2: rule__ExpContextsList__Group__0__Impl rule__ExpContextsList__Group__1
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group__0__Impl_in_rule__ExpContextsList__Group__03621);
            rule__ExpContextsList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContextsList__Group__1_in_rule__ExpContextsList__Group__03624);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1761:1: rule__ExpContextsList__Group__0__Impl : ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) ) ;
    public final void rule__ExpContextsList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1765:1: ( ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1766:1: ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1766:1: ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1767:1: ( rule__ExpContextsList__ExpContextsAssignment_0 )
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1768:1: ( rule__ExpContextsList__ExpContextsAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1768:2: rule__ExpContextsList__ExpContextsAssignment_0
            {
            pushFollow(FOLLOW_rule__ExpContextsList__ExpContextsAssignment_0_in_rule__ExpContextsList__Group__0__Impl3651);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1778:1: rule__ExpContextsList__Group__1 : rule__ExpContextsList__Group__1__Impl ;
    public final void rule__ExpContextsList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1782:1: ( rule__ExpContextsList__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1783:2: rule__ExpContextsList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group__1__Impl_in_rule__ExpContextsList__Group__13681);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1789:1: rule__ExpContextsList__Group__1__Impl : ( ( rule__ExpContextsList__Group_1__0 )* ) ;
    public final void rule__ExpContextsList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1793:1: ( ( ( rule__ExpContextsList__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1794:1: ( ( rule__ExpContextsList__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1794:1: ( ( rule__ExpContextsList__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1795:1: ( rule__ExpContextsList__Group_1__0 )*
            {
             before(grammarAccess.getExpContextsListAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1796:1: ( rule__ExpContextsList__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1796:2: rule__ExpContextsList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExpContextsList__Group_1__0_in_rule__ExpContextsList__Group__1__Impl3708);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1810:1: rule__ExpContextsList__Group_1__0 : rule__ExpContextsList__Group_1__0__Impl rule__ExpContextsList__Group_1__1 ;
    public final void rule__ExpContextsList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1814:1: ( rule__ExpContextsList__Group_1__0__Impl rule__ExpContextsList__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1815:2: rule__ExpContextsList__Group_1__0__Impl rule__ExpContextsList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group_1__0__Impl_in_rule__ExpContextsList__Group_1__03743);
            rule__ExpContextsList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContextsList__Group_1__1_in_rule__ExpContextsList__Group_1__03746);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1822:1: rule__ExpContextsList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ExpContextsList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1826:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1827:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1827:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1828:1: ','
            {
             before(grammarAccess.getExpContextsListAccess().getCommaKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__ExpContextsList__Group_1__0__Impl3774); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1841:1: rule__ExpContextsList__Group_1__1 : rule__ExpContextsList__Group_1__1__Impl ;
    public final void rule__ExpContextsList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1845:1: ( rule__ExpContextsList__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1846:2: rule__ExpContextsList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group_1__1__Impl_in_rule__ExpContextsList__Group_1__13805);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1852:1: rule__ExpContextsList__Group_1__1__Impl : ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) ) ;
    public final void rule__ExpContextsList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1856:1: ( ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1857:1: ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1857:1: ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1858:1: ( rule__ExpContextsList__ExpContextsAssignment_1_1 )
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1859:1: ( rule__ExpContextsList__ExpContextsAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1859:2: rule__ExpContextsList__ExpContextsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExpContextsList__ExpContextsAssignment_1_1_in_rule__ExpContextsList__Group_1__1__Impl3832);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1873:1: rule__EcContext__Group__0 : rule__EcContext__Group__0__Impl rule__EcContext__Group__1 ;
    public final void rule__EcContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1877:1: ( rule__EcContext__Group__0__Impl rule__EcContext__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1878:2: rule__EcContext__Group__0__Impl rule__EcContext__Group__1
            {
            pushFollow(FOLLOW_rule__EcContext__Group__0__Impl_in_rule__EcContext__Group__03866);
            rule__EcContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContext__Group__1_in_rule__EcContext__Group__03869);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1885:1: rule__EcContext__Group__0__Impl : ( 'set' ) ;
    public final void rule__EcContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1889:1: ( ( 'set' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1890:1: ( 'set' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1890:1: ( 'set' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1891:1: 'set'
            {
             before(grammarAccess.getEcContextAccess().getSetKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__EcContext__Group__0__Impl3897); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1904:1: rule__EcContext__Group__1 : rule__EcContext__Group__1__Impl rule__EcContext__Group__2 ;
    public final void rule__EcContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1908:1: ( rule__EcContext__Group__1__Impl rule__EcContext__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1909:2: rule__EcContext__Group__1__Impl rule__EcContext__Group__2
            {
            pushFollow(FOLLOW_rule__EcContext__Group__1__Impl_in_rule__EcContext__Group__13928);
            rule__EcContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContext__Group__2_in_rule__EcContext__Group__13931);
            rule__EcContext__Group__2();

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1916:1: rule__EcContext__Group__1__Impl : ( ( rule__EcContext__FluentAssignment_1 ) ) ;
    public final void rule__EcContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1920:1: ( ( ( rule__EcContext__FluentAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1921:1: ( ( rule__EcContext__FluentAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1921:1: ( ( rule__EcContext__FluentAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1922:1: ( rule__EcContext__FluentAssignment_1 )
            {
             before(grammarAccess.getEcContextAccess().getFluentAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1923:1: ( rule__EcContext__FluentAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1923:2: rule__EcContext__FluentAssignment_1
            {
            pushFollow(FOLLOW_rule__EcContext__FluentAssignment_1_in_rule__EcContext__Group__1__Impl3958);
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


    // $ANTLR start "rule__EcContext__Group__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1933:1: rule__EcContext__Group__2 : rule__EcContext__Group__2__Impl ;
    public final void rule__EcContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1937:1: ( rule__EcContext__Group__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1938:2: rule__EcContext__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EcContext__Group__2__Impl_in_rule__EcContext__Group__23988);
            rule__EcContext__Group__2__Impl();

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
    // $ANTLR end "rule__EcContext__Group__2"


    // $ANTLR start "rule__EcContext__Group__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1944:1: rule__EcContext__Group__2__Impl : ( ( rule__EcContext__Group_2__0 )* ) ;
    public final void rule__EcContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1948:1: ( ( ( rule__EcContext__Group_2__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1949:1: ( ( rule__EcContext__Group_2__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1949:1: ( ( rule__EcContext__Group_2__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1950:1: ( rule__EcContext__Group_2__0 )*
            {
             before(grammarAccess.getEcContextAccess().getGroup_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1951:1: ( rule__EcContext__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==RULE_ID) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1951:2: rule__EcContext__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EcContext__Group_2__0_in_rule__EcContext__Group__2__Impl4015);
            	    rule__EcContext__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEcContextAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EcContext__Group__2__Impl"


    // $ANTLR start "rule__EcContext__Group_2__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1967:1: rule__EcContext__Group_2__0 : rule__EcContext__Group_2__0__Impl rule__EcContext__Group_2__1 ;
    public final void rule__EcContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1971:1: ( rule__EcContext__Group_2__0__Impl rule__EcContext__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1972:2: rule__EcContext__Group_2__0__Impl rule__EcContext__Group_2__1
            {
            pushFollow(FOLLOW_rule__EcContext__Group_2__0__Impl_in_rule__EcContext__Group_2__04052);
            rule__EcContext__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContext__Group_2__1_in_rule__EcContext__Group_2__04055);
            rule__EcContext__Group_2__1();

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
    // $ANTLR end "rule__EcContext__Group_2__0"


    // $ANTLR start "rule__EcContext__Group_2__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1979:1: rule__EcContext__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EcContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1983:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1984:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1984:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1985:1: ','
            {
             before(grammarAccess.getEcContextAccess().getCommaKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__EcContext__Group_2__0__Impl4083); 
             after(grammarAccess.getEcContextAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__EcContext__Group_2__0__Impl"


    // $ANTLR start "rule__EcContext__Group_2__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1998:1: rule__EcContext__Group_2__1 : rule__EcContext__Group_2__1__Impl ;
    public final void rule__EcContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2002:1: ( rule__EcContext__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2003:2: rule__EcContext__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EcContext__Group_2__1__Impl_in_rule__EcContext__Group_2__14114);
            rule__EcContext__Group_2__1__Impl();

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
    // $ANTLR end "rule__EcContext__Group_2__1"


    // $ANTLR start "rule__EcContext__Group_2__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2009:1: rule__EcContext__Group_2__1__Impl : ( ( rule__EcContext__FluentAssignment_2_1 ) ) ;
    public final void rule__EcContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2013:1: ( ( ( rule__EcContext__FluentAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2014:1: ( ( rule__EcContext__FluentAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2014:1: ( ( rule__EcContext__FluentAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2015:1: ( rule__EcContext__FluentAssignment_2_1 )
            {
             before(grammarAccess.getEcContextAccess().getFluentAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2016:1: ( rule__EcContext__FluentAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2016:2: rule__EcContext__FluentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EcContext__FluentAssignment_2_1_in_rule__EcContext__Group_2__1__Impl4141);
            rule__EcContext__FluentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEcContextAccess().getFluentAssignment_2_1()); 

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
    // $ANTLR end "rule__EcContext__Group_2__1__Impl"


    // $ANTLR start "rule__ExpContext__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2030:1: rule__ExpContext__Group__0 : rule__ExpContext__Group__0__Impl rule__ExpContext__Group__1 ;
    public final void rule__ExpContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2034:1: ( rule__ExpContext__Group__0__Impl rule__ExpContext__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2035:2: rule__ExpContext__Group__0__Impl rule__ExpContext__Group__1
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__0__Impl_in_rule__ExpContext__Group__04175);
            rule__ExpContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group__1_in_rule__ExpContext__Group__04178);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2042:1: rule__ExpContext__Group__0__Impl : ( 'expect' ) ;
    public final void rule__ExpContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2046:1: ( ( 'expect' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2047:1: ( 'expect' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2047:1: ( 'expect' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2048:1: 'expect'
            {
             before(grammarAccess.getExpContextAccess().getExpectKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__ExpContext__Group__0__Impl4206); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2061:1: rule__ExpContext__Group__1 : rule__ExpContext__Group__1__Impl rule__ExpContext__Group__2 ;
    public final void rule__ExpContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2065:1: ( rule__ExpContext__Group__1__Impl rule__ExpContext__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2066:2: rule__ExpContext__Group__1__Impl rule__ExpContext__Group__2
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__1__Impl_in_rule__ExpContext__Group__14237);
            rule__ExpContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group__2_in_rule__ExpContext__Group__14240);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2073:1: rule__ExpContext__Group__1__Impl : ( ( rule__ExpContext__FinalConditionAssignment_1 ) ) ;
    public final void rule__ExpContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2077:1: ( ( ( rule__ExpContext__FinalConditionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2078:1: ( ( rule__ExpContext__FinalConditionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2078:1: ( ( rule__ExpContext__FinalConditionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2079:1: ( rule__ExpContext__FinalConditionAssignment_1 )
            {
             before(grammarAccess.getExpContextAccess().getFinalConditionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2080:1: ( rule__ExpContext__FinalConditionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2080:2: rule__ExpContext__FinalConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__ExpContext__FinalConditionAssignment_1_in_rule__ExpContext__Group__1__Impl4267);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2090:1: rule__ExpContext__Group__2 : rule__ExpContext__Group__2__Impl rule__ExpContext__Group__3 ;
    public final void rule__ExpContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2094:1: ( rule__ExpContext__Group__2__Impl rule__ExpContext__Group__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2095:2: rule__ExpContext__Group__2__Impl rule__ExpContext__Group__3
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__2__Impl_in_rule__ExpContext__Group__24297);
            rule__ExpContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group__3_in_rule__ExpContext__Group__24300);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2102:1: rule__ExpContext__Group__2__Impl : ( ( rule__ExpContext__Group_2__0 )? ) ;
    public final void rule__ExpContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2106:1: ( ( ( rule__ExpContext__Group_2__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2107:1: ( ( rule__ExpContext__Group_2__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2107:1: ( ( rule__ExpContext__Group_2__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2108:1: ( rule__ExpContext__Group_2__0 )?
            {
             before(grammarAccess.getExpContextAccess().getGroup_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2109:1: ( rule__ExpContext__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=12 && LA20_0<=14)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2109:2: rule__ExpContext__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExpContext__Group_2__0_in_rule__ExpContext__Group__2__Impl4327);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2119:1: rule__ExpContext__Group__3 : rule__ExpContext__Group__3__Impl ;
    public final void rule__ExpContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2123:1: ( rule__ExpContext__Group__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2124:2: rule__ExpContext__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__3__Impl_in_rule__ExpContext__Group__34358);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2130:1: rule__ExpContext__Group__3__Impl : ( ( rule__ExpContext__Group_3__0 )? ) ;
    public final void rule__ExpContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2134:1: ( ( ( rule__ExpContext__Group_3__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2135:1: ( ( rule__ExpContext__Group_3__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2135:1: ( ( rule__ExpContext__Group_3__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2136:1: ( rule__ExpContext__Group_3__0 )?
            {
             before(grammarAccess.getExpContextAccess().getGroup_3()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2137:1: ( rule__ExpContext__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2137:2: rule__ExpContext__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExpContext__Group_3__0_in_rule__ExpContext__Group__3__Impl4385);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2155:1: rule__ExpContext__Group_2__0 : rule__ExpContext__Group_2__0__Impl rule__ExpContext__Group_2__1 ;
    public final void rule__ExpContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2159:1: ( rule__ExpContext__Group_2__0__Impl rule__ExpContext__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2160:2: rule__ExpContext__Group_2__0__Impl rule__ExpContext__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_2__0__Impl_in_rule__ExpContext__Group_2__04424);
            rule__ExpContext__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group_2__1_in_rule__ExpContext__Group_2__04427);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2167:1: rule__ExpContext__Group_2__0__Impl : ( ( rule__ExpContext__AllenOpAssignment_2_0 ) ) ;
    public final void rule__ExpContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2171:1: ( ( ( rule__ExpContext__AllenOpAssignment_2_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2172:1: ( ( rule__ExpContext__AllenOpAssignment_2_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2172:1: ( ( rule__ExpContext__AllenOpAssignment_2_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2173:1: ( rule__ExpContext__AllenOpAssignment_2_0 )
            {
             before(grammarAccess.getExpContextAccess().getAllenOpAssignment_2_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2174:1: ( rule__ExpContext__AllenOpAssignment_2_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2174:2: rule__ExpContext__AllenOpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ExpContext__AllenOpAssignment_2_0_in_rule__ExpContext__Group_2__0__Impl4454);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2184:1: rule__ExpContext__Group_2__1 : rule__ExpContext__Group_2__1__Impl ;
    public final void rule__ExpContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2188:1: ( rule__ExpContext__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2189:2: rule__ExpContext__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_2__1__Impl_in_rule__ExpContext__Group_2__14484);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2195:1: rule__ExpContext__Group_2__1__Impl : ( ( rule__ExpContext__TimeAssignment_2_1 ) ) ;
    public final void rule__ExpContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2199:1: ( ( ( rule__ExpContext__TimeAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2200:1: ( ( rule__ExpContext__TimeAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2200:1: ( ( rule__ExpContext__TimeAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2201:1: ( rule__ExpContext__TimeAssignment_2_1 )
            {
             before(grammarAccess.getExpContextAccess().getTimeAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2202:1: ( rule__ExpContext__TimeAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2202:2: rule__ExpContext__TimeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExpContext__TimeAssignment_2_1_in_rule__ExpContext__Group_2__1__Impl4511);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2216:1: rule__ExpContext__Group_3__0 : rule__ExpContext__Group_3__0__Impl rule__ExpContext__Group_3__1 ;
    public final void rule__ExpContext__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2220:1: ( rule__ExpContext__Group_3__0__Impl rule__ExpContext__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2221:2: rule__ExpContext__Group_3__0__Impl rule__ExpContext__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_3__0__Impl_in_rule__ExpContext__Group_3__04545);
            rule__ExpContext__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group_3__1_in_rule__ExpContext__Group_3__04548);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2228:1: rule__ExpContext__Group_3__0__Impl : ( 'if' ) ;
    public final void rule__ExpContext__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2232:1: ( ( 'if' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2233:1: ( 'if' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2233:1: ( 'if' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2234:1: 'if'
            {
             before(grammarAccess.getExpContextAccess().getIfKeyword_3_0()); 
            match(input,36,FOLLOW_36_in_rule__ExpContext__Group_3__0__Impl4576); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2247:1: rule__ExpContext__Group_3__1 : rule__ExpContext__Group_3__1__Impl ;
    public final void rule__ExpContext__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2251:1: ( rule__ExpContext__Group_3__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2252:2: rule__ExpContext__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_3__1__Impl_in_rule__ExpContext__Group_3__14607);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2258:1: rule__ExpContext__Group_3__1__Impl : ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) ) ;
    public final void rule__ExpContext__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2262:1: ( ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2263:1: ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2263:1: ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2264:1: ( rule__ExpContext__InitialConditionAssignment_3_1 )
            {
             before(grammarAccess.getExpContextAccess().getInitialConditionAssignment_3_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2265:1: ( rule__ExpContext__InitialConditionAssignment_3_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2265:2: rule__ExpContext__InitialConditionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ExpContext__InitialConditionAssignment_3_1_in_rule__ExpContext__Group_3__1__Impl4634);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2279:1: rule__AllenOp__Group__0 : rule__AllenOp__Group__0__Impl rule__AllenOp__Group__1 ;
    public final void rule__AllenOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2283:1: ( rule__AllenOp__Group__0__Impl rule__AllenOp__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2284:2: rule__AllenOp__Group__0__Impl rule__AllenOp__Group__1
            {
            pushFollow(FOLLOW_rule__AllenOp__Group__0__Impl_in_rule__AllenOp__Group__04668);
            rule__AllenOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllenOp__Group__1_in_rule__AllenOp__Group__04671);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2291:1: rule__AllenOp__Group__0__Impl : ( () ) ;
    public final void rule__AllenOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2295:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2296:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2296:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2297:1: ()
            {
             before(grammarAccess.getAllenOpAccess().getAllenOperatorAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2298:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2300:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2310:1: rule__AllenOp__Group__1 : rule__AllenOp__Group__1__Impl ;
    public final void rule__AllenOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2314:1: ( rule__AllenOp__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2315:2: rule__AllenOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AllenOp__Group__1__Impl_in_rule__AllenOp__Group__14729);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2321:1: rule__AllenOp__Group__1__Impl : ( ( rule__AllenOp__ValueAssignment_1 ) ) ;
    public final void rule__AllenOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2325:1: ( ( ( rule__AllenOp__ValueAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2326:1: ( ( rule__AllenOp__ValueAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2326:1: ( ( rule__AllenOp__ValueAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2327:1: ( rule__AllenOp__ValueAssignment_1 )
            {
             before(grammarAccess.getAllenOpAccess().getValueAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2328:1: ( rule__AllenOp__ValueAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2328:2: rule__AllenOp__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__AllenOp__ValueAssignment_1_in_rule__AllenOp__Group__1__Impl4756);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2342:1: rule__Fluent__Group__0 : rule__Fluent__Group__0__Impl rule__Fluent__Group__1 ;
    public final void rule__Fluent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2346:1: ( rule__Fluent__Group__0__Impl rule__Fluent__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2347:2: rule__Fluent__Group__0__Impl rule__Fluent__Group__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__04790);
            rule__Fluent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__04793);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2354:1: rule__Fluent__Group__0__Impl : ( ( rule__Fluent__NameAssignment_0 ) ) ;
    public final void rule__Fluent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2358:1: ( ( ( rule__Fluent__NameAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2359:1: ( ( rule__Fluent__NameAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2359:1: ( ( rule__Fluent__NameAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2360:1: ( rule__Fluent__NameAssignment_0 )
            {
             before(grammarAccess.getFluentAccess().getNameAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2361:1: ( rule__Fluent__NameAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2361:2: rule__Fluent__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Fluent__NameAssignment_0_in_rule__Fluent__Group__0__Impl4820);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2371:1: rule__Fluent__Group__1 : rule__Fluent__Group__1__Impl rule__Fluent__Group__2 ;
    public final void rule__Fluent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2375:1: ( rule__Fluent__Group__1__Impl rule__Fluent__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2376:2: rule__Fluent__Group__1__Impl rule__Fluent__Group__2
            {
            pushFollow(FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__14850);
            rule__Fluent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__14853);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2383:1: rule__Fluent__Group__1__Impl : ( ( rule__Fluent__Group_1__0 ) ) ;
    public final void rule__Fluent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2387:1: ( ( ( rule__Fluent__Group_1__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2388:1: ( ( rule__Fluent__Group_1__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2388:1: ( ( rule__Fluent__Group_1__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2389:1: ( rule__Fluent__Group_1__0 )
            {
             before(grammarAccess.getFluentAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2390:1: ( rule__Fluent__Group_1__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2390:2: rule__Fluent__Group_1__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl4880);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2400:1: rule__Fluent__Group__2 : rule__Fluent__Group__2__Impl rule__Fluent__Group__3 ;
    public final void rule__Fluent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2404:1: ( rule__Fluent__Group__2__Impl rule__Fluent__Group__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2405:2: rule__Fluent__Group__2__Impl rule__Fluent__Group__3
            {
            pushFollow(FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__24910);
            rule__Fluent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__24913);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2412:1: rule__Fluent__Group__2__Impl : ( ( rule__Fluent__Group_2__0 )? ) ;
    public final void rule__Fluent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2416:1: ( ( ( rule__Fluent__Group_2__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2417:1: ( ( rule__Fluent__Group_2__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2417:1: ( ( rule__Fluent__Group_2__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2418:1: ( rule__Fluent__Group_2__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2419:1: ( rule__Fluent__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2419:2: rule__Fluent__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl4940);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2429:1: rule__Fluent__Group__3 : rule__Fluent__Group__3__Impl ;
    public final void rule__Fluent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2433:1: ( rule__Fluent__Group__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2434:2: rule__Fluent__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__34971);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2440:1: rule__Fluent__Group__3__Impl : ( ( rule__Fluent__Group_3__0 )? ) ;
    public final void rule__Fluent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2444:1: ( ( ( rule__Fluent__Group_3__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2445:1: ( ( rule__Fluent__Group_3__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2445:1: ( ( rule__Fluent__Group_3__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2446:1: ( rule__Fluent__Group_3__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_3()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2447:1: ( rule__Fluent__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2447:2: rule__Fluent__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl4998);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2465:1: rule__Fluent__Group_1__0 : rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 ;
    public final void rule__Fluent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2469:1: ( rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2470:2: rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__05037);
            rule__Fluent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__05040);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2477:1: rule__Fluent__Group_1__0__Impl : ( 'to' ) ;
    public final void rule__Fluent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2481:1: ( ( 'to' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2482:1: ( 'to' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2482:1: ( 'to' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2483:1: 'to'
            {
             before(grammarAccess.getFluentAccess().getToKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__Fluent__Group_1__0__Impl5068); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2496:1: rule__Fluent__Group_1__1 : rule__Fluent__Group_1__1__Impl ;
    public final void rule__Fluent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2500:1: ( rule__Fluent__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2501:2: rule__Fluent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__15099);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2507:1: rule__Fluent__Group_1__1__Impl : ( ( rule__Fluent__ValuePartAssignment_1_1 ) ) ;
    public final void rule__Fluent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2511:1: ( ( ( rule__Fluent__ValuePartAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2512:1: ( ( rule__Fluent__ValuePartAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2512:1: ( ( rule__Fluent__ValuePartAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2513:1: ( rule__Fluent__ValuePartAssignment_1_1 )
            {
             before(grammarAccess.getFluentAccess().getValuePartAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2514:1: ( rule__Fluent__ValuePartAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2514:2: rule__Fluent__ValuePartAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Fluent__ValuePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl5126);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2528:1: rule__Fluent__Group_2__0 : rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 ;
    public final void rule__Fluent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2532:1: ( rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2533:2: rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__05160);
            rule__Fluent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__05163);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2540:1: rule__Fluent__Group_2__0__Impl : ( 'in' ) ;
    public final void rule__Fluent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2544:1: ( ( 'in' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2545:1: ( 'in' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2545:1: ( 'in' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2546:1: 'in'
            {
             before(grammarAccess.getFluentAccess().getInKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Fluent__Group_2__0__Impl5191); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2559:1: rule__Fluent__Group_2__1 : rule__Fluent__Group_2__1__Impl ;
    public final void rule__Fluent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2563:1: ( rule__Fluent__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2564:2: rule__Fluent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__15222);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2570:1: rule__Fluent__Group_2__1__Impl : ( ( rule__Fluent__TimePartAssignment_2_1 ) ) ;
    public final void rule__Fluent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2574:1: ( ( ( rule__Fluent__TimePartAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2575:1: ( ( rule__Fluent__TimePartAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2575:1: ( ( rule__Fluent__TimePartAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2576:1: ( rule__Fluent__TimePartAssignment_2_1 )
            {
             before(grammarAccess.getFluentAccess().getTimePartAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2577:1: ( rule__Fluent__TimePartAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2577:2: rule__Fluent__TimePartAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Fluent__TimePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl5249);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2591:1: rule__Fluent__Group_3__0 : rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 ;
    public final void rule__Fluent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2595:1: ( rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2596:2: rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__05283);
            rule__Fluent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__05286);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2603:1: rule__Fluent__Group_3__0__Impl : ( 'if' ) ;
    public final void rule__Fluent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2607:1: ( ( 'if' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2608:1: ( 'if' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2608:1: ( 'if' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2609:1: 'if'
            {
             before(grammarAccess.getFluentAccess().getIfKeyword_3_0()); 
            match(input,36,FOLLOW_36_in_rule__Fluent__Group_3__0__Impl5314); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2622:1: rule__Fluent__Group_3__1 : rule__Fluent__Group_3__1__Impl ;
    public final void rule__Fluent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2626:1: ( rule__Fluent__Group_3__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2627:2: rule__Fluent__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__15345);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2633:1: rule__Fluent__Group_3__1__Impl : ( ( rule__Fluent__CondPartAssignment_3_1 ) ) ;
    public final void rule__Fluent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2637:1: ( ( ( rule__Fluent__CondPartAssignment_3_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2638:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2638:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2639:1: ( rule__Fluent__CondPartAssignment_3_1 )
            {
             before(grammarAccess.getFluentAccess().getCondPartAssignment_3_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2640:1: ( rule__Fluent__CondPartAssignment_3_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2640:2: rule__Fluent__CondPartAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl5372);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2654:1: rule__ConditionRule__Group__0 : rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 ;
    public final void rule__ConditionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2658:1: ( rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2659:2: rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__05406);
            rule__ConditionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__05409);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2666:1: rule__ConditionRule__Group__0__Impl : ( () ) ;
    public final void rule__ConditionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2670:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2671:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2671:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2672:1: ()
            {
             before(grammarAccess.getConditionRuleAccess().getExpressionAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2673:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2675:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2685:1: rule__ConditionRule__Group__1 : rule__ConditionRule__Group__1__Impl ;
    public final void rule__ConditionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2689:1: ( rule__ConditionRule__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2690:2: rule__ConditionRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__15467);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2696:1: rule__ConditionRule__Group__1__Impl : ( ( rule__ConditionRule__ConditionAssignment_1 ) ) ;
    public final void rule__ConditionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2700:1: ( ( ( rule__ConditionRule__ConditionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2701:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2701:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2702:1: ( rule__ConditionRule__ConditionAssignment_1 )
            {
             before(grammarAccess.getConditionRuleAccess().getConditionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2703:1: ( rule__ConditionRule__ConditionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2703:2: rule__ConditionRule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl5494);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2717:1: rule__ToRule__Group__0 : rule__ToRule__Group__0__Impl rule__ToRule__Group__1 ;
    public final void rule__ToRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2721:1: ( rule__ToRule__Group__0__Impl rule__ToRule__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2722:2: rule__ToRule__Group__0__Impl rule__ToRule__Group__1
            {
            pushFollow(FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__05528);
            rule__ToRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__05531);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2729:1: rule__ToRule__Group__0__Impl : ( () ) ;
    public final void rule__ToRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2733:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2734:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2734:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2735:1: ()
            {
             before(grammarAccess.getToRuleAccess().getExpressionAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2736:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2738:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2748:1: rule__ToRule__Group__1 : rule__ToRule__Group__1__Impl ;
    public final void rule__ToRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2752:1: ( rule__ToRule__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2753:2: rule__ToRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__15589);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2759:1: rule__ToRule__Group__1__Impl : ( ( rule__ToRule__ExpressionAssignment_1 ) ) ;
    public final void rule__ToRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2763:1: ( ( ( rule__ToRule__ExpressionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2764:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2764:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2765:1: ( rule__ToRule__ExpressionAssignment_1 )
            {
             before(grammarAccess.getToRuleAccess().getExpressionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2766:1: ( rule__ToRule__ExpressionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2766:2: rule__ToRule__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl5616);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2780:1: rule__InRule__Group__0 : rule__InRule__Group__0__Impl rule__InRule__Group__1 ;
    public final void rule__InRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2784:1: ( rule__InRule__Group__0__Impl rule__InRule__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2785:2: rule__InRule__Group__0__Impl rule__InRule__Group__1
            {
            pushFollow(FOLLOW_rule__InRule__Group__0__Impl_in_rule__InRule__Group__05650);
            rule__InRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InRule__Group__1_in_rule__InRule__Group__05653);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2792:1: rule__InRule__Group__0__Impl : ( () ) ;
    public final void rule__InRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2796:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2797:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2797:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2798:1: ()
            {
             before(grammarAccess.getInRuleAccess().getExpressionAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2799:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2801:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2811:1: rule__InRule__Group__1 : rule__InRule__Group__1__Impl ;
    public final void rule__InRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2815:1: ( rule__InRule__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2816:2: rule__InRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InRule__Group__1__Impl_in_rule__InRule__Group__15711);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2822:1: rule__InRule__Group__1__Impl : ( ( rule__InRule__ExpressionAssignment_1 ) ) ;
    public final void rule__InRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2826:1: ( ( ( rule__InRule__ExpressionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2827:1: ( ( rule__InRule__ExpressionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2827:1: ( ( rule__InRule__ExpressionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2828:1: ( rule__InRule__ExpressionAssignment_1 )
            {
             before(grammarAccess.getInRuleAccess().getExpressionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2829:1: ( rule__InRule__ExpressionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2829:2: rule__InRule__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__InRule__ExpressionAssignment_1_in_rule__InRule__Group__1__Impl5738);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2843:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2847:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2848:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__05772);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__05775);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2855:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2859:1: ( ( ruleAnd ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2860:1: ( ruleAnd )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2860:1: ( ruleAnd )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2861:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl5802);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2872:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2876:1: ( rule__Or__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2877:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__15831);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2883:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2887:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2888:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2888:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2889:1: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2890:1: ( rule__Or__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2890:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl5858);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2904:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2908:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2909:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__05893);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__05896);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2916:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2920:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2921:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2921:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2922:1: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2923:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2925:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2935:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2939:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2940:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__15954);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__15957);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2947:1: rule__Or__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2951:1: ( ( 'OR' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2952:1: ( 'OR' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2952:1: ( 'OR' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2953:1: 'OR'
            {
             before(grammarAccess.getOrAccess().getORKeyword_1_1()); 
            match(input,38,FOLLOW_38_in_rule__Or__Group_1__1__Impl5985); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2966:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2970:1: ( rule__Or__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2971:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__26016);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2977:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2981:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2982:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2982:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2983:1: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2984:1: ( rule__Or__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2984:2: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl6043);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3000:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3004:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3005:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__06079);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__06082);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3012:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3016:1: ( ( ruleEquality ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3017:1: ( ruleEquality )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3017:1: ( ruleEquality )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3018:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__Group__0__Impl6109);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3029:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3033:1: ( rule__And__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3034:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__16138);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3040:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3044:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3045:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3045:1: ( ( rule__And__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3046:1: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3047:1: ( rule__And__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==39) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3047:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl6165);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3061:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3065:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3066:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__06200);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__06203);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3073:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3077:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3078:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3078:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3079:1: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3080:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3082:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3092:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3096:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3097:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__16261);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__16264);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3104:1: rule__And__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3108:1: ( ( 'AND' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3109:1: ( 'AND' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3109:1: ( 'AND' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3110:1: 'AND'
            {
             before(grammarAccess.getAndAccess().getANDKeyword_1_1()); 
            match(input,39,FOLLOW_39_in_rule__And__Group_1__1__Impl6292); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3123:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3127:1: ( rule__And__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3128:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__26323);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3134:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3138:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3139:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3139:1: ( ( rule__And__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3140:1: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3141:1: ( rule__And__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3141:2: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl6350);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3157:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3161:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3162:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__06386);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__06389);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3169:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3173:1: ( ( ruleComparison ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3174:1: ( ruleComparison )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3174:1: ( ruleComparison )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3175:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl6416);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3186:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3190:1: ( rule__Equality__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3191:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__16445);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3197:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3201:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3202:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3202:1: ( ( rule__Equality__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3203:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3204:1: ( rule__Equality__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=15 && LA26_0<=16)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3204:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl6472);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3218:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3222:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3223:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__06507);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__06510);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3230:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3234:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3235:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3235:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3236:1: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3237:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3239:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3249:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3253:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3254:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__16568);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__16571);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3261:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3265:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3266:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3266:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3267:1: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3268:1: ( rule__Equality__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3268:2: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl6598);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3278:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3282:1: ( rule__Equality__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3283:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__26628);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3289:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3293:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3294:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3294:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3295:1: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3296:1: ( rule__Equality__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3296:2: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl6655);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3312:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3316:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3317:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06691);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06694);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3324:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3328:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3329:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3329:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3330:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl6721);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3341:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3345:1: ( rule__Comparison__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3346:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16750);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3352:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3356:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3357:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3357:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3358:1: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3359:1: ( rule__Comparison__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=17 && LA27_0<=20)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3359:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6777);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3373:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3377:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3378:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06812);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06815);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3385:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3389:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3390:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3390:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3391:1: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3392:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3394:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3404:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3408:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3409:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16873);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__16876);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3416:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3420:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3421:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3421:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3422:1: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3423:1: ( rule__Comparison__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3423:2: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl6903);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3433:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3437:1: ( rule__Comparison__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3438:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__26933);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3444:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3448:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3449:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3449:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3450:1: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3451:1: ( rule__Comparison__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3451:2: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl6960);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3467:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3471:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3472:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__06996);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__06999);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3479:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3483:1: ( ( ruleMulOrDiv ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3484:1: ( ruleMulOrDiv )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3484:1: ( ruleMulOrDiv )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3485:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl7026);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3496:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3500:1: ( rule__PlusOrMinus__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3501:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__17055);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3507:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3511:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3512:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3512:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3513:1: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3514:1: ( rule__PlusOrMinus__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=27 && LA28_0<=28)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3514:2: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl7082);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3528:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3532:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3533:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__07117);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__07120);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3540:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3544:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3545:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3545:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3546:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3547:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3547:2: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl7147);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3557:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3561:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3562:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__17177);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3568:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3572:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3573:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3573:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3574:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3575:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3575:2: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl7204);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3589:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3593:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3594:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__07238);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__07241);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3601:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3605:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3606:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3606:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3607:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3608:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3610:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3620:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3624:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3625:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__17299);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3631:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3635:1: ( ( '+' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3636:1: ( '+' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3636:1: ( '+' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3637:1: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,28,FOLLOW_28_in_rule__PlusOrMinus__Group_1_0_0__1__Impl7327); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3654:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3658:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3659:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__07362);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__07365);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3666:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3670:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3671:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3671:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3672:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3673:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3675:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3685:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3689:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3690:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__17423);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3696:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3700:1: ( ( '-' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3701:1: ( '-' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3701:1: ( '-' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3702:1: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,27,FOLLOW_27_in_rule__PlusOrMinus__Group_1_0_1__1__Impl7451); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3719:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3723:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3724:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__07486);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__07489);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3731:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3735:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3736:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3736:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3737:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl7516);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3748:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3752:1: ( rule__MulOrDiv__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3753:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__17545);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3759:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3763:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3764:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3764:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3765:1: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3766:1: ( rule__MulOrDiv__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=21 && LA29_0<=24)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3766:2: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl7572);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3780:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3784:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3785:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__07607);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__07610);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3792:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3796:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3797:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3797:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3798:1: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3799:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3801:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3811:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3815:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3816:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__17668);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__17671);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3823:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3827:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3828:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3828:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3829:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3830:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3830:2: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl7698);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3840:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3844:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3845:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__27728);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3851:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3855:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3856:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3856:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3857:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3858:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3858:2: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl7755);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3874:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3878:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3879:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__07791);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__07794);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3886:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3890:1: ( ( '(' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3891:1: ( '(' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3891:1: ( '(' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3892:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Primary__Group_0__0__Impl7822); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3905:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3909:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3910:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__17853);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__17856);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3917:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3921:1: ( ( ruleExpression ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3922:1: ( ruleExpression )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3922:1: ( ruleExpression )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3923:1: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl7883);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3934:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3938:1: ( rule__Primary__Group_0__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3939:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__27912);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3945:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3949:1: ( ( ')' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3950:1: ( ')' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3950:1: ( ')' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3951:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,32,FOLLOW_32_in_rule__Primary__Group_0__2__Impl7940); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3970:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3974:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3975:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__07977);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__07980);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3982:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3986:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3987:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3987:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3988:1: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3989:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3991:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4001:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4005:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4006:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__18038);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__18041);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4013:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4017:1: ( ( '!' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4018:1: ( '!' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4018:1: ( '!' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4019:1: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,40,FOLLOW_40_in_rule__Primary__Group_1__1__Impl8069); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4032:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4036:1: ( rule__Primary__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4037:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__28100);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4043:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4047:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4048:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4048:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4049:1: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4050:1: ( rule__Primary__ExpressionAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4050:2: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl8127);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4066:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4070:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4071:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__08163);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__08166);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4078:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4082:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4083:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4083:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4084:1: ()
            {
             before(grammarAccess.getAtomicAccess().getFloatConstantAction_0_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4085:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4087:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4097:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4101:1: ( rule__Atomic__Group_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4102:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__18224);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4108:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4112:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4113:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4113:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4114:1: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4115:1: ( rule__Atomic__ValueAssignment_0_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4115:2: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl8251);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4129:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4133:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4134:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__08285);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__08288);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4141:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4145:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4146:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4146:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4147:1: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4148:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4150:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4160:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4164:1: ( rule__Atomic__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4165:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__18346);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4171:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4175:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4176:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4176:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4177:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4178:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4178:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl8373);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4192:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4196:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4197:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__08407);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__08410);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4204:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4208:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4209:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4209:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4210:1: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4211:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4213:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4223:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4227:1: ( rule__Atomic__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4228:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__18468);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4234:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4238:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4239:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4239:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4240:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4241:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4241:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl8495);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4255:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4259:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4260:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__08529);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__08532);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4267:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4271:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4272:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4272:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4273:1: ()
            {
             before(grammarAccess.getAtomicAccess().getReferenceAction_3_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4274:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4276:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4286:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4290:1: ( rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4291:2: rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__18590);
            rule__Atomic__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__18593);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4298:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__RefAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4302:1: ( ( ( rule__Atomic__RefAssignment_3_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4303:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4303:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4304:1: ( rule__Atomic__RefAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4305:1: ( rule__Atomic__RefAssignment_3_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4305:2: rule__Atomic__RefAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Atomic__RefAssignment_3_1_in_rule__Atomic__Group_3__1__Impl8620);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4315:1: rule__Atomic__Group_3__2 : rule__Atomic__Group_3__2__Impl ;
    public final void rule__Atomic__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4319:1: ( rule__Atomic__Group_3__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4320:2: rule__Atomic__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__28650);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4326:1: rule__Atomic__Group_3__2__Impl : ( ( rule__Atomic__Group_3_2__0 )? ) ;
    public final void rule__Atomic__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4330:1: ( ( ( rule__Atomic__Group_3_2__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4331:1: ( ( rule__Atomic__Group_3_2__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4331:1: ( ( rule__Atomic__Group_3_2__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4332:1: ( rule__Atomic__Group_3_2__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_3_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4333:1: ( rule__Atomic__Group_3_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4333:2: rule__Atomic__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3_2__0_in_rule__Atomic__Group_3__2__Impl8677);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4349:1: rule__Atomic__Group_3_2__0 : rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1 ;
    public final void rule__Atomic__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4353:1: ( rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4354:2: rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3_2__0__Impl_in_rule__Atomic__Group_3_2__08714);
            rule__Atomic__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3_2__1_in_rule__Atomic__Group_3_2__08717);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4361:1: rule__Atomic__Group_3_2__0__Impl : ( 'at' ) ;
    public final void rule__Atomic__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4365:1: ( ( 'at' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4366:1: ( 'at' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4366:1: ( 'at' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4367:1: 'at'
            {
             before(grammarAccess.getAtomicAccess().getAtKeyword_3_2_0()); 
            match(input,41,FOLLOW_41_in_rule__Atomic__Group_3_2__0__Impl8745); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4380:1: rule__Atomic__Group_3_2__1 : rule__Atomic__Group_3_2__1__Impl ;
    public final void rule__Atomic__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4384:1: ( rule__Atomic__Group_3_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4385:2: rule__Atomic__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3_2__1__Impl_in_rule__Atomic__Group_3_2__18776);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4391:1: rule__Atomic__Group_3_2__1__Impl : ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) ) ;
    public final void rule__Atomic__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4395:1: ( ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4396:1: ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4396:1: ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4397:1: ( rule__Atomic__FluentValueSampleAssignment_3_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getFluentValueSampleAssignment_3_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4398:1: ( rule__Atomic__FluentValueSampleAssignment_3_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4398:2: rule__Atomic__FluentValueSampleAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__FluentValueSampleAssignment_3_2_1_in_rule__Atomic__Group_3_2__1__Impl8803);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4412:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4416:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4417:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__08837);
            rule__Atomic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__08840);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4424:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4428:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4429:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4429:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4430:1: ()
            {
             before(grammarAccess.getAtomicAccess().getCurrentTimeAction_4_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4431:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4433:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4443:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4447:1: ( rule__Atomic__Group_4__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4448:2: rule__Atomic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__18898);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4454:1: rule__Atomic__Group_4__1__Impl : ( ( rule__Atomic__ValueAssignment_4_1 ) ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4458:1: ( ( ( rule__Atomic__ValueAssignment_4_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4459:1: ( ( rule__Atomic__ValueAssignment_4_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4459:1: ( ( rule__Atomic__ValueAssignment_4_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4460:1: ( rule__Atomic__ValueAssignment_4_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_4_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4461:1: ( rule__Atomic__ValueAssignment_4_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4461:2: rule__Atomic__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_4_1_in_rule__Atomic__Group_4__1__Impl8925);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4475:1: rule__AtTimeExpression__Group__0 : rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1 ;
    public final void rule__AtTimeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4479:1: ( rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4480:2: rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group__0__Impl_in_rule__AtTimeExpression__Group__08959);
            rule__AtTimeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group__1_in_rule__AtTimeExpression__Group__08962);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4487:1: rule__AtTimeExpression__Group__0__Impl : ( ruleAtTimePrimary ) ;
    public final void rule__AtTimeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4491:1: ( ( ruleAtTimePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4492:1: ( ruleAtTimePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4492:1: ( ruleAtTimePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4493:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtTimeExpressionAccess().getAtTimePrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__Group__0__Impl8989);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4504:1: rule__AtTimeExpression__Group__1 : rule__AtTimeExpression__Group__1__Impl ;
    public final void rule__AtTimeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4508:1: ( rule__AtTimeExpression__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4509:2: rule__AtTimeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group__1__Impl_in_rule__AtTimeExpression__Group__19018);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4515:1: rule__AtTimeExpression__Group__1__Impl : ( ( rule__AtTimeExpression__Group_1__0 )* ) ;
    public final void rule__AtTimeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4519:1: ( ( ( rule__AtTimeExpression__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4520:1: ( ( rule__AtTimeExpression__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4520:1: ( ( rule__AtTimeExpression__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4521:1: ( rule__AtTimeExpression__Group_1__0 )*
            {
             before(grammarAccess.getAtTimeExpressionAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4522:1: ( rule__AtTimeExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=27 && LA31_0<=28)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4522:2: rule__AtTimeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__0_in_rule__AtTimeExpression__Group__1__Impl9045);
            	    rule__AtTimeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4536:1: rule__AtTimeExpression__Group_1__0 : rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1 ;
    public final void rule__AtTimeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4540:1: ( rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4541:2: rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__0__Impl_in_rule__AtTimeExpression__Group_1__09080);
            rule__AtTimeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__1_in_rule__AtTimeExpression__Group_1__09083);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4548:1: rule__AtTimeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AtTimeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4552:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4553:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4553:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4554:1: ()
            {
             before(grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4555:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4557:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4567:1: rule__AtTimeExpression__Group_1__1 : rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2 ;
    public final void rule__AtTimeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4571:1: ( rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4572:2: rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__1__Impl_in_rule__AtTimeExpression__Group_1__19141);
            rule__AtTimeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__2_in_rule__AtTimeExpression__Group_1__19144);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4579:1: rule__AtTimeExpression__Group_1__1__Impl : ( ( rule__AtTimeExpression__OpAssignment_1_1 ) ) ;
    public final void rule__AtTimeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4583:1: ( ( ( rule__AtTimeExpression__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4584:1: ( ( rule__AtTimeExpression__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4584:1: ( ( rule__AtTimeExpression__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4585:1: ( rule__AtTimeExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4586:1: ( rule__AtTimeExpression__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4586:2: rule__AtTimeExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__OpAssignment_1_1_in_rule__AtTimeExpression__Group_1__1__Impl9171);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4596:1: rule__AtTimeExpression__Group_1__2 : rule__AtTimeExpression__Group_1__2__Impl ;
    public final void rule__AtTimeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4600:1: ( rule__AtTimeExpression__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4601:2: rule__AtTimeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__2__Impl_in_rule__AtTimeExpression__Group_1__29201);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4607:1: rule__AtTimeExpression__Group_1__2__Impl : ( ( rule__AtTimeExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AtTimeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4611:1: ( ( ( rule__AtTimeExpression__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4612:1: ( ( rule__AtTimeExpression__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4612:1: ( ( rule__AtTimeExpression__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4613:1: ( rule__AtTimeExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4614:1: ( rule__AtTimeExpression__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4614:2: rule__AtTimeExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__RightAssignment_1_2_in_rule__AtTimeExpression__Group_1__2__Impl9228);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4630:1: rule__AtTimePrimary__Group_0__0 : rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1 ;
    public final void rule__AtTimePrimary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4634:1: ( rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4635:2: rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__0__Impl_in_rule__AtTimePrimary__Group_0__09264);
            rule__AtTimePrimary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__1_in_rule__AtTimePrimary__Group_0__09267);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4642:1: rule__AtTimePrimary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__AtTimePrimary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4646:1: ( ( '(' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4647:1: ( '(' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4647:1: ( '(' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4648:1: '('
            {
             before(grammarAccess.getAtTimePrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__AtTimePrimary__Group_0__0__Impl9295); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4661:1: rule__AtTimePrimary__Group_0__1 : rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2 ;
    public final void rule__AtTimePrimary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4665:1: ( rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4666:2: rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__1__Impl_in_rule__AtTimePrimary__Group_0__19326);
            rule__AtTimePrimary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__2_in_rule__AtTimePrimary__Group_0__19329);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4673:1: rule__AtTimePrimary__Group_0__1__Impl : ( ruleAtTimeExpression ) ;
    public final void rule__AtTimePrimary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4677:1: ( ( ruleAtTimeExpression ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4678:1: ( ruleAtTimeExpression )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4678:1: ( ruleAtTimeExpression )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4679:1: ruleAtTimeExpression
            {
             before(grammarAccess.getAtTimePrimaryAccess().getAtTimeExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleAtTimeExpression_in_rule__AtTimePrimary__Group_0__1__Impl9356);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4690:1: rule__AtTimePrimary__Group_0__2 : rule__AtTimePrimary__Group_0__2__Impl ;
    public final void rule__AtTimePrimary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4694:1: ( rule__AtTimePrimary__Group_0__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4695:2: rule__AtTimePrimary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__2__Impl_in_rule__AtTimePrimary__Group_0__29385);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4701:1: rule__AtTimePrimary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__AtTimePrimary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4705:1: ( ( ')' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4706:1: ( ')' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4706:1: ( ')' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4707:1: ')'
            {
             before(grammarAccess.getAtTimePrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,32,FOLLOW_32_in_rule__AtTimePrimary__Group_0__2__Impl9413); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4726:1: rule__AtTimeAtomic__Group_0__0 : rule__AtTimeAtomic__Group_0__0__Impl rule__AtTimeAtomic__Group_0__1 ;
    public final void rule__AtTimeAtomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4730:1: ( rule__AtTimeAtomic__Group_0__0__Impl rule__AtTimeAtomic__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4731:2: rule__AtTimeAtomic__Group_0__0__Impl rule__AtTimeAtomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__0__Impl_in_rule__AtTimeAtomic__Group_0__09450);
            rule__AtTimeAtomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__1_in_rule__AtTimeAtomic__Group_0__09453);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4738:1: rule__AtTimeAtomic__Group_0__0__Impl : ( () ) ;
    public final void rule__AtTimeAtomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4742:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4743:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4743:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4744:1: ()
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeIntConstantAction_0_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4745:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4747:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4757:1: rule__AtTimeAtomic__Group_0__1 : rule__AtTimeAtomic__Group_0__1__Impl ;
    public final void rule__AtTimeAtomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4761:1: ( rule__AtTimeAtomic__Group_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4762:2: rule__AtTimeAtomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__1__Impl_in_rule__AtTimeAtomic__Group_0__19511);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4768:1: rule__AtTimeAtomic__Group_0__1__Impl : ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) ) ;
    public final void rule__AtTimeAtomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4772:1: ( ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4773:1: ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4773:1: ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4774:1: ( rule__AtTimeAtomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getValueAssignment_0_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4775:1: ( rule__AtTimeAtomic__ValueAssignment_0_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4775:2: rule__AtTimeAtomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__ValueAssignment_0_1_in_rule__AtTimeAtomic__Group_0__1__Impl9538);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4789:1: rule__AtTimeAtomic__Group_1__0 : rule__AtTimeAtomic__Group_1__0__Impl rule__AtTimeAtomic__Group_1__1 ;
    public final void rule__AtTimeAtomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4793:1: ( rule__AtTimeAtomic__Group_1__0__Impl rule__AtTimeAtomic__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4794:2: rule__AtTimeAtomic__Group_1__0__Impl rule__AtTimeAtomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__0__Impl_in_rule__AtTimeAtomic__Group_1__09572);
            rule__AtTimeAtomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__1_in_rule__AtTimeAtomic__Group_1__09575);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4801:1: rule__AtTimeAtomic__Group_1__0__Impl : ( () ) ;
    public final void rule__AtTimeAtomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4805:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4806:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4806:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4807:1: ()
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeCurrentTimeAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4808:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4810:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4820:1: rule__AtTimeAtomic__Group_1__1 : rule__AtTimeAtomic__Group_1__1__Impl ;
    public final void rule__AtTimeAtomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4824:1: ( rule__AtTimeAtomic__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4825:2: rule__AtTimeAtomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__1__Impl_in_rule__AtTimeAtomic__Group_1__19633);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4831:1: rule__AtTimeAtomic__Group_1__1__Impl : ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) ) ;
    public final void rule__AtTimeAtomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4835:1: ( ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4836:1: ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4836:1: ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4837:1: ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4838:1: ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4838:2: rule__AtTimeAtomic__AtTimeValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__AtTimeValueAssignment_1_1_in_rule__AtTimeAtomic__Group_1__1__Impl9660);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4853:1: rule__EceModel__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__EceModel__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4857:1: ( ( ruleStatement ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4858:1: ( ruleStatement )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4858:1: ( ruleStatement )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4859:1: ruleStatement
            {
             before(grammarAccess.getEceModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__EceModel__StatementsAssignment9699);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4868:1: rule__Statement__EventAssignment_1 : ( ruleEvent ) ;
    public final void rule__Statement__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4872:1: ( ( ruleEvent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4873:1: ( ruleEvent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4873:1: ( ruleEvent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4874:1: ruleEvent
            {
             before(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_19730);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4883:1: rule__Statement__ContextsListAssignment_2 : ( ruleContextsList ) ;
    public final void rule__Statement__ContextsListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4887:1: ( ( ruleContextsList ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4888:1: ( ruleContextsList )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4888:1: ( ruleContextsList )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4889:1: ruleContextsList
            {
             before(grammarAccess.getStatementAccess().getContextsListContextsListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleContextsList_in_rule__Statement__ContextsListAssignment_29761);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4898:1: rule__Event__EventNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4902:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4903:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4903:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4904:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_09792); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4913:1: rule__Event__ParamsAssignment_1_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4917:1: ( ( ruleEventFeature ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4918:1: ( ruleEventFeature )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4918:1: ( ruleEventFeature )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4919:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamsEventFeatureParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_19823);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4928:1: rule__Event__ParamsAssignment_1_2_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4932:1: ( ( ruleEventFeature ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4933:1: ( ruleEventFeature )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4933:1: ( ruleEventFeature )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4934:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamsEventFeatureParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_2_19854);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4943:1: rule__EventFeature__NameAssignment : ( RULE_ID ) ;
    public final void rule__EventFeature__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4947:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4948:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4948:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4949:1: RULE_ID
            {
             before(grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment9885); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4958:1: rule__ContextsList__EcContextsListAssignment_0 : ( ruleEcContextsList ) ;
    public final void rule__ContextsList__EcContextsListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4962:1: ( ( ruleEcContextsList ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4963:1: ( ruleEcContextsList )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4963:1: ( ruleEcContextsList )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4964:1: ruleEcContextsList
            {
             before(grammarAccess.getContextsListAccess().getEcContextsListEcContextsListParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEcContextsList_in_rule__ContextsList__EcContextsListAssignment_09916);
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


    // $ANTLR start "rule__ContextsList__ExpContextsListAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4973:1: rule__ContextsList__ExpContextsListAssignment_1_1 : ( ruleExpContextsList ) ;
    public final void rule__ContextsList__ExpContextsListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4977:1: ( ( ruleExpContextsList ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4978:1: ( ruleExpContextsList )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4978:1: ( ruleExpContextsList )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4979:1: ruleExpContextsList
            {
             before(grammarAccess.getContextsListAccess().getExpContextsListExpContextsListParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpContextsList_in_rule__ContextsList__ExpContextsListAssignment_1_19947);
            ruleExpContextsList();

            state._fsp--;

             after(grammarAccess.getContextsListAccess().getExpContextsListExpContextsListParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ContextsList__ExpContextsListAssignment_1_1"


    // $ANTLR start "rule__EcContextsList__EcContextsAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4988:1: rule__EcContextsList__EcContextsAssignment_0 : ( ruleEcContext ) ;
    public final void rule__EcContextsList__EcContextsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4992:1: ( ( ruleEcContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4993:1: ( ruleEcContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4993:1: ( ruleEcContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4994:1: ruleEcContext
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_09978);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5003:1: rule__EcContextsList__EcContextsAssignment_1_1 : ( ruleEcContext ) ;
    public final void rule__EcContextsList__EcContextsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5007:1: ( ( ruleEcContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5008:1: ( ruleEcContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5008:1: ( ruleEcContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5009:1: ruleEcContext
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_1_110009);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5018:1: rule__ExpContextsList__ExpContextsAssignment_0 : ( ruleExpContext ) ;
    public final void rule__ExpContextsList__ExpContextsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5022:1: ( ( ruleExpContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5023:1: ( ruleExpContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5023:1: ( ruleExpContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5024:1: ruleExpContext
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_010040);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5033:1: rule__ExpContextsList__ExpContextsAssignment_1_1 : ( ruleExpContext ) ;
    public final void rule__ExpContextsList__ExpContextsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5037:1: ( ( ruleExpContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5038:1: ( ruleExpContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5038:1: ( ruleExpContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5039:1: ruleExpContext
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_1_110071);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5048:1: rule__EcContext__FluentAssignment_1 : ( ruleFluent ) ;
    public final void rule__EcContext__FluentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5052:1: ( ( ruleFluent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5053:1: ( ruleFluent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5053:1: ( ruleFluent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5054:1: ruleFluent
            {
             before(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_110102);
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


    // $ANTLR start "rule__EcContext__FluentAssignment_2_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5063:1: rule__EcContext__FluentAssignment_2_1 : ( ruleFluent ) ;
    public final void rule__EcContext__FluentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5067:1: ( ( ruleFluent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5068:1: ( ruleFluent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5068:1: ( ruleFluent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5069:1: ruleFluent
            {
             before(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_2_110133);
            ruleFluent();

            state._fsp--;

             after(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__EcContext__FluentAssignment_2_1"


    // $ANTLR start "rule__ExpContext__FinalConditionAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5078:1: rule__ExpContext__FinalConditionAssignment_1 : ( ruleConditionRule ) ;
    public final void rule__ExpContext__FinalConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5082:1: ( ( ruleConditionRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5083:1: ( ruleConditionRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5083:1: ( ruleConditionRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5084:1: ruleConditionRule
            {
             before(grammarAccess.getExpContextAccess().getFinalConditionConditionRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__ExpContext__FinalConditionAssignment_110164);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5093:1: rule__ExpContext__AllenOpAssignment_2_0 : ( ruleAllenOp ) ;
    public final void rule__ExpContext__AllenOpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5097:1: ( ( ruleAllenOp ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5098:1: ( ruleAllenOp )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5098:1: ( ruleAllenOp )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5099:1: ruleAllenOp
            {
             before(grammarAccess.getExpContextAccess().getAllenOpAllenOpParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleAllenOp_in_rule__ExpContext__AllenOpAssignment_2_010195);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5108:1: rule__ExpContext__TimeAssignment_2_1 : ( rulePlusOrMinus ) ;
    public final void rule__ExpContext__TimeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5112:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5113:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5113:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5114:1: rulePlusOrMinus
            {
             before(grammarAccess.getExpContextAccess().getTimePlusOrMinusParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__ExpContext__TimeAssignment_2_110226);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5123:1: rule__ExpContext__InitialConditionAssignment_3_1 : ( ruleConditionRule ) ;
    public final void rule__ExpContext__InitialConditionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5127:1: ( ( ruleConditionRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5128:1: ( ruleConditionRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5128:1: ( ruleConditionRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5129:1: ruleConditionRule
            {
             before(grammarAccess.getExpContextAccess().getInitialConditionConditionRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__ExpContext__InitialConditionAssignment_3_110257);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5138:1: rule__AllenOp__ValueAssignment_1 : ( ( rule__AllenOp__ValueAlternatives_1_0 ) ) ;
    public final void rule__AllenOp__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5142:1: ( ( ( rule__AllenOp__ValueAlternatives_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5143:1: ( ( rule__AllenOp__ValueAlternatives_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5143:1: ( ( rule__AllenOp__ValueAlternatives_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5144:1: ( rule__AllenOp__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getAllenOpAccess().getValueAlternatives_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5145:1: ( rule__AllenOp__ValueAlternatives_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5145:2: rule__AllenOp__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AllenOp__ValueAlternatives_1_0_in_rule__AllenOp__ValueAssignment_110288);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5154:1: rule__Fluent__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Fluent__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5158:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5159:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5159:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5160:1: RULE_ID
            {
             before(grammarAccess.getFluentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fluent__NameAssignment_010321); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5169:1: rule__Fluent__ValuePartAssignment_1_1 : ( ruleToRule ) ;
    public final void rule__Fluent__ValuePartAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5173:1: ( ( ruleToRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5174:1: ( ruleToRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5174:1: ( ruleToRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5175:1: ruleToRule
            {
             before(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_1_110352);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5184:1: rule__Fluent__TimePartAssignment_2_1 : ( ruleInRule ) ;
    public final void rule__Fluent__TimePartAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5188:1: ( ( ruleInRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5189:1: ( ruleInRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5189:1: ( ruleInRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5190:1: ruleInRule
            {
             before(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_2_110383);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5199:1: rule__Fluent__CondPartAssignment_3_1 : ( ruleConditionRule ) ;
    public final void rule__Fluent__CondPartAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5203:1: ( ( ruleConditionRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5204:1: ( ruleConditionRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5204:1: ( ruleConditionRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5205:1: ruleConditionRule
            {
             before(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_110414);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5214:1: rule__ConditionRule__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ConditionRule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5218:1: ( ( ruleExpression ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5219:1: ( ruleExpression )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5219:1: ( ruleExpression )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5220:1: ruleExpression
            {
             before(grammarAccess.getConditionRuleAccess().getConditionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_110445);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5229:1: rule__ToRule__ExpressionAssignment_1 : ( rulePlusOrMinus ) ;
    public final void rule__ToRule__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5233:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5234:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5234:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5235:1: rulePlusOrMinus
            {
             before(grammarAccess.getToRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_110476);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5244:1: rule__InRule__ExpressionAssignment_1 : ( rulePlusOrMinus ) ;
    public final void rule__InRule__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5248:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5249:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5249:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5250:1: rulePlusOrMinus
            {
             before(grammarAccess.getInRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__InRule__ExpressionAssignment_110507);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5259:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5263:1: ( ( ruleAnd ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5264:1: ( ruleAnd )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5264:1: ( ruleAnd )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5265:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_210538);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5274:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5278:1: ( ( ruleEquality ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5279:1: ( ruleEquality )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5279:1: ( ruleEquality )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5280:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_210569);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5289:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5293:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5294:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5294:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5295:1: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5296:1: ( rule__Equality__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5296:2: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_110600);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5305:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5309:1: ( ( ruleComparison ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5310:1: ( ruleComparison )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5310:1: ( ruleComparison )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5311:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_210633);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5320:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5324:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5325:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5325:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5326:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5327:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5327:2: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_110664);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5336:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5340:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5341:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5341:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5342:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_210697);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5351:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5355:1: ( ( ruleMulOrDiv ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5356:1: ( ruleMulOrDiv )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5356:1: ( ruleMulOrDiv )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5357:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_110728);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5366:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5370:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5371:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5371:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5372:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5373:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5373:2: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_110759);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5382:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5386:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5387:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5387:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5388:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_210792);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5397:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5401:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5402:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5402:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5403:1: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_210823);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5412:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_FLOAT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5416:1: ( ( RULE_FLOAT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5417:1: ( RULE_FLOAT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5417:1: ( RULE_FLOAT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5418:1: RULE_FLOAT
            {
             before(grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_0_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_110854); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5427:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5431:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5432:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5432:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5433:1: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_110885); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5442:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5446:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5447:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5447:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5448:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5449:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5449:2: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_110916);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5458:1: rule__Atomic__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5462:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5463:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5463:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5464:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getRefReferenceTypeCrossReference_3_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5465:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5466:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getRefReferenceTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_3_110953); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5477:1: rule__Atomic__FluentValueSampleAssignment_3_2_1 : ( ruleAtTimePrimary ) ;
    public final void rule__Atomic__FluentValueSampleAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5481:1: ( ( ruleAtTimePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5482:1: ( ruleAtTimePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5482:1: ( ruleAtTimePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5483:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtomicAccess().getFluentValueSampleAtTimePrimaryParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__Atomic__FluentValueSampleAssignment_3_2_110988);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5492:1: rule__Atomic__ValueAssignment_4_1 : ( ( 'now' ) ) ;
    public final void rule__Atomic__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5496:1: ( ( ( 'now' ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5497:1: ( ( 'now' ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5497:1: ( ( 'now' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5498:1: ( 'now' )
            {
             before(grammarAccess.getAtomicAccess().getValueNowKeyword_4_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5499:1: ( 'now' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5500:1: 'now'
            {
             before(grammarAccess.getAtomicAccess().getValueNowKeyword_4_1_0()); 
            match(input,42,FOLLOW_42_in_rule__Atomic__ValueAssignment_4_111024); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5515:1: rule__AtTimeExpression__OpAssignment_1_1 : ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__AtTimeExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5519:1: ( ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5520:1: ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5520:1: ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5521:1: ( rule__AtTimeExpression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5522:1: ( rule__AtTimeExpression__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5522:2: rule__AtTimeExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__OpAlternatives_1_1_0_in_rule__AtTimeExpression__OpAssignment_1_111063);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5531:1: rule__AtTimeExpression__RightAssignment_1_2 : ( ruleAtTimePrimary ) ;
    public final void rule__AtTimeExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5535:1: ( ( ruleAtTimePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5536:1: ( ruleAtTimePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5536:1: ( ruleAtTimePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5537:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtTimeExpressionAccess().getRightAtTimePrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__RightAssignment_1_211096);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5546:1: rule__AtTimeAtomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__AtTimeAtomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5550:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5551:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5551:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5552:1: RULE_INT
            {
             before(grammarAccess.getAtTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AtTimeAtomic__ValueAssignment_0_111127); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5561:1: rule__AtTimeAtomic__AtTimeValueAssignment_1_1 : ( ( 'now' ) ) ;
    public final void rule__AtTimeAtomic__AtTimeValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5565:1: ( ( ( 'now' ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5566:1: ( ( 'now' ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5566:1: ( ( 'now' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5567:1: ( 'now' )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5568:1: ( 'now' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5569:1: 'now'
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0()); 
            match(input,42,FOLLOW_42_in_rule__AtTimeAtomic__AtTimeValueAssignment_1_111163); 
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
    public static final BitSet FOLLOW_rule__ContextsList__Group__1__Impl_in_rule__ContextsList__Group__13191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group_1__0_in_rule__ContextsList__Group__1__Impl3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group_1__0__Impl_in_rule__ContextsList__Group_1__03253 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ContextsList__Group_1__1_in_rule__ContextsList__Group_1__03256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ContextsList__Group_1__0__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group_1__1__Impl_in_rule__ContextsList__Group_1__13315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__ExpContextsListAssignment_1_1_in_rule__ContextsList__Group_1__1__Impl3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group__0__Impl_in_rule__EcContextsList__Group__03376 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group__1_in_rule__EcContextsList__Group__03379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__EcContextsAssignment_0_in_rule__EcContextsList__Group__0__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group__1__Impl_in_rule__EcContextsList__Group__13436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__0_in_rule__EcContextsList__Group__1__Impl3463 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__0__Impl_in_rule__EcContextsList__Group_1__03498 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__1_in_rule__EcContextsList__Group_1__03501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EcContextsList__Group_1__0__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__1__Impl_in_rule__EcContextsList__Group_1__13560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__EcContextsAssignment_1_1_in_rule__EcContextsList__Group_1__1__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group__0__Impl_in_rule__ExpContextsList__Group__03621 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group__1_in_rule__ExpContextsList__Group__03624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__ExpContextsAssignment_0_in_rule__ExpContextsList__Group__0__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group__1__Impl_in_rule__ExpContextsList__Group__13681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__0_in_rule__ExpContextsList__Group__1__Impl3708 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__0__Impl_in_rule__ExpContextsList__Group_1__03743 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__1_in_rule__ExpContextsList__Group_1__03746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ExpContextsList__Group_1__0__Impl3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__1__Impl_in_rule__ExpContextsList__Group_1__13805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__ExpContextsAssignment_1_1_in_rule__ExpContextsList__Group_1__1__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group__0__Impl_in_rule__EcContext__Group__03866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EcContext__Group__1_in_rule__EcContext__Group__03869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EcContext__Group__0__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group__1__Impl_in_rule__EcContext__Group__13928 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__EcContext__Group__2_in_rule__EcContext__Group__13931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__FluentAssignment_1_in_rule__EcContext__Group__1__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group__2__Impl_in_rule__EcContext__Group__23988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group_2__0_in_rule__EcContext__Group__2__Impl4015 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group_2__0__Impl_in_rule__EcContext__Group_2__04052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EcContext__Group_2__1_in_rule__EcContext__Group_2__04055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EcContext__Group_2__0__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group_2__1__Impl_in_rule__EcContext__Group_2__14114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__FluentAssignment_2_1_in_rule__EcContext__Group_2__1__Impl4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__0__Impl_in_rule__ExpContext__Group__04175 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__1_in_rule__ExpContext__Group__04178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ExpContext__Group__0__Impl4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__1__Impl_in_rule__ExpContext__Group__14237 = new BitSet(new long[]{0x0000001000007000L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__2_in_rule__ExpContext__Group__14240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__FinalConditionAssignment_1_in_rule__ExpContext__Group__1__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__2__Impl_in_rule__ExpContext__Group__24297 = new BitSet(new long[]{0x0000001000007000L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__3_in_rule__ExpContext__Group__24300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__0_in_rule__ExpContext__Group__2__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__3__Impl_in_rule__ExpContext__Group__34358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__0_in_rule__ExpContext__Group__3__Impl4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__0__Impl_in_rule__ExpContext__Group_2__04424 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__1_in_rule__ExpContext__Group_2__04427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__AllenOpAssignment_2_0_in_rule__ExpContext__Group_2__0__Impl4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__1__Impl_in_rule__ExpContext__Group_2__14484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__TimeAssignment_2_1_in_rule__ExpContext__Group_2__1__Impl4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__0__Impl_in_rule__ExpContext__Group_3__04545 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__1_in_rule__ExpContext__Group_3__04548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExpContext__Group_3__0__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__1__Impl_in_rule__ExpContext__Group_3__14607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__InitialConditionAssignment_3_1_in_rule__ExpContext__Group_3__1__Impl4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__0__Impl_in_rule__AllenOp__Group__04668 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__1_in_rule__AllenOp__Group__04671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__1__Impl_in_rule__AllenOp__Group__14729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__ValueAssignment_1_in_rule__AllenOp__Group__1__Impl4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__04790 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__04793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__NameAssignment_0_in_rule__Fluent__Group__0__Impl4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__14850 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__14853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__24910 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__24913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__34971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__05037 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__05040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Fluent__Group_1__0__Impl5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__15099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__ValuePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__05160 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__05163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Fluent__Group_2__0__Impl5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__15222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__TimePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__05283 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__05286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Fluent__Group_3__0__Impl5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__15345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__05406 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__05409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__15467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__05528 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__05531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__15589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__Group__0__Impl_in_rule__InRule__Group__05650 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__InRule__Group__1_in_rule__InRule__Group__05653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__Group__1__Impl_in_rule__InRule__Group__15711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__ExpressionAssignment_1_in_rule__InRule__Group__1__Impl5738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__05772 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__05775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__15831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl5858 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__05893 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__05896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__15954 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__15957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Or__Group_1__1__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__26016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__06079 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__06082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__Group__0__Impl6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__16138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl6165 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__06200 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__06203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__16261 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__16264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__And__Group_1__1__Impl6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__26323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__06386 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__06389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl6416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__16445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl6472 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__06507 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__06510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__16568 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__16571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__26628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl6655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06691 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl6721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6777 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06812 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16873 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__16876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl6903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__26933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__06996 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__06999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__17055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl7082 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__07117 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__07120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__17177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__07238 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__07241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__17299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PlusOrMinus__Group_1_0_0__1__Impl7327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__07362 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__07365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__17423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PlusOrMinus__Group_1_0_1__1__Impl7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__07486 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__07489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__17545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl7572 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__07607 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__07610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__17668 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__17671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__27728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__07791 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__07794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Primary__Group_0__0__Impl7822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__17853 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__17856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl7883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__27912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Primary__Group_0__2__Impl7940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__07977 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__07980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__18038 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__18041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Primary__Group_1__1__Impl8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__28100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl8127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__08163 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__08166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__18224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl8251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__08285 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__08288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__18346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl8373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__08407 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__08410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__18468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl8495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__08529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__08532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__18590 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__18593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__RefAssignment_3_1_in_rule__Atomic__Group_3__1__Impl8620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__28650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__0_in_rule__Atomic__Group_3__2__Impl8677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__0__Impl_in_rule__Atomic__Group_3_2__08714 = new BitSet(new long[]{0x0000040080000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__1_in_rule__Atomic__Group_3_2__08717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Atomic__Group_3_2__0__Impl8745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__1__Impl_in_rule__Atomic__Group_3_2__18776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__FluentValueSampleAssignment_3_2_1_in_rule__Atomic__Group_3_2__1__Impl8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__08837 = new BitSet(new long[]{0x0000050086000070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__08840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__18898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_4_1_in_rule__Atomic__Group_4__1__Impl8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__0__Impl_in_rule__AtTimeExpression__Group__08959 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__1_in_rule__AtTimeExpression__Group__08962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__Group__0__Impl8989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__1__Impl_in_rule__AtTimeExpression__Group__19018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__0_in_rule__AtTimeExpression__Group__1__Impl9045 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__0__Impl_in_rule__AtTimeExpression__Group_1__09080 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__1_in_rule__AtTimeExpression__Group_1__09083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__1__Impl_in_rule__AtTimeExpression__Group_1__19141 = new BitSet(new long[]{0x0000040080000040L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__2_in_rule__AtTimeExpression__Group_1__19144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__OpAssignment_1_1_in_rule__AtTimeExpression__Group_1__1__Impl9171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__2__Impl_in_rule__AtTimeExpression__Group_1__29201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__RightAssignment_1_2_in_rule__AtTimeExpression__Group_1__2__Impl9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__0__Impl_in_rule__AtTimePrimary__Group_0__09264 = new BitSet(new long[]{0x0000040080000040L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__1_in_rule__AtTimePrimary__Group_0__09267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AtTimePrimary__Group_0__0__Impl9295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__1__Impl_in_rule__AtTimePrimary__Group_0__19326 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__2_in_rule__AtTimePrimary__Group_0__19329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeExpression_in_rule__AtTimePrimary__Group_0__1__Impl9356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__2__Impl_in_rule__AtTimePrimary__Group_0__29385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtTimePrimary__Group_0__2__Impl9413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__0__Impl_in_rule__AtTimeAtomic__Group_0__09450 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__1_in_rule__AtTimeAtomic__Group_0__09453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__1__Impl_in_rule__AtTimeAtomic__Group_0__19511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__ValueAssignment_0_1_in_rule__AtTimeAtomic__Group_0__1__Impl9538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__0__Impl_in_rule__AtTimeAtomic__Group_1__09572 = new BitSet(new long[]{0x0000040080000040L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__1_in_rule__AtTimeAtomic__Group_1__09575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__1__Impl_in_rule__AtTimeAtomic__Group_1__19633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__AtTimeValueAssignment_1_1_in_rule__AtTimeAtomic__Group_1__1__Impl9660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__EceModel__StatementsAssignment9699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_19730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextsList_in_rule__Statement__ContextsListAssignment_29761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_09792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_19823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_2_19854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment9885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContextsList_in_rule__ContextsList__EcContextsListAssignment_09916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContextsList_in_rule__ContextsList__ExpContextsListAssignment_1_19947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_09978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_1_110009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_010040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_1_110071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_110102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_2_110133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__ExpContext__FinalConditionAssignment_110164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllenOp_in_rule__ExpContext__AllenOpAssignment_2_010195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__ExpContext__TimeAssignment_2_110226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__ExpContext__InitialConditionAssignment_3_110257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__ValueAlternatives_1_0_in_rule__AllenOp__ValueAssignment_110288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fluent__NameAssignment_010321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_1_110352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_2_110383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_110414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_110445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_110476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__InRule__ExpressionAssignment_110507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_210538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_210569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_110600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_210633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_110664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_210697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_110728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_110759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_210792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_210823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_110854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_110885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_110916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_3_110953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__Atomic__FluentValueSampleAssignment_3_2_110988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Atomic__ValueAssignment_4_111024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__OpAlternatives_1_1_0_in_rule__AtTimeExpression__OpAssignment_1_111063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__RightAssignment_1_211096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AtTimeAtomic__ValueAssignment_0_111127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__AtTimeAtomic__AtTimeValueAssignment_1_111163 = new BitSet(new long[]{0x0000000000000002L});

}