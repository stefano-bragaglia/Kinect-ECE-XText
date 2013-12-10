package gui.workout.countdown;

import gui.views.posture_pose.PoseWO;

import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JMenuItem;

import tracker.TrackerInterface;
import static gui.workout.pose.Pose.*;

public class ImagesToStart extends Observable implements Runnable {

	private final int millisecond = 1000; // 1 secondo = 1000 milliseconds

	private int count = 0;
	private Object[] obj = new Object[2];

	private PoseWO pose;
	private JButton pause;
	private TrackerInterface tracker;

//	private JMenuItem itemPause;

	public ImagesToStart(PoseWO pose, TrackerInterface tracker,
			JButton pause, JMenuItem itemPause) {
		this.pose = pose;
		this.tracker = tracker;
		this.pause = pause;
//		this.itemPause = itemPause;
	}

	private int getWait(String s) {
		int result = 0;
		if (s.equalsIgnoreCase(PREQUEL))
			result = millisecond * 3;
		else if (s.equalsIgnoreCase(WAIT))
			result = millisecond;

		return result;
	}

	public void run() {
		// TODO Auto-generated method stub

		while (count < pose.getSecondsOfPrequel()) {
			obj[0] = new Integer(count);
			obj[1] = PREQUEL;

			setChanged();
			notifyObservers(obj);

			if (count < pose.getSecondsOfPrequel() - 1) {
				try {
					Thread.sleep(getWait(PREQUEL));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			count++;
		}

		count = pose.getSecondsOfWait();

		while (count >= 0) {
			obj[0] = new Integer(count);
			obj[1] = WAIT;

			setChanged();
			notifyObservers(obj);

			try {
				Thread.sleep(getWait(WAIT));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count--;
		}
		pose.setInitialPose();
		pose.showNextPose();

//		itemPause.setEnabled(true);
		pause.setEnabled(true);
		tracker.setStartedTest(true);
	}

}
