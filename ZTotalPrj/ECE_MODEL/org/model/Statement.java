package org.model;
import java.util.ArrayList;
import java.util.List;

import org.model.Event;
import org.model.EventInterface;
import org.model.ExpContextInterface;
import org.model.StatementInterface;
import org.visitor.CreateDeclarationsVisitor;
import org.visitor.CreateExpectationsVisitor;
import org.visitor.CreateOperationsVisitor;


public class Statement implements StatementInterface {

	private EventInterface event;
	private List<EcContextInterface> ecContextList;
	private List<ExpContextInterface> expContextList;
	

	public Statement() {
		event=new Event();
		ecContextList= new ArrayList();
		expContextList= new ArrayList();
	}

	public void setEvent(EventInterface event) {
		this.event = event;

	}

	public EventInterface getEvent() {
		return event;
	}
	
	public List<ExpContextInterface> getExpContextList() {
		return expContextList;
	}

	public void setExpContextList(List<ExpContextInterface> expContextList) {
		this.expContextList = expContextList;
	}

	

	public List<EcContextInterface> getEcContextList() {
		return ecContextList;
	}

	public void setEcContextList(List<EcContextInterface> ecContextList) {
		this.ecContextList = ecContextList;
	}

	public void addExpContext(ExpContextInterface expContext) {
		this.expContextList.add(expContext);

	}
	
	public void addEcContext(EcContextInterface ecContext){
		this.ecContextList.add(ecContext);
	}

	@Override
	public void accept(CreateOperationsVisitor visitor) {
		visitor.visit(this);
		
	}

	@Override
	public void accept(CreateExpectationsVisitor visitor) {
		visitor.visit(this);
		
	}

	@Override
	public void accept(CreateDeclarationsVisitor visitor) {
		visitor.visit(this);
		
	}

	
	

}
