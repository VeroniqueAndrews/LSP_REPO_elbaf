package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Built-in random number generation strategy using Java's Random class.
 */
public class BuiltInRandomStrategy implements RandomNumberStrategy {
    @Override
    public int generate() {
        Random random = new Random();
        return random.nextInt(1000) + 1; // Random number between 1 and 1000
    }
}
