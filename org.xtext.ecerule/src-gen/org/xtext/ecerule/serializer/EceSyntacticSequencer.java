package org.xtext.ecerule.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.ecerule.services.EceGrammarAccess;

@SuppressWarnings("all")
public class EceSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EceGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AtTimePrimary_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_AtTimePrimary_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EceGrammarAccess) access;
		match_AtTimePrimary_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getAtTimePrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_AtTimePrimary_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getAtTimePrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_Primary_LeftParenthesisKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
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
			if(match_AtTimePrimary_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_AtTimePrimary_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtTimePrimary_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_AtTimePrimary_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_LeftParenthesisKeyword_0_0_q.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_AtTimePrimary_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_AtTimePrimary_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('?
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
