public class Main 
{
    public static void main(String[] args) 
    {
        Payment payment = new CardPayment();
        payment.pay(1000);

        Payment payment2 = new UpiPayment();
        payment2.pay(2000);

        Payment payment3 = new PayPal();
        payment3.pay(3000);
    }
}