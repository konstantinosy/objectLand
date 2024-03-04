// Instructor.java is not my work. I just have it here to use it as a reference.
// Credits: https://github.com/gprok-esc-courses/oop-java-1/blob/main/src/inheritance_primer/Instructor.java .
package Week05.InheritancePrimer;

import java.util.ArrayList;

public class Instructor extends Person {

    ArrayList<String> courses;

    public Instructor(int id, String name, String email) {
        super(id, name, email);
        courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "INSTRUCTOR: " + name;
    }
}
