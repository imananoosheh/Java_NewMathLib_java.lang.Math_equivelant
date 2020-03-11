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
public class TestTan {

	double delta = 10;
	
	double angle2PI = 0, anglePI6 = 30, anglePI4 = 45, anglePI3 = 60, anglePI2 = 90, angle2PI3 = 120, angle3PI4 = 135,
			angle5PI6 = 150, anglePI = 180, angle7PI6 = 210, angle5PI4 = 225, angle4PI3 = 240, angle3PI2 = 270,
			angle5PI3 = 300, angle7PI4 = 315, angle11PI6 = 330;
	
	@Test
	public void tanTest1() {
		assertEquals(NewMathLib.tan(angle2PI), Math.tan(Math.toRadians(angle2PI)), delta);

	}
	@Test
	public void tanTest2() {
		assertEquals(NewMathLib.tan(anglePI6), Math.tan(Math.toRadians(anglePI6)), delta);
	}
	@Test
	public void tanTest3() {
		assertEquals(NewMathLib.tan(anglePI4), Math.tan(Math.toRadians(anglePI4)), delta);
	}
	@Test
	public void tanTest4() {
		assertEquals(NewMathLib.tan(anglePI3), Math.tan(Math.toRadians(anglePI3)), delta);
	}
	@Test
	public void tanTest5() {
		assertEquals(NewMathLib.tan(anglePI2), Double.POSITIVE_INFINITY, delta);
	}
	@Test
	public void tanTest6() {
		assertEquals(NewMathLib.tan(angle2PI3), Math.tan(Math.toRadians(angle2PI3)), delta);
	}
	@Test
	public void tanTest7() {
		assertEquals(NewMathLib.tan(angle3PI4), Math.tan(Math.toRadians(angle3PI4)), delta);

	}
	@Test
	public void tanTest8() {
		assertEquals(NewMathLib.tan(angle5PI6), Math.tan(Math.toRadians(angle5PI6)), delta);

	}
	@Test
	public void tanTest9() {
		assertEquals(NewMathLib.tan(anglePI), Math.tan(Math.toRadians(anglePI)), delta);

	}
	@Test
	public void tanTest10() {
		assertEquals(NewMathLib.tan(angle7PI6), Math.tan(Math.toRadians(angle7PI6)), delta);

	}
	@Test
	public void tanTest11() {
		assertEquals(NewMathLib.tan(angle5PI4), Math.tan(Math.toRadians(angle5PI4)), delta);

	}
	@Test
	public void tanTest12() {
		assertEquals(NewMathLib.tan(angle4PI3), Math.tan(Math.toRadians(angle4PI3)), delta);

	}
	@Test
	public void tanTest13() {
		assertEquals(NewMathLib.tan(angle3PI2), Double.NEGATIVE_INFINITY, delta);

	}
	@Test
	public void tanTest14() {
		assertEquals(NewMathLib.tan(angle5PI3), Math.tan(Math.toRadians(angle5PI3)), delta);

	}
	@Test
	public void tanTest15() {
		assertEquals(NewMathLib.tan(angle7PI4), Math.tan(Math.toRadians(angle7PI4)), delta);

	}
	@Test
	public void tanTest16() {
		assertEquals(NewMathLib.tan(angle11PI6), Math.tan(Math.toRadians(angle11PI6)), delta);
	}
	
	
	
	
	
}
