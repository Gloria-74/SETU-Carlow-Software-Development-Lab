// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: CA1

public class Library {

    public static void main(String[] args) {
        Book bookA = new Book();
        Book bookB = new Book();
        Book bookC = new Book();

        bookA.setBookName("Harry Potter and the Order of the Phoenix");
        bookA.setAuthor("J. K. Rowling");
        bookA.setIsbn("ISBN 0-123-45678-1");
        bookA.setGenre("Fantasy");
        bookA.setStatus('A');
        bookA.setNumberOfBooks(3);

        bookB.setBookName("Little Brother and little Sister");
        bookB.setAuthor("Brothers Grimm");
        bookB.setIsbn("ISBN 0-234-56789-0");
        bookB.setGenre("Fairytale");
        bookB.setStatus('B');
        bookB.setNumberOfBooks(0);

        bookC.setBookName("The magic table");
        bookC.setAuthor("Brothers Grimm");
        bookC.setIsbn("ISBN 0-345-67890-0");
        bookC.setGenre("Fairytale");
        bookC.setStatus('A');
        bookC.setNumberOfBooks(1);

        System.out.println(bookA.toString());
        System.out.println(bookB.toString());
        System.out.println(bookC.toString());

    }

}
