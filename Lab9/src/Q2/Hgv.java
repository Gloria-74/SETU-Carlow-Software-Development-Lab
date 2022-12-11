package Q2;

// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: December 2022
// Purpose 			: Lab Exercise 9

public class Hgv extends RoadVehicle implements ImportDuty
{

    private int cargo;

    public Hgv(int w, int p, int cargo) {
        super(w, p, CARTAXRATE, HGVRATE);
        setCargo(cargo);
    }

    public void setCargo(int size)
    {
        cargo = size;
    }

    public int getCargo()
    {
        return cargo;
    }

    @Override
    public float calculateDuty() {
        return HGVRATE;
    }

    @Override
    public String toString() {
        return "Hgv{" +
                "cargo=" + cargo +
                '}';
    }
}
