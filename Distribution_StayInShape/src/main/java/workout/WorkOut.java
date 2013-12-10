package workout;

import java.util.Observer;

import gauge.Distribution_Gauge;
import gui.workout.WorkOutPanel;
import rec.controller.Controller;
import tracker.TrackerApplication;
import classifier.Classifier;

public class WorkOut {

	public WorkOutPanel wop;
	private Controller controller;
	private Classifier classifier;
	private TrackerApplication trackerapp;

	public WorkOut(boolean fake) {

		wop = new WorkOutPanel();

		controller = new Controller();
		controller.start();

		classifier = new Classifier(fake);

		trackerapp = new TrackerApplication(fake, classifier);

		setDependencies();
	}
	
	public void addObserverToClassifier(Distribution_Gauge gauge){
		classifier.addObserver(gauge);
	}
	
	public Controller getController(){
		return controller;
	}
	
	public void addObserverToReasoner(Observer obs){
		controller.addObserverToReasoner(obs);
	}

	public void setDependencies() {

		/*
		 * TrackerApplication needs of kiectFOV in order to show kinecFOV and
		 * needs of WorkOutPanel in order to set other necessary dependencies
		 * when Tracker will be created
		 */
		trackerapp.setDependencies(wop.getKinectFOV(), wop);

		/*
		 * KinectFOV needs of: a) TrackerApplication in order to start openNI
		 * viewer and consequentially (his) kinectFOV
		 */
		wop.getKinectFOV().setTrackerApplicationDependency(trackerapp);

		// controllare se bene farlo qui o se bisogna farlo in
		// TrackerApplication dopo la creazione del Tracker
		addObserverToReasoner(wop.getInfoWO());
		addObserverToReasoner(wop.getPoseWO());
	}
}
