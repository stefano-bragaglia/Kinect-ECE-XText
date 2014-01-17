package gauge;

import gui.views.posture_pose.PoseWO;
import gui.workout.InfoWO;
import human_model.HumanModel;
import static gui.workout.pose.Pose.*;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import rec.controller.Controller;
import rec.reasoner.Reasoner;
import static constants.HumanBodyValues.*;
import static constants.MBConstants.*;
import static constants.TrackerHumanValues.*;

public class Distribution_GaugeBAK extends Observable implements Observer {

	private int execution = HAPHAZARD;

	Object[] obj = new Object[3];
	Object[] alert = new Object[3];

	private HumanModel[] hm;
	private int current_step = DEFAULT, number_of_step,
			last_pose_executed = -1;

	private ArrayList<String> limbs_model, limbs_pred;
//	private ArrayList<Double> limbs_values;

	// *****************for distribution
	private ArrayList<double[]> limbs_distr;

	private long time;
	private double average = 0.0;
	private int count = 0;

	private boolean first = true;

	public Distribution_GaugeBAK() {
	}

	public void addObservers(Controller controller, PoseWO poseWO, InfoWO infoWO){
		addObserver(controller);
		addObserver(poseWO);
		addObserver(infoWO);
	}
	
	public void setExecutionMode(int execution) {
		this.execution = execution;
	}

	public void setHumanModels(HumanModel[] hm, int number_of_step) {
		this.hm = hm;
		this.number_of_step = number_of_step;

		limbs_pred = new ArrayList<String>();
//		limbs_values = new ArrayList<Double>();

		limbs_distr = new ArrayList<double[]>();
	}

	public void initCurrentStep() {
		current_step = DEFAULT;
		sendReset(time + 1);
	}

	public int[] checkLimbPose(int limb_model, String model) {
		// *****************************for distribution
		int[] limb_pred = new int[2];

		switch (limb_model) {
		case HEAD_LIMB: {
			for (int i = 0; i < HEAD_POSES.length; i++) {
				if (model.equalsIgnoreCase(HEAD_POSES[i])) {
					limb_pred[0] = TRACKER_HEAD_LIMB;
					limb_pred[1] = i;
					break;
				}
			}

		}
		case BODY_LIMB: {
			for (int category = 0; category < ALL_BODY_POSES.length; category++) {
				for (int i = 0; i < ALL_BODY_POSES[category].length; i++) {
					if (model.equalsIgnoreCase(ALL_BODY_POSES[category][i])) {
						limb_pred[0] = category + 1;
						limb_pred[1] = i;
						break;
					}
				}
			}
			break;
		}
		case LEFT_ARM_LIMB: {
			for (int i = 0; i < LEFT_ARM_POSES.length; i++) {
				if (model.equalsIgnoreCase(LEFT_ARM_POSES[i])) {
					limb_pred[0] = TRACKER_LEFT_ARM_LIMB;
					limb_pred[1] = i;
					break;
				}
			}
		}
		case RIGHT_ARM_LIMB: {
			for (int i = 0; i < RIGHT_ARM_POSES.length; i++) {
				if (model.equalsIgnoreCase(RIGHT_ARM_POSES[i])) {
					limb_pred[0] = TRACKER_RIGHT_ARM_LIMB;
					limb_pred[1] = i;
					break;
				}
			}
		}
		case LEFT_LEG_LIMB: {
			for (int i = 0; i < LEFT_LEG_POSES.length; i++) {
				if (model.equalsIgnoreCase(LEFT_LEG_POSES[i])) {
					limb_pred[0] = TRACKER_LEFT_LEG_LIMB;
					limb_pred[1] = i;
					break;
				}
			}
		}
		case RIGHT_LEG_LIMB: {
			for (int i = 0; i < RIGHT_LEG_POSES.length; i++) {
				if (model.equalsIgnoreCase(RIGHT_LEG_POSES[i])) {
					limb_pred[0] = TRACKER_RIGHT_LEG_LIMB;
					limb_pred[1] = i;
					break;
				}
			}
		}

		}

		return limb_pred;
	}

	public boolean checkCurrentPose() {
		boolean enable = true;

		limbs_model = hm[current_step - 1].getHumanModelStringParameters();

		// *****************************for distribution
		for (int i = 0; i < TOTAL_LIMB; i++) {
			String model = limbs_model.get(i);
			if (model != "") {
				int[] index = checkLimbPose(i, model);

				double[] distr = limbs_distr.get(index[0]);
				average += distr[index[1]];
				count += 1;
//				System.out.println("model = " + model + "\tdistr = "
//						+ distr[index[1]]);
			}
		}
		// *************************************************

		double quality = average / count;
		System.out.println("quality of current pose (n° " + current_step + ") = " + quality);
		if (quality >= MIN_QUALITY){
			System.out.println("------------POSA CORRETTA");
			enable = true;
		}else
			enable = false;

		return enable;
	}

	public int checkPassedPose() {
		int pose = -1, i = 0;

		// *****************************for distribution
		for (int h = 0; h < current_step - 2; h++) {
			
			limbs_model = hm[h].getHumanModelStringParameters();
			
			for (; i < TOTAL_LIMB; i++) {
				String model = limbs_model.get(i);
				if (model != "") {
					int[] index = checkLimbPose(i, model);

					double[] distr = limbs_distr.get(index[0]);
					average += distr[index[1]];
					count += 1;
//					System.out.println("model = " + model + "\tdistr = "
//							+ distr[index[1]]);
				}
			}
			// *************************************************

			double quality = average / count;
			System.out.println("pose n°" + h+1 + " ---> quality = " + quality);
			if (quality >= MIN_QUALITY){
				
				pose = h;
				break;
			}
		}

		return pose;
	}

	public void resetOfAllStructures() {
		// limbs_pred.clear();
		// limbs_values.clear();
		count = 0;
		average = 0.0;
	}

	public void sendReset(Long time) {
		Object[] reset = new Object[3];
		reset[0] = RESET;
		reset[1] = time;
		reset[2] = new Double(0.0);
		setChanged();
		notifyObservers(reset);
	}

	public void sendAlert(Long time, double d) {
		alert[0] = ALERT;
		alert[1] = time;
		alert[2] = new Double(d);
		setChanged();
		notifyObservers(alert);
	}

	public void stampPredictionLimbs() {
		for (String s : limbs_pred)
			System.out.println(s);
	}

	@SuppressWarnings("unchecked")
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		if (arg1 instanceof ArrayList<?>) {

			//arg1 contiene la posa classificata 
			//intesa come inseme di posizione degli arti classificati
			ArrayList<Object> array = (ArrayList<Object>) arg1;

			// reset of structures
			resetOfAllStructures();

			// pose of prediction and value of prediction
			// for (int i : TRACKER_LIMBS) {
			// limbs_pred.add(i, (String) ((Object[]) array.get(i))[POSE]);
			// limbs_values.add(i,
			// (Double) ((Object[]) array.get(i))[VALUE_OF_POSE]);
			// }

			// *********************************for distribution
			for (int i : TRACKER_LIMBS)
				limbs_distr.add(i, (double[]) array.get(i));
			// **********************************************************

			// stampPredictionLimbs();

			// timestamp
			Long t = (Long) array.get(array.size() - 1);
			time = t.longValue();

			// timestamp
			obj[1] = time;

			// //send values of prediction to InfoPanel.java
			// sendQualityOfPose();

			// if person has performed the request pose sends to Drools/EC
			if (checkCurrentPose()) {

				if (first) {
					// Initialization of Alert with first pose recognized
					// Setting to 1.0 the HarryUp Fluent
					sendAlert(time, 1.0);
					// -----------------------------
					first = false;
				} else
					sendAlert(time, 0.0);

				last_pose_executed = current_step - 1;

				// pose
				if (current_step == number_of_step) {
					obj[0] = POSES[POSES.length - 1];
					current_step = DEFAULT;
				} else {
					obj[0] = POSES[current_step - 1];
					current_step += 1;
				}

				// average of all of limb's value
				obj[2] = new Double(average / count);
			} else {
				if (current_step > 2) { // perchè checkPassedPose() esegue
										// sì il controllo sulle pose passate ma
										// non sulla penultima in quanto il
										// paziente potrebbe rimanere immobile
										// una volta eseguita la penunltima
										// posa; in tal caso non si tratterebe
										// di una posa errata
//					System.out.println(current_step);

					int step = checkPassedPose();
					if (step >= 0) {
						if (execution == INPUT_ORDER) {
							System.out
									.println("\nErrore!\nEsercizio non eseguito correttamente.\nPosa attuale 'step#"
											+ (step + 1)
											+ ".\n"
											+ "Posa richiesta: 'step#"
											+ current_step
											+ "\n"
											+ "Prego ricomnciare dall'inizio.");

							/********************************************
							 * indicare al POSE che deve ripresentare la prima
							 * Posa: Utilizzare la relazione Observer-Observable
							 * tra Pose e Reasoner, e in particolar modo
							 * l'arrivo dell'evento RESET!
							 *********************************************/

							current_step = DEFAULT;
							last_pose_executed = -1;

							// reset WorkingMemory: reset all sample into WM
							sendReset(time);

							// reset ALERT too
							sendAlert(time, 0.0);
							first = true;

						} else if (execution == HAPHAZARD) {
							System.out
									.println("\nWarning!\nEsercizio non eseguito nell'ordine previsto...");
						}
					}

					// e se esegue una posa futura????
					// possibile soluzione: inserire in "if (checkFuturePose)"
				}
			}

			if (last_pose_executed != -1) { // se almeno la prima posa è stata
											// eseguita correttamente

				System.out.println(obj[0]);

				// send to Controller for Drools/EC
				setChanged();
				notifyObservers(obj);
			}
		}

		if (arg0 instanceof Reasoner) {
			if (arg1 instanceof Object[]) {
				Object[] obj = (Object[]) arg1;
				String fluent = (String) obj[0];
				Double value = (Double) obj[1];
				Long start = (Long) obj[2];

				if (fluent.equalsIgnoreCase(HURRYUP) && value < 1.0
						&& last_pose_executed != -1) {

					if (value == 0.5)
						System.out.println("HARRY UP!!!");

					sendAlert(start + 1, 1.0);
				}
			}
		}
	}
}