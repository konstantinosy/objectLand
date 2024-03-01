package Week01.Exercises;

import java.util.Arrays; // Import Arrays to sort the array.
import java.util.Random; // Import Random to generate random values for the array.

public class Exercise02 {
    public static void main(String[] args) {

        int[] values = new int[10]; // Define an empty array of 10 integers.

        Random rnd = new Random(); // Define the random object.

        for (int i = 0; i < 10; i++) { // Create a loop that runs 10 times.
            int randomNumber = rnd.nextInt(100); // Generate a random number 0 - 100.
            values[i] = randomNumber; // Assign each random number to the appropriate index by using i.
        }

        Arrays.sort(values); // Sort the array.

        int summation = 0; // Sum of the array.
        for (int x : values) { // Iterate the array.
            summation += x; // Add the values together.
        }

        System.out.println("List summation: " + summation); // Print the sum.
        System.out.println("Min value is " + values[0] + " and max is " + values[values.length - 1]); // Print min/max values.
        System.out.println("Average value is: " + summation / values.length); // Calculates the average.
    }
}