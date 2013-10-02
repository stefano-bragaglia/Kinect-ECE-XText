package org.xtext.ecerule.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.ecerule.services.EceGrammarAccess;

@SuppressWarnings("all")
public class EceSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EceGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BoolExpr_FalseKeyword_1_or_TrueKeyword_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EceGrammarAccess) access;
		match_BoolExpr_FalseKeyword_1_or_TrueKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBoolExprAccess().getFalseKeyword_1()), new TokenAlias(false, false, grammarAccess.getBoolExprAccess().getTrueKeyword_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_BoolExpr_FalseKeyword_1_or_TrueKeyword_0.equals(syntax))
				emit_BoolExpr_FalseKeyword_1_or_TrueKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'true' | 'false'
	 */
	protected void emit_BoolExpr_FalseKeyword_1_or_TrueKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
