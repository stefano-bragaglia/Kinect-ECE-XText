package gui.make.take.body;
import java.awt.Image;

import gui.listener.DragGestureListImp;
import gui.make.take.LimbSquare;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragSource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import static constants.HumanBodyValues.*;

public class Body extends JPanel implements ActionListener  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final String[] uprightimages = { "body_upright_STAN.png", "body_upright_SIT.png" };
	private final String[] slantingSTANimages = { "body_stan_slantingSX.png", "body_stan_slantingDX.png", "body_stan_forward.png" };
	private final String[] slantingSITtimages = {  };

	private final String[] SIL_uprightimages = { "SIL_body_upright_STAN.png", "SIL_body_upright_SIT.png" };
	private final String[] SIL_slantingSTANimages = { "SIL_body_stan_slantingSX.png", "SIL_body_stan_slantingDX.png", "SIL_body_stan_forward.png" };
	private final String[] SIL_slantingSITimages = {  };
	

	private LimbSquare sit_front, stan_front, slan_stanSX, slan_stanDX, slan_stanFORWARD;
	
	private JPanel combo, uprightcomp, slanSTANcomp, slanSITcomp;
	private String[] whatside = { "UP RIGHT", "slanting STAND UP", "slanting SIT DOWN" };
	private JComboBox sides;

	private DragGestureListImp dgl;

	private Image img;
	
	public Body(DragGestureListImp dgl, Image img) {
		// TODO Auto-generated constructor stub
		this.dgl = dgl;
		this.img = img;
		
		setLayout(new BorderLayout());
		setBodyComponents();

		setDnD();
	}

	public void setBodyComponents() {
		combo = new JPanel();
//		combo.setSize(new Dimension(100, 25));
		sides = new JComboBox(whatside);
		combo.add(sides);
		sides.addActionListener(this);
		add(combo, BorderLayout.NORTH);

		uprightcomp = new JPanel();
		uprightcomp.setLayout(new FlowLayout(FlowLayout.LEFT));
		setUpRightComponents();
		add(uprightcomp, BorderLayout.CENTER);

		slanSTANcomp = new JPanel();
		slanSTANcomp.setLayout(new FlowLayout(FlowLayout.LEFT));
		setSlantingStandingComponents();
		
		slanSITcomp = new JPanel();
		slanSITcomp.setLayout(new FlowLayout(FlowLayout.LEFT));
		setSlantingSittingComponents();
		
		configureLimbPanel(combo, 100, 25);
		setTransparency(uprightcomp);
		setTransparency(slanSTANcomp);
		setTransparency(slanSITcomp);
	}
	
	public void setUpRightComponents(){
		int[] pos = new int[2];
		pos[0] = B_UPRIGHT;
		
		pos[1] = B_UPRIGHT_STAN;
		stan_front = new LimbSquare(uprightimages[0], SIL_uprightimages[0], BODY_LIMB, pos);
		uprightcomp.add(stan_front);
		pos[1] = B_UPRIGHT_SIT;
		sit_front = new LimbSquare(uprightimages[1], SIL_uprightimages[1], BODY_LIMB, pos);
		uprightcomp.add(sit_front);
	}
	
	public void setSlantingStandingComponents(){
		int[] pos = new int[2];
		pos[0] = B_STAN_SLANTING;
		
		pos[1] = B_STANDING_SLANTING_LEFT;
		slan_stanSX = new LimbSquare(slantingSTANimages[0], SIL_slantingSTANimages[0], BODY_LIMB, pos);
		slanSTANcomp.add(slan_stanSX);
		pos[1] = B_STANDING_SLANTING_RIGHT;
		slan_stanDX = new LimbSquare(slantingSTANimages[1], SIL_slantingSTANimages[1], BODY_LIMB, pos);
		slanSTANcomp.add(slan_stanDX);
		pos[1] = B_STANDING_SLANTING_FORWARD;
		slan_stanFORWARD = new LimbSquare(slantingSTANimages[2], SIL_slantingSTANimages[2], BODY_LIMB, pos);
		slanSTANcomp.add(slan_stanFORWARD);
	}
	
	public void setSlantingSittingComponents(){
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
	
	private void setDnD() {
		DragSource ds = new DragSource();
		ds.createDefaultDragGestureRecognizer(sit_front,
				DnDConstants.ACTION_COPY, dgl);

		ds.createDefaultDragGestureRecognizer(stan_front,
				DnDConstants.ACTION_COPY, dgl);
		
		ds.createDefaultDragGestureRecognizer(slan_stanSX,
				DnDConstants.ACTION_COPY, dgl);
		
		ds.createDefaultDragGestureRecognizer(slan_stanDX,
				DnDConstants.ACTION_COPY, dgl);
		
		ds.createDefaultDragGestureRecognizer(slan_stanFORWARD,
				DnDConstants.ACTION_COPY, dgl);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == sides) {
			if (sides.getSelectedIndex() == B_UPRIGHT) {
				remove(slanSTANcomp);
				remove(slanSITcomp);
				add(uprightcomp);
				revalidate();
				repaint();
			}
			if (sides.getSelectedIndex() == B_STAN_SLANTING) {
				remove(uprightcomp);
				remove(slanSITcomp);
				add(slanSTANcomp);
				revalidate();
				repaint();
			}
			if (sides.getSelectedIndex() == B_SIT_SLANTING) {
				remove(uprightcomp);
				remove(slanSTANcomp);
				add(slanSITcomp);
				revalidate();
				repaint();
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
