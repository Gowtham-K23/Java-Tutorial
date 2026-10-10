public class Main
{
    public static void main(String[] args)
    {
        PaymentProcessor p1 = new PaymentProcessor();
        p1.pay(50000.0);

        PaymentProcessor p2 = new PaymentProcessor();
        p2.pay(10000.0, "Dollars");
    }   
}