/*
NamesList.java is not my work. I just have it here to use it as a reference. Credits:
https://github.com/gprok-esc-courses/oop-java-1/blob/main/src/bank/NamesList.java .
*/
package Week04;

import com.github.javafaker.Faker;

import java.util.ArrayList;

/*
Create a list of NAMES that can expand or shrink.
We do not want an array!
 */
public class NamesListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 0; i < 50; i++) {
            names.add(faker.address().firstName() + " "
                    + faker.address().lastName());
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}