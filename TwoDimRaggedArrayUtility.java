package ssawai_project5_complete;
/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: This class provides a set of static methods to perform
 * common operations on two-dimensional ragged arrays of doubles. These methods are
 * used to support data handling and analysis for applications like sales reporting.
 * Due: 04/08/2025
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Sinsho Sawai
*/

import java.io.*;
import java.util.*;

public class TwoDimRaggedArrayUtility {

    /*
     * Reads a file containing space-separated numbers and returns a 2D ragged array.
     * Each line in the file becomes a row in the array.
     */
    public static double[][] readFile(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        ArrayList<double[]> rows = new ArrayList<>();

        while (input.hasNextLine()) {
            String line = input.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] tokens = line.split(" ");
            double[] row = new double[tokens.length];

            for (int i = 0; i < tokens.length; i++) {
                row[i] = Double.parseDouble(tokens[i]);
            }

            rows.add(row);
        }

        input.close();
        return rows.toArray(new double[rows.size()][]);
    }

    /*
     * Writes a 2D ragged array of doubles to a file.
     * Each row is written on a new line, with space-separated values.
     */
    public static void writeToFile(double[][] data, File file) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(file)) {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    writer.print(data[i][j]);
                    if (j < data[i].length - 1) writer.print(" ");
                }
                writer.println();
            }
        }
    }

   
    //Returns the total sum of all elements in the 2D ragged array.
    public static double getTotal(double[][] data) {
        double total = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
        }
        return total;
    }

    
     //Returns the average (mean) value of all elements in the 2D ragged array.
    public static double getAverage(double[][] data) {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            count += data[i].length;
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
        }
        return count == 0 ? 0 : sum / count;
    }
    
     //Returns the total of the elements in a specified row.
    public static double getRowTotal(double[][] data, int row) {
        double total = 0;
        for (int i = 0; i < data[row].length; i++) {
            total += data[row][i];
        }
        return total;
    }

    /*
     * Returns the total of the elements in a specified column.
     * Skips rows that do not contain the specified column index.
     */
    public static double getColumnTotal(double[][] data, int col) {
        double total = 0;
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length) {
                total += data[i][col];
            }
        }
        return total;
    }

   
    //Returns the highest value in a specified row.
    public static double getHighestInRow(double[][] data, int row) {
        double max = data[row][0];
        for (int i = 1; i < data[row].length; i++) {
            if (data[row][i] > max) {
                max = data[row][i];
            }
        }
        return max;
    }


    //Returns the index of the highest value in a specified row.
    public static int getHighestInRowIndex(double[][] data, int row) {
        int index = 0;
        for (int i = 1; i < data[row].length; i++) {
            if (data[row][i] > data[row][index]) {
                index = i;
            }
        }
        return index;
    }


    //Returns the lowest value in a specified row.
    public static double getLowestInRow(double[][] data, int row) {
        double min = data[row][0];
        for (int i = 1; i < data[row].length; i++) {
            if (data[row][i] < min) {
                min = data[row][i];
            }
        }
        return min;
    }


    //Returns the index of the lowest value in a specified row.
    public static int getLowestInRowIndex(double[][] data, int row) {
        int index = 0;
        for (int i = 1; i < data[row].length; i++) {
            if (data[row][i] < data[row][index]) {
                index = i;
            }
        }
        return index;
    }

    /*
     * Returns the highest value in a specified column.
     * Skips rows that do not contain the specified column index.
     */
    public static double getHighestInColumn(double[][] data, int col) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] > max) {
                max = data[i][col];
            }
        }
        return max;
    }


     //Returns the row index of the highest value in a specified column.
    public static int getHighestInColumnIndex(double[][] data, int col) {
        double max = Double.NEGATIVE_INFINITY;
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] > max) {
                max = data[i][col];
                index = i;
            }
        }
        return index;
    }

    /*
     * Returns the lowest value in a specified column.
     * Skips rows that do not contain the specified column index.
     */
    public static double getLowestInColumn(double[][] data, int col) {
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] < min) {
                min = data[i][col];
            }
        }
        return min;
    }


    //Returns the row index of the lowest value in a specified column.
    public static int getLowestInColumnIndex(double[][] data, int col) {
        double min = Double.POSITIVE_INFINITY;
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] < min) {
                min = data[i][col];
                index = i;
            }
        }
        return index;
    }


    //Returns the highest value in the entire 2D ragged array.
    public static double getHighestInArray(double[][] data) {
        double max = data[0][0];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
        }
        return max;
    }


    //Returns the lowest value in the entire 2D ragged array.
    public static double getLowestInArray(double[][] data) {
        double min = data[0][0];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] < min) {
                    min = data[i][j];
                }
            }
        }
        return min;
    }
}