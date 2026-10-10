public class BasicPrinter implements Printer
{
    private String message;
    
    public BasicPrinter(String message)
    {
        this.message = message;
    }

    public void print()
    {
        System.out.println("Printing the data: " + message);
    }
}