package gui.workout;

import static constants.HumanBodyValues.*;
import static constants.TrackerHumanValues.*;
import gui.views.posture_pose.PoseWO;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class WorkOutPanel{


	private int maxWidth, maxHeight;
	private int firstROWwidth, firstROWheight;
	private int secondROWwidth, secondROWheight;
	private int kinectWidth, kinectHeight;
	private int poseWidth, poseHeight;
	private int infoWidth, infoHeight;

	private JPanel firstRow;
	public ControlsWO controls;
	private KinectFOV kinect;
	private PoseWO pose;
	private InfoWO info;

	public WorkOutPanel() {

		maxWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		maxHeight = (int) Toolkit.getDefaultToolkit().getScreenSize()
				.getHeight()
				- GAP;

		firstROWwidth = maxWidth;
		firstROWheight = KINECTFOV_HEIGHT + WO_MARGIN;

		secondROWwidth = maxWidth;
		secondROWheight = maxHeight - (KINECTFOV_HEIGHT + WO_MARGIN);

		kinectWidth = KINECTFOV_WIDTH;
		kinectHeight = maxHeight - secondROWheight;

		poseWidth = KINECTFOV_WIDTH / 2;
		poseHeight = maxHeight - secondROWheight;

		infoWidth = KINECTFOV_WIDTH / 2;
		infoHeight = maxHeight - secondROWheight;

		initWOpanel();
	}

	public void keyPressed(KeyEvent arg0) {
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	public KinectFOV getKinectFOV(){
		return kinect;
	}
	
	public InfoWO getInfoWO() {
		return info;
	}

	public PoseWO getPoseWO() {
		return pose;
	}
	
	public ControlsWO getControlsWO(){
		return controls;
	}

	public void initWOpanel() {
		// create first row of main
		firstRow = new JPanel(new FlowLayout());
		configurePanel(firstRow, firstROWwidth, firstROWheight);
//		// create second row of main
		controls = new ControlsWO(secondROWwidth, secondROWheight);
//		secondRow.setDTA(dta);
//
//		// component of first row
		kinect = new KinectFOV(kinectWidth, kinectHeight);
//		kinect.setDTA(dta);
//		kinect.setTest(test);
//		kinect.setSecondRowPanel(secondRow);
		pose = new PoseWO(poseWidth, poseHeight);
		info = new InfoWO(infoWidth, infoHeight);
//		info.setDTA(dta);
//		pose.setInfoPanel(info);
//		secondRow.setInfoPanel(info);
//		secondRow.setPosePanel(pose);
//
		firstRow.add(kinect);
		firstRow.add(pose);
		firstRow.add(info);

		Border border = BorderFactory.createLineBorder(Color.MAGENTA);
		firstRow.setBorder(border);
		controls.setBorder(border);
		kinect.setBorder(border);
		// pose.setBorder(blackline);
		// info.setBorder(blackline);
	}
	
	public void configurePanel(JPanel p, int w, int h){
		Dimension d = new Dimension(w, h);
		p.setPreferredSize(d);
		p.setMinimumSize(d);
		p.setMaximumSize(d);
		p.setOpaque(false);
//		setTransparency(p);
	}
	
	public void setWO(JPanel main) {

		main.setLayout(new BorderLayout());

		main.add(firstRow, BorderLayout.CENTER);
		main.add(controls, BorderLayout.PAGE_END);
	}
}
