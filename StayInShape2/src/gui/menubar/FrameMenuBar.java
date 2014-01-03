package gui.menubar;

import gauge.Distribution_Gauge;
import gui.choose.CHOOSEpanel;
import gui.make.MAKEpanel;
import human_model.HumanModel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import workout.WorkOut;
import applet.Background;
import static constants.MBConstants.*;
import static constants.PreimpostedExercise.*;

public class FrameMenuBar extends JMenuBar implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Object[] obj;

	private String check = "check.png";

	private Background bg;

	private JMenu fileMenu, helpMenu, editMenu, stepSubMenu, modeMenu,
			saveEXinto, execMenu;
	private JMenuItem exit, tutorial, retTOmye, retTOchoose, two, three, four,
			preferences, play, pause, stop, better, normal, mainmenu, forced,
			haphazard, bal, flex, sit, str, mine;

	private MAKEpanel mye;

	private Distribution_Gauge gauge;
	private WorkOut wo;

	private CHOOSEpanel choose;

	public FrameMenuBar() {
		fileMenu = new JMenu("File");
		helpMenu = new JMenu("Help");
		editMenu = new JMenu("Edit");

		exit = new JMenuItem("Exit");
		exit.addActionListener(this);
		tutorial = new JMenuItem("Tutorial");
		tutorial.addActionListener(this);
		retTOmye = new JMenuItem("Go to Make");
		retTOmye.addActionListener(this);
		retTOchoose = new JMenuItem("Go to Choose");
		retTOchoose.addActionListener(this);
		mainmenu = new JMenuItem("Go to main menu");
		mainmenu.addActionListener(this);

		play = new JMenuItem("Play");
		play.addActionListener(this);
		play.setEnabled(false);
		pause = new JMenuItem("Pause");
		pause.addActionListener(this);
		pause.setEnabled(false);
		stop = new JMenuItem("Stop");
		stop.addActionListener(this);
		stop.setEnabled(false);

		// submenus
		stepSubMenu = new JMenu("Numebr of step");
		two = new JMenuItem("2", new ImageIcon(getClass().getResource(check)
				.getFile()));
		two.addActionListener(this);
		three = new JMenuItem("3");
		three.addActionListener(this);
		four = new JMenuItem("4");
		four.addActionListener(this);
		stepSubMenu.add(two);
		stepSubMenu.add(three);
		stepSubMenu.add(four);

		execMenu = new JMenu("Execution");
		modeMenu = new JMenu("Mode");
		preferences = new JMenuItem("Preferences");
		preferences.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,
				ActionEvent.CTRL_MASK));
		preferences.addActionListener(this);
		better = new JMenuItem("Better your self");
		better.addActionListener(this);
		better.setEnabled(false);
		normal = new JMenuItem("Single Exercise", new ImageIcon(getClass()
				.getResource(check).getFile()));
		normal.addActionListener(this);
		normal.setEnabled(false);
		forced = new JMenuItem("Input order");
		forced.addActionListener(this);
		haphazard = new JMenuItem("Haphazard", new ImageIcon(getClass()
				.getResource(check).getFile()));
		haphazard.addActionListener(this);
		modeMenu.add(better);
		modeMenu.add(normal);
		execMenu.add(forced);
		execMenu.add(haphazard);

		saveEXinto = new JMenu("Save exercise");
		saveEXinto.setEnabled(false);
		saveEXinto.addActionListener(this);
		mine = new JMenuItem("My Exercise");
		mine.addActionListener(this);
		bal = new JMenuItem("Balance");
		bal.addActionListener(this);
		bal.setEnabled(false);
		flex = new JMenuItem("Flexibility");
		flex.addActionListener(this);
		flex.setEnabled(false);
		sit = new JMenuItem("Sitting");
		sit.addActionListener(this);
		sit.setEnabled(false);
		str = new JMenuItem("Strength");
		str.addActionListener(this);
		str.setEnabled(false);
		saveEXinto.add(bal);
		saveEXinto.add(flex);
		saveEXinto.add(sit);
		saveEXinto.add(str);
		saveEXinto.add(mine);
	}

	public void setBackgroundConfigurations() {

		removeALL();

		fileMenu.add(exit);
		helpMenu.add(tutorial);

		add(fileMenu);
		add(helpMenu);
	}

	public void setMYEConfigurations() {

		removeALL();

		fileMenu.add(mainmenu);
		fileMenu.add(exit);
		helpMenu.add(tutorial);
		editMenu.add(stepSubMenu);
		editMenu.addSeparator();
		editMenu.add(saveEXinto);

		add(fileMenu);
		add(editMenu);
		add(helpMenu);
	}

	public void setWorkOutConfigurations() {
		removeALL();

		fileMenu.add(play);
		fileMenu.add(pause);
		fileMenu.add(stop);
		fileMenu.add(retTOmye);
		fileMenu.add(retTOchoose);
		fileMenu.add(mainmenu);
		fileMenu.add(exit);

		helpMenu.add(tutorial);

		editMenu.add(preferences);
		editMenu.addSeparator();
		editMenu.add(modeMenu);
		editMenu.add(execMenu);

		add(fileMenu);
		add(editMenu);
		add(helpMenu);
	}

	public void setChooseConfigurations() {
		removeALL();

		fileMenu.add(mainmenu);
		fileMenu.add(exit);
		helpMenu.add(tutorial);

		add(fileMenu);
		add(editMenu);
		add(helpMenu);
	}

	public void removeALL() {
		removeAll();
		fileMenu.removeAll();
		editMenu.removeAll();
		helpMenu.removeAll();
	}

	public void setGauge(Distribution_Gauge gauge) {
		this.gauge = gauge;
	}

	public void setWO(WorkOut wo) {
		this.wo = wo;
	}

	public void setMYE(MAKEpanel mye) {
		this.mye = mye;
	}

	public void setChoose(CHOOSEpanel choose) {
		this.choose = choose;
	}

	public void setBG(Background bg) {
		this.bg = bg;
	}

	public void showBG() {
		setBackgroundConfigurations();
		bg.setBackGroundPanel();
	}

	public void showMYE() {
		setMYEConfigurations();
		bg.setMYEpanel();
	}

	public void showWO() {
		setWorkOutConfigurations();
		bg.setWorkOutPanel();
	}

	public void showChoose() {
		setChooseConfigurations();
		bg.setChoosePanel();
	}

	public void setEnableSaveExMenuItem(boolean b) {
		saveEXinto.setEnabled(b);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		// Make Your Exercise
		if (arg0.getSource() == two) {
			two.setIcon(new ImageIcon(getClass().getResource(check).getFile()));
			three.setIcon(null);
			four.setIcon(null);

			mye.sil.setNumberOfSteps(2);
		}
		if (arg0.getSource() == three) {
			three.setIcon(new ImageIcon(getClass().getResource(check).getFile()));
			two.setIcon(null);
			four.setIcon(null);

			mye.sil.setNumberOfSteps(3);
		}
		if (arg0.getSource() == four) {
			four.setIcon(new ImageIcon(getClass().getResource(check).getFile()));
			three.setIcon(null);
			two.setIcon(null);

			mye.sil.setNumberOfSteps(4);
		}
		if (arg0.getSource() == bal) {

		}
		if (arg0.getSource() == flex) {

		}
		if (arg0.getSource() == sit) {

		}
		if (arg0.getSource() == str) {

		}
		if (arg0.getSource() == mine) {
			obj = mye.sil.getCurrentExercise();
			new NameFrame(MY);

		}

		// Work Out
		if (arg0.getSource() == preferences) {
			new PreferencesFrame();
		}
		if (arg0.getSource() == modeMenu) {

		}
		if (arg0.getSource() == forced) {
			gauge.setExecutionMode(INPUT_ORDER);
			forced.setIcon(new ImageIcon(getClass().getResource(check)
					.getFile()));
			haphazard.setIcon(null);
		}
		if (arg0.getSource() == haphazard) {
			gauge.setExecutionMode(HAPHAZARD);
			haphazard.setIcon(new ImageIcon(getClass().getResource(check)
					.getFile()));
			forced.setIcon(null);
		}

		// return
		if (arg0.getSource() == retTOmye) {
			showMYE();
		}
		if (arg0.getSource() == retTOchoose) {
			showChoose();
		}
		if (arg0.getSource() == mainmenu) {
			showBG();
		}
	}

	// Preferences Frame
	class PreferencesFrame implements PropertyChangeListener, ActionListener {
		private JFrame frame;
		private JPanel panel, countPanel, qualityPanel, repPanel, buttons;
		private JLabel countdown, quality, numRep;
		private JFormattedTextField count, rep;
		private JButton save, cancel;
		private NumberFormat idFormat;

		public PreferencesFrame() {
			createFramePreferences();
		}

		private void createFramePreferences() {
			// JFrame
			frame = new JFrame();
			frame.setTitle("Preferences");
			frame.setPreferredSize(new Dimension(350, 200));

			// JPanel
			panel = new JPanel();
			panel.setLayout(new FlowLayout(FlowLayout.LEFT));
			countPanel = new JPanel();
			countPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			qualityPanel = new JPanel();
			qualityPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			repPanel = new JPanel();
			repPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			buttons = new JPanel();
			buttons.setLayout(new GridLayout(1, 2));

			// JLabel
			countdown = new JLabel("Seconds of countdown: ");
			quality = new JLabel("Color of quality-indicator:  ");
			numRep = new JLabel("Number of repetitions:  ");

			// JFormattedTextField
			count = new JFormattedTextField(idFormat);
			count.setHorizontalAlignment(JFormattedTextField.CENTER);
			count.setValue(new Integer(wo.wop.getPoseWO().getSecondsOfWait()));
			count.setPreferredSize(new Dimension(X_PREF, Y_PREF));
			count.setFont(new Font("Arial", Font.CENTER_BASELINE, DIM_FONT_PREF));
			count.addPropertyChangeListener("value", this);
			count.setEditable(true);

			rep = new JFormattedTextField(idFormat);
			rep.setHorizontalAlignment(JFormattedTextField.CENTER);
			rep.setValue(new Integer(wo.wop.getInfoWO().getCountAmount()));
			rep.setPreferredSize(new Dimension(X_PREF, Y_PREF));
			rep.setFont(new Font("Arial", Font.CENTER_BASELINE, DIM_FONT_PREF));
			rep.addPropertyChangeListener("value", this);
			rep.setEditable(true);

			// JButton
			save = new JButton("Save");
			cancel = new JButton("Cancel");
			save.addActionListener(this);
			cancel.addActionListener(this);

			showFramePreferences();

		}

		private void showFramePreferences() {
			countPanel.add(countdown);
			countPanel.add(count);

			// qualityPanel.add(amountPred);
			// qualityPanel.add(pred);

			repPanel.add(numRep);
			repPanel.add(rep);

			buttons.add(new JPanel());
			JPanel b = new JPanel();
			b.add(save);
			b.add(cancel);
			buttons.add(b);

			panel.add(countPanel);
			panel.add(qualityPanel);
			panel.add(repPanel);
			panel.add(buttons);

			frame.add(panel);
			frame.pack();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		}

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub

		}

		public void propertyChange(PropertyChangeEvent arg0) {
			// TODO Auto-generated method stub

		}
	}

	class NameFrame implements ActionListener {
		JFrame frame;
		JTextArea area;
		JButton button;
		JPanel panel;

		int preimpostedTAB;

		public NameFrame(int tab) {
			preimpostedTAB = tab;

			// JFrame
			frame = new JFrame();
			frame.setTitle("Insert name of exercise");
			frame.setPreferredSize(new Dimension(350, 80));

			// JPanel
			panel = new JPanel();
			panel.setLayout(new FlowLayout(FlowLayout.LEFT));

			// JTextArea
			area = new JTextArea(1, 30);

			// JButton
			button = new JButton("Save");
			button.addActionListener(this);

			showNameFrame();

		}

		public void showNameFrame() {

			panel.add(area);
			panel.add(button);

			frame.add(panel);
			frame.pack();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		}

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if (arg0.getSource() == button) {
				if (!(area.getText().length() > 0))
					area.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2,
							Color.red));
				else {
					try {
						String name = area.getText();
						int number_of_steps = ((Integer) obj[0]).intValue();
						String[] SILimages = (String[]) obj[1];
						HumanModel[] hm = (HumanModel[]) obj[2];

						// if(preimpostedTAB == BAL)
						// choose.select.balance.insertMyExercise();
						// else if(preimpostedTAB == FLEX)
						// else if(preimpostedTAB == SIT)
						// else if(preimpostedTAB == STR)
						// else
						if (preimpostedTAB == MY)
							choose.select.mine.insertMyExercise(name,
									number_of_steps, SILimages, hm);

						frame.dispose();
					} catch (NullPointerException np) {
						np.printStackTrace();
					}

				}
			}
		}
	}

}
