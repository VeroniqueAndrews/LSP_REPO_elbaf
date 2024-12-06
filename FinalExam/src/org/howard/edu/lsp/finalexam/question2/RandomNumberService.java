package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service for generating random numbers using configurable strategies.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    // Private constructor to enforce Singleton
    private RandomNumberService() {}

    /**
     * Retrieves the Singleton instance of RandomNumberService.
     * 
     * @return the Singleton instance
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy to use for random number generation.
     * 
     * @param strategy the random number strategy
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the currently configured strategy.
     * 
     * @return a random positive integer
     * @throws IllegalStateException if no strategy is set
     */
    public int generateNumber() {
        if (strategy == null) {
            throw new IllegalStateException("No RandomNumberStrategy is set.");
        }
        return strategy.generate();
    }
}

