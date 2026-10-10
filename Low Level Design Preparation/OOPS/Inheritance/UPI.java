public class UPI extends Payment
{
    UPI(String transactionID, double amount)
    {
        super(transactionID, amount);
    }    

    public void processPayment()
    {
        System.out.println("Processing Payment");
        payment();
    }
}
