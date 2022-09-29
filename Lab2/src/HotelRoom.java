// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: September 2022
// Purpose 			: Lab Exercise 2

public class HotelRoom {

    // Q1
    private int roomNumber;
    private String roomType;

    // Q2
    private double rate;
    private int vacant;
    private int occupied;

    // Constructor
    public HotelRoom(int roomNumber, String roomType, double rate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.rate = rate;
    }

    public HotelRoom(double rate) {
        this.rate = rate;
    }

    // Getter & Setter
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
