// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: CA1

public class Book {
    private String bookName;
    private String author;
    private String isbn;
    private String genre;
    private char status;
    private int numberOfBooks;

    public Book (){ }

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String setIsbn(String isbn) {
        this.isbn = isbn;
        return isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public char getStatus() {
        return status;
    }

    public String setStatus(char status) {
        //this.status = status;

        if (status == 'A') {
            return "Book is available";
        } else if (status == 'B') {
            return "Book is borrowed";
        }
        return null;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void Borrow() {

    }

    @Override
    public String toString() {
        return "Book {" +
                "Name of the book = '" + bookName + '\'' +
                ", Author = '" + author + '\'' +
                ", ISBN = '" + isbn +
                ", Genre = '" + genre + '\'' +
                ", Status = '" + status +
                ", Number of books = '" + numberOfBooks +
                '}';
    }
}
