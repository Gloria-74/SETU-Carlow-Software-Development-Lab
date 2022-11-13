// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 4

public class Office {

    private int roomNr; // unique number starting at 100
    private static int nextRoom = 100; // statische Klassenvariable zum zuweisen der Raumnummer
    Employee employee;
    Employee employee2;
    //addEmployee

    // Constructor

    public Office() {
        setRoomNr(nextRoom++);
    }

    public Office(Employee employee) {
        setRoomNr(nextRoom++);
        this.employee = employee;
        this.employee2 = employee;
    }

    // Getter & Setter

    public int getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(int roomNr) {
        this.roomNr = roomNr;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee2(Employee employee2) {
        return this.employee2;
    }

    public void setEmployee2(Employee employee2) {
        this.employee2 = employee2;
    }
    // toString()

    @Override
    public String toString() {
        return "Office{" +
                "roomNr= " + roomNr +
                ", employee= " + employee +
                '}';
    }
}

// 3 automatisch initialisierte Bürodatensätze
// sie sollte auch eine Methode zur Rückgabe der Anzahl der ihr zugewiesenen Mitarbeiter enthalten
// sie sollte auch eine Methode enthalten, die den Datensatz jedes dem Büro zugewiesenen Mitarbeiters zurückgibt
