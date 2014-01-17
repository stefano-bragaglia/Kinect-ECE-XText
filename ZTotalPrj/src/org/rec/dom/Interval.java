/**
 * 
 */
package org.rec.dom;

/**
 * @author stefano
 * 
 */
public class Interval {

	/**
	 * 
	 */
	public static final Interval TRUE = new Interval(1.0, 1.0);

	/**
	 * 
	 */
	public static final Interval FALSE = new Interval(0.0, 0.0);

	/**
	 * 
	 */
	public static final Interval UNKNOWN = new Interval(0.0, 1.0);

	/**
	 * 
	 */
	private double lowerBound;

	/**
	 * 
	 */
	private double upperBound;

	/**
	 * @param lowerBound
	 * @param upperBound
	 */
	public Interval(double lowerBound, double upperBound) {
		if (lowerBound < 0.0)
			throw new IllegalArgumentException(
					"Illegal 'lo' argument in Interval(double, double): "
							+ lowerBound);
		if (upperBound > 1.0)
			throw new IllegalArgumentException(
					"Illegal 'hi' argument in Interval(double, double): "
							+ upperBound);
		if (lowerBound > upperBound)
			throw new IllegalArgumentException(
					"Illegal 'lo' and 'hi' arguments in Interval(double, double): "
							+ lowerBound + ", " + upperBound);
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		assert invariant() : "Illegal state in Interval(double, double)";
	}


	/**
	 * @return
	 */
	public static Interval getFuzzyInterval(double value){
		return new Interval(value, value);
	}
	
	
	/**
	 * @return
	 */
	public double getLowerBound() {
		assert invariant() : "Illegal state in Interval.getLowerBound()";
		return lowerBound;
	}

	/**
	 * @return
	 */
	public double getUncertainty() {
		double result = upperBound - lowerBound;
		assert invariant() : "Illegal state in Interval.getUncertainty()";
		return result;
	}

	/**
	 * @return
	 */
	public double getUpperBound() {
		assert invariant() : "Illegal state in Interval.getUpperBound()";
		return upperBound;
	}

	/**
	 * @return
	 */
	private boolean invariant() {
		return (0.0 <= lowerBound && lowerBound <= upperBound && upperBound <= 1.0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result = getClass().getSimpleName() + "( ";
		if (this.equals(FALSE))
			result += "FALSE";
		else if (this.equals(TRUE))
			result += "TRUE";
		else if (this.equals(UNKNOWN))
			result += "UNKNOWN";
		else {
			result += "lowerBound='" + lowerBound + "', upperBound='"
					+ upperBound + "'";
		}
		result += " )";
		return result;
	}

}
