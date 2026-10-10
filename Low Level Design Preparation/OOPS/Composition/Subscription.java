public class Subscription 
{
    private String plan;
    private double amount;

    // Composition - Has a relationship
    private PaymentProcessor p1;
    
    Subscription(String plan, double amount)
    {
        this.plan = plan;
        this.amount = amount;

        p1 = new PaymentProcessor();
    }

    public void subscribe()
    {
        System.out.println("The selected plan: " + plan);
        p1.processPayment(amount);
    }
}
