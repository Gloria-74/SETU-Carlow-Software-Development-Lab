// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 8

public abstract class ThreeDShape extends Shape
{
    public ThreeDShape(String name, String colour)
    {
        super(name, colour);
    }

    public abstract double volume();

    public String toString()
    {
        return (super.toString());
    }
}