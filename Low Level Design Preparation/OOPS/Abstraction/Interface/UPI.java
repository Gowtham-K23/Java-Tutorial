public class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " through UPI Payment");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of Rs." + amount + " through UPI Payment");
    }
}