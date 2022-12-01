// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: November 2022
// Purpose 			: Lab Exercise 8

public abstract class Shape
{
    private String name;
    private String colour;

    public Shape(String name, String colour)
    {
        this.name = name;
        this.colour = colour;
    }

    public String toString()
    {
        return ("---\nShape Name = " + this.name + "\nShape colour = " + this.colour);
    }

    public abstract double area();
}
