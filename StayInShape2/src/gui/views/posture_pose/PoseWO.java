package gui.views.posture_pose;

import gauge.Distribution_GaugeBAK;
import gui.workout.countdown.ImagesToStart;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import rec.reasoner.Reasoner;
import static constants.HumanBodyValues.*;
import static gui.workout.pose.Pose.*;

public class PoseWO extends JPanel implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String current_pose;
	private int current_step = DEFAULT, number_of_step;

	private ImageIcon image;

	private JLabel labelImage;
	private JLabel[] init;

	private final int prequel = 2;
	private int wait = 2;

	private String[] poses;

	public PoseWO(int width, int height) {

		configurePanel(this, width, height);
//		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		initPoseComp();
	}
	
	public void configurePanel(JPanel p, int w, int h){
		Dimension d = new Dimension(w, h);
		p.setPreferredSize(d);
		p.setMinimumSize(d);
		p.setMaximumSize(d);
		p.setOpaque(false);
//		setTransparency(p);
	}

	public void setInitialPose(){
		current_step = DEFAULT;
	}

	public void initPoseComp() {
		
		removeAll();
		revalidate();
		repaint();
		
		setInitialPose();
		setPose(SEQUENCE_POSES[current_step - 1]);

		image = new ImageIcon();
		labelImage = new JLabel(image, SwingConstants.CENTER);

		setinitLabel();

		// add(labelImage);

	}

	public void setinitLabel() { //disegna la posa pezzo per pezzo
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		init = new JLabel[4];
		
		for (int i = 0; i < 4; i++) {
			init[i] = new JLabel(INIT[i], JLabel.CENTER);
			init[i].setFont(new Font("Serif", Font.BOLD, 48));
			init[i].setForeground(Color.RED);
		}
	}

	public void setImagesOfPose(String[] poses) { 	// from silhouette and postureView
		this.poses = poses;
		number_of_step = poses.length;
		
//		System.out.println(poses[0]);
	}

	public String getPose() {
		return current_pose;
	}

	public void setPose(String pose) {
		current_pose = pose;
	}

	public void removeComponents() {
		labelImage.removeAll();
		// removeAll();
		revalidate();
		repaint();
	}

	public void selectImageOfPose(int number_of_pose) {
		
		System.out.println("PoseWO: select file image of pose = " + poses[number_of_pose]);
		
		try{
		image = new ImageIcon(getClass().getResource(poses[number_of_pose])
				.getFile());
		}catch(NullPointerException np){
			labelImage.setText("<html>IMAGE" + "<br>" + "NOT" + "<br>" + "FOUND");
			labelImage.setFont(new Font("Serif", Font.PLAIN, 20));
		}
	}

	public int getSecondsOfPrequel() {
		return prequel;
	}

	public int getSecondsOfWait() {
		return wait;
	}

	public void setSecondsOfWait(int n) {
		wait = n;
	}

	public void setPrequelImage(int n) {

		switch (n) {
		case 0:
			removeComponents();
			removeAll();
			// labelImage.setIcon(null);
			// labelImage.setFont(new Font("Serif", Font.BOLD, 48));
			// labelImage.setForeground(Color.RED);
			// labelImage.setText(REPRODUCE);
			for (int i = 0; i < init.length; i++)
				add(init[i]);
			break;
		case 1:
			for (int i = 0; i < init.length; i++)
				init[i].removeAll();
			removeComponents();
			removeAll();
			setLayout(new GridBagLayout());
			labelImage.setBackground(this.getBackground());
			add(labelImage);
			break;
		}

		revalidate();
		repaint();
	}

	public void setImageToWait(int n) {
		removeComponents();
		labelImage.setIcon(null);
		labelImage.setFont(new Font("Serif", Font.PLAIN, 200));
		labelImage.setForeground(Color.RED);

		if (n != 0)
			labelImage.setText(n + "");
		else
			labelImage.setText("");

		revalidate();
		repaint();
	}

	public void showNextPose() {
		System.out.println("current_step - 1 = " + (current_step - 1));
		selectImageOfPose(current_step - 1);

		if (current_step == number_of_step)
			current_step = DEFAULT;
		else
			current_step += 1;

		removeComponents();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		labelImage.setIcon(image);
		revalidate();
		repaint();
	}

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		if (arg0 instanceof Reasoner) {
			if (arg1 instanceof Object[]) {
				Object[] obj = (Object[]) arg1;
				String fluent = (String) obj[0];
				Double value = (Double) obj[1];
				

				// ATTENZIONE: potrebbe servire nell'if
				// "&& info.getCountAmount() > 0"??????
				if (isPose(fluent) && value > 0)
					showNextPose();
			}
		}
		
		if (arg0 instanceof Distribution_GaugeBAK) {
			if (arg1 instanceof Object[]) {
				Object[] obj = (Object[]) arg1;
				String s = (String) obj[0];
				
				if(s.equals(RESET)){
					setInitialPose();
					showNextPose();
				}
			}
		}

		if (arg0 instanceof ImagesToStart) {
			if (arg1 instanceof Object[]) {
				Object[] obj = (Object[]) arg1;
				String s = (String) obj[1];

				if (s.equalsIgnoreCase(PREQUEL)) {
					Integer count = (Integer) obj[0];
					setPrequelImage(count.intValue());
				}

				if (s.equalsIgnoreCase(WAIT)) {
					Integer count = (Integer) obj[0];
					setImageToWait(count);
				}
			}
		}
	}
}
