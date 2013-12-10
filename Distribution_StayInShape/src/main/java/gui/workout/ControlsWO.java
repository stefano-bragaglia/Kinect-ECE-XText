package gui.workout;

import gauge.Distribution_Gauge;
import gui.views.posture_pose.PoseWO;
import gui.workout.countdown.ImagesToStart;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import classifier.Classifier;
import tracker.TrackerInterface;

public class ControlsWO extends JPanel implements ActionListener,
		MouseListener {

	private final String[] buttons = { "play.png", "pause.png", "stop.png" };
	private final String[] entered = { "playEntered.png", "pauseEntered.png",
			"stopEntered.png" };
	private final String[] pushed = { "playPushed.png", "pausePushed.png",
			"stopPushed.png" };

	private ImageIcon playImage, pauseImage, stopImage, playPushed,
			pausePushed, stopPushed, playEntered, pauseEntered, stopEntered;

	private TrackerInterface tracker;

	private JButton play, pause, stop;

	private InfoWO info;

	private PoseWO pose;

	private boolean paused = false;
	private Thread t;
	private Classifier classifier;
	private Distribution_Gauge gauge;

//	private MenuBar mb;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ControlsWO(int width, int height) {
		setLayout(new FlowLayout());
		configurePanel(this, width, height);

		initControlsWO();
	}
	
	public void configurePanel(JPanel p, int w, int h){
		Dimension d = new Dimension(w, h);
		p.setPreferredSize(d);
		p.setMinimumSize(d);
		p.setMaximumSize(d);
		p.setOpaque(false);
//		setTransparency(p);
	}

	public void initControlsWO() {
		// fill up second row
		playPushed = new ImageIcon(getClass().getResource(pushed[0]).getFile());
		playEntered = new ImageIcon(getClass().getResource(entered[0])
				.getFile());
		playImage = new ImageIcon(getClass().getResource(buttons[0]).getFile());
		play = new JButton(playImage);
		configureButton(play);

		pausePushed = new ImageIcon(getClass().getResource(pushed[1]).getFile());
		pauseEntered = new ImageIcon(getClass().getResource(entered[1])
				.getFile());
		pauseImage = new ImageIcon(getClass().getResource(buttons[1]).getFile());
		pause = new JButton(pauseImage);
		configureButton(pause);

		stopPushed = new ImageIcon(getClass().getResource(pushed[2]).getFile());
		stopEntered = new ImageIcon(getClass().getResource(entered[2])
				.getFile());
		stopImage = new ImageIcon(getClass().getResource(buttons[2]).getFile());
		stop = new JButton(stopImage);
		configureButton(stop);

		add(play);
		add(pause);
		add(stop);

	}

	private void configureButton(JButton b) {
		b.setPreferredSize(new Dimension(100, 100));
		b.setBorder(null);
		b.setOpaque(false);
		b.setContentAreaFilled(false);
		b.setBorderPainted(false);
		b.addActionListener(this);
		b.addMouseListener(this);
		b.setEnabled(false);
	}

	public void setDependencies(TrackerInterface viewer, PoseWO pose, InfoWO info, Classifier classifier){
		this.tracker = viewer;
		this.pose = pose;
		this.info = info;
		this.classifier = classifier;
	}
	
	public void setGauge(Distribution_Gauge gauge) {
		this.gauge = gauge;
	}

//	public void setMenuBar(MenuBar mb) {
//		this.mb = mb;
//	}

	public void setEnableAllButtons(boolean play, boolean pause, boolean stop) {
		this.play.setEnabled(play);
		this.pause.setEnabled(pause);
		this.stop.setEnabled(stop);
	}
	
	public boolean checkT(){
		return t.isAlive();
	}
	
	@SuppressWarnings("deprecation")
	public void stopT(){
		t.stop();
	}
	
	public void removeAllComponentsOfPosePanel(){
		pose.removeComponents();
	}

	public void pushedPlay() {
		play.setEnabled(false);
		// pause.setEnabled(true);
		stop.setEnabled(true);

		if (!paused) {
			ImagesToStart its = new ImagesToStart(pose, tracker, pause,
//					mb.getPauseItem());
					new JMenuItem());
			its.addObserver(pose);
			t = new Thread(its);
			t.start();
		} else {
			pause.setEnabled(true);
//			mb.setEnabledPause(true);
			tracker.setStartedTest(true);
		}

//		mb.pushedPlay();
	}

	public void pushedPause() {
		paused = true;

		tracker.setStartedTest(false);

		pause.setEnabled(false);
		stop.setEnabled(true);
		play.setEnabled(true);

//		mb.pushedPause();
	}

	@SuppressWarnings("deprecation")
	public void pushedStop() {
		paused = false;
		t.stop();

		tracker.setStartedTest(false);
		info.removeComponents();
		info.initInfoComp();

		removeAllComponentsOfPosePanel();
		pose.initPoseComp();
//		pose.showNextPose();
		
		play.setEnabled(true);
		stop.setEnabled(false);
		pause.setEnabled(false);
		gauge.initCurrentStep();
		classifier.setBooleanFirst(true);
//		mb.pushedStop();
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == play) {
			pushedPlay();
		}
		if (arg0.getSource() == pause) {
			pushedPause();
		}
		if (arg0.getSource() == stop) {
			pushedStop();
		}
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == play && play.isEnabled()) {
			play.setIcon(playEntered);
		}
		if (arg0.getSource() == pause && pause.isEnabled()) {
			pause.setIcon(pauseEntered);
		}
		if (arg0.getSource() == stop && stop.isEnabled()) {
			stop.setIcon(stopEntered);
		}
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == play && play.isEnabled()) {
			play.setIcon(playImage);
		}
		if (arg0.getSource() == pause && pause.isEnabled()) {
			pause.setIcon(pauseImage);
		}
		if (arg0.getSource() == stop && stop.isEnabled()) {
			stop.setIcon(stopImage);
		}
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == play && play.isEnabled()) {
			play.setIcon(playPushed);
		}
		if (arg0.getSource() == pause && pause.isEnabled()) {
			pause.setIcon(pausePushed);
		}
		if (arg0.getSource() == stop && stop.isEnabled()) {
			stop.setIcon(stopPushed);
		}
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == play) {
			play.setIcon(playImage);
		}
		if (arg0.getSource() == pause) {
			pause.setIcon(pauseImage);
		}
		if (arg0.getSource() == stop) {
			stop.setIcon(stopImage);
		}
	}
}
