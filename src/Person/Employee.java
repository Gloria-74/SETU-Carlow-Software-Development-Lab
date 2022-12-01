// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 8

package Person;

public class Employee extends Person {

    private double annualSalary;

    public Employee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    String getDescription() {
        return "an employee with a salary of " + annualSalary + " EUR";
    }

    @Override
    public String toString() {
        return "Employee {" +
                "annualSalary = " + annualSalary +
                " EUR, name = " + name + '\'' +
                '}';
    }
}
