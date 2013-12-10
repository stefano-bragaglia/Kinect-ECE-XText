package gui.make;

import gui.make.take.TakeComponents;
import gui.views.Silhouette;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.Border;

import static constants.HumanBodyValues.*;
import static constants.MBConstants.*;
public class MAKEpanel {

	
	private int maxWidth, maxHeight;
	private JPanel main;
	public Silhouette sil; // public cause use it by MenuBar into other package
	private TakeComponents take; // JPanel of SILhouette (SX of main) and of
									// TAKEcomponents (DX of main)

	String take_img = TAKE;
	String sil_img = SIL;
	
	public MAKEpanel() {
		maxWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		maxHeight = (int) Toolkit.getDefaultToolkit().getScreenSize()
				.getHeight()
				- GAP;
		
		sil = new Silhouette(maxWidth, maxHeight, new ImageIcon(getClass().getResource(sil_img).getFile()).getImage());
		take = new TakeComponents(maxWidth, maxHeight, new ImageIcon(getClass().getResource(take_img).getFile()).getImage());
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		sil.setBorder(blackline);
		take.setBorder(blackline);
	}

	public void setMYE(JPanel main) {
		this.main = main;
		main.setLayout(new FlowLayout());

		setBackGround();
	}

	public void setBackGround() {

		main.add(sil);
		main.add(take);
	}

}
