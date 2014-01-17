package gui.workout.pose;

public final class Pose {

	public static final String REPETITION = "Repetition";
	public static final String HURRYUP = "HurryUp";
	public static final String RESET = "Reset";
	public static final String ALERT = "DeclipAlert";
	
	public static final String FIRST_POSE = "IsAtFirst";
	public static final String SECOND_POSE = "IsAtSecond";
	public static final String THIRD_POSE = "IsAtThird";
	public static final String LAST_POSE = "IsAtLast";

	public static final String[] SEQUENCE_POSES = { FIRST_POSE, SECOND_POSE, THIRD_POSE,
			LAST_POSE };

	public static boolean isPose(String s1) {
		boolean ris = false;

		for (String s2 : SEQUENCE_POSES) {
			if (s2.equalsIgnoreCase(s1)) {
				ris = true;
				break;
			}
		}

		return ris;
	}

	public static final String newline = "<html><p> <br> </p></html>";
	public static final String PREQUEL = "prequel", WAIT = "wait";
	// public static final String REPRODUCE =
	// "<html><p>Reproduce<br>    the    <br>  following  <br>   images   .</p></html>";
	public static final String REPRODUCE = "Reproduce" + newline + "the"
			+ newline + "following" + newline + "images";
	public static final String[] INIT = {"Reproduce", "the", "following", "images"};
}
