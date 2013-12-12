package org.ece.generation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.gradle.TransfCondiVisitor;
import org.gradle.TransfEventVisitor;
import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.EventInterface;
import org.xtext.ecerule.model.ExpContext;
import org.xtext.ecerule.model.ExpContextInterface;
import org.xtext.ecerule.model.Model;
import org.xtext.ecerule.model.Statement;

import com.sample.EceStatement;

public class SystemManager {

	private Model model;
	private List<EceStatement> eceStmList = new ArrayList<EceStatement>();

	public Model getModel() {
		return model;
	}

	public List<EceStatement> getEceStmList() {
		return eceStmList;
	}

	public SystemManager(Model model) {
		this.model = model;

		Iterator it = (Iterator) model.getStatements().values().iterator();
		while (it.hasNext()) {
			EceStatement eceStm = new EceStatement(); // da inserirvi le
			// stringhe

			Statement stm = (Statement) it.next();

			if (stm.getExpContextList().size()!=0) { //se lo stm è un expStm
				
				EventInterface ev = stm.getEvent();
				List<ExpContextInterface> expContextList = stm
						.getExpContextList();

				ExpContext expContext = (ExpContext) expContextList.get(0);

				TransfEventVisitor visitorEvent = new TransfEventVisitor();
				ev.accept(visitorEvent);
				String evStr = visitorEvent.getOutputString();
				eceStm.setEventPattern(evStr);

//				if (expContext.getInitialCondition() != null) {
//					ConditionInterface initialCondition = expContext
//							.getInitialCondition();
//					TransfCondiVisitor visitor3 = new TransfCondiVisitor();
//					initialCondition.accept(visitor3);
//
//					String icStr = visitor3.getOutputString();
//					eceStm.setInitialCondition(icStr);
//				} else {
					eceStm.setInitialCondition("");
//				}

				ConditionInterface finalCondition = expContext
						.getFinalCondition();
				TransfCondiVisitor visitor1 = new TransfCondiVisitor();
				finalCondition.accept(visitor1);
				String fcRefStr = visitor1.getOutputStringReference();
				eceStm.setFinalConditionRef(fcRefStr);
				String fcExpStr = visitor1.getOutputStringExpression();
				eceStm.setFinalConditionExp(fcExpStr);

				eceStmList.add(eceStm);
			}

		}

	}

}
