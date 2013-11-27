package org.xtext.ecerule.model;
import java.util.ArrayList;
import java.util.List;


public class Statement implements StatementInterface {

	private EventInterface event;
//	private List<EcContext> ecContextList;
	private List<ExpContextInterface> expContextList;
	

	public Statement() {
		event=new Event();
		expContextList= new ArrayList();
	}

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

	public void addExpContext(ExpContextInterface expContext) {
		this.expContextList.add(expContext);

	}

}
