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
		return radian * (180/NewMathLib.PI);
	}

	public static double tan(double input) {

		input = NewMathLib.toRadians(input);
		return (Math.sin(input)/Math.cos(input));

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(NewMathLib.tan(77));
		System.out.println(Math.tan(Math.toRadians(77)));

		System.out.println(NewMathLib.pow(2, -9));
		System.out.println(Math.pow(2, -9));

		System.out.println(NewMathLib.toRadians(1));
		System.out.println(Math.toRadians(1));

	}

}
