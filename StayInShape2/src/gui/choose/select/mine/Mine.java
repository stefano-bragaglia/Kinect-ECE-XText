package gui.choose.select.mine;

import static constants.HumanBodyValues.*;
import static constants.PreimpostedExercise.*;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import gui.choose.select.PreimpostedEX;
import gui.views.posture_pose.PosturesView;
import human_model.HumanModel;

import javax.swing.JPanel;

public class Mine extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PosturesView pview;
	private ArrayList<PreimpostedEX> pexes;
	private PreimpostedEX pex;
	private Image img;

	public Mine(PosturesView pview, Image img) {
		this.pview = pview;
		this.img = img;
		
		pexes = new ArrayList<PreimpostedEX>();

		setLayout(new FlowLayout(FlowLayout.LEFT));
		setMineComponents();
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

	public void update(){
		revalidate();
		repaint();
	}

	public void setMineComponents() {

		removeAll();
		update();

		BufferedReader br = null;

		try {

			String sCurrentLine;

			// String path =
			// "/home/stee/workspace/StayInShape/src/main/resources/gui/choose/select/mine";
			// br = new BufferedReader(new FileReader(path + "/" + MINE));

			br = new BufferedReader(new FileReader(getClass().getResource(MINE)
					.getFile()));

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
				pex = new PreimpostedEX(this, MY, image, SILimage, step, hm);
				pex.addActionListener(this);
				add(pex);

				pexes.add(pex);
				
				update();

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

	public void insertMyExercise(String name, int number_of_steps,
			String[] SILimages, HumanModel[] hm) {
		try {

			// File file = new File(getClass().getResource(MINE)
			// .getFile());

			// if file doesnt exists, then create it
			// if (!file.exists()) {
			// file.createNewFile();
			// }

			// String path =
			// "/home/stee/workspace/StayInShape/src/main/resources/gui/choose/select/mine";
			// BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(
			// path + "/" + MINE, true));

			// true = append file
			FileWriter fileWriter = new FileWriter(getClass().getResource(MINE)
					.getFile(), true);
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

			// bufferWriter.write("\n");
			bufferWriter.write(name);
			bufferWriter.write(",");
			bufferWriter.write("" + number_of_steps);
			bufferWriter.write(",");
			for (String s : SILimages) {
				bufferWriter.write(s);
				bufferWriter.write(",");
			}
			for (int i = 0; i < number_of_steps; i++) {
				if (i == number_of_steps - 1) {
					// se è l'ultimo non si deve
					// inserire la virgola in coda ma br
					bufferWriter.write(hm[i].getCSVDescription());
					bufferWriter.write("\n");
				} else {
					bufferWriter.write(hm[i].getCSVDescription());
					bufferWriter.write(",");
				}
			}

			bufferWriter.close();

			System.out.println("Appending new exercise to file " + MINE
					+ ", Done!");

			setMineComponents();

		} catch (FileNotFoundException fnfe) {
			System.out.println("FILE NOT FOUND!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deletePreimpostedExercise(String name) {

		BufferedReader br = null;
		BufferedWriter bufferWriter = null;

		String temp = getClass().getResource(MINE).getPath() + "TEMP.csv";
		File tempFile = new File(temp);
		String original = getClass().getResource(MINE).getFile();
		File originalFile = new File(original);
		
		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(originalFile));
			bufferWriter = new BufferedWriter(new FileWriter(tempFile, true));

			while ((sCurrentLine = br.readLine()) != null) {
				StringTokenizer str = new StringTokenizer(sCurrentLine, ",");
				String image = str.nextToken();

				if (!(image.equals(name))) {
					bufferWriter.write(sCurrentLine);
					bufferWriter.write("\n");
				}
			}

			// Delete the original file
			if (!originalFile.delete()) {
				System.out.println("Could not delete file");
				return;
			}

			// Rename the new file to the filename the original file had.
			if (!tempFile.renameTo(originalFile))
				System.out.println("Could not rename file");

			System.out.println("Deleting exercise " + name + " from file " + MINE
					+ ", Done!");
			
			setMineComponents();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (bufferWriter != null)
					bufferWriter.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
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

}
