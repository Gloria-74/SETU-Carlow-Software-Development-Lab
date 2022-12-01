// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 8

package Person;

public class TestPerson {
    public static void main(String[] args) {

        Person[] person = new Person[2];

        person[0] = new Employee("Markus Maier", 40000.00);
        person[1] = new Student("Maggy Moore", "Software Development");

        System.out.println(person[0].toString());
        System.out.println(person[1].toString());

        System.out.println(person[0].getName() + " is " + person[0].getDescription());
        System.out.println(person[1].getName() + " is " + person[1].getDescription());
    }
}
