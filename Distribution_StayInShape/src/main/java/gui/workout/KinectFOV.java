package gui.workout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.OpenNI.GeneralException;
import org.OpenNI.StatusException;

import tracker.TrackerApplication;
import static constants.HumanBodyValues.*;

public class KinectFOV extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean stopped = false;

	private final int FOVwidth = 640, FOVheight = 480, margin = 15;
	private int MAXwidth, MAXheight;

	public JPanel kinectFOV;
	private JPanel kinectButton;
	private JButton kinect, reset, stop;
	private JTextArea error;

	private ControlsWO controls;
	private TrackerApplication trackerapp;
	// private MenuBar mb;

	private Thread kinectThread;

	public KinectFOV(int width, int height) {
		this.MAXheight = height;
		this.MAXwidth = width + MARGIN;
		configurePanel(this, MAXwidth, MAXheight);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		initKinectComp();
	}

	public void configurePanel(JPanel p, int w, int h) {
		Dimension d = new Dimension(w, h);
		p.setPreferredSize(d);
		p.setMinimumSize(d);
		p.setMaximumSize(d);
		p.setOpaque(false);
		// setTransparency(p);
	}

	private void initKinectComp() {
		kinectFOV = new JPanel();
		kinectButton = new JPanel();
		kinect = new JButton("Kinect");
		kinect.addActionListener(this);
		reset = new JButton("Reset");
		reset.setEnabled(false);
		reset.addActionListener(this);
		stop = new JButton("Stop");
		stop.setEnabled(false);
		stop.addActionListener(this);
		kinectButton.add(kinect);
		kinectButton.add(reset);
		kinectButton.add(stop);

		// Border blackline = BorderFactory.createLineBorder(Color.black);
		// kinectFOV.setBorder(blackline);
		// kinectButton.setBorder(blackline);

		configurePanel(kinectFOV, (FOVwidth + margin), (FOVheight + margin));
		configurePanel(kinectButton, MAXwidth, (MAXheight - FOVheight - margin));

		add(kinectFOV);
		add(kinectButton);
	}

	public void setTrackerApplicationDependency(TrackerApplication trackerapp) {
		this.trackerapp = trackerapp;
	}

	public void setControlsWODependency(ControlsWO controls) {
		this.controls = controls;
	}

	// public void setMenuBar(MenuBar mb){
	// this.mb = mb;
	// }

	public void startKinectThread() {
		kinectThread.start();
	}

	@SuppressWarnings("deprecation")
	public void stopKinectThread() {
		kinectThread.stop();
	}

	public void setEnabledKinectButton(boolean b) {
		kinect.setEnabled(b);
	}

	public void setEnabledResetButton(boolean b) {
		reset.setEnabled(b);
	}

	public void setEnabledStopButton(boolean b) {
		stop.setEnabled(b);
	}

	public boolean isStopped() {
		return stopped;
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == kinect) {

			kinectFOV.removeAll();

			trackerapp.createTracker();
			int result = trackerapp.viewer.initTracker();
			if (result == 0) {
				trackerapp.playKinectView();
				trackerapp.showKinectView();
				try {
					trackerapp.viewer.startGeneratingAll();
				} catch (GeneralException e) {
					e.printStackTrace();
				}

				kinectThread = new Thread(trackerapp);
				startKinectThread();

				kinect.setEnabled(false);
				reset.setEnabled(true);
				stop.setEnabled(true);
				controls.setEnableAllButtons(true, false, false);
				// mb.setEnableAllButtons(true, false, false);
			} else {
				error = new JTextArea(
						"Hai dimenticato di collegare il Kinect?\nCollegalo e riprova!");
				error.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
				error.setBackground(kinectFOV.getBackground());
				kinectFOV.add(error);
				kinectFOV.revalidate();
				kinectFOV.repaint();
				controls.setEnableAllButtons(false, false, false);
				kinect.setEnabled(true);
				reset.setEnabled(false);
				stop.setEnabled(false);
				// mb.setEnableAllButtons(false, false, false);
			}
		}

		if (arg0.getSource() == reset) {
			try {
				trackerapp.viewer.resetTracker();
			} catch (GeneralException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (arg0.getSource() == stop) {
			stopped = true;
			try {
				trackerapp.stopKinectView();
				trackerapp.viewer.stopGeneratingAll();
				
				kinectFOV.removeAll();
				kinectFOV.revalidate();
				kinectFOV.repaint();
				kinect.setEnabled(true);
			} catch (StatusException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
