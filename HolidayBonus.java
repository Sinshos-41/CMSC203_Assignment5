package ssawai_project5_complete;
/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: The `HolidayBonus` class provides utility methods to calculate holiday bonuses
 * for retail stores based on their sales performance across multiple categories.
 * Due: 04/08/2025
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Sinsho Sawai
*/

public class HolidayBonus {
    public static double[] calculateHolidayBonus(double[][] data) {
        double[] bonuses = new double[data.length];
        double highest = Double.NEGATIVE_INFINITY;
        double lowest = Double.POSITIVE_INFINITY;
        int highIndex = -1;
        int lowIndex = -1;
        int maxColumns = 0;

        //Find the maximum number of columns
        for (int i = 0; i < data.length; i++) {
            if (data[i].length > maxColumns) {
                maxColumns = data[i].length;
            }
        }

        //Loop through each column (category)
        for (int col = 0; col < maxColumns; col++) {

            //Find the highest and lowest valid sales in this column
            for (int row = 0; row < data.length; row++) {
                if (col < data[row].length && data[row][col] >= 0) {
                    double value = data[row][col];

                    if (value > highest) {
                        highest = value;
                        highIndex = row;
                    }
                    if (value < lowest) {
                        lowest = value;
                        lowIndex = row;
                    }
                }
            }

            //If there's only one valid store in the column
            if (highIndex != -1 && highIndex == lowIndex) {
                bonuses[highIndex] += 5000.0;
            }

            //Assign bonuses to each eligible store
            for (int row = 0; row < data.length; row++) {
                if (col < data[row].length && data[row][col] >= 0) {
                    if (row == highIndex) {
                        bonuses[row] += 5000.0;
                    } else if (row == lowIndex) {
                        bonuses[row] += 1000.0;
                    } else {
                        bonuses[row] += 2000.0;
                    }
                }
            }
        }
        return bonuses;
    }


    public static double calculateTotalHolidayBonus(double[][] data) {
        double total = 0;
        double[] bonuses = calculateHolidayBonus(data);
        for (int i = 0; i < bonuses.length; i++) {
            total += bonuses[i];
        }
        return total;
    }
}

