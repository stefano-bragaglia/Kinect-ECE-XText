package applet;

import gauge.Distribution_Gauge;
import gauge.Distribution_GaugeBAK;
import static constants.MBConstants.*;
import gui.choose.CHOOSEpanel;
import gui.make.MAKEpanel;
import gui.menubar.FrameMenuBar;





import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.ece.reasoner.Reasoner;

import workout.WorkOut;

public class Background extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private String[] images = {MAKE, CHOOSE, BACKGROUND};
	
	private JPanel mainpanel;
	private int maxWidth, maxHeight;
	private static int gap = 40;
	private JButton chooseButton, myeButton;
	private GridBagConstraints gbc;
	private MAKEpanel mye;
	private FrameMenuBar mb;

	private WorkOut wo;
	private Distribution_Gauge gauge;

	boolean fake;

	private CHOOSEpanel choose;

	public Background(boolean fake) {
		System.out.println("*****Sono dentro a Background");
		System.out.println();
		
		this.fake = fake;

		// create all main component
		wo = new WorkOut(fake);
		mye = new MAKEpanel();
		choose = new CHOOSEpanel();
		gauge = new Distribution_Gauge();

		// addObservers
		wo.addObserverToClassifier(gauge);
		wo.addObserverToReasoner(gauge);
		wo.wop.controls.setGauge(gauge);
		gauge.addObservers(wo.getController(), wo.wop.getPoseWO(), wo.wop.getInfoWO());
		// 1)create and set JMenuBar
		createAndSetMenuBar();

		// 2)set background frame
		setBackGroundFrame();

		// 3)set dependencies
		setDependencies();
	}

	protected void setDependencies() {//3)
		// silhouette needs gauge to send HumanModel
		mye.sil.setGauge(gauge);
		mye.sil.setPoseWO(wo.wop.getPoseWO());
		// PosturesvView needs gauge
		choose.pview.setGauge(gauge);
		choose.pview.setPoseWO(wo.wop.getPoseWO());
	}

	protected void createAndSetMenuBar() {//1)
		mb = new FrameMenuBar();
		mb.setBackgroundConfigurations();
		setJMenuBar(mb);

		mb.setBG(this);
		mb.setMYE(mye);
		mb.setChoose(choose);
		mb.setWO(wo);
		mb.setGauge(gauge);

		// choose = new ChoosePanel();
		// mb.setChoose(choose);

		mye.sil.setMenuBar(mb);
		choose.pview.setMenuBar(mb);
	}

	protected void setBackGroundFrame() {//2)
		setFrame();
		setLayout(new BorderLayout());
		
		// create main JPanel
		maxWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		maxHeight = (int) Toolkit.getDefaultToolkit().getScreenSize()
				.getHeight()
				- gap;
		mainpanel = new Main(maxHeight, maxHeight, new ImageIcon(getClass().getResource(images[2]).getFile()).getImage());
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;

		chooseButton = new JButton("<html>CHOOSE <br> Your Exercise</html>");
		ImageIcon choose_image = new ImageIcon(getClass().getResource(images[1]).getFile());
		chooseButton.setIcon(choose_image);
		chooseButton.setPreferredSize(new Dimension(300, 300));
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.insets = new Insets(0, 0, 0, 60);
		chooseButton.addActionListener(this);
		mainpanel.add(chooseButton, gbc);

		myeButton = new JButton("MAKE Your Exercise");
		ImageIcon make_image = new ImageIcon(getClass().getResource(images[0]).getFile());
		myeButton.setIcon(make_image);
		myeButton.setPreferredSize(new Dimension(300, 300));
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(0, 60, 0, 0);
		myeButton.addActionListener(this);
		mainpanel.add(myeButton, gbc);
		
		add(mainpanel, BorderLayout.CENTER);
		
		setPreferredSize(new Dimension(maxWidth, maxHeight));
		setResizable(false);
		pack();
	}

	public void cleanMainPanel() {
		mainpanel.removeAll();
		mainpanel.revalidate();
		mainpanel.repaint();
	}

	private void setFrame() {
		setTitle("Welcome to Di Monte Stefano's thesis");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent arg0) {
			}

			public void keyReleased(KeyEvent arg0) {
			}

			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_ESCAPE) {
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				}
			}
		});
		setVisible(true);
	}

	public void setBackGroundPanel() {

		cleanMainPanel();

		mainpanel.setSize(maxWidth, maxHeight);
		mainpanel.setLayout(new GridBagLayout());
		mainpanel.add(chooseButton, gbc);
		mainpanel.add(myeButton, gbc);
	}

	public void setMYEpanel() {

		setTitle("Make Your Exercise");

		cleanMainPanel();

		mye.setMYE(mainpanel);

	}

	public void setWorkOutPanel() {
		setTitle("Work Out!");

		cleanMainPanel();

		wo.wop.setWO(mainpanel);
	}

	public void setChoosePanel() {
		setTitle("Choose Your Exercise");

		cleanMainPanel();

		choose.setChoose(mainpanel);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == myeButton) {
			mb.setMYEConfigurations();
			setMYEpanel();
		}

		if (arg0.getSource() == chooseButton) {
			mb.setChooseConfigurations();
			setChoosePanel();
		}
	}
	
	

	public void setReasoner(Reasoner eceReasoner) {
		this.gauge.setReasoner(eceReasoner);
	}
}
