package gui.choose.select;

import gui.choose.select.balance.Balance;
import gui.choose.select.flexibility.Flexibility;
import gui.choose.select.mine.Mine;
import gui.choose.select.sitting.Sitting;
import gui.choose.select.strength.Strength;
import gui.views.posture_pose.PosturesView;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import static constants.HumanBodyValues.*;

public class SelectExercise extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int tcWidth, tcHeight;

	private JTabbedPane tabbedPane;
	public Balance balance;
	

	public Flexibility flexibility;
	public Sitting sitting;
	public Strength strength;
	public Mine mine;

	private PosturesView pview;

	private Image img;

	public SelectExercise(int maxWidth, int maxHeight, Image img) {
		super(new GridLayout(1, 1));
		
		this.img = img;
		tcWidth = (maxWidth / 2) + MARGIN;
		tcHeight = maxHeight - GAP;

		setPreferredSize(new Dimension(tcWidth, tcHeight));
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

	public void setPostureView(PosturesView pos) {
		pview = pos;
		setTakeComponentsPanel();
	}

	public void setTakeComponentsPanel() {
		tabbedPane = new JTabbedPane();

		balance = new Balance(pview, img);
		tabbedPane.addTab("Balance    ", balance);

		flexibility = new Flexibility(pview, img);
		tabbedPane.addTab("Flexibility    ", flexibility);

		sitting = new Sitting(pview, img);
		tabbedPane.addTab("Sitting    ", sitting);

		strength = new Strength(pview, img);
		tabbedPane.addTab("Strength    ", strength);
		
		mine = new Mine(pview, img);
		tabbedPane.addTab("My Exercises    ", mine);

		// Add the tabbed pane to this panel.
		add(tabbedPane);

		// The following line enables to use scrolling tabs.
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	}

	
	public Balance getBalance() {
		return balance;
	}
}
