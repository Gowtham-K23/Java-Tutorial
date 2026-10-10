public class CreditCard extends Payment
{
    CreditCard(String transactionID, double amount)
    {
        super(transactionID, amount);
    }    

    public void processPayment()
    {
        System.out.println("Processing Payment");
        payment();
    }
}
