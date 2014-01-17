package org.xtext.ecerule.model;

import org.xtext.ecerule.model.EventInterface;
import org.xtext.ecerule.model.ExpContextInterface;

public interface StatementInterface {
	
	public void setEvent(EventInterface event);
	
//	public void addEcContext(EcContextInterface ecContext);
	
	public void addExpContext(ExpContextInterface expContext);

	public void addEcContext(EcContextInterface expContext);
		
}
