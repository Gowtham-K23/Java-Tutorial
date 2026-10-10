public class Main 
{
    public static void main(String[] args) {
        UPI p1 = new UPI("ABC123", 10000.0);
        CreditCard p2 = new CreditCard("AMX564", 56500.15);
        
        p1.showDetails();
        p1.processPayment();
        p1.payment();

        p2.showDetails();
        p2.processPayment();
        p2.payment();
    }
}
