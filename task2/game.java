import java.util.Scanner;
import java.util.Random;
public class game {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int Total = 0;
        int rounds = 2;
        System.out.println("------Welcome to the Number Guessing Game------");
        System.out.println("You have " + rounds + " rounds to play");
        System.out.println("1-2 attempts = 10 Points");
        System.out.println("3-4 attempts = 7 Points");
        System.out.println("5 attempts = 5 Points");
        System.out.println("If you fail = 2 Points");
        System.out.println("------------------------------------------------");
        for (int round = 1; round <= rounds; round++) {
            int numberToGuess = r.nextInt(100) + 1;
            int attempt = 0;
            int maxAttempts = 5;
            boolean guessed = false;
            System.out.println("\nRound " + round + " begins !");
            System.out.println("I have chosen a number between 1 to 100");
            System.out.println("You have " + maxAttempts + " attempts ");
            while (attempt < maxAttempts) {
                System.out.print("Enter your guess: ");
                int Guess = in.nextInt();
                if (Guess < 1 || Guess > 100) {
                    System.out.print("Invalid input! ");
                    continue;
                }
                attempt++;
                if (Guess < numberToGuess) {
                    System.out.println("Too Low! TRY AGAIN ");
                } else if (Guess > numberToGuess) {
                    System.out.println("Too High! TRY AGAIN ");
                } else {
                    System.out.println("Congratulation! You guessed the number " + numberToGuess + " in " + attempt + " attempts.");
                    guessed = true;
                    if (attempt <= 2) {
                        Total += 10;
                    } else if (attempt <= 4) {
                        Total += 7;
                    } else if (attempt == 5) {
                        Total += 5;
                    }
                    break;
                }
            }
            if (!guessed) {
                System.out.println("OUT OF ATTEMPTS! \n The number was " + numberToGuess);
                Total += 2;
            }
            System.out.println("Your score after Round " + round + " = " + Total);
        }
        System.out.print("\n Game Over! Your Final Score is =  " + Total);
        in.close();
    }
}