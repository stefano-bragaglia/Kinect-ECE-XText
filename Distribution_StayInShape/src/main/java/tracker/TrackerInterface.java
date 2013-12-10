package tracker;

import java.awt.Graphics;

import org.OpenNI.GeneralException;
import org.OpenNI.StatusException;

import classifier.Classifier;

public interface TrackerInterface {

	public abstract int initTracker();
	
	public abstract void resetTracker() throws GeneralException;
	
	public abstract void setClassifier(Classifier classifier);

	public abstract void startGeneratingAll() throws StatusException;

	public abstract void stopGeneratingAll() throws StatusException;

	public abstract int updateDepth();

	public abstract void setStartedTest(boolean b);

	public abstract void paint(Graphics g);

}