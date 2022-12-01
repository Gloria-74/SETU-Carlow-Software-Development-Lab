// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 8

public class Rectangle extends TwoDShape{

    double v;
    double v1;

    public Rectangle(String name, String colour, double v, double v1) {
        super(name, colour);
        this.v = v;
        this.v1 = v1;
    }

    @Override
    public double area() {
        return (v + v1)*2;
    }
}
