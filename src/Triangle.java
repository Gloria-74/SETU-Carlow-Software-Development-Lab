// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 8

public class Triangle extends TwoDShape{

    double base;
    double hight;

    public Triangle(String name, String colour, double base, double hight) {
        super(name, colour);
        this.hight = hight;
        this.base = base;
    }

    @Override
    public double area() {
        return 0.5 * base * hight;
    }
}
