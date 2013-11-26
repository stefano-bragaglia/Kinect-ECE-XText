package com.converter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.xtext.ecerule.model.Event;
import org.xtext.ecerule.model.Model;
import org.xtext.ecerule.model.Statement;
import org.xtext.ecerule.model.StatementInterface;

import com.converter.pattern.EventConverter;
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
	
	public ModelConverter(Model model){
		this.model = model;
		
		Iterator it = model.getStatements().values().iterator();
		while (it.hasNext()){
			manageStatement((StatementInterface) it.next());
			
		}
		
	}

	private void manageStatement(StatementInterface statement) {
		Statement stm = (Statement) statement;
		
		Event ev = (Event) stm.getEvent();
		EventConverter evConv = new EventConverter(ev);
		String evPattern = evConv.getPattern();
		
		
		//List ecContextList = stm.getEcContextList();
		//List expContextList = stm.getExpContextList();
		
		
		
		
		EceStatement eceStm = new EceStatement();
		eceStm.setEventPattern(evPattern);
		
		
		
		eceStmList.add(eceStm);
	}

}
