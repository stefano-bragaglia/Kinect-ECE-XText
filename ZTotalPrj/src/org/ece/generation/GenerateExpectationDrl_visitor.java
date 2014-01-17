package org.ece.generation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.model.Model;
import org.support.EceStatement;
import org.visitor.CreateDeclarationsVisitor;
import org.visitor.CreateExpectationsVisitor;

public class GenerateExpectationDrl_visitor {

	private Model model;
	static StringBuilder strbuild = new StringBuilder("");
	
	public GenerateExpectationDrl_visitor(Model m) {
		this.model=m;
		SystemManager sm = new SystemManager(model);
		CreateExpectationsVisitor expectationVisitor = new CreateExpectationsVisitor();
		
		strbuild = new StringBuilder("");
		strbuild.append("package rec.dom;\n\n");
		strbuild.append("global org.drools.time.SessionPseudoClock clock;\n\n");
		
		
		List<EceStatement> eceStmList = sm.getEceStmList();
		for (EceStatement eceStm : eceStmList) {
			eceStm.accept(expectationVisitor);
		}
		strbuild.append(expectationVisitor.getExpectations());
		
		strbuild.append("rule \"InSingleGenerated\" \nwhen\nthen\n\tSystem.out.println(\"//Sono dentro a Expectations.drl\");\nend");
		
	}
	
	
	public void generateDRL(String path) throws FileNotFoundException{
   	 	FileOutputStream file = new FileOutputStream(path);
		PrintStream out = new PrintStream(file);
        
        char[] dst = new char[strbuild.length()];
    	 strbuild.getChars(0, strbuild.length(), dst, 0);
    	
        System.out.println("Generated:" +path+"\n\n");
        for(int i=0; i<dst.length; i++)
        	out.print(dst[i]);
   }
	
	
	
}
