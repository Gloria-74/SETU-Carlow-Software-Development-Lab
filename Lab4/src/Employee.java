// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 4

import java.time.LocalDate;

public class Employee {

    private int empId; // unique number starting at 1000
    private static int nextId = 1000;
    private String fname;
    private String lname;
    private LocalDate bdate;

    Address address;

    //Constructor

    public Employee() {
        nextId++;
        setEmpId(nextId);
    }

    public Employee(String fname, String lname, LocalDate bdate, Address address) {
        nextId++;
        setEmpId(nextId);
        this.fname = fname;
        this.lname = lname;
        this.bdate = bdate;
        this.address = address;
    }

    // Getter & Setter

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // toString()

    @Override
    public String toString() {
        return "Employee {" +
                "empId= " + empId +
                ", fname= '" + fname + '\'' +
                ", lname= '" + lname + '\'' +
                ", bdate= '" + bdate + '\'' +
                ", address= " + address +
                '}';
    }
}

// maximal 5 MA-Datensätze, automatisch generierte MA-Nummer beginnend bei 1000
// employee type "Staff" oder "Manager" -> wenn "Manager" dann zusätzlich Firmenauto Details
// employees müssen in ein Office eingetragen sein (max 2 pro office)
// Methode um die Anzahl der MA zurückzugeben

// property if Manager (boolean) - nicht nullable - true ist manager, false ist staff
// set firmenauto - 1) abfrage ob manager, 2) wenn ja dann set firmenauto,3) wenn nicht throw error