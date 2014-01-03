package gui.choose.select.flexibility;

import java.awt.Graphics;
import java.awt.Image;

import gui.views.posture_pose.PosturesView;

import javax.swing.JPanel;


public class Flexibility extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image img;

	public Flexibility(PosturesView dgl, Image img) {
		// TODO Auto-generated constructor stub
		this.img = img;
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
