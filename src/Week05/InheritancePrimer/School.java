// School.java is not my work. I just have it here to use it as a reference.
// Credits: https://github.com/gprok-esc-courses/oop-java-1/blob/main/src/inheritance_primer/School.java .
package Week05.InheritancePrimer;

public class School {
    public static void main(String[] args) {
        Student s = new Student(1, "Mike",
                "mike@school.test", "Computing");
        Instructor i = new Instructor(2, "John",
                "john@instr.school.test");

        Person p = s;
        System.out.println(p);
        p = i;
        System.out.println(p);
    }
}
