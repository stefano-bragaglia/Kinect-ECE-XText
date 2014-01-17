/**
 * 
 */
package org.visitor;

/**
 * @author stefano
 * 
 */
public interface Visitable {

	public void accept(Visitor visitor);

}
