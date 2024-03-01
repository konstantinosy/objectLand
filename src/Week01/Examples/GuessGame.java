/*
This is not my work. I have it here as a reference.
Credits: https://github.com/gprok-esc-courses/oop-java-1/blob/main/src/introduction/GuessGame.java .
 */
package Week01.Examples;

//Import Random and Scanner for later usage.

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int secret;
        int guess;
        int counter = 0;

        // Generate secret number.
        Random rnd = new Random();
        secret = rnd.nextInt(100);

        // Initialize Scanner to read from the keyboard.
        Scanner in = new Scanner(System.in);

        // Do while loop until the secret is found.
        do {
            System.out.print("Guess: ");
            guess = in.nextInt();
            if (guess < secret) {
                System.out.println("Go UP.");
            } else if (guess > secret) {
                System.out.println("Go DOWN.");
            }
            counter++;
        } while (secret != guess);

        System.out.println("Found in " + counter + " guesses!");
    }
}