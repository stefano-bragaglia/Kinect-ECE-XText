package org.ece.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Iterator;

import org.gradle.CreateDeclarationsVisitor;
import org.xtext.ecerule.model.EventInterface;
import org.xtext.ecerule.model.Model;
import org.xtext.ecerule.model.Statement;

public class CreateDeclarationsDrl {

	private Model model;
	static StringBuilder strbuild = new StringBuilder("");
	
	
	public CreateDeclarationsDrl(Model m) throws FileNotFoundException{
		this.model=m;
		
		CreateDeclarationsVisitor declarationVisitor = new CreateDeclarationsVisitor();
		
		Iterator it = (Iterator) model.getStatements().values().iterator();
		while (it.hasNext()) {
			Statement stm = (Statement) it.next();
			EventInterface ev = stm.getEvent();
			ev.accept(declarationVisitor);
			
		}
		
		strbuild.append(declarationVisitor.getDeclarations());
		
		
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




