package trigonometric;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNewMathLib {

	/**
	 * This variable limits the floating point value check of expected and actual result 
	 */
	double delta = 0.001;
	
	/**
	 * This variables are used to check different positive and negative angles for sin, cos and tan function
	 */
	double angle1 = 0, angle2 = 90, angle3 = -90, angle4 = 180, angle5 = -180, angle6 = 270, angle7 = -270;
	double angle8 = 30, angle9 = -30, angle10 = 45, angle11 = -45, angle12 = 60, angle13 = -60;

	@Test
	public void cosTest1() {
		assertEquals(NewMathLib.cosFunction(angle1), (Math.cos(toRadians(angle1))), delta);
	}
	
	public static double toRadians(double degree) {
		return (degree*3.14)/180;
	}

}
