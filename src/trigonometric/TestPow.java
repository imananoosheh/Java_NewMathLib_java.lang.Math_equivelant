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
public class TestPow {
	
	double delta = 0.0001;
	
	@Test
	public void powTest1() {
		assertEquals(NewMathLib.pow(-2, 10), Math.pow(-2, 10), delta);

	}
	public void powTest2() {
		assertEquals(NewMathLib.pow(-2, -10), Math.pow(-2, -10), delta);

	}
	public void powTest3() {
		assertEquals(NewMathLib.pow(2, -10), Math.pow(2, -10), delta);

	}
	public void powTest4() {
		assertEquals(NewMathLib.pow(-2, -10), Math.pow(-2, -10), delta);

	}
	public void powTest5() {
		assertEquals(NewMathLib.pow(2, 100), Math.pow(2, 100), delta);
	}

}
