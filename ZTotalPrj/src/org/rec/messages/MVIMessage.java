/**
 * 
 */
package org.rec.messages;

import org.rec.dom.Interval;

/**
 * @author stefano
 * 
 */
public class MVIMessage implements IModelMessage {

	private String label;
	
	private String fluentName;

	private long start;

	private Interval value;
	
	
	public static MVIMessage newMessage(String label, String fluentName, long start, Interval value) {
		if (label == null || label.isEmpty())
			throw new IllegalArgumentException(
					"Illegal 'label' argument in FluentMessage.newMessage(String, long, Interval): "
							+ label);
		if (fluentName == null)
			throw new IllegalArgumentException(
					"Illegal 'fluentName' argument in FluentMessage.newMessage(String, long, Interval): "
							+ value);
		return new MVIMessage(label, fluentName, start, value);
	}

	private MVIMessage(String label, String fluentName, long start, Interval value) {
		if (label == null || label.isEmpty())
			throw new IllegalArgumentException(
					"Illegal 'label' argument in FluentMessage(String, long, Interval): "
							+ label);
		if (fluentName == null)
			throw new IllegalArgumentException(
					"Illegal 'fluentName' argument in FluentMessage(String, long, Interval): "
							+ value);
		this.label = label;
		this.start = start;
		this.value = value;
		this.fluentName = fluentName;
	}

	public String getLabel() {
		return label;
	}
	
	public String getFluentName() {
		return fluentName;
	}

	public long getStart() {
		return start;
	}

	public Interval getValue() {
		return value;
	}


}
