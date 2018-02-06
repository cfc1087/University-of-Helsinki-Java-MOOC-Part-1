
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guess = 0;
        int guesses = 0;
        do {
            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());

            if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + ++guesses);

            } else if (guess > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + ++guesses);
            }

        } while (guess != numberDrawn);
        System.out.println("Congratulations, your number is correct");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
