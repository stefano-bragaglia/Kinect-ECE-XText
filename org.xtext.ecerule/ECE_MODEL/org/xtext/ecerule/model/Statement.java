package org.xtext.ecerule.model;
import java.util.ArrayList;
import java.util.List;

import org.xtext.ecerule.model.Event;
import org.xtext.ecerule.model.EventInterface;
import org.xtext.ecerule.model.ExpContextInterface;
import org.xtext.ecerule.model.StatementInterface;


public class Statement implements StatementInterface {

	private EventInterface event;
	private List<EcContextInterface> ecContextList;
	private List<ExpContextInterface> expContextList;
	

	public Statement() {
		event=new Event();
		expContextList= new ArrayList();
	}

	@Override
	public void setEvent(EventInterface event) {
		this.event = event;

	}

	public List<ExpContextInterface> getExpContextList() {
		return expContextList;
	}

	public void setExpContextList(List<ExpContextInterface> expContextList) {
		this.expContextList = expContextList;
	}

	public EventInterface getEvent() {
		return event;
	}

	@Override
	public void addExpContext(ExpContextInterface expContext) {
		this.expContextList.add(expContext);

	}
	
	@Override
	public void addEcContext(EcContextInterface ecContext) {
		this.ecContextList.add(ecContext);

	}

}
