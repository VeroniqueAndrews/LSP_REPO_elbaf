package org.howard.edu.lsp.finalexam.question2;

import java.util.Scanner;

/**
 * Client program to demonstrate the usage of RandomNumberService with runtime selection.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a random number generator:");
        System.out.println("1. Built-in Random Number Generator");
        System.out.println("2. Custom Random Number Generator");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                service.setStrategy(new BuiltInRandomStrategy());
                break;
            case 2:
                service.setStrategy(new CustomRandomStrategy());
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
                scanner.close();
                return;
        }

        int randomNumber = service.generateNumber();
        System.out.println("Generated Random Number: " + randomNumber);

        scanner.close();
    }
}
