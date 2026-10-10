class Payment
{
    private String transactionID;
    private double amount;

    Payment(String transactionID, double amount)
    {
        this.transactionID = transactionID;
        this.amount = amount;
    }

    public void showDetails()
    {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Amount: " + amount);
    }

    public void payment()
    {
        System.out.println("Payment successful");
    }
}