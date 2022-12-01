// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 8

package Person;

public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    abstract String getName();

    public void setName(String name) {
        this.name = name;
    }

    abstract String getDescription();

    @Override
    public String toString() {
        return "Person {" +
                "name = '" + name + '\'' +
                '}';
    }
}
