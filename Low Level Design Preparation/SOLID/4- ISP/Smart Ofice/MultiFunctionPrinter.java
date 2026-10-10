public class MultiFunctionPrinter implements Printer, Scanner, Fax
{
    private String message;
    
    public MultiFunctionPrinter(String message)
    {
        this.message = message;
    }

    public void print()
    {
        System.out.println("Printing the data: " + message);
    }

    public void scan()
    {
        System.out.println("Scanning the data: " + message);
    }

    public void fax()
    {
        System.out.println("Sending data: " + message + " through fax");
    }
}