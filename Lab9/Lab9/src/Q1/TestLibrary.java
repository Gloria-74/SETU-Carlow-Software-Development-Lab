package Q1;

public class TestLibrary {

    public static void main(String[] args)
    {
        LibraryItem[] libraryItems = new LibraryItem[2];

        libraryItems[0] = new Book("1", "J. K. Rowling", "Harry Potter and Half-Blood Prince", 500);
        libraryItems[1] = new CD("2", "ABBA", "ABBA Gold", 12);

        System.out.println(libraryItems[0]);
        System.out.println(libraryItems[1]);

        System.out.println("The Book costs " + libraryItems[0].calculatePrice(12) + " Euros");
        System.out.println("The CD costs " + libraryItems[1].calculatePrice(30) + " Euros");
    }

}
