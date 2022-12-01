// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 8

package Person;

public class Student extends Person {

    private String course;

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    String getDescription() {
        return "a student studying " + course;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                ", course = '" + course + '\'' +
                '}';
    }
}
