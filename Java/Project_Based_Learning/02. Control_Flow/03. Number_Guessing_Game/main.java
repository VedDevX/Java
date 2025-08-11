import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1; // 1 to 100
        int totalGuesses = 10;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + totalGuesses + " attempts to guess the number between 1 and 100.");

        for (int i = totalGuesses; i > 0; i--) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == target) {
                System.out.println("Congratulations! You guessed it right!");
                System.out.println("You guessed the number with " + (totalGuesses - i + 1) + " attempt(s).");
                guessedCorrectly = true;
                break;
            } else if (guess > target) {
                System.out.println("Your guess is too high! Try a lower number.");
            } else {
                System.out.println("Your guess is too low! Try a higher number.");
            }

            System.out.println("You have " + (i - 1) + " guess(es) left.\n");
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry! You’ve used all your guesses.");
            System.out.println("The number was: " + target);
        }

        scanner.close();
    }
}
