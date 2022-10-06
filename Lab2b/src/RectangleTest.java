// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 2b

public class RectangleTest {
    public static void main(String[] args) {
       Rectangle rectangleA = new Rectangle();

       rectangleA.setLength(5.0f);
       rectangleA.setWidth(10.0f);

       System.out.println(rectangleA.toString());

       // Q2

       float area = rectangleA.getArea(rectangleA.getLength(), rectangleA.getWidth());

       System.out.println(
               "The Area of the rectangle with a length of " + rectangleA.getLength()
               + " and a width of " + rectangleA.getWidth() + " is " + area
       );

       float perimeter = rectangleA.getPerimeter(rectangleA.getLength(), rectangleA.getWidth());

       System.out.println(
               "The Area of the rectangle with a length of " + rectangleA.getLength()
               + " and a width of " + rectangleA.getWidth() + " is " + perimeter
       );

       float rectangle = rectangleA.printRectangle(5,7);
    }
}
