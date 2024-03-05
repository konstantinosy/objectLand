package Week05.Exercises;

import java.util.Scanner;

/*
Ternary operator.
It is used to mainly replace if-else statements to replace multiple lines of code.
It is made up of three operands.
 */
public class TernaryExample {
    public static void main(String[] args) {
        // Change the true to false and vice versa to see how it works!
        boolean statement = true; // Define variable named statement to true.
        String result = (statement) ? "Statement is true :)" : "Statement is false :("; // Ternary syntax example.
        System.out.println(result); // Returns the first piece of text since statement is true.

        Scanner in = new Scanner(System.in); // Init the scanner.
        System.out.print("Enter number: ");
        int number = in.nextInt(); // Input
        String resultTwo = (number > 0) ? "Number is positive :)" : "Number is negative :("; // Ternary operation.
        System.out.println(resultTwo); // Informs whether the number is positive or not. Although it does not take into account zero(0).
    }
}
