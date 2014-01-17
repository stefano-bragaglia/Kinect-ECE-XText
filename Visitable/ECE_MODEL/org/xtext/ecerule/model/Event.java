package org.xtext.ecerule.model;

import java.util.ArrayList;
import java.util.List;

import org.gradle.CreateDeclarationsVisitor;
import org.gradle.TransfEventVisitor;
import org.gradle.Visitable;
import org.gradle.Visitor;
import org.xtext.ecerule.model.EventInterface;

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


	

}
