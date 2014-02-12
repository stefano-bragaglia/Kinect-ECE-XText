package org.model;

import java.util.ArrayList;
import java.util.List;

import org.model.EventInterface;
import org.visitor.CreateDeclarationsVisitor;
import org.visitor.CreateOperationsVisitor;
import org.visitor.TransfEventVisitor;

public class Event implements EventInterface {

	private String eventName;
	private List<String> eventFeatureList = new ArrayList();
	
	public Event(String name) {
		this.eventName=name;
	}
	
	public Event() {
		
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;

	}

	public void addEventFeature(String eventFeatureName) {
		this.eventFeatureList.add(eventFeatureName);

	}

	public List<String> getEventFeatureList() {
		return eventFeatureList;
	}

	public void setEventFeatureList(List<String> eventFeatureList) {
		this.eventFeatureList = eventFeatureList;
	}

	public String getEventName() {
		return eventName;
	}

	public void accept(TransfEventVisitor visitor) {
		visitor.visit(this);
		
	}
	
	public void accept(CreateDeclarationsVisitor visitor) {
		visitor.visit(this);
		
	}

	@Override
	public void accept(CreateOperationsVisitor visitor) {
		visitor.visit(this);
	}



	

}
