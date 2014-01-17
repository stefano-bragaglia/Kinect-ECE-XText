/**
 * 
 */
package rec.messages;

import rec.dom.Interval;

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
