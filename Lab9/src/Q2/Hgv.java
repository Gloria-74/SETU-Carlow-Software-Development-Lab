package Q2;

// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: December 2022
// Purpose 			: Lab Exercise 9

public class Hgv extends RoadVehicle implements ImportDuty
{

    private int cargo;

    public Hgv(int c, int w, int p, double CARTAXRATE, double HGVRATE)
    {
        super(w, p, CARTAXRATE, HGVRATE);
        setCargo(c);
    }

    public void setCargo(int size)
    {
        cargo = size;
    }

    public int getCargo()
    {
        return cargo;
    }
}
