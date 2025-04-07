package ssawai_project5_complete;
/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: This class verifies the correctness of selected utility methods used to process two-dimensional ragged arrays of doubles. 
 * The included test case confirms that the getRowTotal() method returns the correct sum of values for a specified row in the data array.
 * Due: 04/08/2025
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Sinsho Sawai
*/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TwoDimRaggedArrayUtilityGFATest {
	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8,9}};
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test getRowTotal method
	 * Returns the total of all the elements of row 1.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
	}
}
