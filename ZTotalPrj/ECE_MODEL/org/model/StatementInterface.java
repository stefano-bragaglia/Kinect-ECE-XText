package org.model;

import org.model.EventInterface;
import org.model.ExpContextInterface;
import org.visitor.CreateDeclarationsVisitor;
import org.visitor.CreateExpectationsVisitor;
import org.visitor.CreateOperationsVisitor;

public interface StatementInterface {
	
	public void setEvent(EventInterface event);
	
//	public void addEcContext(EcContextInterface ecContext);
	
	public void addExpContext(ExpContextInterface expContext);
	
	public void accept(CreateOperationsVisitor visitor);
	
	public void accept(CreateExpectationsVisitor visitor);
	
	public void accept(CreateDeclarationsVisitor visitor);
		
}
