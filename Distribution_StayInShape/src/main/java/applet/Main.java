package applet;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JPanel;

public class Main extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int width, height;
	private Image image = null;

	public Main(int width, int height, Image i) {

		this.width = width;
		this.height = height;
		image = i;

		setMainPanel();
	}

	public void setMainPanel() {
		setLayout(new BorderLayout());
		setSize(width, height);
		setLayout(new GridBagLayout());
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null)
			g.drawImage(image, (this.getWidth() / 2)
					- (image.getWidth(this) / 2), (this.getHeight() / 2)
					- (image.getHeight(this) / 2), image.getWidth(this),
					image.getHeight(this), this); // (image,location x, location
													// y, size x, size y)
	}
}
