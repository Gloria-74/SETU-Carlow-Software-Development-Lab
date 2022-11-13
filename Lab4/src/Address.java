// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 4

public class Address {

    private String street;
    private String city;
    private String county;

    // Constructor

    public Address(String street, String city, String county) {
        this.street = street;
        this.city = city;
        this.county = county;
    }


    // toString()

    @Override
    public String toString() {
        return "Address: {" +
                "street= '" + street + '\'' +
                ", city= '" + city + '\'' +
                ", county= '" + county + '\'' +
                '}';
    }
}
