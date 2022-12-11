package Q1;
// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: December 2022
// Purpose 			: Lab Exercise 9

abstract class LibraryItem implements LoanItem
{

    private String type;
    private String ID;

    public LibraryItem(String type, String ID)
    {
        setType(type);
        setID(ID);
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

    //@Override
    public abstract float calculatePrice(int days);

}
