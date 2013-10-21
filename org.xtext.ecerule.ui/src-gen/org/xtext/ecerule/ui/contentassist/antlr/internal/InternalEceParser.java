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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'before'", "'meets'", "'overlaps'", "'starts'", "'finishes'", "'during'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'%'", "'^'", "'true'", "'false'", "'on'", "';'", "'('", "')'", "','", "'set'", "'expect'", "'if'", "'to'", "'in'", "'OR'", "'AND'", "'+'", "'-'", "'!'", "'['", "']'"
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

                if ( (LA1_0==30) ) {
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


    // $ANTLR start "entryRuleTime"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:312:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:313:1: ( ruleTime EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:314:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_ruleTime_in_entryRuleTime602);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTime609); 

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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:321:1: ruleTime : ( ( rule__Time__TAssignment ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:325:2: ( ( ( rule__Time__TAssignment ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:326:1: ( ( rule__Time__TAssignment ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:326:1: ( ( rule__Time__TAssignment ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:327:1: ( rule__Time__TAssignment )
            {
             before(grammarAccess.getTimeAccess().getTAssignment()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:328:1: ( rule__Time__TAssignment )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:328:2: rule__Time__TAssignment
            {
            pushFollow(FOLLOW_rule__Time__TAssignment_in_ruleTime635);
            rule__Time__TAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getTAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleAllenOp"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:340:1: entryRuleAllenOp : ruleAllenOp EOF ;
    public final void entryRuleAllenOp() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:341:1: ( ruleAllenOp EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:342:1: ruleAllenOp EOF
            {
             before(grammarAccess.getAllenOpRule()); 
            pushFollow(FOLLOW_ruleAllenOp_in_entryRuleAllenOp662);
            ruleAllenOp();

            state._fsp--;

             after(grammarAccess.getAllenOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllenOp669); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:349:1: ruleAllenOp : ( ( rule__AllenOp__Group__0 ) ) ;
    public final void ruleAllenOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:353:2: ( ( ( rule__AllenOp__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:354:1: ( ( rule__AllenOp__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:354:1: ( ( rule__AllenOp__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:355:1: ( rule__AllenOp__Group__0 )
            {
             before(grammarAccess.getAllenOpAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:356:1: ( rule__AllenOp__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:356:2: rule__AllenOp__Group__0
            {
            pushFollow(FOLLOW_rule__AllenOp__Group__0_in_ruleAllenOp695);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:368:1: entryRuleFluent : ruleFluent EOF ;
    public final void entryRuleFluent() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:369:1: ( ruleFluent EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:370:1: ruleFluent EOF
            {
             before(grammarAccess.getFluentRule()); 
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent722);
            ruleFluent();

            state._fsp--;

             after(grammarAccess.getFluentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent729); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:377:1: ruleFluent : ( ( rule__Fluent__Group__0 ) ) ;
    public final void ruleFluent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:381:2: ( ( ( rule__Fluent__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:382:1: ( ( rule__Fluent__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:382:1: ( ( rule__Fluent__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:383:1: ( rule__Fluent__Group__0 )
            {
             before(grammarAccess.getFluentAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:384:1: ( rule__Fluent__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:384:2: rule__Fluent__Group__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0_in_ruleFluent755);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:396:1: entryRuleConditionRule : ruleConditionRule EOF ;
    public final void entryRuleConditionRule() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:397:1: ( ruleConditionRule EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:398:1: ruleConditionRule EOF
            {
             before(grammarAccess.getConditionRuleRule()); 
            pushFollow(FOLLOW_ruleConditionRule_in_entryRuleConditionRule782);
            ruleConditionRule();

            state._fsp--;

             after(grammarAccess.getConditionRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionRule789); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:405:1: ruleConditionRule : ( ( rule__ConditionRule__Group__0 ) ) ;
    public final void ruleConditionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:409:2: ( ( ( rule__ConditionRule__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:410:1: ( ( rule__ConditionRule__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:410:1: ( ( rule__ConditionRule__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:411:1: ( rule__ConditionRule__Group__0 )
            {
             before(grammarAccess.getConditionRuleAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:412:1: ( rule__ConditionRule__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:412:2: rule__ConditionRule__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__0_in_ruleConditionRule815);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:424:1: entryRuleToRule : ruleToRule EOF ;
    public final void entryRuleToRule() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:425:1: ( ruleToRule EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:426:1: ruleToRule EOF
            {
             before(grammarAccess.getToRuleRule()); 
            pushFollow(FOLLOW_ruleToRule_in_entryRuleToRule842);
            ruleToRule();

            state._fsp--;

             after(grammarAccess.getToRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToRule849); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:433:1: ruleToRule : ( ( rule__ToRule__Group__0 ) ) ;
    public final void ruleToRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:437:2: ( ( ( rule__ToRule__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:438:1: ( ( rule__ToRule__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:438:1: ( ( rule__ToRule__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:439:1: ( rule__ToRule__Group__0 )
            {
             before(grammarAccess.getToRuleAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:440:1: ( rule__ToRule__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:440:2: rule__ToRule__Group__0
            {
            pushFollow(FOLLOW_rule__ToRule__Group__0_in_ruleToRule875);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:452:1: entryRuleInRule : ruleInRule EOF ;
    public final void entryRuleInRule() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:453:1: ( ruleInRule EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:454:1: ruleInRule EOF
            {
             before(grammarAccess.getInRuleRule()); 
            pushFollow(FOLLOW_ruleInRule_in_entryRuleInRule902);
            ruleInRule();

            state._fsp--;

             after(grammarAccess.getInRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInRule909); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:461:1: ruleInRule : ( ( rule__InRule__TimeAssignment ) ) ;
    public final void ruleInRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:465:2: ( ( ( rule__InRule__TimeAssignment ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:466:1: ( ( rule__InRule__TimeAssignment ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:466:1: ( ( rule__InRule__TimeAssignment ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:467:1: ( rule__InRule__TimeAssignment )
            {
             before(grammarAccess.getInRuleAccess().getTimeAssignment()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:468:1: ( rule__InRule__TimeAssignment )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:468:2: rule__InRule__TimeAssignment
            {
            pushFollow(FOLLOW_rule__InRule__TimeAssignment_in_ruleInRule935);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:480:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:481:1: ( ruleExpression EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:482:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression962);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression969); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:489:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:493:2: ( ( ruleOr ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:494:1: ( ruleOr )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:494:1: ( ruleOr )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:495:1: ruleOr
            {
             before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            pushFollow(FOLLOW_ruleOr_in_ruleExpression995);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:508:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:509:1: ( ruleOr EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:510:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1021);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1028); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:517:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:521:2: ( ( ( rule__Or__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:522:1: ( ( rule__Or__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:522:1: ( ( rule__Or__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:523:1: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:524:1: ( rule__Or__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:524:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr1054);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:536:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:537:1: ( ruleAnd EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:538:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd1081);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd1088); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:545:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:549:2: ( ( ( rule__And__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:550:1: ( ( rule__And__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:550:1: ( ( rule__And__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:551:1: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:552:1: ( rule__And__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:552:2: rule__And__Group__0
            {
            pushFollow(FOLLOW_rule__And__Group__0_in_ruleAnd1114);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:564:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:565:1: ( ruleEquality EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:566:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality1141);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality1148); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:573:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:577:2: ( ( ( rule__Equality__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:578:1: ( ( rule__Equality__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:578:1: ( ( rule__Equality__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:579:1: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:580:1: ( rule__Equality__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:580:2: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_rule__Equality__Group__0_in_ruleEquality1174);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:592:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:593:1: ( ruleComparison EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:594:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1201);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1208); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:601:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:605:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:606:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:606:1: ( ( rule__Comparison__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:607:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:608:1: ( rule__Comparison__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:608:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison1234);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:620:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:621:1: ( rulePlusOrMinus EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:622:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus1261);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus1268); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:629:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:633:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:634:1: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:634:1: ( ( rule__PlusOrMinus__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:635:1: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:636:1: ( rule__PlusOrMinus__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:636:2: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus1294);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:648:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:649:1: ( ruleMulOrDiv EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:650:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv1321);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv1328); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:657:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:661:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:662:1: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:662:1: ( ( rule__MulOrDiv__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:663:1: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:664:1: ( rule__MulOrDiv__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:664:2: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv1354);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:676:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:677:1: ( rulePrimary EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:678:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1381);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1388); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:685:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:689:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:690:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:690:1: ( ( rule__Primary__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:691:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:692:1: ( rule__Primary__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:692:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary1414);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:704:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:705:1: ( ruleAtomic EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:706:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1441);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1448); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:713:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:717:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:718:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:718:1: ( ( rule__Atomic__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:719:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:720:1: ( rule__Atomic__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:720:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1474);
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


    // $ANTLR start "rule__AllenOp__ValueAlternatives_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:732:1: rule__AllenOp__ValueAlternatives_1_0 : ( ( 'before' ) | ( 'meets' ) | ( 'overlaps' ) | ( 'starts' ) | ( 'finishes' ) | ( 'during' ) );
    public final void rule__AllenOp__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:736:1: ( ( 'before' ) | ( 'meets' ) | ( 'overlaps' ) | ( 'starts' ) | ( 'finishes' ) | ( 'during' ) )
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
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:737:1: ( 'before' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:737:1: ( 'before' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:738:1: 'before'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueBeforeKeyword_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__AllenOp__ValueAlternatives_1_01511); 
                     after(grammarAccess.getAllenOpAccess().getValueBeforeKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:745:6: ( 'meets' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:745:6: ( 'meets' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:746:1: 'meets'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueMeetsKeyword_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__AllenOp__ValueAlternatives_1_01531); 
                     after(grammarAccess.getAllenOpAccess().getValueMeetsKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:753:6: ( 'overlaps' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:753:6: ( 'overlaps' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:754:1: 'overlaps'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueOverlapsKeyword_1_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__AllenOp__ValueAlternatives_1_01551); 
                     after(grammarAccess.getAllenOpAccess().getValueOverlapsKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:761:6: ( 'starts' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:761:6: ( 'starts' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:762:1: 'starts'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueStartsKeyword_1_0_3()); 
                    match(input,15,FOLLOW_15_in_rule__AllenOp__ValueAlternatives_1_01571); 
                     after(grammarAccess.getAllenOpAccess().getValueStartsKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:769:6: ( 'finishes' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:769:6: ( 'finishes' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:770:1: 'finishes'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueFinishesKeyword_1_0_4()); 
                    match(input,16,FOLLOW_16_in_rule__AllenOp__ValueAlternatives_1_01591); 
                     after(grammarAccess.getAllenOpAccess().getValueFinishesKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:777:6: ( 'during' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:777:6: ( 'during' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:778:1: 'during'
                    {
                     before(grammarAccess.getAllenOpAccess().getValueDuringKeyword_1_0_5()); 
                    match(input,17,FOLLOW_17_in_rule__AllenOp__ValueAlternatives_1_01611); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:790:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:794:1: ( ( '==' ) | ( '!=' ) )
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
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:795:1: ( '==' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:795:1: ( '==' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:796:1: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Equality__OpAlternatives_1_1_01646); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:803:6: ( '!=' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:803:6: ( '!=' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:804:1: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Equality__OpAlternatives_1_1_01666); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:816:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:820:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
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
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:821:1: ( '>=' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:821:1: ( '>=' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:822:1: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,20,FOLLOW_20_in_rule__Comparison__OpAlternatives_1_1_01701); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:829:6: ( '<=' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:829:6: ( '<=' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:830:1: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,21,FOLLOW_21_in_rule__Comparison__OpAlternatives_1_1_01721); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:837:6: ( '>' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:837:6: ( '>' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:838:1: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,22,FOLLOW_22_in_rule__Comparison__OpAlternatives_1_1_01741); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:845:6: ( '<' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:845:6: ( '<' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:846:1: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,23,FOLLOW_23_in_rule__Comparison__OpAlternatives_1_1_01761); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:858:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:862:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==42) ) {
                alt5=1;
            }
            else if ( (LA5_0==43) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:863:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:863:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:864:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:865:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:865:2: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_01795);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:869:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:869:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:870:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:871:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:871:2: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_01813);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:880:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:884:1: ( ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) )
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
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:885:1: ( '*' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:885:1: ( '*' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:886:1: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,24,FOLLOW_24_in_rule__MulOrDiv__OpAlternatives_1_1_01847); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:893:6: ( '/' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:893:6: ( '/' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:894:1: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,25,FOLLOW_25_in_rule__MulOrDiv__OpAlternatives_1_1_01867); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:901:6: ( '%' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:901:6: ( '%' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:902:1: '%'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2()); 
                    match(input,26,FOLLOW_26_in_rule__MulOrDiv__OpAlternatives_1_1_01887); 
                     after(grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:909:6: ( '^' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:909:6: ( '^' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:910:1: '^'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_1_0_3()); 
                    match(input,27,FOLLOW_27_in_rule__MulOrDiv__OpAlternatives_1_1_01907); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:922:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:926:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 32:
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
            case 45:
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
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:927:1: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:927:1: ( ( rule__Primary__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:928:1: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:929:1: ( rule__Primary__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:929:2: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives1941);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:933:6: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:933:6: ( ( rule__Primary__Group_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:934:1: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:935:1: ( rule__Primary__Group_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:935:2: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1959);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:939:6: ( ruleAtomic )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:939:6: ( ruleAtomic )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:940:1: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__Primary__Alternatives1977);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:950:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:954:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) )
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
            case 45:
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
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:955:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:955:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:956:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:957:1: ( rule__Atomic__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:957:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives2009);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:961:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:961:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:962:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:963:1: ( rule__Atomic__Group_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:963:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives2027);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:967:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:967:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:968:1: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:969:1: ( rule__Atomic__Group_2__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:969:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives2045);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:973:6: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:973:6: ( ( rule__Atomic__Group_3__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:974:1: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:975:1: ( rule__Atomic__Group_3__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:975:2: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives2063);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:979:6: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:979:6: ( ( rule__Atomic__Group_4__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:980:1: ( rule__Atomic__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:981:1: ( rule__Atomic__Group_4__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:981:2: rule__Atomic__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives2081);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:990:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:994:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:995:1: ( 'true' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:995:1: ( 'true' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:996:1: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,28,FOLLOW_28_in_rule__Atomic__ValueAlternatives_2_1_02115); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1003:6: ( 'false' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1003:6: ( 'false' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1004:1: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,29,FOLLOW_29_in_rule__Atomic__ValueAlternatives_2_1_02135); 
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


    // $ANTLR start "rule__Statement__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1018:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1022:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1023:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02167);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02170);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1030:1: rule__Statement__Group__0__Impl : ( 'on' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1034:1: ( ( 'on' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1035:1: ( 'on' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1035:1: ( 'on' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1036:1: 'on'
            {
             before(grammarAccess.getStatementAccess().getOnKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Statement__Group__0__Impl2198); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1049:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1053:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1054:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12229);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12232);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1061:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__EventAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1065:1: ( ( ( rule__Statement__EventAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1066:1: ( ( rule__Statement__EventAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1066:1: ( ( rule__Statement__EventAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1067:1: ( rule__Statement__EventAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getEventAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1068:1: ( rule__Statement__EventAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1068:2: rule__Statement__EventAssignment_1
            {
            pushFollow(FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl2259);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1078:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1082:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1083:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22289);
            rule__Statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22292);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1090:1: rule__Statement__Group__2__Impl : ( ( rule__Statement__ContextsListAssignment_2 ) ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1094:1: ( ( ( rule__Statement__ContextsListAssignment_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1095:1: ( ( rule__Statement__ContextsListAssignment_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1095:1: ( ( rule__Statement__ContextsListAssignment_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1096:1: ( rule__Statement__ContextsListAssignment_2 )
            {
             before(grammarAccess.getStatementAccess().getContextsListAssignment_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1097:1: ( rule__Statement__ContextsListAssignment_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1097:2: rule__Statement__ContextsListAssignment_2
            {
            pushFollow(FOLLOW_rule__Statement__ContextsListAssignment_2_in_rule__Statement__Group__2__Impl2319);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1107:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1111:1: ( rule__Statement__Group__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1112:2: rule__Statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__32349);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1118:1: rule__Statement__Group__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1122:1: ( ( ';' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1123:1: ( ';' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1123:1: ( ';' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1124:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__Statement__Group__3__Impl2377); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1145:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1149:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1150:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02416);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02419);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1157:1: rule__Event__Group__0__Impl : ( ( rule__Event__EventNameAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1161:1: ( ( ( rule__Event__EventNameAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1162:1: ( ( rule__Event__EventNameAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1162:1: ( ( rule__Event__EventNameAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1163:1: ( rule__Event__EventNameAssignment_0 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1164:1: ( rule__Event__EventNameAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1164:2: rule__Event__EventNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Event__EventNameAssignment_0_in_rule__Event__Group__0__Impl2446);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1174:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1178:1: ( rule__Event__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1179:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12476);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1185:1: rule__Event__Group__1__Impl : ( ( rule__Event__Group_1__0 )? ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1189:1: ( ( ( rule__Event__Group_1__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1190:1: ( ( rule__Event__Group_1__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1190:1: ( ( rule__Event__Group_1__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1191:1: ( rule__Event__Group_1__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1192:1: ( rule__Event__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1192:2: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl2503);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1206:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1210:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1211:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__02538);
            rule__Event__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__02541);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1218:1: rule__Event__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1222:1: ( ( '(' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1223:1: ( '(' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1223:1: ( '(' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1224:1: '('
            {
             before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Event__Group_1__0__Impl2569); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1237:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl rule__Event__Group_1__2 ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1241:1: ( rule__Event__Group_1__1__Impl rule__Event__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1242:2: rule__Event__Group_1__1__Impl rule__Event__Group_1__2
            {
            pushFollow(FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__12600);
            rule__Event__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__2_in_rule__Event__Group_1__12603);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1249:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__ParamsAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1253:1: ( ( ( rule__Event__ParamsAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1254:1: ( ( rule__Event__ParamsAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1254:1: ( ( rule__Event__ParamsAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1255:1: ( rule__Event__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getParamsAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1256:1: ( rule__Event__ParamsAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1256:2: rule__Event__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Event__ParamsAssignment_1_1_in_rule__Event__Group_1__1__Impl2630);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1266:1: rule__Event__Group_1__2 : rule__Event__Group_1__2__Impl rule__Event__Group_1__3 ;
    public final void rule__Event__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1270:1: ( rule__Event__Group_1__2__Impl rule__Event__Group_1__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1271:2: rule__Event__Group_1__2__Impl rule__Event__Group_1__3
            {
            pushFollow(FOLLOW_rule__Event__Group_1__2__Impl_in_rule__Event__Group_1__22660);
            rule__Event__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__3_in_rule__Event__Group_1__22663);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1278:1: rule__Event__Group_1__2__Impl : ( ( rule__Event__Group_1_2__0 )* ) ;
    public final void rule__Event__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1282:1: ( ( ( rule__Event__Group_1_2__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1283:1: ( ( rule__Event__Group_1_2__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1283:1: ( ( rule__Event__Group_1_2__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1284:1: ( rule__Event__Group_1_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1285:1: ( rule__Event__Group_1_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1285:2: rule__Event__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Event__Group_1_2__0_in_rule__Event__Group_1__2__Impl2690);
            	    rule__Event__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1295:1: rule__Event__Group_1__3 : rule__Event__Group_1__3__Impl ;
    public final void rule__Event__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1299:1: ( rule__Event__Group_1__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1300:2: rule__Event__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1__3__Impl_in_rule__Event__Group_1__32721);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1306:1: rule__Event__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Event__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1310:1: ( ( ')' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1311:1: ( ')' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1311:1: ( ')' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1312:1: ')'
            {
             before(grammarAccess.getEventAccess().getRightParenthesisKeyword_1_3()); 
            match(input,33,FOLLOW_33_in_rule__Event__Group_1__3__Impl2749); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1333:1: rule__Event__Group_1_2__0 : rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 ;
    public final void rule__Event__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1337:1: ( rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1338:2: rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1_2__0__Impl_in_rule__Event__Group_1_2__02788);
            rule__Event__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1_2__1_in_rule__Event__Group_1_2__02791);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1345:1: rule__Event__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1349:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1350:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1350:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1351:1: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_1_2_0()); 
            match(input,34,FOLLOW_34_in_rule__Event__Group_1_2__0__Impl2819); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1364:1: rule__Event__Group_1_2__1 : rule__Event__Group_1_2__1__Impl ;
    public final void rule__Event__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1368:1: ( rule__Event__Group_1_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1369:2: rule__Event__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1_2__1__Impl_in_rule__Event__Group_1_2__12850);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1375:1: rule__Event__Group_1_2__1__Impl : ( ( rule__Event__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__Event__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1379:1: ( ( ( rule__Event__ParamsAssignment_1_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1380:1: ( ( rule__Event__ParamsAssignment_1_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1380:1: ( ( rule__Event__ParamsAssignment_1_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1381:1: ( rule__Event__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getEventAccess().getParamsAssignment_1_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1382:1: ( rule__Event__ParamsAssignment_1_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1382:2: rule__Event__ParamsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Event__ParamsAssignment_1_2_1_in_rule__Event__Group_1_2__1__Impl2877);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1396:1: rule__ContextsList__Group__0 : rule__ContextsList__Group__0__Impl rule__ContextsList__Group__1 ;
    public final void rule__ContextsList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1400:1: ( rule__ContextsList__Group__0__Impl rule__ContextsList__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1401:2: rule__ContextsList__Group__0__Impl rule__ContextsList__Group__1
            {
            pushFollow(FOLLOW_rule__ContextsList__Group__0__Impl_in_rule__ContextsList__Group__02911);
            rule__ContextsList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextsList__Group__1_in_rule__ContextsList__Group__02914);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1408:1: rule__ContextsList__Group__0__Impl : ( ( rule__ContextsList__EcContextsListAssignment_0 ) ) ;
    public final void rule__ContextsList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1412:1: ( ( ( rule__ContextsList__EcContextsListAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1413:1: ( ( rule__ContextsList__EcContextsListAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1413:1: ( ( rule__ContextsList__EcContextsListAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1414:1: ( rule__ContextsList__EcContextsListAssignment_0 )
            {
             before(grammarAccess.getContextsListAccess().getEcContextsListAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1415:1: ( rule__ContextsList__EcContextsListAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1415:2: rule__ContextsList__EcContextsListAssignment_0
            {
            pushFollow(FOLLOW_rule__ContextsList__EcContextsListAssignment_0_in_rule__ContextsList__Group__0__Impl2941);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1425:1: rule__ContextsList__Group__1 : rule__ContextsList__Group__1__Impl ;
    public final void rule__ContextsList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1429:1: ( rule__ContextsList__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1430:2: rule__ContextsList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextsList__Group__1__Impl_in_rule__ContextsList__Group__12971);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1436:1: rule__ContextsList__Group__1__Impl : ( ( rule__ContextsList__Group_1__0 )? ) ;
    public final void rule__ContextsList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1440:1: ( ( ( rule__ContextsList__Group_1__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1441:1: ( ( rule__ContextsList__Group_1__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1441:1: ( ( rule__ContextsList__Group_1__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1442:1: ( rule__ContextsList__Group_1__0 )?
            {
             before(grammarAccess.getContextsListAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1443:1: ( rule__ContextsList__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1443:2: rule__ContextsList__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ContextsList__Group_1__0_in_rule__ContextsList__Group__1__Impl2998);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1457:1: rule__ContextsList__Group_1__0 : rule__ContextsList__Group_1__0__Impl rule__ContextsList__Group_1__1 ;
    public final void rule__ContextsList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1461:1: ( rule__ContextsList__Group_1__0__Impl rule__ContextsList__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1462:2: rule__ContextsList__Group_1__0__Impl rule__ContextsList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ContextsList__Group_1__0__Impl_in_rule__ContextsList__Group_1__03033);
            rule__ContextsList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextsList__Group_1__1_in_rule__ContextsList__Group_1__03036);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1469:1: rule__ContextsList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ContextsList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1473:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1474:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1474:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1475:1: ','
            {
             before(grammarAccess.getContextsListAccess().getCommaKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__ContextsList__Group_1__0__Impl3064); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1488:1: rule__ContextsList__Group_1__1 : rule__ContextsList__Group_1__1__Impl ;
    public final void rule__ContextsList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1492:1: ( rule__ContextsList__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1493:2: rule__ContextsList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextsList__Group_1__1__Impl_in_rule__ContextsList__Group_1__13095);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1499:1: rule__ContextsList__Group_1__1__Impl : ( ( rule__ContextsList__ExpContextsListAssignment_1_1 ) ) ;
    public final void rule__ContextsList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1503:1: ( ( ( rule__ContextsList__ExpContextsListAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1504:1: ( ( rule__ContextsList__ExpContextsListAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1504:1: ( ( rule__ContextsList__ExpContextsListAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1505:1: ( rule__ContextsList__ExpContextsListAssignment_1_1 )
            {
             before(grammarAccess.getContextsListAccess().getExpContextsListAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1506:1: ( rule__ContextsList__ExpContextsListAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1506:2: rule__ContextsList__ExpContextsListAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ContextsList__ExpContextsListAssignment_1_1_in_rule__ContextsList__Group_1__1__Impl3122);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1520:1: rule__EcContextsList__Group__0 : rule__EcContextsList__Group__0__Impl rule__EcContextsList__Group__1 ;
    public final void rule__EcContextsList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1524:1: ( rule__EcContextsList__Group__0__Impl rule__EcContextsList__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1525:2: rule__EcContextsList__Group__0__Impl rule__EcContextsList__Group__1
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group__0__Impl_in_rule__EcContextsList__Group__03156);
            rule__EcContextsList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContextsList__Group__1_in_rule__EcContextsList__Group__03159);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1532:1: rule__EcContextsList__Group__0__Impl : ( ( rule__EcContextsList__EcContextsAssignment_0 ) ) ;
    public final void rule__EcContextsList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1536:1: ( ( ( rule__EcContextsList__EcContextsAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1537:1: ( ( rule__EcContextsList__EcContextsAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1537:1: ( ( rule__EcContextsList__EcContextsAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1538:1: ( rule__EcContextsList__EcContextsAssignment_0 )
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1539:1: ( rule__EcContextsList__EcContextsAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1539:2: rule__EcContextsList__EcContextsAssignment_0
            {
            pushFollow(FOLLOW_rule__EcContextsList__EcContextsAssignment_0_in_rule__EcContextsList__Group__0__Impl3186);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1549:1: rule__EcContextsList__Group__1 : rule__EcContextsList__Group__1__Impl ;
    public final void rule__EcContextsList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1553:1: ( rule__EcContextsList__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1554:2: rule__EcContextsList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group__1__Impl_in_rule__EcContextsList__Group__13216);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1560:1: rule__EcContextsList__Group__1__Impl : ( ( rule__EcContextsList__Group_1__0 )* ) ;
    public final void rule__EcContextsList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1564:1: ( ( ( rule__EcContextsList__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1565:1: ( ( rule__EcContextsList__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1565:1: ( ( rule__EcContextsList__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1566:1: ( rule__EcContextsList__Group_1__0 )*
            {
             before(grammarAccess.getEcContextsListAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1567:1: ( rule__EcContextsList__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==35) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1567:2: rule__EcContextsList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EcContextsList__Group_1__0_in_rule__EcContextsList__Group__1__Impl3243);
            	    rule__EcContextsList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1581:1: rule__EcContextsList__Group_1__0 : rule__EcContextsList__Group_1__0__Impl rule__EcContextsList__Group_1__1 ;
    public final void rule__EcContextsList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1585:1: ( rule__EcContextsList__Group_1__0__Impl rule__EcContextsList__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1586:2: rule__EcContextsList__Group_1__0__Impl rule__EcContextsList__Group_1__1
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group_1__0__Impl_in_rule__EcContextsList__Group_1__03278);
            rule__EcContextsList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContextsList__Group_1__1_in_rule__EcContextsList__Group_1__03281);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1593:1: rule__EcContextsList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__EcContextsList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1597:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1598:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1598:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1599:1: ','
            {
             before(grammarAccess.getEcContextsListAccess().getCommaKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__EcContextsList__Group_1__0__Impl3309); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1612:1: rule__EcContextsList__Group_1__1 : rule__EcContextsList__Group_1__1__Impl ;
    public final void rule__EcContextsList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1616:1: ( rule__EcContextsList__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1617:2: rule__EcContextsList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EcContextsList__Group_1__1__Impl_in_rule__EcContextsList__Group_1__13340);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1623:1: rule__EcContextsList__Group_1__1__Impl : ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) ) ;
    public final void rule__EcContextsList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1627:1: ( ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1628:1: ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1628:1: ( ( rule__EcContextsList__EcContextsAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1629:1: ( rule__EcContextsList__EcContextsAssignment_1_1 )
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1630:1: ( rule__EcContextsList__EcContextsAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1630:2: rule__EcContextsList__EcContextsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EcContextsList__EcContextsAssignment_1_1_in_rule__EcContextsList__Group_1__1__Impl3367);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1644:1: rule__ExpContextsList__Group__0 : rule__ExpContextsList__Group__0__Impl rule__ExpContextsList__Group__1 ;
    public final void rule__ExpContextsList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1648:1: ( rule__ExpContextsList__Group__0__Impl rule__ExpContextsList__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1649:2: rule__ExpContextsList__Group__0__Impl rule__ExpContextsList__Group__1
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group__0__Impl_in_rule__ExpContextsList__Group__03401);
            rule__ExpContextsList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContextsList__Group__1_in_rule__ExpContextsList__Group__03404);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1656:1: rule__ExpContextsList__Group__0__Impl : ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) ) ;
    public final void rule__ExpContextsList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1660:1: ( ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1661:1: ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1661:1: ( ( rule__ExpContextsList__ExpContextsAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1662:1: ( rule__ExpContextsList__ExpContextsAssignment_0 )
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1663:1: ( rule__ExpContextsList__ExpContextsAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1663:2: rule__ExpContextsList__ExpContextsAssignment_0
            {
            pushFollow(FOLLOW_rule__ExpContextsList__ExpContextsAssignment_0_in_rule__ExpContextsList__Group__0__Impl3431);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1673:1: rule__ExpContextsList__Group__1 : rule__ExpContextsList__Group__1__Impl ;
    public final void rule__ExpContextsList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1677:1: ( rule__ExpContextsList__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1678:2: rule__ExpContextsList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group__1__Impl_in_rule__ExpContextsList__Group__13461);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1684:1: rule__ExpContextsList__Group__1__Impl : ( ( rule__ExpContextsList__Group_1__0 )* ) ;
    public final void rule__ExpContextsList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1688:1: ( ( ( rule__ExpContextsList__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1689:1: ( ( rule__ExpContextsList__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1689:1: ( ( rule__ExpContextsList__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1690:1: ( rule__ExpContextsList__Group_1__0 )*
            {
             before(grammarAccess.getExpContextsListAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1691:1: ( rule__ExpContextsList__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1691:2: rule__ExpContextsList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExpContextsList__Group_1__0_in_rule__ExpContextsList__Group__1__Impl3488);
            	    rule__ExpContextsList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1705:1: rule__ExpContextsList__Group_1__0 : rule__ExpContextsList__Group_1__0__Impl rule__ExpContextsList__Group_1__1 ;
    public final void rule__ExpContextsList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1709:1: ( rule__ExpContextsList__Group_1__0__Impl rule__ExpContextsList__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1710:2: rule__ExpContextsList__Group_1__0__Impl rule__ExpContextsList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group_1__0__Impl_in_rule__ExpContextsList__Group_1__03523);
            rule__ExpContextsList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContextsList__Group_1__1_in_rule__ExpContextsList__Group_1__03526);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1717:1: rule__ExpContextsList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ExpContextsList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1721:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1722:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1722:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1723:1: ','
            {
             before(grammarAccess.getExpContextsListAccess().getCommaKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__ExpContextsList__Group_1__0__Impl3554); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1736:1: rule__ExpContextsList__Group_1__1 : rule__ExpContextsList__Group_1__1__Impl ;
    public final void rule__ExpContextsList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1740:1: ( rule__ExpContextsList__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1741:2: rule__ExpContextsList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContextsList__Group_1__1__Impl_in_rule__ExpContextsList__Group_1__13585);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1747:1: rule__ExpContextsList__Group_1__1__Impl : ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) ) ;
    public final void rule__ExpContextsList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1751:1: ( ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1752:1: ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1752:1: ( ( rule__ExpContextsList__ExpContextsAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1753:1: ( rule__ExpContextsList__ExpContextsAssignment_1_1 )
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1754:1: ( rule__ExpContextsList__ExpContextsAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1754:2: rule__ExpContextsList__ExpContextsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExpContextsList__ExpContextsAssignment_1_1_in_rule__ExpContextsList__Group_1__1__Impl3612);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1768:1: rule__EcContext__Group__0 : rule__EcContext__Group__0__Impl rule__EcContext__Group__1 ;
    public final void rule__EcContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1772:1: ( rule__EcContext__Group__0__Impl rule__EcContext__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1773:2: rule__EcContext__Group__0__Impl rule__EcContext__Group__1
            {
            pushFollow(FOLLOW_rule__EcContext__Group__0__Impl_in_rule__EcContext__Group__03646);
            rule__EcContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContext__Group__1_in_rule__EcContext__Group__03649);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1780:1: rule__EcContext__Group__0__Impl : ( 'set' ) ;
    public final void rule__EcContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1784:1: ( ( 'set' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1785:1: ( 'set' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1785:1: ( 'set' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1786:1: 'set'
            {
             before(grammarAccess.getEcContextAccess().getSetKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__EcContext__Group__0__Impl3677); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1799:1: rule__EcContext__Group__1 : rule__EcContext__Group__1__Impl rule__EcContext__Group__2 ;
    public final void rule__EcContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1803:1: ( rule__EcContext__Group__1__Impl rule__EcContext__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1804:2: rule__EcContext__Group__1__Impl rule__EcContext__Group__2
            {
            pushFollow(FOLLOW_rule__EcContext__Group__1__Impl_in_rule__EcContext__Group__13708);
            rule__EcContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContext__Group__2_in_rule__EcContext__Group__13711);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1811:1: rule__EcContext__Group__1__Impl : ( ( rule__EcContext__FluentAssignment_1 ) ) ;
    public final void rule__EcContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1815:1: ( ( ( rule__EcContext__FluentAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1816:1: ( ( rule__EcContext__FluentAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1816:1: ( ( rule__EcContext__FluentAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1817:1: ( rule__EcContext__FluentAssignment_1 )
            {
             before(grammarAccess.getEcContextAccess().getFluentAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1818:1: ( rule__EcContext__FluentAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1818:2: rule__EcContext__FluentAssignment_1
            {
            pushFollow(FOLLOW_rule__EcContext__FluentAssignment_1_in_rule__EcContext__Group__1__Impl3738);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1828:1: rule__EcContext__Group__2 : rule__EcContext__Group__2__Impl ;
    public final void rule__EcContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1832:1: ( rule__EcContext__Group__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1833:2: rule__EcContext__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EcContext__Group__2__Impl_in_rule__EcContext__Group__23768);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1839:1: rule__EcContext__Group__2__Impl : ( ( rule__EcContext__Group_2__0 )* ) ;
    public final void rule__EcContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1843:1: ( ( ( rule__EcContext__Group_2__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1844:1: ( ( rule__EcContext__Group_2__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1844:1: ( ( rule__EcContext__Group_2__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1845:1: ( rule__EcContext__Group_2__0 )*
            {
             before(grammarAccess.getEcContextAccess().getGroup_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1846:1: ( rule__EcContext__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_ID) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1846:2: rule__EcContext__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EcContext__Group_2__0_in_rule__EcContext__Group__2__Impl3795);
            	    rule__EcContext__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1862:1: rule__EcContext__Group_2__0 : rule__EcContext__Group_2__0__Impl rule__EcContext__Group_2__1 ;
    public final void rule__EcContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1866:1: ( rule__EcContext__Group_2__0__Impl rule__EcContext__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1867:2: rule__EcContext__Group_2__0__Impl rule__EcContext__Group_2__1
            {
            pushFollow(FOLLOW_rule__EcContext__Group_2__0__Impl_in_rule__EcContext__Group_2__03832);
            rule__EcContext__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EcContext__Group_2__1_in_rule__EcContext__Group_2__03835);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1874:1: rule__EcContext__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EcContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1878:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1879:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1879:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1880:1: ','
            {
             before(grammarAccess.getEcContextAccess().getCommaKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__EcContext__Group_2__0__Impl3863); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1893:1: rule__EcContext__Group_2__1 : rule__EcContext__Group_2__1__Impl ;
    public final void rule__EcContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1897:1: ( rule__EcContext__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1898:2: rule__EcContext__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EcContext__Group_2__1__Impl_in_rule__EcContext__Group_2__13894);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1904:1: rule__EcContext__Group_2__1__Impl : ( ( rule__EcContext__FluentAssignment_2_1 ) ) ;
    public final void rule__EcContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1908:1: ( ( ( rule__EcContext__FluentAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1909:1: ( ( rule__EcContext__FluentAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1909:1: ( ( rule__EcContext__FluentAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1910:1: ( rule__EcContext__FluentAssignment_2_1 )
            {
             before(grammarAccess.getEcContextAccess().getFluentAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1911:1: ( rule__EcContext__FluentAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1911:2: rule__EcContext__FluentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EcContext__FluentAssignment_2_1_in_rule__EcContext__Group_2__1__Impl3921);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1925:1: rule__ExpContext__Group__0 : rule__ExpContext__Group__0__Impl rule__ExpContext__Group__1 ;
    public final void rule__ExpContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1929:1: ( rule__ExpContext__Group__0__Impl rule__ExpContext__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1930:2: rule__ExpContext__Group__0__Impl rule__ExpContext__Group__1
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__0__Impl_in_rule__ExpContext__Group__03955);
            rule__ExpContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group__1_in_rule__ExpContext__Group__03958);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1937:1: rule__ExpContext__Group__0__Impl : ( 'expect' ) ;
    public final void rule__ExpContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1941:1: ( ( 'expect' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1942:1: ( 'expect' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1942:1: ( 'expect' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1943:1: 'expect'
            {
             before(grammarAccess.getExpContextAccess().getExpectKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__ExpContext__Group__0__Impl3986); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1956:1: rule__ExpContext__Group__1 : rule__ExpContext__Group__1__Impl rule__ExpContext__Group__2 ;
    public final void rule__ExpContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1960:1: ( rule__ExpContext__Group__1__Impl rule__ExpContext__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1961:2: rule__ExpContext__Group__1__Impl rule__ExpContext__Group__2
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__1__Impl_in_rule__ExpContext__Group__14017);
            rule__ExpContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group__2_in_rule__ExpContext__Group__14020);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1968:1: rule__ExpContext__Group__1__Impl : ( ( rule__ExpContext__FinalConditionAssignment_1 ) ) ;
    public final void rule__ExpContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1972:1: ( ( ( rule__ExpContext__FinalConditionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1973:1: ( ( rule__ExpContext__FinalConditionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1973:1: ( ( rule__ExpContext__FinalConditionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1974:1: ( rule__ExpContext__FinalConditionAssignment_1 )
            {
             before(grammarAccess.getExpContextAccess().getFinalConditionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1975:1: ( rule__ExpContext__FinalConditionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1975:2: rule__ExpContext__FinalConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__ExpContext__FinalConditionAssignment_1_in_rule__ExpContext__Group__1__Impl4047);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1985:1: rule__ExpContext__Group__2 : rule__ExpContext__Group__2__Impl rule__ExpContext__Group__3 ;
    public final void rule__ExpContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1989:1: ( rule__ExpContext__Group__2__Impl rule__ExpContext__Group__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1990:2: rule__ExpContext__Group__2__Impl rule__ExpContext__Group__3
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__2__Impl_in_rule__ExpContext__Group__24077);
            rule__ExpContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group__3_in_rule__ExpContext__Group__24080);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1997:1: rule__ExpContext__Group__2__Impl : ( ( rule__ExpContext__Group_2__0 )? ) ;
    public final void rule__ExpContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2001:1: ( ( ( rule__ExpContext__Group_2__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2002:1: ( ( rule__ExpContext__Group_2__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2002:1: ( ( rule__ExpContext__Group_2__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2003:1: ( rule__ExpContext__Group_2__0 )?
            {
             before(grammarAccess.getExpContextAccess().getGroup_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2004:1: ( rule__ExpContext__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=12 && LA16_0<=17)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2004:2: rule__ExpContext__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExpContext__Group_2__0_in_rule__ExpContext__Group__2__Impl4107);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2014:1: rule__ExpContext__Group__3 : rule__ExpContext__Group__3__Impl ;
    public final void rule__ExpContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2018:1: ( rule__ExpContext__Group__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2019:2: rule__ExpContext__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExpContext__Group__3__Impl_in_rule__ExpContext__Group__34138);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2025:1: rule__ExpContext__Group__3__Impl : ( ( rule__ExpContext__Group_3__0 )? ) ;
    public final void rule__ExpContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2029:1: ( ( ( rule__ExpContext__Group_3__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2030:1: ( ( rule__ExpContext__Group_3__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2030:1: ( ( rule__ExpContext__Group_3__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2031:1: ( rule__ExpContext__Group_3__0 )?
            {
             before(grammarAccess.getExpContextAccess().getGroup_3()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2032:1: ( rule__ExpContext__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2032:2: rule__ExpContext__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExpContext__Group_3__0_in_rule__ExpContext__Group__3__Impl4165);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2050:1: rule__ExpContext__Group_2__0 : rule__ExpContext__Group_2__0__Impl rule__ExpContext__Group_2__1 ;
    public final void rule__ExpContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2054:1: ( rule__ExpContext__Group_2__0__Impl rule__ExpContext__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2055:2: rule__ExpContext__Group_2__0__Impl rule__ExpContext__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_2__0__Impl_in_rule__ExpContext__Group_2__04204);
            rule__ExpContext__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group_2__1_in_rule__ExpContext__Group_2__04207);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2062:1: rule__ExpContext__Group_2__0__Impl : ( ( rule__ExpContext__AllenOpAssignment_2_0 ) ) ;
    public final void rule__ExpContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2066:1: ( ( ( rule__ExpContext__AllenOpAssignment_2_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2067:1: ( ( rule__ExpContext__AllenOpAssignment_2_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2067:1: ( ( rule__ExpContext__AllenOpAssignment_2_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2068:1: ( rule__ExpContext__AllenOpAssignment_2_0 )
            {
             before(grammarAccess.getExpContextAccess().getAllenOpAssignment_2_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2069:1: ( rule__ExpContext__AllenOpAssignment_2_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2069:2: rule__ExpContext__AllenOpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ExpContext__AllenOpAssignment_2_0_in_rule__ExpContext__Group_2__0__Impl4234);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2079:1: rule__ExpContext__Group_2__1 : rule__ExpContext__Group_2__1__Impl ;
    public final void rule__ExpContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2083:1: ( rule__ExpContext__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2084:2: rule__ExpContext__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_2__1__Impl_in_rule__ExpContext__Group_2__14264);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2090:1: rule__ExpContext__Group_2__1__Impl : ( ( rule__ExpContext__TimeAssignment_2_1 ) ) ;
    public final void rule__ExpContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2094:1: ( ( ( rule__ExpContext__TimeAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2095:1: ( ( rule__ExpContext__TimeAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2095:1: ( ( rule__ExpContext__TimeAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2096:1: ( rule__ExpContext__TimeAssignment_2_1 )
            {
             before(grammarAccess.getExpContextAccess().getTimeAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2097:1: ( rule__ExpContext__TimeAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2097:2: rule__ExpContext__TimeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExpContext__TimeAssignment_2_1_in_rule__ExpContext__Group_2__1__Impl4291);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2111:1: rule__ExpContext__Group_3__0 : rule__ExpContext__Group_3__0__Impl rule__ExpContext__Group_3__1 ;
    public final void rule__ExpContext__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2115:1: ( rule__ExpContext__Group_3__0__Impl rule__ExpContext__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2116:2: rule__ExpContext__Group_3__0__Impl rule__ExpContext__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_3__0__Impl_in_rule__ExpContext__Group_3__04325);
            rule__ExpContext__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpContext__Group_3__1_in_rule__ExpContext__Group_3__04328);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2123:1: rule__ExpContext__Group_3__0__Impl : ( 'if' ) ;
    public final void rule__ExpContext__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2127:1: ( ( 'if' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2128:1: ( 'if' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2128:1: ( 'if' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2129:1: 'if'
            {
             before(grammarAccess.getExpContextAccess().getIfKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__ExpContext__Group_3__0__Impl4356); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2142:1: rule__ExpContext__Group_3__1 : rule__ExpContext__Group_3__1__Impl ;
    public final void rule__ExpContext__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2146:1: ( rule__ExpContext__Group_3__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2147:2: rule__ExpContext__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpContext__Group_3__1__Impl_in_rule__ExpContext__Group_3__14387);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2153:1: rule__ExpContext__Group_3__1__Impl : ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) ) ;
    public final void rule__ExpContext__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2157:1: ( ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2158:1: ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2158:1: ( ( rule__ExpContext__InitialConditionAssignment_3_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2159:1: ( rule__ExpContext__InitialConditionAssignment_3_1 )
            {
             before(grammarAccess.getExpContextAccess().getInitialConditionAssignment_3_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2160:1: ( rule__ExpContext__InitialConditionAssignment_3_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2160:2: rule__ExpContext__InitialConditionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ExpContext__InitialConditionAssignment_3_1_in_rule__ExpContext__Group_3__1__Impl4414);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2174:1: rule__AllenOp__Group__0 : rule__AllenOp__Group__0__Impl rule__AllenOp__Group__1 ;
    public final void rule__AllenOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2178:1: ( rule__AllenOp__Group__0__Impl rule__AllenOp__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2179:2: rule__AllenOp__Group__0__Impl rule__AllenOp__Group__1
            {
            pushFollow(FOLLOW_rule__AllenOp__Group__0__Impl_in_rule__AllenOp__Group__04448);
            rule__AllenOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllenOp__Group__1_in_rule__AllenOp__Group__04451);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2186:1: rule__AllenOp__Group__0__Impl : ( () ) ;
    public final void rule__AllenOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2190:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2191:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2191:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2192:1: ()
            {
             before(grammarAccess.getAllenOpAccess().getAllenOperatorAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2193:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2195:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2205:1: rule__AllenOp__Group__1 : rule__AllenOp__Group__1__Impl ;
    public final void rule__AllenOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2209:1: ( rule__AllenOp__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2210:2: rule__AllenOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AllenOp__Group__1__Impl_in_rule__AllenOp__Group__14509);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2216:1: rule__AllenOp__Group__1__Impl : ( ( rule__AllenOp__ValueAssignment_1 ) ) ;
    public final void rule__AllenOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2220:1: ( ( ( rule__AllenOp__ValueAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2221:1: ( ( rule__AllenOp__ValueAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2221:1: ( ( rule__AllenOp__ValueAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2222:1: ( rule__AllenOp__ValueAssignment_1 )
            {
             before(grammarAccess.getAllenOpAccess().getValueAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2223:1: ( rule__AllenOp__ValueAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2223:2: rule__AllenOp__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__AllenOp__ValueAssignment_1_in_rule__AllenOp__Group__1__Impl4536);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2237:1: rule__Fluent__Group__0 : rule__Fluent__Group__0__Impl rule__Fluent__Group__1 ;
    public final void rule__Fluent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2241:1: ( rule__Fluent__Group__0__Impl rule__Fluent__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2242:2: rule__Fluent__Group__0__Impl rule__Fluent__Group__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__04570);
            rule__Fluent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__04573);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2249:1: rule__Fluent__Group__0__Impl : ( ( rule__Fluent__FluentNameAssignment_0 ) ) ;
    public final void rule__Fluent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2253:1: ( ( ( rule__Fluent__FluentNameAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2254:1: ( ( rule__Fluent__FluentNameAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2254:1: ( ( rule__Fluent__FluentNameAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2255:1: ( rule__Fluent__FluentNameAssignment_0 )
            {
             before(grammarAccess.getFluentAccess().getFluentNameAssignment_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2256:1: ( rule__Fluent__FluentNameAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2256:2: rule__Fluent__FluentNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Fluent__FluentNameAssignment_0_in_rule__Fluent__Group__0__Impl4600);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2266:1: rule__Fluent__Group__1 : rule__Fluent__Group__1__Impl rule__Fluent__Group__2 ;
    public final void rule__Fluent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2270:1: ( rule__Fluent__Group__1__Impl rule__Fluent__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2271:2: rule__Fluent__Group__1__Impl rule__Fluent__Group__2
            {
            pushFollow(FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__14630);
            rule__Fluent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__14633);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2278:1: rule__Fluent__Group__1__Impl : ( ( rule__Fluent__Group_1__0 ) ) ;
    public final void rule__Fluent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2282:1: ( ( ( rule__Fluent__Group_1__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2283:1: ( ( rule__Fluent__Group_1__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2283:1: ( ( rule__Fluent__Group_1__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2284:1: ( rule__Fluent__Group_1__0 )
            {
             before(grammarAccess.getFluentAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2285:1: ( rule__Fluent__Group_1__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2285:2: rule__Fluent__Group_1__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl4660);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2295:1: rule__Fluent__Group__2 : rule__Fluent__Group__2__Impl rule__Fluent__Group__3 ;
    public final void rule__Fluent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2299:1: ( rule__Fluent__Group__2__Impl rule__Fluent__Group__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2300:2: rule__Fluent__Group__2__Impl rule__Fluent__Group__3
            {
            pushFollow(FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__24690);
            rule__Fluent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__24693);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2307:1: rule__Fluent__Group__2__Impl : ( ( rule__Fluent__Group_2__0 )? ) ;
    public final void rule__Fluent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2311:1: ( ( ( rule__Fluent__Group_2__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2312:1: ( ( rule__Fluent__Group_2__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2312:1: ( ( rule__Fluent__Group_2__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2313:1: ( rule__Fluent__Group_2__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2314:1: ( rule__Fluent__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2314:2: rule__Fluent__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl4720);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2324:1: rule__Fluent__Group__3 : rule__Fluent__Group__3__Impl ;
    public final void rule__Fluent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2328:1: ( rule__Fluent__Group__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2329:2: rule__Fluent__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__34751);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2335:1: rule__Fluent__Group__3__Impl : ( ( rule__Fluent__Group_3__0 )? ) ;
    public final void rule__Fluent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2339:1: ( ( ( rule__Fluent__Group_3__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2340:1: ( ( rule__Fluent__Group_3__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2340:1: ( ( rule__Fluent__Group_3__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2341:1: ( rule__Fluent__Group_3__0 )?
            {
             before(grammarAccess.getFluentAccess().getGroup_3()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2342:1: ( rule__Fluent__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2342:2: rule__Fluent__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl4778);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2360:1: rule__Fluent__Group_1__0 : rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 ;
    public final void rule__Fluent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2364:1: ( rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2365:2: rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__04817);
            rule__Fluent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__04820);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2372:1: rule__Fluent__Group_1__0__Impl : ( 'to' ) ;
    public final void rule__Fluent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2376:1: ( ( 'to' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2377:1: ( 'to' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2377:1: ( 'to' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2378:1: 'to'
            {
             before(grammarAccess.getFluentAccess().getToKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__Fluent__Group_1__0__Impl4848); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2391:1: rule__Fluent__Group_1__1 : rule__Fluent__Group_1__1__Impl ;
    public final void rule__Fluent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2395:1: ( rule__Fluent__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2396:2: rule__Fluent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__14879);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2402:1: rule__Fluent__Group_1__1__Impl : ( ( rule__Fluent__ValuePartAssignment_1_1 ) ) ;
    public final void rule__Fluent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2406:1: ( ( ( rule__Fluent__ValuePartAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2407:1: ( ( rule__Fluent__ValuePartAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2407:1: ( ( rule__Fluent__ValuePartAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2408:1: ( rule__Fluent__ValuePartAssignment_1_1 )
            {
             before(grammarAccess.getFluentAccess().getValuePartAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2409:1: ( rule__Fluent__ValuePartAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2409:2: rule__Fluent__ValuePartAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Fluent__ValuePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl4906);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2423:1: rule__Fluent__Group_2__0 : rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 ;
    public final void rule__Fluent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2427:1: ( rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2428:2: rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__04940);
            rule__Fluent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__04943);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2435:1: rule__Fluent__Group_2__0__Impl : ( 'in' ) ;
    public final void rule__Fluent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2439:1: ( ( 'in' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2440:1: ( 'in' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2440:1: ( 'in' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2441:1: 'in'
            {
             before(grammarAccess.getFluentAccess().getInKeyword_2_0()); 
            match(input,39,FOLLOW_39_in_rule__Fluent__Group_2__0__Impl4971); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2454:1: rule__Fluent__Group_2__1 : rule__Fluent__Group_2__1__Impl ;
    public final void rule__Fluent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2458:1: ( rule__Fluent__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2459:2: rule__Fluent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__15002);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2465:1: rule__Fluent__Group_2__1__Impl : ( ( rule__Fluent__TimePartAssignment_2_1 ) ) ;
    public final void rule__Fluent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2469:1: ( ( ( rule__Fluent__TimePartAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2470:1: ( ( rule__Fluent__TimePartAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2470:1: ( ( rule__Fluent__TimePartAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2471:1: ( rule__Fluent__TimePartAssignment_2_1 )
            {
             before(grammarAccess.getFluentAccess().getTimePartAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2472:1: ( rule__Fluent__TimePartAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2472:2: rule__Fluent__TimePartAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Fluent__TimePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl5029);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2486:1: rule__Fluent__Group_3__0 : rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 ;
    public final void rule__Fluent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2490:1: ( rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2491:2: rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__05063);
            rule__Fluent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__05066);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2498:1: rule__Fluent__Group_3__0__Impl : ( 'if' ) ;
    public final void rule__Fluent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2502:1: ( ( 'if' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2503:1: ( 'if' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2503:1: ( 'if' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2504:1: 'if'
            {
             before(grammarAccess.getFluentAccess().getIfKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__Fluent__Group_3__0__Impl5094); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2517:1: rule__Fluent__Group_3__1 : rule__Fluent__Group_3__1__Impl ;
    public final void rule__Fluent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2521:1: ( rule__Fluent__Group_3__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2522:2: rule__Fluent__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__15125);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2528:1: rule__Fluent__Group_3__1__Impl : ( ( rule__Fluent__CondPartAssignment_3_1 ) ) ;
    public final void rule__Fluent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2532:1: ( ( ( rule__Fluent__CondPartAssignment_3_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2533:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2533:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2534:1: ( rule__Fluent__CondPartAssignment_3_1 )
            {
             before(grammarAccess.getFluentAccess().getCondPartAssignment_3_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2535:1: ( rule__Fluent__CondPartAssignment_3_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2535:2: rule__Fluent__CondPartAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl5152);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2549:1: rule__ConditionRule__Group__0 : rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 ;
    public final void rule__ConditionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2553:1: ( rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2554:2: rule__ConditionRule__Group__0__Impl rule__ConditionRule__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__05186);
            rule__ConditionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__05189);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2561:1: rule__ConditionRule__Group__0__Impl : ( () ) ;
    public final void rule__ConditionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2565:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2566:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2566:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2567:1: ()
            {
             before(grammarAccess.getConditionRuleAccess().getExpressionAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2568:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2570:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2580:1: rule__ConditionRule__Group__1 : rule__ConditionRule__Group__1__Impl ;
    public final void rule__ConditionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2584:1: ( rule__ConditionRule__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2585:2: rule__ConditionRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__15247);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2591:1: rule__ConditionRule__Group__1__Impl : ( ( rule__ConditionRule__ConditionAssignment_1 ) ) ;
    public final void rule__ConditionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2595:1: ( ( ( rule__ConditionRule__ConditionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2596:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2596:1: ( ( rule__ConditionRule__ConditionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2597:1: ( rule__ConditionRule__ConditionAssignment_1 )
            {
             before(grammarAccess.getConditionRuleAccess().getConditionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2598:1: ( rule__ConditionRule__ConditionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2598:2: rule__ConditionRule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl5274);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2612:1: rule__ToRule__Group__0 : rule__ToRule__Group__0__Impl rule__ToRule__Group__1 ;
    public final void rule__ToRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2616:1: ( rule__ToRule__Group__0__Impl rule__ToRule__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2617:2: rule__ToRule__Group__0__Impl rule__ToRule__Group__1
            {
            pushFollow(FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__05308);
            rule__ToRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__05311);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2624:1: rule__ToRule__Group__0__Impl : ( () ) ;
    public final void rule__ToRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2628:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2629:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2629:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2630:1: ()
            {
             before(grammarAccess.getToRuleAccess().getExpressionAction_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2631:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2633:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2643:1: rule__ToRule__Group__1 : rule__ToRule__Group__1__Impl ;
    public final void rule__ToRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2647:1: ( rule__ToRule__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2648:2: rule__ToRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__15369);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2654:1: rule__ToRule__Group__1__Impl : ( ( rule__ToRule__ExpressionAssignment_1 ) ) ;
    public final void rule__ToRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2658:1: ( ( ( rule__ToRule__ExpressionAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2659:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2659:1: ( ( rule__ToRule__ExpressionAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2660:1: ( rule__ToRule__ExpressionAssignment_1 )
            {
             before(grammarAccess.getToRuleAccess().getExpressionAssignment_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2661:1: ( rule__ToRule__ExpressionAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2661:2: rule__ToRule__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl5396);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2675:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2679:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2680:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__05430);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__05433);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2687:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2691:1: ( ( ruleAnd ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2692:1: ( ruleAnd )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2692:1: ( ruleAnd )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2693:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl5460);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2704:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2708:1: ( rule__Or__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2709:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__15489);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2715:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2719:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2720:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2720:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2721:1: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2722:1: ( rule__Or__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2722:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl5516);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2736:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2740:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2741:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__05551);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__05554);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2748:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2752:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2753:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2753:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2754:1: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2755:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2757:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2767:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2771:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2772:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__15612);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__15615);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2779:1: rule__Or__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2783:1: ( ( 'OR' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2784:1: ( 'OR' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2784:1: ( 'OR' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2785:1: 'OR'
            {
             before(grammarAccess.getOrAccess().getORKeyword_1_1()); 
            match(input,40,FOLLOW_40_in_rule__Or__Group_1__1__Impl5643); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2798:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2802:1: ( rule__Or__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2803:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__25674);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2809:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2813:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2814:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2814:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2815:1: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2816:1: ( rule__Or__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2816:2: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl5701);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2832:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2836:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2837:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__05737);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__05740);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2844:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2848:1: ( ( ruleEquality ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2849:1: ( ruleEquality )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2849:1: ( ruleEquality )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2850:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__Group__0__Impl5767);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2861:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2865:1: ( rule__And__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2866:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__15796);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2872:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2876:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2877:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2877:1: ( ( rule__And__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2878:1: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2879:1: ( rule__And__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==41) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2879:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl5823);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2893:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2897:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2898:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__05858);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__05861);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2905:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2909:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2910:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2910:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2911:1: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2912:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2914:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2924:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2928:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2929:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__15919);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__15922);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2936:1: rule__And__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2940:1: ( ( 'AND' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2941:1: ( 'AND' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2941:1: ( 'AND' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2942:1: 'AND'
            {
             before(grammarAccess.getAndAccess().getANDKeyword_1_1()); 
            match(input,41,FOLLOW_41_in_rule__And__Group_1__1__Impl5950); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2955:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2959:1: ( rule__And__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2960:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__25981);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2966:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2970:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2971:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2971:1: ( ( rule__And__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2972:1: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2973:1: ( rule__And__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2973:2: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl6008);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2989:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2993:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2994:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__06044);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__06047);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3001:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3005:1: ( ( ruleComparison ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3006:1: ( ruleComparison )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3006:1: ( ruleComparison )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3007:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl6074);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3018:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3022:1: ( rule__Equality__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3023:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__16103);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3029:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3033:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3034:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3034:1: ( ( rule__Equality__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3035:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3036:1: ( rule__Equality__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=18 && LA22_0<=19)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3036:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl6130);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3050:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3054:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3055:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__06165);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__06168);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3062:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3066:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3067:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3067:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3068:1: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3069:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3071:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3081:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3085:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3086:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__16226);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__16229);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3093:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3097:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3098:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3098:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3099:1: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3100:1: ( rule__Equality__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3100:2: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl6256);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3110:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3114:1: ( rule__Equality__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3115:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__26286);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3121:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3125:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3126:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3126:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3127:1: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3128:1: ( rule__Equality__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3128:2: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl6313);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3144:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3148:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3149:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06349);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06352);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3156:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3160:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3161:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3161:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3162:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl6379);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3173:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3177:1: ( rule__Comparison__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3178:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16408);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3184:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3188:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3189:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3189:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3190:1: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3191:1: ( rule__Comparison__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=20 && LA23_0<=23)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3191:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6435);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3205:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3209:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3210:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06470);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06473);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3217:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3221:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3222:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3222:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3223:1: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3224:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3226:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3236:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3240:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3241:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16531);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__16534);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3248:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3252:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3253:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3253:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3254:1: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3255:1: ( rule__Comparison__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3255:2: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl6561);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3265:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3269:1: ( rule__Comparison__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3270:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__26591);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3276:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3280:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3281:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3281:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3282:1: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3283:1: ( rule__Comparison__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3283:2: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl6618);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3299:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3303:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3304:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__06654);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__06657);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3311:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3315:1: ( ( ruleMulOrDiv ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3316:1: ( ruleMulOrDiv )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3316:1: ( ruleMulOrDiv )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3317:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl6684);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3328:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3332:1: ( rule__PlusOrMinus__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3333:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__16713);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3339:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3343:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3344:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3344:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3345:1: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3346:1: ( rule__PlusOrMinus__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=42 && LA24_0<=43)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3346:2: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl6740);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3360:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3364:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3365:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__06775);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__06778);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3372:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3376:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3377:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3377:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3378:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3379:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3379:2: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl6805);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3389:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3393:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3394:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__16835);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3400:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3404:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3405:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3405:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3406:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3407:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3407:2: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl6862);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3421:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3425:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3426:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__06896);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__06899);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3433:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3437:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3438:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3438:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3439:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3440:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3442:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3452:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3456:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3457:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__16957);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3463:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3467:1: ( ( '+' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3468:1: ( '+' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3468:1: ( '+' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3469:1: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,42,FOLLOW_42_in_rule__PlusOrMinus__Group_1_0_0__1__Impl6985); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3486:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3490:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3491:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__07020);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__07023);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3498:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3502:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3503:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3503:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3504:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3505:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3507:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3517:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3521:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3522:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__17081);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3528:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3532:1: ( ( '-' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3533:1: ( '-' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3533:1: ( '-' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3534:1: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,43,FOLLOW_43_in_rule__PlusOrMinus__Group_1_0_1__1__Impl7109); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3551:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3555:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3556:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__07144);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__07147);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3563:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3567:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3568:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3568:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3569:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl7174);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3580:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3584:1: ( rule__MulOrDiv__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3585:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__17203);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3591:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3595:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3596:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3596:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3597:1: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3598:1: ( rule__MulOrDiv__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=24 && LA25_0<=27)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3598:2: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl7230);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3612:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3616:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3617:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__07265);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__07268);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3624:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3628:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3629:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3629:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3630:1: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3631:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3633:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3643:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3647:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3648:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__17326);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__17329);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3655:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3659:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3660:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3660:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3661:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3662:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3662:2: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl7356);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3672:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3676:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3677:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__27386);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3683:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3687:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3688:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3688:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3689:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3690:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3690:2: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl7413);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3706:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3710:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3711:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__07449);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__07452);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3718:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3722:1: ( ( '(' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3723:1: ( '(' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3723:1: ( '(' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3724:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__Primary__Group_0__0__Impl7480); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3737:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3741:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3742:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__17511);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__17514);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3749:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3753:1: ( ( ruleExpression ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3754:1: ( ruleExpression )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3754:1: ( ruleExpression )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3755:1: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl7541);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3766:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3770:1: ( rule__Primary__Group_0__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3771:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__27570);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3777:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3781:1: ( ( ')' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3782:1: ( ')' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3782:1: ( ')' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3783:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,33,FOLLOW_33_in_rule__Primary__Group_0__2__Impl7598); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3802:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3806:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3807:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__07635);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__07638);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3814:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3818:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3819:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3819:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3820:1: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3821:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3823:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3833:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3837:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3838:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__17696);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__17699);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3845:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3849:1: ( ( '!' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3850:1: ( '!' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3850:1: ( '!' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3851:1: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,44,FOLLOW_44_in_rule__Primary__Group_1__1__Impl7727); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3864:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3868:1: ( rule__Primary__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3869:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__27758);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3875:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3879:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3880:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3880:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3881:1: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3882:1: ( rule__Primary__ExpressionAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3882:2: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl7785);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3898:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3902:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3903:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__07821);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__07824);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3910:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3914:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3915:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3915:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3916:1: ()
            {
             before(grammarAccess.getAtomicAccess().getFloatConstantAction_0_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3917:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3919:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3929:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3933:1: ( rule__Atomic__Group_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3934:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__17882);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3940:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3944:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3945:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3945:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3946:1: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3947:1: ( rule__Atomic__ValueAssignment_0_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3947:2: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl7909);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3961:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3965:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3966:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__07943);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__07946);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3973:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3977:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3978:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3978:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3979:1: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3980:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3982:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3992:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3996:1: ( rule__Atomic__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3997:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__18004);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4003:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4007:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4008:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4008:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4009:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4010:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4010:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl8031);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4024:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4028:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4029:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__08065);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__08068);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4036:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4040:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4041:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4041:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4042:1: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4043:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4045:1: 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4055:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4059:1: ( rule__Atomic__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4060:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__18126);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4066:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4070:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4071:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4071:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4072:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4073:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4073:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl8153);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4087:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4091:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4092:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__08187);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__08190);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4099:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4103:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4104:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4104:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4105:1: ()
            {
             before(grammarAccess.getAtomicAccess().getFeatureRefAction_3_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4106:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4108:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getFeatureRefAction_3_0()); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4118:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4122:1: ( rule__Atomic__Group_3__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4123:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__18248);
            rule__Atomic__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4129:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ParamAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4133:1: ( ( ( rule__Atomic__ParamAssignment_3_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4134:1: ( ( rule__Atomic__ParamAssignment_3_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4134:1: ( ( rule__Atomic__ParamAssignment_3_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4135:1: ( rule__Atomic__ParamAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getParamAssignment_3_1()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4136:1: ( rule__Atomic__ParamAssignment_3_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4136:2: rule__Atomic__ParamAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Atomic__ParamAssignment_3_1_in_rule__Atomic__Group_3__1__Impl8275);
            rule__Atomic__ParamAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getParamAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Atomic__Group_4__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4150:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4154:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4155:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__08309);
            rule__Atomic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__08312);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4162:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4166:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4167:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4167:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4168:1: ()
            {
             before(grammarAccess.getAtomicAccess().getFluentRefAction_4_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4169:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4171:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getFluentRefAction_4_0()); 

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4181:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4185:1: ( rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4186:2: rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__18370);
            rule__Atomic__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_4__2_in_rule__Atomic__Group_4__18373);
            rule__Atomic__Group_4__2();

            state._fsp--;


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4193:1: rule__Atomic__Group_4__1__Impl : ( '[' ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4197:1: ( ( '[' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4198:1: ( '[' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4198:1: ( '[' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4199:1: '['
            {
             before(grammarAccess.getAtomicAccess().getLeftSquareBracketKeyword_4_1()); 
            match(input,45,FOLLOW_45_in_rule__Atomic__Group_4__1__Impl8401); 
             after(grammarAccess.getAtomicAccess().getLeftSquareBracketKeyword_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Atomic__Group_4__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4212:1: rule__Atomic__Group_4__2 : rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3 ;
    public final void rule__Atomic__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4216:1: ( rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4217:2: rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__2__Impl_in_rule__Atomic__Group_4__28432);
            rule__Atomic__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_4__3_in_rule__Atomic__Group_4__28435);
            rule__Atomic__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__2"


    // $ANTLR start "rule__Atomic__Group_4__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4224:1: rule__Atomic__Group_4__2__Impl : ( ( rule__Atomic__ValueAssignment_4_2 ) ) ;
    public final void rule__Atomic__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4228:1: ( ( ( rule__Atomic__ValueAssignment_4_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4229:1: ( ( rule__Atomic__ValueAssignment_4_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4229:1: ( ( rule__Atomic__ValueAssignment_4_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4230:1: ( rule__Atomic__ValueAssignment_4_2 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_4_2()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4231:1: ( rule__Atomic__ValueAssignment_4_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4231:2: rule__Atomic__ValueAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_4_2_in_rule__Atomic__Group_4__2__Impl8462);
            rule__Atomic__ValueAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__2__Impl"


    // $ANTLR start "rule__Atomic__Group_4__3"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4241:1: rule__Atomic__Group_4__3 : rule__Atomic__Group_4__3__Impl ;
    public final void rule__Atomic__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4245:1: ( rule__Atomic__Group_4__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4246:2: rule__Atomic__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__3__Impl_in_rule__Atomic__Group_4__38492);
            rule__Atomic__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__3"


    // $ANTLR start "rule__Atomic__Group_4__3__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4252:1: rule__Atomic__Group_4__3__Impl : ( ']' ) ;
    public final void rule__Atomic__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4256:1: ( ( ']' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4257:1: ( ']' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4257:1: ( ']' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4258:1: ']'
            {
             before(grammarAccess.getAtomicAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,46,FOLLOW_46_in_rule__Atomic__Group_4__3__Impl8520); 
             after(grammarAccess.getAtomicAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__3__Impl"


    // $ANTLR start "rule__EceModel__StatementsAssignment"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4280:1: rule__EceModel__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__EceModel__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4284:1: ( ( ruleStatement ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4285:1: ( ruleStatement )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4285:1: ( ruleStatement )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4286:1: ruleStatement
            {
             before(grammarAccess.getEceModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__EceModel__StatementsAssignment8564);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4295:1: rule__Statement__EventAssignment_1 : ( ruleEvent ) ;
    public final void rule__Statement__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4299:1: ( ( ruleEvent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4300:1: ( ruleEvent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4300:1: ( ruleEvent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4301:1: ruleEvent
            {
             before(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_18595);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4310:1: rule__Statement__ContextsListAssignment_2 : ( ruleContextsList ) ;
    public final void rule__Statement__ContextsListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4314:1: ( ( ruleContextsList ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4315:1: ( ruleContextsList )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4315:1: ( ruleContextsList )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4316:1: ruleContextsList
            {
             before(grammarAccess.getStatementAccess().getContextsListContextsListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleContextsList_in_rule__Statement__ContextsListAssignment_28626);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4325:1: rule__Event__EventNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4329:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4330:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4330:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4331:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_08657); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4340:1: rule__Event__ParamsAssignment_1_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4344:1: ( ( ruleEventFeature ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4345:1: ( ruleEventFeature )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4345:1: ( ruleEventFeature )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4346:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamsEventFeatureParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_18688);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4355:1: rule__Event__ParamsAssignment_1_2_1 : ( ruleEventFeature ) ;
    public final void rule__Event__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4359:1: ( ( ruleEventFeature ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4360:1: ( ruleEventFeature )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4360:1: ( ruleEventFeature )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4361:1: ruleEventFeature
            {
             before(grammarAccess.getEventAccess().getParamsEventFeatureParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_2_18719);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4370:1: rule__EventFeature__NameAssignment : ( RULE_ID ) ;
    public final void rule__EventFeature__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4374:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4375:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4375:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4376:1: RULE_ID
            {
             before(grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment8750); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4385:1: rule__ContextsList__EcContextsListAssignment_0 : ( ruleEcContextsList ) ;
    public final void rule__ContextsList__EcContextsListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4389:1: ( ( ruleEcContextsList ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4390:1: ( ruleEcContextsList )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4390:1: ( ruleEcContextsList )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4391:1: ruleEcContextsList
            {
             before(grammarAccess.getContextsListAccess().getEcContextsListEcContextsListParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEcContextsList_in_rule__ContextsList__EcContextsListAssignment_08781);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4400:1: rule__ContextsList__ExpContextsListAssignment_1_1 : ( ruleExpContextsList ) ;
    public final void rule__ContextsList__ExpContextsListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4404:1: ( ( ruleExpContextsList ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4405:1: ( ruleExpContextsList )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4405:1: ( ruleExpContextsList )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4406:1: ruleExpContextsList
            {
             before(grammarAccess.getContextsListAccess().getExpContextsListExpContextsListParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpContextsList_in_rule__ContextsList__ExpContextsListAssignment_1_18812);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4415:1: rule__EcContextsList__EcContextsAssignment_0 : ( ruleEcContext ) ;
    public final void rule__EcContextsList__EcContextsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4419:1: ( ( ruleEcContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4420:1: ( ruleEcContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4420:1: ( ruleEcContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4421:1: ruleEcContext
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_08843);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4430:1: rule__EcContextsList__EcContextsAssignment_1_1 : ( ruleEcContext ) ;
    public final void rule__EcContextsList__EcContextsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4434:1: ( ( ruleEcContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4435:1: ( ruleEcContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4435:1: ( ruleEcContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4436:1: ruleEcContext
            {
             before(grammarAccess.getEcContextsListAccess().getEcContextsEcContextParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_1_18874);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4445:1: rule__ExpContextsList__ExpContextsAssignment_0 : ( ruleExpContext ) ;
    public final void rule__ExpContextsList__ExpContextsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4449:1: ( ( ruleExpContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4450:1: ( ruleExpContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4450:1: ( ruleExpContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4451:1: ruleExpContext
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_08905);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4460:1: rule__ExpContextsList__ExpContextsAssignment_1_1 : ( ruleExpContext ) ;
    public final void rule__ExpContextsList__ExpContextsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4464:1: ( ( ruleExpContext ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4465:1: ( ruleExpContext )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4465:1: ( ruleExpContext )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4466:1: ruleExpContext
            {
             before(grammarAccess.getExpContextsListAccess().getExpContextsExpContextParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_1_18936);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4475:1: rule__EcContext__FluentAssignment_1 : ( ruleFluent ) ;
    public final void rule__EcContext__FluentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4479:1: ( ( ruleFluent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4480:1: ( ruleFluent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4480:1: ( ruleFluent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4481:1: ruleFluent
            {
             before(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_18967);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4490:1: rule__EcContext__FluentAssignment_2_1 : ( ruleFluent ) ;
    public final void rule__EcContext__FluentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4494:1: ( ( ruleFluent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4495:1: ( ruleFluent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4495:1: ( ruleFluent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4496:1: ruleFluent
            {
             before(grammarAccess.getEcContextAccess().getFluentFluentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_2_18998);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4505:1: rule__ExpContext__FinalConditionAssignment_1 : ( ruleConditionRule ) ;
    public final void rule__ExpContext__FinalConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4509:1: ( ( ruleConditionRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4510:1: ( ruleConditionRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4510:1: ( ruleConditionRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4511:1: ruleConditionRule
            {
             before(grammarAccess.getExpContextAccess().getFinalConditionConditionRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__ExpContext__FinalConditionAssignment_19029);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4520:1: rule__ExpContext__AllenOpAssignment_2_0 : ( ruleAllenOp ) ;
    public final void rule__ExpContext__AllenOpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4524:1: ( ( ruleAllenOp ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4525:1: ( ruleAllenOp )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4525:1: ( ruleAllenOp )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4526:1: ruleAllenOp
            {
             before(grammarAccess.getExpContextAccess().getAllenOpAllenOpParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleAllenOp_in_rule__ExpContext__AllenOpAssignment_2_09060);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4535:1: rule__ExpContext__TimeAssignment_2_1 : ( ruleTime ) ;
    public final void rule__ExpContext__TimeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4539:1: ( ( ruleTime ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4540:1: ( ruleTime )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4540:1: ( ruleTime )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4541:1: ruleTime
            {
             before(grammarAccess.getExpContextAccess().getTimeTimeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleTime_in_rule__ExpContext__TimeAssignment_2_19091);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getExpContextAccess().getTimeTimeParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4550:1: rule__ExpContext__InitialConditionAssignment_3_1 : ( ruleConditionRule ) ;
    public final void rule__ExpContext__InitialConditionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4554:1: ( ( ruleConditionRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4555:1: ( ruleConditionRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4555:1: ( ruleConditionRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4556:1: ruleConditionRule
            {
             before(grammarAccess.getExpContextAccess().getInitialConditionConditionRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__ExpContext__InitialConditionAssignment_3_19122);
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


    // $ANTLR start "rule__Time__TAssignment"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4565:1: rule__Time__TAssignment : ( RULE_INT ) ;
    public final void rule__Time__TAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4569:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4570:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4570:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4571:1: RULE_INT
            {
             before(grammarAccess.getTimeAccess().getTINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Time__TAssignment9153); 
             after(grammarAccess.getTimeAccess().getTINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__TAssignment"


    // $ANTLR start "rule__AllenOp__ValueAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4580:1: rule__AllenOp__ValueAssignment_1 : ( ( rule__AllenOp__ValueAlternatives_1_0 ) ) ;
    public final void rule__AllenOp__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4584:1: ( ( ( rule__AllenOp__ValueAlternatives_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4585:1: ( ( rule__AllenOp__ValueAlternatives_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4585:1: ( ( rule__AllenOp__ValueAlternatives_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4586:1: ( rule__AllenOp__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getAllenOpAccess().getValueAlternatives_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4587:1: ( rule__AllenOp__ValueAlternatives_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4587:2: rule__AllenOp__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AllenOp__ValueAlternatives_1_0_in_rule__AllenOp__ValueAssignment_19184);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4596:1: rule__Fluent__FluentNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Fluent__FluentNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4600:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4601:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4601:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4602:1: RULE_ID
            {
             before(grammarAccess.getFluentAccess().getFluentNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fluent__FluentNameAssignment_09217); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4611:1: rule__Fluent__ValuePartAssignment_1_1 : ( ruleToRule ) ;
    public final void rule__Fluent__ValuePartAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4615:1: ( ( ruleToRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4616:1: ( ruleToRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4616:1: ( ruleToRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4617:1: ruleToRule
            {
             before(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_1_19248);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4626:1: rule__Fluent__TimePartAssignment_2_1 : ( ruleInRule ) ;
    public final void rule__Fluent__TimePartAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4630:1: ( ( ruleInRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4631:1: ( ruleInRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4631:1: ( ruleInRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4632:1: ruleInRule
            {
             before(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_2_19279);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4641:1: rule__Fluent__CondPartAssignment_3_1 : ( ruleConditionRule ) ;
    public final void rule__Fluent__CondPartAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4645:1: ( ( ruleConditionRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4646:1: ( ruleConditionRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4646:1: ( ruleConditionRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4647:1: ruleConditionRule
            {
             before(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_19310);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4656:1: rule__ConditionRule__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ConditionRule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4660:1: ( ( ruleExpression ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4661:1: ( ruleExpression )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4661:1: ( ruleExpression )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4662:1: ruleExpression
            {
             before(grammarAccess.getConditionRuleAccess().getConditionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_19341);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4671:1: rule__ToRule__ExpressionAssignment_1 : ( rulePlusOrMinus ) ;
    public final void rule__ToRule__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4675:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4676:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4676:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4677:1: rulePlusOrMinus
            {
             before(grammarAccess.getToRuleAccess().getExpressionPlusOrMinusParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_19372);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4686:1: rule__InRule__TimeAssignment : ( RULE_INT ) ;
    public final void rule__InRule__TimeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4690:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4691:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4691:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4692:1: RULE_INT
            {
             before(grammarAccess.getInRuleAccess().getTimeINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InRule__TimeAssignment9403); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4701:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4705:1: ( ( ruleAnd ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4706:1: ( ruleAnd )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4706:1: ( ruleAnd )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4707:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_29434);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4716:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4720:1: ( ( ruleEquality ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4721:1: ( ruleEquality )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4721:1: ( ruleEquality )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4722:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_29465);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4731:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4735:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4736:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4736:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4737:1: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4738:1: ( rule__Equality__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4738:2: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_19496);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4747:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4751:1: ( ( ruleComparison ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4752:1: ( ruleComparison )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4752:1: ( ruleComparison )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4753:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_29529);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4762:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4766:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4767:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4767:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4768:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4769:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4769:2: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_19560);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4778:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4782:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4783:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4783:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4784:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_29593);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4793:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4797:1: ( ( ruleMulOrDiv ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4798:1: ( ruleMulOrDiv )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4798:1: ( ruleMulOrDiv )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4799:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_19624);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4808:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4812:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4813:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4813:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4814:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4815:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4815:2: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_19655);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4824:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4828:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4829:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4829:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4830:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_29688);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4839:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4843:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4844:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4844:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4845:1: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_29719);
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4854:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_FLOAT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4858:1: ( ( RULE_FLOAT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4859:1: ( RULE_FLOAT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4859:1: ( RULE_FLOAT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4860:1: RULE_FLOAT
            {
             before(grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_0_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_19750); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4869:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4873:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4874:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4874:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4875:1: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_19781); 
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4884:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4888:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4889:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4889:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4890:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4891:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4891:2: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_19812);
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


    // $ANTLR start "rule__Atomic__ParamAssignment_3_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4900:1: rule__Atomic__ParamAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__ParamAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4904:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4905:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4905:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4906:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getParamEventFeatureCrossReference_3_1_0()); 
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4907:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4908:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getParamEventFeatureIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__ParamAssignment_3_19849); 
             after(grammarAccess.getAtomicAccess().getParamEventFeatureIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getParamEventFeatureCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ParamAssignment_3_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_4_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4919:1: rule__Atomic__ValueAssignment_4_2 : ( RULE_ID ) ;
    public final void rule__Atomic__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4923:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4924:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4924:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4925:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getValueIDTerminalRuleCall_4_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__ValueAssignment_4_29884); 
             after(grammarAccess.getAtomicAccess().getValueIDTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_4_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleEceModel_in_entryRuleEceModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEceModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EceModel__StatementsAssignment_in_ruleEceModel94 = new BitSet(new long[]{0x0000000040000002L});
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
    public static final BitSet FOLLOW_ruleTime_in_entryRuleTime602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTime609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Time__TAssignment_in_ruleTime635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllenOp_in_entryRuleAllenOp662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllenOp669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__0_in_ruleAllenOp695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0_in_ruleFluent755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_entryRuleConditionRule782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionRule789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__0_in_ruleConditionRule815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_entryRuleToRule842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToRule849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__0_in_ruleToRule875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_entryRuleInRule902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInRule909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__TimeAssignment_in_ruleInRule935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0_in_ruleAnd1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0_in_ruleEquality1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AllenOp__ValueAlternatives_1_01511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AllenOp__ValueAlternatives_1_01531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AllenOp__ValueAlternatives_1_01551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AllenOp__ValueAlternatives_1_01571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AllenOp__ValueAlternatives_1_01591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AllenOp__ValueAlternatives_1_01611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Equality__OpAlternatives_1_1_01646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Equality__OpAlternatives_1_1_01666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Comparison__OpAlternatives_1_1_01701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Comparison__OpAlternatives_1_1_01721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Comparison__OpAlternatives_1_1_01741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Comparison__OpAlternatives_1_1_01761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_01795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_01813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MulOrDiv__OpAlternatives_1_1_01847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MulOrDiv__OpAlternatives_1_1_01867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MulOrDiv__OpAlternatives_1_1_01887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MulOrDiv__OpAlternatives_1_1_01907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Primary__Alternatives1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Atomic__ValueAlternatives_2_1_02115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Atomic__ValueAlternatives_2_1_02135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Statement__Group__0__Impl2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12229 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22289 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ContextsListAssignment_2_in_rule__Statement__Group__2__Impl2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__32349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group__3__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02416 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventNameAssignment_0_in_rule__Event__Group__0__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__02538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__02541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Event__Group_1__0__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__12600 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__2_in_rule__Event__Group_1__12603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParamsAssignment_1_1_in_rule__Event__Group_1__1__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__2__Impl_in_rule__Event__Group_1__22660 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__3_in_rule__Event__Group_1__22663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__0_in_rule__Event__Group_1__2__Impl2690 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__3__Impl_in_rule__Event__Group_1__32721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Event__Group_1__3__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__0__Impl_in_rule__Event__Group_1_2__02788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__1_in_rule__Event__Group_1_2__02791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Event__Group_1_2__0__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1_2__1__Impl_in_rule__Event__Group_1_2__12850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ParamsAssignment_1_2_1_in_rule__Event__Group_1_2__1__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group__0__Impl_in_rule__ContextsList__Group__02911 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ContextsList__Group__1_in_rule__ContextsList__Group__02914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__EcContextsListAssignment_0_in_rule__ContextsList__Group__0__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group__1__Impl_in_rule__ContextsList__Group__12971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group_1__0_in_rule__ContextsList__Group__1__Impl2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group_1__0__Impl_in_rule__ContextsList__Group_1__03033 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ContextsList__Group_1__1_in_rule__ContextsList__Group_1__03036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ContextsList__Group_1__0__Impl3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__Group_1__1__Impl_in_rule__ContextsList__Group_1__13095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextsList__ExpContextsListAssignment_1_1_in_rule__ContextsList__Group_1__1__Impl3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group__0__Impl_in_rule__EcContextsList__Group__03156 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group__1_in_rule__EcContextsList__Group__03159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__EcContextsAssignment_0_in_rule__EcContextsList__Group__0__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group__1__Impl_in_rule__EcContextsList__Group__13216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__0_in_rule__EcContextsList__Group__1__Impl3243 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__0__Impl_in_rule__EcContextsList__Group_1__03278 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__1_in_rule__EcContextsList__Group_1__03281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EcContextsList__Group_1__0__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__Group_1__1__Impl_in_rule__EcContextsList__Group_1__13340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContextsList__EcContextsAssignment_1_1_in_rule__EcContextsList__Group_1__1__Impl3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group__0__Impl_in_rule__ExpContextsList__Group__03401 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group__1_in_rule__ExpContextsList__Group__03404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__ExpContextsAssignment_0_in_rule__ExpContextsList__Group__0__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group__1__Impl_in_rule__ExpContextsList__Group__13461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__0_in_rule__ExpContextsList__Group__1__Impl3488 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__0__Impl_in_rule__ExpContextsList__Group_1__03523 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__1_in_rule__ExpContextsList__Group_1__03526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ExpContextsList__Group_1__0__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__Group_1__1__Impl_in_rule__ExpContextsList__Group_1__13585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContextsList__ExpContextsAssignment_1_1_in_rule__ExpContextsList__Group_1__1__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group__0__Impl_in_rule__EcContext__Group__03646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EcContext__Group__1_in_rule__EcContext__Group__03649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EcContext__Group__0__Impl3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group__1__Impl_in_rule__EcContext__Group__13708 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EcContext__Group__2_in_rule__EcContext__Group__13711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__FluentAssignment_1_in_rule__EcContext__Group__1__Impl3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group__2__Impl_in_rule__EcContext__Group__23768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group_2__0_in_rule__EcContext__Group__2__Impl3795 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group_2__0__Impl_in_rule__EcContext__Group_2__03832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EcContext__Group_2__1_in_rule__EcContext__Group_2__03835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EcContext__Group_2__0__Impl3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__Group_2__1__Impl_in_rule__EcContext__Group_2__13894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EcContext__FluentAssignment_2_1_in_rule__EcContext__Group_2__1__Impl3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__0__Impl_in_rule__ExpContext__Group__03955 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__1_in_rule__ExpContext__Group__03958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExpContext__Group__0__Impl3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__1__Impl_in_rule__ExpContext__Group__14017 = new BitSet(new long[]{0x000000200003F000L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__2_in_rule__ExpContext__Group__14020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__FinalConditionAssignment_1_in_rule__ExpContext__Group__1__Impl4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__2__Impl_in_rule__ExpContext__Group__24077 = new BitSet(new long[]{0x000000200003F000L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__3_in_rule__ExpContext__Group__24080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__0_in_rule__ExpContext__Group__2__Impl4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group__3__Impl_in_rule__ExpContext__Group__34138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__0_in_rule__ExpContext__Group__3__Impl4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__0__Impl_in_rule__ExpContext__Group_2__04204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__1_in_rule__ExpContext__Group_2__04207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__AllenOpAssignment_2_0_in_rule__ExpContext__Group_2__0__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_2__1__Impl_in_rule__ExpContext__Group_2__14264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__TimeAssignment_2_1_in_rule__ExpContext__Group_2__1__Impl4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__0__Impl_in_rule__ExpContext__Group_3__04325 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__1_in_rule__ExpContext__Group_3__04328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ExpContext__Group_3__0__Impl4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__Group_3__1__Impl_in_rule__ExpContext__Group_3__14387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpContext__InitialConditionAssignment_3_1_in_rule__ExpContext__Group_3__1__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__0__Impl_in_rule__AllenOp__Group__04448 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__1_in_rule__AllenOp__Group__04451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__Group__1__Impl_in_rule__AllenOp__Group__14509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__ValueAssignment_1_in_rule__AllenOp__Group__1__Impl4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__04570 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__04573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__FluentNameAssignment_0_in_rule__Fluent__Group__0__Impl4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__14630 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__14633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__24690 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__24693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__34751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__04817 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__04820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Fluent__Group_1__0__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__14879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__ValuePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__04940 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__04943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Fluent__Group_2__0__Impl4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__15002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__TimePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__05063 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__05066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Fluent__Group_3__0__Impl5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__15125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__0__Impl_in_rule__ConditionRule__Group__05186 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1_in_rule__ConditionRule__Group__05189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__Group__1__Impl_in_rule__ConditionRule__Group__15247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__ConditionAssignment_1_in_rule__ConditionRule__Group__1__Impl5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__0__Impl_in_rule__ToRule__Group__05308 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1_in_rule__ToRule__Group__05311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group__1__Impl_in_rule__ToRule__Group__15369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Group__1__Impl5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__05430 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__05433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__15489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl5516 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__05551 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__05554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__15612 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__15615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Or__Group_1__1__Impl5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__25674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__05737 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__05740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__Group__0__Impl5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__15796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl5823 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__05858 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__05861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__15919 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__15922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__And__Group_1__1__Impl5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__25981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__06044 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__06047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl6074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__16103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl6130 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__06165 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__06168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__16226 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__16229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__26286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06349 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl6379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6435 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06470 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16531 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__16534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl6561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__26591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__06654 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__06657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__16713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl6740 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__06775 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__06778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl6805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__16835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__06896 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__06899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__16957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__PlusOrMinus__Group_1_0_0__1__Impl6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__07020 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__07023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__17081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__PlusOrMinus__Group_1_0_1__1__Impl7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__07144 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__07147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__17203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl7230 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__07265 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__07268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__17326 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__17329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl7356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__27386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl7413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__07449 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__07452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Primary__Group_0__0__Impl7480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__17511 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__17514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl7541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__27570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Primary__Group_0__2__Impl7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__07635 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__07638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__17696 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__17699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Primary__Group_1__1__Impl7727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__27758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl7785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__07821 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__07824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__17882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl7909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__07943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__07946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__18004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl8031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__08065 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__08068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__18126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl8153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__08187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__08190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__18248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ParamAssignment_3_1_in_rule__Atomic__Group_3__1__Impl8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__08309 = new BitSet(new long[]{0x0000300130000070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__08312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__18370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__2_in_rule__Atomic__Group_4__18373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Atomic__Group_4__1__Impl8401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__2__Impl_in_rule__Atomic__Group_4__28432 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__3_in_rule__Atomic__Group_4__28435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_4_2_in_rule__Atomic__Group_4__2__Impl8462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__3__Impl_in_rule__Atomic__Group_4__38492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Atomic__Group_4__3__Impl8520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__EceModel__StatementsAssignment8564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_18595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextsList_in_rule__Statement__ContextsListAssignment_28626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_08657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_18688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventFeature_in_rule__Event__ParamsAssignment_1_2_18719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventFeature__NameAssignment8750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContextsList_in_rule__ContextsList__EcContextsListAssignment_08781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContextsList_in_rule__ContextsList__ExpContextsListAssignment_1_18812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_08843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEcContext_in_rule__EcContextsList__EcContextsAssignment_1_18874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_08905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpContext_in_rule__ExpContextsList__ExpContextsAssignment_1_18936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_18967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__EcContext__FluentAssignment_2_18998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__ExpContext__FinalConditionAssignment_19029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllenOp_in_rule__ExpContext__AllenOpAssignment_2_09060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_in_rule__ExpContext__TimeAssignment_2_19091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__ExpContext__InitialConditionAssignment_3_19122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Time__TAssignment9153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllenOp__ValueAlternatives_1_0_in_rule__AllenOp__ValueAssignment_19184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fluent__FluentNameAssignment_09217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_1_19248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_2_19279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_19310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionRule__ConditionAssignment_19341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__ToRule__ExpressionAssignment_19372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InRule__TimeAssignment9403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_29434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_29465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_19496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_29529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_19560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_29593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_19624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_19655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_29688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_29719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Atomic__ValueAssignment_0_19750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_19781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_19812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__ParamAssignment_3_19849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__ValueAssignment_4_29884 = new BitSet(new long[]{0x0000000000000002L});

}