// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 6

import java.util.Arrays;

public class Student extends Person {

    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);
    }

    public void addCourseGrade(String course, int grade){

    }

    public void printGrades() {
        System.out.println(grades);
    }

    public double getAverageGrade() {
        double sum = 0.0;
        double avg = 0.0;

        try
        {
            for(int i = 0; i < grades.length; i++) {
                sum = sum + grades[i];
            }
            avg = sum / grades.length;
        } catch (NullPointerException e) {

        }

        return 0;
    }

    @Override
    public String toString() {
        return "Student: " +
                getName() +
                "(" + getAddress() +
                ") " +
                "courses = " + Arrays.toString(courses) +
                " grades = " + Arrays.toString(grades) +
                ' ';
    }
}
