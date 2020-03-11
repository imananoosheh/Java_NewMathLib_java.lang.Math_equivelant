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
public class TestSin {

	double delta = 0.0001;

	double angle2PI = 0, anglePI6 = 30, anglePI4 = 45, anglePI3 = 60, anglePI2 = 90, angle2PI3 = 120, angle3PI4 = 135,
			angle5PI6 = 150, anglePI = 180, angle7PI6 = 210, angle5PI4 = 225, angle4PI3 = 240, angle3PI2 = 270,
			angle5PI3 = 300, angle7PI4 = 315, angle11PI6 = 330;

	@Test
	public void sinTest1() {
		assertEquals(NewMathLib.sin(angle2PI), Math.sin(Math.toRadians(angle2PI)), delta);

	}

	@Test
	public void sinTest2() {
		assertEquals(NewMathLib.sin(anglePI6), Math.sin(Math.toRadians(anglePI6)), delta);
	}

	@Test
	public void sinTest3() {
		assertEquals(NewMathLib.sin(anglePI4), Math.sin(Math.toRadians(anglePI4)), delta);
	}

	@Test
	public void sinTest4() {
		assertEquals(NewMathLib.sin(anglePI3), Math.sin(Math.toRadians(anglePI3)), delta);
	}

	@Test
	public void sinTest5() {
		assertEquals(NewMathLib.sin(anglePI2), Math.sin(Math.toRadians(anglePI2)), delta);
	}

	@Test
	public void sinTest6() {
		assertEquals(NewMathLib.sin(angle2PI3), Math.sin(Math.toRadians(angle2PI3)), delta);
	}

	@Test
	public void sinTest7() {
		assertEquals(NewMathLib.sin(angle3PI4), Math.sin(Math.toRadians(angle3PI4)), delta);

	}

	@Test
	public void sinTest8() {
		assertEquals(NewMathLib.sin(angle5PI6), Math.sin(Math.toRadians(angle5PI6)), delta);

	}

	@Test
	public void sinTest9() {
		assertEquals(NewMathLib.sin(anglePI), Math.sin(Math.toRadians(anglePI)), delta);

	}

	@Test
	public void sinTest10() {
		assertEquals(NewMathLib.sin(angle7PI6), Math.sin(Math.toRadians(angle7PI6)), delta);

	}

	@Test
	public void sinTest11() {
		assertEquals(NewMathLib.sin(angle5PI4), Math.sin(Math.toRadians(angle5PI4)), delta);

	}

	@Test
	public void sinTest12() {
		assertEquals(NewMathLib.sin(angle4PI3), Math.sin(Math.toRadians(angle4PI3)), delta);

	}

	@Test
	public void sinTest13() {
		assertEquals(NewMathLib.sin(angle3PI2), Math.sin(Math.toRadians(angle3PI2)), delta);

	}

	@Test
	public void sinTest14() {
		assertEquals(NewMathLib.sin(angle5PI3), Math.sin(Math.toRadians(angle5PI3)), delta);

	}

	@Test
	public void sinTest15() {
		assertEquals(NewMathLib.sin(angle7PI4), Math.sin(Math.toRadians(angle7PI4)), delta);

	}

	@Test
	public void sinTest16() {
		assertEquals(NewMathLib.sin(angle11PI6), Math.sin(Math.toRadians(angle11PI6)), delta);
	}

}
