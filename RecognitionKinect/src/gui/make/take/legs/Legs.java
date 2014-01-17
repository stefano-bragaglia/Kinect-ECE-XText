package gui.make.take.legs;

import static constants.HumanBodyValues.*;
import gui.listener.DragGestureListImp;
import gui.make.take.LimbSquare;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragSource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Legs extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static int LEFT = 0, RIGHT = 1;

	private final String[] leftimages = { "left_leg_BENDED.png", "left_leg_INLINE.png", "left_leg_WIDED.png" };
	private final String[] rightimages = { "right_leg_BENDED.png", "right_leg_INLINE.png", "right_leg_WIDED.png" };

	private final String[] SIL_leftimages = { "SIL_left_leg_BENDED.png", "SIL_left_leg_INLINE.png", "SIL_left_leg_WIDED.png" };
	private final String[] SIL_rightimages = { "SIL_right_leg_BENDED.png", "SIL_right_leg_INLINE.png", "SIL_right_leg_WIDED.png"  };

	private LimbSquare left_sit, right_sit, left_inline, right_inline, left_wided, right_wided;

	private JPanel combo, leftcomp, rightcomp;
	private String[] whatside = { "left", "right" };
	private JComboBox sides;

	private DragGestureListImp dgl;

	private Image img;

	public Legs(DragGestureListImp dgl, Image img) {
		// TODO Auto-generated constructor stub
		this.dgl = dgl;
		this.img = img;
		
		setLayout(new BorderLayout());

		setLegsComponent();

		setDnD();
	}

	public void setLegsComponent() {
		combo = new JPanel();
		combo.setSize(new Dimension(100, 25));
		sides = new JComboBox(whatside);
		combo.add(sides);
		sides.addActionListener(this);
		add(combo, BorderLayout.NORTH);

		rightcomp = new JPanel();
		rightcomp.setLayout(new FlowLayout(FlowLayout.LEFT));
		setRightLegsComponents();

		leftcomp = new JPanel();
		leftcomp.setLayout(new FlowLayout(FlowLayout.LEFT));
		setLeftLegsComponents();
		add(leftcomp, BorderLayout.CENTER);

		configureLimbPanel(combo, 100, 25);
		setTransparency(rightcomp);
		setTransparency(leftcomp);
	}
	
	public void configureLimbPanel(JPanel p, int w, int h){
		Dimension d = new Dimension(w, h);
		p.setPreferredSize(d);
		p.setMinimumSize(d);
		p.setMaximumSize(d);
		setTransparency(p);
	}
	
	public void setTransparency(JPanel panel){
		panel.setOpaque(false);
//		panel.setBackground(new Color(0,0,0));
	}

	public void setLeftLegsComponents() {
		left_sit = new LimbSquare(leftimages[0], SIL_leftimages[0], LEFT_LEG_LIMB,
				LEFT_LEG_BENDED);
		
		left_inline = new LimbSquare(leftimages[1], SIL_leftimages[1], LEFT_LEG_LIMB,
				LEFT_LEG_INLINE);
		
		left_wided = new LimbSquare(leftimages[2], SIL_leftimages[2], LEFT_LEG_LIMB,
				LEFT_LEG_WIDED);

		leftcomp.add(left_sit);
		leftcomp.add(left_inline);
		leftcomp.add(left_wided);

	}

	public void setRightLegsComponents() {

		right_sit = new LimbSquare(rightimages[0], SIL_rightimages[0],
				RIGHT_LEG_LIMB, RIGHT_LEG_BENDED);
		
		right_inline = new LimbSquare(rightimages[1], SIL_rightimages[1],
				RIGHT_LEG_LIMB, RIGHT_LEG_INLINE);
		
		right_wided = new LimbSquare(rightimages[2], SIL_rightimages[2],
				RIGHT_LEG_LIMB, RIGHT_LEG_WIDED);

		rightcomp.add(right_sit);
		rightcomp.add(right_inline);
		rightcomp.add(right_wided);

	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == sides) {
			if (sides.getSelectedIndex() == LEFT) {
				remove(rightcomp);
				add(leftcomp);
				revalidate();
				repaint();
			}
			if (sides.getSelectedIndex() == RIGHT) {
				remove(leftcomp);
				add(rightcomp);
				revalidate();
				repaint();
			}
		}
	}

	private void setDnD() {
		DragSource ds = new DragSource();
		ds.createDefaultDragGestureRecognizer(left_sit,
				DnDConstants.ACTION_COPY, dgl);

		ds.createDefaultDragGestureRecognizer(right_sit,
				DnDConstants.ACTION_COPY, dgl);
		
		ds.createDefaultDragGestureRecognizer(left_inline,
				DnDConstants.ACTION_COPY, dgl);

		ds.createDefaultDragGestureRecognizer(right_inline,
				DnDConstants.ACTION_COPY, dgl);
		
		ds.createDefaultDragGestureRecognizer(left_wided,
				DnDConstants.ACTION_COPY, dgl);

		ds.createDefaultDragGestureRecognizer(right_wided,
				DnDConstants.ACTION_COPY, dgl);

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
