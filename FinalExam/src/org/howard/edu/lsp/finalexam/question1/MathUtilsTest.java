package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testFactorial() {
        MathUtils utils = new MathUtils();

        // Test edge cases
        assertEquals(1, utils.factorial(0)); // 0! = 1
        assertEquals(1, utils.factorial(1)); // 1! = 1

        // Test common case
        assertEquals(120, utils.factorial(5)); // 5! = 120

        // Test error handling
        assertThrows(IllegalArgumentException.class, () -> utils.factorial(-1));
    }

    @Test
    public void testIsPrime() {
        MathUtils utils = new MathUtils();

        // Test edge cases
        assertFalse(utils.isPrime(0)); // Not prime
        assertFalse(utils.isPrime(1)); // Not prime
        assertTrue(utils.isPrime(2)); // Smallest prime number

        // Test regular cases
        assertTrue(utils.isPrime(13)); // Prime number
        assertFalse(utils.isPrime(4)); // Composite number
        
        // Test large composites
        assertFalse(utils.isPrime(200)); // Composite
        assertFalse(utils.isPrime(100)); // Composite
        
        // Test negative numbers
        assertFalse(utils.isPrime(-1)); // Negative numbers are not prime
        assertFalse(utils.isPrime(-7)); // Negative would-be prime number
        assertFalse(utils.isPrime(-10)); // Negative composite number
    }

    @Test
    public void testGcd() {
        MathUtils utils = new MathUtils();

        // Test edge cases
        assertEquals(10, utils.gcd(10, 0)); // gcd(10, 0) = 10
        assertEquals(10, utils.gcd(0, 10)); // gcd(0, 10) = 10

        // Test regular cases
        assertEquals(5, utils.gcd(15, 10)); // gcd(15, 10) = 5
        assertEquals(1, utils.gcd(17, 13)); // gcd(17, 13) = 1
        
        //Test negative numsber
        assertEquals(10, utils.gcd(-10, 20)); // Absolute values: gcd(10, 20) = 10
        assertEquals(15, utils.gcd(-45, -15)); // Absolute values: gcd(45, 15) = 15

        // Test error handling
        assertThrows(IllegalArgumentException.class, () -> utils.gcd(0, 0));
    }
}
