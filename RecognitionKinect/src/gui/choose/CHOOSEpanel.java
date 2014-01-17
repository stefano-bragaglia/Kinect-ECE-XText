package gui.choose;

import gui.choose.select.SelectExercise;
import gui.views.posture_pose.PosturesView;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.Border;

import static constants.HumanBodyValues.*;
import static constants.MBConstants.*;
public class CHOOSEpanel {

	
	private int maxWidth, maxHeight;
	private JPanel main;
	public PosturesView pview; // public cause use it by MenuBar into other package
	public SelectExercise select; // JPanel of SILhouette (SX of main) and of
									// SelectExercise (DX of main)

	public CHOOSEpanel() {
		maxWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		maxHeight = (int) Toolkit.getDefaultToolkit().getScreenSize()
				.getHeight()
				- GAP;
		
		//a sx, figura esercizio scelto
		pview = new PosturesView(maxWidth, maxHeight, new ImageIcon(getClass().getResource(VIEW).getFile()).getImage()); 
		//a dx, scelta esercizio
		select = new SelectExercise(maxWidth, maxHeight, new ImageIcon(getClass().getResource(SELECT).getFile()).getImage());
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		pview.setBorder(blackline);
		select.setBorder(blackline);
		
		setDependencies();
	
		
	}
	
	public void setDependencies(){
		select.setPostureView(pview);
	}

	public void setChoose(JPanel main) {
		this.main = main;
		main.setLayout(new FlowLayout());

		setBackGround();
	}

	public void setBackGround() {
		main.add(pview);
		main.add(select);
	}

	public PosturesView getPview() {
		return pview;
	}

	public SelectExercise getSelect() {
		return select;
	}
	
	
	
	

}
