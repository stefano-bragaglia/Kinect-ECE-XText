package gui.views;

import gauge.Distribution_Gauge;
import gauge.Distribution_GaugeBAK;
import gui.make.take.LimbSquare;
import gui.menubar.FrameMenuBar;
import gui.views.posture_pose.PoseWO;
import human_model.HumanModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.NumberFormat;
import java.util.StringTokenizer;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import static constants.HumanBodyValues.*;

public class Silhouette extends JPanel implements MouseListener, ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private FrameMenuBar mb;

	private String[] images = { "back.png", "ahead.png", "go.png" };

	private int slWidth, slHeight, width, height;

	// silhouette = sil + bottom
	// sil = up + center + down
	// bottom = button + goon
	private JPanel[] up, down, center;
	private JPanel sil, button, goon, bottom;

	private JPanel[] head, left_arm, body, right_arm, left_leg, right_leg;
	private JButton back, ahead, go;
	private ImageIcon image;

	private NumberFormat idFormat;
	private JFormattedTextField count;

	private String[][] limbsImage;
	private String[] poses;
	private HumanModel[] human = new HumanModel[MAX_STEP];
	private JPanel[] model = new JPanel[MAX_STEP];
	private int[][] limbsSelected = new int[MAX_STEP][TOTAL_LIMB];
	private int number_of_steps = 2;
	private int current_step;

	DataFlavor dataFlavor = new DataFlavor(LimbSquare.class,
			LimbSquare.class.getSimpleName());

	private Distribution_Gauge gauge;

	private PoseWO poseWO;

	private Image sfondo;

	public Silhouette(int maxWidth, int maxHeight, Image sfondo) {
		this.slWidth = ((maxWidth / 2) - MARGIN * 2);
		this.slHeight = maxHeight - GAP;
		this.sfondo = sfondo;

		// System.out.println(slWidth + " " + slHeight);

		width = LEG_WIDTH * 2 + GAP;
		height = ARM_HEIGHT + LEG_HEIGHT;

		setPreferredSize(new Dimension(slWidth, slHeight));
		// System.out.println(slWidth + "x" + slHeight);
		setBackground(Color.WHITE);

		configureSilhouettePanel();
		initModels();

		new MyDropTargetListImp(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (sfondo != null)
			g.drawImage(sfondo, (this.getWidth() / 2)
					- (sfondo.getWidth(this) / 2), (this.getHeight() / 2)
					- (sfondo.getHeight(this) / 2), sfondo.getWidth(this),
					sfondo.getHeight(this), this); // (image,location x,
													// location
													// y, size x, size y)
	}

	public void initModels() {
		limbsImage = new String[MAX_STEP][TOTAL_LIMB];

		head = new JPanel[MAX_STEP];
		body = new JPanel[MAX_STEP];
		left_arm = new JPanel[MAX_STEP];
		right_arm = new JPanel[MAX_STEP];
		left_leg = new JPanel[MAX_STEP];
		right_leg = new JPanel[MAX_STEP];
		up = new JPanel[MAX_STEP];
		center = new JPanel[MAX_STEP];
		down = new JPanel[MAX_STEP];

		for (int i = 0; i < MAX_STEP; i++) {

			model[i] = new JPanel();
			setTransparency(model[i]);
			model[i].setPreferredSize(new Dimension(width, height));
			configureModelPanel(model[i], i);

			human[i] = new HumanModel(i);

			for (int j = 0; j < TOTAL_LIMB; j++) {
				limbsSelected[i][j] = 0;
				limbsImage[i][j] = "";
			}
		}
	}

	public void setNumberOfSteps(int i) {
		number_of_steps = i;

		// enable-disable back-ahead buttons
		if (current_step < number_of_steps)
			ahead.setEnabled(true);
		else if (current_step >= number_of_steps) {
			cleanPanel(sil);
			sil.add(model[number_of_steps - 1]);
			count.setValue(new Integer(number_of_steps));
			current_step = number_of_steps;
			ahead.setEnabled(false);
		}

		// enable-disable go button in Silhouette and saveEX menuItem in MenuBar
		boolean b = checkForGoAheadAndSaveEX();
		go.setEnabled(b);
		mb.setEnableSaveExMenuItem(b);
	}

	public void setMenuBar(FrameMenuBar mb) {
		this.mb = mb;
	}

	public void setGauge(Distribution_Gauge gauge2) {
		this.gauge = gauge2;
	}

	public void setPoseWO(PoseWO poseWO) {
		this.poseWO = poseWO;
	}

	public void update() {
		revalidate();
		repaint();
	}

	public void configureSilhouettePanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		sil = new JPanel();
		setTransparency(sil);
		sil.setPreferredSize(new Dimension(width, height));

		setBottomPanel();

		add(sil);
		add(bottom);

		Border blackline = BorderFactory.createLineBorder(Color.black);
		sil.setBorder(blackline);
		bottom.setBorder(blackline);
	}

	public void configureModelPanel(JPanel panel, int i) {

		// silhouette = up + down --> y_axis
		// up = left_Arm + center + right_Arm ---> x_axis
		// center = head + body --> y_axis
		// down = left_leg + right_leg --> x_axis

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		// panel limb
		head[i] = new JPanel();
		head[i].addMouseListener(this);
		configureLimbPanel(head[i], HEAD_WIDTH, HEAD_HEIGHT);

		body[i] = new JPanel();
		body[i].addMouseListener(this);
		configureLimbPanel(body[i], BODY_WIDTH, BODY_HEIGHT);

		left_arm[i] = new JPanel();
		left_arm[i].addMouseListener(this);
		configureLimbPanel(left_arm[i], ARM_WIDTH, ARM_HEIGHT);

		right_arm[i] = new JPanel();
		right_arm[i].addMouseListener(this);
		configureLimbPanel(right_arm[i], ARM_WIDTH, ARM_HEIGHT);

		left_leg[i] = new JPanel();
		left_leg[i].addMouseListener(this);
		configureLimbPanel(left_leg[i], LEG_WIDTH, LEG_HEIGHT);

		right_leg[i] = new JPanel();
		right_leg[i].addMouseListener(this);
		configureLimbPanel(right_leg[i], LEG_WIDTH, LEG_HEIGHT);

		// other panel
		up[i] = new JPanel();
		up[i].setLayout(new FlowLayout(FlowLayout.LEFT));
		configureLimbPanel(up[i], width, ARM_HEIGHT);

		center[i] = new JPanel();
		configureLimbPanel(center[i], BODY_WIDTH, ARM_HEIGHT);
		center[i].setLayout(new BoxLayout(center[i], BoxLayout.Y_AXIS));

		down[i] = new JPanel();
		down[i].setLayout(new FlowLayout(FlowLayout.LEFT));
		configureLimbPanel(down[i], width, LEG_HEIGHT);

		// add
		center[i].add(head[i]);
		center[i].add(body[i]);

		up[i].add(left_arm[i]);
		up[i].add(center[i]);
		up[i].add(right_arm[i]);

		down[i].add(left_leg[i]);
		down[i].add(right_leg[i]);

		panel.add(up[i]);
		panel.add(down[i]);

		sil.add(panel);
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

		back = new JButton();
		back.setPreferredSize(new Dimension(COUNT_DIM, COUNT_DIM));
		image = new ImageIcon(getClass().getResource(images[0]).getFile());
		back.setIcon(image);
		back.setEnabled(false);
		configureButton(back);
		ahead = new JButton();
		ahead.setPreferredSize(new Dimension(COUNT_DIM, COUNT_DIM));
		image = new ImageIcon(getClass().getResource(images[1]).getFile());
		ahead.setIcon(image);
		configureButton(ahead);

		button.add(back);
		button.add(count);
		button.add(ahead);

		goon = new JPanel();
		goon.setLayout(new FlowLayout(FlowLayout.LEADING));
		// goon.setPreferredSize(new Dimension((width/3), GODIM));

		go = new JButton();
		go.setPreferredSize(new Dimension(GO_DIM, GO_DIM));
		image = new ImageIcon(getClass().getResource(images[2]).getFile());
		go.setIcon(image);
		go.setEnabled(false);
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

	public void configureLimbPanel(JPanel p, int w, int h) {
		Dimension d = new Dimension(w, h);
		p.setPreferredSize(d);
		p.setMinimumSize(d);
		p.setMaximumSize(d);
		setTransparency(p);
	}

	public void setTransparency(JPanel panel) {
		panel.setOpaque(false);
		// panel.setBackground(new Color(0,0,0));
	}

	public void setTransparency(JPanel[] panel) {
		for (JPanel p : panel) {
			p.setOpaque(true);
			p.setBackground(new Color(0, 0, 0));
		}
	}

	public void cleanPanel(JPanel panel) {
		panel.removeAll();
		panel.revalidate();
		panel.repaint();
	}

	private void addLimb(JPanel limbPanel, String image, int limb) {
		ImageIcon imgicon = new ImageIcon(getClass().getResource(image)
				.getFile());
		JLabel labelImage = new JLabel(imgicon);
		update();

		cleanPanel(limbPanel);
		limbPanel.add(labelImage);
		limbsSelected[current_step - 1][limb] = 1;

		boolean b = checkForGoAheadAndSaveEX();
		go.setEnabled(b);
		mb.setEnableSaveExMenuItem(b);

		limbsImage[current_step - 1][limb] = image;

	}

	private void removeLimb(JPanel limbPanel, int limb) {
		cleanPanel(limbPanel);
		limbsSelected[current_step - 1][limb] = 0;

		boolean b = checkForGoAheadAndSaveEX();
		go.setEnabled(b);
		mb.setEnableSaveExMenuItem(b);

		limbsImage[current_step - 1][limb] = "";
	}

	private boolean checkForGoAheadAndSaveEX() {
		boolean enable = false;
		int res = 0;

		for (int i = 0; i < number_of_steps; i++) {
			for (int j = 0; j < TOTAL_LIMB; j++)
				res += limbsSelected[i][j];

			if (res == 0) {
				enable = false;
				break;
			} else
				enable = true;

			res = 0;
		}

		return enable;
	}

	public void addBodyParts(String image, int humanBodyParts, int[] posture)
			throws ArrayIndexOutOfBoundsException {
		// Only for the BODY
		addLimb(body[current_step - 1], image, BODY_LIMB);
		human[current_step - 1].setBody(posture);
	}

	public void addBodyParts(String image, int humanBodyParts, int posture)
			throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

		switch (humanBodyParts) {
		case HEAD_LIMB: {
			addLimb(head[current_step - 1], image, HEAD_LIMB);
			human[current_step - 1].setHead(posture);
			break;
		}
		// case BODY_LIMB: {
		// addLimb(body, image, BODY_LIMB);
		// human[current_step - 1].setBody(posture);
		// break;
		// }
		case LEFT_ARM_LIMB: {
			addLimb(left_arm[current_step - 1], image, LEFT_ARM_LIMB);
			human[current_step - 1].setLeftArm(posture);
			break;
		}
		case RIGHT_ARM_LIMB: {
			addLimb(right_arm[current_step - 1], image, RIGHT_ARM_LIMB);
			human[current_step - 1].setRightArm(posture);
			break;
		}
		case LEFT_LEG_LIMB: {
			addLimb(left_leg[current_step - 1], image, LEFT_LEG_LIMB);
			human[current_step - 1].setLeftLeg(posture);
			break;
		}
		case RIGHT_LEG_LIMB: {
			addLimb(right_leg[current_step - 1], image, RIGHT_LEG_LIMB);
			human[current_step - 1].setRightLeg(posture);
			break;
		}

		}
	}

	public void sendImagesToPoseWO() {

		setImagesOfPose();

		poseWO.setImagesOfPose(poses);
	}

	public void setImagesOfPose() {
		poses = new String[number_of_steps];
		String temp = "";

		for (int i = 0; i < number_of_steps; i++) {
			for (int j = 0; j < TOTAL_LIMB; j++) {
				if (limbsImage[i][j] != "") {
					if (temp == "")
						temp += getOnlyName(limbsImage[i][j]);
					else
						temp = temp + "_" + getOnlyName(limbsImage[i][j]);
				}
			}

			poses[i] = temp + "." + PNG_EXT;
			// System.out.println(poses[i]);
			temp = "";
		}
	}

	public String getOnlyName(String name) {
		// remove extension png
		StringTokenizer stk = new StringTokenizer(name, ".");
		String ris = "", temp;
		// ris = stk.nextToken();

		while (stk.hasMoreTokens()) {
			temp = stk.nextToken();

			if (!(temp.equalsIgnoreCase(PNG_EXT)))
				ris = ris + temp;

		}
		return ris;
	}

	public void mouseClicked(MouseEvent arg0)
			throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		for (int i = 0; i < MAX_STEP; i++) {
			if (arg0.getSource() == head[i]) {
				removeLimb(head[current_step - 1], HEAD_LIMB);
				human[current_step - 1].setHead(NULL);
			}
			if (arg0.getSource() == body[i]) {
				removeLimb(body[current_step - 1], BODY_LIMB);
				human[current_step - 1].setBody(null);
			}
			if (arg0.getSource() == left_arm[i]) {
				removeLimb(left_arm[current_step - 1], LEFT_ARM_LIMB);
				human[current_step - 1].setLeftArm(NULL);
			}
			if (arg0.getSource() == right_arm[i]) {
				removeLimb(right_arm[current_step - 1], RIGHT_ARM_LIMB);
				human[current_step - 1].setRightArm(NULL);
			}
			if (arg0.getSource() == left_leg[i]) {
				removeLimb(left_leg[current_step - 1], LEFT_LEG_LIMB);
				human[current_step - 1].setLeftLeg(NULL);
			}
			if (arg0.getSource() == right_leg[i]) {
				removeLimb(right_leg[current_step - 1], RIGHT_LEG_LIMB);
				human[current_step - 1].setRightLeg(NULL);
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

				cleanPanel(sil);
				sil.add(model[next_step - 1]);
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

				cleanPanel(sil);
				sil.add(model[prev_step - 1]);
			}
		}

		if (arg0.getSource() == go) {

			mb.showWO();
			gauge.setHumanModels(human, number_of_steps);

			sendImagesToPoseWO();

			for (int i = 0; i < number_of_steps; i++) {
				System.out.println("Human Model n° " + (i + 1) + ":\n");
				System.out.println(human[i].toString()
						+ "\n*****************************");
				System.out.println();
			}
		}
	}

	public Object[] getCurrentExercise() {
		Object[] obj = new Object[3];
		obj[0] = number_of_steps;
		setImagesOfPose();
		obj[1] = poses;
		obj[2] = human;

		return obj;
	}

	class MyDropTargetListImp extends DropTargetAdapter implements
			DropTargetListener {

		private Silhouette panel;

		public MyDropTargetListImp(Silhouette panel) {
			this.panel = panel;

			new DropTarget(panel, DnDConstants.ACTION_COPY, this, true, null);
			// The DropTarget is associated with a
			// Component when that Component wishes
			// to accept drops during Drag and Drop
			// operations.
		}

		public void drop(DropTargetDropEvent event) {
			try {
				Transferable tr = event.getTransferable();
				LimbSquare square = (LimbSquare) tr.getTransferData(dataFlavor);

				if (event.isDataFlavorSupported(dataFlavor)) {
					event.acceptDrop(DnDConstants.ACTION_COPY);

					String image = square.getSILimage();

					int hbp = square.getHumanBodyPart();

					if (hbp != BODY_LIMB)
						this.panel.addBodyParts(image,
								square.getHumanBodyPart(), square.getPosture());
					else
						this.panel.addBodyParts(image,
								square.getHumanBodyPart(),
								square.getBodyPosture());

					event.dropComplete(true);
					this.panel.validate();
					return;
				}
				event.rejectDrop();
			} catch (Exception e) {
				e.printStackTrace();
				event.rejectDrop();
			}
		}
	}
}
