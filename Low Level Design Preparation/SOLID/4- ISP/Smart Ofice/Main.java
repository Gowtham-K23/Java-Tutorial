public class Main 
{
    public static void main(String[] args) {
        
        BasicPrinter basicPrinter = new BasicPrinter("Baby Photo in HD quality");
        basicPrinter.print();

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter("Company documents");
        multiFunctionPrinter.print();
        multiFunctionPrinter.scan();
        multiFunctionPrinter.fax();

        ScannerSystem scannerSystem = new ScannerSystem("Landscape Image");
        scannerSystem.scan();
    }    
}
