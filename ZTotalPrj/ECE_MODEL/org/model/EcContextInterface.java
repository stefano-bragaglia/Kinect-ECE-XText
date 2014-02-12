package org.model;

import org.visitor.CreateDeclarationsVisitor;
import org.visitor.Visitable;


public interface EcContextInterface extends Visitable {

	public void addFluent(FluentInterface fluent);
	
	public void accept(CreateDeclarationsVisitor visitor);
}
