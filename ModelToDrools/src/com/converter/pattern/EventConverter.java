package com.converter.pattern;

import org.xtext.ecerule.model.Event;

public class EventConverter {
	private Event event;
	private String outputPattern;

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}


	public EventConverter(Event event){
		this.event=event;
		
	}
	
	public String getPattern(){
		String out = "$evPtr Event(name==\""+event.getEventName()+"\" "+manageParameters()+")";
		
		System.out.println("PATTERN EVENT----->  "+out);
		return out; 
		
	}
	
	public String manageParameters(){
		String out="";
		if(event.getEventFeatureList()!=null){
			
			System.out.println("ho dei parametri");
			
			out=out.concat(", ");
			
			for(int i=0; i<event.getEventFeatureList().size(); i++){
				if(i>0){
					out=out.concat(", ");
				}
				out=out.concat("par"+i+"n==\""+event.getEventFeatureList().get(i)+"\", $p1v: par"+i+"v");
				
			}
		}
		return out;
	}
}
