package org.gradle;

import java.util.ArrayList;
import java.util.List;

import org.xtext.ecerule.model.Event;
import org.xtext.ecerule.model.conditions.relations.LessDescr;
import org.xtext.ecerule.model.conditions.relations.MoreDescr;
import org.xtext.ecerule.model.conditions.relations.SameDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;
import org.xtext.ecerule.model.expressions.SampleDescr;
import org.xtext.ecerule.model.expressions.operations.MinusDescr;
import org.xtext.ecerule.model.expressions.operations.PlusDescr;

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
		String decl = "declare "+eventName+ " extends Event\n\t@role(event)\nend";
		declarationsList.add(decl);
	}

}
