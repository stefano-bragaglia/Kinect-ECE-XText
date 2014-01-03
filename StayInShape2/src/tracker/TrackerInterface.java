package tracker;

import java.awt.Graphics;

import classifier.Classifier;

public interface TrackerInterface {

	public abstract int initTracker();
	
//	public abstract void resetTracker() throws GeneralException;
	
	public abstract void setClassifier(Classifier classifier);

	public abstract int updateDepth();

	public abstract void setStartedTest(boolean b);

	public abstract void paint(Graphics g);

}