package org.visitor;

import java.util.ArrayList;
import java.util.List;

import org.model.Event;
import org.model.ExpContext;
import org.model.Statement;
import org.model.Time;
import org.model.conditions.relations.LessDescr;
import org.model.conditions.relations.MoreDescr;
import org.model.conditions.relations.SameDescr;
import org.model.expressions.NumberDescr;
import org.model.expressions.SampleDescr;
import org.model.expressions.operations.MinusDescr;
import org.model.expressions.operations.PlusDescr;
import org.support.EceStatement;


public class CreateDeclarationsVisitor implements Visitor {

	private List<String> declarationsList = new ArrayList();
	
	
	
	public String getDeclarations() {
		String declarations="";
		for (String decl : declarationsList){
			declarations = declarations + decl + "\n\n\n";
		}
		return declarations;
	}

	public List<String> getDeclarationsList() {
		return declarationsList;
	}

	public void visit(Visitable object) {
		// TODO Auto-generated method stub
		
	}

	public void visit(LessDescr lessDescr) {
		// TODO Auto-generated method stub
		
	}

	public void visit(MoreDescr moreDescr) {
		// TODO Auto-generated method stub
		
	}

	public void visit(PlusDescr plusDescr) {
		// TODO Auto-generated method stub
		
	}

	public void visit(MinusDescr minusDescr) {
		// TODO Auto-generated method stub
		
	}

	public void visit(SampleDescr sampleDescr) {
		// TODO Auto-generated method stub
		
	}

	public void visit(NumberDescr numberDescr) {
		// TODO Auto-generated method stub
		
	}

	public void visit(SameDescr sameDescr) {
		// TODO Auto-generated method stub
		
	}

	public void visit(Event event) {
		String eventName = event.getEventName();
		String decl = "declare "+eventName+ " extends Event\n";
		//decl = decl.concat("\t@role(event)\n");
		decl = decl.concat("end\n");
		declarationsList.add(decl);
	}

	public void visit(ExpContext expContext) {
		// TODO Auto-generated method stub
		
	}

	public void visit(Time time) {
		// TODO Auto-generated method stub
		
	}

	public void visit(EceStatement eceStatement) {
		// TODO Auto-generated method stub
		
	}

}
