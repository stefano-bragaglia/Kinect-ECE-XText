package classifier;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import weka.classifiers.functions.SMO;
import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;
import static constants.HumanBodyValues.*;
import static constants.TrackerHumanValues.*;

public class Classifier extends Observable {
	private final String headSVM = "head.model";
	private final String body_upright_SVM = "body_upright.model";
	private final String body_stan_slanting_SVM = "body_slan_stan.model";
	private final String body_sit_slanting_SVM = "body_slan_sit.model";
	private final String laSVM = "left_arm.model";
	private final String raSVM = "right_arm.model";
	private final String llSVM = "left_leg.model";
	private final String rlSVM = "right_leg.model";
	private final String[] limbSVM = { headSVM, body_upright_SVM,
			body_stan_slanting_SVM, body_sit_slanting_SVM, laSVM, raSVM, llSVM,
			rlSVM };
	private SMO[] limbNET;
	private Instances[] testLIMB;
	private List<List<Attribute>> limbs_att;
	private long firstTimestamp;
	private boolean first = true;

	private int count = 0;
	private int MAX_COUNT = 31;

	private ArrayList<Instance> skeletonIstance;

	private ArrayList<Object> humanbody_obj = new ArrayList<Object>(
			TRACKER_TOTAL_LIMBS);

	private boolean fake;
	private boolean send = false;

	public Classifier(boolean fake) {
		this.fake = fake;

		initListOfLimbsAtt();
		initListOfLimbsInst();

		try {
			setClassifiers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setFeatureDataSet();
	}
	
	public void setBooleanFirst(boolean b){
		first = b;
	}

	public void initListOfLimbsAtt() {
		limbs_att = new ArrayList<List<Attribute>>(TRACKER_TOTAL_LIMBS);
	}

	public void initListOfLimbsInst() {
		testLIMB = new Instances[TRACKER_TOTAL_LIMBS];
	}

	public void setClassifiers() throws Exception {
		File file;

		limbNET = new SMO[TRACKER_TOTAL_LIMBS];

		for (int i = 0; i < TRACKER_TOTAL_LIMBS; i++) {
			file = new File(getClass().getResource(limbSVM[i]).getFile());
			limbNET[i] = (SMO) weka.core.SerializationHelper.read(file
					.getPath());
		}
	}

	public boolean getFake() {
		return fake;
	}

	public List<Attribute> getBodyLimbFeatureDataSet(int limb) {
		List<Attribute> res = null;

		res = limbs_att.get(limb);

		return res;
	}

	public List<Attribute> getLimbFeatureDataSet(int limb) {
		List<Attribute> res = null;

		res = limbs_att.get(limb);

		return res;
	}

	public Instances getLimbEmptyDataSet(int limb) {
		Instances res = null;

		res = testLIMB[limb];

		return res;
	}

	public void setLimbFeatureDataSet(String[] limb_poses, int[] limb_about,
			int limb) {
		List<Attribute> limb_att;
		Instances TESTlimb;
		// Declare a nominal attribute along with its values
		List<String> codeVal = new ArrayList<String>(limb_poses.length);
		for (int i = 0; i < limb_poses.length; i++)
			codeVal.add(limb_poses[i]);

		Attribute classAttribute = new Attribute("code", codeVal);

		// Declare numeric attributes
		Attribute[] joint = new Attribute[SPATIAL_COORD * limb_about.length];
		for (int i = 0, j = 0; i < limb_about.length; i++) {
			int k = limb_about[i];
			joint[j] = new Attribute("x" + k);
			joint[j + 1] = new Attribute("y" + k);
			joint[j + 2] = new Attribute("z" + k);

			j += 3;
			// System.out.println(i);
		}

		int dim = (SPATIAL_COORD * limb_about.length) + 1; // x,y,z for each
															// joint + code
		// Declare the feature list
		limb_att = new ArrayList<Attribute>(dim);
		limb_att.add(classAttribute);
		for (int i = 0; i < (SPATIAL_COORD * limb_about.length); i++)
			limb_att.add(joint[i]);

		// System.out.println("class Classifier.java:\nlimb_poses[0]= " +
		// limb_poses[0] + "\nlimb_att.size()="
		// + limb_att.size());

		this.limbs_att.add(limb, limb_att);

		// Create an empty data set
		TESTlimb = new Instances("Testing ON-LINE",
				(ArrayList<Attribute>) limb_att, 1);
		// Set class index
		TESTlimb.setClassIndex(0);

		this.testLIMB[limb] = TESTlimb;

	}

	public void classifyLimb(int limb) throws Exception {
		Object[] limb_obj = new Object[COMPONENTS_OF_PREDICTION];

		if (skeletonIstance.get(limb).dataset() == null)
			skeletonIstance.get(limb).setDataset(getLimbEmptyDataSet(limb));

		double clsLabel = limbNET[limb].classifyInstance(skeletonIstance
				.get(limb));
		String event = testLIMB[limb].classAttribute().value((int) clsLabel);
		double distr[] = limbNET[limb].distributionForInstance(skeletonIstance
				.get(limb));
		double value = distr[(int) clsLabel];

		// System.out.println(event + "---->" + clsLabel);
		// for(int i=0; i<distr.length; i++)
		// System.out.print(i + " = " + distr[i] + "\t");
		// System.out.println();

		limb_obj[POSE] = event;

		limb_obj[VALUE_OF_POSE] = new Double(value);

		// humanbody_obj.add(limb, limb_obj);

		if (count > MAX_COUNT) {
			// invio la probabilità di appartenenza dell'istanza a ogni classe
			// dell'insieme dei dati
			humanbody_obj.add(limb, distr);

			if (limb == TRACKER_LIMBS.length - 1) {
				count = 0;
				send = true;
			}
		}
	}

	public void setFeatureDataSet() {

		setLimbFeatureDataSet(HEAD_POSES, HEAD_ABOUT, TRACKER_HEAD_LIMB);

		setLimbFeatureDataSet(BODY_UPRIGHT, BODY_UPRIGHT_ABOUT,
				TRACKER_BODY_UPRIGHT_LIMB);
		setLimbFeatureDataSet(BODY_STANDING_SLANTING, BODY_STAN_SLANTING_ABOUT,
				TRACKER_BODY_STAN_SLANTING_LIMB);
		setLimbFeatureDataSet(BODY_SITTING_SLANTING, BODY_SIT_SLANTING_ABOUT,
				TRACKER_BODY_SIT_SLANTING_LIMB);

		setLimbFeatureDataSet(LEFT_ARM_POSES, LEFT_ARM_ABOUT,
				TRACKER_LEFT_ARM_LIMB);
		setLimbFeatureDataSet(RIGHT_ARM_POSES, RIGHT_ARM_ABOUT,
				TRACKER_RIGHT_ARM_LIMB);
		setLimbFeatureDataSet(LEFT_LEG_POSES, LEFT_LEG_ABOUT,
				TRACKER_LEFT_LEG_LIMB);
		setLimbFeatureDataSet(RIGHT_LEG_POSES, RIGHT_LEG_ABOUT,
				TRACKER_RIGHT_LEG_LIMB);

		System.out.println("setFeatureDataSet of all HumanBody Parts");

	}

	public void testingONLINE(ArrayList<Instance> skeletonIstance, long time)
			throws Exception {
		// setFeatureDataSet();
		// testONLINE.add(0, ist);

		this.skeletonIstance = skeletonIstance;

		classifyLimb(TRACKER_HEAD_LIMB);

		classifyLimb(TRACKER_BODY_UPRIGHT_LIMB);
		classifyLimb(TRACKER_BODY_STAN_SLANTING_LIMB);
		classifyLimb(TRACKER_BODY_SIT_SLANTING_LIMB);

		classifyLimb(TRACKER_LEFT_ARM_LIMB);
		classifyLimb(TRACKER_RIGHT_ARM_LIMB);
		classifyLimb(TRACKER_LEFT_LEG_LIMB);
		classifyLimb(TRACKER_RIGHT_LEG_LIMB);

		if (first) {
			firstTimestamp = time;
			humanbody_obj.add(new Long(1));
			first = false;
		} else
			humanbody_obj.add(time - firstTimestamp);

		if (send) {
			// send to Gauge
			setChanged();
			notifyObservers(humanbody_obj);
			send = false;
		} else
			count += 1;
	}
}
