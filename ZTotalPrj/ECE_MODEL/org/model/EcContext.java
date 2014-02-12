package org.model;

import java.util.ArrayList;
import java.util.List;

import org.visitor.CreateDeclarationsVisitor;
import org.visitor.Visitor;

public class EcContext implements EcContextInterface {
	private List<FluentInterface> fluentList;
	
	public EcContext(){
		fluentList=new ArrayList();
	}
	
	@Override
	public void addFluent(FluentInterface fluent) {
		this.fluentList.add(fluent);
		
	}
	
	public List<FluentInterface> getFluentList() {
		return fluentList;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(CreateDeclarationsVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
