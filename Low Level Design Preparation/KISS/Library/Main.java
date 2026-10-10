import java.util.*;
public class Main 
{
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Alchemist", 15, 10),
            new Book("It ends with us", 18, 15),
            new Book("It starts with us", 10, 20),
            new Book("Ikigai", 25, 31)
        );

        LibrarySystem librarySystem = new LibrarySystem(books);

        System.out.println("Total fine need to be paid: " + librarySystem.calculateFine());
    }    
}
