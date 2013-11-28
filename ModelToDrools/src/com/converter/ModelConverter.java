package com.converter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.Event;
import org.xtext.ecerule.model.ExpContext;
import org.xtext.ecerule.model.ExpContextInterface;
import org.xtext.ecerule.model.Model;
import org.xtext.ecerule.model.Statement;
import org.xtext.ecerule.model.StatementInterface;

import com.converter.pattern.EventConverter;
import com.converter.pattern.FinalCondConverter;
import com.sample.EceStatement;

// converte gli statement contenuti nel Model il EceStatement per Drools
public class ModelConverter {
	private Model model;
	private List<EceStatement> eceStmList = new ArrayList();

	public Model getModel() {
		return model;
	}

	public List<EceStatement> getEceStmList() {
		return eceStmList;
	}

	public ModelConverter(Model model) {
		this.model = model;

		Iterator it = model.getStatements().values().iterator();
		while (it.hasNext()) {
			manageStatement((StatementInterface) it.next());

		}

	}

	private void manageStatement(StatementInterface statement) {
		Statement stm = (Statement) statement;
		
		Event ev = (Event) stm.getEvent();
		EventConverter evConv = new EventConverter(ev);
		String evPattern = evConv.getPattern();
		
		
		//List ecContextList = stm.getEcContextList();
		
		List expContextList = stm.getExpContextList();
		String fcPattern = "";
		if(expContextList.size()!=0){
			
			ExpContext expContext1 = (ExpContext) expContextList.get(0);
			
			if(expContext1.getInitialCondition()!=null){
				ConditionInterface initialCondition = expContext1.getInitialCondition();
				///....gestione initial conditio...
			}
			
			ConditionInterface finalCondition = expContext1.getFinalCondition();
			FinalCondConverter fcConv = new FinalCondConverter(finalCondition);
			fcPattern = fcConv.getPattern();
			
			
			
		}
		
		
		
		
		EceStatement eceStm = new EceStatement();
		eceStm.setEventPattern(evPattern);
		eceStm.setFinalCondition(fcPattern);
		
		
		
		eceStmList.add(eceStm);
	}
}
