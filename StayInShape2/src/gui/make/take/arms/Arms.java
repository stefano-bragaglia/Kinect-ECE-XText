package gui.make.take.arms;

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

public class Arms extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static int LEFT = 0, RIGHT = 1;

	private final String[] leftimages = { "left_arm_T.png", "left_arm_LOWERED.png", "left_arm_RAISED.png" };
	private final String[] rightimages = { "right_arm_T.png", "right_arm_LOWERED.png", "right_arm_RAISED.png" };

	private final String[] SIL_leftimages = { "SIL_left_arm_T.png", "SIL_left_arm_LOWERED.png", "SIL_left_arm_RAISED.png" };
	private final String[] SIL_rightimages = { "SIL_right_arm_T.png", "SIL_right_arm_LOWERED.png", "SIL_right_arm_RAISED.png" };

	private LimbSquare left_T, left_LOWERED, left_arm_RAISED, right_T, right_LOWERED, right_arm_RAISED;

	private JPanel combo, leftcomp, rightcomp;
	private String[] whatside = { "left", "right" };
	private JComboBox sides;

	private DragGestureListImp dgl;

	private Image img;

	public Arms(DragGestureListImp dgl, Image img) {
		// TODO Auto-generated constructor stub
		this.dgl = dgl;
		this.img = img;
		
		setLayout(new BorderLayout());

		setLegsComponent();

		setDnD();
	}

	public void setLegsComponent() {
		combo = new JPanel();
//		combo.setSize(new Dimension(100, 25));
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

		left_T = new LimbSquare(leftimages[0], SIL_leftimages[0], LEFT_ARM_LIMB,
				LEFT_ARM_T);
		
		left_LOWERED = new LimbSquare(leftimages[1], SIL_leftimages[1], LEFT_ARM_LIMB,
				LEFT_ARM_LOWERED);
		
		left_arm_RAISED = new LimbSquare(leftimages[2], SIL_leftimages[2], LEFT_ARM_LIMB,
				LEFT_ARM_RAISED);

		leftcomp.add(left_T);
		leftcomp.add(left_LOWERED);
		leftcomp.add(left_arm_RAISED);

	}

	public void setRightLegsComponents() {

		right_T = new LimbSquare(rightimages[0], SIL_rightimages[0],
				RIGHT_ARM_LIMB, RIGHT_ARM_T);
		
		right_LOWERED = new LimbSquare(rightimages[1], SIL_rightimages[1], RIGHT_ARM_LIMB,
				RIGHT_ARM_LOWERED);
		
		right_arm_RAISED = new LimbSquare(rightimages[2], SIL_rightimages[2], RIGHT_ARM_LIMB,
				RIGHT_ARM_RAISED);

		rightcomp.add(right_T);
		rightcomp.add(right_LOWERED);
		rightcomp.add(right_arm_RAISED);

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
		ds.createDefaultDragGestureRecognizer(left_T,
				DnDConstants.ACTION_COPY, dgl);

		ds.createDefaultDragGestureRecognizer(right_T,
				DnDConstants.ACTION_COPY, dgl);
		
		ds.createDefaultDragGestureRecognizer(left_LOWERED,
				DnDConstants.ACTION_COPY, dgl);

		ds.createDefaultDragGestureRecognizer(right_LOWERED,
				DnDConstants.ACTION_COPY, dgl);
		
		ds.createDefaultDragGestureRecognizer(left_arm_RAISED,
				DnDConstants.ACTION_COPY, dgl);

		ds.createDefaultDragGestureRecognizer(right_arm_RAISED,
				DnDConstants.ACTION_COPY, dgl);

	}
	
	public void paintComponent(Graphics g) {
//		System.out.println("img=" + img);
		super.paintComponent(g);
		if (img != null)
			g.drawImage(img, (this.getWidth() / 2)
					- (img.getWidth(this) / 2), (this.getHeight() / 2)
					- (img.getHeight(this) / 2), img.getWidth(this),
					img.getHeight(this), this); // (image,location x, location
													// y, size x, size y)
	}

}
