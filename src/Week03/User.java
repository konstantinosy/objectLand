// User.java is not my work. I just have it here to use it as a reference. Credits:
// https://github.com/gprok-esc-courses/oop-java-1/blob/main/src/hangman_v1/User.java .
package Week03;

public class User {
    private String name;
    private int found_times;
    private int hanged_times;

    public User(String name) {
        this.name = name;
        this.found_times = 0;
        this.hanged_times = 0;
    }

    public void hanged() {
        hanged_times++;
    }

    public void found() {
        found_times++;
    }

    public String getFinalScore() {
        return this.name + " Found: " + found_times + " Hanged: " + hanged_times;
    }
}