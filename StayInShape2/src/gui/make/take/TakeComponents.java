package gui.make.take;

import gui.listener.DragGestureListImp;
import gui.make.take.arms.Arms;
import gui.make.take.body.Body;
import gui.make.take.head.Head;
import gui.make.take.legs.Legs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import static constants.HumanBodyValues.*;

public class TakeComponents extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int tcWidth, tcHeight;
	private Image image;
	
	private JTabbedPane tabbedPane;
	private Head head;
	private Arms arms;
	private Legs legs;
	private Body body;
	
	private Image img;
	
	private DragGestureListImp dgl;

	public TakeComponents(int maxWidth, int maxHeight, Image img) {
		super(new GridLayout(1, 1));
		
		this.img = img;

		
		dgl = new DragGestureListImp();
		
		tcWidth = (maxWidth / 2) + MARGIN;
		tcHeight = maxHeight - GAP;
		
		setPreferredSize(new Dimension(tcWidth, tcHeight));
		
		setTakeComponentsPanel();
	}

	public void setTakeComponentsPanel() {
		tabbedPane = new JTabbedPane();

		head = new Head(dgl, img);
		tabbedPane.addTab("Head    ", head);

		body = new Body(dgl, img);
		tabbedPane.addTab("Body    ", body);

		arms = new Arms(dgl, img);
		tabbedPane.addTab("Arms    ", arms);

		legs = new Legs(dgl, img);
		tabbedPane.addTab("Legs    ", legs);

		// Add the tabbed pane to this panel.
		tabbedPane.setBackground(new Color(245, 245, 220));
		add(tabbedPane);

		// The following line enables to use scrolling tabs.
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	}
	
//	public void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		if (img != null)
//			g.drawImage(img, (this.getWidth() / 2)
//					- (img.getWidth(this) / 2), (this.getHeight() / 2)
//					- (img.getHeight(this) / 2), img.getWidth(this),
//					img.getHeight(this), this); // (image,location x, location
//													// y, size x, size y)
//	}
}
