// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 6

public class Person {

    private String name;
    private String address;

    // Constructors
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    //toString
    public String toString() {
        return name + "(" + address + ")";
    }
}
