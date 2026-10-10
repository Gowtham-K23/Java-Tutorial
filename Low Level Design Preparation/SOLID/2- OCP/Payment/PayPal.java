public class PayPal implements Payment
{
    public void pay(double amount) {
        System.out.println("Paid using Paypal: " + amount);
    }
}