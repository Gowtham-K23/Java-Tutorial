// Compile time - multiple method with same name but different parameters

class PaymentProcessor
{
    public void pay(double amount)
    {
        System.out.println("Amount: " + amount);
    }

    public void pay(double amount, String currency)
    {
        System.out.println("Amount: " + amount);
        System.out.println("Currency: " + currency);
    }
}