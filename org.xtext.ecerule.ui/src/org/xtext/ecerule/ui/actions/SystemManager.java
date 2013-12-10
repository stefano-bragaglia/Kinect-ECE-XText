package org.xtext.ecerule.ui.actions;

import java.util.ArrayList;
import java.util.List;

import org.gradle.TransfCondiVisitor;
import org.gradle.TransfEventVisitor;
import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.EcContextInterface;
import org.xtext.ecerule.model.EventInterface;
import org.xtext.ecerule.model.ExpContext;
import org.xtext.ecerule.model.ExpContextInterface;
import org.xtext.ecerule.model.Model;
import org.xtext.ecerule.model.Statement;

import com.sample.EceStatement;

public class SystemManager {

	private Model model;
	private List<EceStatement> eceStmList = new ArrayList<EceStatement>();

	public Model getModel() {
		return model;
	}

	public SystemManager (Model model){
		this.model=model;
		
		for (int i= 0; i< model.getStatements().size(); i++){
			EceStatement eceStm = new EceStatement();  //da inserirvi le stringhe
			Statement stm = (Statement) model.getStatements().get(i);
			
			EventInterface ev = stm.getEvent();
			
			List<ExpContextInterface> expContextList = stm.getExpContextList();
			
			ExpContext expContext = (ExpContext) expContextList.get(0);
		
			
			TransfEventVisitor visitor2 = new TransfEventVisitor();
			ev.accept(visitor2);
			String evStr = visitor2.getOutputString();
			eceStm.setEventPattern(evStr);
			
			
			ConditionInterface finalCondition = expContext.getFinalCondition();
			TransfCondiVisitor visitor1 = new TransfCondiVisitor();
			finalCondition.accept(visitor1);
			
			String fcStr=visitor1.getOutputString();
			eceStm.setFinalCondition(fcStr);
			
			
			
			
			
			eceStmList.add(eceStm);
			
		
		}
	}
	
	

	
	
}
