package Week01;

import java.util.Random;
import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        Random rnd = new Random();

        int userChoice; // Init a variable to use it to compare to the computer's choice.
        int computerScore = 0; // Computer's score.
        int userScore = 0; // Player's score.

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the Rock-Paper-Scissors game.");
        System.out.println("Enter 'R' for rock, 'P' for paper and 'S' for scissors.");

        do { // Init do while loop until either the player or the computer reaches a score of 20.
            int computerChoice = rnd.nextInt(3); // Gen random num ranging from zero (0) to two (2).
            System.out.print("Type your choice: ");
            String userInput = in.next(); // Input is made by the user.
            switch (userInput) { // A switch is defined to handle all the possible cases.
                case "R": // Player chooses Rock.
                    userChoice = 0;
                    if (userChoice == computerChoice) {
                        System.out.println("Computer chose the same. It's a tie.");
                    } else if (computerChoice == 1) {
                        System.out.println("Computer chose Paper. You lost.");
                        computerScore += 1; // Update the score.
                    } else {
                        System.out.println("Computer chose Scissors. You won.");
                        userScore += 1; // Update the score.
                    }
                    break;
                case "P": // Player chooses Paper.
                    userChoice = 1;
                    if (userChoice == computerChoice) {
                        System.out.println("Computer chose the same. It's a tie.");
                    } else if (computerChoice == 0) {
                        System.out.println("Computer chose Rock. You won.");
                        userScore += 1; // Update the score.
                    } else {
                        System.out.println("Computer chose Scissors. You lost.");
                        computerScore += 1; // Update the score.
                    }
                    break;
                case "S": // Player chooses Scissors.
                    userChoice = 2;
                    if (userChoice == computerChoice) {
                        System.out.println("Computer chose the same. It's a tie!");
                    } else if (computerChoice == 1) {
                        System.out.println("Computer chose Paper. You win.");
                        userScore += 1; // Update the score.
                    } else {
                        System.out.println("Computer chose Rock. You lose.");
                        computerScore += 1; // Update the score.
                    }
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
            System.out.println("Your score: " + userScore + " Computer score: " + computerScore);
        } while (userScore < 20 && computerScore < 20); // If one of the two reaches twenty the loop breaks.

        if (userScore == 20) {
            System.out.println("You won the game!");
        } else {
            System.out.println("You lost the game.");
        }
    }
}
