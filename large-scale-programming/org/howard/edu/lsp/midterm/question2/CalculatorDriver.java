public class CalculatorDriver {

    public static void main(String[] args) {
        System.out.println("Sum of two integers (5 + 10): " + Calculator.sum(5, 10)); // Output: 15
        System.out.println("Sum of two doubles (3.5 + 7.8): " + Calculator.sum(3.5, 7.8)); // Output: 11.3
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of an array of integers: " + Calculator.sum(numbers)); // Output: 15
        int[] emptyArray = {};
        System.out.println("Sum of an empty array: " + Calculator.sum(emptyArray)); // Output: 0
    }
}
