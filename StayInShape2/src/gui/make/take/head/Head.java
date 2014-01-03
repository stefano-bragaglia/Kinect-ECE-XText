package gui.make.take.head;

import static constants.HumanBodyValues.*;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragSource;

import gui.listener.DragGestureListImp;
import gui.make.take.LimbSquare;

import javax.swing.JPanel;

public class Head extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final String[] images = { "head_inline.png", "head_slantingSX.png",
			"head_slantingDX.png" };
	private final String[] SILimages = { "SIL_head_inline.png",
			"SIL_head_slantingSX.png", "SIL_head_slantingDX.png" };

	private LimbSquare head_inline, head_slantingSX, head_slantingDX;

	private DragGestureListImp dgl;

	private Image img;

	public Head(DragGestureListImp dgl, Image img) {
		// TODO Auto-generated constructor stub
		this.dgl = dgl;
		this.img = img;

		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBodyComponents();

		setDnD();
	}

	public void setBodyComponents() {

		head_inline = new LimbSquare(images[0], SILimages[0], HEAD_LIMB,
				HEAD_INLINE);
		add(head_inline);
		head_slantingSX = new LimbSquare(images[1], SILimages[1], HEAD_LIMB,
				HEAD_SLANTING_LEFT);
		add(head_slantingSX);
		head_slantingDX = new LimbSquare(images[2], SILimages[2], HEAD_LIMB,
				HEAD_SLANTING_RIGHT);
		add(head_slantingDX);

	}

	private void setDnD() {
		DragSource ds = new DragSource();
		ds.createDefaultDragGestureRecognizer(head_inline,
				DnDConstants.ACTION_COPY, dgl);

		ds.createDefaultDragGestureRecognizer(head_slantingSX,
				DnDConstants.ACTION_COPY, dgl);

		ds.createDefaultDragGestureRecognizer(head_slantingDX,
				DnDConstants.ACTION_COPY, dgl);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (img != null)
			g.drawImage(img, (this.getWidth() / 2) - (img.getWidth(this) / 2),
					(this.getHeight() / 2) - (img.getHeight(this) / 2),
					img.getWidth(this), img.getHeight(this), this); // (image,location
																	// x,
																	// location
																	// y, size
																	// x, size
																	// y)
	}
}
