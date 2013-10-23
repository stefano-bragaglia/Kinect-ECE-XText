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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'before'", "'meets'", "'overlaps'", "'starts'", "'finishes'", "'during'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'%'", "'^'", "'true'", "'false'", "'-'", "'+'", "'on'", "';'", "'('", "')'", "','", "'set'", "'expect'", "'if'", "'to'", "'in'", "'OR'", "'AND'", "'!'", "'at'", "'now'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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

                if ( (LA1_0==32) ) {
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:433:1: ruleInRule : ( ( rule__InRule__TimeAssignment ) ) ;
    public final void ruleInRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:437:2: ( ( ( rule__InRule__TimeAssignment ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:438:1: ( ( rule__InRule__TimeAssignment ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:438:1: ( ( rule__InRule__TimeAssignment ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:439:1: ( rule__InRule__TimeAssignment )
            {
             before(grammarAccess.getInRuleAccess().getTimeAssignment()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:440:1: ( rule__InRule__TimeAssignment )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:440:2: rule__InRule__TimeAssignment
            {
            pushFollow(FOLLOW_rule__InRule__TimeAssignment_in_ruleInRule875);
            rule__InRule__TimeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInRuleAccess().getTimeAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleInExpr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:790:1: entryRuleInExpr : ruleInExpr EOF ;
    public final void entryRuleInExpr() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:791:1: ( ruleInExpr EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:792:1: ruleInExpr EOF
            {
             before(grammarAccess.getInExprRule()); 
            pushFollow(FOLLOW_ruleInExpr_in_entryRuleInExpr1623);
            ruleInExpr();

            state._fsp--;

             after(grammarAccess.getInExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpr1630); 

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
    // $ANTLR end "entryRuleInExpr"


    // $ANTLR start "ruleInExpr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:799:1: ruleInExpr : ( ruleInTimeExpression ) ;
    public final void ruleInExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:803:2: ( ( ruleInTimeExpression ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:804:1: ( ruleInTimeExpression )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:804:1: ( ruleInTimeExpression )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:805:1: ruleInTimeExpression
            {
             before(grammarAccess.getInExprAccess().getInTimeExpressionParserRuleCall()); 
            pushFollow(FOLLOW_ruleInTimeExpression_in_ruleInExpr1656);
            ruleInTimeExpression();

            state._fsp--;

             after(grammarAccess.getInExprAccess().getInTimeExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInExpr"


    // $ANTLR start "entryRuleInTimeExpression"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:818:1: entryRuleInTimeExpression : ruleInTimeExpression EOF ;
    public final void entryRuleInTimeExpression() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:819:1: ( ruleInTimeExpression EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:820:1: ruleInTimeExpression EOF
            {
             before(grammarAccess.getInTimeExpressionRule()); 
            pushFollow(FOLLOW_ruleInTimeExpression_in_entryRuleInTimeExpression1682);
            ruleInTimeExpression();

            state._fsp--;

             after(grammarAccess.getInTimeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInTimeExpression1689); 

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
    // $ANTLR end "entryRuleInTimeExpression"


    // $ANTLR start "ruleInTimeExpression"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:827:1: ruleInTimeExpression : ( ( rule__InTimeExpression__Group__0 ) ) ;
    public final void ruleInTimeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:831:2: ( ( ( rule__InTimeExpression__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:832:1: ( ( rule__InTimeExpression__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:832:1: ( ( rule__InTimeExpression__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:833:1: ( rule__InTimeExpression__Group__0 )
            {
             before(grammarAccess.getInTimeExpressionAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:834:1: ( rule__InTimeExpression__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:834:2: rule__InTimeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group__0_in_ruleInTimeExpression1715);
            rule__InTimeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInTimeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInTimeExpression"


    // $ANTLR start "entryRuleInTimePrimary"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:846:1: entryRuleInTimePrimary : ruleInTimePrimary EOF ;
    public final void entryRuleInTimePrimary() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:847:1: ( ruleInTimePrimary EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:848:1: ruleInTimePrimary EOF
            {
             before(grammarAccess.getInTimePrimaryRule()); 
            pushFollow(FOLLOW_ruleInTimePrimary_in_entryRuleInTimePrimary1742);
            ruleInTimePrimary();

            state._fsp--;

             after(grammarAccess.getInTimePrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInTimePrimary1749); 

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
    // $ANTLR end "entryRuleInTimePrimary"


    // $ANTLR start "ruleInTimePrimary"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:855:1: ruleInTimePrimary : ( ( rule__InTimePrimary__Alternatives ) ) ;
    public final void ruleInTimePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:859:2: ( ( ( rule__InTimePrimary__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:860:1: ( ( rule__InTimePrimary__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:860:1: ( ( rule__InTimePrimary__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:861:1: ( rule__InTimePrimary__Alternatives )
            {
             before(grammarAccess.getInTimePrimaryAccess().getAlternatives()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:862:1: ( rule__InTimePrimary__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:862:2: rule__InTimePrimary__Alternatives
            {
            pushFollow(FOLLOW_rule__InTimePrimary__Alternatives_in_ruleInTimePrimary1775);
            rule__InTimePrimary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInTimePrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInTimePrimary"


    // $ANTLR start "entryRuleInTimeAtomic"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:874:1: entryRuleInTimeAtomic : ruleInTimeAtomic EOF ;
    public final void entryRuleInTimeAtomic() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:875:1: ( ruleInTimeAtomic EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:876:1: ruleInTimeAtomic EOF
            {
             before(grammarAccess.getInTimeAtomicRule()); 
            pushFollow(FOLLOW_ruleInTimeAtomic_in_entryRuleInTimeAtomic1802);
            ruleInTimeAtomic();

            state._fsp--;

             after(grammarAccess.getInTimeAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInTimeAtomic1809); 

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
    // $ANTLR end "entryRuleInTimeAtomic"


    // $ANTLR start "ruleInTimeAtomic"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:883:1: ruleInTimeAtomic : ( ( rule__InTimeAtomic__Alternatives ) ) ;
    public final void ruleInTimeAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:887:2: ( ( ( rule__InTimeAtomic__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:888:1: ( ( rule__InTimeAtomic__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:888:1: ( ( rule__InTimeAtomic__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:889:1: ( rule__InTimeAtomic__Alternatives )
            {
             before(grammarAccess.getInTimeAtomicAccess().getAlternatives()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:890:1: ( rule__InTimeAtomic__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:890:2: rule__InTimeAtomic__Alternatives
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__Alternatives_in_ruleInTimeAtomic1835);
            rule__InTimeAtomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInTimeAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInTimeAtomic"


    // $ANTLR start "rule__AllenOp__ValueAlternatives_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:902:1: rule__AllenOp__ValueAlternatives_1_0 : ( ( 'before' ) | ( 'meets' ) | ( 'overlaps' ) | ( 'starts' ) | ( 'finishes' ) | ( 'during' ) );
    public final void rule__AllenOp__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:906:1: ( ( 'before' ) | ( 'meets' ) | ( 'overlaps' ) | ( 'starts' ) | ( 'finishes' ) | ( 'during' ) )
            int alt2=6;
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
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:907:1: ( 'before' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:907:1: ( 'before' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:908:1: 'before'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueBeforeKeyword_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__AllenOp__ValueAlternatives_1_01872); 
                     after(grammarAccess.getAllenOpAccess().getValueBeforeKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:915:6: ( 'meets' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:915:6: ( 'meets' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:916:1: 'meets'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueMeetsKeyword_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__AllenOp__ValueAlternatives_1_01892); 
                     after(grammarAccess.getAllenOpAccess().getValueMeetsKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:923:6: ( 'overlaps' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:923:6: ( 'overlaps' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:924:1: 'overlaps'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueOverlapsKeyword_1_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__AllenOp__ValueAlternatives_1_01912); 
                     after(grammarAccess.getAllenOpAccess().getValueOverlapsKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:931:6: ( 'starts' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:931:6: ( 'starts' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:932:1: 'starts'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueStartsKeyword_1_0_3()); 
                    match(input,15,FOLLOW_15_in_rule__AllenOp__ValueAlternatives_1_01932); 
                     after(grammarAccess.getAllenOpAccess().getValueStartsKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:939:6: ( 'finishes' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:939:6: ( 'finishes' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:940:1: 'finishes'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueFinishesKeyword_1_0_4()); 
                    match(input,16,FOLLOW_16_in_rule__AllenOp__ValueAlternatives_1_01952); 
                     after(grammarAccess.getAllenOpAccess().getValueFinishesKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:947:6: ( 'during' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:947:6: ( 'during' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:948:1: 'during'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueDuringKeyword_1_0_5()); 
                    match(input,17,FOLLOW_17_in_rule__AllenOp__ValueAlternatives_1_01972); 
                     after(grammarAccess.getAllenOpAccess().getValueDuringKeyword_1_0_5()); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:960:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:964:1: ( ( '==' ) | ( '!=' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:965:1: ( '==' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:965:1: ( '==' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:966:1: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Equality__OpAlternatives_1_1_02007); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:973:6: ( '!=' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:973:6: ( '!=' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:974:1: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Equality__OpAlternatives_1_1_02027); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:986:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:990:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
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
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:991:1: ( '>=' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:991:1: ( '>=' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:992:1: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,20,FOLLOW_20_in_rule__Comparison__OpAlternatives_1_1_02062); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:999:6: ( '<=' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:999:6: ( '<=' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1000:1: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,21,FOLLOW_21_in_rule__Comparison__OpAlternatives_1_1_02082); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1007:6: ( '>' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1007:6: ( '>' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1008:1: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,22,FOLLOW_22_in_rule__Comparison__OpAlternatives_1_1_02102); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1015:6: ( '<' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1015:6: ( '<' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1016:1: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,23,FOLLOW_23_in_rule__Comparison__OpAlternatives_1_1_02122); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1028:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1032:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1033:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1033:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1034:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1035:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1035:2: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_02156);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1039:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1039:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1040:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1041:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1041:2: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_02174);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1050:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1054:1: ( ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
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
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1055:1: ( '*' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1055:1: ( '*' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1056:1: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,24,FOLLOW_24_in_rule__MulOrDiv__OpAlternatives_1_1_02208); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1063:6: ( '/' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1063:6: ( '/' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1064:1: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,25,FOLLOW_25_in_rule__MulOrDiv__OpAlternatives_1_1_02228); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1071:6: ( '%' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1071:6: ( '%' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1072:1: '%'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2()); 
                    match(input,26,FOLLOW_26_in_rule__MulOrDiv__OpAlternatives_1_1_02248); 
                     after(grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1079:6: ( '^' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1079:6: ( '^' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1080:1: '^'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_1_0_3()); 
                    match(input,27,FOLLOW_27_in_rule__MulOrDiv__OpAlternatives_1_1_02268); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1092:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1096:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt7=1;
                }
                break;
            case 44:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case 28:
            case 29:
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
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1097:1: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1097:1: ( ( rule__Primary__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1098:1: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1099:1: ( rule__Primary__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1099:2: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives2302);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1103:6: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1103:6: ( ( rule__Primary__Group_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1104:1: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1105:1: ( rule__Primary__Group_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1105:2: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives2320);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1109:6: ( ruleAtomic )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1109:6: ( ruleAtomic )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1110:1: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__Primary__Alternatives2338);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1120:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1124:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) )
            int alt8=4;
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
            case 28:
            case 29:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1125:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1125:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1126:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1127:1: ( rule__Atomic__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1127:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives2370);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1131:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1131:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1132:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1133:1: ( rule__Atomic__Group_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1133:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives2388);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1137:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1137:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1138:1: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1139:1: ( rule__Atomic__Group_2__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1139:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives2406);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1143:6: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1143:6: ( ( rule__Atomic__Group_3__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1144:1: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1145:1: ( rule__Atomic__Group_3__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1145:2: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives2424);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1154:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1158:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1159:1: ( 'true' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1159:1: ( 'true' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1160:1: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,28,FOLLOW_28_in_rule__Atomic__ValueAlternatives_2_1_02458); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1167:6: ( 'false' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1167:6: ( 'false' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1168:1: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,29,FOLLOW_29_in_rule__Atomic__ValueAlternatives_2_1_02478); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1181:1: rule__AtTimeExpression__OpAlternatives_1_1_0 : ( ( '-' ) | ( '+' ) );
    public final void rule__AtTimeExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1185:1: ( ( '-' ) | ( '+' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==31) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1186:1: ( '-' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1186:1: ( '-' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1187:1: '-'
                    {
                     before(grammarAccess.getAtTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0()); 
                    match(input,30,FOLLOW_30_in_rule__AtTimeExpression__OpAlternatives_1_1_02514); 
                     after(grammarAccess.getAtTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1194:6: ( '+' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1194:6: ( '+' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1195:1: '+'
                    {
                     before(grammarAccess.getAtTimeExpressionAccess().getOpPlusSignKeyword_1_1_0_1()); 
                    match(input,31,FOLLOW_31_in_rule__AtTimeExpression__OpAlternatives_1_1_02534); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1207:1: rule__AtTimePrimary__Alternatives : ( ( ( rule__AtTimePrimary__Group_0__0 ) ) | ( ruleAtTimeAtomic ) );
    public final void rule__AtTimePrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1211:1: ( ( ( rule__AtTimePrimary__Group_0__0 ) ) | ( ruleAtTimeAtomic ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INT||LA11_0==46) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1212:1: ( ( rule__AtTimePrimary__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1212:1: ( ( rule__AtTimePrimary__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1213:1: ( rule__AtTimePrimary__Group_0__0 )
                    {
                     before(grammarAccess.getAtTimePrimaryAccess().getGroup_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1214:1: ( rule__AtTimePrimary__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1214:2: rule__AtTimePrimary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__0_in_rule__AtTimePrimary__Alternatives2568);
                    rule__AtTimePrimary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtTimePrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1218:6: ( ruleAtTimeAtomic )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1218:6: ( ruleAtTimeAtomic )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1219:1: ruleAtTimeAtomic
                    {
                     before(grammarAccess.getAtTimePrimaryAccess().getAtTimeAtomicParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAtTimeAtomic_in_rule__AtTimePrimary__Alternatives2586);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1229:1: rule__AtTimeAtomic__Alternatives : ( ( ( rule__AtTimeAtomic__Group_0__0 ) ) | ( ( rule__AtTimeAtomic__Group_1__0 ) ) );
    public final void rule__AtTimeAtomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1233:1: ( ( ( rule__AtTimeAtomic__Group_0__0 ) ) | ( ( rule__AtTimeAtomic__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==46) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1234:1: ( ( rule__AtTimeAtomic__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1234:1: ( ( rule__AtTimeAtomic__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1235:1: ( rule__AtTimeAtomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtTimeAtomicAccess().getGroup_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1236:1: ( rule__AtTimeAtomic__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1236:2: rule__AtTimeAtomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__0_in_rule__AtTimeAtomic__Alternatives2618);
                    rule__AtTimeAtomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtTimeAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1240:6: ( ( rule__AtTimeAtomic__Group_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1240:6: ( ( rule__AtTimeAtomic__Group_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1241:1: ( rule__AtTimeAtomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtTimeAtomicAccess().getGroup_1()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1242:1: ( rule__AtTimeAtomic__Group_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1242:2: rule__AtTimeAtomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__0_in_rule__AtTimeAtomic__Alternatives2636);
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


    // $ANTLR start "rule__InTimeExpression__OpAlternatives_1_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1251:1: rule__InTimeExpression__OpAlternatives_1_1_0 : ( ( '-' ) | ( '+' ) );
    public final void rule__InTimeExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1255:1: ( ( '-' ) | ( '+' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1256:1: ( '-' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1256:1: ( '-' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1257:1: '-'
                    {
                     before(grammarAccess.getInTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0()); 
                    match(input,30,FOLLOW_30_in_rule__InTimeExpression__OpAlternatives_1_1_02670); 
                     after(grammarAccess.getInTimeExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1264:6: ( '+' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1264:6: ( '+' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1265:1: '+'
                    {
                     before(grammarAccess.getInTimeExpressionAccess().getOpPlusSignKeyword_1_1_0_1()); 
                    match(input,31,FOLLOW_31_in_rule__InTimeExpression__OpAlternatives_1_1_02690); 
                     after(grammarAccess.getInTimeExpressionAccess().getOpPlusSignKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__InTimeExpression__OpAlternatives_1_1_0"


    // $ANTLR start "rule__InTimePrimary__Alternatives"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1277:1: rule__InTimePrimary__Alternatives : ( ( ( rule__InTimePrimary__Group_0__0 ) ) | ( ruleInTimeAtomic ) );
    public final void rule__InTimePrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1281:1: ( ( ( rule__InTimePrimary__Group_0__0 ) ) | ( ruleInTimeAtomic ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT||LA14_0==46) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1282:1: ( ( rule__InTimePrimary__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1282:1: ( ( rule__InTimePrimary__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1283:1: ( rule__InTimePrimary__Group_0__0 )
                    {
                     before(grammarAccess.getInTimePrimaryAccess().getGroup_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1284:1: ( rule__InTimePrimary__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1284:2: rule__InTimePrimary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__InTimePrimary__Group_0__0_in_rule__InTimePrimary__Alternatives2724);
                    rule__InTimePrimary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInTimePrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1288:6: ( ruleInTimeAtomic )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1288:6: ( ruleInTimeAtomic )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1289:1: ruleInTimeAtomic
                    {
                     before(grammarAccess.getInTimePrimaryAccess().getInTimeAtomicParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInTimeAtomic_in_rule__InTimePrimary__Alternatives2742);
                    ruleInTimeAtomic();

                    state._fsp--;

                     after(grammarAccess.getInTimePrimaryAccess().getInTimeAtomicParserRuleCall_1()); 

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
    // $ANTLR end "rule__InTimePrimary__Alternatives"


    // $ANTLR start "rule__InTimeAtomic__Alternatives"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1299:1: rule__InTimeAtomic__Alternatives : ( ( ( rule__InTimeAtomic__Group_0__0 ) ) | ( ( rule__InTimeAtomic__Group_1__0 ) ) );
    public final void rule__InTimeAtomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1303:1: ( ( ( rule__InTimeAtomic__Group_0__0 ) ) | ( ( rule__InTimeAtomic__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==46) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1304:1: ( ( rule__InTimeAtomic__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1304:1: ( ( rule__InTimeAtomic__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1305:1: ( rule__InTimeAtomic__Group_0__0 )
                    {
                     before(grammarAccess.getInTimeAtomicAccess().getGroup_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1306:1: ( rule__InTimeAtomic__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1306:2: rule__InTimeAtomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__InTimeAtomic__Group_0__0_in_rule__InTimeAtomic__Alternatives2774);
                    rule__InTimeAtomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInTimeAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1310:6: ( ( rule__InTimeAtomic__Group_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1310:6: ( ( rule__InTimeAtomic__Group_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1311:1: ( rule__InTimeAtomic__Group_1__0 )
                    {
                     before(grammarAccess.getInTimeAtomicAccess().getGroup_1()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1312:1: ( rule__InTimeAtomic__Group_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1312:2: rule__InTimeAtomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__InTimeAtomic__Group_1__0_in_rule__InTimeAtomic__Alternatives2792);
                    rule__InTimeAtomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInTimeAtomicAccess().getGroup_1()); 

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
    // $ANTLR end "rule__InTimeAtomic__Alternatives"


    // $ANTLR start "rule__Statement__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1323:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1327:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1328:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02823);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02826);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1335:1: rule__Statement__Group__0__Impl : ( 'on' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1339:1: ( ( 'on' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1340:1: ( 'on' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1340:1: ( 'on' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1341:1: 'on'
            {
             before(grammarAccess.getStatementAccess().getOnKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Statement__Group__0__Impl2854); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1354:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1358:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1359:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12885);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12888);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1366:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__EventAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1370:1: ( ( ( rule__Statement__EventAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1371:1: ( ( rule__Statement__EventAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1371:1: ( ( rule__Statement__EventAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1372:1: ( rule__Statement__EventAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getEventAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1373:1: ( rule__Statement__EventAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1373:2: rule__Statement__EventAssignment_1
            {
            pushFollow(FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl2915);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1383:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1387:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1388:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22945);
            rule__Statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22948);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1395:1: rule__Statement__Group__2__Impl : ( ( rule__Statement__ContextsListAssignment_2 ) ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1399:1: ( ( ( rule__Statement__ContextsListAssignment_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1400:1: ( ( rule__Statement__ContextsListAssignment_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1400:1: ( ( rule__Statement__ContextsListAssignment_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1401:1: ( rule__Statement__ContextsListAssignment_2 )
            {
             before(grammarAccess.getStatementAccess().getContextsListAssignment_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1402:1: ( rule__Statement__ContextsListAssignment_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1402:2: rule__Statement__ContextsListAssignment_2
            {
            pushFollow(FOLLOW_rule__Statement__ContextsListAssignment_2_in_rule__Statement__Group__2__Impl2975);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1412:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1416:1: ( rule__Statement__Group__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1417:2: rule__Statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__33005);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1423:1: rule__Statement__Group__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1427:1: ( ( ';' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1428:1: ( ';' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1428:1: ( ';' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1429:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Statement__Group__3__Impl3033); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1450:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1454:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1455:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03072);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03075);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1462:1: rule__Event__Group__0__Impl : ( ( rule__Event__EventNameAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1466:1: ( ( ( rule__Event__EventNameAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1467:1: ( ( rule__Event__EventNameAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1467:1: ( ( rule__Event__EventNameAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1468:1: ( rule__Event__EventNameAssignment_0 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1469:1: ( rule__Event__EventNameAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1469:2: rule__Event__EventNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Event__EventNameAssignment_0_in_rule__Event__Group__0__Impl3102);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1479:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1483:1: ( rule__Event__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1484:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13132);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1490:1: rule__Event__Group__1__Impl : ( ( rule__Event__Group_1__0 )? ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1494:1: ( ( ( rule__Event__Group_1__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1495:1: ( ( rule__Event__Group_1__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1495:1: ( ( rule__Event__Group_1__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1496:1: ( rule__Event__Group_1__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1497:1: ( rule__Event__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1497:2: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl3159);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1511:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1515:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1516:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__03194);
            rule__Event__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__03197);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1523:1: rule__Event__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1527:1: ( ( '(' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1528:1: ( '(' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1528:1: ( '(' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1529:1: '('
            {
             before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Event__Group_1__0__Impl3225); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1542:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl rule__Event__Group_1__2 ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1546:1: ( rule__Event__Group_1__1__Impl rule__Event__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1547:2: rule__Event__Group_1__1__Impl rule__Event__Group_1__2
            {
            pushFollow(FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__13256);
            rule__Event__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__2_in_rule__Event__Group_1__13259);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1554:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__ParamsAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1558:1: ( ( ( rule__Event__ParamsAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1559:1: ( ( rule__Event__ParamsAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1559:1: ( ( rule__Event__ParamsAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1560:1: ( rule__Event__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getParamsAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1561:1: ( rule__Event__ParamsAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1561:2: rule__Event__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Event__ParamsAssignment_1_1_in_rule__Event__Group_1__1__Impl3286);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1571:1: rule__Event__Group_1__2 : rule__Event__Group_1__2__Impl rule__Event__Group_1__3 ;
    public final void rule__Event__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1575:1: ( rule__Event__Group_1__2__Impl rule__Event__Group_1__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1576:2: rule__Event__Group_1__2__Impl rule__Event__Group_1__3
            {
            pushFollow(FOLLOW_rule__Event__Group_1__2__Impl_in_rule__Event__Group_1__23316);
            rule__Event__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__3_in_rule__Event__Group_1__23319);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1583:1: rule__Event__Group_1__2__Impl : ( ( rule__Event__Group_1_2__0 )* ) ;
    public final void rule__Event__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1587:1: ( ( ( rule__Event__Group_1_2__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1588:1: ( ( rule__Event__Group_1_2__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1588:1: ( ( rule__Event__Group_1_2__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1589:1: ( rule__Event__Group_1_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1590:1: ( rule__Event__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1590:2: rule__Event__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Event__Group_1_2__0_in_rule__Event__Group_1__2__Impl3346);
            	    rule__Event__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1600:1: rule__Event__Group_1__3 : rule__Event__Group_1__3__Impl ;
    public final void rule__Event__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1604:1: ( rule__Event__Group_1__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1605:2: rule__Event__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1__3__Impl_in_rule__Event__Group_1__33377);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1611:1: rule__Event__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Event__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1615:1: ( ( ')' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1616:1: ( ')' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1616:1: ( ')' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1617:1: ')'
            {
             before(grammarAccess.getEventAccess().getRightParenthesisKeyword_1_3()); 
            match(input,35,FOLLOW_35_in_rule__Event__Group_1__3__Impl3405); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1638:1: rule__Event__Group_1_2__0 : rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 ;
    public final void rule__Event__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1642:1: ( rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1643:2: rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1_2__0__Impl_in_rule__Event__Group_1_2__03444);
            rule__Event__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1_2__1_in_rule__Event__Group_1_2__03447);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1650:1: rule__Event__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1654:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1655:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1655:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1656:1: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_1_2_0()); 
            match(input,36,FOLLOW_36_in_rule__Event__Group_1_2__0__Impl3475); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1669:1: rule__Event__Group_1_2__1 : rule__Event__Group_1_2__1__Impl ;
    public final void rule__Event__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1673:1: ( rule__Event__Group_1_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1674:2: rule__Event__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1_2__1__Impl_in_rule__Event__Group_1_2__13506);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1680:1: rule__Event__Group_1_2__1__Impl : ( ( rule__Event__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__Event__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1684:1: ( ( ( rule__Event__ParamsAssignment_1_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1685:1: ( ( rule__Event__ParamsAssignment_1_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1685:1: ( ( rule__Event__ParamsAssignment_1_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1686:1: ( rule__Event__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getEventAccess().getParamsAssignment_1_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1687:1: ( rule__Event__ParamsAssignment_1_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1687:2: rule__Event__ParamsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Event__ParamsAssignment_1_2_1_in_rule__Event__Group_1_2__1__Impl3533);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1701:1: rule__ContextsList__Group__0 : rule__ContextsList__Group__0__Impl rule__ContextsList__Group__1 ;
    public final void rule__ContextsList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1705:1: ( rule__ContextsList__Group__0__Impl rule__ContextsList__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1706:2: rule__ContextsList__Group__0__Impl rule__ContextsList__Group__1
            {
            pushFollow(FOLLOW_rule__ContextsList__Group__0__Impl_in_rule__ContextsList__Group__03567);
            rule__ContextsList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextsList__Group__1_in_rule__ContextsList__Group__03570);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1713:1: rule__ContextsList__Group__0__Impl : ( ( rule__ContextsList__EcContextsListAssignment_0 ) ) ;
    public final void rule__ContextsList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1717:1: ( ( ( rule__ContextsList__EcContextsListAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1718:1: ( ( rule__ContextsList__EcContextsListAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1718:1: ( ( rule__ContextsList__EcContextsListAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1719:1: ( rule__ContextsList__EcContextsListAssignment_0 )
            {
             before(grammarAccess.getContextsListAccess().getEcContextsListAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1720:1: ( rule__ContextsList__EcContextsListAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1720:2: rule__ContextsList__EcContextsListAssignment_0
            {
            pushFollow(FOLLOW_rule__ContextsList__EcContextsListAssignment_0_in_rule__ContextsList__Group__0__Impl3597);
            rule__ContextsList__EcContextsListAssignment_0();

            state._fsp--;


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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1730:1: rule__ContextsList__Group__1 : rule__ContextsList__Group__1__Impl ;
    public final void rule__ContextsList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1734:1: ( rule__ContextsList__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1735:2: rule__ContextsList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextsList__Group__1__Impl_in_rule__ContextsList__Group__13627);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1741:1: rule__ContextsList__Group__1__Impl : ( ( rule__ContextsList__Group_1__0 )? ) ;
    public final void rule__ContextsList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1745:1: ( ( ( rule__ContextsList__Group_1__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1746:1: ( ( rule__ContextsList__Group_1__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1746:1: ( ( rule__ContextsList__Group_1__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1747:1: ( rule__ContextsList__Group_1__0 )?
            {
             before(grammarAccess.getContextsListAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1748:1: ( rule__ContextsList__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1748:2: rule__ContextsList__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ContextsList__Group_1__0_in_rule__ContextsList__Group__1__Impl3654);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1762:1: rule__ContextsList__Group_1__0 : rule__ContextsList__Group_1__0__Impl rule__ContextsList__Group_1__1 ;
    public final void rule__ContextsList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1766:1: ( rule__ContextsList__Group_1__0__Impl rule__ContextsList__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1767:2: rule__ContextsList__Group_1__0__Impl rule__ContextsList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ContextsList__Group_1__0__Impl_in_rule__ContextsList__Group_1__03689);
            rule__ContextsList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextsList__Group_1__1_in_rule__ContextsList__Group_1__03692);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1774:1: rule__ContextsList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ContextsList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1778:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1779:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1779:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1780:1: ','
            {
             before(grammarAccess.getContextsListAccess().getCommaKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__ContextsList__Group_1__0__Impl3720); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1793:1: rule__ContextsList__Group_1__1 : rule__ContextsList__Group_1__1__Impl ;
    public final void rule__ContextsList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1797:1: ( rule__ContextsList__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1798:2: rule__ContextsList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextsList__Group_1__1__Impl_in_rule__ContextsList__Group_1__13751);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1804:1: rule__ContextsList__Group_1__1__Impl : ( ( rule__ContextsList__ExpContextsListAssignment_1_1 ) ) ;
    public final void rule__ContextsList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1808:1: ( ( ( rule__ContextsList__ExpContextsListAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1809:1: ( ( rule__ContextsList__ExpContextsListAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1809:1: ( ( rule__ContextsList__ExpContextsListAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1810:1: ( rule__ContextsList__ExpContextsListAssignment_1_1 )
            {
             before(grammarAccess.getContextsListAccess().getExpContextsListAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1811:1: ( rule__ContextsList__ExpContextsListAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1811:2: rule__ContextsList__ExpContextsListAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ContextsList__ExpContextsListAssignment_1_1_in_rule__ContextsList__Group_1__1__Impl3778);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1825:1: rule__EcContextsList__Group__0 : rule__EcContextsList__Group__0__Impl rule__EcContextsList__Group__1 ;
    public final void rule__EcContextsList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1829:1: ( rule__EcContextsList__Group__0__Impl rule__EcContextsList__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1830:2: rule__EcContextsList__Group__0__Impl rule__EcContextsList__Group__1
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group__0__Impl_in_rule__EcContextsList__Group__03812);
            rule__EcContextsList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContextsList__Group__1_in_rule__EcContextsList__Group__03815);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1837:1: rule__EcContextsList__Group__0__Impl : ( ( rule__EcContextsList__EcContextsAssignment_0 ) ) ;
    public final void rule__EcContextsList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1841:1: ( ( ( rule__EcContextsList__EcContextsAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1842:1: ( ( rule__EcContextsList__EcContextsAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1842:1: ( ( rule__EcContextsList__EcContextsAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1843:1: ( rule__EcContextsList__EcContextsAssignment_0 )
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1844:1: ( rule__EcContextsList__EcContextsAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1844:2: rule__EcContextsList__EcContextsAssignment_0
            {
            pushFollow(FOLLOW_rule__EcContextsList__EcContextsAssignment_0_in_rule__EcContextsList__Group__0__Impl3842);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1854:1: rule__EcContextsList__Group__1 : rule__EcContextsList__Group__1__Impl ;
    public final void rule__EcContextsList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1858:1: ( rule__EcContextsList__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1859:2: rule__EcContextsList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group__1__Impl_in_rule__EcContextsList__Group__13872);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1865:1: rule__EcContextsList__Group__1__Impl : ( ( rule__EcContextsList__Group_1__0 )* ) ;
    public final void rule__EcContextsList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1869:1: ( ( ( rule__EcContextsList__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1870:1: ( ( rule__EcContextsList__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1870:1: ( ( rule__EcContextsList__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1871:1: ( rule__EcContextsList__Group_1__0 )*
            {
             before(grammarAccess.getEcContextsListAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1872:1: ( rule__EcContextsList__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==37) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1872:2: rule__EcContextsList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EcContextsList__Group_1__0_in_rule__EcContextsList__Group__1__Impl3899);
            	    rule__EcContextsList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1886:1: rule__EcContextsList__Group_1__0 : rule__EcContextsList__Group_1__0__Impl rule__EcContextsList__Group_1__1 ;
    public final void rule__EcContextsList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1890:1: ( rule__EcContextsList__Group_1__0__Impl rule__EcContextsList__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1891:2: rule__EcContextsList__Group_1__0__Impl rule__EcContextsList__Group_1__1
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group_1__0__Impl_in_rule__EcContextsList__Group_1__03934);
            rule__EcContextsList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContextsList__Group_1__1_in_rule__EcContextsList__Group_1__03937);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1898:1: rule__EcContextsList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__EcContextsList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1902:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1903:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1903:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1904:1: ','
            {
             before(grammarAccess.getEcContextsListAccess().getCommaKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__EcContextsList__Group_1__0__Impl3965); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1917:1: rule__EcContextsList__Group_1__1 : rule__EcContextsList__Group_1__1__Impl ;
    public final void rule__EcContextsList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1921:1: ( rule__EcContextsList__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1922:2: rule__EcContextsList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group_1__1__Impl_in_rule__EcContextsList__Group_1__13996);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1928:1: rule__EcContextsList__Group_1__1__Impl : ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) ) ;
    public final void rule__EcContextsList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1932:1: ( ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1933:1: ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1933:1: ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1934:1: ( rule__EcContextsList__EcContextsAssignment_1_1 )
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1935:1: ( rule__EcContextsList__EcContextsAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1935:2: rule__EcContextsList__EcContextsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EcContextsList__EcContextsAssignment_1_1_in_rule__EcContextsList__Group_1__1__Impl4023);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1949:1: rule__ExpContextsList__Group__0 : rule__ExpContextsList__Group__0__Impl rule__ExpContextsList__Group__1 ;
    public final void rule__ExpContextsList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1953:1: ( rule__ExpContextsList__Group__0__Impl rule__ExpContextsList__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1954:2: rule__ExpContextsList__Group__0__Impl rule__ExpContextsList__Group__1
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group__0__Impl_in_rule__ExpContextsList__Group__04057);
            rule__ExpContextsList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContextsList__Group__1_in_rule__ExpContextsList__Group__04060);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1961:1: rule__ExpContextsList__Group__0__Impl : ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) ) ;
    public final void rule__ExpContextsList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1965:1: ( ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1966:1: ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1966:1: ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1967:1: ( rule__ExpContextsList__ExpContextsAssignment_0 )
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1968:1: ( rule__ExpContextsList__ExpContextsAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1968:2: rule__ExpContextsList__ExpContextsAssignment_0
            {
            pushFollow(FOLLOW_rule__ExpContextsList__ExpContextsAssignment_0_in_rule__ExpContextsList__Group__0__Impl4087);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1978:1: rule__ExpContextsList__Group__1 : rule__ExpContextsList__Group__1__Impl ;
    public final void rule__ExpContextsList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1982:1: ( rule__ExpContextsList__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1983:2: rule__ExpContextsList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group__1__Impl_in_rule__ExpContextsList__Group__14117);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1989:1: rule__ExpContextsList__Group__1__Impl : ( ( rule__ExpContextsList__Group_1__0 )* ) ;
    public final void rule__ExpContextsList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1993:1: ( ( ( rule__ExpContextsList__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1994:1: ( ( rule__ExpContextsList__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1994:1: ( ( rule__ExpContextsList__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1995:1: ( rule__ExpContextsList__Group_1__0 )*
            {
             before(grammarAccess.getExpContextsListAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1996:1: ( rule__ExpContextsList__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1996:2: rule__ExpContextsList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExpContextsList__Group_1__0_in_rule__ExpContextsList__Group__1__Impl4144);
            	    rule__ExpContextsList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2010:1: rule__ExpContextsList__Group_1__0 : rule__ExpContextsList__Group_1__0__Impl rule__ExpContextsList__Group_1__1 ;
    public final void rule__ExpContextsList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2014:1: ( rule__ExpContextsList__Group_1__0__Impl rule__ExpContextsList__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2015:2: rule__ExpContextsList__Group_1__0__Impl rule__ExpContextsList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group_1__0__Impl_in_rule__ExpContextsList__Group_1__04179);
            rule__ExpContextsList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContextsList__Group_1__1_in_rule__ExpContextsList__Group_1__04182);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2022:1: rule__ExpContextsList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ExpContextsList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2026:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2027:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2027:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2028:1: ','
            {
             before(grammarAccess.getExpContextsListAccess().getCommaKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__ExpContextsList__Group_1__0__Impl4210); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2041:1: rule__ExpContextsList__Group_1__1 : rule__ExpContextsList__Group_1__1__Impl ;
    public final void rule__ExpContextsList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2045:1: ( rule__ExpContextsList__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2046:2: rule__ExpContextsList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group_1__1__Impl_in_rule__ExpContextsList__Group_1__14241);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2052:1: rule__ExpContextsList__Group_1__1__Impl : ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) ) ;
    public final void rule__ExpContextsList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2056:1: ( ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2057:1: ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2057:1: ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2058:1: ( rule__ExpContextsList__ExpContextsAssignment_1_1 )
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2059:1: ( rule__ExpContextsList__ExpContextsAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2059:2: rule__ExpContextsList__ExpContextsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExpContextsList__ExpContextsAssignment_1_1_in_rule__ExpContextsList__Group_1__1__Impl4268);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2073:1: rule__EcContext__Group__0 : rule__EcContext__Group__0__Impl rule__EcContext__Group__1 ;
    public final void rule__EcContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2077:1: ( rule__EcContext__Group__0__Impl rule__EcContext__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2078:2: rule__EcContext__Group__0__Impl rule__EcContext__Group__1
            {
            pushFollow(FOLLOW_rule__EcContext__Group__0__Impl_in_rule__EcContext__Group__04302);
            rule__EcContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContext__Group__1_in_rule__EcContext__Group__04305);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2085:1: rule__EcContext__Group__0__Impl : ( 'set' ) ;
    public final void rule__EcContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2089:1: ( ( 'set' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2090:1: ( 'set' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2090:1: ( 'set' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2091:1: 'set'
            {
             before(grammarAccess.getEcContextAccess().getSetKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__EcContext__Group__0__Impl4333); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2104:1: rule__EcContext__Group__1 : rule__EcContext__Group__1__Impl rule__EcContext__Group__2 ;
    public final void rule__EcContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2108:1: ( rule__EcContext__Group__1__Impl rule__EcContext__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2109:2: rule__EcContext__Group__1__Impl rule__EcContext__Group__2
            {
            pushFollow(FOLLOW_rule__EcContext__Group__1__Impl_in_rule__EcContext__Group__14364);
            rule__EcContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContext__Group__2_in_rule__EcContext__Group__14367);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2116:1: rule__EcContext__Group__1__Impl : ( ( rule__EcContext__FluentAssignment_1 ) ) ;
    public final void rule__EcContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2120:1: ( ( ( rule__EcContext__FluentAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2121:1: ( ( rule__EcContext__FluentAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2121:1: ( ( rule__EcContext__FluentAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2122:1: ( rule__EcContext__FluentAssignment_1 )
            {
             before(grammarAccess.getEcContextAccess().getFluentAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2123:1: ( rule__EcContext__FluentAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2123:2: rule__EcContext__FluentAssignment_1
            {
            pushFollow(FOLLOW_rule__EcContext__FluentAssignment_1_in_rule__EcContext__Group__1__Impl4394);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2133:1: rule__EcContext__Group__2 : rule__EcContext__Group__2__Impl ;
    public final void rule__EcContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2137:1: ( rule__EcContext__Group__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2138:2: rule__EcContext__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EcContext__Group__2__Impl_in_rule__EcContext__Group__24424);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2144:1: rule__EcContext__Group__2__Impl : ( ( rule__EcContext__Group_2__0 )* ) ;
    public final void rule__EcContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2148:1: ( ( ( rule__EcContext__Group_2__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2149:1: ( ( rule__EcContext__Group_2__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2149:1: ( ( rule__EcContext__Group_2__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2150:1: ( rule__EcContext__Group_2__0 )*
            {
             before(grammarAccess.getEcContextAccess().getGroup_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2151:1: ( rule__EcContext__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==36) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==RULE_ID) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2151:2: rule__EcContext__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EcContext__Group_2__0_in_rule__EcContext__Group__2__Impl4451);
            	    rule__EcContext__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2167:1: rule__EcContext__Group_2__0 : rule__EcContext__Group_2__0__Impl rule__EcContext__Group_2__1 ;
    public final void rule__EcContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2171:1: ( rule__EcContext__Group_2__0__Impl rule__EcContext__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2172:2: rule__EcContext__Group_2__0__Impl rule__EcContext__Group_2__1
            {
            pushFollow(FOLLOW_rule__EcContext__Group_2__0__Impl_in_rule__EcContext__Group_2__04488);
            rule__EcContext__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContext__Group_2__1_in_rule__EcContext__Group_2__04491);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2179:1: rule__EcContext__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EcContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2183:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2184:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2184:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2185:1: ','
            {
             before(grammarAccess.getEcContextAccess().getCommaKeyword_2_0()); 
            match(input,36,FOLLOW_36_in_rule__EcContext__Group_2__0__Impl4519); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2198:1: rule__EcContext__Group_2__1 : rule__EcContext__Group_2__1__Impl ;
    public final void rule__EcContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2202:1: ( rule__EcContext__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2203:2: rule__EcContext__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EcContext__Group_2__1__Impl_in_rule__EcContext__Group_2__14550);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2209:1: rule__EcContext__Group_2__1__Impl : ( ( rule__EcContext__FluentAssignment_2_1 ) ) ;
    public final void rule__EcContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2213:1: ( ( ( rule__EcContext__FluentAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2214:1: ( ( rule__EcContext__FluentAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2214:1: ( ( rule__EcContext__FluentAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2215:1: ( rule__EcContext__FluentAssignment_2_1 )
            {
             before(grammarAccess.getEcContextAccess().getFluentAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2216:1: ( rule__EcContext__FluentAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2216:2: rule__EcContext__FluentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EcContext__FluentAssignment_2_1_in_rule__EcContext__Group_2__1__Impl4577);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2230:1: rule__ExpContext__Group__0 : rule__ExpContext__Group__0__Impl rule__ExpContext__Group__1 ;
    public final void rule__ExpContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2234:1: ( rule__ExpContext__Group__0__Impl rule__ExpContext__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2235:2: rule__ExpContext__Group__0__Impl rule__ExpContext__Group__1
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__0__Impl_in_rule__ExpContext__Group__04611);
            rule__ExpContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group__1_in_rule__ExpContext__Group__04614);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2242:1: rule__ExpContext__Group__0__Impl : ( 'expect' ) ;
    public final void rule__ExpContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2246:1: ( ( 'expect' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2247:1: ( 'expect' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2247:1: ( 'expect' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2248:1: 'expect'
            {
             before(grammarAccess.getExpContextAccess().getExpectKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__ExpContext__Group__0__Impl4642); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2261:1: rule__ExpContext__Group__1 : rule__ExpContext__Group__1__Impl rule__ExpContext__Group__2 ;
    public final void rule__ExpContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2265:1: ( rule__ExpContext__Group__1__Impl rule__ExpContext__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2266:2: rule__ExpContext__Group__1__Impl rule__ExpContext__Group__2
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__1__Impl_in_rule__ExpContext__Group__14673);
            rule__ExpContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group__2_in_rule__ExpContext__Group__14676);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2273:1: rule__ExpContext__Group__1__Impl : ( ( rule__ExpContext__FinalConditionAssignment_1 ) ) ;
    public final void rule__ExpContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2277:1: ( ( ( rule__ExpContext__FinalConditionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2278:1: ( ( rule__ExpContext__FinalConditionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2278:1: ( ( rule__ExpContext__FinalConditionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2279:1: ( rule__ExpContext__FinalConditionAssignment_1 )
            {
             before(grammarAccess.getExpContextAccess().getFinalConditionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2280:1: ( rule__ExpContext__FinalConditionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2280:2: rule__ExpContext__FinalConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__ExpContext__FinalConditionAssignment_1_in_rule__ExpContext__Group__1__Impl4703);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2290:1: rule__ExpContext__Group__2 : rule__ExpContext__Group__2__Impl rule__ExpContext__Group__3 ;
    public final void rule__ExpContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2294:1: ( rule__ExpContext__Group__2__Impl rule__ExpContext__Group__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2295:2: rule__ExpContext__Group__2__Impl rule__ExpContext__Group__3
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__2__Impl_in_rule__ExpContext__Group__24733);
            rule__ExpContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group__3_in_rule__ExpContext__Group__24736);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2302:1: rule__ExpContext__Group__2__Impl : ( ( rule__ExpContext__Group_2__0 )? ) ;
    public final void rule__ExpContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2306:1: ( ( ( rule__ExpContext__Group_2__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2307:1: ( ( rule__ExpContext__Group_2__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2307:1: ( ( rule__ExpContext__Group_2__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2308:1: ( rule__ExpContext__Group_2__0 )?
            {
             before(grammarAccess.getExpContextAccess().getGroup_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2309:1: ( rule__ExpContext__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=12 && LA22_0<=17)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2309:2: rule__ExpContext__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExpContext__Group_2__0_in_rule__ExpContext__Group__2__Impl4763);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2319:1: rule__ExpContext__Group__3 : rule__ExpContext__Group__3__Impl ;
    public final void rule__ExpContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2323:1: ( rule__ExpContext__Group__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2324:2: rule__ExpContext__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__3__Impl_in_rule__ExpContext__Group__34794);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2330:1: rule__ExpContext__Group__3__Impl : ( ( rule__ExpContext__Group_3__0 )? ) ;
    public final void rule__ExpContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2334:1: ( ( ( rule__ExpContext__Group_3__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2335:1: ( ( rule__ExpContext__Group_3__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2335:1: ( ( rule__ExpContext__Group_3__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2336:1: ( rule__ExpContext__Group_3__0 )?
            {
             before(grammarAccess.getExpContextAccess().getGroup_3()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2337:1: ( rule__ExpContext__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2337:2: rule__ExpContext__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExpContext__Group_3__0_in_rule__ExpContext__Group__3__Impl4821);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2355:1: rule__ExpContext__Group_2__0 : rule__ExpContext__Group_2__0__Impl rule__ExpContext__Group_2__1 ;
    public final void rule__ExpContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2359:1: ( rule__ExpContext__Group_2__0__Impl rule__ExpContext__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2360:2: rule__ExpContext__Group_2__0__Impl rule__ExpContext__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_2__0__Impl_in_rule__ExpContext__Group_2__04860);
            rule__ExpContext__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group_2__1_in_rule__ExpContext__Group_2__04863);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2367:1: rule__ExpContext__Group_2__0__Impl : ( ( rule__ExpContext__AllenOpAssignment_2_0 ) ) ;
    public final void rule__ExpContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2371:1: ( ( ( rule__ExpContext__AllenOpAssignment_2_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2372:1: ( ( rule__ExpContext__AllenOpAssignment_2_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2372:1: ( ( rule__ExpContext__AllenOpAssignment_2_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2373:1: ( rule__ExpContext__AllenOpAssignment_2_0 )
            {
             before(grammarAccess.getExpContextAccess().getAllenOpAssignment_2_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2374:1: ( rule__ExpContext__AllenOpAssignment_2_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2374:2: rule__ExpContext__AllenOpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ExpContext__AllenOpAssignment_2_0_in_rule__ExpContext__Group_2__0__Impl4890);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2384:1: rule__ExpContext__Group_2__1 : rule__ExpContext__Group_2__1__Impl ;
    public final void rule__ExpContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2388:1: ( rule__ExpContext__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2389:2: rule__ExpContext__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_2__1__Impl_in_rule__ExpContext__Group_2__14920);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2395:1: rule__ExpContext__Group_2__1__Impl : ( ( rule__ExpContext__TimeAssignment_2_1 ) ) ;
    public final void rule__ExpContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2399:1: ( ( ( rule__ExpContext__TimeAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2400:1: ( ( rule__ExpContext__TimeAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2400:1: ( ( rule__ExpContext__TimeAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2401:1: ( rule__ExpContext__TimeAssignment_2_1 )
            {
             before(grammarAccess.getExpContextAccess().getTimeAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2402:1: ( rule__ExpContext__TimeAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2402:2: rule__ExpContext__TimeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExpContext__TimeAssignment_2_1_in_rule__ExpContext__Group_2__1__Impl4947);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2416:1: rule__ExpContext__Group_3__0 : rule__ExpContext__Group_3__0__Impl rule__ExpContext__Group_3__1 ;
    public final void rule__ExpContext__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2420:1: ( rule__ExpContext__Group_3__0__Impl rule__ExpContext__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2421:2: rule__ExpContext__Group_3__0__Impl rule__ExpContext__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_3__0__Impl_in_rule__ExpContext__Group_3__04981);
            rule__ExpContext__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group_3__1_in_rule__ExpContext__Group_3__04984);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2428:1: rule__ExpContext__Group_3__0__Impl : ( 'if' ) ;
    public final void rule__ExpContext__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2432:1: ( ( 'if' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2433:1: ( 'if' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2433:1: ( 'if' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2434:1: 'if'
            {
             before(grammarAccess.getExpContextAccess().getIfKeyword_3_0()); 
            match(input,39,FOLLOW_39_in_rule__ExpContext__Group_3__0__Impl5012); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2447:1: rule__ExpContext__Group_3__1 : rule__ExpContext__Group_3__1__Impl ;
    public final void rule__ExpContext__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2451:1: ( rule__ExpContext__Group_3__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2452:2: rule__ExpContext__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_3__1__Impl_in_rule__ExpContext__Group_3__15043);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2458:1: rule__ExpContext__Group_3__1__Impl : ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) ) ;
    public final void rule__ExpContext__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2462:1: ( ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2463:1: ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2463:1: ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2464:1: ( rule__ExpContext__InitialConditionAssignment_3_1 )
            {
             before(grammarAccess.getExpContextAccess().getInitialConditionAssignment_3_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2465:1: ( rule__ExpContext__InitialConditionAssignment_3_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2465:2: rule__ExpContext__InitialConditionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ExpContext__InitialConditionAssignment_3_1_in_rule__ExpContext__Group_3__1__Impl5070);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2479:1: rule__AllenOp__Group__0 : rule__AllenOp__Group__0__Impl rule__AllenOp__Group__1 ;
    public final void rule__AllenOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2483:1: ( rule__AllenOp__Group__0__Impl rule__AllenOp__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2484:2: rule__AllenOp__Group__0__Impl rule__AllenOp__Group__1
            {
            pushFollow(FOLLOW_rule__AllenOp__Group__0__Impl_in_rule__AllenOp__Group__05104);
            rule__AllenOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllenOp__Group__1_in_rule__AllenOp__Group__05107);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2491:1: rule__AllenOp__Group__0__Impl : ( () ) ;
    public final void rule__AllenOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2495:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2496:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2496:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2497:1: ()
            {
             before(grammarAccess.getAllenOpAccess().getAllenOperatorAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2498:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2500:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2510:1: rule__AllenOp__Group__1 : rule__AllenOp__Group__1__Impl ;
    public final void rule__AllenOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2514:1: ( rule__AllenOp__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2515:2: rule__AllenOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AllenOp__Group__1__Impl_in_rule__AllenOp__Group__15165);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2521:1: rule__AllenOp__Group__1__Impl : ( ( rule__AllenOp__ValueAssignment_1 ) ) ;
    public final void rule__AllenOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2525:1: ( ( ( rule__AllenOp__ValueAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2526:1: ( ( rule__AllenOp__ValueAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2526:1: ( ( rule__AllenOp__ValueAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2527:1: ( rule__AllenOp__ValueAssignment_1 )
            {
             before(grammarAccess.getAllenOpAccess().getValueAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2528:1: ( rule__AllenOp__ValueAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2528:2: rule__AllenOp__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__AllenOp__ValueAssignment_1_in_rule__AllenOp__Group__1__Impl5192);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2542:1: rule__Fluent__Group__0 : rule__Fluent__Group__0__Impl rule__Fluent__Group__1 ;
    public final void rule__Fluent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2546:1: ( rule__Fluent__Group__0__Impl rule__Fluent__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2547:2: rule__Fluent__Group__0__Impl rule__Fluent__Group__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__05226);
            rule__Fluent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__05229);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2554:1: rule__Fluent__Group__0__Impl : ( ( rule__Fluent__FluentNameAssignment_0 ) ) ;
    public final void rule__Fluent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2558:1: ( ( ( rule__Fluent__FluentNameAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2559:1: ( ( rule__Fluent__FluentNameAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2559:1: ( ( rule__Fluent__FluentNameAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2560:1: ( rule__Fluent__FluentNameAssignment_0 )
            {
             before(grammarAccess.getFluentAccess().getFluentNameAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2561:1: ( rule__Fluent__FluentNameAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2561:2: rule__Fluent__FluentNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Fluent__FluentNameAssignment_0_in_rule__Fluent__Group__0__Impl5256);
            rule__Fluent__FluentNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFluentAccess().getFluentNameAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2571:1: rule__Fluent__Group__1 : rule__Fluent__Group__1__Impl rule__Fluent__Group__2 ;
    public final void rule__Fluent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2575:1: ( rule__Fluent__Group__1__Impl rule__Fluent__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2576:2: rule__Fluent__Group__1__Impl rule__Fluent__Group__2
            {
            pushFollow(FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__15286);
            rule__Fluent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__15289);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2583:1: rule__Fluent__Group__1__Impl : ( ( rule__Fluent__Group_1__0 ) ) ;
    public final void rule__Fluent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2587:1: ( ( ( rule__Fluent__Group_1__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2588:1: ( ( rule__Fluent__Group_1__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2588:1: ( ( rule__Fluent__Group_1__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2589:1: ( rule__Fluent__Group_1__0 )
            {
             before(grammarAccess.getFluentAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2590:1: ( rule__Fluent__Group_1__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2590:2: rule__Fluent__Group_1__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl5316);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2600:1: rule__Fluent__Group__2 : rule__Fluent__Group__2__Impl rule__Fluent__Group__3 ;
    public final void rule__Fluent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2604:1: ( rule__Fluent__Group__2__Impl rule__Fluent__Group__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2605:2: rule__Fluent__Group__2__Impl rule__Fluent__Group__3
            {
            pushFollow(FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__25346);
            rule__Fluent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__25349);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2612:1: rule__Fluent__Group__2__Impl : ( ( rule__Fluent__Group_2__0 )? ) ;
    public final void rule__Fluent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2616:1: ( ( ( rule__Fluent__Group_2__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2617:1: ( ( rule__Fluent__Group_2__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2617:1: ( ( rule__Fluent__Group_2__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2618:1: ( rule__Fluent__Group_2__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2619:1: ( rule__Fluent__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2619:2: rule__Fluent__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl5376);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2629:1: rule__Fluent__Group__3 : rule__Fluent__Group__3__Impl ;
    public final void rule__Fluent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2633:1: ( rule__Fluent__Group__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2634:2: rule__Fluent__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__35407);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2640:1: rule__Fluent__Group__3__Impl : ( ( rule__Fluent__Group_3__0 )? ) ;
    public final void rule__Fluent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2644:1: ( ( ( rule__Fluent__Group_3__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2645:1: ( ( rule__Fluent__Group_3__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2645:1: ( ( rule__Fluent__Group_3__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2646:1: ( rule__Fluent__Group_3__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_3()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2647:1: ( rule__Fluent__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2647:2: rule__Fluent__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl5434);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2665:1: rule__Fluent__Group_1__0 : rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 ;
    public final void rule__Fluent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2669:1: ( rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2670:2: rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__05473);
            rule__Fluent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__05476);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2677:1: rule__Fluent__Group_1__0__Impl : ( 'to' ) ;
    public final void rule__Fluent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2681:1: ( ( 'to' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2682:1: ( 'to' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2682:1: ( 'to' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2683:1: 'to'
            {
             before(grammarAccess.getFluentAccess().getToKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Fluent__Group_1__0__Impl5504); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2696:1: rule__Fluent__Group_1__1 : rule__Fluent__Group_1__1__Impl ;
    public final void rule__Fluent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2700:1: ( rule__Fluent__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2701:2: rule__Fluent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__15535);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2707:1: rule__Fluent__Group_1__1__Impl : ( ( rule__Fluent__ValuePartAssignment_1_1 ) ) ;
    public final void rule__Fluent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2711:1: ( ( ( rule__Fluent__ValuePartAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2712:1: ( ( rule__Fluent__ValuePartAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2712:1: ( ( rule__Fluent__ValuePartAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2713:1: ( rule__Fluent__ValuePartAssignment_1_1 )
            {
             before(grammarAccess.getFluentAccess().getValuePartAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2714:1: ( rule__Fluent__ValuePartAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2714:2: rule__Fluent__ValuePartAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Fluent__ValuePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl5562);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2728:1: rule__Fluent__Group_2__0 : rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 ;
    public final void rule__Fluent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2732:1: ( rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2733:2: rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__05596);
            rule__Fluent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__05599);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2740:1: rule__Fluent__Group_2__0__Impl : ( 'in' ) ;
    public final void rule__Fluent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2744:1: ( ( 'in' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2745:1: ( 'in' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2745:1: ( 'in' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2746:1: 'in'
            {
             before(grammarAccess.getFluentAccess().getInKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__Fluent__Group_2__0__Impl5627); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2759:1: rule__Fluent__Group_2__1 : rule__Fluent__Group_2__1__Impl ;
    public final void rule__Fluent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2763:1: ( rule__Fluent__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2764:2: rule__Fluent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__15658);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2770:1: rule__Fluent__Group_2__1__Impl : ( ( rule__Fluent__TimePartAssignment_2_1 ) ) ;
    public final void rule__Fluent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2774:1: ( ( ( rule__Fluent__TimePartAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2775:1: ( ( rule__Fluent__TimePartAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2775:1: ( ( rule__Fluent__TimePartAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2776:1: ( rule__Fluent__TimePartAssignment_2_1 )
            {
             before(grammarAccess.getFluentAccess().getTimePartAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2777:1: ( rule__Fluent__TimePartAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2777:2: rule__Fluent__TimePartAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Fluent__TimePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl5685);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2791:1: rule__Fluent__Group_3__0 : rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 ;
    public final void rule__Fluent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2795:1: ( rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2796:2: rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__05719);
            rule__Fluent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__05722);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2803:1: rule__Fluent__Group_3__0__Impl : ( 'if' ) ;
    public final void rule__Fluent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2807:1: ( ( 'if' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2808:1: ( 'if' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2808:1: ( 'if' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2809:1: 'if'
            {
             before(grammarAccess.getFluentAccess().getIfKeyword_3_0()); 
            match(input,39,FOLLOW_39_in_rule__Fluent__Group_3__0__Impl5750); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2822:1: rule__Fluent__Group_3__1 : rule__Fluent__Group_3__1__Impl ;
    public final void rule__Fluent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2826:1: ( rule__Fluent__Group_3__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2827:2: rule__Fluent__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__15781);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2833:1: rule__Fluent__Group_3__1__Impl : ( ( rule__Fluent__CondPartAssignment_3_1 ) ) ;
    public final void rule__Fluent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2837:1: ( ( ( rule__Fluent__CondPartAssignment_3_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2838:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2838:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2839:1: ( rule__Fluent__CondPartAssignment_3_1 )
            {
             before(grammarAccess.getFluentAccess().getCondPartAssignment_3_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2840:1: ( rule__Fluent__CondPartAssignment_3_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2840:2: rule__Fluent__CondPartAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl5808);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2854:1: rule__ConditionRule__Group__0 : rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 ;
    public final void rule__ConditionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2858:1: ( rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2859:2: rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__05842);
            rule__ConditionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__05845);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2866:1: rule__ConditionRule__Group__0__Impl : ( () ) ;
    public final void rule__ConditionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2870:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2871:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2871:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2872:1: ()
            {
             before(grammarAccess.getConditionRuleAccess().getExpressionAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2873:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2875:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2885:1: rule__ConditionRule__Group__1 : rule__ConditionRule__Group__1__Impl ;
    public final void rule__ConditionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2889:1: ( rule__ConditionRule__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2890:2: rule__ConditionRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__15903);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2896:1: rule__ConditionRule__Group__1__Impl : ( ( rule__ConditionRule__ConditionAssignment_1 ) ) ;
    public final void rule__ConditionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2900:1: ( ( ( rule__ConditionRule__ConditionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2901:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2901:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2902:1: ( rule__ConditionRule__ConditionAssignment_1 )
            {
             before(grammarAccess.getConditionRuleAccess().getConditionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2903:1: ( rule__ConditionRule__ConditionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2903:2: rule__ConditionRule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl5930);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2917:1: rule__ToRule__Group__0 : rule__ToRule__Group__0__Impl rule__ToRule__Group__1 ;
    public final void rule__ToRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2921:1: ( rule__ToRule__Group__0__Impl rule__ToRule__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2922:2: rule__ToRule__Group__0__Impl rule__ToRule__Group__1
            {
            pushFollow(FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__05964);
            rule__ToRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__05967);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2929:1: rule__ToRule__Group__0__Impl : ( () ) ;
    public final void rule__ToRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2933:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2934:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2934:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2935:1: ()
            {
             before(grammarAccess.getToRuleAccess().getExpressionAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2936:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2938:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2948:1: rule__ToRule__Group__1 : rule__ToRule__Group__1__Impl ;
    public final void rule__ToRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2952:1: ( rule__ToRule__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2953:2: rule__ToRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__16025);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2959:1: rule__ToRule__Group__1__Impl : ( ( rule__ToRule__ExpressionAssignment_1 ) ) ;
    public final void rule__ToRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2963:1: ( ( ( rule__ToRule__ExpressionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2964:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2964:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2965:1: ( rule__ToRule__ExpressionAssignment_1 )
            {
             before(grammarAccess.getToRuleAccess().getExpressionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2966:1: ( rule__ToRule__ExpressionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2966:2: rule__ToRule__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl6052);
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


    // $ANTLR start "rule__Or__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2980:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2984:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2985:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__06086);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__06089);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2992:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2996:1: ( ( ruleAnd ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2997:1: ( ruleAnd )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2997:1: ( ruleAnd )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2998:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl6116);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3009:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3013:1: ( rule__Or__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3014:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__16145);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3020:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3024:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3025:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3025:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3026:1: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3027:1: ( rule__Or__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==42) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3027:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl6172);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3041:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3045:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3046:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__06207);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__06210);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3053:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3057:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3058:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3058:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3059:1: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3060:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3062:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3072:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3076:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3077:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__16268);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__16271);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3084:1: rule__Or__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3088:1: ( ( 'OR' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3089:1: ( 'OR' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3089:1: ( 'OR' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3090:1: 'OR'
            {
             before(grammarAccess.getOrAccess().getORKeyword_1_1()); 
            match(input,42,FOLLOW_42_in_rule__Or__Group_1__1__Impl6299); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3103:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3107:1: ( rule__Or__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3108:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__26330);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3114:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3118:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3119:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3119:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3120:1: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3121:1: ( rule__Or__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3121:2: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl6357);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3137:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3141:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3142:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__06393);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__06396);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3149:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3153:1: ( ( ruleEquality ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3154:1: ( ruleEquality )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3154:1: ( ruleEquality )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3155:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__Group__0__Impl6423);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3166:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3170:1: ( rule__And__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3171:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__16452);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3177:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3181:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3182:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3182:1: ( ( rule__And__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3183:1: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3184:1: ( rule__And__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==43) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3184:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl6479);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3198:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3202:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3203:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__06514);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__06517);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3210:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3214:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3215:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3215:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3216:1: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3217:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3219:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3229:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3233:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3234:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__16575);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__16578);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3241:1: rule__And__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3245:1: ( ( 'AND' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3246:1: ( 'AND' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3246:1: ( 'AND' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3247:1: 'AND'
            {
             before(grammarAccess.getAndAccess().getANDKeyword_1_1()); 
            match(input,43,FOLLOW_43_in_rule__And__Group_1__1__Impl6606); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3260:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3264:1: ( rule__And__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3265:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__26637);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3271:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3275:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3276:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3276:1: ( ( rule__And__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3277:1: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3278:1: ( rule__And__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3278:2: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl6664);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3294:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3298:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3299:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__06700);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__06703);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3306:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3310:1: ( ( ruleComparison ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3311:1: ( ruleComparison )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3311:1: ( ruleComparison )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3312:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl6730);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3323:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3327:1: ( rule__Equality__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3328:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__16759);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3334:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3338:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3339:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3339:1: ( ( rule__Equality__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3340:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3341:1: ( rule__Equality__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=18 && LA28_0<=19)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3341:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl6786);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3355:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3359:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3360:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__06821);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__06824);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3367:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3371:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3372:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3372:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3373:1: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3374:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3376:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3386:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3390:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3391:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__16882);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__16885);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3398:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3402:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3403:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3403:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3404:1: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3405:1: ( rule__Equality__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3405:2: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl6912);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3415:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3419:1: ( rule__Equality__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3420:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__26942);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3426:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3430:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3431:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3431:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3432:1: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3433:1: ( rule__Equality__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3433:2: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl6969);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3449:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3453:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3454:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__07005);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__07008);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3461:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3465:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3466:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3466:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3467:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl7035);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3478:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3482:1: ( rule__Comparison__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3483:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__17064);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3489:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3493:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3494:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3494:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3495:1: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3496:1: ( rule__Comparison__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=20 && LA29_0<=23)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3496:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl7091);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3510:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3514:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3515:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__07126);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__07129);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3522:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3526:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3527:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3527:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3528:1: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3529:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3531:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3541:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3545:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3546:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__17187);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__17190);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3553:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3557:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3558:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3558:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3559:1: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3560:1: ( rule__Comparison__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3560:2: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl7217);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3570:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3574:1: ( rule__Comparison__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3575:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__27247);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3581:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3585:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3586:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3586:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3587:1: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3588:1: ( rule__Comparison__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3588:2: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl7274);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3604:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3608:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3609:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__07310);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__07313);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3616:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3620:1: ( ( ruleMulOrDiv ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3621:1: ( ruleMulOrDiv )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3621:1: ( ruleMulOrDiv )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3622:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl7340);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3633:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3637:1: ( rule__PlusOrMinus__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3638:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__17369);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3644:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3648:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3649:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3649:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3650:1: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3651:1: ( rule__PlusOrMinus__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=30 && LA30_0<=31)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3651:2: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl7396);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3665:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3669:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3670:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__07431);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__07434);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3677:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3681:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3682:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3682:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3683:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3684:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3684:2: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl7461);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3694:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3698:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3699:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__17491);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3705:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3709:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3710:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3710:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3711:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3712:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3712:2: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl7518);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3726:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3730:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3731:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__07552);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__07555);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3738:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3742:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3743:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3743:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3744:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3745:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3747:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3757:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3761:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3762:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__17613);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3768:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3772:1: ( ( '+' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3773:1: ( '+' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3773:1: ( '+' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3774:1: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,31,FOLLOW_31_in_rule__PlusOrMinus__Group_1_0_0__1__Impl7641); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3791:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3795:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3796:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__07676);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__07679);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3803:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3807:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3808:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3808:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3809:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3810:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3812:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3822:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3826:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3827:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__17737);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3833:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3837:1: ( ( '-' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3838:1: ( '-' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3838:1: ( '-' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3839:1: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,30,FOLLOW_30_in_rule__PlusOrMinus__Group_1_0_1__1__Impl7765); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3856:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3860:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3861:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__07800);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__07803);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3868:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3872:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3873:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3873:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3874:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl7830);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3885:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3889:1: ( rule__MulOrDiv__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3890:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__17859);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3896:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3900:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3901:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3901:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3902:1: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3903:1: ( rule__MulOrDiv__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=24 && LA31_0<=27)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3903:2: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl7886);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3917:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3921:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3922:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__07921);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__07924);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3929:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3933:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3934:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3934:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3935:1: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3936:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3938:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3948:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3952:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3953:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__17982);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__17985);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3960:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3964:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3965:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3965:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3966:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3967:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3967:2: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl8012);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3977:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3981:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3982:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__28042);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3988:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3992:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3993:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3993:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3994:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3995:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3995:2: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl8069);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4011:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4015:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4016:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__08105);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__08108);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4023:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4027:1: ( ( '(' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4028:1: ( '(' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4028:1: ( '(' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4029:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__Primary__Group_0__0__Impl8136); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4042:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4046:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4047:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__18167);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__18170);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4054:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4058:1: ( ( ruleExpression ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4059:1: ( ruleExpression )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4059:1: ( ruleExpression )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4060:1: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl8197);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4071:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4075:1: ( rule__Primary__Group_0__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4076:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__28226);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4082:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4086:1: ( ( ')' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4087:1: ( ')' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4087:1: ( ')' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4088:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,35,FOLLOW_35_in_rule__Primary__Group_0__2__Impl8254); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4107:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4111:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4112:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__08291);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__08294);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4119:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4123:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4124:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4124:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4125:1: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4126:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4128:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4138:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4142:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4143:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__18352);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__18355);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4150:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4154:1: ( ( '!' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4155:1: ( '!' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4155:1: ( '!' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4156:1: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,44,FOLLOW_44_in_rule__Primary__Group_1__1__Impl8383); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4169:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4173:1: ( rule__Primary__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4174:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__28414);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4180:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4184:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4185:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4185:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4186:1: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4187:1: ( rule__Primary__ExpressionAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4187:2: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl8441);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4203:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4207:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4208:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__08477);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__08480);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4215:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4219:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4220:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4220:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4221:1: ()
            {
             before(grammarAccess.getAtomicAccess().getFloatConstantAction_0_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4222:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4224:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4234:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4238:1: ( rule__Atomic__Group_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4239:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__18538);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4245:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4249:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4250:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4250:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4251:1: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4252:1: ( rule__Atomic__ValueAssignment_0_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4252:2: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl8565);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4266:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4270:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4271:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__08599);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__08602);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4278:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4282:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4283:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4283:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4284:1: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4285:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4287:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4297:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4301:1: ( rule__Atomic__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4302:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__18660);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4308:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4312:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4313:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4313:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4314:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4315:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4315:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl8687);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4329:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4333:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4334:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__08721);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__08724);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4341:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4345:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4346:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4346:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4347:1: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4348:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4350:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4360:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4364:1: ( rule__Atomic__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4365:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__18782);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4371:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4375:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4376:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4376:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4377:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4378:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4378:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl8809);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4392:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4396:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4397:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__08843);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__08846);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4404:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4408:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4409:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4409:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4410:1: ()
            {
             before(grammarAccess.getAtomicAccess().getReferenceAction_3_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4411:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4413:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4423:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4427:1: ( rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4428:2: rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__18904);
            rule__Atomic__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__18907);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4435:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__RefAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4439:1: ( ( ( rule__Atomic__RefAssignment_3_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4440:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4440:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4441:1: ( rule__Atomic__RefAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4442:1: ( rule__Atomic__RefAssignment_3_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4442:2: rule__Atomic__RefAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Atomic__RefAssignment_3_1_in_rule__Atomic__Group_3__1__Impl8934);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4452:1: rule__Atomic__Group_3__2 : rule__Atomic__Group_3__2__Impl ;
    public final void rule__Atomic__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4456:1: ( rule__Atomic__Group_3__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4457:2: rule__Atomic__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__28964);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4463:1: rule__Atomic__Group_3__2__Impl : ( ( rule__Atomic__Group_3_2__0 )? ) ;
    public final void rule__Atomic__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4467:1: ( ( ( rule__Atomic__Group_3_2__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4468:1: ( ( rule__Atomic__Group_3_2__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4468:1: ( ( rule__Atomic__Group_3_2__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4469:1: ( rule__Atomic__Group_3_2__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_3_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4470:1: ( rule__Atomic__Group_3_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4470:2: rule__Atomic__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3_2__0_in_rule__Atomic__Group_3__2__Impl8991);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4486:1: rule__Atomic__Group_3_2__0 : rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1 ;
    public final void rule__Atomic__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4490:1: ( rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4491:2: rule__Atomic__Group_3_2__0__Impl rule__Atomic__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3_2__0__Impl_in_rule__Atomic__Group_3_2__09028);
            rule__Atomic__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3_2__1_in_rule__Atomic__Group_3_2__09031);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4498:1: rule__Atomic__Group_3_2__0__Impl : ( 'at' ) ;
    public final void rule__Atomic__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4502:1: ( ( 'at' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4503:1: ( 'at' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4503:1: ( 'at' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4504:1: 'at'
            {
             before(grammarAccess.getAtomicAccess().getAtKeyword_3_2_0()); 
            match(input,45,FOLLOW_45_in_rule__Atomic__Group_3_2__0__Impl9059); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4517:1: rule__Atomic__Group_3_2__1 : rule__Atomic__Group_3_2__1__Impl ;
    public final void rule__Atomic__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4521:1: ( rule__Atomic__Group_3_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4522:2: rule__Atomic__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3_2__1__Impl_in_rule__Atomic__Group_3_2__19090);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4528:1: rule__Atomic__Group_3_2__1__Impl : ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) ) ;
    public final void rule__Atomic__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4532:1: ( ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4533:1: ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4533:1: ( ( rule__Atomic__FluentValueSampleAssignment_3_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4534:1: ( rule__Atomic__FluentValueSampleAssignment_3_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getFluentValueSampleAssignment_3_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4535:1: ( rule__Atomic__FluentValueSampleAssignment_3_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4535:2: rule__Atomic__FluentValueSampleAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__FluentValueSampleAssignment_3_2_1_in_rule__Atomic__Group_3_2__1__Impl9117);
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


    // $ANTLR start "rule__AtTimeExpression__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4549:1: rule__AtTimeExpression__Group__0 : rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1 ;
    public final void rule__AtTimeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4553:1: ( rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4554:2: rule__AtTimeExpression__Group__0__Impl rule__AtTimeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group__0__Impl_in_rule__AtTimeExpression__Group__09151);
            rule__AtTimeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group__1_in_rule__AtTimeExpression__Group__09154);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4561:1: rule__AtTimeExpression__Group__0__Impl : ( ruleAtTimePrimary ) ;
    public final void rule__AtTimeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4565:1: ( ( ruleAtTimePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4566:1: ( ruleAtTimePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4566:1: ( ruleAtTimePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4567:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtTimeExpressionAccess().getAtTimePrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__Group__0__Impl9181);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4578:1: rule__AtTimeExpression__Group__1 : rule__AtTimeExpression__Group__1__Impl ;
    public final void rule__AtTimeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4582:1: ( rule__AtTimeExpression__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4583:2: rule__AtTimeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group__1__Impl_in_rule__AtTimeExpression__Group__19210);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4589:1: rule__AtTimeExpression__Group__1__Impl : ( ( rule__AtTimeExpression__Group_1__0 )* ) ;
    public final void rule__AtTimeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4593:1: ( ( ( rule__AtTimeExpression__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4594:1: ( ( rule__AtTimeExpression__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4594:1: ( ( rule__AtTimeExpression__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4595:1: ( rule__AtTimeExpression__Group_1__0 )*
            {
             before(grammarAccess.getAtTimeExpressionAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4596:1: ( rule__AtTimeExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=30 && LA33_0<=31)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4596:2: rule__AtTimeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__0_in_rule__AtTimeExpression__Group__1__Impl9237);
            	    rule__AtTimeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4610:1: rule__AtTimeExpression__Group_1__0 : rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1 ;
    public final void rule__AtTimeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4614:1: ( rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4615:2: rule__AtTimeExpression__Group_1__0__Impl rule__AtTimeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__0__Impl_in_rule__AtTimeExpression__Group_1__09272);
            rule__AtTimeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__1_in_rule__AtTimeExpression__Group_1__09275);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4622:1: rule__AtTimeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AtTimeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4626:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4627:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4627:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4628:1: ()
            {
             before(grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4629:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4631:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4641:1: rule__AtTimeExpression__Group_1__1 : rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2 ;
    public final void rule__AtTimeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4645:1: ( rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4646:2: rule__AtTimeExpression__Group_1__1__Impl rule__AtTimeExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__1__Impl_in_rule__AtTimeExpression__Group_1__19333);
            rule__AtTimeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__2_in_rule__AtTimeExpression__Group_1__19336);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4653:1: rule__AtTimeExpression__Group_1__1__Impl : ( ( rule__AtTimeExpression__OpAssignment_1_1 ) ) ;
    public final void rule__AtTimeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4657:1: ( ( ( rule__AtTimeExpression__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4658:1: ( ( rule__AtTimeExpression__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4658:1: ( ( rule__AtTimeExpression__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4659:1: ( rule__AtTimeExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4660:1: ( rule__AtTimeExpression__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4660:2: rule__AtTimeExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__OpAssignment_1_1_in_rule__AtTimeExpression__Group_1__1__Impl9363);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4670:1: rule__AtTimeExpression__Group_1__2 : rule__AtTimeExpression__Group_1__2__Impl ;
    public final void rule__AtTimeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4674:1: ( rule__AtTimeExpression__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4675:2: rule__AtTimeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__Group_1__2__Impl_in_rule__AtTimeExpression__Group_1__29393);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4681:1: rule__AtTimeExpression__Group_1__2__Impl : ( ( rule__AtTimeExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AtTimeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4685:1: ( ( ( rule__AtTimeExpression__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4686:1: ( ( rule__AtTimeExpression__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4686:1: ( ( rule__AtTimeExpression__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4687:1: ( rule__AtTimeExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4688:1: ( rule__AtTimeExpression__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4688:2: rule__AtTimeExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__RightAssignment_1_2_in_rule__AtTimeExpression__Group_1__2__Impl9420);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4704:1: rule__AtTimePrimary__Group_0__0 : rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1 ;
    public final void rule__AtTimePrimary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4708:1: ( rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4709:2: rule__AtTimePrimary__Group_0__0__Impl rule__AtTimePrimary__Group_0__1
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__0__Impl_in_rule__AtTimePrimary__Group_0__09456);
            rule__AtTimePrimary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__1_in_rule__AtTimePrimary__Group_0__09459);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4716:1: rule__AtTimePrimary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__AtTimePrimary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4720:1: ( ( '(' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4721:1: ( '(' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4721:1: ( '(' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4722:1: '('
            {
             before(grammarAccess.getAtTimePrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__AtTimePrimary__Group_0__0__Impl9487); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4735:1: rule__AtTimePrimary__Group_0__1 : rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2 ;
    public final void rule__AtTimePrimary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4739:1: ( rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4740:2: rule__AtTimePrimary__Group_0__1__Impl rule__AtTimePrimary__Group_0__2
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__1__Impl_in_rule__AtTimePrimary__Group_0__19518);
            rule__AtTimePrimary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__2_in_rule__AtTimePrimary__Group_0__19521);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4747:1: rule__AtTimePrimary__Group_0__1__Impl : ( ruleAtTimeExpression ) ;
    public final void rule__AtTimePrimary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4751:1: ( ( ruleAtTimeExpression ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4752:1: ( ruleAtTimeExpression )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4752:1: ( ruleAtTimeExpression )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4753:1: ruleAtTimeExpression
            {
             before(grammarAccess.getAtTimePrimaryAccess().getAtTimeExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleAtTimeExpression_in_rule__AtTimePrimary__Group_0__1__Impl9548);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4764:1: rule__AtTimePrimary__Group_0__2 : rule__AtTimePrimary__Group_0__2__Impl ;
    public final void rule__AtTimePrimary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4768:1: ( rule__AtTimePrimary__Group_0__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4769:2: rule__AtTimePrimary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__AtTimePrimary__Group_0__2__Impl_in_rule__AtTimePrimary__Group_0__29577);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4775:1: rule__AtTimePrimary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__AtTimePrimary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4779:1: ( ( ')' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4780:1: ( ')' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4780:1: ( ')' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4781:1: ')'
            {
             before(grammarAccess.getAtTimePrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,35,FOLLOW_35_in_rule__AtTimePrimary__Group_0__2__Impl9605); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4800:1: rule__AtTimeAtomic__Group_0__0 : rule__AtTimeAtomic__Group_0__0__Impl rule__AtTimeAtomic__Group_0__1 ;
    public final void rule__AtTimeAtomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4804:1: ( rule__AtTimeAtomic__Group_0__0__Impl rule__AtTimeAtomic__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4805:2: rule__AtTimeAtomic__Group_0__0__Impl rule__AtTimeAtomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__0__Impl_in_rule__AtTimeAtomic__Group_0__09642);
            rule__AtTimeAtomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__1_in_rule__AtTimeAtomic__Group_0__09645);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4812:1: rule__AtTimeAtomic__Group_0__0__Impl : ( () ) ;
    public final void rule__AtTimeAtomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4816:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4817:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4817:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4818:1: ()
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeIntConstantAction_0_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4819:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4821:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4831:1: rule__AtTimeAtomic__Group_0__1 : rule__AtTimeAtomic__Group_0__1__Impl ;
    public final void rule__AtTimeAtomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4835:1: ( rule__AtTimeAtomic__Group_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4836:2: rule__AtTimeAtomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_0__1__Impl_in_rule__AtTimeAtomic__Group_0__19703);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4842:1: rule__AtTimeAtomic__Group_0__1__Impl : ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) ) ;
    public final void rule__AtTimeAtomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4846:1: ( ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4847:1: ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4847:1: ( ( rule__AtTimeAtomic__ValueAssignment_0_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4848:1: ( rule__AtTimeAtomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getValueAssignment_0_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4849:1: ( rule__AtTimeAtomic__ValueAssignment_0_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4849:2: rule__AtTimeAtomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__ValueAssignment_0_1_in_rule__AtTimeAtomic__Group_0__1__Impl9730);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4863:1: rule__AtTimeAtomic__Group_1__0 : rule__AtTimeAtomic__Group_1__0__Impl rule__AtTimeAtomic__Group_1__1 ;
    public final void rule__AtTimeAtomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4867:1: ( rule__AtTimeAtomic__Group_1__0__Impl rule__AtTimeAtomic__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4868:2: rule__AtTimeAtomic__Group_1__0__Impl rule__AtTimeAtomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__0__Impl_in_rule__AtTimeAtomic__Group_1__09764);
            rule__AtTimeAtomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__1_in_rule__AtTimeAtomic__Group_1__09767);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4875:1: rule__AtTimeAtomic__Group_1__0__Impl : ( () ) ;
    public final void rule__AtTimeAtomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4879:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4880:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4880:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4881:1: ()
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeCurrentTimeAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4882:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4884:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4894:1: rule__AtTimeAtomic__Group_1__1 : rule__AtTimeAtomic__Group_1__1__Impl ;
    public final void rule__AtTimeAtomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4898:1: ( rule__AtTimeAtomic__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4899:2: rule__AtTimeAtomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__Group_1__1__Impl_in_rule__AtTimeAtomic__Group_1__19825);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4905:1: rule__AtTimeAtomic__Group_1__1__Impl : ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) ) ;
    public final void rule__AtTimeAtomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4909:1: ( ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4910:1: ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4910:1: ( ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4911:1: ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4912:1: ( rule__AtTimeAtomic__AtTimeValueAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4912:2: rule__AtTimeAtomic__AtTimeValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AtTimeAtomic__AtTimeValueAssignment_1_1_in_rule__AtTimeAtomic__Group_1__1__Impl9852);
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


    // $ANTLR start "rule__InTimeExpression__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4926:1: rule__InTimeExpression__Group__0 : rule__InTimeExpression__Group__0__Impl rule__InTimeExpression__Group__1 ;
    public final void rule__InTimeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4930:1: ( rule__InTimeExpression__Group__0__Impl rule__InTimeExpression__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4931:2: rule__InTimeExpression__Group__0__Impl rule__InTimeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group__0__Impl_in_rule__InTimeExpression__Group__09886);
            rule__InTimeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeExpression__Group__1_in_rule__InTimeExpression__Group__09889);
            rule__InTimeExpression__Group__1();

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
    // $ANTLR end "rule__InTimeExpression__Group__0"


    // $ANTLR start "rule__InTimeExpression__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4938:1: rule__InTimeExpression__Group__0__Impl : ( ruleInTimePrimary ) ;
    public final void rule__InTimeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4942:1: ( ( ruleInTimePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4943:1: ( ruleInTimePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4943:1: ( ruleInTimePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4944:1: ruleInTimePrimary
            {
             before(grammarAccess.getInTimeExpressionAccess().getInTimePrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleInTimePrimary_in_rule__InTimeExpression__Group__0__Impl9916);
            ruleInTimePrimary();

            state._fsp--;

             after(grammarAccess.getInTimeExpressionAccess().getInTimePrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group__0__Impl"


    // $ANTLR start "rule__InTimeExpression__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4955:1: rule__InTimeExpression__Group__1 : rule__InTimeExpression__Group__1__Impl ;
    public final void rule__InTimeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4959:1: ( rule__InTimeExpression__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4960:2: rule__InTimeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group__1__Impl_in_rule__InTimeExpression__Group__19945);
            rule__InTimeExpression__Group__1__Impl();

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
    // $ANTLR end "rule__InTimeExpression__Group__1"


    // $ANTLR start "rule__InTimeExpression__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4966:1: rule__InTimeExpression__Group__1__Impl : ( ( rule__InTimeExpression__Group_1__0 )* ) ;
    public final void rule__InTimeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4970:1: ( ( ( rule__InTimeExpression__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4971:1: ( ( rule__InTimeExpression__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4971:1: ( ( rule__InTimeExpression__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4972:1: ( rule__InTimeExpression__Group_1__0 )*
            {
             before(grammarAccess.getInTimeExpressionAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4973:1: ( rule__InTimeExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=30 && LA34_0<=31)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4973:2: rule__InTimeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__InTimeExpression__Group_1__0_in_rule__InTimeExpression__Group__1__Impl9972);
            	    rule__InTimeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getInTimeExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group__1__Impl"


    // $ANTLR start "rule__InTimeExpression__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4987:1: rule__InTimeExpression__Group_1__0 : rule__InTimeExpression__Group_1__0__Impl rule__InTimeExpression__Group_1__1 ;
    public final void rule__InTimeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4991:1: ( rule__InTimeExpression__Group_1__0__Impl rule__InTimeExpression__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4992:2: rule__InTimeExpression__Group_1__0__Impl rule__InTimeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__0__Impl_in_rule__InTimeExpression__Group_1__010007);
            rule__InTimeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__1_in_rule__InTimeExpression__Group_1__010010);
            rule__InTimeExpression__Group_1__1();

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
    // $ANTLR end "rule__InTimeExpression__Group_1__0"


    // $ANTLR start "rule__InTimeExpression__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4999:1: rule__InTimeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__InTimeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5003:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5004:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5004:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5005:1: ()
            {
             before(grammarAccess.getInTimeExpressionAccess().getInTimePlusOrMinLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5006:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5008:1: 
            {
            }

             after(grammarAccess.getInTimeExpressionAccess().getInTimePlusOrMinLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__InTimeExpression__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5018:1: rule__InTimeExpression__Group_1__1 : rule__InTimeExpression__Group_1__1__Impl rule__InTimeExpression__Group_1__2 ;
    public final void rule__InTimeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5022:1: ( rule__InTimeExpression__Group_1__1__Impl rule__InTimeExpression__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5023:2: rule__InTimeExpression__Group_1__1__Impl rule__InTimeExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__1__Impl_in_rule__InTimeExpression__Group_1__110068);
            rule__InTimeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__2_in_rule__InTimeExpression__Group_1__110071);
            rule__InTimeExpression__Group_1__2();

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
    // $ANTLR end "rule__InTimeExpression__Group_1__1"


    // $ANTLR start "rule__InTimeExpression__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5030:1: rule__InTimeExpression__Group_1__1__Impl : ( ( rule__InTimeExpression__OpAssignment_1_1 ) ) ;
    public final void rule__InTimeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5034:1: ( ( ( rule__InTimeExpression__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5035:1: ( ( rule__InTimeExpression__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5035:1: ( ( rule__InTimeExpression__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5036:1: ( rule__InTimeExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getInTimeExpressionAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5037:1: ( rule__InTimeExpression__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5037:2: rule__InTimeExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__InTimeExpression__OpAssignment_1_1_in_rule__InTimeExpression__Group_1__1__Impl10098);
            rule__InTimeExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInTimeExpressionAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__InTimeExpression__Group_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5047:1: rule__InTimeExpression__Group_1__2 : rule__InTimeExpression__Group_1__2__Impl ;
    public final void rule__InTimeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5051:1: ( rule__InTimeExpression__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5052:2: rule__InTimeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__InTimeExpression__Group_1__2__Impl_in_rule__InTimeExpression__Group_1__210128);
            rule__InTimeExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__InTimeExpression__Group_1__2"


    // $ANTLR start "rule__InTimeExpression__Group_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5058:1: rule__InTimeExpression__Group_1__2__Impl : ( ( rule__InTimeExpression__RightAssignment_1_2 ) ) ;
    public final void rule__InTimeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5062:1: ( ( ( rule__InTimeExpression__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5063:1: ( ( rule__InTimeExpression__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5063:1: ( ( rule__InTimeExpression__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5064:1: ( rule__InTimeExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getInTimeExpressionAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5065:1: ( rule__InTimeExpression__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5065:2: rule__InTimeExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__InTimeExpression__RightAssignment_1_2_in_rule__InTimeExpression__Group_1__2__Impl10155);
            rule__InTimeExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getInTimeExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__InTimePrimary__Group_0__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5081:1: rule__InTimePrimary__Group_0__0 : rule__InTimePrimary__Group_0__0__Impl rule__InTimePrimary__Group_0__1 ;
    public final void rule__InTimePrimary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5085:1: ( rule__InTimePrimary__Group_0__0__Impl rule__InTimePrimary__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5086:2: rule__InTimePrimary__Group_0__0__Impl rule__InTimePrimary__Group_0__1
            {
            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__0__Impl_in_rule__InTimePrimary__Group_0__010191);
            rule__InTimePrimary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__1_in_rule__InTimePrimary__Group_0__010194);
            rule__InTimePrimary__Group_0__1();

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
    // $ANTLR end "rule__InTimePrimary__Group_0__0"


    // $ANTLR start "rule__InTimePrimary__Group_0__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5093:1: rule__InTimePrimary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__InTimePrimary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5097:1: ( ( '(' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5098:1: ( '(' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5098:1: ( '(' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5099:1: '('
            {
             before(grammarAccess.getInTimePrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__InTimePrimary__Group_0__0__Impl10222); 
             after(grammarAccess.getInTimePrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimePrimary__Group_0__0__Impl"


    // $ANTLR start "rule__InTimePrimary__Group_0__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5112:1: rule__InTimePrimary__Group_0__1 : rule__InTimePrimary__Group_0__1__Impl rule__InTimePrimary__Group_0__2 ;
    public final void rule__InTimePrimary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5116:1: ( rule__InTimePrimary__Group_0__1__Impl rule__InTimePrimary__Group_0__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5117:2: rule__InTimePrimary__Group_0__1__Impl rule__InTimePrimary__Group_0__2
            {
            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__1__Impl_in_rule__InTimePrimary__Group_0__110253);
            rule__InTimePrimary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__2_in_rule__InTimePrimary__Group_0__110256);
            rule__InTimePrimary__Group_0__2();

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
    // $ANTLR end "rule__InTimePrimary__Group_0__1"


    // $ANTLR start "rule__InTimePrimary__Group_0__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5124:1: rule__InTimePrimary__Group_0__1__Impl : ( ruleInExpr ) ;
    public final void rule__InTimePrimary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5128:1: ( ( ruleInExpr ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5129:1: ( ruleInExpr )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5129:1: ( ruleInExpr )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5130:1: ruleInExpr
            {
             before(grammarAccess.getInTimePrimaryAccess().getInExprParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleInExpr_in_rule__InTimePrimary__Group_0__1__Impl10283);
            ruleInExpr();

            state._fsp--;

             after(grammarAccess.getInTimePrimaryAccess().getInExprParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimePrimary__Group_0__1__Impl"


    // $ANTLR start "rule__InTimePrimary__Group_0__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5141:1: rule__InTimePrimary__Group_0__2 : rule__InTimePrimary__Group_0__2__Impl ;
    public final void rule__InTimePrimary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5145:1: ( rule__InTimePrimary__Group_0__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5146:2: rule__InTimePrimary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__InTimePrimary__Group_0__2__Impl_in_rule__InTimePrimary__Group_0__210312);
            rule__InTimePrimary__Group_0__2__Impl();

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
    // $ANTLR end "rule__InTimePrimary__Group_0__2"


    // $ANTLR start "rule__InTimePrimary__Group_0__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5152:1: rule__InTimePrimary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__InTimePrimary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5156:1: ( ( ')' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5157:1: ( ')' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5157:1: ( ')' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5158:1: ')'
            {
             before(grammarAccess.getInTimePrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,35,FOLLOW_35_in_rule__InTimePrimary__Group_0__2__Impl10340); 
             after(grammarAccess.getInTimePrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimePrimary__Group_0__2__Impl"


    // $ANTLR start "rule__InTimeAtomic__Group_0__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5177:1: rule__InTimeAtomic__Group_0__0 : rule__InTimeAtomic__Group_0__0__Impl rule__InTimeAtomic__Group_0__1 ;
    public final void rule__InTimeAtomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5181:1: ( rule__InTimeAtomic__Group_0__0__Impl rule__InTimeAtomic__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5182:2: rule__InTimeAtomic__Group_0__0__Impl rule__InTimeAtomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__Group_0__0__Impl_in_rule__InTimeAtomic__Group_0__010377);
            rule__InTimeAtomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeAtomic__Group_0__1_in_rule__InTimeAtomic__Group_0__010380);
            rule__InTimeAtomic__Group_0__1();

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
    // $ANTLR end "rule__InTimeAtomic__Group_0__0"


    // $ANTLR start "rule__InTimeAtomic__Group_0__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5189:1: rule__InTimeAtomic__Group_0__0__Impl : ( () ) ;
    public final void rule__InTimeAtomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5193:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5194:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5194:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5195:1: ()
            {
             before(grammarAccess.getInTimeAtomicAccess().getInTimeIntConstantAction_0_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5196:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5198:1: 
            {
            }

             after(grammarAccess.getInTimeAtomicAccess().getInTimeIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__Group_0__0__Impl"


    // $ANTLR start "rule__InTimeAtomic__Group_0__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5208:1: rule__InTimeAtomic__Group_0__1 : rule__InTimeAtomic__Group_0__1__Impl ;
    public final void rule__InTimeAtomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5212:1: ( rule__InTimeAtomic__Group_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5213:2: rule__InTimeAtomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__Group_0__1__Impl_in_rule__InTimeAtomic__Group_0__110438);
            rule__InTimeAtomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__InTimeAtomic__Group_0__1"


    // $ANTLR start "rule__InTimeAtomic__Group_0__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5219:1: rule__InTimeAtomic__Group_0__1__Impl : ( ( rule__InTimeAtomic__ValueAssignment_0_1 ) ) ;
    public final void rule__InTimeAtomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5223:1: ( ( ( rule__InTimeAtomic__ValueAssignment_0_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5224:1: ( ( rule__InTimeAtomic__ValueAssignment_0_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5224:1: ( ( rule__InTimeAtomic__ValueAssignment_0_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5225:1: ( rule__InTimeAtomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getInTimeAtomicAccess().getValueAssignment_0_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5226:1: ( rule__InTimeAtomic__ValueAssignment_0_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5226:2: rule__InTimeAtomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__ValueAssignment_0_1_in_rule__InTimeAtomic__Group_0__1__Impl10465);
            rule__InTimeAtomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInTimeAtomicAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__Group_0__1__Impl"


    // $ANTLR start "rule__InTimeAtomic__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5240:1: rule__InTimeAtomic__Group_1__0 : rule__InTimeAtomic__Group_1__0__Impl rule__InTimeAtomic__Group_1__1 ;
    public final void rule__InTimeAtomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5244:1: ( rule__InTimeAtomic__Group_1__0__Impl rule__InTimeAtomic__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5245:2: rule__InTimeAtomic__Group_1__0__Impl rule__InTimeAtomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__Group_1__0__Impl_in_rule__InTimeAtomic__Group_1__010499);
            rule__InTimeAtomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InTimeAtomic__Group_1__1_in_rule__InTimeAtomic__Group_1__010502);
            rule__InTimeAtomic__Group_1__1();

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
    // $ANTLR end "rule__InTimeAtomic__Group_1__0"


    // $ANTLR start "rule__InTimeAtomic__Group_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5252:1: rule__InTimeAtomic__Group_1__0__Impl : ( () ) ;
    public final void rule__InTimeAtomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5256:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5257:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5257:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5258:1: ()
            {
             before(grammarAccess.getInTimeAtomicAccess().getInTimeCurrentTimeAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5259:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5261:1: 
            {
            }

             after(grammarAccess.getInTimeAtomicAccess().getInTimeCurrentTimeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__Group_1__0__Impl"


    // $ANTLR start "rule__InTimeAtomic__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5271:1: rule__InTimeAtomic__Group_1__1 : rule__InTimeAtomic__Group_1__1__Impl ;
    public final void rule__InTimeAtomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5275:1: ( rule__InTimeAtomic__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5276:2: rule__InTimeAtomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__Group_1__1__Impl_in_rule__InTimeAtomic__Group_1__110560);
            rule__InTimeAtomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__InTimeAtomic__Group_1__1"


    // $ANTLR start "rule__InTimeAtomic__Group_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5282:1: rule__InTimeAtomic__Group_1__1__Impl : ( ( rule__InTimeAtomic__InTimeValueAssignment_1_1 ) ) ;
    public final void rule__InTimeAtomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5286:1: ( ( ( rule__InTimeAtomic__InTimeValueAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5287:1: ( ( rule__InTimeAtomic__InTimeValueAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5287:1: ( ( rule__InTimeAtomic__InTimeValueAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5288:1: ( rule__InTimeAtomic__InTimeValueAssignment_1_1 )
            {
             before(grammarAccess.getInTimeAtomicAccess().getInTimeValueAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5289:1: ( rule__InTimeAtomic__InTimeValueAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5289:2: rule__InTimeAtomic__InTimeValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__InTimeAtomic__InTimeValueAssignment_1_1_in_rule__InTimeAtomic__Group_1__1__Impl10587);
            rule__InTimeAtomic__InTimeValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInTimeAtomicAccess().getInTimeValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__Group_1__1__Impl"


    // $ANTLR start "rule__EceModel__StatementsAssignment"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5304:1: rule__EceModel__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__EceModel__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5308:1: ( ( ruleStatement ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5309:1: ( ruleStatement )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5309:1: ( ruleStatement )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5310:1: ruleStatement
            {
             before(grammarAccess.getEceModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__EceModel__StatementsAssignment10626);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5319:1: rule__Statement__EventAssignment_1 : ( ruleEvent ) ;
    public final void rule__Statement__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5323:1: ( ( ruleEvent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5324:1: ( ruleEvent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5324:1: ( ruleEvent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5325:1: ruleEvent
            {
             before(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_110657);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5334:1: rule__Statement__ContextsListAssignment_2 : ( ruleContextsList ) ;
    public final void rule__Statement__ContextsListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5338:1: ( ( ruleContextsList ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5339:1: ( ruleContextsList )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5339:1: ( ruleContextsList )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5340:1: ruleContextsList
            {
             before(grammarAccess.getStatementAccess().getContextsListContextsListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleContextsList_in_rule__Statement__ContextsListAssignment_210688);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5349:1: rule__Event__EventNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5353:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5354:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5354:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5355:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_010719); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5364:1: rule__Event__ParamsAssignment_1_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5368:1: ( ( ruleEventFeature ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5369:1: ( ruleEventFeature )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5369:1: ( ruleEventFeature )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5370:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamsEventFeatureParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_110750);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5379:1: rule__Event__ParamsAssignment_1_2_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5383:1: ( ( ruleEventFeature ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5384:1: ( ruleEventFeature )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5384:1: ( ruleEventFeature )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5385:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamsEventFeatureParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_2_110781);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5394:1: rule__EventFeature__NameAssignment : ( RULE_ID ) ;
    public final void rule__EventFeature__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5398:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5399:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5399:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5400:1: RULE_ID
            {
             before(grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment10812); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5409:1: rule__ContextsList__EcContextsListAssignment_0 : ( ruleEcContextsList ) ;
    public final void rule__ContextsList__EcContextsListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5413:1: ( ( ruleEcContextsList ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5414:1: ( ruleEcContextsList )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5414:1: ( ruleEcContextsList )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5415:1: ruleEcContextsList
            {
             before(grammarAccess.getContextsListAccess().getEcContextsListEcContextsListParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEcContextsList_in_rule__ContextsList__EcContextsListAssignment_010843);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5424:1: rule__ContextsList__ExpContextsListAssignment_1_1 : ( ruleExpContextsList ) ;
    public final void rule__ContextsList__ExpContextsListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5428:1: ( ( ruleExpContextsList ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5429:1: ( ruleExpContextsList )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5429:1: ( ruleExpContextsList )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5430:1: ruleExpContextsList
            {
             before(grammarAccess.getContextsListAccess().getExpContextsListExpContextsListParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpContextsList_in_rule__ContextsList__ExpContextsListAssignment_1_110874);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5439:1: rule__EcContextsList__EcContextsAssignment_0 : ( ruleEcContext ) ;
    public final void rule__EcContextsList__EcContextsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5443:1: ( ( ruleEcContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5444:1: ( ruleEcContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5444:1: ( ruleEcContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5445:1: ruleEcContext
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_010905);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5454:1: rule__EcContextsList__EcContextsAssignment_1_1 : ( ruleEcContext ) ;
    public final void rule__EcContextsList__EcContextsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5458:1: ( ( ruleEcContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5459:1: ( ruleEcContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5459:1: ( ruleEcContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5460:1: ruleEcContext
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_1_110936);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5469:1: rule__ExpContextsList__ExpContextsAssignment_0 : ( ruleExpContext ) ;
    public final void rule__ExpContextsList__ExpContextsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5473:1: ( ( ruleExpContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5474:1: ( ruleExpContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5474:1: ( ruleExpContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5475:1: ruleExpContext
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_010967);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5484:1: rule__ExpContextsList__ExpContextsAssignment_1_1 : ( ruleExpContext ) ;
    public final void rule__ExpContextsList__ExpContextsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5488:1: ( ( ruleExpContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5489:1: ( ruleExpContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5489:1: ( ruleExpContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5490:1: ruleExpContext
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_1_110998);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5499:1: rule__EcContext__FluentAssignment_1 : ( ruleFluent ) ;
    public final void rule__EcContext__FluentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5503:1: ( ( ruleFluent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5504:1: ( ruleFluent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5504:1: ( ruleFluent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5505:1: ruleFluent
            {
             before(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_111029);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5514:1: rule__EcContext__FluentAssignment_2_1 : ( ruleFluent ) ;
    public final void rule__EcContext__FluentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5518:1: ( ( ruleFluent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5519:1: ( ruleFluent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5519:1: ( ruleFluent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5520:1: ruleFluent
            {
             before(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_2_111060);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5529:1: rule__ExpContext__FinalConditionAssignment_1 : ( ruleConditionRule ) ;
    public final void rule__ExpContext__FinalConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5533:1: ( ( ruleConditionRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5534:1: ( ruleConditionRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5534:1: ( ruleConditionRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5535:1: ruleConditionRule
            {
             before(grammarAccess.getExpContextAccess().getFinalConditionConditionRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__ExpContext__FinalConditionAssignment_111091);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5544:1: rule__ExpContext__AllenOpAssignment_2_0 : ( ruleAllenOp ) ;
    public final void rule__ExpContext__AllenOpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5548:1: ( ( ruleAllenOp ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5549:1: ( ruleAllenOp )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5549:1: ( ruleAllenOp )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5550:1: ruleAllenOp
            {
             before(grammarAccess.getExpContextAccess().getAllenOpAllenOpParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleAllenOp_in_rule__ExpContext__AllenOpAssignment_2_011122);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5559:1: rule__ExpContext__TimeAssignment_2_1 : ( ruleAtTimePrimary ) ;
    public final void rule__ExpContext__TimeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5563:1: ( ( ruleAtTimePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5564:1: ( ruleAtTimePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5564:1: ( ruleAtTimePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5565:1: ruleAtTimePrimary
            {
             before(grammarAccess.getExpContextAccess().getTimeAtTimePrimaryParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__ExpContext__TimeAssignment_2_111153);
            ruleAtTimePrimary();

            state._fsp--;

             after(grammarAccess.getExpContextAccess().getTimeAtTimePrimaryParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5574:1: rule__ExpContext__InitialConditionAssignment_3_1 : ( ruleConditionRule ) ;
    public final void rule__ExpContext__InitialConditionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5578:1: ( ( ruleConditionRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5579:1: ( ruleConditionRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5579:1: ( ruleConditionRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5580:1: ruleConditionRule
            {
             before(grammarAccess.getExpContextAccess().getInitialConditionConditionRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__ExpContext__InitialConditionAssignment_3_111184);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5589:1: rule__AllenOp__ValueAssignment_1 : ( ( rule__AllenOp__ValueAlternatives_1_0 ) ) ;
    public final void rule__AllenOp__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5593:1: ( ( ( rule__AllenOp__ValueAlternatives_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5594:1: ( ( rule__AllenOp__ValueAlternatives_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5594:1: ( ( rule__AllenOp__ValueAlternatives_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5595:1: ( rule__AllenOp__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getAllenOpAccess().getValueAlternatives_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5596:1: ( rule__AllenOp__ValueAlternatives_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5596:2: rule__AllenOp__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AllenOp__ValueAlternatives_1_0_in_rule__AllenOp__ValueAssignment_111215);
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


    // $ANTLR start "rule__Fluent__FluentNameAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5605:1: rule__Fluent__FluentNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Fluent__FluentNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5609:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5610:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5610:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5611:1: RULE_ID
            {
             before(grammarAccess.getFluentAccess().getFluentNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fluent__FluentNameAssignment_011248); 
             after(grammarAccess.getFluentAccess().getFluentNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fluent__FluentNameAssignment_0"


    // $ANTLR start "rule__Fluent__ValuePartAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5620:1: rule__Fluent__ValuePartAssignment_1_1 : ( ruleToRule ) ;
    public final void rule__Fluent__ValuePartAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5624:1: ( ( ruleToRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5625:1: ( ruleToRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5625:1: ( ruleToRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5626:1: ruleToRule
            {
             before(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_1_111279);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5635:1: rule__Fluent__TimePartAssignment_2_1 : ( ruleInRule ) ;
    public final void rule__Fluent__TimePartAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5639:1: ( ( ruleInRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5640:1: ( ruleInRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5640:1: ( ruleInRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5641:1: ruleInRule
            {
             before(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_2_111310);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5650:1: rule__Fluent__CondPartAssignment_3_1 : ( ruleConditionRule ) ;
    public final void rule__Fluent__CondPartAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5654:1: ( ( ruleConditionRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5655:1: ( ruleConditionRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5655:1: ( ruleConditionRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5656:1: ruleConditionRule
            {
             before(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_111341);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5665:1: rule__ConditionRule__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ConditionRule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5669:1: ( ( ruleExpression ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5670:1: ( ruleExpression )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5670:1: ( ruleExpression )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5671:1: ruleExpression
            {
             before(grammarAccess.getConditionRuleAccess().getConditionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_111372);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5680:1: rule__ToRule__ExpressionAssignment_1 : ( rulePlusOrMinus ) ;
    public final void rule__ToRule__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5684:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5685:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5685:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5686:1: rulePlusOrMinus
            {
             before(grammarAccess.getToRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_111403);
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


    // $ANTLR start "rule__InRule__TimeAssignment"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5695:1: rule__InRule__TimeAssignment : ( RULE_INT ) ;
    public final void rule__InRule__TimeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5699:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5700:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5700:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5701:1: RULE_INT
            {
             before(grammarAccess.getInRuleAccess().getTimeINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InRule__TimeAssignment11434); 
             after(grammarAccess.getInRuleAccess().getTimeINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRule__TimeAssignment"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5710:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5714:1: ( ( ruleAnd ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5715:1: ( ruleAnd )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5715:1: ( ruleAnd )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5716:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_211465);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5725:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5729:1: ( ( ruleEquality ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5730:1: ( ruleEquality )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5730:1: ( ruleEquality )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5731:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_211496);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5740:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5744:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5745:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5745:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5746:1: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5747:1: ( rule__Equality__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5747:2: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_111527);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5756:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5760:1: ( ( ruleComparison ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5761:1: ( ruleComparison )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5761:1: ( ruleComparison )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5762:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_211560);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5771:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5775:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5776:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5776:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5777:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5778:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5778:2: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_111591);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5787:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5791:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5792:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5792:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5793:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_211624);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5802:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5806:1: ( ( ruleMulOrDiv ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5807:1: ( ruleMulOrDiv )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5807:1: ( ruleMulOrDiv )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5808:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_111655);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5817:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5821:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5822:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5822:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5823:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5824:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5824:2: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_111686);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5833:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5837:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5838:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5838:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5839:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_211719);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5848:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5852:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5853:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5853:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5854:1: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_211750);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5863:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_FLOAT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5867:1: ( ( RULE_FLOAT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5868:1: ( RULE_FLOAT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5868:1: ( RULE_FLOAT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5869:1: RULE_FLOAT
            {
             before(grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_0_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_111781); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5878:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5882:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5883:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5883:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5884:1: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_111812); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5893:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5897:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5898:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5898:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5899:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5900:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5900:2: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_111843);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5909:1: rule__Atomic__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5913:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5914:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5914:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5915:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getRefReferenceTypeCrossReference_3_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5916:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5917:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getRefReferenceTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_3_111880); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5928:1: rule__Atomic__FluentValueSampleAssignment_3_2_1 : ( ruleAtTimePrimary ) ;
    public final void rule__Atomic__FluentValueSampleAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5932:1: ( ( ruleAtTimePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5933:1: ( ruleAtTimePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5933:1: ( ruleAtTimePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5934:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtomicAccess().getFluentValueSampleAtTimePrimaryParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__Atomic__FluentValueSampleAssignment_3_2_111915);
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


    // $ANTLR start "rule__AtTimeExpression__OpAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5943:1: rule__AtTimeExpression__OpAssignment_1_1 : ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__AtTimeExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5947:1: ( ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5948:1: ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5948:1: ( ( rule__AtTimeExpression__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5949:1: ( rule__AtTimeExpression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getAtTimeExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5950:1: ( rule__AtTimeExpression__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5950:2: rule__AtTimeExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__AtTimeExpression__OpAlternatives_1_1_0_in_rule__AtTimeExpression__OpAssignment_1_111946);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5959:1: rule__AtTimeExpression__RightAssignment_1_2 : ( ruleAtTimePrimary ) ;
    public final void rule__AtTimeExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5963:1: ( ( ruleAtTimePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5964:1: ( ruleAtTimePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5964:1: ( ruleAtTimePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5965:1: ruleAtTimePrimary
            {
             before(grammarAccess.getAtTimeExpressionAccess().getRightAtTimePrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__RightAssignment_1_211979);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5974:1: rule__AtTimeAtomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__AtTimeAtomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5978:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5979:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5979:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5980:1: RULE_INT
            {
             before(grammarAccess.getAtTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AtTimeAtomic__ValueAssignment_0_112010); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5989:1: rule__AtTimeAtomic__AtTimeValueAssignment_1_1 : ( ( 'now' ) ) ;
    public final void rule__AtTimeAtomic__AtTimeValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5993:1: ( ( ( 'now' ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5994:1: ( ( 'now' ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5994:1: ( ( 'now' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5995:1: ( 'now' )
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5996:1: ( 'now' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:5997:1: 'now'
            {
             before(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0()); 
            match(input,46,FOLLOW_46_in_rule__AtTimeAtomic__AtTimeValueAssignment_1_112046); 
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


    // $ANTLR start "rule__InTimeExpression__OpAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6012:1: rule__InTimeExpression__OpAssignment_1_1 : ( ( rule__InTimeExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__InTimeExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6016:1: ( ( ( rule__InTimeExpression__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6017:1: ( ( rule__InTimeExpression__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6017:1: ( ( rule__InTimeExpression__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6018:1: ( rule__InTimeExpression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getInTimeExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6019:1: ( rule__InTimeExpression__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6019:2: rule__InTimeExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__InTimeExpression__OpAlternatives_1_1_0_in_rule__InTimeExpression__OpAssignment_1_112085);
            rule__InTimeExpression__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInTimeExpressionAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__OpAssignment_1_1"


    // $ANTLR start "rule__InTimeExpression__RightAssignment_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6028:1: rule__InTimeExpression__RightAssignment_1_2 : ( ruleInTimePrimary ) ;
    public final void rule__InTimeExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6032:1: ( ( ruleInTimePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6033:1: ( ruleInTimePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6033:1: ( ruleInTimePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6034:1: ruleInTimePrimary
            {
             before(grammarAccess.getInTimeExpressionAccess().getRightInTimePrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleInTimePrimary_in_rule__InTimeExpression__RightAssignment_1_212118);
            ruleInTimePrimary();

            state._fsp--;

             after(grammarAccess.getInTimeExpressionAccess().getRightInTimePrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeExpression__RightAssignment_1_2"


    // $ANTLR start "rule__InTimeAtomic__ValueAssignment_0_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6043:1: rule__InTimeAtomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__InTimeAtomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6047:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6048:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6048:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6049:1: RULE_INT
            {
             before(grammarAccess.getInTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InTimeAtomic__ValueAssignment_0_112149); 
             after(grammarAccess.getInTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__ValueAssignment_0_1"


    // $ANTLR start "rule__InTimeAtomic__InTimeValueAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6058:1: rule__InTimeAtomic__InTimeValueAssignment_1_1 : ( ( 'now' ) ) ;
    public final void rule__InTimeAtomic__InTimeValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6062:1: ( ( ( 'now' ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6063:1: ( ( 'now' ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6063:1: ( ( 'now' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6064:1: ( 'now' )
            {
             before(grammarAccess.getInTimeAtomicAccess().getInTimeValueNowKeyword_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6065:1: ( 'now' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:6066:1: 'now'
            {
             before(grammarAccess.getInTimeAtomicAccess().getInTimeValueNowKeyword_1_1_0()); 
            match(input,46,FOLLOW_46_in_rule__InTimeAtomic__InTimeValueAssignment_1_112185); 
             after(grammarAccess.getInTimeAtomicAccess().getInTimeValueNowKeyword_1_1_0()); 

            }

             after(grammarAccess.getInTimeAtomicAccess().getInTimeValueNowKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTimeAtomic__InTimeValueAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleEceModel_in_entryRuleEceModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEceModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EceModel__StatementsAssignment_in_ruleEceModel94 = new BitSet(new long[]{0x0000000100000002L});
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
    public static final BitSet FOLLOW_rule__InRule__TimeAssignment_in_ruleInRule875 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleInExpr_in_entryRuleInExpr1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpr1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeExpression_in_ruleInExpr1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeExpression_in_entryRuleInTimeExpression1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInTimeExpression1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group__0_in_ruleInTimeExpression1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimePrimary_in_entryRuleInTimePrimary1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInTimePrimary1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Alternatives_in_ruleInTimePrimary1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeAtomic_in_entryRuleInTimeAtomic1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInTimeAtomic1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Alternatives_in_ruleInTimeAtomic1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AllenOp__ValueAlternatives_1_01872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AllenOp__ValueAlternatives_1_01892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AllenOp__ValueAlternatives_1_01912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AllenOp__ValueAlternatives_1_01932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AllenOp__ValueAlternatives_1_01952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AllenOp__ValueAlternatives_1_01972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Equality__OpAlternatives_1_1_02007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Equality__OpAlternatives_1_1_02027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Comparison__OpAlternatives_1_1_02062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Comparison__OpAlternatives_1_1_02082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Comparison__OpAlternatives_1_1_02102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Comparison__OpAlternatives_1_1_02122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_02156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_02174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MulOrDiv__OpAlternatives_1_1_02208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MulOrDiv__OpAlternatives_1_1_02228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MulOrDiv__OpAlternatives_1_1_02248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MulOrDiv__OpAlternatives_1_1_02268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Primary__Alternatives2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Atomic__ValueAlternatives_2_1_02458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Atomic__ValueAlternatives_2_1_02478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AtTimeExpression__OpAlternatives_1_1_02514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AtTimeExpression__OpAlternatives_1_1_02534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__0_in_rule__AtTimePrimary__Alternatives2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeAtomic_in_rule__AtTimePrimary__Alternatives2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__0_in_rule__AtTimeAtomic__Alternatives2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__0_in_rule__AtTimeAtomic__Alternatives2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InTimeExpression__OpAlternatives_1_1_02670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InTimeExpression__OpAlternatives_1_1_02690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__0_in_rule__InTimePrimary__Alternatives2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimeAtomic_in_rule__InTimePrimary__Alternatives2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_0__0_in_rule__InTimeAtomic__Alternatives2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_1__0_in_rule__InTimeAtomic__Alternatives2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Statement__Group__0__Impl2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12885 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22945 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ContextsListAssignment_2_in_rule__Statement__Group__2__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__33005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Statement__Group__3__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03072 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventNameAssignment_0_in_rule__Event__Group__0__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__03194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__03197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Event__Group_1__0__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__13256 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__2_in_rule__Event__Group_1__13259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParamsAssignment_1_1_in_rule__Event__Group_1__1__Impl3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__2__Impl_in_rule__Event__Group_1__23316 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__3_in_rule__Event__Group_1__23319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__0_in_rule__Event__Group_1__2__Impl3346 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__3__Impl_in_rule__Event__Group_1__33377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Event__Group_1__3__Impl3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__0__Impl_in_rule__Event__Group_1_2__03444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__1_in_rule__Event__Group_1_2__03447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Event__Group_1_2__0__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__1__Impl_in_rule__Event__Group_1_2__13506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParamsAssignment_1_2_1_in_rule__Event__Group_1_2__1__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group__0__Impl_in_rule__ContextsList__Group__03567 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ContextsList__Group__1_in_rule__ContextsList__Group__03570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__EcContextsListAssignment_0_in_rule__ContextsList__Group__0__Impl3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group__1__Impl_in_rule__ContextsList__Group__13627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group_1__0_in_rule__ContextsList__Group__1__Impl3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group_1__0__Impl_in_rule__ContextsList__Group_1__03689 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ContextsList__Group_1__1_in_rule__ContextsList__Group_1__03692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ContextsList__Group_1__0__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group_1__1__Impl_in_rule__ContextsList__Group_1__13751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__ExpContextsListAssignment_1_1_in_rule__ContextsList__Group_1__1__Impl3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group__0__Impl_in_rule__EcContextsList__Group__03812 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group__1_in_rule__EcContextsList__Group__03815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__EcContextsAssignment_0_in_rule__EcContextsList__Group__0__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group__1__Impl_in_rule__EcContextsList__Group__13872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__0_in_rule__EcContextsList__Group__1__Impl3899 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__0__Impl_in_rule__EcContextsList__Group_1__03934 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__1_in_rule__EcContextsList__Group_1__03937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EcContextsList__Group_1__0__Impl3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__1__Impl_in_rule__EcContextsList__Group_1__13996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__EcContextsAssignment_1_1_in_rule__EcContextsList__Group_1__1__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group__0__Impl_in_rule__ExpContextsList__Group__04057 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group__1_in_rule__ExpContextsList__Group__04060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__ExpContextsAssignment_0_in_rule__ExpContextsList__Group__0__Impl4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group__1__Impl_in_rule__ExpContextsList__Group__14117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__0_in_rule__ExpContextsList__Group__1__Impl4144 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__0__Impl_in_rule__ExpContextsList__Group_1__04179 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__1_in_rule__ExpContextsList__Group_1__04182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExpContextsList__Group_1__0__Impl4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__1__Impl_in_rule__ExpContextsList__Group_1__14241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__ExpContextsAssignment_1_1_in_rule__ExpContextsList__Group_1__1__Impl4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group__0__Impl_in_rule__EcContext__Group__04302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EcContext__Group__1_in_rule__EcContext__Group__04305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EcContext__Group__0__Impl4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group__1__Impl_in_rule__EcContext__Group__14364 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EcContext__Group__2_in_rule__EcContext__Group__14367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__FluentAssignment_1_in_rule__EcContext__Group__1__Impl4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group__2__Impl_in_rule__EcContext__Group__24424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group_2__0_in_rule__EcContext__Group__2__Impl4451 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group_2__0__Impl_in_rule__EcContext__Group_2__04488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EcContext__Group_2__1_in_rule__EcContext__Group_2__04491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EcContext__Group_2__0__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group_2__1__Impl_in_rule__EcContext__Group_2__14550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__FluentAssignment_2_1_in_rule__EcContext__Group_2__1__Impl4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__0__Impl_in_rule__ExpContext__Group__04611 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__1_in_rule__ExpContext__Group__04614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ExpContext__Group__0__Impl4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__1__Impl_in_rule__ExpContext__Group__14673 = new BitSet(new long[]{0x000000800003F000L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__2_in_rule__ExpContext__Group__14676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__FinalConditionAssignment_1_in_rule__ExpContext__Group__1__Impl4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__2__Impl_in_rule__ExpContext__Group__24733 = new BitSet(new long[]{0x000000800003F000L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__3_in_rule__ExpContext__Group__24736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__0_in_rule__ExpContext__Group__2__Impl4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__3__Impl_in_rule__ExpContext__Group__34794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__0_in_rule__ExpContext__Group__3__Impl4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__0__Impl_in_rule__ExpContext__Group_2__04860 = new BitSet(new long[]{0x0000400400000020L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__1_in_rule__ExpContext__Group_2__04863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__AllenOpAssignment_2_0_in_rule__ExpContext__Group_2__0__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__1__Impl_in_rule__ExpContext__Group_2__14920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__TimeAssignment_2_1_in_rule__ExpContext__Group_2__1__Impl4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__0__Impl_in_rule__ExpContext__Group_3__04981 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__1_in_rule__ExpContext__Group_3__04984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ExpContext__Group_3__0__Impl5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__1__Impl_in_rule__ExpContext__Group_3__15043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__InitialConditionAssignment_3_1_in_rule__ExpContext__Group_3__1__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__0__Impl_in_rule__AllenOp__Group__05104 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__1_in_rule__AllenOp__Group__05107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__1__Impl_in_rule__AllenOp__Group__15165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__ValueAssignment_1_in_rule__AllenOp__Group__1__Impl5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__05226 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__05229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__FluentNameAssignment_0_in_rule__Fluent__Group__0__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__15286 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__15289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__25346 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__25349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__35407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__05473 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__05476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Fluent__Group_1__0__Impl5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__15535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__ValuePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__05596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__05599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Fluent__Group_2__0__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__15658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__TimePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__05719 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__05722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Fluent__Group_3__0__Impl5750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__15781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__05842 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__05845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__15903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__05964 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__05967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__16025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__06086 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__06089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__16145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl6172 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__06207 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__06210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__16268 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__16271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Or__Group_1__1__Impl6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__26330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl6357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__06393 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__06396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__Group__0__Impl6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__16452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl6479 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__06514 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__06517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__16575 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__16578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__And__Group_1__1__Impl6606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__26637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__06700 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__06703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl6730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__16759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl6786 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__06821 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__06824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__16882 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__16885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__26942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl6969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__07005 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__07008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__17064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl7091 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__07126 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__07129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__17187 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__17190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl7217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__27247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__07310 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__07313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__17369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl7396 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__07431 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__07434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl7461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__17491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__07552 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__07555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__17613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PlusOrMinus__Group_1_0_0__1__Impl7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__07676 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__07679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__17737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PlusOrMinus__Group_1_0_1__1__Impl7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__07800 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__07803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl7830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__17859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl7886 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__07921 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__07924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__17982 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__17985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl8012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__28042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__08105 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__08108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Primary__Group_0__0__Impl8136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__18167 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__18170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl8197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__28226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Primary__Group_0__2__Impl8254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__08291 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__08294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__18352 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__18355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Primary__Group_1__1__Impl8383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__28414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__08477 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__08480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__18538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl8565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__08599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__08602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__18660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl8687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__08721 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__08724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__18782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl8809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__08843 = new BitSet(new long[]{0x0000100430000070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__08846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__18904 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__18907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__RefAssignment_3_1_in_rule__Atomic__Group_3__1__Impl8934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__28964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__0_in_rule__Atomic__Group_3__2__Impl8991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__0__Impl_in_rule__Atomic__Group_3_2__09028 = new BitSet(new long[]{0x0000400400000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__1_in_rule__Atomic__Group_3_2__09031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Atomic__Group_3_2__0__Impl9059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3_2__1__Impl_in_rule__Atomic__Group_3_2__19090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__FluentValueSampleAssignment_3_2_1_in_rule__Atomic__Group_3_2__1__Impl9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__0__Impl_in_rule__AtTimeExpression__Group__09151 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__1_in_rule__AtTimeExpression__Group__09154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__Group__0__Impl9181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group__1__Impl_in_rule__AtTimeExpression__Group__19210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__0_in_rule__AtTimeExpression__Group__1__Impl9237 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__0__Impl_in_rule__AtTimeExpression__Group_1__09272 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__1_in_rule__AtTimeExpression__Group_1__09275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__1__Impl_in_rule__AtTimeExpression__Group_1__19333 = new BitSet(new long[]{0x0000400400000020L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__2_in_rule__AtTimeExpression__Group_1__19336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__OpAssignment_1_1_in_rule__AtTimeExpression__Group_1__1__Impl9363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__Group_1__2__Impl_in_rule__AtTimeExpression__Group_1__29393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__RightAssignment_1_2_in_rule__AtTimeExpression__Group_1__2__Impl9420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__0__Impl_in_rule__AtTimePrimary__Group_0__09456 = new BitSet(new long[]{0x0000400400000020L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__1_in_rule__AtTimePrimary__Group_0__09459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__AtTimePrimary__Group_0__0__Impl9487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__1__Impl_in_rule__AtTimePrimary__Group_0__19518 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__2_in_rule__AtTimePrimary__Group_0__19521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimeExpression_in_rule__AtTimePrimary__Group_0__1__Impl9548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimePrimary__Group_0__2__Impl_in_rule__AtTimePrimary__Group_0__29577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AtTimePrimary__Group_0__2__Impl9605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__0__Impl_in_rule__AtTimeAtomic__Group_0__09642 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__1_in_rule__AtTimeAtomic__Group_0__09645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_0__1__Impl_in_rule__AtTimeAtomic__Group_0__19703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__ValueAssignment_0_1_in_rule__AtTimeAtomic__Group_0__1__Impl9730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__0__Impl_in_rule__AtTimeAtomic__Group_1__09764 = new BitSet(new long[]{0x0000400400000020L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__1_in_rule__AtTimeAtomic__Group_1__09767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__Group_1__1__Impl_in_rule__AtTimeAtomic__Group_1__19825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeAtomic__AtTimeValueAssignment_1_1_in_rule__AtTimeAtomic__Group_1__1__Impl9852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group__0__Impl_in_rule__InTimeExpression__Group__09886 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group__1_in_rule__InTimeExpression__Group__09889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimePrimary_in_rule__InTimeExpression__Group__0__Impl9916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group__1__Impl_in_rule__InTimeExpression__Group__19945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__0_in_rule__InTimeExpression__Group__1__Impl9972 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__0__Impl_in_rule__InTimeExpression__Group_1__010007 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__1_in_rule__InTimeExpression__Group_1__010010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__1__Impl_in_rule__InTimeExpression__Group_1__110068 = new BitSet(new long[]{0x0000400400000020L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__2_in_rule__InTimeExpression__Group_1__110071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__OpAssignment_1_1_in_rule__InTimeExpression__Group_1__1__Impl10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__Group_1__2__Impl_in_rule__InTimeExpression__Group_1__210128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__RightAssignment_1_2_in_rule__InTimeExpression__Group_1__2__Impl10155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__0__Impl_in_rule__InTimePrimary__Group_0__010191 = new BitSet(new long[]{0x0000400400000020L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__1_in_rule__InTimePrimary__Group_0__010194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__InTimePrimary__Group_0__0__Impl10222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__1__Impl_in_rule__InTimePrimary__Group_0__110253 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__2_in_rule__InTimePrimary__Group_0__110256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpr_in_rule__InTimePrimary__Group_0__1__Impl10283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimePrimary__Group_0__2__Impl_in_rule__InTimePrimary__Group_0__210312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__InTimePrimary__Group_0__2__Impl10340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_0__0__Impl_in_rule__InTimeAtomic__Group_0__010377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_0__1_in_rule__InTimeAtomic__Group_0__010380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_0__1__Impl_in_rule__InTimeAtomic__Group_0__110438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__ValueAssignment_0_1_in_rule__InTimeAtomic__Group_0__1__Impl10465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_1__0__Impl_in_rule__InTimeAtomic__Group_1__010499 = new BitSet(new long[]{0x0000400400000020L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_1__1_in_rule__InTimeAtomic__Group_1__010502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__Group_1__1__Impl_in_rule__InTimeAtomic__Group_1__110560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeAtomic__InTimeValueAssignment_1_1_in_rule__InTimeAtomic__Group_1__1__Impl10587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__EceModel__StatementsAssignment10626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_110657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextsList_in_rule__Statement__ContextsListAssignment_210688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_010719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_110750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_2_110781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment10812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContextsList_in_rule__ContextsList__EcContextsListAssignment_010843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContextsList_in_rule__ContextsList__ExpContextsListAssignment_1_110874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_010905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_1_110936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_010967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_1_110998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_111029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_2_111060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__ExpContext__FinalConditionAssignment_111091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllenOp_in_rule__ExpContext__AllenOpAssignment_2_011122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__ExpContext__TimeAssignment_2_111153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__ExpContext__InitialConditionAssignment_3_111184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__ValueAlternatives_1_0_in_rule__AllenOp__ValueAssignment_111215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fluent__FluentNameAssignment_011248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_1_111279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_2_111310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_111341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_111372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_111403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InRule__TimeAssignment11434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_211465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_211496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_111527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_211560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_111591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_211624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_111655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_111686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_211719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_211750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_111781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_111812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_111843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_3_111880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__Atomic__FluentValueSampleAssignment_3_2_111915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtTimeExpression__OpAlternatives_1_1_0_in_rule__AtTimeExpression__OpAssignment_1_111946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtTimePrimary_in_rule__AtTimeExpression__RightAssignment_1_211979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AtTimeAtomic__ValueAssignment_0_112010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__AtTimeAtomic__AtTimeValueAssignment_1_112046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InTimeExpression__OpAlternatives_1_1_0_in_rule__InTimeExpression__OpAssignment_1_112085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInTimePrimary_in_rule__InTimeExpression__RightAssignment_1_212118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InTimeAtomic__ValueAssignment_0_112149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__InTimeAtomic__InTimeValueAssignment_1_112185 = new BitSet(new long[]{0x0000000000000002L});

}