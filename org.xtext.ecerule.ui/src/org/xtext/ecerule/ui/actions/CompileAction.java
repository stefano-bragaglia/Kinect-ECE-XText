package org.xtext.ecerule.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class CompileAction extends Action implements IWorkbenchWindowActionDelegate {

	public void run(IAction arg0) {
		System.out.println("ho premuto il pulsante compilazione");
		
	}

	public void selectionChanged(IAction arg0, ISelection arg1) {
		// TODO Auto-generated method stub
		
	}

	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	public void init(IWorkbenchWindow arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
