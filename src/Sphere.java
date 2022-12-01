// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 8

public class Sphere extends ThreeDShape{

    int i;

    public Sphere(String name, String colour, int i) {
        super(name, colour);
        this.i = i;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(i, 2);
    }

    @Override
    public double volume() {
        return 4/3 * Math.PI * Math.pow(i, 2);
    }
}
