/**
 * 
 */
package trigonometric;

import java.lang.Math;

/**
 * @author Iman Anooshehpour
 *
 */
public class NewMathLib {
	private static double[] bernoulli = { 1.000000000, 0.500000000, 0.166666666, 0, -0.033333333, 0, 0.023809523, 0,
			-0.033333333, 0, 0.075757575, 0, -0.253113553 };
	public static double PI = 3.1415926535897932384626433;

	static int factorial(int input) {
		int output = 1;
		for (int i = 1; i <= input; i++) {
			output = output * i;
		}
		return output;
	}

	public static double pow(double basis, double exponent) {
		if (exponent > 0) {
			return basis * NewMathLib.pow(basis, exponent - 1);
		} else if (exponent < 0) {
			return (1 / NewMathLib.pow(basis, -exponent));
		} else {
			return 1;
		}
	}

	public static double toRadians(double degree) {
		return degree * NewMathLib.PI / 180;
	}

	public static double cosFunction(double input) {

		int exp = 10;
		double output = 0.0;
		// double dividend = 0;
		// double divisor = 0;

		input = toRadians(input);
		for (int n = 0; n <= exp; n++) {
			double dividend = pow(-1, n) * pow(input, 2 * n);
			double divisor = factorial(2 * n);
			output += (dividend / divisor);
		}
		return (output);

	}

	public static double tan(double input) {
//		double output = 0.0000;
//		for (int n = 1; n <= 6; n++) {
//
//			double dividend = (NewMathLib.pow(-1, n - 1)) * (NewMathLib.pow(2, 2 * n))
//					* (NewMathLib.pow(2, (2 * n) - 1)) * (bernoulli[(2 * n) - 1])
//					* NewMathLib.pow(NewMathLib.toRadians(input), ((2 * n) - 1));
//			double divisor = factorial(2 * n);
//			output = output + (dividend / divisor);
//		}
//		return output;

//		input = NewMathLib.toRadians(input);
//		return input + (NewMathLib.pow(input, 3) / 3) + (2 * NewMathLib.pow(input, 5) / 15)
//				+ (17 * NewMathLib.pow(input, 7) / 315)+ (62 * NewMathLib.pow(input, 9) / 2835);

		input = NewMathLib.toRadians(input);
		return (Math.sin(input) / Math.cos(input));

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(NewMathLib.tan(77));
		System.out.println(Math.tan(Math.toRadians(77)));
		System.out.println(Math.tan(4.71239));

		System.out.println(NewMathLib.pow(2, -9));
		System.out.println(Math.pow(2, -9));

		System.out.println(NewMathLib.toRadians(1));
		System.out.println(Math.toRadians(1));

		System.out.println(NewMathLib.pow(NewMathLib.toRadians(77), 9) / 2835);
	}

}
