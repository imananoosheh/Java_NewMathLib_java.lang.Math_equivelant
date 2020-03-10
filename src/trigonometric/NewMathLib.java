/**
 * 
 */
package trigonometric;

import java.lang.Math;

/**
 * @author Iman Anooshehpour
 * @author Aashka Prajapati
 * @author Shreya Wadhwa
 * @author Kasra Naderi
 * @groupname group33
 *
 */
public class NewMathLib {
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

	public static double toDegree(double radian) {
		return radian * (180 / NewMathLib.PI);
	}

	public static double sin(double rad) {
		int no = 10;
		double output = 0.0;
		rad = toRadians(rad);
		for (int n = 0; n <= no; n++) {
			double dividend = pow(-1, n) * pow(rad, (2 * n+1));
			double divisor = factorial((2 * n+1));
			output += (dividend / divisor);		

		}
		return output;

	}

	public static double cos(double input) {

		int exp = 10;
		double output = 0.0;

		input = toRadians(input);
		for (int n = 0; n <= exp; n++) {
			double dividend = pow(-1, n) * pow(input, 2 * n);
			double divisor = factorial(2 * n);
			output += (dividend / divisor);
		}
		return (output);

	}

	public static double tan(double input) {

		input = NewMathLib.toRadians(input);
		return (NewMathLib.sin(input) / NewMathLib.cos(input));

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(NewMathLib.sin(88));
		System.out.println(Math.sin(Math.toRadians(88)));

		/*System.out.println(NewMathLib.pow(2, -9));
		System.out.println(Math.pow(2, -9));

		System.out.println(NewMathLib.toRadians(1));
		System.out.println(Math.toRadians(1)); */

	}

}
