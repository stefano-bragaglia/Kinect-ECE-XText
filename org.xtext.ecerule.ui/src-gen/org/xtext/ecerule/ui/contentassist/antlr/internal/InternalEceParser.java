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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FLOAT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'on'", "'set'", "';'", "','", "'to'", "'in'", "'if'", "'OR'", "'AND'", "'true'", "'false'", "'switch'", "'now'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_FLOAT=4;
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




    // $ANTLR start "entryRuleDroolsModel"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:61:1: entryRuleDroolsModel : ruleDroolsModel EOF ;
    public final void entryRuleDroolsModel() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:62:1: ( ruleDroolsModel EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:63:1: ruleDroolsModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDroolsModelRule()); 
            }
            pushFollow(FOLLOW_ruleDroolsModel_in_entryRuleDroolsModel67);
            ruleDroolsModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDroolsModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDroolsModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDroolsModel"


    // $ANTLR start "ruleDroolsModel"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:70:1: ruleDroolsModel : ( ( rule__DroolsModel__StatementsAssignment )* ) ;
    public final void ruleDroolsModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:74:2: ( ( ( rule__DroolsModel__StatementsAssignment )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:75:1: ( ( rule__DroolsModel__StatementsAssignment )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:75:1: ( ( rule__DroolsModel__StatementsAssignment )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:76:1: ( rule__DroolsModel__StatementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDroolsModelAccess().getStatementsAssignment()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:77:1: ( rule__DroolsModel__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:77:2: rule__DroolsModel__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__DroolsModel__StatementsAssignment_in_ruleDroolsModel100);
            	    rule__DroolsModel__StatementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDroolsModelAccess().getStatementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDroolsModel"


    // $ANTLR start "entryRuleStatement"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:89:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:90:1: ( ruleStatement EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:91:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement128);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement135); if (state.failed) return ;

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:98:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:102:2: ( ( ( rule__Statement__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:103:1: ( ( rule__Statement__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:103:1: ( ( rule__Statement__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:104:1: ( rule__Statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getGroup()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:105:1: ( rule__Statement__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:105:2: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_rule__Statement__Group__0_in_ruleStatement161);
            rule__Statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:117:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:118:1: ( ruleEvent EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:119:1: ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent188);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent195); if (state.failed) return ;

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:126:1: ruleEvent : ( ( rule__Event__EventNameAssignment ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:130:2: ( ( ( rule__Event__EventNameAssignment ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:131:1: ( ( rule__Event__EventNameAssignment ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:131:1: ( ( rule__Event__EventNameAssignment ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:132:1: ( rule__Event__EventNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getEventNameAssignment()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:133:1: ( rule__Event__EventNameAssignment )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:133:2: rule__Event__EventNameAssignment
            {
            pushFollow(FOLLOW_rule__Event__EventNameAssignment_in_ruleEvent221);
            rule__Event__EventNameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getEventNameAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleFluent"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:145:1: entryRuleFluent : ruleFluent EOF ;
    public final void entryRuleFluent() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:146:1: ( ruleFluent EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:147:1: ruleFluent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentRule()); 
            }
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent248);
            ruleFluent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent255); if (state.failed) return ;

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:154:1: ruleFluent : ( ( rule__Fluent__Group__0 ) ) ;
    public final void ruleFluent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:158:2: ( ( ( rule__Fluent__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:159:1: ( ( rule__Fluent__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:159:1: ( ( rule__Fluent__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:160:1: ( rule__Fluent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getGroup()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:161:1: ( rule__Fluent__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:161:2: rule__Fluent__Group__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0_in_ruleFluent281);
            rule__Fluent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleToRule"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:173:1: entryRuleToRule : ruleToRule EOF ;
    public final void entryRuleToRule() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:174:1: ( ruleToRule EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:175:1: ruleToRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToRuleRule()); 
            }
            pushFollow(FOLLOW_ruleToRule_in_entryRuleToRule308);
            ruleToRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleToRule315); if (state.failed) return ;

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:182:1: ruleToRule : ( ( rule__ToRule__Alternatives ) ) ;
    public final void ruleToRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:186:2: ( ( ( rule__ToRule__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:187:1: ( ( rule__ToRule__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:187:1: ( ( rule__ToRule__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:188:1: ( rule__ToRule__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToRuleAccess().getAlternatives()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:189:1: ( rule__ToRule__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:189:2: rule__ToRule__Alternatives
            {
            pushFollow(FOLLOW_rule__ToRule__Alternatives_in_ruleToRule341);
            rule__ToRule__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToRuleAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleStringExpr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:201:1: entryRuleStringExpr : ruleStringExpr EOF ;
    public final void entryRuleStringExpr() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:202:1: ( ruleStringExpr EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:203:1: ruleStringExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExprRule()); 
            }
            pushFollow(FOLLOW_ruleStringExpr_in_entryRuleStringExpr368);
            ruleStringExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpr375); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringExpr"


    // $ANTLR start "ruleStringExpr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:210:1: ruleStringExpr : ( ( rule__StringExpr__Alternatives ) ) ;
    public final void ruleStringExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:214:2: ( ( ( rule__StringExpr__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:215:1: ( ( rule__StringExpr__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:215:1: ( ( rule__StringExpr__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:216:1: ( rule__StringExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExprAccess().getAlternatives()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:217:1: ( rule__StringExpr__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:217:2: rule__StringExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__StringExpr__Alternatives_in_ruleStringExpr401);
            rule__StringExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringExpr"


    // $ANTLR start "entryRuleBoolExpr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:229:1: entryRuleBoolExpr : ruleBoolExpr EOF ;
    public final void entryRuleBoolExpr() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:230:1: ( ruleBoolExpr EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:231:1: ruleBoolExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprRule()); 
            }
            pushFollow(FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr428);
            ruleBoolExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpr435); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBoolExpr"


    // $ANTLR start "ruleBoolExpr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:238:1: ruleBoolExpr : ( ( rule__BoolExpr__Alternatives ) ) ;
    public final void ruleBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:242:2: ( ( ( rule__BoolExpr__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:243:1: ( ( rule__BoolExpr__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:243:1: ( ( rule__BoolExpr__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:244:1: ( rule__BoolExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getAlternatives()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:245:1: ( rule__BoolExpr__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:245:2: rule__BoolExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__BoolExpr__Alternatives_in_ruleBoolExpr461);
            rule__BoolExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolExpr"


    // $ANTLR start "entryRuleOr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:257:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:258:1: ( ruleOr EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:259:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr488);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr495); if (state.failed) return ;

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:266:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:270:2: ( ( ( rule__Or__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:271:1: ( ( rule__Or__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:271:1: ( ( rule__Or__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:272:1: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:273:1: ( rule__Or__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:273:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr521);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:285:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:286:1: ( ruleAnd EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:287:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd548);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd555); if (state.failed) return ;

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:294:1: ruleAnd : ( ( rule__And__Alternatives ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:298:2: ( ( ( rule__And__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:299:1: ( ( rule__And__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:299:1: ( ( rule__And__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:300:1: ( rule__And__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAlternatives()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:301:1: ( rule__And__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:301:2: rule__And__Alternatives
            {
            pushFollow(FOLLOW_rule__And__Alternatives_in_ruleAnd581);
            rule__And__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:313:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:314:1: ( ruleEquality EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:315:1: ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality608);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality615); if (state.failed) return ;

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:322:1: ruleEquality : ( ( rule__Equality__Alternatives ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:326:2: ( ( ( rule__Equality__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:327:1: ( ( rule__Equality__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:327:1: ( ( rule__Equality__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:328:1: ( rule__Equality__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getAlternatives()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:329:1: ( rule__Equality__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:329:2: rule__Equality__Alternatives
            {
            pushFollow(FOLLOW_rule__Equality__Alternatives_in_ruleEquality641);
            rule__Equality__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:341:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:342:1: ( ruleComparison EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:343:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison668);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison675); if (state.failed) return ;

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:350:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:354:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:355:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:355:1: ( ( rule__Comparison__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:356:1: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:357:1: ( rule__Comparison__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:357:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison701);
            rule__Comparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleswitchExpr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:369:1: entryRuleswitchExpr : ruleswitchExpr EOF ;
    public final void entryRuleswitchExpr() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:370:1: ( ruleswitchExpr EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:371:1: ruleswitchExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExprRule()); 
            }
            pushFollow(FOLLOW_ruleswitchExpr_in_entryRuleswitchExpr728);
            ruleswitchExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleswitchExpr735); if (state.failed) return ;

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
    // $ANTLR end "entryRuleswitchExpr"


    // $ANTLR start "ruleswitchExpr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:378:1: ruleswitchExpr : ( ( rule__SwitchExpr__ValueAssignment ) ) ;
    public final void ruleswitchExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:382:2: ( ( ( rule__SwitchExpr__ValueAssignment ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:383:1: ( ( rule__SwitchExpr__ValueAssignment ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:383:1: ( ( rule__SwitchExpr__ValueAssignment ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:384:1: ( rule__SwitchExpr__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExprAccess().getValueAssignment()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:385:1: ( rule__SwitchExpr__ValueAssignment )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:385:2: rule__SwitchExpr__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SwitchExpr__ValueAssignment_in_ruleswitchExpr761);
            rule__SwitchExpr__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExprAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleswitchExpr"


    // $ANTLR start "entryRuleMutationExpr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:397:1: entryRuleMutationExpr : ruleMutationExpr EOF ;
    public final void entryRuleMutationExpr() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:398:1: ( ruleMutationExpr EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:399:1: ruleMutationExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMutationExprRule()); 
            }
            pushFollow(FOLLOW_ruleMutationExpr_in_entryRuleMutationExpr788);
            ruleMutationExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMutationExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMutationExpr795); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMutationExpr"


    // $ANTLR start "ruleMutationExpr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:406:1: ruleMutationExpr : ( ( rule__MutationExpr__Group__0 ) ) ;
    public final void ruleMutationExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:410:2: ( ( ( rule__MutationExpr__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:411:1: ( ( rule__MutationExpr__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:411:1: ( ( rule__MutationExpr__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:412:1: ( rule__MutationExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMutationExprAccess().getGroup()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:413:1: ( rule__MutationExpr__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:413:2: rule__MutationExpr__Group__0
            {
            pushFollow(FOLLOW_rule__MutationExpr__Group__0_in_ruleMutationExpr821);
            rule__MutationExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMutationExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMutationExpr"


    // $ANTLR start "entryRuleFloatExpr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:425:1: entryRuleFloatExpr : ruleFloatExpr EOF ;
    public final void entryRuleFloatExpr() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:426:1: ( ruleFloatExpr EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:427:1: ruleFloatExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatExprRule()); 
            }
            pushFollow(FOLLOW_ruleFloatExpr_in_entryRuleFloatExpr848);
            ruleFloatExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatExpr855); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFloatExpr"


    // $ANTLR start "ruleFloatExpr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:434:1: ruleFloatExpr : ( ( rule__FloatExpr__Alternatives ) ) ;
    public final void ruleFloatExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:438:2: ( ( ( rule__FloatExpr__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:439:1: ( ( rule__FloatExpr__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:439:1: ( ( rule__FloatExpr__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:440:1: ( rule__FloatExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatExprAccess().getAlternatives()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:441:1: ( rule__FloatExpr__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:441:2: rule__FloatExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__FloatExpr__Alternatives_in_ruleFloatExpr881);
            rule__FloatExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatExpr"


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:453:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:454:1: ( rulePlusOrMinus EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:455:1: rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus908);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus915); if (state.failed) return ;

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:462:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:466:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:467:1: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:467:1: ( ( rule__PlusOrMinus__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:468:1: ( rule__PlusOrMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:469:1: ( rule__PlusOrMinus__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:469:2: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus941);
            rule__PlusOrMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:481:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:482:1: ( ruleMulOrDiv EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:483:1: ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv968);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv975); if (state.failed) return ;

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:490:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:494:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:495:1: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:495:1: ( ( rule__MulOrDiv__Group__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:496:1: ( rule__MulOrDiv__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:497:1: ( rule__MulOrDiv__Group__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:497:2: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv1001);
            rule__MulOrDiv__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:509:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:510:1: ( rulePrimary EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:511:1: rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1028);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1035); if (state.failed) return ;

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:518:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:522:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:523:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:523:1: ( ( rule__Primary__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:524:1: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:525:1: ( rule__Primary__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:525:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary1061);
            rule__Primary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleFluentWhoseValue"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:537:1: entryRuleFluentWhoseValue : ruleFluentWhoseValue EOF ;
    public final void entryRuleFluentWhoseValue() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:538:1: ( ruleFluentWhoseValue EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:539:1: ruleFluentWhoseValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentWhoseValueRule()); 
            }
            pushFollow(FOLLOW_ruleFluentWhoseValue_in_entryRuleFluentWhoseValue1088);
            ruleFluentWhoseValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentWhoseValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluentWhoseValue1095); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFluentWhoseValue"


    // $ANTLR start "ruleFluentWhoseValue"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:546:1: ruleFluentWhoseValue : ( ( rule__FluentWhoseValue__FluentWhoseValueNameAssignment ) ) ;
    public final void ruleFluentWhoseValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:550:2: ( ( ( rule__FluentWhoseValue__FluentWhoseValueNameAssignment ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:551:1: ( ( rule__FluentWhoseValue__FluentWhoseValueNameAssignment ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:551:1: ( ( rule__FluentWhoseValue__FluentWhoseValueNameAssignment ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:552:1: ( rule__FluentWhoseValue__FluentWhoseValueNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentWhoseValueAccess().getFluentWhoseValueNameAssignment()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:553:1: ( rule__FluentWhoseValue__FluentWhoseValueNameAssignment )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:553:2: rule__FluentWhoseValue__FluentWhoseValueNameAssignment
            {
            pushFollow(FOLLOW_rule__FluentWhoseValue__FluentWhoseValueNameAssignment_in_ruleFluentWhoseValue1121);
            rule__FluentWhoseValue__FluentWhoseValueNameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentWhoseValueAccess().getFluentWhoseValueNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFluentWhoseValue"


    // $ANTLR start "entryRuleStr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:565:1: entryRuleStr : ruleStr EOF ;
    public final void entryRuleStr() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:566:1: ( ruleStr EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:567:1: ruleStr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrRule()); 
            }
            pushFollow(FOLLOW_ruleStr_in_entryRuleStr1148);
            ruleStr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStr1155); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStr"


    // $ANTLR start "ruleStr"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:574:1: ruleStr : ( ( rule__Str__ValueAssignment ) ) ;
    public final void ruleStr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:578:2: ( ( ( rule__Str__ValueAssignment ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:579:1: ( ( rule__Str__ValueAssignment ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:579:1: ( ( rule__Str__ValueAssignment ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:580:1: ( rule__Str__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getValueAssignment()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:581:1: ( rule__Str__ValueAssignment )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:581:2: rule__Str__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Str__ValueAssignment_in_ruleStr1181);
            rule__Str__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStr"


    // $ANTLR start "entryRuleInRule"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:593:1: entryRuleInRule : ruleInRule EOF ;
    public final void entryRuleInRule() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:594:1: ( ruleInRule EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:595:1: ruleInRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInRuleRule()); 
            }
            pushFollow(FOLLOW_ruleInRule_in_entryRuleInRule1208);
            ruleInRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInRule1215); if (state.failed) return ;

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:602:1: ruleInRule : ( ( rule__InRule__Alternatives ) ) ;
    public final void ruleInRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:606:2: ( ( ( rule__InRule__Alternatives ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:607:1: ( ( rule__InRule__Alternatives ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:607:1: ( ( rule__InRule__Alternatives ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:608:1: ( rule__InRule__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInRuleAccess().getAlternatives()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:609:1: ( rule__InRule__Alternatives )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:609:2: rule__InRule__Alternatives
            {
            pushFollow(FOLLOW_rule__InRule__Alternatives_in_ruleInRule1241);
            rule__InRule__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInRuleAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleConditionRule"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:621:1: entryRuleConditionRule : ruleConditionRule EOF ;
    public final void entryRuleConditionRule() throws RecognitionException {
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:622:1: ( ruleConditionRule EOF )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:623:1: ruleConditionRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRuleRule()); 
            }
            pushFollow(FOLLOW_ruleConditionRule_in_entryRuleConditionRule1268);
            ruleConditionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionRule1275); if (state.failed) return ;

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:630:1: ruleConditionRule : ( ( rule__ConditionRule__ConditionAssignment ) ) ;
    public final void ruleConditionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:634:2: ( ( ( rule__ConditionRule__ConditionAssignment ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:635:1: ( ( rule__ConditionRule__ConditionAssignment ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:635:1: ( ( rule__ConditionRule__ConditionAssignment ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:636:1: ( rule__ConditionRule__ConditionAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRuleAccess().getConditionAssignment()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:637:1: ( rule__ConditionRule__ConditionAssignment )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:637:2: rule__ConditionRule__ConditionAssignment
            {
            pushFollow(FOLLOW_rule__ConditionRule__ConditionAssignment_in_ruleConditionRule1301);
            rule__ConditionRule__ConditionAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRuleAccess().getConditionAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ToRule__Alternatives"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:649:1: rule__ToRule__Alternatives : ( ( ( rule__ToRule__ExpressionAssignment_0 ) ) | ( ( rule__ToRule__ExpressionAssignment_1 ) ) | ( ( rule__ToRule__ExpressionAssignment_2 ) ) | ( ( rule__ToRule__Group_3__0 ) ) | ( ( rule__ToRule__ExpressionAssignment_4 ) ) );
    public final void rule__ToRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:653:1: ( ( ( rule__ToRule__ExpressionAssignment_0 ) ) | ( ( rule__ToRule__ExpressionAssignment_1 ) ) | ( ( rule__ToRule__ExpressionAssignment_2 ) ) | ( ( rule__ToRule__Group_3__0 ) ) | ( ( rule__ToRule__ExpressionAssignment_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred2_InternalEce()) ) {
                    alt2=1;
                }
                else if ( (synpred3_InternalEce()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (synpred2_InternalEce()) ) {
                    alt2=1;
                }
                else if ( (synpred3_InternalEce()) ) {
                    alt2=2;
                }
                else if ( (synpred5_InternalEce()) ) {
                    alt2=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 33:
            case 34:
                {
                alt2=2;
                }
                break;
            case RULE_INT:
                {
                int LA2_4 = input.LA(2);

                if ( (synpred3_InternalEce()) ) {
                    alt2=2;
                }
                else if ( (synpred5_InternalEce()) ) {
                    alt2=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:654:1: ( ( rule__ToRule__ExpressionAssignment_0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:654:1: ( ( rule__ToRule__ExpressionAssignment_0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:655:1: ( rule__ToRule__ExpressionAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getToRuleAccess().getExpressionAssignment_0()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:656:1: ( rule__ToRule__ExpressionAssignment_0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:656:2: rule__ToRule__ExpressionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_0_in_rule__ToRule__Alternatives1337);
                    rule__ToRule__ExpressionAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getToRuleAccess().getExpressionAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:660:6: ( ( rule__ToRule__ExpressionAssignment_1 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:660:6: ( ( rule__ToRule__ExpressionAssignment_1 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:661:1: ( rule__ToRule__ExpressionAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getToRuleAccess().getExpressionAssignment_1()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:662:1: ( rule__ToRule__ExpressionAssignment_1 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:662:2: rule__ToRule__ExpressionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Alternatives1355);
                    rule__ToRule__ExpressionAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getToRuleAccess().getExpressionAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:666:6: ( ( rule__ToRule__ExpressionAssignment_2 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:666:6: ( ( rule__ToRule__ExpressionAssignment_2 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:667:1: ( rule__ToRule__ExpressionAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getToRuleAccess().getExpressionAssignment_2()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:668:1: ( rule__ToRule__ExpressionAssignment_2 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:668:2: rule__ToRule__ExpressionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_2_in_rule__ToRule__Alternatives1373);
                    rule__ToRule__ExpressionAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getToRuleAccess().getExpressionAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:672:6: ( ( rule__ToRule__Group_3__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:672:6: ( ( rule__ToRule__Group_3__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:673:1: ( rule__ToRule__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getToRuleAccess().getGroup_3()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:674:1: ( rule__ToRule__Group_3__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:674:2: rule__ToRule__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ToRule__Group_3__0_in_rule__ToRule__Alternatives1391);
                    rule__ToRule__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getToRuleAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:678:6: ( ( rule__ToRule__ExpressionAssignment_4 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:678:6: ( ( rule__ToRule__ExpressionAssignment_4 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:679:1: ( rule__ToRule__ExpressionAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getToRuleAccess().getExpressionAssignment_4()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:680:1: ( rule__ToRule__ExpressionAssignment_4 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:680:2: rule__ToRule__ExpressionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_4_in_rule__ToRule__Alternatives1409);
                    rule__ToRule__ExpressionAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getToRuleAccess().getExpressionAssignment_4()); 
                    }

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
    // $ANTLR end "rule__ToRule__Alternatives"


    // $ANTLR start "rule__StringExpr__Alternatives"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:689:1: rule__StringExpr__Alternatives : ( ( ruleStr ) | ( ruleFluentWhoseValue ) );
    public final void rule__StringExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:693:1: ( ( ruleStr ) | ( ruleFluentWhoseValue ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:694:1: ( ruleStr )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:694:1: ( ruleStr )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:695:1: ruleStr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStringExprAccess().getStrParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStr_in_rule__StringExpr__Alternatives1442);
                    ruleStr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStringExprAccess().getStrParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:700:6: ( ruleFluentWhoseValue )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:700:6: ( ruleFluentWhoseValue )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:701:1: ruleFluentWhoseValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStringExprAccess().getFluentWhoseValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFluentWhoseValue_in_rule__StringExpr__Alternatives1459);
                    ruleFluentWhoseValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStringExprAccess().getFluentWhoseValueParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__StringExpr__Alternatives"


    // $ANTLR start "rule__BoolExpr__Alternatives"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:711:1: rule__BoolExpr__Alternatives : ( ( ( rule__BoolExpr__ValueAssignment_0 ) ) | ( ( rule__BoolExpr__ValueAssignment_1 ) ) | ( ruleOr ) );
    public final void rule__BoolExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:715:1: ( ( ( rule__BoolExpr__ValueAssignment_0 ) ) | ( ( rule__BoolExpr__ValueAssignment_1 ) ) | ( ruleOr ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt4=1;
                }
                break;
            case 34:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:716:1: ( ( rule__BoolExpr__ValueAssignment_0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:716:1: ( ( rule__BoolExpr__ValueAssignment_0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:717:1: ( rule__BoolExpr__ValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolExprAccess().getValueAssignment_0()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:718:1: ( rule__BoolExpr__ValueAssignment_0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:718:2: rule__BoolExpr__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BoolExpr__ValueAssignment_0_in_rule__BoolExpr__Alternatives1491);
                    rule__BoolExpr__ValueAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolExprAccess().getValueAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:722:6: ( ( rule__BoolExpr__ValueAssignment_1 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:722:6: ( ( rule__BoolExpr__ValueAssignment_1 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:723:1: ( rule__BoolExpr__ValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolExprAccess().getValueAssignment_1()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:724:1: ( rule__BoolExpr__ValueAssignment_1 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:724:2: rule__BoolExpr__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BoolExpr__ValueAssignment_1_in_rule__BoolExpr__Alternatives1509);
                    rule__BoolExpr__ValueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolExprAccess().getValueAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:728:6: ( ruleOr )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:728:6: ( ruleOr )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:729:1: ruleOr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolExprAccess().getOrParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleOr_in_rule__BoolExpr__Alternatives1527);
                    ruleOr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolExprAccess().getOrParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__BoolExpr__Alternatives"


    // $ANTLR start "rule__And__Alternatives"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:739:1: rule__And__Alternatives : ( ( ( rule__And__Group_0__0 ) ) | ( ( rule__And__Group_1__0 ) ) | ( ( rule__And__Group_2__0 ) ) | ( ( rule__And__Group_3__0 ) ) );
    public final void rule__And__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:743:1: ( ( ( rule__And__Group_0__0 ) ) | ( ( rule__And__Group_1__0 ) ) | ( ( rule__And__Group_2__0 ) ) | ( ( rule__And__Group_3__0 ) ) )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:744:1: ( ( rule__And__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:744:1: ( ( rule__And__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:745:1: ( rule__And__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndAccess().getGroup_0()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:746:1: ( rule__And__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:746:2: rule__And__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__And__Group_0__0_in_rule__And__Alternatives1559);
                    rule__And__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:750:6: ( ( rule__And__Group_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:750:6: ( ( rule__And__Group_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:751:1: ( rule__And__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndAccess().getGroup_1()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:752:1: ( rule__And__Group_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:752:2: rule__And__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Alternatives1577);
                    rule__And__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:756:6: ( ( rule__And__Group_2__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:756:6: ( ( rule__And__Group_2__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:757:1: ( rule__And__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndAccess().getGroup_2()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:758:1: ( rule__And__Group_2__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:758:2: rule__And__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__And__Group_2__0_in_rule__And__Alternatives1595);
                    rule__And__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:762:6: ( ( rule__And__Group_3__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:762:6: ( ( rule__And__Group_3__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:763:1: ( rule__And__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndAccess().getGroup_3()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:764:1: ( rule__And__Group_3__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:764:2: rule__And__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__And__Group_3__0_in_rule__And__Alternatives1613);
                    rule__And__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndAccess().getGroup_3()); 
                    }

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
    // $ANTLR end "rule__And__Alternatives"


    // $ANTLR start "rule__Equality__Alternatives"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:773:1: rule__Equality__Alternatives : ( ( ( rule__Equality__Group_0__0 ) ) | ( ( rule__Equality__Group_1__0 ) ) );
    public final void rule__Equality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:777:1: ( ( ( rule__Equality__Group_0__0 ) ) | ( ( rule__Equality__Group_1__0 ) ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    {
                    alt6=1;
                    }
                    break;
                case 12:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_STRING:
                        {
                        alt6=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA6_6 = input.LA(4);

                        if ( (synpred12_InternalEce()) ) {
                            alt6=1;
                        }
                        else if ( (true) ) {
                            alt6=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                        {
                        alt6=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case 13:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_INT:
                        {
                        alt6=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA6_6 = input.LA(4);

                        if ( (synpred12_InternalEce()) ) {
                            alt6=1;
                        }
                        else if ( (true) ) {
                            alt6=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case EOF:
                case 26:
                case 27:
                case 29:
                case 30:
                case 31:
                case 32:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:778:1: ( ( rule__Equality__Group_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:778:1: ( ( rule__Equality__Group_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:779:1: ( rule__Equality__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_0()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:780:1: ( rule__Equality__Group_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:780:2: rule__Equality__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Equality__Group_0__0_in_rule__Equality__Alternatives1646);
                    rule__Equality__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:784:6: ( ( rule__Equality__Group_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:784:6: ( ( rule__Equality__Group_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:785:1: ( rule__Equality__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:786:1: ( rule__Equality__Group_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:786:2: rule__Equality__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Alternatives1664);
                    rule__Equality__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__Equality__Alternatives"


    // $ANTLR start "rule__Equality__OpAlternatives_0_1_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:795:1: rule__Equality__OpAlternatives_0_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:799:1: ( ( '==' ) | ( '!=' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:800:1: ( '==' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:800:1: ( '==' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:801:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_0_1_1_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Equality__OpAlternatives_0_1_1_01698); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_0_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:808:6: ( '!=' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:808:6: ( '!=' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:809:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_0_1_1_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Equality__OpAlternatives_0_1_1_01718); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_0_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Equality__OpAlternatives_0_1_1_0"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:821:1: rule__Equality__OpAlternatives_1_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:825:1: ( ( '==' ) | ( '!=' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            else if ( (LA8_0==13) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:826:1: ( '==' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:826:1: ( '==' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:827:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_1_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Equality__OpAlternatives_1_1_1_01753); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:834:6: ( '!=' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:834:6: ( '!=' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:835:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_1_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Equality__OpAlternatives_1_1_1_01773); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:847:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:851:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 16:
                {
                alt9=3;
                }
                break;
            case 17:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:852:1: ( '>=' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:852:1: ( '>=' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:853:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Comparison__OpAlternatives_1_1_01808); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:860:6: ( '<=' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:860:6: ( '<=' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:861:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Comparison__OpAlternatives_1_1_01828); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:868:6: ( '>' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:868:6: ( '>' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:869:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Comparison__OpAlternatives_1_1_01848); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:876:6: ( '<' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:876:6: ( '<' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:877:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Comparison__OpAlternatives_1_1_01868); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    }

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


    // $ANTLR start "rule__MutationExpr__ValueAlternatives_0_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:889:1: rule__MutationExpr__ValueAlternatives_0_0 : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) );
    public final void rule__MutationExpr__ValueAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:893:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            case 21:
                {
                alt10=4;
                }
                break;
            case 22:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:894:1: ( '+' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:894:1: ( '+' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:895:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMutationExprAccess().getValuePlusSignKeyword_0_0_0()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__MutationExpr__ValueAlternatives_0_01903); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMutationExprAccess().getValuePlusSignKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:902:6: ( '-' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:902:6: ( '-' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:903:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMutationExprAccess().getValueHyphenMinusKeyword_0_0_1()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__MutationExpr__ValueAlternatives_0_01923); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMutationExprAccess().getValueHyphenMinusKeyword_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:910:6: ( '*' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:910:6: ( '*' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:911:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMutationExprAccess().getValueAsteriskKeyword_0_0_2()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__MutationExpr__ValueAlternatives_0_01943); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMutationExprAccess().getValueAsteriskKeyword_0_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:918:6: ( '/' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:918:6: ( '/' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:919:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMutationExprAccess().getValueSolidusKeyword_0_0_3()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__MutationExpr__ValueAlternatives_0_01963); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMutationExprAccess().getValueSolidusKeyword_0_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:926:6: ( '^' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:926:6: ( '^' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:927:1: '^'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMutationExprAccess().getValueCircumflexAccentKeyword_0_0_4()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__MutationExpr__ValueAlternatives_0_01983); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMutationExprAccess().getValueCircumflexAccentKeyword_0_0_4()); 
                    }

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
    // $ANTLR end "rule__MutationExpr__ValueAlternatives_0_0"


    // $ANTLR start "rule__FloatExpr__Alternatives"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:939:1: rule__FloatExpr__Alternatives : ( ( ( rule__FloatExpr__ValueDirectAssignment_0 ) ) | ( ( rule__FloatExpr__ValueCalculatedAssignment_1 ) ) | ( ( rule__FloatExpr__ValueOfFluentAssignment_2 ) ) );
    public final void rule__FloatExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:943:1: ( ( ( rule__FloatExpr__ValueDirectAssignment_0 ) ) | ( ( rule__FloatExpr__ValueCalculatedAssignment_1 ) ) | ( ( rule__FloatExpr__ValueOfFluentAssignment_2 ) ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred22_InternalEce()) ) {
                    alt11=1;
                }
                else if ( (synpred23_InternalEce()) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( (synpred23_InternalEce()) ) {
                    alt11=2;
                }
                else if ( (true) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:944:1: ( ( rule__FloatExpr__ValueDirectAssignment_0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:944:1: ( ( rule__FloatExpr__ValueDirectAssignment_0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:945:1: ( rule__FloatExpr__ValueDirectAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFloatExprAccess().getValueDirectAssignment_0()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:946:1: ( rule__FloatExpr__ValueDirectAssignment_0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:946:2: rule__FloatExpr__ValueDirectAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FloatExpr__ValueDirectAssignment_0_in_rule__FloatExpr__Alternatives2017);
                    rule__FloatExpr__ValueDirectAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFloatExprAccess().getValueDirectAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:950:6: ( ( rule__FloatExpr__ValueCalculatedAssignment_1 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:950:6: ( ( rule__FloatExpr__ValueCalculatedAssignment_1 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:951:1: ( rule__FloatExpr__ValueCalculatedAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFloatExprAccess().getValueCalculatedAssignment_1()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:952:1: ( rule__FloatExpr__ValueCalculatedAssignment_1 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:952:2: rule__FloatExpr__ValueCalculatedAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FloatExpr__ValueCalculatedAssignment_1_in_rule__FloatExpr__Alternatives2035);
                    rule__FloatExpr__ValueCalculatedAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFloatExprAccess().getValueCalculatedAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:956:6: ( ( rule__FloatExpr__ValueOfFluentAssignment_2 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:956:6: ( ( rule__FloatExpr__ValueOfFluentAssignment_2 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:957:1: ( rule__FloatExpr__ValueOfFluentAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFloatExprAccess().getValueOfFluentAssignment_2()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:958:1: ( rule__FloatExpr__ValueOfFluentAssignment_2 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:958:2: rule__FloatExpr__ValueOfFluentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FloatExpr__ValueOfFluentAssignment_2_in_rule__FloatExpr__Alternatives2053);
                    rule__FloatExpr__ValueOfFluentAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFloatExprAccess().getValueOfFluentAssignment_2()); 
                    }

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
    // $ANTLR end "rule__FloatExpr__Alternatives"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:967:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:971:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:972:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:972:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:973:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:974:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:974:2: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_02086);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:978:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:978:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:979:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:980:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:980:2: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_02104);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:989:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:993:1: ( ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 21:
                {
                alt13=2;
                }
                break;
            case 23:
                {
                alt13=3;
                }
                break;
            case 22:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:994:1: ( '*' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:994:1: ( '*' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:995:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__MulOrDiv__OpAlternatives_1_1_02138); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1002:6: ( '/' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1002:6: ( '/' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1003:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__MulOrDiv__OpAlternatives_1_1_02158); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1010:6: ( '%' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1010:6: ( '%' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1011:1: '%'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__MulOrDiv__OpAlternatives_1_1_02178); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getOpPercentSignKeyword_1_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1018:6: ( '^' )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1018:6: ( '^' )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1019:1: '^'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_1_0_3()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__MulOrDiv__OpAlternatives_1_1_02198); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_1_0_3()); 
                    }

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1031:1: rule__Primary__Alternatives : ( ( ( rule__Primary__ValueDirectAssignment_0 ) ) | ( ( rule__Primary__ValueOfFluentAssignment_1 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1035:1: ( ( ( rule__Primary__ValueDirectAssignment_0 ) ) | ( ( rule__Primary__ValueOfFluentAssignment_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1036:1: ( ( rule__Primary__ValueDirectAssignment_0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1036:1: ( ( rule__Primary__ValueDirectAssignment_0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1037:1: ( rule__Primary__ValueDirectAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getValueDirectAssignment_0()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1038:1: ( rule__Primary__ValueDirectAssignment_0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1038:2: rule__Primary__ValueDirectAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Primary__ValueDirectAssignment_0_in_rule__Primary__Alternatives2232);
                    rule__Primary__ValueDirectAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getValueDirectAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1042:6: ( ( rule__Primary__ValueOfFluentAssignment_1 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1042:6: ( ( rule__Primary__ValueOfFluentAssignment_1 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1043:1: ( rule__Primary__ValueOfFluentAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getValueOfFluentAssignment_1()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1044:1: ( rule__Primary__ValueOfFluentAssignment_1 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1044:2: rule__Primary__ValueOfFluentAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Primary__ValueOfFluentAssignment_1_in_rule__Primary__Alternatives2250);
                    rule__Primary__ValueOfFluentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getValueOfFluentAssignment_1()); 
                    }

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


    // $ANTLR start "rule__InRule__Alternatives"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1053:1: rule__InRule__Alternatives : ( ( ( rule__InRule__TimeAssignment_0 ) ) | ( ( rule__InRule__CurrentTimeAssignment_1 ) ) );
    public final void rule__InRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1057:1: ( ( ( rule__InRule__TimeAssignment_0 ) ) | ( ( rule__InRule__CurrentTimeAssignment_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==36) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1058:1: ( ( rule__InRule__TimeAssignment_0 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1058:1: ( ( rule__InRule__TimeAssignment_0 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1059:1: ( rule__InRule__TimeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInRuleAccess().getTimeAssignment_0()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1060:1: ( rule__InRule__TimeAssignment_0 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1060:2: rule__InRule__TimeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__InRule__TimeAssignment_0_in_rule__InRule__Alternatives2283);
                    rule__InRule__TimeAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInRuleAccess().getTimeAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1064:6: ( ( rule__InRule__CurrentTimeAssignment_1 ) )
                    {
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1064:6: ( ( rule__InRule__CurrentTimeAssignment_1 ) )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1065:1: ( rule__InRule__CurrentTimeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInRuleAccess().getCurrentTimeAssignment_1()); 
                    }
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1066:1: ( rule__InRule__CurrentTimeAssignment_1 )
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1066:2: rule__InRule__CurrentTimeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__InRule__CurrentTimeAssignment_1_in_rule__InRule__Alternatives2301);
                    rule__InRule__CurrentTimeAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInRuleAccess().getCurrentTimeAssignment_1()); 
                    }

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
    // $ANTLR end "rule__InRule__Alternatives"


    // $ANTLR start "rule__Statement__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1077:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1081:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1082:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02332);
            rule__Statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02335);
            rule__Statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1089:1: rule__Statement__Group__0__Impl : ( 'on' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1093:1: ( ( 'on' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1094:1: ( 'on' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1094:1: ( 'on' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1095:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getOnKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Statement__Group__0__Impl2363); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getOnKeyword_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1108:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1112:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1113:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12394);
            rule__Statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12397);
            rule__Statement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1120:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__EventAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1124:1: ( ( ( rule__Statement__EventAssignment_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1125:1: ( ( rule__Statement__EventAssignment_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1125:1: ( ( rule__Statement__EventAssignment_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1126:1: ( rule__Statement__EventAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEventAssignment_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1127:1: ( rule__Statement__EventAssignment_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1127:2: rule__Statement__EventAssignment_1
            {
            pushFollow(FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl2424);
            rule__Statement__EventAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getEventAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1137:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1141:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1142:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22454);
            rule__Statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22457);
            rule__Statement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1149:1: rule__Statement__Group__2__Impl : ( 'set' ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1153:1: ( ( 'set' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1154:1: ( 'set' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1154:1: ( 'set' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1155:1: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSetKeyword_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__Statement__Group__2__Impl2485); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSetKeyword_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1168:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl rule__Statement__Group__4 ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1172:1: ( rule__Statement__Group__3__Impl rule__Statement__Group__4 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1173:2: rule__Statement__Group__3__Impl rule__Statement__Group__4
            {
            pushFollow(FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__32516);
            rule__Statement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__32519);
            rule__Statement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1180:1: rule__Statement__Group__3__Impl : ( ( rule__Statement__FluentAssignment_3 ) ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1184:1: ( ( ( rule__Statement__FluentAssignment_3 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1185:1: ( ( rule__Statement__FluentAssignment_3 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1185:1: ( ( rule__Statement__FluentAssignment_3 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1186:1: ( rule__Statement__FluentAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getFluentAssignment_3()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1187:1: ( rule__Statement__FluentAssignment_3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1187:2: rule__Statement__FluentAssignment_3
            {
            pushFollow(FOLLOW_rule__Statement__FluentAssignment_3_in_rule__Statement__Group__3__Impl2546);
            rule__Statement__FluentAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getFluentAssignment_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Statement__Group__4"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1197:1: rule__Statement__Group__4 : rule__Statement__Group__4__Impl rule__Statement__Group__5 ;
    public final void rule__Statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1201:1: ( rule__Statement__Group__4__Impl rule__Statement__Group__5 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1202:2: rule__Statement__Group__4__Impl rule__Statement__Group__5
            {
            pushFollow(FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__42576);
            rule__Statement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group__5_in_rule__Statement__Group__42579);
            rule__Statement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__4"


    // $ANTLR start "rule__Statement__Group__4__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1209:1: rule__Statement__Group__4__Impl : ( ( rule__Statement__Group_4__0 )* ) ;
    public final void rule__Statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1213:1: ( ( ( rule__Statement__Group_4__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1214:1: ( ( rule__Statement__Group_4__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1214:1: ( ( rule__Statement__Group_4__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1215:1: ( rule__Statement__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getGroup_4()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1216:1: ( rule__Statement__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1216:2: rule__Statement__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Group__4__Impl2606);
            	    rule__Statement__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__4__Impl"


    // $ANTLR start "rule__Statement__Group__5"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1226:1: rule__Statement__Group__5 : rule__Statement__Group__5__Impl ;
    public final void rule__Statement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1230:1: ( rule__Statement__Group__5__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1231:2: rule__Statement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__5__Impl_in_rule__Statement__Group__52637);
            rule__Statement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__5"


    // $ANTLR start "rule__Statement__Group__5__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1237:1: rule__Statement__Group__5__Impl : ( ';' ) ;
    public final void rule__Statement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1241:1: ( ( ';' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1242:1: ( ';' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1242:1: ( ';' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1243:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_5()); 
            }
            match(input,26,FOLLOW_26_in_rule__Statement__Group__5__Impl2665); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__5__Impl"


    // $ANTLR start "rule__Statement__Group_4__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1268:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1272:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1273:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__02708);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__02711);
            rule__Statement__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0"


    // $ANTLR start "rule__Statement__Group_4__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1280:1: rule__Statement__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1284:1: ( ( ',' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1285:1: ( ',' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1285:1: ( ',' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1286:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getCommaKeyword_4_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Statement__Group_4__0__Impl2739); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0__Impl"


    // $ANTLR start "rule__Statement__Group_4__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1299:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1303:1: ( rule__Statement__Group_4__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1304:2: rule__Statement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__12770);
            rule__Statement__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1"


    // $ANTLR start "rule__Statement__Group_4__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1310:1: rule__Statement__Group_4__1__Impl : ( ( rule__Statement__FluentAssignment_4_1 ) ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1314:1: ( ( ( rule__Statement__FluentAssignment_4_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1315:1: ( ( rule__Statement__FluentAssignment_4_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1315:1: ( ( rule__Statement__FluentAssignment_4_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1316:1: ( rule__Statement__FluentAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getFluentAssignment_4_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1317:1: ( rule__Statement__FluentAssignment_4_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1317:2: rule__Statement__FluentAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Statement__FluentAssignment_4_1_in_rule__Statement__Group_4__1__Impl2797);
            rule__Statement__FluentAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getFluentAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1__Impl"


    // $ANTLR start "rule__Fluent__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1331:1: rule__Fluent__Group__0 : rule__Fluent__Group__0__Impl rule__Fluent__Group__1 ;
    public final void rule__Fluent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1335:1: ( rule__Fluent__Group__0__Impl rule__Fluent__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1336:2: rule__Fluent__Group__0__Impl rule__Fluent__Group__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__02831);
            rule__Fluent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__02834);
            rule__Fluent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1343:1: rule__Fluent__Group__0__Impl : ( ( rule__Fluent__FluentNameAssignment_0 ) ) ;
    public final void rule__Fluent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1347:1: ( ( ( rule__Fluent__FluentNameAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1348:1: ( ( rule__Fluent__FluentNameAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1348:1: ( ( rule__Fluent__FluentNameAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1349:1: ( rule__Fluent__FluentNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getFluentNameAssignment_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1350:1: ( rule__Fluent__FluentNameAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1350:2: rule__Fluent__FluentNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Fluent__FluentNameAssignment_0_in_rule__Fluent__Group__0__Impl2861);
            rule__Fluent__FluentNameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getFluentNameAssignment_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1360:1: rule__Fluent__Group__1 : rule__Fluent__Group__1__Impl rule__Fluent__Group__2 ;
    public final void rule__Fluent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1364:1: ( rule__Fluent__Group__1__Impl rule__Fluent__Group__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1365:2: rule__Fluent__Group__1__Impl rule__Fluent__Group__2
            {
            pushFollow(FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__12891);
            rule__Fluent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__12894);
            rule__Fluent__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1372:1: rule__Fluent__Group__1__Impl : ( ( rule__Fluent__Group_1__0 ) ) ;
    public final void rule__Fluent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1376:1: ( ( ( rule__Fluent__Group_1__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1377:1: ( ( rule__Fluent__Group_1__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1377:1: ( ( rule__Fluent__Group_1__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1378:1: ( rule__Fluent__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getGroup_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1379:1: ( rule__Fluent__Group_1__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1379:2: rule__Fluent__Group_1__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl2921);
            rule__Fluent__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1389:1: rule__Fluent__Group__2 : rule__Fluent__Group__2__Impl rule__Fluent__Group__3 ;
    public final void rule__Fluent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1393:1: ( rule__Fluent__Group__2__Impl rule__Fluent__Group__3 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1394:2: rule__Fluent__Group__2__Impl rule__Fluent__Group__3
            {
            pushFollow(FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__22951);
            rule__Fluent__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__22954);
            rule__Fluent__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1401:1: rule__Fluent__Group__2__Impl : ( ( rule__Fluent__Group_2__0 )? ) ;
    public final void rule__Fluent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1405:1: ( ( ( rule__Fluent__Group_2__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1406:1: ( ( rule__Fluent__Group_2__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1406:1: ( ( rule__Fluent__Group_2__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1407:1: ( rule__Fluent__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getGroup_2()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1408:1: ( rule__Fluent__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1408:2: rule__Fluent__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl2981);
                    rule__Fluent__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getGroup_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1418:1: rule__Fluent__Group__3 : rule__Fluent__Group__3__Impl ;
    public final void rule__Fluent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1422:1: ( rule__Fluent__Group__3__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1423:2: rule__Fluent__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__33012);
            rule__Fluent__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1429:1: rule__Fluent__Group__3__Impl : ( ( rule__Fluent__Group_3__0 )? ) ;
    public final void rule__Fluent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1433:1: ( ( ( rule__Fluent__Group_3__0 )? ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1434:1: ( ( rule__Fluent__Group_3__0 )? )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1434:1: ( ( rule__Fluent__Group_3__0 )? )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1435:1: ( rule__Fluent__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getGroup_3()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1436:1: ( rule__Fluent__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1436:2: rule__Fluent__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl3039);
                    rule__Fluent__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getGroup_3()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1454:1: rule__Fluent__Group_1__0 : rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 ;
    public final void rule__Fluent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1458:1: ( rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1459:2: rule__Fluent__Group_1__0__Impl rule__Fluent__Group_1__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__03078);
            rule__Fluent__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__03081);
            rule__Fluent__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1466:1: rule__Fluent__Group_1__0__Impl : ( 'to' ) ;
    public final void rule__Fluent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1470:1: ( ( 'to' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1471:1: ( 'to' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1471:1: ( 'to' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1472:1: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getToKeyword_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Fluent__Group_1__0__Impl3109); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getToKeyword_1_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1485:1: rule__Fluent__Group_1__1 : rule__Fluent__Group_1__1__Impl ;
    public final void rule__Fluent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1489:1: ( rule__Fluent__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1490:2: rule__Fluent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__13140);
            rule__Fluent__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1496:1: rule__Fluent__Group_1__1__Impl : ( ( rule__Fluent__ValuePartAssignment_1_1 ) ) ;
    public final void rule__Fluent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1500:1: ( ( ( rule__Fluent__ValuePartAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1501:1: ( ( rule__Fluent__ValuePartAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1501:1: ( ( rule__Fluent__ValuePartAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1502:1: ( rule__Fluent__ValuePartAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getValuePartAssignment_1_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1503:1: ( rule__Fluent__ValuePartAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1503:2: rule__Fluent__ValuePartAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Fluent__ValuePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl3167);
            rule__Fluent__ValuePartAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getValuePartAssignment_1_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1517:1: rule__Fluent__Group_2__0 : rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 ;
    public final void rule__Fluent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1521:1: ( rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1522:2: rule__Fluent__Group_2__0__Impl rule__Fluent__Group_2__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__03201);
            rule__Fluent__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__03204);
            rule__Fluent__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1529:1: rule__Fluent__Group_2__0__Impl : ( 'in' ) ;
    public final void rule__Fluent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1533:1: ( ( 'in' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1534:1: ( 'in' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1534:1: ( 'in' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1535:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getInKeyword_2_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Fluent__Group_2__0__Impl3232); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getInKeyword_2_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1548:1: rule__Fluent__Group_2__1 : rule__Fluent__Group_2__1__Impl ;
    public final void rule__Fluent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1552:1: ( rule__Fluent__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1553:2: rule__Fluent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__13263);
            rule__Fluent__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1559:1: rule__Fluent__Group_2__1__Impl : ( ( rule__Fluent__TimePartAssignment_2_1 ) ) ;
    public final void rule__Fluent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1563:1: ( ( ( rule__Fluent__TimePartAssignment_2_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1564:1: ( ( rule__Fluent__TimePartAssignment_2_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1564:1: ( ( rule__Fluent__TimePartAssignment_2_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1565:1: ( rule__Fluent__TimePartAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getTimePartAssignment_2_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1566:1: ( rule__Fluent__TimePartAssignment_2_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1566:2: rule__Fluent__TimePartAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Fluent__TimePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl3290);
            rule__Fluent__TimePartAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getTimePartAssignment_2_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1580:1: rule__Fluent__Group_3__0 : rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 ;
    public final void rule__Fluent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1584:1: ( rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1585:2: rule__Fluent__Group_3__0__Impl rule__Fluent__Group_3__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__03324);
            rule__Fluent__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__03327);
            rule__Fluent__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1592:1: rule__Fluent__Group_3__0__Impl : ( 'if' ) ;
    public final void rule__Fluent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1596:1: ( ( 'if' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1597:1: ( 'if' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1597:1: ( 'if' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1598:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getIfKeyword_3_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Fluent__Group_3__0__Impl3355); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getIfKeyword_3_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1611:1: rule__Fluent__Group_3__1 : rule__Fluent__Group_3__1__Impl ;
    public final void rule__Fluent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1615:1: ( rule__Fluent__Group_3__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1616:2: rule__Fluent__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__13386);
            rule__Fluent__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1622:1: rule__Fluent__Group_3__1__Impl : ( ( rule__Fluent__CondPartAssignment_3_1 ) ) ;
    public final void rule__Fluent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1626:1: ( ( ( rule__Fluent__CondPartAssignment_3_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1627:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1627:1: ( ( rule__Fluent__CondPartAssignment_3_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1628:1: ( rule__Fluent__CondPartAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getCondPartAssignment_3_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1629:1: ( rule__Fluent__CondPartAssignment_3_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1629:2: rule__Fluent__CondPartAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl3413);
            rule__Fluent__CondPartAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getCondPartAssignment_3_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ToRule__Group_3__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1643:1: rule__ToRule__Group_3__0 : rule__ToRule__Group_3__0__Impl ;
    public final void rule__ToRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1647:1: ( rule__ToRule__Group_3__0__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1648:2: rule__ToRule__Group_3__0__Impl
            {
            pushFollow(FOLLOW_rule__ToRule__Group_3__0__Impl_in_rule__ToRule__Group_3__03447);
            rule__ToRule__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__Group_3__0"


    // $ANTLR start "rule__ToRule__Group_3__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1654:1: rule__ToRule__Group_3__0__Impl : ( ( rule__ToRule__ExpressionAssignment_3_0 ) ) ;
    public final void rule__ToRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1658:1: ( ( ( rule__ToRule__ExpressionAssignment_3_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1659:1: ( ( rule__ToRule__ExpressionAssignment_3_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1659:1: ( ( rule__ToRule__ExpressionAssignment_3_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1660:1: ( rule__ToRule__ExpressionAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToRuleAccess().getExpressionAssignment_3_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1661:1: ( rule__ToRule__ExpressionAssignment_3_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1661:2: rule__ToRule__ExpressionAssignment_3_0
            {
            pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_3_0_in_rule__ToRule__Group_3__0__Impl3474);
            rule__ToRule__ExpressionAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToRuleAccess().getExpressionAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__Group_3__0__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1673:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1677:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1678:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__03506);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__03509);
            rule__Or__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1685:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1689:1: ( ( ruleAnd ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1690:1: ( ruleAnd )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1690:1: ( ruleAnd )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1691:1: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl3536);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1702:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1706:1: ( rule__Or__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1707:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__13565);
            rule__Or__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1713:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1717:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1718:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1718:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1719:1: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1720:1: ( rule__Or__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1720:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl3592);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1734:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1738:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1739:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__03627);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__03630);
            rule__Or__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1746:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1750:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1751:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1751:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1752:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1753:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1755:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1765:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1769:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1770:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__13688);
            rule__Or__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__13691);
            rule__Or__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1777:1: rule__Or__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1781:1: ( ( 'OR' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1782:1: ( 'OR' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1782:1: ( 'OR' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1783:1: 'OR'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getORKeyword_1_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Or__Group_1__1__Impl3719); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getORKeyword_1_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1796:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1800:1: ( rule__Or__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1801:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__23750);
            rule__Or__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1807:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1811:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1812:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1812:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1813:1: ( rule__Or__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1814:1: ( rule__Or__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1814:2: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl3777);
            rule__Or__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__And__Group_0__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1830:1: rule__And__Group_0__0 : rule__And__Group_0__0__Impl rule__And__Group_0__1 ;
    public final void rule__And__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1834:1: ( rule__And__Group_0__0__Impl rule__And__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1835:2: rule__And__Group_0__0__Impl rule__And__Group_0__1
            {
            pushFollow(FOLLOW_rule__And__Group_0__0__Impl_in_rule__And__Group_0__03813);
            rule__And__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_0__1_in_rule__And__Group_0__03816);
            rule__And__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_0__0"


    // $ANTLR start "rule__And__Group_0__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1842:1: rule__And__Group_0__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1846:1: ( ( ruleEquality ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1847:1: ( ruleEquality )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1847:1: ( ruleEquality )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1848:1: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleEquality_in_rule__And__Group_0__0__Impl3843);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_0__0__Impl"


    // $ANTLR start "rule__And__Group_0__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1859:1: rule__And__Group_0__1 : rule__And__Group_0__1__Impl ;
    public final void rule__And__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1863:1: ( rule__And__Group_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1864:2: rule__And__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_0__1__Impl_in_rule__And__Group_0__13872);
            rule__And__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_0__1"


    // $ANTLR start "rule__And__Group_0__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1870:1: rule__And__Group_0__1__Impl : ( ( rule__And__Group_0_1__0 )* ) ;
    public final void rule__And__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1874:1: ( ( ( rule__And__Group_0_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1875:1: ( ( rule__And__Group_0_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1875:1: ( ( rule__And__Group_0_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1876:1: ( rule__And__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_0_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1877:1: ( rule__And__Group_0_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1877:2: rule__And__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_0_1__0_in_rule__And__Group_0__1__Impl3899);
            	    rule__And__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_0__1__Impl"


    // $ANTLR start "rule__And__Group_0_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1891:1: rule__And__Group_0_1__0 : rule__And__Group_0_1__0__Impl rule__And__Group_0_1__1 ;
    public final void rule__And__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1895:1: ( rule__And__Group_0_1__0__Impl rule__And__Group_0_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1896:2: rule__And__Group_0_1__0__Impl rule__And__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_0_1__0__Impl_in_rule__And__Group_0_1__03934);
            rule__And__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_0_1__1_in_rule__And__Group_0_1__03937);
            rule__And__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_0_1__0"


    // $ANTLR start "rule__And__Group_0_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1903:1: rule__And__Group_0_1__0__Impl : ( () ) ;
    public final void rule__And__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1907:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1908:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1908:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1909:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLeftAction_0_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1910:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1912:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndLeftAction_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_0_1__0__Impl"


    // $ANTLR start "rule__And__Group_0_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1922:1: rule__And__Group_0_1__1 : rule__And__Group_0_1__1__Impl rule__And__Group_0_1__2 ;
    public final void rule__And__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1926:1: ( rule__And__Group_0_1__1__Impl rule__And__Group_0_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1927:2: rule__And__Group_0_1__1__Impl rule__And__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_0_1__1__Impl_in_rule__And__Group_0_1__13995);
            rule__And__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_0_1__2_in_rule__And__Group_0_1__13998);
            rule__And__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_0_1__1"


    // $ANTLR start "rule__And__Group_0_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1934:1: rule__And__Group_0_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1938:1: ( ( 'AND' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1939:1: ( 'AND' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1939:1: ( 'AND' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1940:1: 'AND'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getANDKeyword_0_1_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__And__Group_0_1__1__Impl4026); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getANDKeyword_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_0_1__1__Impl"


    // $ANTLR start "rule__And__Group_0_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1953:1: rule__And__Group_0_1__2 : rule__And__Group_0_1__2__Impl ;
    public final void rule__And__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1957:1: ( rule__And__Group_0_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1958:2: rule__And__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_0_1__2__Impl_in_rule__And__Group_0_1__24057);
            rule__And__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_0_1__2"


    // $ANTLR start "rule__And__Group_0_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1964:1: rule__And__Group_0_1__2__Impl : ( ( rule__And__RightAssignment_0_1_2 ) ) ;
    public final void rule__And__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1968:1: ( ( ( rule__And__RightAssignment_0_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1969:1: ( ( rule__And__RightAssignment_0_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1969:1: ( ( rule__And__RightAssignment_0_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1970:1: ( rule__And__RightAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_0_1_2()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1971:1: ( rule__And__RightAssignment_0_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1971:2: rule__And__RightAssignment_0_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_0_1_2_in_rule__And__Group_0_1__2__Impl4084);
            rule__And__RightAssignment_0_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightAssignment_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_0_1__2__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1987:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1991:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1992:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__04120);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__04123);
            rule__And__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:1999:1: rule__And__Group_1__0__Impl : ( ( ruleEquality ) ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2003:1: ( ( ( ruleEquality ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2004:1: ( ( ruleEquality ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2004:1: ( ( ruleEquality ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2005:1: ( ruleEquality )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getEqualityParserRuleCall_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2006:1: ( ruleEquality )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2006:3: ruleEquality
            {
            pushFollow(FOLLOW_ruleEquality_in_rule__And__Group_1__0__Impl4151);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getEqualityParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2016:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2020:1: ( rule__And__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2021:2: rule__And__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__14181);
            rule__And__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2027:1: rule__And__Group_1__1__Impl : ( ( rule__And__Group_1_1__0 )* ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2031:1: ( ( ( rule__And__Group_1_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2032:1: ( ( rule__And__Group_1_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2032:1: ( ( rule__And__Group_1_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2033:1: ( rule__And__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2034:1: ( rule__And__Group_1_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2034:2: rule__And__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1_1__0_in_rule__And__Group_1__1__Impl4208);
            	    rule__And__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__And__Group_1_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2048:1: rule__And__Group_1_1__0 : rule__And__Group_1_1__0__Impl rule__And__Group_1_1__1 ;
    public final void rule__And__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2052:1: ( rule__And__Group_1_1__0__Impl rule__And__Group_1_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2053:2: rule__And__Group_1_1__0__Impl rule__And__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1_1__0__Impl_in_rule__And__Group_1_1__04243);
            rule__And__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1_1__1_in_rule__And__Group_1_1__04246);
            rule__And__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1_1__0"


    // $ANTLR start "rule__And__Group_1_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2060:1: rule__And__Group_1_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2064:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2065:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2065:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2066:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLeftAction_1_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2067:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2069:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndLeftAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1_1__0__Impl"


    // $ANTLR start "rule__And__Group_1_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2079:1: rule__And__Group_1_1__1 : rule__And__Group_1_1__1__Impl rule__And__Group_1_1__2 ;
    public final void rule__And__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2083:1: ( rule__And__Group_1_1__1__Impl rule__And__Group_1_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2084:2: rule__And__Group_1_1__1__Impl rule__And__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1_1__1__Impl_in_rule__And__Group_1_1__14304);
            rule__And__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1_1__2_in_rule__And__Group_1_1__14307);
            rule__And__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1_1__1"


    // $ANTLR start "rule__And__Group_1_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2091:1: rule__And__Group_1_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2095:1: ( ( 'AND' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2096:1: ( 'AND' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2096:1: ( 'AND' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2097:1: 'AND'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getANDKeyword_1_1_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__And__Group_1_1__1__Impl4335); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getANDKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1_1__1__Impl"


    // $ANTLR start "rule__And__Group_1_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2110:1: rule__And__Group_1_1__2 : rule__And__Group_1_1__2__Impl ;
    public final void rule__And__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2114:1: ( rule__And__Group_1_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2115:2: rule__And__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1_1__2__Impl_in_rule__And__Group_1_1__24366);
            rule__And__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1_1__2"


    // $ANTLR start "rule__And__Group_1_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2121:1: rule__And__Group_1_1__2__Impl : ( ( rule__And__RightAssignment_1_1_2 ) ) ;
    public final void rule__And__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2125:1: ( ( ( rule__And__RightAssignment_1_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2126:1: ( ( rule__And__RightAssignment_1_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2126:1: ( ( rule__And__RightAssignment_1_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2127:1: ( rule__And__RightAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_1_1_2()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2128:1: ( rule__And__RightAssignment_1_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2128:2: rule__And__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_1_2_in_rule__And__Group_1_1__2__Impl4393);
            rule__And__RightAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightAssignment_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1_1__2__Impl"


    // $ANTLR start "rule__And__Group_2__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2144:1: rule__And__Group_2__0 : rule__And__Group_2__0__Impl rule__And__Group_2__1 ;
    public final void rule__And__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2148:1: ( rule__And__Group_2__0__Impl rule__And__Group_2__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2149:2: rule__And__Group_2__0__Impl rule__And__Group_2__1
            {
            pushFollow(FOLLOW_rule__And__Group_2__0__Impl_in_rule__And__Group_2__04429);
            rule__And__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_2__1_in_rule__And__Group_2__04432);
            rule__And__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_2__0"


    // $ANTLR start "rule__And__Group_2__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2156:1: rule__And__Group_2__0__Impl : ( ( ruleComparison ) ) ;
    public final void rule__And__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2160:1: ( ( ( ruleComparison ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2161:1: ( ( ruleComparison ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2161:1: ( ( ruleComparison ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2162:1: ( ruleComparison )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getComparisonParserRuleCall_2_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2163:1: ( ruleComparison )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2163:3: ruleComparison
            {
            pushFollow(FOLLOW_ruleComparison_in_rule__And__Group_2__0__Impl4460);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getComparisonParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_2__0__Impl"


    // $ANTLR start "rule__And__Group_2__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2173:1: rule__And__Group_2__1 : rule__And__Group_2__1__Impl ;
    public final void rule__And__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2177:1: ( rule__And__Group_2__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2178:2: rule__And__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_2__1__Impl_in_rule__And__Group_2__14490);
            rule__And__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_2__1"


    // $ANTLR start "rule__And__Group_2__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2184:1: rule__And__Group_2__1__Impl : ( ( rule__And__Group_2_1__0 )* ) ;
    public final void rule__And__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2188:1: ( ( ( rule__And__Group_2_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2189:1: ( ( rule__And__Group_2_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2189:1: ( ( rule__And__Group_2_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2190:1: ( rule__And__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_2_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2191:1: ( rule__And__Group_2_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2191:2: rule__And__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_2_1__0_in_rule__And__Group_2__1__Impl4517);
            	    rule__And__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_2__1__Impl"


    // $ANTLR start "rule__And__Group_2_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2205:1: rule__And__Group_2_1__0 : rule__And__Group_2_1__0__Impl rule__And__Group_2_1__1 ;
    public final void rule__And__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2209:1: ( rule__And__Group_2_1__0__Impl rule__And__Group_2_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2210:2: rule__And__Group_2_1__0__Impl rule__And__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_2_1__0__Impl_in_rule__And__Group_2_1__04552);
            rule__And__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_2_1__1_in_rule__And__Group_2_1__04555);
            rule__And__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_2_1__0"


    // $ANTLR start "rule__And__Group_2_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2217:1: rule__And__Group_2_1__0__Impl : ( () ) ;
    public final void rule__And__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2221:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2222:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2222:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2223:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLeftAction_2_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2224:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2226:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndLeftAction_2_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_2_1__0__Impl"


    // $ANTLR start "rule__And__Group_2_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2236:1: rule__And__Group_2_1__1 : rule__And__Group_2_1__1__Impl rule__And__Group_2_1__2 ;
    public final void rule__And__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2240:1: ( rule__And__Group_2_1__1__Impl rule__And__Group_2_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2241:2: rule__And__Group_2_1__1__Impl rule__And__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_2_1__1__Impl_in_rule__And__Group_2_1__14613);
            rule__And__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_2_1__2_in_rule__And__Group_2_1__14616);
            rule__And__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_2_1__1"


    // $ANTLR start "rule__And__Group_2_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2248:1: rule__And__Group_2_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2252:1: ( ( 'AND' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2253:1: ( 'AND' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2253:1: ( 'AND' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2254:1: 'AND'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getANDKeyword_2_1_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__And__Group_2_1__1__Impl4644); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getANDKeyword_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_2_1__1__Impl"


    // $ANTLR start "rule__And__Group_2_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2267:1: rule__And__Group_2_1__2 : rule__And__Group_2_1__2__Impl ;
    public final void rule__And__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2271:1: ( rule__And__Group_2_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2272:2: rule__And__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_2_1__2__Impl_in_rule__And__Group_2_1__24675);
            rule__And__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_2_1__2"


    // $ANTLR start "rule__And__Group_2_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2278:1: rule__And__Group_2_1__2__Impl : ( ( rule__And__RightAssignment_2_1_2 ) ) ;
    public final void rule__And__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2282:1: ( ( ( rule__And__RightAssignment_2_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2283:1: ( ( rule__And__RightAssignment_2_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2283:1: ( ( rule__And__RightAssignment_2_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2284:1: ( rule__And__RightAssignment_2_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_2_1_2()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2285:1: ( rule__And__RightAssignment_2_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2285:2: rule__And__RightAssignment_2_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_2_1_2_in_rule__And__Group_2_1__2__Impl4702);
            rule__And__RightAssignment_2_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightAssignment_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_2_1__2__Impl"


    // $ANTLR start "rule__And__Group_3__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2301:1: rule__And__Group_3__0 : rule__And__Group_3__0__Impl rule__And__Group_3__1 ;
    public final void rule__And__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2305:1: ( rule__And__Group_3__0__Impl rule__And__Group_3__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2306:2: rule__And__Group_3__0__Impl rule__And__Group_3__1
            {
            pushFollow(FOLLOW_rule__And__Group_3__0__Impl_in_rule__And__Group_3__04738);
            rule__And__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_3__1_in_rule__And__Group_3__04741);
            rule__And__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3__0"


    // $ANTLR start "rule__And__Group_3__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2313:1: rule__And__Group_3__0__Impl : ( ( ruleComparison ) ) ;
    public final void rule__And__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2317:1: ( ( ( ruleComparison ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2318:1: ( ( ruleComparison ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2318:1: ( ( ruleComparison ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2319:1: ( ruleComparison )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getComparisonParserRuleCall_3_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2320:1: ( ruleComparison )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2320:3: ruleComparison
            {
            pushFollow(FOLLOW_ruleComparison_in_rule__And__Group_3__0__Impl4769);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getComparisonParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3__0__Impl"


    // $ANTLR start "rule__And__Group_3__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2330:1: rule__And__Group_3__1 : rule__And__Group_3__1__Impl ;
    public final void rule__And__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2334:1: ( rule__And__Group_3__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2335:2: rule__And__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_3__1__Impl_in_rule__And__Group_3__14799);
            rule__And__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3__1"


    // $ANTLR start "rule__And__Group_3__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2341:1: rule__And__Group_3__1__Impl : ( ( rule__And__Group_3_1__0 )* ) ;
    public final void rule__And__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2345:1: ( ( ( rule__And__Group_3_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2346:1: ( ( rule__And__Group_3_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2346:1: ( ( rule__And__Group_3_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2347:1: ( rule__And__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_3_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2348:1: ( rule__And__Group_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2348:2: rule__And__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_3_1__0_in_rule__And__Group_3__1__Impl4826);
            	    rule__And__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3__1__Impl"


    // $ANTLR start "rule__And__Group_3_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2362:1: rule__And__Group_3_1__0 : rule__And__Group_3_1__0__Impl rule__And__Group_3_1__1 ;
    public final void rule__And__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2366:1: ( rule__And__Group_3_1__0__Impl rule__And__Group_3_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2367:2: rule__And__Group_3_1__0__Impl rule__And__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_3_1__0__Impl_in_rule__And__Group_3_1__04861);
            rule__And__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_3_1__1_in_rule__And__Group_3_1__04864);
            rule__And__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3_1__0"


    // $ANTLR start "rule__And__Group_3_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2374:1: rule__And__Group_3_1__0__Impl : ( () ) ;
    public final void rule__And__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2378:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2379:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2379:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2380:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLeftAction_3_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2381:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2383:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndLeftAction_3_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3_1__0__Impl"


    // $ANTLR start "rule__And__Group_3_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2393:1: rule__And__Group_3_1__1 : rule__And__Group_3_1__1__Impl rule__And__Group_3_1__2 ;
    public final void rule__And__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2397:1: ( rule__And__Group_3_1__1__Impl rule__And__Group_3_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2398:2: rule__And__Group_3_1__1__Impl rule__And__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_3_1__1__Impl_in_rule__And__Group_3_1__14922);
            rule__And__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_3_1__2_in_rule__And__Group_3_1__14925);
            rule__And__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3_1__1"


    // $ANTLR start "rule__And__Group_3_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2405:1: rule__And__Group_3_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2409:1: ( ( 'AND' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2410:1: ( 'AND' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2410:1: ( 'AND' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2411:1: 'AND'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getANDKeyword_3_1_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__And__Group_3_1__1__Impl4953); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getANDKeyword_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3_1__1__Impl"


    // $ANTLR start "rule__And__Group_3_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2424:1: rule__And__Group_3_1__2 : rule__And__Group_3_1__2__Impl ;
    public final void rule__And__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2428:1: ( rule__And__Group_3_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2429:2: rule__And__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_3_1__2__Impl_in_rule__And__Group_3_1__24984);
            rule__And__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3_1__2"


    // $ANTLR start "rule__And__Group_3_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2435:1: rule__And__Group_3_1__2__Impl : ( ( rule__And__RightAssignment_3_1_2 ) ) ;
    public final void rule__And__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2439:1: ( ( ( rule__And__RightAssignment_3_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2440:1: ( ( rule__And__RightAssignment_3_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2440:1: ( ( rule__And__RightAssignment_3_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2441:1: ( rule__And__RightAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_3_1_2()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2442:1: ( rule__And__RightAssignment_3_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2442:2: rule__And__RightAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_3_1_2_in_rule__And__Group_3_1__2__Impl5011);
            rule__And__RightAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightAssignment_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_3_1__2__Impl"


    // $ANTLR start "rule__Equality__Group_0__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2458:1: rule__Equality__Group_0__0 : rule__Equality__Group_0__0__Impl rule__Equality__Group_0__1 ;
    public final void rule__Equality__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2462:1: ( rule__Equality__Group_0__0__Impl rule__Equality__Group_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2463:2: rule__Equality__Group_0__0__Impl rule__Equality__Group_0__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_0__0__Impl_in_rule__Equality__Group_0__05047);
            rule__Equality__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equality__Group_0__1_in_rule__Equality__Group_0__05050);
            rule__Equality__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_0__0"


    // $ANTLR start "rule__Equality__Group_0__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2470:1: rule__Equality__Group_0__0__Impl : ( ruleFloatExpr ) ;
    public final void rule__Equality__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2474:1: ( ( ruleFloatExpr ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2475:1: ( ruleFloatExpr )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2475:1: ( ruleFloatExpr )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2476:1: ruleFloatExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getFloatExprParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFloatExpr_in_rule__Equality__Group_0__0__Impl5077);
            ruleFloatExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getFloatExprParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_0__0__Impl"


    // $ANTLR start "rule__Equality__Group_0__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2487:1: rule__Equality__Group_0__1 : rule__Equality__Group_0__1__Impl ;
    public final void rule__Equality__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2491:1: ( rule__Equality__Group_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2492:2: rule__Equality__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_0__1__Impl_in_rule__Equality__Group_0__15106);
            rule__Equality__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_0__1"


    // $ANTLR start "rule__Equality__Group_0__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2498:1: rule__Equality__Group_0__1__Impl : ( ( rule__Equality__Group_0_1__0 ) ) ;
    public final void rule__Equality__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2502:1: ( ( ( rule__Equality__Group_0_1__0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2503:1: ( ( rule__Equality__Group_0_1__0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2503:1: ( ( rule__Equality__Group_0_1__0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2504:1: ( rule__Equality__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_0_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2505:1: ( rule__Equality__Group_0_1__0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2505:2: rule__Equality__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__Equality__Group_0_1__0_in_rule__Equality__Group_0__1__Impl5133);
            rule__Equality__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_0__1__Impl"


    // $ANTLR start "rule__Equality__Group_0_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2519:1: rule__Equality__Group_0_1__0 : rule__Equality__Group_0_1__0__Impl rule__Equality__Group_0_1__1 ;
    public final void rule__Equality__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2523:1: ( rule__Equality__Group_0_1__0__Impl rule__Equality__Group_0_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2524:2: rule__Equality__Group_0_1__0__Impl rule__Equality__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_0_1__0__Impl_in_rule__Equality__Group_0_1__05167);
            rule__Equality__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equality__Group_0_1__1_in_rule__Equality__Group_0_1__05170);
            rule__Equality__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_0_1__0"


    // $ANTLR start "rule__Equality__Group_0_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2531:1: rule__Equality__Group_0_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2535:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2536:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2536:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2537:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualityLeftAction_0_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2538:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2540:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getEqualityLeftAction_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_0_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_0_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2550:1: rule__Equality__Group_0_1__1 : rule__Equality__Group_0_1__1__Impl rule__Equality__Group_0_1__2 ;
    public final void rule__Equality__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2554:1: ( rule__Equality__Group_0_1__1__Impl rule__Equality__Group_0_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2555:2: rule__Equality__Group_0_1__1__Impl rule__Equality__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__Equality__Group_0_1__1__Impl_in_rule__Equality__Group_0_1__15228);
            rule__Equality__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equality__Group_0_1__2_in_rule__Equality__Group_0_1__15231);
            rule__Equality__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_0_1__1"


    // $ANTLR start "rule__Equality__Group_0_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2562:1: rule__Equality__Group_0_1__1__Impl : ( ( rule__Equality__OpAssignment_0_1_1 ) ) ;
    public final void rule__Equality__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2566:1: ( ( ( rule__Equality__OpAssignment_0_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2567:1: ( ( rule__Equality__OpAssignment_0_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2567:1: ( ( rule__Equality__OpAssignment_0_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2568:1: ( rule__Equality__OpAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getOpAssignment_0_1_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2569:1: ( rule__Equality__OpAssignment_0_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2569:2: rule__Equality__OpAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Equality__OpAssignment_0_1_1_in_rule__Equality__Group_0_1__1__Impl5258);
            rule__Equality__OpAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getOpAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_0_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_0_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2579:1: rule__Equality__Group_0_1__2 : rule__Equality__Group_0_1__2__Impl ;
    public final void rule__Equality__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2583:1: ( rule__Equality__Group_0_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2584:2: rule__Equality__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_0_1__2__Impl_in_rule__Equality__Group_0_1__25288);
            rule__Equality__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_0_1__2"


    // $ANTLR start "rule__Equality__Group_0_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2590:1: rule__Equality__Group_0_1__2__Impl : ( ( rule__Equality__RightAssignment_0_1_2 ) ) ;
    public final void rule__Equality__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2594:1: ( ( ( rule__Equality__RightAssignment_0_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2595:1: ( ( rule__Equality__RightAssignment_0_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2595:1: ( ( rule__Equality__RightAssignment_0_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2596:1: ( rule__Equality__RightAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightAssignment_0_1_2()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2597:1: ( rule__Equality__RightAssignment_0_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2597:2: rule__Equality__RightAssignment_0_1_2
            {
            pushFollow(FOLLOW_rule__Equality__RightAssignment_0_1_2_in_rule__Equality__Group_0_1__2__Impl5315);
            rule__Equality__RightAssignment_0_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightAssignment_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_0_1__2__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2613:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2617:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2618:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__05351);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__05354);
            rule__Equality__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2625:1: rule__Equality__Group_1__0__Impl : ( ( ruleStringExpr ) ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2629:1: ( ( ( ruleStringExpr ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2630:1: ( ( ruleStringExpr ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2630:1: ( ( ruleStringExpr ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2631:1: ( ruleStringExpr )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getStringExprParserRuleCall_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2632:1: ( ruleStringExpr )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2632:3: ruleStringExpr
            {
            pushFollow(FOLLOW_ruleStringExpr_in_rule__Equality__Group_1__0__Impl5382);
            ruleStringExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getStringExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2642:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2646:1: ( rule__Equality__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2647:2: rule__Equality__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__15412);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2653:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__Group_1_1__0 )* ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2657:1: ( ( ( rule__Equality__Group_1_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2658:1: ( ( rule__Equality__Group_1_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2658:1: ( ( rule__Equality__Group_1_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2659:1: ( rule__Equality__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_1_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2660:1: ( rule__Equality__Group_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=12 && LA24_0<=13)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2660:2: rule__Equality__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equality__Group_1_1__0_in_rule__Equality__Group_1__1__Impl5439);
            	    rule__Equality__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Equality__Group_1_1__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2674:1: rule__Equality__Group_1_1__0 : rule__Equality__Group_1_1__0__Impl rule__Equality__Group_1_1__1 ;
    public final void rule__Equality__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2678:1: ( rule__Equality__Group_1_1__0__Impl rule__Equality__Group_1_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2679:2: rule__Equality__Group_1_1__0__Impl rule__Equality__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_1_1__0__Impl_in_rule__Equality__Group_1_1__05474);
            rule__Equality__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equality__Group_1_1__1_in_rule__Equality__Group_1_1__05477);
            rule__Equality__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_1__0"


    // $ANTLR start "rule__Equality__Group_1_1__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2686:1: rule__Equality__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2690:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2691:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2691:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2692:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2693:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2695:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1_1__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2705:1: rule__Equality__Group_1_1__1 : rule__Equality__Group_1_1__1__Impl rule__Equality__Group_1_1__2 ;
    public final void rule__Equality__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2709:1: ( rule__Equality__Group_1_1__1__Impl rule__Equality__Group_1_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2710:2: rule__Equality__Group_1_1__1__Impl rule__Equality__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Equality__Group_1_1__1__Impl_in_rule__Equality__Group_1_1__15535);
            rule__Equality__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equality__Group_1_1__2_in_rule__Equality__Group_1_1__15538);
            rule__Equality__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_1__1"


    // $ANTLR start "rule__Equality__Group_1_1__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2717:1: rule__Equality__Group_1_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1_1 ) ) ;
    public final void rule__Equality__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2721:1: ( ( ( rule__Equality__OpAssignment_1_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2722:1: ( ( rule__Equality__OpAssignment_1_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2722:1: ( ( rule__Equality__OpAssignment_1_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2723:1: ( rule__Equality__OpAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getOpAssignment_1_1_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2724:1: ( rule__Equality__OpAssignment_1_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2724:2: rule__Equality__OpAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Equality__OpAssignment_1_1_1_in_rule__Equality__Group_1_1__1__Impl5565);
            rule__Equality__OpAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getOpAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_1__2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2734:1: rule__Equality__Group_1_1__2 : rule__Equality__Group_1_1__2__Impl ;
    public final void rule__Equality__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2738:1: ( rule__Equality__Group_1_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2739:2: rule__Equality__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_1_1__2__Impl_in_rule__Equality__Group_1_1__25595);
            rule__Equality__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_1__2"


    // $ANTLR start "rule__Equality__Group_1_1__2__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2745:1: rule__Equality__Group_1_1__2__Impl : ( ( rule__Equality__RightAssignment_1_1_2 ) ) ;
    public final void rule__Equality__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2749:1: ( ( ( rule__Equality__RightAssignment_1_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2750:1: ( ( rule__Equality__RightAssignment_1_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2750:1: ( ( rule__Equality__RightAssignment_1_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2751:1: ( rule__Equality__RightAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightAssignment_1_1_2()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2752:1: ( rule__Equality__RightAssignment_1_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2752:2: rule__Equality__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__Equality__RightAssignment_1_1_2_in_rule__Equality__Group_1_1__2__Impl5622);
            rule__Equality__RightAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightAssignment_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2768:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2772:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2773:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__05658);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__05661);
            rule__Comparison__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2780:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2784:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2785:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2785:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2786:1: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl5688);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2797:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2801:1: ( rule__Comparison__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2802:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__15717);
            rule__Comparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2808:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2812:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2813:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2813:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2814:1: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2815:1: ( rule__Comparison__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=14 && LA25_0<=17)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2815:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl5744);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2829:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2833:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2834:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__05779);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__05782);
            rule__Comparison__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2841:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2845:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2846:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2846:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2847:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2848:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2850:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            }

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2860:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2864:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2865:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__15840);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__15843);
            rule__Comparison__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2872:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2876:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2877:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2877:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2878:1: ( rule__Comparison__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2879:1: ( rule__Comparison__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2879:2: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl5870);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2889:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2893:1: ( rule__Comparison__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2894:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__25900);
            rule__Comparison__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2900:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2904:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2905:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2905:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2906:1: ( rule__Comparison__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2907:1: ( rule__Comparison__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2907:2: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl5927);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MutationExpr__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2923:1: rule__MutationExpr__Group__0 : rule__MutationExpr__Group__0__Impl rule__MutationExpr__Group__1 ;
    public final void rule__MutationExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2927:1: ( rule__MutationExpr__Group__0__Impl rule__MutationExpr__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2928:2: rule__MutationExpr__Group__0__Impl rule__MutationExpr__Group__1
            {
            pushFollow(FOLLOW_rule__MutationExpr__Group__0__Impl_in_rule__MutationExpr__Group__05963);
            rule__MutationExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MutationExpr__Group__1_in_rule__MutationExpr__Group__05966);
            rule__MutationExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MutationExpr__Group__0"


    // $ANTLR start "rule__MutationExpr__Group__0__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2935:1: rule__MutationExpr__Group__0__Impl : ( ( rule__MutationExpr__ValueAssignment_0 ) ) ;
    public final void rule__MutationExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2939:1: ( ( ( rule__MutationExpr__ValueAssignment_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2940:1: ( ( rule__MutationExpr__ValueAssignment_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2940:1: ( ( rule__MutationExpr__ValueAssignment_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2941:1: ( rule__MutationExpr__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMutationExprAccess().getValueAssignment_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2942:1: ( rule__MutationExpr__ValueAssignment_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2942:2: rule__MutationExpr__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__MutationExpr__ValueAssignment_0_in_rule__MutationExpr__Group__0__Impl5993);
            rule__MutationExpr__ValueAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMutationExprAccess().getValueAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MutationExpr__Group__0__Impl"


    // $ANTLR start "rule__MutationExpr__Group__1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2952:1: rule__MutationExpr__Group__1 : rule__MutationExpr__Group__1__Impl ;
    public final void rule__MutationExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2956:1: ( rule__MutationExpr__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2957:2: rule__MutationExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MutationExpr__Group__1__Impl_in_rule__MutationExpr__Group__16023);
            rule__MutationExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MutationExpr__Group__1"


    // $ANTLR start "rule__MutationExpr__Group__1__Impl"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2963:1: rule__MutationExpr__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__MutationExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2967:1: ( ( RULE_FLOAT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2968:1: ( RULE_FLOAT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2968:1: ( RULE_FLOAT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2969:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMutationExprAccess().getFLOATTerminalRuleCall_1()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__MutationExpr__Group__1__Impl6050); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMutationExprAccess().getFLOATTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MutationExpr__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2984:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2988:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2989:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__06083);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__06086);
            rule__PlusOrMinus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:2996:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3000:1: ( ( ruleMulOrDiv ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3001:1: ( ruleMulOrDiv )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3001:1: ( ruleMulOrDiv )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3002:1: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl6113);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3013:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3017:1: ( rule__PlusOrMinus__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3018:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__16142);
            rule__PlusOrMinus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3024:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3028:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3029:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3029:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3030:1: ( rule__PlusOrMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3031:1: ( rule__PlusOrMinus__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=18 && LA26_0<=19)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3031:2: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl6169);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3045:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3049:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3050:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__06204);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__06207);
            rule__PlusOrMinus__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3057:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3061:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3062:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3062:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3063:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3064:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3064:2: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl6234);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3074:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3078:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3079:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__16264);
            rule__PlusOrMinus__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3085:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3089:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3090:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3090:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3091:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3092:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3092:2: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl6291);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3106:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3110:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3111:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__06325);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__06328);
            rule__PlusOrMinus__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3118:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3122:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3123:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3123:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3124:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3125:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3127:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            }

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3137:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3141:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3142:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__16386);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3148:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3152:1: ( ( '+' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3153:1: ( '+' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3153:1: ( '+' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3154:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__PlusOrMinus__Group_1_0_0__1__Impl6414); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3171:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3175:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3176:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__06449);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__06452);
            rule__PlusOrMinus__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3183:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3187:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3188:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3188:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3189:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3190:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3192:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            }

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3202:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3206:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3207:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__16510);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3213:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3217:1: ( ( '-' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3218:1: ( '-' )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3218:1: ( '-' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3219:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__PlusOrMinus__Group_1_0_1__1__Impl6538); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3236:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3240:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3241:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__06573);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__06576);
            rule__MulOrDiv__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3248:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3252:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3253:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3253:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3254:1: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl6603);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3265:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3269:1: ( rule__MulOrDiv__Group__1__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3270:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__16632);
            rule__MulOrDiv__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3276:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3280:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3281:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3281:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3282:1: ( rule__MulOrDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3283:1: ( rule__MulOrDiv__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=20 && LA27_0<=23)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3283:2: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl6659);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3297:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3301:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3302:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__06694);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__06697);
            rule__MulOrDiv__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3309:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3313:1: ( ( () ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3314:1: ( () )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3314:1: ( () )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3315:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3316:1: ()
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3318:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            }

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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3328:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3332:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3333:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__16755);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__16758);
            rule__MulOrDiv__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3340:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3344:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3345:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3345:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3346:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3347:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3347:2: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl6785);
            rule__MulOrDiv__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3357:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3361:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3362:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__26815);
            rule__MulOrDiv__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3368:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3372:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3373:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3373:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3374:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3375:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3375:2: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl6842);
            rule__MulOrDiv__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__DroolsModel__StatementsAssignment"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3392:1: rule__DroolsModel__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__DroolsModel__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3396:1: ( ( ruleStatement ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3397:1: ( ruleStatement )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3397:1: ( ruleStatement )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3398:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDroolsModelAccess().getStatementsStatementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__DroolsModel__StatementsAssignment6883);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDroolsModelAccess().getStatementsStatementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroolsModel__StatementsAssignment"


    // $ANTLR start "rule__Statement__EventAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3407:1: rule__Statement__EventAssignment_1 : ( ruleEvent ) ;
    public final void rule__Statement__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3411:1: ( ( ruleEvent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3412:1: ( ruleEvent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3412:1: ( ruleEvent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3413:1: ruleEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_16914);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Statement__FluentAssignment_3"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3422:1: rule__Statement__FluentAssignment_3 : ( ruleFluent ) ;
    public final void rule__Statement__FluentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3426:1: ( ( ruleFluent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3427:1: ( ruleFluent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3427:1: ( ruleFluent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3428:1: ruleFluent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_36945);
            ruleFluent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__FluentAssignment_3"


    // $ANTLR start "rule__Statement__FluentAssignment_4_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3437:1: rule__Statement__FluentAssignment_4_1 : ( ruleFluent ) ;
    public final void rule__Statement__FluentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3441:1: ( ( ruleFluent ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3442:1: ( ruleFluent )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3442:1: ( ruleFluent )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3443:1: ruleFluent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_4_16976);
            ruleFluent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getFluentFluentParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__FluentAssignment_4_1"


    // $ANTLR start "rule__Event__EventNameAssignment"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3452:1: rule__Event__EventNameAssignment : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3456:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3457:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3457:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3458:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment7007); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventNameAssignment"


    // $ANTLR start "rule__Fluent__FluentNameAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3467:1: rule__Fluent__FluentNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Fluent__FluentNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3471:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3472:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3472:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3473:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getFluentNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fluent__FluentNameAssignment_07038); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getFluentNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3482:1: rule__Fluent__ValuePartAssignment_1_1 : ( ruleToRule ) ;
    public final void rule__Fluent__ValuePartAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3486:1: ( ( ruleToRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3487:1: ( ruleToRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3487:1: ( ruleToRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3488:1: ruleToRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_1_17069);
            ruleToRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3497:1: rule__Fluent__TimePartAssignment_2_1 : ( ruleInRule ) ;
    public final void rule__Fluent__TimePartAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3501:1: ( ( ruleInRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3502:1: ( ruleInRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3502:1: ( ruleInRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3503:1: ruleInRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_2_17100);
            ruleInRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getTimePartInRuleParserRuleCall_2_1_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3512:1: rule__Fluent__CondPartAssignment_3_1 : ( ruleConditionRule ) ;
    public final void rule__Fluent__CondPartAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3516:1: ( ( ruleConditionRule ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3517:1: ( ruleConditionRule )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3517:1: ( ruleConditionRule )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3518:1: ruleConditionRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_17131);
            ruleConditionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentAccess().getCondPartConditionRuleParserRuleCall_3_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ToRule__ExpressionAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3527:1: rule__ToRule__ExpressionAssignment_0 : ( ruleStringExpr ) ;
    public final void rule__ToRule__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3531:1: ( ( ruleStringExpr ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3532:1: ( ruleStringExpr )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3532:1: ( ruleStringExpr )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3533:1: ruleStringExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToRuleAccess().getExpressionStringExprParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleStringExpr_in_rule__ToRule__ExpressionAssignment_07162);
            ruleStringExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToRuleAccess().getExpressionStringExprParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__ExpressionAssignment_0"


    // $ANTLR start "rule__ToRule__ExpressionAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3542:1: rule__ToRule__ExpressionAssignment_1 : ( ruleBoolExpr ) ;
    public final void rule__ToRule__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3546:1: ( ( ruleBoolExpr ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3547:1: ( ruleBoolExpr )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3547:1: ( ruleBoolExpr )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3548:1: ruleBoolExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToRuleAccess().getExpressionBoolExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__ToRule__ExpressionAssignment_17193);
            ruleBoolExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToRuleAccess().getExpressionBoolExprParserRuleCall_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ToRule__ExpressionAssignment_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3557:1: rule__ToRule__ExpressionAssignment_2 : ( ruleswitchExpr ) ;
    public final void rule__ToRule__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3561:1: ( ( ruleswitchExpr ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3562:1: ( ruleswitchExpr )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3562:1: ( ruleswitchExpr )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3563:1: ruleswitchExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToRuleAccess().getExpressionSwitchExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleswitchExpr_in_rule__ToRule__ExpressionAssignment_27224);
            ruleswitchExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToRuleAccess().getExpressionSwitchExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__ExpressionAssignment_2"


    // $ANTLR start "rule__ToRule__ExpressionAssignment_3_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3572:1: rule__ToRule__ExpressionAssignment_3_0 : ( ruleFloatExpr ) ;
    public final void rule__ToRule__ExpressionAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3576:1: ( ( ruleFloatExpr ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3577:1: ( ruleFloatExpr )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3577:1: ( ruleFloatExpr )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3578:1: ruleFloatExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToRuleAccess().getExpressionFloatExprParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleFloatExpr_in_rule__ToRule__ExpressionAssignment_3_07255);
            ruleFloatExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToRuleAccess().getExpressionFloatExprParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__ExpressionAssignment_3_0"


    // $ANTLR start "rule__ToRule__ExpressionAssignment_4"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3587:1: rule__ToRule__ExpressionAssignment_4 : ( ruleMutationExpr ) ;
    public final void rule__ToRule__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3591:1: ( ( ruleMutationExpr ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3592:1: ( ruleMutationExpr )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3592:1: ( ruleMutationExpr )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3593:1: ruleMutationExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToRuleAccess().getExpressionMutationExprParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleMutationExpr_in_rule__ToRule__ExpressionAssignment_47286);
            ruleMutationExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToRuleAccess().getExpressionMutationExprParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToRule__ExpressionAssignment_4"


    // $ANTLR start "rule__BoolExpr__ValueAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3602:1: rule__BoolExpr__ValueAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__BoolExpr__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3606:1: ( ( ( 'true' ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3607:1: ( ( 'true' ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3607:1: ( ( 'true' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3608:1: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getValueTrueKeyword_0_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3609:1: ( 'true' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3610:1: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getValueTrueKeyword_0_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__BoolExpr__ValueAssignment_07322); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getValueTrueKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getValueTrueKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__ValueAssignment_0"


    // $ANTLR start "rule__BoolExpr__ValueAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3625:1: rule__BoolExpr__ValueAssignment_1 : ( ( 'false' ) ) ;
    public final void rule__BoolExpr__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3629:1: ( ( ( 'false' ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3630:1: ( ( 'false' ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3630:1: ( ( 'false' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3631:1: ( 'false' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getValueFalseKeyword_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3632:1: ( 'false' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3633:1: 'false'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExprAccess().getValueFalseKeyword_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__BoolExpr__ValueAssignment_17366); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getValueFalseKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExprAccess().getValueFalseKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__ValueAssignment_1"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3648:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3652:1: ( ( ruleAnd ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3653:1: ( ruleAnd )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3653:1: ( ruleAnd )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3654:1: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_27405);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__And__RightAssignment_0_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3663:1: rule__And__RightAssignment_0_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3667:1: ( ( ruleEquality ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3668:1: ( ruleEquality )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3668:1: ( ruleEquality )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3669:1: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleEquality_in_rule__And__RightAssignment_0_1_27436);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_0_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3678:1: rule__And__RightAssignment_1_1_2 : ( ruleComparison ) ;
    public final void rule__And__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3682:1: ( ( ruleComparison ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3683:1: ( ruleComparison )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3683:1: ( ruleComparison )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3684:1: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_rule__And__RightAssignment_1_1_27467);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_1_2"


    // $ANTLR start "rule__And__RightAssignment_2_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3693:1: rule__And__RightAssignment_2_1_2 : ( ruleComparison ) ;
    public final void rule__And__RightAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3697:1: ( ( ruleComparison ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3698:1: ( ruleComparison )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3698:1: ( ruleComparison )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3699:1: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_2_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_rule__And__RightAssignment_2_1_27498);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_2_1_2"


    // $ANTLR start "rule__And__RightAssignment_3_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3708:1: rule__And__RightAssignment_3_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3712:1: ( ( ruleEquality ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3713:1: ( ruleEquality )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3713:1: ( ruleEquality )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3714:1: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleEquality_in_rule__And__RightAssignment_3_1_27529);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_3_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_3_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_0_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3723:1: rule__Equality__OpAssignment_0_1_1 : ( ( rule__Equality__OpAlternatives_0_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3727:1: ( ( ( rule__Equality__OpAlternatives_0_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3728:1: ( ( rule__Equality__OpAlternatives_0_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3728:1: ( ( rule__Equality__OpAlternatives_0_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3729:1: ( rule__Equality__OpAlternatives_0_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getOpAlternatives_0_1_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3730:1: ( rule__Equality__OpAlternatives_0_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3730:2: rule__Equality__OpAlternatives_0_1_1_0
            {
            pushFollow(FOLLOW_rule__Equality__OpAlternatives_0_1_1_0_in_rule__Equality__OpAssignment_0_1_17560);
            rule__Equality__OpAlternatives_0_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getOpAlternatives_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAssignment_0_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_0_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3739:1: rule__Equality__RightAssignment_0_1_2 : ( ruleFloatExpr ) ;
    public final void rule__Equality__RightAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3743:1: ( ( ruleFloatExpr ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3744:1: ( ruleFloatExpr )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3744:1: ( ruleFloatExpr )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3745:1: ruleFloatExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightFloatExprParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleFloatExpr_in_rule__Equality__RightAssignment_0_1_27593);
            ruleFloatExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightFloatExprParserRuleCall_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_0_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3754:1: rule__Equality__OpAssignment_1_1_1 : ( ( rule__Equality__OpAlternatives_1_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3758:1: ( ( ( rule__Equality__OpAlternatives_1_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3759:1: ( ( rule__Equality__OpAlternatives_1_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3759:1: ( ( rule__Equality__OpAlternatives_1_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3760:1: ( rule__Equality__OpAlternatives_1_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3761:1: ( rule__Equality__OpAlternatives_1_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3761:2: rule__Equality__OpAlternatives_1_1_1_0
            {
            pushFollow(FOLLOW_rule__Equality__OpAlternatives_1_1_1_0_in_rule__Equality__OpAssignment_1_1_17624);
            rule__Equality__OpAlternatives_1_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAssignment_1_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_1_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3770:1: rule__Equality__RightAssignment_1_1_2 : ( ruleStringExpr ) ;
    public final void rule__Equality__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3774:1: ( ( ruleStringExpr ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3775:1: ( ruleStringExpr )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3775:1: ( ruleStringExpr )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3776:1: ruleStringExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightStringExprParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleStringExpr_in_rule__Equality__RightAssignment_1_1_27657);
            ruleStringExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightStringExprParserRuleCall_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3785:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3789:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3790:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3790:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3791:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3792:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3792:2: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_17688);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3801:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3805:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3806:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3806:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3807:1: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_27721);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__SwitchExpr__ValueAssignment"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3816:1: rule__SwitchExpr__ValueAssignment : ( ( 'switch' ) ) ;
    public final void rule__SwitchExpr__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3820:1: ( ( ( 'switch' ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3821:1: ( ( 'switch' ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3821:1: ( ( 'switch' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3822:1: ( 'switch' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExprAccess().getValueSwitchKeyword_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3823:1: ( 'switch' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3824:1: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExprAccess().getValueSwitchKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__SwitchExpr__ValueAssignment7757); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExprAccess().getValueSwitchKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExprAccess().getValueSwitchKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpr__ValueAssignment"


    // $ANTLR start "rule__MutationExpr__ValueAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3839:1: rule__MutationExpr__ValueAssignment_0 : ( ( rule__MutationExpr__ValueAlternatives_0_0 ) ) ;
    public final void rule__MutationExpr__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3843:1: ( ( ( rule__MutationExpr__ValueAlternatives_0_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3844:1: ( ( rule__MutationExpr__ValueAlternatives_0_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3844:1: ( ( rule__MutationExpr__ValueAlternatives_0_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3845:1: ( rule__MutationExpr__ValueAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMutationExprAccess().getValueAlternatives_0_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3846:1: ( rule__MutationExpr__ValueAlternatives_0_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3846:2: rule__MutationExpr__ValueAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__MutationExpr__ValueAlternatives_0_0_in_rule__MutationExpr__ValueAssignment_07796);
            rule__MutationExpr__ValueAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMutationExprAccess().getValueAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MutationExpr__ValueAssignment_0"


    // $ANTLR start "rule__FloatExpr__ValueDirectAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3855:1: rule__FloatExpr__ValueDirectAssignment_0 : ( RULE_INT ) ;
    public final void rule__FloatExpr__ValueDirectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3859:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3860:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3860:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3861:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatExprAccess().getValueDirectINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FloatExpr__ValueDirectAssignment_07829); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatExprAccess().getValueDirectINTTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatExpr__ValueDirectAssignment_0"


    // $ANTLR start "rule__FloatExpr__ValueCalculatedAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3870:1: rule__FloatExpr__ValueCalculatedAssignment_1 : ( rulePlusOrMinus ) ;
    public final void rule__FloatExpr__ValueCalculatedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3874:1: ( ( rulePlusOrMinus ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3875:1: ( rulePlusOrMinus )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3875:1: ( rulePlusOrMinus )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3876:1: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatExprAccess().getValueCalculatedPlusOrMinusParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__FloatExpr__ValueCalculatedAssignment_17860);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatExprAccess().getValueCalculatedPlusOrMinusParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatExpr__ValueCalculatedAssignment_1"


    // $ANTLR start "rule__FloatExpr__ValueOfFluentAssignment_2"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3885:1: rule__FloatExpr__ValueOfFluentAssignment_2 : ( ruleFluentWhoseValue ) ;
    public final void rule__FloatExpr__ValueOfFluentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3889:1: ( ( ruleFluentWhoseValue ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3890:1: ( ruleFluentWhoseValue )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3890:1: ( ruleFluentWhoseValue )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3891:1: ruleFluentWhoseValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatExprAccess().getValueOfFluentFluentWhoseValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFluentWhoseValue_in_rule__FloatExpr__ValueOfFluentAssignment_27891);
            ruleFluentWhoseValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatExprAccess().getValueOfFluentFluentWhoseValueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatExpr__ValueOfFluentAssignment_2"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3900:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3904:1: ( ( ruleMulOrDiv ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3905:1: ( ruleMulOrDiv )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3905:1: ( ruleMulOrDiv )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3906:1: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_17922);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3915:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3919:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3920:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3920:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3921:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3922:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3922:2: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_17953);
            rule__MulOrDiv__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3931:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3935:1: ( ( rulePrimary ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3936:1: ( rulePrimary )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3936:1: ( rulePrimary )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3937:1: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_27986);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Primary__ValueDirectAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3946:1: rule__Primary__ValueDirectAssignment_0 : ( RULE_INT ) ;
    public final void rule__Primary__ValueDirectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3950:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3951:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3951:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3952:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getValueDirectINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Primary__ValueDirectAssignment_08017); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getValueDirectINTTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ValueDirectAssignment_0"


    // $ANTLR start "rule__Primary__ValueOfFluentAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3961:1: rule__Primary__ValueOfFluentAssignment_1 : ( ruleFluentWhoseValue ) ;
    public final void rule__Primary__ValueOfFluentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3965:1: ( ( ruleFluentWhoseValue ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3966:1: ( ruleFluentWhoseValue )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3966:1: ( ruleFluentWhoseValue )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3967:1: ruleFluentWhoseValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getValueOfFluentFluentWhoseValueParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFluentWhoseValue_in_rule__Primary__ValueOfFluentAssignment_18048);
            ruleFluentWhoseValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getValueOfFluentFluentWhoseValueParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ValueOfFluentAssignment_1"


    // $ANTLR start "rule__FluentWhoseValue__FluentWhoseValueNameAssignment"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3976:1: rule__FluentWhoseValue__FluentWhoseValueNameAssignment : ( RULE_ID ) ;
    public final void rule__FluentWhoseValue__FluentWhoseValueNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3980:1: ( ( RULE_ID ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3981:1: ( RULE_ID )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3981:1: ( RULE_ID )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3982:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFluentWhoseValueAccess().getFluentWhoseValueNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FluentWhoseValue__FluentWhoseValueNameAssignment8079); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFluentWhoseValueAccess().getFluentWhoseValueNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FluentWhoseValue__FluentWhoseValueNameAssignment"


    // $ANTLR start "rule__Str__ValueAssignment"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3991:1: rule__Str__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Str__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3995:1: ( ( RULE_STRING ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3996:1: ( RULE_STRING )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3996:1: ( RULE_STRING )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:3997:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Str__ValueAssignment8110); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getValueSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Str__ValueAssignment"


    // $ANTLR start "rule__InRule__TimeAssignment_0"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4006:1: rule__InRule__TimeAssignment_0 : ( RULE_INT ) ;
    public final void rule__InRule__TimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4010:1: ( ( RULE_INT ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4011:1: ( RULE_INT )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4011:1: ( RULE_INT )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4012:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInRuleAccess().getTimeINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InRule__TimeAssignment_08141); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInRuleAccess().getTimeINTTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRule__TimeAssignment_0"


    // $ANTLR start "rule__InRule__CurrentTimeAssignment_1"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4021:1: rule__InRule__CurrentTimeAssignment_1 : ( ( 'now' ) ) ;
    public final void rule__InRule__CurrentTimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4025:1: ( ( ( 'now' ) ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4026:1: ( ( 'now' ) )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4026:1: ( ( 'now' ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4027:1: ( 'now' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInRuleAccess().getCurrentTimeNowKeyword_1_0()); 
            }
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4028:1: ( 'now' )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4029:1: 'now'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInRuleAccess().getCurrentTimeNowKeyword_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__InRule__CurrentTimeAssignment_18177); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInRuleAccess().getCurrentTimeNowKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInRuleAccess().getCurrentTimeNowKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InRule__CurrentTimeAssignment_1"


    // $ANTLR start "rule__ConditionRule__ConditionAssignment"
    // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4044:1: rule__ConditionRule__ConditionAssignment : ( ruleBoolExpr ) ;
    public final void rule__ConditionRule__ConditionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4048:1: ( ( ruleBoolExpr ) )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4049:1: ( ruleBoolExpr )
            {
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4049:1: ( ruleBoolExpr )
            // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:4050:1: ruleBoolExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRuleAccess().getConditionBoolExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__ConditionRule__ConditionAssignment8216);
            ruleBoolExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRuleAccess().getConditionBoolExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__ConditionAssignment"

    // $ANTLR start synpred2_InternalEce
    public final void synpred2_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:654:1: ( ( ( rule__ToRule__ExpressionAssignment_0 ) ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:654:1: ( ( rule__ToRule__ExpressionAssignment_0 ) )
        {
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:654:1: ( ( rule__ToRule__ExpressionAssignment_0 ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:655:1: ( rule__ToRule__ExpressionAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getToRuleAccess().getExpressionAssignment_0()); 
        }
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:656:1: ( rule__ToRule__ExpressionAssignment_0 )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:656:2: rule__ToRule__ExpressionAssignment_0
        {
        pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_0_in_synpred2_InternalEce1337);
        rule__ToRule__ExpressionAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalEce

    // $ANTLR start synpred3_InternalEce
    public final void synpred3_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:660:6: ( ( ( rule__ToRule__ExpressionAssignment_1 ) ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:660:6: ( ( rule__ToRule__ExpressionAssignment_1 ) )
        {
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:660:6: ( ( rule__ToRule__ExpressionAssignment_1 ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:661:1: ( rule__ToRule__ExpressionAssignment_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getToRuleAccess().getExpressionAssignment_1()); 
        }
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:662:1: ( rule__ToRule__ExpressionAssignment_1 )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:662:2: rule__ToRule__ExpressionAssignment_1
        {
        pushFollow(FOLLOW_rule__ToRule__ExpressionAssignment_1_in_synpred3_InternalEce1355);
        rule__ToRule__ExpressionAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalEce

    // $ANTLR start synpred5_InternalEce
    public final void synpred5_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:672:6: ( ( ( rule__ToRule__Group_3__0 ) ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:672:6: ( ( rule__ToRule__Group_3__0 ) )
        {
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:672:6: ( ( rule__ToRule__Group_3__0 ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:673:1: ( rule__ToRule__Group_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getToRuleAccess().getGroup_3()); 
        }
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:674:1: ( rule__ToRule__Group_3__0 )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:674:2: rule__ToRule__Group_3__0
        {
        pushFollow(FOLLOW_rule__ToRule__Group_3__0_in_synpred5_InternalEce1391);
        rule__ToRule__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalEce

    // $ANTLR start synpred9_InternalEce
    public final void synpred9_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:744:1: ( ( ( rule__And__Group_0__0 ) ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:744:1: ( ( rule__And__Group_0__0 ) )
        {
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:744:1: ( ( rule__And__Group_0__0 ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:745:1: ( rule__And__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAndAccess().getGroup_0()); 
        }
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:746:1: ( rule__And__Group_0__0 )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:746:2: rule__And__Group_0__0
        {
        pushFollow(FOLLOW_rule__And__Group_0__0_in_synpred9_InternalEce1559);
        rule__And__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9_InternalEce

    // $ANTLR start synpred10_InternalEce
    public final void synpred10_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:750:6: ( ( ( rule__And__Group_1__0 ) ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:750:6: ( ( rule__And__Group_1__0 ) )
        {
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:750:6: ( ( rule__And__Group_1__0 ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:751:1: ( rule__And__Group_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAndAccess().getGroup_1()); 
        }
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:752:1: ( rule__And__Group_1__0 )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:752:2: rule__And__Group_1__0
        {
        pushFollow(FOLLOW_rule__And__Group_1__0_in_synpred10_InternalEce1577);
        rule__And__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10_InternalEce

    // $ANTLR start synpred11_InternalEce
    public final void synpred11_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:756:6: ( ( ( rule__And__Group_2__0 ) ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:756:6: ( ( rule__And__Group_2__0 ) )
        {
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:756:6: ( ( rule__And__Group_2__0 ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:757:1: ( rule__And__Group_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAndAccess().getGroup_2()); 
        }
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:758:1: ( rule__And__Group_2__0 )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:758:2: rule__And__Group_2__0
        {
        pushFollow(FOLLOW_rule__And__Group_2__0_in_synpred11_InternalEce1595);
        rule__And__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11_InternalEce

    // $ANTLR start synpred12_InternalEce
    public final void synpred12_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:778:1: ( ( ( rule__Equality__Group_0__0 ) ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:778:1: ( ( rule__Equality__Group_0__0 ) )
        {
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:778:1: ( ( rule__Equality__Group_0__0 ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:779:1: ( rule__Equality__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEqualityAccess().getGroup_0()); 
        }
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:780:1: ( rule__Equality__Group_0__0 )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:780:2: rule__Equality__Group_0__0
        {
        pushFollow(FOLLOW_rule__Equality__Group_0__0_in_synpred12_InternalEce1646);
        rule__Equality__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalEce

    // $ANTLR start synpred22_InternalEce
    public final void synpred22_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:944:1: ( ( ( rule__FloatExpr__ValueDirectAssignment_0 ) ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:944:1: ( ( rule__FloatExpr__ValueDirectAssignment_0 ) )
        {
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:944:1: ( ( rule__FloatExpr__ValueDirectAssignment_0 ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:945:1: ( rule__FloatExpr__ValueDirectAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getFloatExprAccess().getValueDirectAssignment_0()); 
        }
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:946:1: ( rule__FloatExpr__ValueDirectAssignment_0 )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:946:2: rule__FloatExpr__ValueDirectAssignment_0
        {
        pushFollow(FOLLOW_rule__FloatExpr__ValueDirectAssignment_0_in_synpred22_InternalEce2017);
        rule__FloatExpr__ValueDirectAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred22_InternalEce

    // $ANTLR start synpred23_InternalEce
    public final void synpred23_InternalEce_fragment() throws RecognitionException {   
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:950:6: ( ( ( rule__FloatExpr__ValueCalculatedAssignment_1 ) ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:950:6: ( ( rule__FloatExpr__ValueCalculatedAssignment_1 ) )
        {
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:950:6: ( ( rule__FloatExpr__ValueCalculatedAssignment_1 ) )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:951:1: ( rule__FloatExpr__ValueCalculatedAssignment_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getFloatExprAccess().getValueCalculatedAssignment_1()); 
        }
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:952:1: ( rule__FloatExpr__ValueCalculatedAssignment_1 )
        // ../org.xtext.ecerule.ui/src-gen/org/xtext/ecerule/ui/contentassist/antlr/internal/InternalEce.g:952:2: rule__FloatExpr__ValueCalculatedAssignment_1
        {
        pushFollow(FOLLOW_rule__FloatExpr__ValueCalculatedAssignment_1_in_synpred23_InternalEce2035);
        rule__FloatExpr__ValueCalculatedAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23_InternalEce

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
    public final boolean synpred10_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalEce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalEce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalEce_fragment(); // can never throw exception
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
    public final boolean synpred9_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalEce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalEce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalEce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalEce_fragment(); // can never throw exception
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
    static final String DFA5_eotS =
        "\34\uffff";
    static final String DFA5_eofS =
        "\34\uffff";
    static final String DFA5_minS =
        "\1\5\1\14\2\0\10\5\4\uffff\4\14\2\0\4\5\2\14";
    static final String DFA5_maxS =
        "\1\7\1\27\2\0\10\6\4\uffff\4\27\2\0\4\6\2\27";
    static final String DFA5_acceptS =
        "\14\uffff\1\3\1\4\1\1\1\2\14\uffff";
    static final String DFA5_specialS =
        "\1\uffff\1\3\1\0\1\1\20\uffff\1\4\1\2\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\1\1\1\3",
            "\1\12\1\13\4\uffff\1\10\1\11\1\4\1\5\1\7\1\6",
            "\1\uffff",
            "\1\uffff",
            "\1\21\1\20",
            "\1\21\1\20",
            "\1\21\1\20",
            "\1\21\1\20",
            "\1\23\1\22",
            "\1\23\1\22",
            "\1\25\1\24",
            "\1\25\1\24",
            "",
            "",
            "",
            "",
            "\1\12\1\13\4\uffff\1\10\1\11\1\4\1\5\1\7\1\6",
            "\1\12\1\13\4\uffff\1\10\1\11\1\4\1\5\1\7\1\6",
            "\1\12\1\13\4\uffff\1\10\1\11\1\26\1\27\1\31\1\30",
            "\1\12\1\13\4\uffff\1\10\1\11\1\26\1\27\1\31\1\30",
            "\1\uffff",
            "\1\uffff",
            "\1\33\1\32",
            "\1\33\1\32",
            "\1\33\1\32",
            "\1\33\1\32",
            "\1\12\1\13\4\uffff\1\10\1\11\1\26\1\27\1\31\1\30",
            "\1\12\1\13\4\uffff\1\10\1\11\1\26\1\27\1\31\1\30"
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
            return "739:1: rule__And__Alternatives : ( ( ( rule__And__Group_0__0 ) ) | ( ( rule__And__Group_1__0 ) ) | ( ( rule__And__Group_2__0 ) ) | ( ( rule__And__Group_3__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_2 = input.LA(1);

                         
                        int index5_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalEce()) ) {s = 14;}

                        else if ( (synpred10_InternalEce()) ) {s = 15;}

                        else if ( (synpred11_InternalEce()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index5_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_3 = input.LA(1);

                         
                        int index5_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalEce()) ) {s = 14;}

                        else if ( (synpred10_InternalEce()) ) {s = 15;}

                         
                        input.seek(index5_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_21 = input.LA(1);

                         
                        int index5_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalEce()) ) {s = 14;}

                        else if ( (synpred10_InternalEce()) ) {s = 15;}

                         
                        input.seek(index5_21);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_1 = input.LA(1);

                         
                        int index5_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_1==20) ) {s = 4;}

                        else if ( (LA5_1==21) ) {s = 5;}

                        else if ( (LA5_1==23) ) {s = 6;}

                        else if ( (LA5_1==22) ) {s = 7;}

                        else if ( (LA5_1==18) ) {s = 8;}

                        else if ( (LA5_1==19) ) {s = 9;}

                        else if ( (LA5_1==12) ) {s = 10;}

                        else if ( (LA5_1==13) ) {s = 11;}

                        else if ( (synpred11_InternalEce()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_20 = input.LA(1);

                         
                        int index5_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalEce()) ) {s = 14;}

                        else if ( (synpred10_InternalEce()) ) {s = 15;}

                         
                        input.seek(index5_20);
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
 

    public static final BitSet FOLLOW_ruleDroolsModel_in_entryRuleDroolsModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDroolsModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DroolsModel__StatementsAssignment_in_ruleDroolsModel100 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0_in_ruleStatement161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventNameAssignment_in_ruleEvent221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0_in_ruleFluent281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_entryRuleToRule308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToRule315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Alternatives_in_ruleToRule341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpr_in_entryRuleStringExpr368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpr375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringExpr__Alternatives_in_ruleStringExpr401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpr435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpr__Alternatives_in_ruleBoolExpr461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Alternatives_in_ruleAnd581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Alternatives_in_ruleEquality641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitchExpr_in_entryRuleswitchExpr728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleswitchExpr735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SwitchExpr__ValueAssignment_in_ruleswitchExpr761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMutationExpr_in_entryRuleMutationExpr788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMutationExpr795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MutationExpr__Group__0_in_ruleMutationExpr821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_entryRuleFloatExpr848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatExpr855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatExpr__Alternatives_in_ruleFloatExpr881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_entryRuleFluentWhoseValue1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluentWhoseValue1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FluentWhoseValue__FluentWhoseValueNameAssignment_in_ruleFluentWhoseValue1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStr_in_entryRuleStr1148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStr1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Str__ValueAssignment_in_ruleStr1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_entryRuleInRule1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInRule1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__Alternatives_in_ruleInRule1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_entryRuleConditionRule1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionRule1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionRule__ConditionAssignment_in_ruleConditionRule1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_0_in_rule__ToRule__Alternatives1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_1_in_rule__ToRule__Alternatives1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_2_in_rule__ToRule__Alternatives1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group_3__0_in_rule__ToRule__Alternatives1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_4_in_rule__ToRule__Alternatives1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStr_in_rule__StringExpr__Alternatives1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_rule__StringExpr__Alternatives1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpr__ValueAssignment_0_in_rule__BoolExpr__Alternatives1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpr__ValueAssignment_1_in_rule__BoolExpr__Alternatives1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__BoolExpr__Alternatives1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_0__0_in_rule__And__Alternatives1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Alternatives1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_2__0_in_rule__And__Alternatives1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_3__0_in_rule__And__Alternatives1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_0__0_in_rule__Equality__Alternatives1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Alternatives1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Equality__OpAlternatives_0_1_1_01698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Equality__OpAlternatives_0_1_1_01718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Equality__OpAlternatives_1_1_1_01753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Equality__OpAlternatives_1_1_1_01773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Comparison__OpAlternatives_1_1_01808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Comparison__OpAlternatives_1_1_01828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Comparison__OpAlternatives_1_1_01848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Comparison__OpAlternatives_1_1_01868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MutationExpr__ValueAlternatives_0_01903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MutationExpr__ValueAlternatives_0_01923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MutationExpr__ValueAlternatives_0_01943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MutationExpr__ValueAlternatives_0_01963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MutationExpr__ValueAlternatives_0_01983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatExpr__ValueDirectAssignment_0_in_rule__FloatExpr__Alternatives2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatExpr__ValueCalculatedAssignment_1_in_rule__FloatExpr__Alternatives2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatExpr__ValueOfFluentAssignment_2_in_rule__FloatExpr__Alternatives2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_02086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_02104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MulOrDiv__OpAlternatives_1_1_02138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MulOrDiv__OpAlternatives_1_1_02158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MulOrDiv__OpAlternatives_1_1_02178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MulOrDiv__OpAlternatives_1_1_02198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ValueDirectAssignment_0_in_rule__Primary__Alternatives2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ValueOfFluentAssignment_1_in_rule__Primary__Alternatives2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__TimeAssignment_0_in_rule__InRule__Alternatives2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InRule__CurrentTimeAssignment_1_in_rule__InRule__Alternatives2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Statement__Group__0__Impl2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12394 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__EventAssignment_1_in_rule__Statement__Group__1__Impl2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__22457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Statement__Group__2__Impl2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__32516 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__32519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__FluentAssignment_3_in_rule__Statement__Group__3__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__42576 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__5_in_rule__Statement__Group__42579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Group__4__Impl2606 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__5__Impl_in_rule__Statement__Group__52637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Statement__Group__5__Impl2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__02708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__02711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Statement__Group_4__0__Impl2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__12770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__FluentAssignment_4_1_in_rule__Statement__Group_4__1__Impl2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__02831 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__02834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__FluentNameAssignment_0_in_rule__Fluent__Group__0__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__12891 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2_in_rule__Fluent__Group__12894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0_in_rule__Fluent__Group__1__Impl2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__2__Impl_in_rule__Fluent__Group__22951 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3_in_rule__Fluent__Group__22954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0_in_rule__Fluent__Group__2__Impl2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__3__Impl_in_rule__Fluent__Group__33012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0_in_rule__Fluent__Group__3__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__0__Impl_in_rule__Fluent__Group_1__03078 = new BitSet(new long[]{0x0000000E007C00E0L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1_in_rule__Fluent__Group_1__03081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Fluent__Group_1__0__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_1__1__Impl_in_rule__Fluent__Group_1__13140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__ValuePartAssignment_1_1_in_rule__Fluent__Group_1__1__Impl3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__0__Impl_in_rule__Fluent__Group_2__03201 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1_in_rule__Fluent__Group_2__03204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Fluent__Group_2__0__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_2__1__Impl_in_rule__Fluent__Group_2__13263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__TimePartAssignment_2_1_in_rule__Fluent__Group_2__1__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__0__Impl_in_rule__Fluent__Group_3__03324 = new BitSet(new long[]{0x00000006000000E0L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1_in_rule__Fluent__Group_3__03327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Fluent__Group_3__0__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group_3__1__Impl_in_rule__Fluent__Group_3__13386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__CondPartAssignment_3_1_in_rule__Fluent__Group_3__1__Impl3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group_3__0__Impl_in_rule__ToRule__Group_3__03447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_3_0_in_rule__ToRule__Group_3__0__Impl3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__03506 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__03509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__13565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl3592 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__03627 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__03630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__13688 = new BitSet(new long[]{0x00000006000000E0L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__13691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Or__Group_1__1__Impl3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__23750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_0__0__Impl_in_rule__And__Group_0__03813 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__And__Group_0__1_in_rule__And__Group_0__03816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__Group_0__0__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_0__1__Impl_in_rule__And__Group_0__13872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_0_1__0_in_rule__And__Group_0__1__Impl3899 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__And__Group_0_1__0__Impl_in_rule__And__Group_0_1__03934 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__And__Group_0_1__1_in_rule__And__Group_0_1__03937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_0_1__1__Impl_in_rule__And__Group_0_1__13995 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__And__Group_0_1__2_in_rule__And__Group_0_1__13998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__And__Group_0_1__1__Impl4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_0_1__2__Impl_in_rule__And__Group_0_1__24057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_0_1_2_in_rule__And__Group_0_1__2__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__04120 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__04123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__Group_1__0__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__14181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1_1__0_in_rule__And__Group_1__1__Impl4208 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__And__Group_1_1__0__Impl_in_rule__And__Group_1_1__04243 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__And__Group_1_1__1_in_rule__And__Group_1_1__04246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1_1__1__Impl_in_rule__And__Group_1_1__14304 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__And__Group_1_1__2_in_rule__And__Group_1_1__14307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__And__Group_1_1__1__Impl4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1_1__2__Impl_in_rule__And__Group_1_1__24366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_1_2_in_rule__And__Group_1_1__2__Impl4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_2__0__Impl_in_rule__And__Group_2__04429 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__And__Group_2__1_in_rule__And__Group_2__04432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__And__Group_2__0__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_2__1__Impl_in_rule__And__Group_2__14490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_2_1__0_in_rule__And__Group_2__1__Impl4517 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__And__Group_2_1__0__Impl_in_rule__And__Group_2_1__04552 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__And__Group_2_1__1_in_rule__And__Group_2_1__04555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_2_1__1__Impl_in_rule__And__Group_2_1__14613 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__And__Group_2_1__2_in_rule__And__Group_2_1__14616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__And__Group_2_1__1__Impl4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_2_1__2__Impl_in_rule__And__Group_2_1__24675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_2_1_2_in_rule__And__Group_2_1__2__Impl4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_3__0__Impl_in_rule__And__Group_3__04738 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__And__Group_3__1_in_rule__And__Group_3__04741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__And__Group_3__0__Impl4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_3__1__Impl_in_rule__And__Group_3__14799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_3_1__0_in_rule__And__Group_3__1__Impl4826 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__And__Group_3_1__0__Impl_in_rule__And__Group_3_1__04861 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__And__Group_3_1__1_in_rule__And__Group_3_1__04864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_3_1__1__Impl_in_rule__And__Group_3_1__14922 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__And__Group_3_1__2_in_rule__And__Group_3_1__14925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__And__Group_3_1__1__Impl4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_3_1__2__Impl_in_rule__And__Group_3_1__24984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_3_1_2_in_rule__And__Group_3_1__2__Impl5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_0__0__Impl_in_rule__Equality__Group_0__05047 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Equality__Group_0__1_in_rule__Equality__Group_0__05050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_rule__Equality__Group_0__0__Impl5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_0__1__Impl_in_rule__Equality__Group_0__15106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_0_1__0_in_rule__Equality__Group_0__1__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_0_1__0__Impl_in_rule__Equality__Group_0_1__05167 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Equality__Group_0_1__1_in_rule__Equality__Group_0_1__05170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_0_1__1__Impl_in_rule__Equality__Group_0_1__15228 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__Equality__Group_0_1__2_in_rule__Equality__Group_0_1__15231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAssignment_0_1_1_in_rule__Equality__Group_0_1__1__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_0_1__2__Impl_in_rule__Equality__Group_0_1__25288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightAssignment_0_1_2_in_rule__Equality__Group_0_1__2__Impl5315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__05351 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__05354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpr_in_rule__Equality__Group_1__0__Impl5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__15412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1_1__0_in_rule__Equality__Group_1__1__Impl5439 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1_1__0__Impl_in_rule__Equality__Group_1_1__05474 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Equality__Group_1_1__1_in_rule__Equality__Group_1_1__05477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1_1__1__Impl_in_rule__Equality__Group_1_1__15535 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__Equality__Group_1_1__2_in_rule__Equality__Group_1_1__15538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAssignment_1_1_1_in_rule__Equality__Group_1_1__1__Impl5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1_1__2__Impl_in_rule__Equality__Group_1_1__25595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightAssignment_1_1_2_in_rule__Equality__Group_1_1__2__Impl5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__05658 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__05661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__15717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl5744 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__05779 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__05782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__15840 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__15843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__25900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MutationExpr__Group__0__Impl_in_rule__MutationExpr__Group__05963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MutationExpr__Group__1_in_rule__MutationExpr__Group__05966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MutationExpr__ValueAssignment_0_in_rule__MutationExpr__Group__0__Impl5993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MutationExpr__Group__1__Impl_in_rule__MutationExpr__Group__16023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__MutationExpr__Group__1__Impl6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__06083 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__06086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__16142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl6169 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__06204 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__06207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__16264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__06325 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__06328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__16386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PlusOrMinus__Group_1_0_0__1__Impl6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__06449 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__06452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__16510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PlusOrMinus__Group_1_0_1__1__Impl6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__06573 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__06576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__16632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl6659 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__06694 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__06697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__16755 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__16758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__26815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__DroolsModel__StatementsAssignment6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Statement__EventAssignment_16914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_36945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__Statement__FluentAssignment_4_16976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fluent__FluentNameAssignment_07038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToRule_in_rule__Fluent__ValuePartAssignment_1_17069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInRule_in_rule__Fluent__TimePartAssignment_2_17100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionRule_in_rule__Fluent__CondPartAssignment_3_17131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpr_in_rule__ToRule__ExpressionAssignment_07162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__ToRule__ExpressionAssignment_17193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleswitchExpr_in_rule__ToRule__ExpressionAssignment_27224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_rule__ToRule__ExpressionAssignment_3_07255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMutationExpr_in_rule__ToRule__ExpressionAssignment_47286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BoolExpr__ValueAssignment_07322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__BoolExpr__ValueAssignment_17366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_27405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__RightAssignment_0_1_27436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__And__RightAssignment_1_1_27467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__And__RightAssignment_2_1_27498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__RightAssignment_3_1_27529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAlternatives_0_1_1_0_in_rule__Equality__OpAssignment_0_1_17560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatExpr_in_rule__Equality__RightAssignment_0_1_27593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAlternatives_1_1_1_0_in_rule__Equality__OpAssignment_1_1_17624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpr_in_rule__Equality__RightAssignment_1_1_27657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_17688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_27721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SwitchExpr__ValueAssignment7757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MutationExpr__ValueAlternatives_0_0_in_rule__MutationExpr__ValueAssignment_07796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FloatExpr__ValueDirectAssignment_07829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__FloatExpr__ValueCalculatedAssignment_17860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_rule__FloatExpr__ValueOfFluentAssignment_27891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_17922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_17953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_27986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Primary__ValueDirectAssignment_08017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluentWhoseValue_in_rule__Primary__ValueOfFluentAssignment_18048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FluentWhoseValue__FluentWhoseValueNameAssignment8079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Str__ValueAssignment8110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InRule__TimeAssignment_08141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__InRule__CurrentTimeAssignment_18177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__ConditionRule__ConditionAssignment8216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_0_in_synpred2_InternalEce1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__ExpressionAssignment_1_in_synpred3_InternalEce1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToRule__Group_3__0_in_synpred5_InternalEce1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_0__0_in_synpred9_InternalEce1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_synpred10_InternalEce1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_2__0_in_synpred11_InternalEce1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_0__0_in_synpred12_InternalEce1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatExpr__ValueDirectAssignment_0_in_synpred22_InternalEce2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatExpr__ValueCalculatedAssignment_1_in_synpred23_InternalEce2035 = new BitSet(new long[]{0x0000000000000002L});

}