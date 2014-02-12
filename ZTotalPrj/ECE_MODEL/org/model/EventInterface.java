package org.model;

import org.visitor.CreateDeclarationsVisitor;
import org.visitor.CreateOperationsVisitor;
import org.visitor.TransfEventVisitor;


public interface EventInterface {

	public void setEventName(String eventName);
	
	public String getEventName();

	public void addEventFeature(String eventFeatureName);
	

	public void accept(TransfEventVisitor visitor);
	
	public void accept(CreateDeclarationsVisitor visitor);
	
	public void accept(CreateOperationsVisitor visitor);
}
