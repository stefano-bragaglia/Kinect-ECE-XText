package org.xtext.ecerule.model;

import java.util.List;

public class Event implements EventInterface {

	private String eventName;
	private List<String> eventFeatureList;
	
	@Override
	public void setEventName(String eventName) {
		this.eventName = eventName;

	}

	@Override
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

}
