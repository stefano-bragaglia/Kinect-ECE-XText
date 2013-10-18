package org.xtext.ecerule.model;
import java.util.List;


public class Statement implements StatementInterface {

	private EventInterface event;
//	private List<EcContext> ecContextList;
	private List<ExpContextInterface> expContextList;
	

	@Override
	public void setEvent(EventInterface event) {
		this.event = event;

	}

	@Override
	public void addExpContext(ExpContextInterface expContext) {
		this.expContextList.add(expContext);

	}

}
