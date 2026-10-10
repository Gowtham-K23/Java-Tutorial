import java.util.*;
public class LibrarySystem 
{
    private final int FIXED_FINE = 10;
    private List<Book> books;

    public LibrarySystem(List<Book> books) {
        this.books = books;
    }

    public int calculateFine()
    {
        int fine = 0;

        for(Book item : books)
        {
            fine += item.getOverdueDays() * FIXED_FINE;
        }
        return fine;
    }
}