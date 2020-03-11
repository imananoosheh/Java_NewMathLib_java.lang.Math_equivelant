/**
 * 
 */
package trigonometric;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Iman Anooshehpour
 * @author Aashka Prajapati
 * @author Shreya Wadhwa
 * @author Kasra Naderi
 * @groupName group33
 *
 */
public class TestToRadians {

	double delta = 0.0001;

	double angle2PI = 0, anglePI6 = 30, anglePI4 = 45, anglePI3 = 60, anglePI2 = 90, angle2PI3 = 120, angle3PI4 = 135,
			angle5PI6 = 150, anglePI = 180, angle7PI6 = 210, angle5PI4 = 225, angle4PI3 = 240, angle3PI2 = 270,
			angle5PI3 = 300, angle7PI4 = 315, angle11PI6 = 330;

	@Test
	public void toRadiansTest1() {
		assertEquals(NewMathLib.toRadians(angle2PI), Math.toRadians(angle2PI), delta);

	}

	@Test
	public void toRadiansTest2() {
		assertEquals(NewMathLib.toRadians(anglePI6), Math.toRadians(anglePI6), delta);
	}

	@Test
	public void toRadiansTest3() {
		assertEquals(NewMathLib.toRadians(anglePI4), Math.toRadians(anglePI4), delta);
	}

	@Test
	public void toRadiansTest4() {
		assertEquals(NewMathLib.toRadians(anglePI3), Math.toRadians(anglePI3), delta);
	}

	@Test
	public void toRadiansTest5() {
		assertEquals(NewMathLib.toRadians(anglePI2), Math.toRadians(anglePI2), delta);
	}

	@Test
	public void toRadiansTest6() {
		assertEquals(NewMathLib.toRadians(angle2PI3), Math.toRadians(angle2PI3), delta);
	}

	@Test
	public void toRadiansTest7() {
		assertEquals(NewMathLib.toRadians(angle3PI4), Math.toRadians(angle3PI4), delta);

	}

	@Test
	public void toRadiansTest8() {
		assertEquals(NewMathLib.toRadians(angle5PI6), Math.toRadians(angle5PI6), delta);

	}

	@Test
	public void toRadiansTest9() {
		assertEquals(NewMathLib.toRadians(anglePI), Math.toRadians(anglePI), delta);

	}

	@Test
	public void toRadiansTest10() {
		assertEquals(NewMathLib.toRadians(angle7PI6), Math.toRadians(angle7PI6), delta);

	}

	@Test
	public void toRadiansTest11() {
		assertEquals(NewMathLib.toRadians(angle5PI4), Math.toRadians(angle5PI4), delta);

	}

	@Test
	public void toRadiansTest12() {
		assertEquals(NewMathLib.toRadians(angle4PI3), Math.toRadians(angle4PI3), delta);

	}

	@Test
	public void toRadiansTest13() {
		assertEquals(NewMathLib.toRadians(angle3PI2), Math.toRadians(angle3PI2), delta);

	}

	@Test
	public void toRadiansTest14() {
		assertEquals(NewMathLib.toRadians(angle5PI3), Math.toRadians(angle5PI3), delta);

	}

	@Test
	public void toRadiansTest15() {
		assertEquals(NewMathLib.toRadians(angle7PI4), Math.toRadians(angle7PI4), delta);

	}

	@Test
	public void toRadiansTest16() {
		assertEquals(NewMathLib.toRadians(angle11PI6), Math.toRadians(angle11PI6), delta);
	}
}
