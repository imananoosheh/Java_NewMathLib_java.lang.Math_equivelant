/**
 * 
 */
package trigonometric;
import java.lang.Math;
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
public class TestCos {

	double delta = 0.0001;
	
	double angle2PI = 0, anglePI6 = 30, anglePI4 = 45, anglePI3 = 60, anglePI2 = 90, angle2PI3 = 120, angle3PI4 = 135,
			angle5PI6 = 150, anglePI = 180, angle7PI6 = 210, angle5PI4 = 225, angle4PI3 = 240, angle3PI2 = 270,
			angle5PI3 = 300, angle7PI4 = 315, angle11PI6 = 330;
	
	@Test
	public void cosTest1() {
		assertEquals(NewMathLib.cos(angle2PI), Math.cos(Math.toRadians(angle2PI)), delta);

	}
	@Test
	public void cosTest2() {
		assertEquals(NewMathLib.cos(anglePI6), Math.cos(Math.toRadians(anglePI6)), delta);
	}
	@Test
	public void cosTest3() {
		assertEquals(NewMathLib.cos(anglePI4), Math.cos(Math.toRadians(anglePI4)), delta);
	}
	@Test
	public void cosTest4() {
		assertEquals(NewMathLib.cos(anglePI3), Math.cos(Math.toRadians(anglePI3)), delta);
	}
	@Test
	public void cosTest5() {
		assertEquals(NewMathLib.cos(anglePI2), Math.cos(Math.toRadians(anglePI2)), delta);
	}
	@Test
	public void cosTest6() {
		assertEquals(NewMathLib.cos(angle2PI3), Math.cos(Math.toRadians(angle2PI3)), delta);
	}
	@Test
	public void cosTest7() {
		assertEquals(NewMathLib.cos(angle3PI4), Math.cos(Math.toRadians(angle3PI4)), delta);

	}
	@Test
	public void cosTest8() {
		assertEquals(NewMathLib.cos(angle5PI6), Math.cos(Math.toRadians(angle5PI6)), delta);

	}
	@Test
	public void cosTest9() {
		assertEquals(NewMathLib.cos(anglePI), Math.cos(Math.toRadians(anglePI)), delta);

	}
	@Test
	public void cosTest10() {
		assertEquals(NewMathLib.cos(angle7PI6), Math.cos(Math.toRadians(angle7PI6)), delta);

	}
	@Test
	public void cosTest11() {
		assertEquals(NewMathLib.cos(angle5PI4), Math.cos(Math.toRadians(angle5PI4)), delta);

	}
	@Test
	public void cosTest12() {
		assertEquals(NewMathLib.cos(angle4PI3), Math.cos(Math.toRadians(angle4PI3)), delta);

	}
	@Test
	public void cosTest13() {
		assertEquals(NewMathLib.cos(angle3PI2), Math.cos(Math.toRadians(angle3PI2)), delta);

	}
	@Test
	public void cosTest14() {
		assertEquals(NewMathLib.cos(angle5PI3), Math.cos(Math.toRadians(angle5PI3)), delta);

	}
	@Test
	public void cosTest15() {
		assertEquals(NewMathLib.cos(angle7PI4), Math.cos(Math.toRadians(angle7PI4)), delta);

	}
	@Test
	public void cosTest16() {
		assertEquals(NewMathLib.cos(angle11PI6), Math.cos(Math.toRadians(angle11PI6)), delta);
	}
	
	
	
	
	
}
