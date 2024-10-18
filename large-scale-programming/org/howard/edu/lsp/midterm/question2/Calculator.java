public class Calculator {

    /**
     * Adding integers
     * 
     * @param firstNum The first integer to sum.
     * @param secondNum The second integer to sum.
     * @return The sum of the two integers.
     */
    public static int sum(int firstNum, int secondNum) {
        return addIntegers(firstNum, secondNum);
    }

    /**
     *  method to add two integers.
     * 
     * @param x The first integer.
     * @param y The second integer.
     * @return The sum of the two integers.
     */
    private static int addIntegers(int x, int y) {
        if (x == 0) {
            return y;
        } else if (y == 0) {
            return x;
        } else {
            return x + y;
        }
    }

    /**
     * Sums two double values.
     * 
     * @param firstNum The first double value to sum.
     * @param secondNum The second double value to sum.
     * @return The sum of the two double values.
     */
    public static double sum(double firstNum, double secondNum) {
        if (Double.isNaN(firstNum) || Double.isNaN(secondNum)) {
            throw new IllegalArgumentException("Invalid Input.");
        }

        return addDoubles(firstNum, secondNum);
    }

    /**
     * Add two double values.
     * 
     * @param x The first double value.
     * @param y The second double value.
     * @return The sum of the two double values.
     */
    private static double addDoubles(double x, double y) {
        return x + y;
    }

    /**
     * Sums all the elements of an integer array.
     * 
     * @param numbers array of integers to sum.
     * @return  sum of all integers in the array.
     */
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int total = 0;
        for (int n = 0; n < numbers.length; n++) {
            total += numbers[n];
        }

        return total;
    }
}
