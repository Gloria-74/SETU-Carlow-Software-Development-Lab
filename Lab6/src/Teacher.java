// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 6

import java.util.Arrays;

public class Teacher extends Person{

    private int numCourses;
    private String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {

        return false;
    }

    public boolean removeCourse(String course) {

        return false;
    }

    @Override
    public String toString() {
        return "Teacher: " +
                getName() +
                getAddress() +
                ' ';
    }
}
