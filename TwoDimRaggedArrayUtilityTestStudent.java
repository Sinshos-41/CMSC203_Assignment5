package ssawai_project5_complete;

/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: This class provides test cases for verifying TwoDimRaggedArrayUtility methods.
 * Due: 04/08/2025
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Sinsho Sawai
 */

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilityTestStudent {

	private double[][] dataSet;

	@Before
	public void setUp() throws Exception {
		dataSet = new double[][] {{1, 2, 3},{4, 5},{6, 7, 8, 9}};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getTotal() {
		assertEquals(45.0, TwoDimRaggedArrayUtility.getTotal(dataSet), 0.001);
	}

	@Test
	public void getAverage() {
		assertEquals(5.0, TwoDimRaggedArrayUtility.getAverage(dataSet), 0.001);
	}

	@Test
	public void rowTotal() {
		assertEquals(6.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet, 0), 0.001);
		assertEquals(9.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet, 1), 0.001);
		assertEquals(30.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet, 2), 0.001);
	}

	@Test
	public void columnTotal() {
		assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet, 0), 0.001); 
		assertEquals(14.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet, 1), 0.001); 
		assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet, 2), 0.001); 
		assertEquals(9.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet, 3), 0.001);  
	}

	@Test
	public void highestInRow() {
		assertEquals(3.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet, 0), 0.001);
		assertEquals(5.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet, 1), 0.001);
		assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet, 2), 0.001);
	}

	@Test
	public void lowestInRow() {
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet, 0), 0.001);
		assertEquals(4.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet, 1), 0.001);
		assertEquals(6.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet, 2), 0.001);
	}

	@Test
	public void highestInColumn() {
		assertEquals(6.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet, 0), 0.001);
		assertEquals(7.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet, 1), 0.001);
		assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet, 2), 0.001);
		assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet, 3), 0.001);
	}

	@Test
	public void testGetLowestInColumn() {
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet, 0), 0.001);
		assertEquals(2.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet, 1), 0.001);
		assertEquals(3.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet, 2), 0.001);
		assertEquals(9.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet, 3), 0.001);
	}

	@Test
	public void highestInArray() {
		assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet), 0.001);
	}

	@Test
	public void lowestInArray() {
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet), 0.001);
	}
}
