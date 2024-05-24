package Task2;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a Random object to generate a random number
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;  // Generates a number between 1 and 100
        int guess = 0;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Loop until the user guesses the correct number
        while (guess != randomNumber) {
            // Prompt the user to enter their guess
            System.out.print("Enter your guess: ");
            try {
                guess = scanner.nextInt();
                attempts++;

                // Provide feedback to the user
                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number.");
                    System.out.println("It took you " + attempts + " attempts to guess the number.");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                scanner.next();  // Clear the invalid input
            }
        }

        scanner.close();
    }
}
