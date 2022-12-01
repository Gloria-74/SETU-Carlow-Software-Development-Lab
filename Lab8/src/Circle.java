// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 8

public class Circle extends TwoDShape {

    double v;

    public Circle(String name, String colour, double v) {
        super(name, colour);
        this.v = v;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(v, 2);
    }
}
