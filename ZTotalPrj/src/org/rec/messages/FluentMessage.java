/**
 * 
 */
package org.rec.messages;

import org.rec.dom.Interval;

/**
 * @author stefano
 * 
 */
public class FluentMessage implements IModelMessage {

	private String label;

	private long start;

	private Interval value;
	
	public static FluentMessage newMessage(String label) {
		if (label == null || label.isEmpty())
			throw new IllegalArgumentException(
					"Illegal 'label' argument in FluentMessage.newMessage(String, long, Interval): "
							+ label);
		return new FluentMessage(label);
	}
	
	private FluentMessage(String label) {
		if (label == null || label.isEmpty())
			throw new IllegalArgumentException(
					"Illegal 'label' argument in FluentMessage(String, long, Interval): "
							+ label);
		this.label = label;
	}
	
	public static FluentMessage newMessage(String label, long start, Interval value) {
		if (label == null || label.isEmpty())
			throw new IllegalArgumentException(
					"Illegal 'label' argument in FluentMessage.newMessage(String, long, Interval): "
							+ label);
		if (value == null)
			throw new IllegalArgumentException(
					"Illegal 'value' argument in FluentMessage.newMessage(String, long, Interval): "
							+ value);
		return new FluentMessage(label, start, value);
	}

	private FluentMessage(String label, long start, Interval value) {
		if (label == null || label.isEmpty())
			throw new IllegalArgumentException(
					"Illegal 'label' argument in FluentMessage(String, long, Interval): "
							+ label);
		if (value == null)
			throw new IllegalArgumentException(
					"Illegal 'value' argument in FluentMessage(String, long, Interval): "
							+ value);
		this.label = label;
		this.start = start;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public long getStart() {
		return start;
	}

	public Interval getValue() {
		return value;
	}

	public String getFluentName() {
		// TODO Auto-generated method stub
		return label;
	}

}
