package tracker;

import gui.workout.ControlsWO;
import gui.workout.KinectFOV;
import gui.workout.WorkOutPanel;

import java.util.List;
import javax.swing.JOptionPane;

import classifier.Classifier;

import com.primesense.nite.*;

import org.openni.*;
import org.openni.OpenNI.DeviceConnectedListener;
import org.openni.OpenNI.DeviceDisconnectedListener;

public class UserViewerApplication implements Runnable,
		DeviceDisconnectedListener, DeviceConnectedListener {

	private UserViewer mViewer;
	private boolean mShouldRun = true;
	public UserTracker tracker;
	private List<DeviceInfo> devicesInfo;
	private Device device;
	// public JInternalFrame mFrame;

	private boolean connected = true;
	private boolean openedDevice = false;
	private boolean addedDeviceListener = false;

	private boolean fake;
	private Classifier classifier;
	private KinectFOV kinect;
	private WorkOutPanel wop;
	private ControlsWO controls;
	private boolean firstTime = false;

	public UserViewerApplication(boolean fake, Classifier classifier) {
		this.fake = fake;
		this.classifier = classifier;
	}

	public void createTrackerFrame() {
		mViewer = new UserViewer();
		mViewer.setSize(800, 600);

		setTrackerDependencies();
		
		kinect.kinectFOV.add("Center", mViewer);
		// mFrame = new JInternalFrame("NiTE User Tracker Viewer");
		// mFrame.add("Center", mViewer);
		// mFrame.setSize(mViewer.getWidth(), mViewer.getHeight());
		// mFrame.setVisible(true);
	}

	public void playKinectView() {
		mShouldRun = true;
	}

	public void stopKinectView() {
		mShouldRun = false;
	}

	public int init() {
		int res = 0;

		createTrackerFrame();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// initialize OpenNI and NiTE
		OpenNI.initialize();
		NiTE.initialize();

		if (!addedDeviceListener) {
			OpenNI.addDeviceDisconnectedListener(this);
			OpenNI.addDeviceConnectedListener(this);

			addedDeviceListener = true;
		}

		devicesInfo = OpenNI.enumerateDevices();
		if (devicesInfo.size() == 0) {
			JOptionPane.showMessageDialog(null, "No device is connected",
					"Error", JOptionPane.ERROR_MESSAGE);
			// return;

			OpenNI.removeDeviceDisconnectedListener(this);
			OpenNI.removeDeviceConnectedListener(this);

			addedDeviceListener = false;

			OpenNI.shutdown();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			NiTE.shutdown();

			kinect.kinectFOV.dispose();

		} else {
			res = 1;
			// La funzione Device::open() serve per collegare un oggetto Device
			// a un dispositivo hardaware �?sico.
			if (!openedDevice) {
				device = Device.open(devicesInfo.get(0).getUri());
				openedDevice = true;
				System.out.println("device " + devicesInfo.get(0).getUri()
						+ " OPENED!");
			}

			tracker = UserTracker.create();
			mViewer.setTracker(tracker);
			mViewer.init();
		}

		return res;
	}

	public void destroy() throws InterruptedException {
		mViewer.remove();

		// device.close(); //----> da usare quando si chiude l'intera
		// applicazione!!!!!

		OpenNI.shutdown();
		Thread.sleep(100);
		tracker.destroy();
		NiTE.shutdown();
	}

	public void setDependencies(KinectFOV kinect, WorkOutPanel wop) {
		this.kinect = kinect;
		this.wop = wop;
	}

	// thus method must to be call whenever a new Tracker is created
	public void setTrackerDependencies() {
		mViewer.setClassifier(classifier);

		/*
		 * InfoWO needs of TrackerApplication (Tracker really) in order to stop
		 * tracking when all of repetitions are terminated
		 */
		wop.getInfoWO().setDependencies(mViewer);

		/*
		 * ControlsWO needs of: a) TrackerApplication (Tracker really) in order
		 * to start/stop tracking as a consequence of play/(pause and stop)
		 * pushed b) PoseWO in order to clean panel when stop pushed and to show
		 * appropriate imagePose when play pushed (start countdown as well as)
		 * c) InfoWO in order to clean panel when stop pushed
		 */
		wop.getControlsWO().setDependencies(mViewer, wop.getPoseWO(),
				wop.getInfoWO(), classifier);

		/*
		 * KinectFOV needs of ControlsWO in order to disable/enable his button
		 * appropriately
		 */
		wop.getKinectFOV().setControlsWODependency(wop.getControlsWO());

		/*
		 * TrackerApplication needs of ControlsWO in order todisable all of
		 * button in case of kinect device error
		 */
		this.controls = wop.getControlsWO();
	}

	public void run() {
		while (true) {
			if (mShouldRun) {
				firstTime  = true;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				if(firstTime){
					kinect.kinectFOV.dispose();
					kinect.resetKinectComp();
					firstTime = false;
				}
			}
		}
	}

	public void onDeviceDisconnected(DeviceInfo arg0) {
		// TODO Auto-generated method stub
		System.out.println("Device disconnected");

		mViewer.remove();
		stopKinectView();

		connected = false;

		if (controls.checkT())
			controls.stopT();
		controls.removeAllComponentsOfPosePanel();
		controls.setEnableAllButtons(false, false, false);

		// stopKinectView();

		//-- disattiva il button start!
		kinect.setEnabledKinectButton(false);
		kinect.setEnabledResetButton(false);
		kinect.setEnabledStopButton(false);
	}

	public void onDeviceConnected(DeviceInfo arg0) {
		// TODO Auto-generated method stub
		System.out.println("Device connected");

		playKinectView();
		connected = true;
		
		//-- ATTIVA il button kinect!
		kinect.setEnabledKinectButton(true);
		kinect.setEnabledResetButton(false);
		kinect.setEnabledStopButton(false);
	}

	static {
		try {
			System.load("C:\\Program Files\\Openni2\\Redist\\OpenNI2.dll");
			//System.load("C:\\Users\\Stefano\\Documents\\Sofware\\OpenNI\\Openni_2\\NiTE2.dll");
			System.load("C:\\Program Files\\Primesense\\NiTE2\\nite2dll\\NiTE2.dll");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
