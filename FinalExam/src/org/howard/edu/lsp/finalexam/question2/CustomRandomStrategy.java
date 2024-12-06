package org.howard.edu.lsp.finalexam.question2;

/**
 * Custom random number generation strategy using a simple linear congruential generator.
 */
public class CustomRandomStrategy implements RandomNumberStrategy {
    private long seed = System.nanoTime();

    @Override
    public int generate() {
        long a = 1664525; // Multiplier
        long c = 1013904223; // Increment
        long m = (1L << 32); // Modulus (2^32)
        seed = (a * seed + c) % m;
        return (int) (seed % 1000) + 1; // Random number between 1 and 1000
    }
}
