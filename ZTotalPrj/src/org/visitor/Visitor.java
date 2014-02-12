/**
 * 
 */
package org.visitor;

import org.model.Event;
import org.model.EventInterface;
import org.model.ExpContext;
import org.model.Fluent;
import org.model.Model;
import org.model.Statement;
import org.model.Time;
import org.model.conditions.relations.LessDescr;
import org.model.conditions.relations.MoreDescr;
import org.model.conditions.relations.SameDescr;
import org.model.expressions.NumberDescr;
import org.model.expressions.SampleDescr;
import org.model.expressions.operations.MinusDescr;
import org.model.expressions.operations.MultDescr;
import org.model.expressions.operations.PlusDescr;
import org.support.EceStatement;


/**
 * @author stefano
 * 
 */
public interface Visitor {

	public void visit(Visitable object);

	public void visit(LessDescr lessDescr);
	
	public void visit(MoreDescr moreDescr);

	public void visit(PlusDescr plusDescr);
	
	public void visit(MultDescr multDescr);
	
	public void visit(MinusDescr minusDescr);

	public void visit(SampleDescr sampleDescr);

	public void visit(NumberDescr numberDescr);
	
	public void visit(SameDescr sameDescr);
	
	public void visit(Event event);
	
	public void visit(Time time);
	
	public void visit(EceStatement eceStatement);
	
	public void visit(Statement statement);
	
	public void visit(Fluent fluent);
	
	
	

}
