public class Book
{
    private String name;
    private int dueDate;
    private int returnDate;

    public Book(String name, int dueDate, int returnDate)
    {
        this.name = name;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
    }

    public int getOverdueDays()
    {
        return (int)Math.max(0, returnDate - dueDate);
    }
}