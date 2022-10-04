// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: September 2022
// Purpose 			: Lab Exercise 2

public class lab2ap3 {
    private int roomNumber;
    private String roomType;

    private double rate;
    private int occupied;

    // Q3


    public lab2ap3(int roomNumber, String roomType, double rate, int occupied) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.rate = rate;
        this.occupied = occupied;
    }

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

    public int getOccupied() {
        return occupied;
    }

    public void setOccupied(int occupied) {
        this.occupied = occupied;
    }
}
