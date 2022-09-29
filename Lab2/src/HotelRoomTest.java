// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: September 2022
// Purpose 			: Lab Exercise 2

public class HotelRoomTest {
    public static void main(String args[]) {

        HotelRoom roomA = new HotelRoom(200, "Single",100);
        HotelRoom roomB = new HotelRoom(201,"Double", 80);

        // Q1 print out the Room Info
        System.out.println("The room " + roomA.getRoomNumber() + " is from Type " + roomA.getRoomType());
        System.out.println("The room " + roomB.getRoomNumber() + " is from Type " + roomB.getRoomType());

        // Q2 print additional Room Info
        System.out.println("Room " + roomA.getRoomNumber() + " costs " + roomA.getRate() + " Euros");
        System.out.println("Room " + roomB.getRoomNumber() + " costs " + roomB.getRate() + " Euros");


    }
}
