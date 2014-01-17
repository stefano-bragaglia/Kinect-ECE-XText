package gui.workout;

import static gui.workout.pose.Pose.*;
import gauge.Distribution_GaugeBAK;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import rec.reasoner.Reasoner;
import tracker.UserViewer;

public class InfoWO extends JPanel implements PropertyChangeListener, Observer {

	private UserViewer tracker;

	String dirImages = "images";
	private String[] images = { "great-job.jpeg", "good-job.jpeg",
			"you-can-do-better.jpeg", "HurryUp.png" };
	private final int repdef = 2, dimField = 90, dimFont = 70, margin = 60,
			heightVerdict = 450;
	private int repAmount = repdef;

	private int width;
	// private int height;
	private NumberFormat idFormat;
	private JFormattedTextField count;

	private JProgressBar quality;
	private JLabel verdict;
	private ImageIcon great, good, canDObetter, hurryup;

	// protected ArrayList<Double> sitHistory = new ArrayList<Double>();
	// private ArrayList<Double> stanHistory = new ArrayList<Double>();
	private ArrayList<Double> repHistory = new ArrayList<Double>();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InfoWO(int width, int height) {

		// setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLayout(new BorderLayout());
		configurePanel(this, width, height);

		initInfoComp();

		setImageIcon();
	}

	public void configurePanel(JPanel p, int w, int h) {
		Dimension d = new Dimension(w, h);
		p.setPreferredSize(d);
		p.setMinimumSize(d);
		p.setMaximumSize(d);
		p.setOpaque(false);
		// setTransparency(p);
	}

	protected void removeComponents() {
		removeAll();
		revalidate();
		repaint();
	}

	protected void initInfoComp() {
		//step number
		JPanel countPanel = new JPanel();
		countPanel.setSize(dimField, dimField);
		countPanel.setOpaque(false);
		count = new JFormattedTextField(idFormat);
		count.setHorizontalAlignment(JFormattedTextField.CENTER);
		count.setValue(new Integer(repAmount));
		count.setPreferredSize(new Dimension(dimField, dimField));
		count.setFont(new Font("Arial", Font.CENTER_BASELINE, dimFont));
		count.addPropertyChangeListener("value", this);
		count.setEditable(false);
		countPanel.add(count);

		//quality bar
		JPanel qp = new JPanel();
		qp.setPreferredSize(new Dimension((width - margin), margin));
		qp.setOpaque(false);
		quality = new JProgressBar(0, 100);
		quality.setForeground(Color.RED);
		quality.setValue(0);
		qp.add(quality);

		JPanel v = new JPanel();
		v.setPreferredSize(new Dimension(width, heightVerdict));
		v.setMinimumSize(new Dimension(width, heightVerdict));
		v.setMaximumSize(new Dimension(width, heightVerdict));
		v.setOpaque(false);
		v.setVisible(true);
		verdict = new JLabel();
		// verdict.setFont(new Font("Arial", Font.CENTER_BASELINE, 24));
		v.add(verdict);

		// configurePanel(countPanel, dimField, dimField);
		// configurePanel(qp, (width - margin), margin);
		// configurePanel(v, width, (height - margin - dimField));

		add(countPanel, BorderLayout.NORTH);
		add(qp, BorderLayout.CENTER);
		add(v, BorderLayout.SOUTH);

		// add(countPanel);
		// add(qp);
		// add(v);
	}

	private void setImageIcon() {
		great = new ImageIcon(getClass().getResource(images[0]).getFile());
		good = new ImageIcon(getClass().getResource(images[1]).getFile());
		canDObetter = new ImageIcon(getClass().getResource(images[2]).getFile());
		hurryup = new ImageIcon(getClass().getResource(images[3]).getFile());
	}

	private ImageIcon getImageIcon(int value) {
		ImageIcon result = null;

		if (value <= 33)
			result = canDObetter;
		else if (value > 33 && value <= 66)
			result = good;
		else if (value > 66)
			result = great;

		return result;
	}

	public void setQuality(int value) {
		quality.setValue(value);
	}

	public int getCountAmount() {
		Integer amount = (Integer) count.getValue();
		return amount.intValue();
	}

	public int getRepAmount() {
		return repAmount;
	}

	public void setRepAmount(int n) {
		repAmount = n;
		count.setValue(new Integer(repAmount));
	}

	public void setDependencies(UserViewer mViewer) {
		this.tracker = mViewer;
	}

	// public void addValueOfSitting(Double value) {
	// sitHistory.add(value);
	// }
	//
	// public void addValueOfStanding(Double value) {
	// stanHistory.add(value);
	// }

	public void propertyChange(PropertyChangeEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == count) {
			if (count.getValue() != null && !(count.getText().equals(""))) {
				int n = ((Number) count.getValue()).intValue();
				if (n > 0)
					count.setValue(new Integer(n));
				else
					count.setValue(new Integer(0));
			}
		}
	}

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		if (arg0 instanceof Distribution_GaugeBAK) {
			if (arg1 instanceof Object[]) {
				Object[] obj = (Object[]) arg1;
				String s = (String) obj[0];
				
				if(s.equals(RESET)){
					setQuality(0);
					verdict.setIcon(null);
					repHistory = new ArrayList<Double>();
				}
			}
		}
		
		if (arg0 instanceof Reasoner) {
			if (arg1 instanceof Object[]) {
				Object[] obj = (Object[]) arg1;
				String fluent = (String) obj[0];
				Double value = (Double) obj[1];

				Integer count = (Integer) this.count.getValue();

				if (count.intValue() > 0) {
					if (fluent.equalsIgnoreCase(HURRYUP)) {
						if (value == 0.5) {
							verdict.setIcon(hurryup);
							// Toolkit.getDefaultToolkit().beep();
							mimeBeep();
						}
					}

					if (fluent.equalsIgnoreCase(REPETITION)) {
						if (value > 0) {
							Double percentage = value * 100;
							int newCount = count.intValue() - 1;
							this.count.setValue(new Integer(newCount));

							setQuality(percentage.intValue());

							verdict.setIcon(getImageIcon(percentage.intValue()));

							repHistory.add(value);
						} else
							verdict.setIcon(null);
					}

					if (isPose(fluent) && value > 0) {
						Double percentage = value * 100;

						setQuality(percentage.intValue());
						verdict.setIcon(null);
					}

					count = (Integer) this.count.getValue();
					if (count.intValue() == 0) {
						// stop tracking and sending prediction
						tracker.setStartedTest(false);
						// can you save log file?
						new StampFrameClass(repHistory);
						// new StampFrameClass(sitHistory, stanHistory,
						// repHistory);
					}
				}
			}
		}
	}

	private static void mimeBeep() {

		final int SAMPLE_RATE = 8000; // sample per second
		final int SAMPLE_PER_MS = SAMPLE_RATE / 1000; // sample per ms

		// make your adjustments here
		final int HZ = 400; // Frequency in hertz
		final int MSECS = 50; // Duration

		final byte[] raw = new byte[MSECS * SAMPLE_PER_MS]; // duration_ms *
															// (sample per ms)
		for (int i = 0; i < raw.length; i++) {
			double angle = i / (SAMPLE_RATE / (double) HZ) * 2.0d * Math.PI;
			raw[i] = (byte) (Math.sin(angle) * 81.11d);
		}

		final String[] cmd = { "sh", "-c", "aplay -c1 -fU8 -r" + SAMPLE_PER_MS };

		Process p = null;
		try {
			p = Runtime.getRuntime().exec(cmd);
			p.getOutputStream().write(raw);
			p.getOutputStream().close();
			Thread.sleep(MSECS + 30); // Wait the outer process to play.
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (p != null)
				p.destroy();
		}
	}

}

class StampFrameClass extends JFrame implements ActionListener {

	// private ArrayList<Double> sitHistory, stanHistory;
	private ArrayList<Double> repHistory;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton yes, no, ok;
	private String dirLog = "log";

	private JPanel stampPanel, namePanel;

	private JFrame name;
	private JLabel insertName;
	private JTextField nameField;
	private PrintStream out;

	// public StampFrameClass(ArrayList<Double> sitHistory,
	// ArrayList<Double> stanHistory, ArrayList<Double> repHistory) {

	public StampFrameClass(ArrayList<Double> repHistory) {

		// this.sitHistory = sitHistory;
		// this.stanHistory = stanHistory;
		this.repHistory = repHistory;

		setTitle("Stamp Log File");
		setPreferredSize(new Dimension(250, 150));
		setLocation(630, 300);

		// create jpanel and its component
		stampPanel = new JPanel(new GridBagLayout());
		yes = new JButton("Yes");
		no = new JButton("No");
		yes.addActionListener(this);
		no.addActionListener(this);
		stampPanel.add(yes);
		stampPanel.add(new JPanel());
		stampPanel.add(no);

		// Add content to the window.
		add(stampPanel);

		// Display the window.
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void saveLogFile() throws FileNotFoundException {

		String logName;
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		String formattedDate = df.format(new Date());
		Calendar calendar = GregorianCalendar.getInstance(); // creates a new
																// calendar
																// instance

		logName = nameField.getText();
		String time = System.currentTimeMillis() + "";
		if (logName.length() <= 0)
			logName = "log" + time;

		name.dispose();
		dispose();

		String current = null;
		try {
			current = new java.io.File(".").getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FileOutputStream file = new FileOutputStream(current + "/" + dirLog
				+ "/" + logName);
		out = new PrintStream(file);

		out.println("**********************************\tLog File\t**********************************"
				+ "\n\nExercise in "
				+ formattedDate
				+ ",\t"
				+ getTwoCharacter(calendar.get(Calendar.HOUR_OF_DAY))
				+ ":"
				+ getTwoCharacter(calendar.get(Calendar.MINUTE))
				+ ":"
				+ getTwoCharacter(calendar.get(Calendar.SECOND)));

		// out.println("\n\n\n\t\tSitting: \t\t\t\tStanding: \t\t\t\tRepetition:");
		out.println("\t\t\t\tRepetition:");

		// for (int i = 0; i < sitHistory.size() && i < stanHistory.size()
		// && i < repHistory.size(); i++)
		for (int i = 0; i < repHistory.size(); i++) {
			// out.print("\nrip #" + getTwoCharacter((i + 1)) + ":" + "\t"
			// + sitHistory.get(i));
			// out.print("\t\t\t" + stanHistory.get(i));
			// out.println("\t\t\t" + repHistory.get(i));

			out.print("\nrip #" + getTwoCharacter((i + 1)) + ":" + "\t"
					+ repHistory.get(i));
		}

		out.println("\n**************************************************************************************");
	}

	private String getTwoCharacter(int c) {

		return c < 10 ? "0" + c : "" + c;
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (arg0.getSource() == yes) {

			name = new JFrame();
			insertName = new JLabel("Log file name: ");
			nameField = new JTextField(30);
			nameField.setText(" ");
			ok = new JButton("ok");
			namePanel = new JPanel();
			namePanel.add(insertName);
			namePanel.add(nameField);
			namePanel.add(ok);
			name.add(namePanel);
			name.pack();
			name.setVisible(true);
			name.setLocation(630, 300);

			nameField.addKeyListener(new KeyListener() {
				public void keyTyped(KeyEvent arg0) {
				}

				public void keyReleased(KeyEvent arg0) {
				}

				public void keyPressed(KeyEvent arg0) {
					if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
						try {
							saveLogFile();
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			});

			ok.addActionListener(this);
		}
		if (arg0.getSource() == no) {
			this.dispose();

		}

		if (arg0.getSource() == ok) {
			try {
				saveLogFile();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
