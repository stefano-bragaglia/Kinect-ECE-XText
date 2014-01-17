/**
 * 
 */
package org.rec.messages;

import org.rec.dom.Interval;

/**
 * @author stefano
 * 
 */
public interface IModelMessage {

	public String getLabel();

	public long getStart();

	public Interval getValue();

	String getFluentName();

}
