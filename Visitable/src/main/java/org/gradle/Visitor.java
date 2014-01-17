/**
 * 
 */
package org.gradle;

import org.xtext.ecerule.model.Event;
import org.xtext.ecerule.model.EventInterface;
import org.xtext.ecerule.model.ExpContext;
import org.xtext.ecerule.model.Statement;
import org.xtext.ecerule.model.Time;
import org.xtext.ecerule.model.conditions.relations.LessDescr;
import org.xtext.ecerule.model.conditions.relations.MoreDescr;
import org.xtext.ecerule.model.conditions.relations.SameDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;
import org.xtext.ecerule.model.expressions.SampleDescr;
import org.xtext.ecerule.model.expressions.operations.MinusDescr;
import org.xtext.ecerule.model.expressions.operations.PlusDescr;

import com.sample.EceStatement;

/**
 * @author stefano
 * 
 */
public interface Visitor {

	public void visit(Visitable object);

	public void visit(LessDescr lessDescr);
	
	public void visit(MoreDescr moreDescr);

	public void visit(PlusDescr plusDescr);
	
	public void visit(MinusDescr minusDescr);

	public void visit(SampleDescr sampleDescr);

	public void visit(NumberDescr numberDescr);
	
	public void visit(SameDescr sameDescr);
	
	public void visit(Event event);
	
	public void visit(Time time);
	
	public void visit(EceStatement eceStatement);
	
	

}
