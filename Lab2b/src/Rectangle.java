// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 2b

public class Rectangle {

    private float length;
    private float width;

    public Rectangle () { }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float setLength(float length) {
        if (length > 0.0f && length <= 40.0f) {
            this.length = length;
        }
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float setWidth(float width) {
        if (width > 0.0f && width <= 40.0f){
            this.width = width;
        }
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "Length = " + length +
                ", Width = " + width +
                '}';
    }

    // Q2
    public float getArea(float length, float width) {
        return length * width;
    }

    public float getPerimeter(float length, float width) {
        return length*2 + width*2;
    }

    //Q3
    public float printRectangle(float length, float width) {
        for(int i=0; i < length; i++){
            for(int j=0; j < width; j++){

                if(i==0 || i==length-1 || j==0 || j==width-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            } System.out.println();
        }
        return length;
    }

}
