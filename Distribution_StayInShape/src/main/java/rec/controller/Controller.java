/**
 * 
 */
package rec.controller;

import java.util.Observable;
import java.util.Observer;

import rec.model.Model;

/**
 * @author stefano
 * 
 */
public class Controller implements Observer {

	/**
	 * 
	 */
	public Model model;

	public Controller() {
		model = new Model();
	}

	public void addObserverToReasoner(Observer obs){
		model.addObserver(obs);
	}
	
//	public void addObserverToReasoner(InfoWO info, PoseWO pose){
//		model.addObserver(info);
//		model.addObserver(pose);
//	}
	
	public Model getModel(){
		return model;
	}
	
	public void start() {
		model.start();
	}

	public void stamp() {
		model.stamp();
	}
	
	public void notifyEvent(String label, long time, double value) {
		model.insert(label, time, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (arg instanceof Object[]) {
			Object[] obj = (Object[]) arg;

			String event = (String) obj[0];
			Long time = (Long) obj[1];
			Double value = (Double) obj[2];

//			System.out.println("Event = " + event + "\tTime = "
//					+ time.longValue() + "\tvalue = " + value.doubleValue());
			notifyEvent(event, time.longValue(), value.doubleValue());
		}
	}

}
