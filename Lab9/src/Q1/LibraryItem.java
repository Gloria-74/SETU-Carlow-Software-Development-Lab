package Q1;
// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: December 2022
// Purpose 			: Lab Exercise 9

public class LibraryItem
{

    String type;
    String ID;

    public LibraryItem(String type, String ID)
    {
        this.type = type;
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "LibraryItem {" +
                "type = '" + type + '\'' +
                ", ID = '" + ID + '\'' +
                '}';
    }
}
