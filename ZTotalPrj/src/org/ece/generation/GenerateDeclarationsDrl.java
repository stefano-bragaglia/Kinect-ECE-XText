package org.ece.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Iterator;

import org.model.ConditionInterface;
import org.model.EventInterface;
import org.model.ExpContext;
import org.model.ExpContextInterface;
import org.model.Model;
import org.model.Statement;
import org.visitor.CreateDeclarationsVisitor;

public class GenerateDeclarationsDrl {

	private Model model;
	static StringBuilder strbuild = new StringBuilder("");
	
	
	public GenerateDeclarationsDrl(Model m) throws FileNotFoundException{
		this.model=m;
		
		CreateDeclarationsVisitor declarationVisitor = new CreateDeclarationsVisitor();
		
		strbuild.append("package rec.dom; \n\n");
		
		strbuild.append("declare EventFrame extends Event \nend\n\n\n\n");
		
		
		
		
		
		// 1) dichiarazioni di eventi e loro parametri
		Iterator it = (Iterator) model.getStatements().values().iterator();
		while (it.hasNext()) {
			Statement stm = (Statement) it.next();
			EventInterface ev = stm.getEvent();
			ev.accept(declarationVisitor);
		}
		
		
		
		// 2) dichiarazione di fluenti (inclusi i parametri degli eventi)
		//    e inserimento dei sample relativi
		// 3) dichiarazione delle aspettavive
		it = (Iterator) model.getStatements().values().iterator();
		while (it.hasNext()) {
			Statement stm = (Statement) it.next();
			stm.accept(declarationVisitor);
		}
		
		
		
		
		/*
		//dichiarazioni di eventi e loro parametri
		Iterator it = (Iterator) model.getStatements().values().iterator();
		while (it.hasNext()) {
			Statement stm = (Statement) it.next();
			EventInterface ev = stm.getEvent();
			ev.accept(declarationVisitor);
		}
		
		//dicharazioni di eventi(non ancora) e loro parametri
		it = (Iterator) model.getStatements().values().iterator();
		while (it.hasNext()) {
			Statement stm = (Statement) it.next();
			if(stm.getExpContextList().size()!=0){
				ExpContextInterface expContext =stm.getExpContextList().get(0);
				expContext.accept(declarationVisitor);
			}
			
		}
		*/
		
		strbuild.append(declarationVisitor.getDeclarations());
		
		
		strbuild.append("rule \"InDeclaration\" \nwhen\nthen\n\tSystem.out.println(\"//Sono dentro a Declaration.drl\");\nend");
		
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




