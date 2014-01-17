package org.gradle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.xtext.ecerule.model.Event;
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

public class CreateExpectationsVisitor implements Visitor {

	private List<String> expectationList = new ArrayList();
	Random random = new Random();
	
	public String getExpectations() {
		String expectations="";
		for (String expct : expectationList){
			expectations = expectations + expct + "\n\n\n";
		}
		return expectations;
	}

	public List<String> getExpectationList() {
		return expectationList;
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
		// TODO Auto-generated method stub
		
	}

	public void visit(Time time) {
		// TODO Auto-generated method stub
		
	}

	public void visit(EceStatement eceStatement) {
		String evptr = eceStatement.getEventPattern();
		String icond = eceStatement.getInitialCondition();
		String fcondRef = eceStatement.getFinalConditionRef();
		String fcondExp = eceStatement.getFinalConditionExp();
		String allenExp = eceStatement.getAllenExp();
		String codef = eceStatement.getCodeFulf();
		String codev = eceStatement.getCodeViol();
		
		
		//fulfilment
		String exp = "rule \"Fulfilment " +random.nextInt(100000)+ "\"\n";
		exp = exp.concat("when\n");
		
			exp = exp.concat("\t"+evptr+"\n");
			exp = exp.concat("\t"+fcondRef+"\n");
			exp=exp.concat("\teval("+fcondExp+"==true && "+allenExp+"==true)\n");
			if(icond!="")
				exp=exp.concat("\t"+icond+"\n");
		
		exp = exp.concat("then\n");
		
			if(codef!=null)
				exp=exp.concat("\t"+codef+"\n");
			exp=exp.concat("\tSystem.out.println(\"FULFILLED :)\");\n");
		
		exp = exp.concat("end\n\n");
		
		
		//violation
		exp = exp.concat("rule \"Violation " +random.nextInt(100000)+ "\"\n");
		exp = exp.concat("when\n");
		
			exp = exp.concat("\t"+evptr+"\n");
			exp = exp.concat("\t"+fcondRef+"\n");
			exp=exp.concat("\teval("+fcondExp+"==false || "+allenExp+"==false)\n");
			if(icond!="")
				exp=exp.concat("\t"+icond+"\n");
		
		exp = exp.concat("then\n");
		
			if(codef!=null)
				exp=exp.concat("\t"+codef+"\n");
			exp=exp.concat("\tSystem.out.println(\"VIOLATED :(\");\n");
		
		exp = exp.concat("end\n\n");
		
		
		expectationList.add(exp);
		
	}


	


}
