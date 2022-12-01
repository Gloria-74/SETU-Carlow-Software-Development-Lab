// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 8

public class Cylinder extends ThreeDShape{

    int i;
    int i1;

    public Cylinder(String name, String colour, int i, int i1) {
        super(name, colour);
        this.i = i;
        this.i1 = i1;
    }

    @Override
    public double area() {
        return (2 * Math.PI * Math.pow(i, 2)) + (2 * Math.PI * i * i1);
    }

    @Override
    public double volume() {
        return Math.pow(i, 2) * Math.PI * i1;
    }
}
