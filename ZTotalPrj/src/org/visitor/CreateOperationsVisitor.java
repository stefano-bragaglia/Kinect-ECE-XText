package org.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.model.EcContext;
import org.model.EcContextInterface;
import org.model.Event;
import org.model.ExpContext;
import org.model.ExpContextInterface;
import org.model.ExpressionInterface;
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

public class CreateOperationsVisitor implements Visitor{

	private List<String> operationsList = new ArrayList();
	Random random = new Random();
	Model model;
	
	public String getOperations() {
		String operations="";
		for (String oper : operationsList){
			operations = operations + oper + "\n\n\n";
		}
		return operations;
	}
	
	
	
	public void setModel(Model model) {
		this.model = model;
	}



	public List<String> getOperationsList() {
		return operationsList;
	}


	@Override
	public void visit(LessDescr lessDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(MoreDescr moreDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(PlusDescr plusDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(MinusDescr minusDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SampleDescr sampleDescr) {
		String eventName = sampleDescr.getName();
		String paramName = sampleDescr.getEventFeatureList().get(0);

		String ope = "rule \"Insert param fluent "+paramName+" of event "+eventName+"\"\n";
		ope = ope.concat("when\n");
		
			ope = ope.concat("\t$ev: "+eventName+"($param: param)\n");
			ope = ope.concat("\t$flpar: "+paramName+"()\n");
		
		ope = ope.concat("then\n");
		
			ope = ope.concat("\tSample s=new Sample();\n");
			ope = ope.concat("\ts.setFluent($flpar);\n");
			ope = ope.concat("\ts.setValue($param);\n");
			ope = ope.concat("\tinsert(s);\n");
		
		ope = ope.concat("end\n");
		
		
		operationsList.add(ope);
		
	}

	@Override
	public void visit(NumberDescr numberDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SameDescr sameDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Event event) {
		String eventName = event.getEventName();
		String paramName= event.getEventFeatureList().get(0);
		
		String ope = "rule \"Insert param fluent "+paramName+" of event "+eventName+"\"\n";
		ope = ope.concat("when\n");
		
			ope = ope.concat("\t$ev: "+eventName+"($param: param)\n");
			ope = ope.concat("\t$flpar: "+paramName+"()\n");
		
		ope = ope.concat("then\n");
		
			ope = ope.concat("\tSample s=new Sample();\n");
			ope = ope.concat("\ts.setFluent($flpar);\n");
			ope = ope.concat("\ts.setValue($param);\n");
			ope = ope.concat("\tinsert(s);\n");
		
		ope = ope.concat("end\n");
		
		
		operationsList.add(ope);	
	}

	@Override
	public void visit(Time time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(EceStatement eceStatement) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visit(Statement statement) {
		if(statement.getEcContextList().size()!=0){ //se è uno statement EC
			String paramName = null;
			Event ev = (Event) statement.getEvent();
			String evName = ev.getEventName(); //event name
			if(ev.getEventFeatureList().size()!=0){
				paramName= ev.getEventFeatureList().get(0);
			}
			
			
			
			String ope = "rule \"Operations on "+evName+" event    "+random.nextInt(100000)+"\" \n";
			ope = ope.concat("when\n");
				
				ope = ope.concat("\t$ev: "+evName+"($par:param!=null)\n\n");
				
				
				for(EcContextInterface ecCtxt: statement.getEcContextList()){
					EcContext ecContext = (EcContext) ecCtxt;
					Fluent fl = (Fluent) ecContext.getFluentList().get(0);
					String flName = fl.getFluentName();//fluent name
					ExpressionInterface expr = fl.getToExpression();
					
					TransfExpressionVisitor tev = new TransfExpressionVisitor();
					expr.accept(tev);
					List<String> sampleList = tev.getSampleList();
					String exprPattern = tev.getExprPattern();
					
					for(String sample:sampleList){ //se ci sono parametri
						ope = ope.concat("\t$flpar_"+sample+": "+sample+"() \n"); // $flpar_poseConf: poseConf() 
						ope = ope.concat("\t$s_"+sample+": Sample(fluent==$flpar_"+sample+")\n\n"); // $s_poseConf: Sample(fluent==$flpar_poseConf)
					}
					
					ope = ope.concat("\t$fl_"+flName+": "+flName+"()\n"); // $fl_LeftArm: LeftArm()
					ope = ope.concat("\t$s_"+flName+": Sample(fluent==$fl_"+flName+")\n\n"); // $s_LeftArm: Sample(fluent==$fl_LeftArm)
					
					
				}
				
			ope = ope.concat("then\n");
			
				ope = ope.concat("\tretract($ev);\n\n");
				
				for(EcContextInterface ecCtxt: statement.getEcContextList()){
					EcContext ecContext = (EcContext) ecCtxt;
					Fluent fl = (Fluent) ecContext.getFluentList().get(0);
					String flName = fl.getFluentName();//fluent name
					ExpressionInterface expr = fl.getToExpression();
					
					TransfExpressionVisitor tev = new TransfExpressionVisitor();
					tev.setParamName(paramName);
					expr.accept(tev);
					List<String> sampleList = tev.getSampleList();
					String exprPattern = tev.getExprPattern();
					
					if(exprPattern.length()<6){ //se è un numero
						ope = ope.concat("\tSystem.out.println(\"Set "+flName+" to "+exprPattern+"  \");\n");	
					}else{ //se è un riferimento ad un fluente
						ope = ope.concat("\tSystem.out.println(\"Set "+flName+" to fluent/parameter value (or or their composition)\");\n");
					}
					
					ope = ope.concat("\tmodify($s_"+flName+"){\n");
						ope = ope.concat("\t\tsetValue("+exprPattern+");\n");
					ope = ope.concat("\t}\n");
					
				}
				ope = ope.concat("\n\tEventFrame evf = new EventFrame();\n");
				ope = ope.concat("\tinsert(evf);\n\n");
				
				
				//guardo se lo statement contiene anche contesti EXP
				if(statement.getExpContextList().size()!=0){ //se è uno statement EXP
					ope = ope.concat("\tExpectation"+evName+" exp = new Expectation"+evName+"();\n"); 
					ope = ope.concat("\texp.setState(-1);//pending\n");
					ope = ope.concat("\tinsert(exp);\n");
					ope = ope.concat("\tSystem.out.println(\"Lancio aspettativa...\");\n");
					
				}
				

			ope = ope.concat("end\n");
			
			operationsList.add(ope);
			
			
			
			
			
//			for(EcContextInterface ecCtxt: statement.getEcContextList()){
//				EcContext ecContext = (EcContext) ecCtxt;
//				Fluent fl = (Fluent) ecContext.getFluentList().get(0);
//				String flName = fl.getFluentName();//fluent name
//				ExpressionInterface expr = fl.getToExpression();
//				
//				TransfExpressionVisitor tev = new TransfExpressionVisitor();
//				expr.accept(tev);
//				List<String> sampleList = tev.getSampleList();
//				String exprPattern = tev.getExprPattern();
//				
//				
//				ope = "rule \"Set value of "+flName+" fluent    "+random.nextInt(100000)+"\" \n";
//				ope = ope.concat("when\n");
//				
//					ope = ope.concat("\t$ev: "+evName+"()\n");
//					
//					for(String sample:sampleList){ //se ci sono parametri
//						ope = ope.concat("\t$flpar: "+sample+"() \n");
//						ope = ope.concat("\t$"+sample+"Smpl: Sample(fluent==$flpar)\n");
//					}
//					ope = ope.concat("\t$fl:"+flName+"()\n");
//				
//				ope = ope.concat("then\n");
//					if(exprPattern.length()<6){ //se è un numero
//						ope = ope.concat("\tSystem.out.println(\"Settato fluente "+flName+" a "+exprPattern+"  \");\n");	
//					}else{ //se è un riferimento ad un fluente
//						ope = ope.concat("\tSystem.out.println(\"Settato fluente "+flName+" a \"+$poseConfSmpl.getValue());\n");
//					}
//					
//					ope = ope.concat("\tSample s = new Sample();\n");
//					ope = ope.concat("\ts.setFluent($fl);\n");
//					ope = ope.concat("\ts.setValue("+exprPattern+");\n");
//					ope = ope.concat("\tinsert(s);\n");
//				
//				ope = ope.concat("end\n");
//			
//			
//				operationsList.add(ope);
//				
//				
//				
//				
//				
//			}	
			
		}
		
	}


	@Override
	public void visit(MultDescr multDescr) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visit(Visitable object) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void visit(Fluent fluent) {
		// TODO Auto-generated method stub
		
	}

}
