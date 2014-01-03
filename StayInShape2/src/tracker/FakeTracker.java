package tracker;

import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import classifier.Classifier;
import static constants.HumanBodyValues.*;
import static constants.TrackerHumanValues.*;

public class FakeTracker extends Component implements TrackerInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Instance> skeletonIstances = new ArrayList<Instance>(
			TOTAL_LIMB);
	private List<Attribute> head_att, b_upright_att, b_stan_slanting_att, b_sit_slanting_att, left_arm_att, right_arm_att,
			left_leg_att, right_leg_att;
	int count = 0;

	private double[][] h_inline = new double[HEAD_JOINTS][3];
	private double[][] h_slantingLeft = new double[HEAD_JOINTS][3];
	private double[][] h_slantingRight = new double[HEAD_JOINTS][3];
	private double[][] b_upright = new double[BODY_UPRIGHT_ABOUT.length][3];
	private double[][] b_stan_slanting = new double[BODY_STAN_SLANTING_ABOUT.length][3];
	private double[][] b_sit_slanting = new double[BODY_SIT_SLANTING_ABOUT.length][3];
	private double[][] la = new double[LEFT_ARM_JOINTS][3];
	private double[][] ra = new double[RIGHT_ARM_JOINTS][3];
	private double[][] ll = new double[LEFT_LEG_JOINTS][3];
	private double[][] rl = new double[RIGHT_LEG_JOINTS][3];

	private boolean startedTest = false;

	private String head_inline = "1,1378461932052,h_inline,0,-3.3796692,-109.06917,-75.76196,1.0,1,-0.48443604,-46.21512,-14.134766,1.0";
	private String head_slantingLeft = "1,1378391381096,h_slantingLeft,0,-17.847176,-362.7685,-196.59998,0.0,1,-21.867111,-128.2686,-49.196045,0.0";
	private String head_slantingRight = "1,1378391382361,h_slantingRight,0,-28.702515,-336.60184,-179.19891,0.0,1,-22.722824,-109.26551,-28.858154,0.0";
	private String body_upright = "1,1379366412323,body_sit,2,0,909.1963,0,1.0";
	private String body_stan_slanting = "1,1379366452424,body_stan_slantingLeft,2,0,888.08466,0,1.0,20,146.47038,-122.05418,71.66553,1.0,21,75.73207,-522.7566,234.42114,1.0,23,110.53258,-888.08466,117.48779,1.0,16,112.6615,-145.51607,-87.288086,1.0,17,80.965065,-538.3134,-84.996704,1.0,19,120.71561,-850.0276,64.4624,1.0";
	private String body_sit_slanting = "1,1379366475569,body_sit_slantingLeft,2,0,984.82385,0,1.0,20,-39.179344,-216.47319,60.18579,1.0,21,20.076553,-625.9192,79.31641,1.0,23,5.5680313,-984.82385,78.49219,1.0,16,109.12942,-191.73822,-57.83838,1.0,17,61.825172,-598.12854,-122.07056,1.0,19,138.90851,-983.93286,-8.580811,1.0";
	private String left_arm = "1,1378399521468,la_lowered,11,-35.152985,-38.299347,64.802,1.0,12,-64.45478,12.232071,-214.61475,1.0,14,-146.59724,74.800125,-372.1825,1.0";
	private String right_arm = "1,1378400062275,ra_lowered,5,-31.619156,-35.953323,-202.55786,1.0,6,-28.530777,6.600525,-270.96716,1.0,9,-83.98891,52.537445,-364.83765,1.0";
	private String left_leg = "1,1378400260132,ll_inline,20,-22.289505,53.478836,44.38672,1.0,21,-27.073883,155.11403,69.50391,1.0,23,-18.81311,239.06432,159.26953,1.0";
	private String right_leg = "1,1378400489522,rl_inline,16,36.307663,38.663574,-63.537598,1.0,17,29.012222,151.0259,-48.49829,1.0,19,27.241684,233.45665,95.694336,1.0";

	private Classifier test;

	public FakeTracker() {

		StringTokenizer str1 = new StringTokenizer(head_inline, ",");
		str1.nextToken();// user id
		str1.nextToken();// timestamp
		str1.nextToken();// pose id
		for (int i = 0, j = 0; i < HEAD_JOINTS; i++) {
			str1.nextToken();// joint id

			h_inline[i][j] = new Double(str1.nextToken()).doubleValue(); // x
			h_inline[i][j + 1] = new Double(str1.nextToken()).doubleValue(); // y
			h_inline[i][j + 2] = new Double(str1.nextToken()).doubleValue(); // z

			str1.nextToken();// confidence

		}

		StringTokenizer str2 = new StringTokenizer(head_slantingLeft, ",");
		str2.nextToken();// user id
		str2.nextToken();// timestamp
		str2.nextToken();// pose id
		for (int i = 0, j = 0; i < HEAD_JOINTS; i++) {
			str2.nextToken();// joint id

			h_slantingLeft[i][j] = new Double(str2.nextToken()).doubleValue(); // x
			h_slantingLeft[i][j + 1] = new Double(str2.nextToken())
					.doubleValue(); // y
			h_slantingLeft[i][j + 2] = new Double(str2.nextToken())
					.doubleValue(); // z

			str2.nextToken();// confidence

		}

		StringTokenizer str3 = new StringTokenizer(head_slantingRight, ",");
		str3.nextToken();// user id
		str3.nextToken();// timestamp
		str3.nextToken();// pose id
		for (int i = 0, j = 0; i < HEAD_JOINTS; i++) {
			str3.nextToken();// joint id

			h_slantingRight[i][j] = new Double(str3.nextToken()).doubleValue(); // x
			h_slantingRight[i][j + 1] = new Double(str3.nextToken())
					.doubleValue(); // y
			h_slantingRight[i][j + 2] = new Double(str3.nextToken())
					.doubleValue(); // z

			str3.nextToken();// confidence

		}

		tokenizerLimb(body_upright, b_upright, BODY_UPRIGHT_ABOUT.length);
		tokenizerLimb(body_stan_slanting, b_stan_slanting, BODY_STAN_SLANTING_ABOUT.length);
		tokenizerLimb(body_sit_slanting, b_sit_slanting, BODY_SIT_SLANTING_ABOUT.length);
		tokenizerLimb(left_arm, la, LEFT_ARM_JOINTS);
		tokenizerLimb(right_arm, ra, RIGHT_ARM_JOINTS);
		tokenizerLimb(left_leg, ll, LEFT_LEG_JOINTS);
		tokenizerLimb(right_leg, rl, RIGHT_LEG_JOINTS);
	}

	public void tokenizerLimb(String limb, double[][] l, int joints) {
		StringTokenizer str2 = new StringTokenizer(limb, ",");
		str2.nextToken();// user id
		str2.nextToken();// timestamp
		str2.nextToken();// pose id
		for (int i = 0, j = 0; i < joints; i++) {
			str2.nextToken();// joint id

			l[i][j] = new Double(str2.nextToken()).doubleValue();
			l[i][j + 1] = new Double(str2.nextToken()).doubleValue();
			l[i][j + 2] = new Double(str2.nextToken()).doubleValue();

			str2.nextToken();// confidence

		}
	}

	public void createLimbsAttribute() {
		head_att = test.getLimbFeatureDataSet(TRACKER_HEAD_LIMB);
		
		b_upright_att = test.getLimbFeatureDataSet(TRACKER_BODY_UPRIGHT_LIMB);
		b_stan_slanting_att = test.getLimbFeatureDataSet(TRACKER_BODY_STAN_SLANTING_LIMB);
		b_sit_slanting_att = test.getLimbFeatureDataSet(TRACKER_BODY_SIT_SLANTING_LIMB);
		
		left_arm_att = test.getLimbFeatureDataSet(TRACKER_LEFT_ARM_LIMB);
		right_arm_att = test.getLimbFeatureDataSet(TRACKER_RIGHT_ARM_LIMB);
		left_leg_att = test.getLimbFeatureDataSet(TRACKER_LEFT_LEG_LIMB);
		right_leg_att = test.getLimbFeatureDataSet(TRACKER_RIGHT_LEG_LIMB);
	}

	public void setClassifier(Classifier test) {
		this.test = test;

		createLimbsAttribute();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see tracker.Tracker#initDemoTracker()
	 */
	public int initTracker() {
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see tracker.Tracker#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		if (startedTest) {
			// if (count % 2 == 0)
			if (count < 25) {
				try {
					sendInstanceOfHead_inline();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (count > 25 && count < 40) {
				try {
					sendInstanceOfHead_slantingLeft();
					// sendInstanceOfHead_inline();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (count > 40) {
				try {
					sendInstanceOfHead_inline();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// if(count==0){
			// try {
			// sendInstanceOfHead_slantingRight();
			// } catch (Exception e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// }
			count += 1;
			// System.out.println(count);
		}
	}

	private void sendInstanceOfHead_inline() throws Exception {
		createLimbInstance(h_inline, TRACKER_HEAD_LIMB, HEAD_ABOUT, head_att);
		createSkeletonInstances();
	}

	private void sendInstanceOfHead_slantingLeft() throws Exception {
		createLimbInstance(h_slantingLeft, TRACKER_HEAD_LIMB, HEAD_ABOUT, head_att);
		createSkeletonInstances();
	}

	private void sendInstanceOfHead_slantingRight() throws Exception {
		createLimbInstance(h_slantingRight, TRACKER_HEAD_LIMB, HEAD_ABOUT, head_att);
		createSkeletonInstances();
	}

	private void createSkeletonInstances() throws Exception {
		createLimbInstance(b_upright, TRACKER_BODY_UPRIGHT_LIMB, BODY_UPRIGHT_ABOUT, b_upright_att);
		createLimbInstance(b_stan_slanting, TRACKER_BODY_STAN_SLANTING_LIMB, BODY_STAN_SLANTING_ABOUT, b_stan_slanting_att);
		createLimbInstance(b_sit_slanting, TRACKER_BODY_SIT_SLANTING_LIMB, BODY_SIT_SLANTING_ABOUT, b_sit_slanting_att);
		createLimbInstance(la, TRACKER_LEFT_ARM_LIMB, LEFT_ARM_ABOUT, left_arm_att);
		createLimbInstance(ra, TRACKER_RIGHT_ARM_LIMB, RIGHT_ARM_ABOUT, right_arm_att);
		createLimbInstance(ll, TRACKER_LEFT_LEG_LIMB, LEFT_LEG_ABOUT, left_leg_att);
		createLimbInstance(rl, TRACKER_RIGHT_LEG_LIMB, RIGHT_LEG_ABOUT, right_leg_att);

		sendInstance();
	}

	private void createLimbInstance(double[][] l, int limb, int[] limb_about,
			List<Attribute> limb_att) {
		
		int att = 1;
		Instance ist = new DenseInstance(
				(SPATIAL_COORD * limb_about.length) + 1);

		for (int i = 0; i < limb_about.length; i++) {

			ist.setValue((Attribute) limb_att.get(att), l[i][0]);
			ist.setValue((Attribute) limb_att.get(att + 1), l[i][1]);
			ist.setValue((Attribute) limb_att.get(att + 2), l[i][2]);

			att += 3;
		}

		skeletonIstances.add(limb, ist);
	}

	private void sendInstance() throws Exception {

		test.testingONLINE(skeletonIstances, System.currentTimeMillis());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see tracker.Tracker#setStartedTest(boolean)
	 */
	public void setStartedTest(boolean b) {
		startedTest = b;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see tracker.Tracker#updateDepth()
	 */
	public int updateDepth() {
		return 0;
	}

//	public void resetTracker() throws GeneralException {
//		// TODO Auto-generated method stub
//
//	}
}
