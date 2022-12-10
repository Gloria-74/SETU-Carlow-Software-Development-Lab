package Q2;

// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: December 2022
// Purpose 			: Lab Exercise 9

public class Car extends RoadVehicle implements ImportDuty
{
    private String carType;

    public Car (String c, int w, int p, double CARTAXRATE, double HGVRATE)
    {
        super(w, p, CARTAXRATE, HGVRATE);
        setType(c);
    }


    public void setType(String t)
    {
        carType = t;
    }

    public String getType()
    {
        return carType;
    }

}

