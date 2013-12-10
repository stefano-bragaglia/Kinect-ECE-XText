package gui.views.posture_pose;

import gauge.Distribution_Gauge;
import gui.choose.select.PreimpostedEX;
import gui.menubar.FrameMenuBar;
import human_model.HumanModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import static constants.HumanBodyValues.*;

public class PosturesView extends JPanel implements MouseListener,
		ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private FrameMenuBar mb;

	private String[] images = { "back.png", "ahead.png", "go.png" };

	private int slWidth, slHeight, width, height;

	// postureView = pos + bottom
	// sil = up + center + down
	// bottom = button + goon
	private JPanel pos, button, goon, bottom;

	private JButton back, ahead, go;
	private ImageIcon image;

	private NumberFormat idFormat;
	private JFormattedTextField count;

	private String[] SILimages;
	private HumanModel[] hm;
	private int number_of_steps;
	private JPanel[] model;

	private int current_step;

	DataFlavor dataFlavor = new DataFlavor(PreimpostedEX.class,
			PreimpostedEX.class.getSimpleName());

	private Distribution_Gauge gauge;

	private PoseWO poseWO;
	private Image img;

	public PosturesView(int maxWidth, int maxHeight, Image img) {
		this.slWidth = ((maxWidth / 2) - MARGIN * 2);
		this.slHeight = maxHeight - GAP;
		this.img = img;
		
		width = LEG_WIDTH * 2 + GAP;
		height = ARM_HEIGHT + LEG_HEIGHT;

		setPreferredSize(new Dimension(slWidth, slHeight));
		// System.out.println(slWidth + "x" + slHeight);
		setBackground(Color.WHITE);

		configureSilhouettePanel();
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

	public void configureSilhouettePanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		pos = new JPanel();
		setTransparency(pos);
		pos.setPreferredSize(new Dimension(width, height));

		setBottomPanel();

		add(pos);
		add(bottom);

		Border blackline = BorderFactory.createLineBorder(Color.black);
		pos.setBorder(blackline);
		bottom.setBorder(blackline);
	}

	public void setBottomPanel() {
		bottom = new JPanel();
		bottom.setLayout(new BorderLayout());

		button = new JPanel();
		// button.setLayout(new FlowLayout(FlowLayout.TRAILING));
		// button.setPreferredSize(new Dimension(width - (width/3), GODIM));

		count = new JFormattedTextField(idFormat);
		count.setHorizontalAlignment(JFormattedTextField.CENTER);
		count.setValue(new Integer(DEFAULT));
		current_step = DEFAULT;
		count.setPreferredSize(new Dimension(COUNT_DIM, COUNT_DIM));
		count.setFont(new Font("Arial", Font.CENTER_BASELINE, COUNT_DIM));
		count.setEditable(false);
		count.setEnabled(false);

		back = new JButton();
		back.setPreferredSize(new Dimension(COUNT_DIM, COUNT_DIM));
		image = new ImageIcon(getClass().getResource(images[0]).getFile());
		back.setIcon(image);
		setEnableBackbutton(false);
		configureButton(back);
		ahead = new JButton();
		ahead.setPreferredSize(new Dimension(COUNT_DIM, COUNT_DIM));
		setEnableAheadbutton(false);
		image = new ImageIcon(getClass().getResource(images[1]).getFile());
		ahead.setIcon(image);
		configureButton(ahead);

		button.add(back);
		button.add(count);
		button.add(ahead);

		goon = new JPanel();
		goon.setLayout(new FlowLayout(FlowLayout.TRAILING));
		// goon.setPreferredSize(new Dimension((width/3), GODIM));

		go = new JButton();
		go.setPreferredSize(new Dimension(GO_DIM, GO_DIM));
		image = new ImageIcon(getClass().getResource(images[2]).getFile());
		go.setIcon(image);
		setEnableGObutton(false);
		configureButton(go);

		goon.add(go);

		bottom.add(button, BorderLayout.CENTER);
		bottom.add(goon, BorderLayout.LINE_END);
	}

	private void configureButton(JButton b) {
		b.setBorder(null);
		b.setOpaque(false);
		b.addActionListener(this);
		b.setBackground(this.getBackground());
		// b.setContentAreaFilled(false);
		// b.setBorderPainted(false);
		// b.addMouseListener(this);
	}

	public void initModels() {

		cleanPanel(pos);

		model = new JPanel[number_of_steps];

		for (int i = 0; i < number_of_steps; i++) {

			model[i] = new JPanel();
			setTransparency(model[i]);
			model[i].setPreferredSize(new Dimension(width, height));

			ImageIcon imgicon = new ImageIcon(getClass().getResource(
					SILimages[i]).getFile());
			JLabel labelImage = new JLabel(imgicon);

			// cleanPanel(model[i]);
			model[i].add(labelImage);

			model[i].addMouseListener(this);
		}

		// facciamo vedere la posa del primo step
		addModelToMainPanel(0);
		count.setEnabled(true);
		setEnableGObutton(true);
		setEnableBackbutton(false);
		if (number_of_steps > 1)
			setEnableAheadbutton(true);
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

	public void addModelToMainPanel(int m) {
		cleanPanel(pos);
		pos.add(model[m]);
		count.setValue(new Integer(m + 1));
		current_step = m + 1;
	}

	public void setEnableGObutton(boolean b) {
		go.setEnabled(b);
	}

	public void setEnableBackbutton(boolean b) {
		back.setEnabled(b);
	}

	public void setEnableAheadbutton(boolean b) {
		ahead.setEnabled(b);
	}

	public void setMenuBar(FrameMenuBar mb) {
		this.mb = mb;
	}

	public void setGauge(Distribution_Gauge gauge) {
		this.gauge = gauge;
	}

	public void setPoseWO(PoseWO poseWO) {
		this.poseWO = poseWO;
	}

	public void update() {
		revalidate();
		repaint();
	}

	public void cleanPanels(JPanel[] panels) {
		for (JPanel jp : panels)
			cleanPanel(jp);

		cleanPanel(pos);

		model = null;
		
		current_step = DEFAULT;
		count.setValue(new Integer(DEFAULT));
		count.setEnabled(false);
		SetEnableAllButton(false);
	}

	public void cleanPanel(JPanel panel) {
		panel.removeAll();
		panel.revalidate();
		panel.repaint();
	}

	public void SetEnableAllButton(boolean b) {
		ahead.setEnabled(b);
		back.setEnabled(b);
		go.setEnabled(b);
	}

	public void sendImagesToPoseWO() {
		poseWO.setImagesOfPose(SILimages);
	}

	public void mouseClicked(MouseEvent arg0)
			throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if (model != null) {
			for (int i = 0; i < model.length; i++) {
				if (arg0.getSource() == model[i]){
					cleanPanels(model);
					break;
				}
			}
		}

	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == ahead) {
			int next_step = current_step + 1;
			if (next_step <= number_of_steps) {
				current_step = next_step;
				count.setValue(new Integer(next_step));
				back.setEnabled(true);
				if (next_step == number_of_steps)
					ahead.setEnabled(false);

				cleanPanel(pos);
				pos.add(model[next_step - 1]);
			}
		}
		if (arg0.getSource() == back) {
			int prev_step = current_step - 1;
			if (prev_step >= MIN_STEP) {
				current_step = prev_step;
				count.setValue(new Integer(prev_step));
				if (prev_step == MIN_STEP)
					back.setEnabled(false);
				ahead.setEnabled(true);

				cleanPanel(pos);
				pos.add(model[prev_step - 1]);
			}
		}

		if (arg0.getSource() == go) {

			mb.showWO();
			gauge.setHumanModels(hm, number_of_steps);

			sendImagesToPoseWO();

			for (int i = 0; i < number_of_steps; i++) {
				System.out.println("Human Model n° " + (i + 1) + ":\n");
				System.out.println(hm[i].toString()
						+ "\n*****************************");
				System.out.println();
			}
		}
	}

	public void setPreimpostedExercise(PreimpostedEX pex) {
		SILimages = pex.getSILimages();
		hm = pex.getHumanModels();
		number_of_steps = pex.getNumberOfStep();

		initModels();
	}
}
