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
	static double[] bernoulli = { 1.000000000, 0.500000000, 0.166666666, 0, -0.033333333, 0, 0.023809523, 0,
			-0.033333333, 0, 0.075757575, 0, -0.253113553 };

	static int factorial(int input) {
		int output = 1;
		for (int i = 1; i <= input; i++) {
			output = output * i;
		}
		return output;
	}

	static double pow(double a, double b) {
		double output = 1;
		while (b != 0) {
			output *= a;
			if (b < 0) {
				++b;
			} else {
				--b;
			}
		}
		if (b < 0) {
			output = 1 / output;
		}
		return output;
	}

	public static double tan(int input) {
		double output = 0.0000;
		for (int n = 0; n <= 6; n++) {

			double dividend = ((bernoulli[2 * n]) * (NewMathLib.pow(-4, n)) * (1 - NewMathLib.pow(4, n)))
					* NewMathLib.pow(Math.toRadians(input), (2 * n) - 1);
			double divisor = factorial(2 * n);
			output = output + dividend / divisor;
		}
		return output;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(NewMathLib.tan(46));
		System.out.println(Math.tan(Math.toRadians(46)));
		System.out.println(NewMathLib.pow(-2, 9));
		System.out.println(Math.pow(2, -9));
	}

}
