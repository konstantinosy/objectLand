// Student.java is not my work. I just have it here to use it as a reference.
// Credits: https://github.com/gprok-esc-courses/oop-java-1/blob/main/src/inheritance_primer/Student.java .
package Week05.InheritancePrimer;

public class Student extends Person {
    private String major;

    public Student(int id, String name, String email, String major) {
        super(id, name, email);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "STUDENT: " + name;
    }
}
