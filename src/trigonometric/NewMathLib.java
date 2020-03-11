/**
 * 
 */
package trigonometric;

/**
 * @author Iman Anooshehpour
 * @author Aashka Prajapati
 * @author Shreya Wadhwa
 * @author Kasra Naderi
 * @groupname group33
 *
 */
public class NewMathLib {

	/**
	 * Pi number = 3.14...
	 */
	public static double PI = 3.1415926535897932384626433;

	/**
	 * Factorial Function
	 * 
	 * @param input
	 * @return output
	 */
	static double factorial(double input) {
		double output = 1;
		for (int i = 1; i <= input; i++) {
			output = output * i;
		}
		return output;
	}

	/**
	 * 
	 * @param basis
	 * @param exponent
	 * @return returns basis to the power of exponent
	 */
	public static double pow(double basis, double exponent) {
		if (exponent > 0) {
			return basis * NewMathLib.pow(basis, exponent - 1);
		} else if (exponent < 0) {
			return (1 / NewMathLib.pow(basis, -exponent));
		} else {
			return 1;
		}
	}

	/**
	 * 
	 * @param degree
	 * @return returns degree value of desired radian.
	 */
	public static double toRadians(double degree) {
		return degree * NewMathLib.PI / 180;
	}

	/**
	 * 
	 * @param radian
	 * @return returns radian value of desired degree
	 */
	public static double toDegree(double radian) {
		return radian * (180 / NewMathLib.PI);
	}

	/**
	 * 
	 * @param input in degree
	 * @return returns the Sine of input by calculating Power series expansion for
	 *         10 statements.
	 */
	public static double sin(double input) {
		int no = 10;
		double output = 0.0;
		double radian = NewMathLib.toRadians(input);
		for (int n = 0; n <= no; n++) {
			double dividend = NewMathLib.pow(-1, n) * NewMathLib.pow(radian, (2 * n + 1));
			double divisor = NewMathLib.factorial(2 * n + 1);
			output += (dividend / divisor);

		}
		return output;

	}

	/**
	 * 
	 * @param input in degree
	 * @return returns the Cosine of input by calculating Power series expansion for
	 *         10 statements.
	 */
	public static double cos(double input) {

		int exp = 10;
		double output = 0.0;

		input = NewMathLib.toRadians(input);
		for (int n = 0; n <= exp; n++) {
			double dividend = NewMathLib.pow(-1, n) * NewMathLib.pow(input, 2 * n);
			double divisor = NewMathLib.factorial(2 * n);
			output += (dividend / divisor);
		}
		return (output);

	}

	/**
	 * 
	 * @param input in degree
	 * @return returns the Tangent (sin()/cos()) of input by calculating Power
	 *         series expansion for 10 statements in each sin() and cos().
	 */
	public static double tan(double input) {
//		double[] bernoulli = { 1.000000000, 0.500000000, 0.166666666, 0, -0.033333333, 0, 0.023809523, 0, -0.033333333,
//				0, 0.075757575, 0, -0.253113553 };
//
//		double output = 0.0000;
//		for (int n = 1; n <= 6; n++) {
//
//			double dividend = (bernoulli[(2 * n) - 1]) * (NewMathLib.pow(-1, n - 1)) * (NewMathLib.pow(2, 2 * n))
//					* (NewMathLib.pow(2, 2 * n) - 1) * NewMathLib.pow(NewMathLib.toRadians(input), 2 * n - 1);
//			double divisor = factorial(2 * n);
//			output = output + (dividend / divisor);
//		}
//		return output;

//		double negativePoint = 1.0;
//		if (input > 180 && input < 270) {
//			return NewMathLib.tan(input - 180);
//		} else if (input > 270 && input < 360) {
//			negativePoint = -1.0;
//			return negativePoint * NewMathLib.tan(360 - input);
//		} else if (input == 0 && input == 360) {
//			return 0;
//		} else if (input == 90 && input == 180) {
//			return Double.POSITIVE_INFINITY;
//		} else {
//			input = NewMathLib.toRadians(input);
//			double sin = NewMathLib.sin(input);
//			double cos = NewMathLib.cos(input);
//			double tan = sin / cos;
//			return negativePoint * tan;
//		}
		if (input == 90) {
			return Double.POSITIVE_INFINITY;
		} else if (input == 270) {
			return Double.NEGATIVE_INFINITY;
		} else if (input > 180 && input < 270) {
			input = input - 180;
			input = NewMathLib.toRadians(input);
			double sin = NewMathLib.sin(input);
			double cos = NewMathLib.cos(input);
			double tan = sin / cos;
			return tan;
		} else if (input < 360 && input > 270) {
			input = 360-input;
			input = NewMathLib.toRadians(input);
			double sin = NewMathLib.sin(input);
			double cos = NewMathLib.cos(input);
			double tan = sin / cos;
			return -1 *tan;
		} else {
			input = NewMathLib.toRadians(input);
			double sin = NewMathLib.sin(input);
			double cos = NewMathLib.cos(input);
			double tan = sin / cos;
			return tan;
		}

	}

}
