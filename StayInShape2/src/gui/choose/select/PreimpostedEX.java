package gui.choose.select;

import human_model.HumanModel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import gui.choose.select.mine.*;

import static constants.HumanBodyValues.*;
import static constants.PreimpostedExercise.*;

public class PreimpostedEX extends JButton implements MouseListener,
		ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel tabbed;
	private int whatabbed;
	private String image;
	private String[] SILimage;
	private ImageIcon squareImage;
	private int number_of_step;
	private HumanModel[] hm;

	private JPopupMenu pmenu;
	private JMenuItem delete;

	public PreimpostedEX(JPanel tabbed, int whatabbed, String image,
			String[] SILimage, int number_of_step, HumanModel[] hm) {
		this.tabbed = tabbed;
		this.whatabbed = whatabbed;
		this.image = image;
		this.SILimage = SILimage;
		this.number_of_step = number_of_step;
		this.hm = hm;

		configure();
	}

	private void configure() {

		pmenu = new JPopupMenu();
		delete = new JMenuItem("delete");
		delete.addActionListener(this);
		pmenu.add(delete);
		this.addMouseListener(this);

		try {
			setPreferredSize(new Dimension(SQUARE_DIM, SQUARE_DIM));
			squareImage = new ImageIcon(getClass().getResource(image).getFile());
			setIcon(squareImage);
		} catch (NullPointerException np) {
			String newFormat = checkForNewLine(image);
			setText(newFormat);
			setFont(new Font("Arialnarrow", Font.BOLD, 18));
		}
	}

	public String checkForNewLine(String s) {
		String init = "<html>", nl = "<br>", close = "</html>";
		String ris = init, temp = "";

		StringTokenizer str1 = new StringTokenizer(s, "_");
		temp = str1.nextToken();
		while (str1.hasMoreTokens())
			temp = temp + " " + str1.nextToken();

		StringTokenizer str2 = new StringTokenizer(temp, " ");
		ris = ris + str2.nextToken();
		while (str2.hasMoreTokens())
			ris = ris + nl + str2.nextToken();
		ris = ris + close;

		return ris;
	}

	public void setSILimage(String i, int n) {
		SILimage[n] = i;
	}

	public String getSILimage(int n) {
		return SILimage[n];
	}

	public String[] getSILimages() {
		return SILimage;
	}

	public int getNumberOfStep() {
		return number_of_step;
	}

	public void setNumberOfStep(int n) {
		number_of_step = n;
	}

	public HumanModel[] getHumanModels() {
		return hm;
	}

	public void setHumanModels(HumanModel[] hm) {
		this.hm = hm;
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.isPopupTrigger()) {
			pmenu.show(arg0.getComponent(), arg0.getX(), arg0.getY());
		}
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == delete) {
			if (whatabbed == MY)
				((Mine) tabbed).deletePreimpostedExercise(image);
		}
	}
}
