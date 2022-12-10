package Q2;

// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: December 2022
// Purpose 			: Lab Exercise 9

public class RoadVehicle implements ImportDuty
{
    private int wheels;
    private int passengers;

    public RoadVehicle(int w, int p, double CARTAXRATE, double HGVRATE)
    {
        super();
        setWheels(w);
        setPass(p);
    }

    public void setWheels(int num)
    {
        wheels = num;
    }

    public int getWheels()
    {
        return wheels;
    }

    public void setPass( int num)
    {
        passengers = num;
    }

    public int getPass()
    {
        return passengers;
    }

    @Override
    public void calculateDuty(double CARTAXRATE, double HGVRATE) {

    }
}

