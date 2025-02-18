import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {

                Random rand = new Random();
                int randomNumber = rand.nextInt(10) + 1;
                Scanner in = new Scanner(System.in);
                int guess = 0;
                boolean done = false;

                do {
                    System.out.print("Guess the number (1-10): ");
                    if (in.hasNextInt()) {
                        guess = in.nextInt();
                        in.nextLine();
                        if (guess >= 1 && guess <= 10) {
                            done = true;
                        } else {
                            System.out.println("Invalid input. Please enter a number between 1 and 10.");
                        }
                    } else {
                        String trash = in.nextLine();
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                } while (!done);

                System.out.println("The random number was: " + randomNumber);
                if (guess == randomNumber) {
                    System.out.println("You guessed it right!");
                } else if (guess < randomNumber) {
                    System.out.println("Your guess was too low.");
                } else {
                    System.out.println("Your guess was too high.");
                }
            }
        }

