// Person.java is not my work. I just have it here to use it as a reference.
// Credits: https://github.com/gprok-esc-courses/oop-java-1/blob/main/src/inheritance_primer/Person.java .
package Week05.InheritancePrimer;

public class Person {
    protected int id;
    protected String name;
    protected String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PERSON: " + name;
    }
}
