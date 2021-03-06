package org.xtext.ecerule.model;

import org.gradle.CreateDeclarationsVisitor;
import org.gradle.TransfEventVisitor;

public interface EventInterface {

	public void setEventName(String eventName);
	
	public String getEventName();

	public void addEventFeature(String eventFeatureName);

	public void accept(TransfEventVisitor visitor);
	
	public void accept(CreateDeclarationsVisitor visitor);

}
