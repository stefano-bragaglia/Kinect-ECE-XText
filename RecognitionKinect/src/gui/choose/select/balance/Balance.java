package gui.choose.select.balance;

import static constants.HumanBodyValues.*;
import static constants.PreimpostedExercise.*;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JPanel;

import gui.choose.select.PreimpostedEX;
import gui.views.posture_pose.PosturesView;
import human_model.HumanModel;

public class Balance extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PosturesView pview;
	private PreimpostedEX pex;
	private ArrayList<PreimpostedEX> pexes;

	private Image img;

	public Balance(PosturesView pview, Image img) {
		// TODO Auto-generated constructor stub
		this.pview = pview;
		this.img = img;
		
		pexes = new ArrayList<PreimpostedEX>();

		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBodyComponents();

	}

	public void setBodyComponents() {

		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(getClass().getResource(
					BALANCE).getFile()));

			while ((sCurrentLine = br.readLine()) != null) {
				StringTokenizer str = new StringTokenizer(sCurrentLine, ",");
				String image = str.nextToken();
				int step = new Integer(str.nextToken()).intValue();

				String[] SILimage = new String[step];
				for (int i = 0; i < step; i++)
					SILimage[i] = str.nextToken();

				HumanModel[] hm = new HumanModel[step];
				String[] limbs = new String[TOTAL_LIMB];

				for (int i = 0; i < step; i++) {
					// recupero le pose dei limbs caratterizzanti la posa allo
					// step n°i
					for (int j = 0; j < TOTAL_LIMB && str.hasMoreTokens(); j++) {
						limbs[j] = str.nextToken();
					}
					// creo il corrispondente human model
					hm[i] = new HumanModel(i, limbs);
				}

				// creo e aggiungo al panel il Preimposted Exercise settando
				// anche il DnD
				pex = new PreimpostedEX(this, BAL, image, SILimage, step, hm);
				pex.addActionListener(this);
				add(pex);

				pexes.add(pex);

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	//setta un esercizio di default (serve per lanciare direttamente la schermata kinect)
	public void setDefaultExercise() {
		// TODO Auto-generated method stub
		for (PreimpostedEX pex : pexes) {
				pview.setPreimpostedExercise(pex);
				break;
		}
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		for (PreimpostedEX pex : pexes) {
			if (arg0.getSource() == pex) {
				pview.setPreimpostedExercise(pex);
			}
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (img != null)
			g.drawImage(img, (this.getWidth() / 2)
					- (img.getWidth(this) / 2), (this.getHeight() / 2)
					- (img.getHeight(this) / 2), img.getWidth(this),
					img.getHeight(this), this); // (image,location x, location
													// y, size x, size y)
	}
}
