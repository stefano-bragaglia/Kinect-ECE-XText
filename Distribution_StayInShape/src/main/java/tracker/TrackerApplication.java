/****************************************************************************
 *                                                                           *
 *  OpenNI 1.x Alpha                                                         *
 *  Copyright (C) 2011 PrimeSense Ltd.                                       *
 *                                                                           *
 *  This file is part of OpenNI.                                             *
 *                                                                           *
 *  OpenNI is free software: you can redistribute it and/or modify           *
 *  it under the terms of the GNU Lesser General Public License as published *
 *  by the Free Software Foundation, either version 3 of the License, or     *
 *  (at your option) any later version.                                      *
 *                                                                           *
 *  OpenNI is distributed in the hope that it will be useful,                *
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of           *
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the             *
 *  GNU Lesser General Public License for more details.                      *
 *                                                                           *
 *  You should have received a copy of the GNU Lesser General Public License *
 *  along with OpenNI. If not, see <http://www.gnu.org/licenses/>.           *
 *                                                                           *
 ****************************************************************************/
package tracker;

import gui.workout.ControlsWO;
import gui.workout.KinectFOV;
import gui.workout.WorkOutPanel;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JTextArea;

import org.OpenNI.StatusException;

import classifier.Classifier;

public class TrackerApplication implements Runnable {

	/**
	 * 
	 */
	public TrackerInterface viewer;

	// public DemoTracker viewer;
	// public FakeTracker viewer;
	private KinectFOV kinect;
	private ControlsWO controls;
	public boolean shouldRun = false;

	private boolean fake;
	private Classifier classifier;

	private WorkOutPanel wop;

	public TrackerApplication(boolean fake, Classifier classifier) {
		this.fake = fake;
		this.classifier = classifier;
	}

	public void createTracker() {
		viewer = fake ? new FakeTracker() : new Tracker();
		viewer.setClassifier(classifier);

		/*
		 * InfoWO needs of TrackerApplication (Tracker really) in order to stop
		 * tracking when all of repetitions are terminated
		 */
		wop.getInfoWO().setDependencies(viewer);

		/*
		 * ControlsWO needs of: a) TrackerApplication (Tracker really) in order
		 * to start/stop tracking as a consequence of play/(pause and stop)
		 * pushed b) PoseWO in order to clean panel when stop pushed and to show
		 * appropriate imagePose when play pushed (start countdown as well as)
		 * c) InfoWO in order to clean panel when stop pushed
		 */
		wop.getControlsWO().setDependencies(viewer, wop.getPoseWO(),
				wop.getInfoWO(), classifier);

		/*
		 * KinectFOV needs of ControlsWO in order to disable/enable his button
		 * appropriately
		 */
		wop.getKinectFOV().setControlsWODependency(wop.getControlsWO());

		/*
		 * TrackerApplication needs of ControlsWO in order todisable all of
		 * button in case of kinect device error
		 */
		this.controls = wop.getControlsWO();
	}

	public void setDependencies(KinectFOV kinect, WorkOutPanel wop) {
		this.kinect = kinect;
		this.wop = wop;
	}

	public void showKinectView() {
		kinect.kinectFOV.add((Component) viewer);
		kinect.kinectFOV.revalidate();
		kinect.kinectFOV.repaint();

	}

	public void playKinectView() {
		shouldRun = true;
	}

	public void stopKinectView() {
		shouldRun = false;
	}

	public void run() {

		while (true) {

			if (shouldRun) {
				int result = viewer.updateDepth();
				if (result == 0) {
					((Component) viewer).repaint();

					kinect.kinectFOV.revalidate();
					kinect.kinectFOV.repaint();
				} else {
					if (!kinect.isStopped()) {
						kinect.kinectFOV.removeAll();
						JTextArea error = new JTextArea(
								"Kinect scollegato?\nCollegalo e riprova!");
						error.setFont(new Font("Arial", Font.CENTER_BASELINE,
								20));
						error.setBackground(kinect.getBackground());
						error.setEditable(false);
						kinect.kinectFOV.add(error);
					}
					else
						kinect.kinectFOV.removeAll();

					kinect.kinectFOV.revalidate();
					kinect.kinectFOV.repaint();

					if (controls.checkT())
						controls.stopT();
					controls.removeAllComponentsOfPosePanel();
					controls.setEnableAllButtons(false, false, false);

					stopKinectView();

					try {
						viewer.stopGeneratingAll();
					} catch (StatusException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					kinect.setEnabledKinectButton(true);
					kinect.setEnabledResetButton(false);
					kinect.setEnabledStopButton(false);

					kinect.stopKinectThread();
				}
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
