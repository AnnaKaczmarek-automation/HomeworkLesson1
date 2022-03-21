import java.util.Random;
import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);
        System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Guess one random number in range of 0 to 100 :");

        for (int i = 0; i < 5; i++) {
            int usersGuess = scanner.nextInt();
            System.out.println("You've chosen: " + usersGuess);

            if (usersGuess == numberToGuess) {
                System.out.println("You guessed it!");
                break;
            }

            if (usersGuess > numberToGuess) {
                System.out.println("Your number is GREATER than the one you are trying to guess");
            }

            int leftChances = 4 - i;
            System.out.println("You still have " + leftChances + " chances");
            if (leftChances > 0) {
                System.out.println("Please try again");
            } else {
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                break;
            }
        }
    }

}
