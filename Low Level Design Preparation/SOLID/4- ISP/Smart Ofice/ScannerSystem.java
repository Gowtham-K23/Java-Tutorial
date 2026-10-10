public class ScannerSystem implements Scanner
{
    private String message;
    
    public ScannerSystem(String message)
    {
        this.message = message;
    }

    public void scan()
    {
        System.out.println("Scanning the data: " + message);
    }
}