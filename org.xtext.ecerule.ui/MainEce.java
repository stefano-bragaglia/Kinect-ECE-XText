import org.xtext.ecerule.model.*;
import org.xtext.ecerule.model.conditions.*;
import org.xtext.ecerule.model.conditions.compounds.*;
import org.xtext.ecerule.model.conditions.relations.*;
import org.xtext.ecerule.model.expressions.*;
import org.xtext.ecerule.model.expressions.operations.*;

public class MainEce {
	
	public Model getModel() {	
		
		Statement statement;
		Event event;
		String eventName;
		ExpressionInterface exprContainer;
		ConditionInterface condContainer;
		EcContext ecContext;
		ExpContext expContext;
		Time time;
		
		Model model = new Model();
		
		
		statement = new Statement();
event = new Event();
eventName = "StartEv";
event.setEventName(eventName);
statement.setEvent(event);
 								ecContext = new EcContext();
statement.addEcContext(ecContext);


													model.add("StmStartEv", statement);


		statement = new Statement();
event = new Event();
eventName = "AlzatoEv";
event.setEventName(eventName);
statement.setEvent(event);
 								
expContext = new ExpContext();

condContainer = new SameDescr(new SampleDescr("SedutoFl")
,new NumberDescr(440));
expContext.setFinalCondition(condContainer);

statement.addExpContext(expContext);

													model.add("StmAlzatoEv", statement);


		
		return model;
	}	
}
