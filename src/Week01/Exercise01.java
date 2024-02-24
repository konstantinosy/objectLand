package Week01;

// Import Scanner to accept input afterward.
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Initialize the scanner.
        System.out.println("Enter how many asterisks you want to print!: "); // Print an appropriate message.
        int numOfAsterisks = in.nextInt(); // Accept input.
        System.out.println("*".repeat(numOfAsterisks)); // Print the selected amount of asterisks.
    }
}