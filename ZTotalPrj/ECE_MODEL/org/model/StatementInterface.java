package org.model;

import org.model.EventInterface;
import org.model.ExpContextInterface;

public interface StatementInterface {
	
	public void setEvent(EventInterface event);
	
//	public void addEcContext(EcContextInterface ecContext);
	
	public void addExpContext(ExpContextInterface expContext);
		
}
