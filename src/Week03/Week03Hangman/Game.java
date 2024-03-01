// Game.java is not my work. I just have it here to use it as a reference.
// Credits: https://github.com/gprok-esc-courses/oop-java-1/blob/main/src/hangman_v1/Game.java .
package Week03.Week03Hangman;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        User user;
        Hangman hangman = new Hangman();

        Scanner input = new Scanner(System.in);
        System.out.print("Give your name: ");
        String name = input.next();
        user = new User(name);

        do {
            hangman.newGame();
            do {
                System.out.println(hangman.getSecretWord());
                System.out.print("Guess: ");
                String guess = input.next();
                hangman.play(guess);
                if (hangman.isFound()) {
                    System.out.println("FOUND :)");
                    user.found();
                    break;
                } else if (hangman.isHanged()) {
                    System.out.println("HANGED :(");
                    user.hanged();
                    break;
                }
            } while (true);
            System.out.print("Play again? (y/n) ");
            String answer = input.next();
            if (answer.equals("n")) {
                break;
            }
        } while (true);

        System.out.println(user.getFinalScore());
    }
}