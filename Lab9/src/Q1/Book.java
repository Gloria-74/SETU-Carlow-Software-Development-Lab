package Q1;
// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: December 2022
// Purpose 			: Lab Exercise 9

public class Book extends LibraryItem implements LoanItem {

    private String author;
    private String title;
    private int numPages;

    public Book(String ID, String author, String title, int numPages)
    {
        super("Book", ID);
        setAuthor(author);
        setTitle(title);
        setNumPages(numPages);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public float calculatePrice(int days)
    {
        return (float) (days * 0.1);
    }

    // BigDecimal nachschauen

    @Override
    public String toString() {
        return "You have rented a book " +
                "from '" + author + '\'' +
                " with the title '" + title + '\'' +
                " and " + numPages +
                " pages.";
    }
}
