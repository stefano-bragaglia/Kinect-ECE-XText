package org.ece.generation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Iterator;

import org.model.EcContextInterface;
import org.model.Event;
import org.model.EventInterface;
import org.model.ExpContextInterface;
import org.model.Model;
import org.model.Statement;
import org.visitor.CreateOperationsVisitor;

public class GenerateOperationsDrl {

	private Model model;
	static StringBuilder strbuild = new StringBuilder("");
	
	public GenerateOperationsDrl(Model model) {
		this.model = model;
		Iterator it;
		CreateOperationsVisitor operationVisitor = new CreateOperationsVisitor();
		operationVisitor.setModel(model);
		
		//regole che settano i fluenti con il valore dei parametri del'evento scatenante
//		Iterator it = (Iterator) model.getStatements().values().iterator();
//		while (it.hasNext()) {
//			Statement stm = (Statement) it.next();
//			EventInterface ev = stm.getEvent();
//			Event event = (Event) ev;
//			if (event.getEventFeatureList().size()!=0){
//				ev.accept(operationVisitor);
//			}
//		}
		
		//regole che settano i fluenti con il valore dei parametri del'evento nell'aspettativa
//		it = (Iterator) model.getStatements().values().iterator();
//		while (it.hasNext()) {
//			Statement stm = (Statement) it.next();
//			
//			if(stm.getExpContextList().size()!=0){
//				ExpContextInterface expContext =stm.getExpContextList().get(0);
//				expContext.accept(operationVisitor);
//			}
//		}
		
		//regole che settato il valore di un fluente (caso ecContext)
		it = (Iterator) model.getStatements().values().iterator();
		while (it.hasNext()) {
			Statement stm = (Statement) it.next();
			if(stm.getEcContextList().size()!=0){
				stm.accept(operationVisitor);
			}
		}
		
		
		
		
		strbuild.append("package rec.dom; \n\n");
		strbuild.append(operationVisitor.getOperations());
		
		strbuild.append("rule \"InOperations\" \nwhen\nthen\n\tSystem.out.println(\"//Sono dentro a Operations.drl\");\nend");
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
