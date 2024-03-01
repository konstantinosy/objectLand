/*
This is not my work. I have it here as a reference.
Credits: https://github.com/gprok-esc-courses/oop-java-1/blob/main/src/Test.java .
 */

package Week01.Examples;

public class Introduction {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int a = 5;
        double d = 6.45;
        boolean b = false;
        char c = 'A'; //Characters are with single quotes.
        String s = "This is a string"; // Strings are with double quotes.

        int[] arr = new int[10];
        arr[0] = 78;
        arr[1] = 109;

        if (a == 5) {
            System.out.println("a is 5");
        } else if (a < 5) {
            System.out.println("a less than 5");
        } else {
            System.out.println("a greater than 5");
        }

        // and is &&, or is || and not is !=.
        if (a == 5 && c == 'A') {
        }

        a = 1;
        switch (a) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("More than 3");
                break;
        }

        // For loop parts(3): 1): Init, 2): Termination/Condition, 3): Increment/Decrement.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // While loop.
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // Do-while loop.
        i = 0;
        do {
            System.out.println(i);
        } while (i < 10);

        // For-each loop. Example with an array.
        String[] names = {"John", "Ann", "Peter", "Mike", "Mary"};

        for (String name : names) {
            System.out.println(name);
        }
    }
}