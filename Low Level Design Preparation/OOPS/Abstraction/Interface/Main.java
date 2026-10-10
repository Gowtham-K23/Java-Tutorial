public class Main {

    public static void main(String[] args) {

        Payment p1 = new UPI();

        p1.pay(500.0);
        p1.refund(400.0);

        Payment p2 = new CreditCard();

        p2.pay(500.0);
        p2.refund(400.0);
    }
}