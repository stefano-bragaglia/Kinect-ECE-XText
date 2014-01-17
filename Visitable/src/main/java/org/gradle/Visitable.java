/**
 * 
 */
package org.gradle;

/**
 * @author stefano
 * 
 */
public interface Visitable {

	public void accept(Visitor visitor);

}
