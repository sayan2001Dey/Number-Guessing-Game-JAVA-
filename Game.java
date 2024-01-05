import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int points = 0;

        while (true) {
            playGame(sc);
            System.out.println("Do you want to play again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Your total points: " + points);
                break;
            }
        }
    }

    private static void playGame(Scanner sc) {
        Random r = new Random();
        int random = r.nextInt(10) + 1;

        int chance = 3;
        int points = 0;

        System.out.println("Welcome to Number Guessing Game");
        System.out.println("Guess a number Between 1 and 10");

        while (chance > 0) {
            System.out.println("Attempts left:-" + chance);
            System.out.println("Enter Your Guess:-");
            int input = sc.nextInt();

            if (random == input) {
                System.out.println("Congratulations! You guessed the right number.");
                points = points + 10;
                random = r.nextInt(10) + 1; // Generate a new random number
                break;
            } else {
                System.out.println("Sorry Wrong Guess Try Again!");
                chance--;

                if (chance == 0) {
                    System.out.println("Hint: The correct number was " + random);
                }
            }
        }

        System.out.println("Game Over!");
        System.out.println("Your total points: " + points);
    }
}
