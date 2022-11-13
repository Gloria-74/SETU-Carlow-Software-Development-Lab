// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 4

public class MyHRTest {
// Scanner?
    public static void main(String[] args) {
        Address address1 = new Address("Samplestreet", "Carlow", "Carlow");
        Address address2 = new Address("Sampleroad", "Waterford", "Waterford");

        Employee employee1 = new Employee("Anna", "Muster", , address1);
        Employee employee2 = new Employee("Max", "Moore", , address2);
        Employee employee3 = new Employee("Marie", "Moore", , address2);

        Office office1 = new Office(employee1);
        Office office2 = new Office(employee3);
        office1.getEmployee2(employee2);

        System.out.println(address1);
        System.out.println(address2);

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println(office1);
        System.out.println(office2);
    }

}
