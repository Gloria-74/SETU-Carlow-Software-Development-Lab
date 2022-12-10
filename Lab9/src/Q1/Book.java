package Q1;
// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: December 2022
// Purpose 			: Lab Exercise 9

public class Book extends LibraryItem implements LoanItem {

    String author;
    String title;
    int numPages;

    public Book(String type, String ID, String author, String title, int numPages)
    {
        super(type, ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    @Override
    public void calculatePrice()
    {

    }
}
