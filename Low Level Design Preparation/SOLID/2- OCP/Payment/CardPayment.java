class CardPayment implements Payment
{
    public void pay(double amount) {
        System.out.println("Paid using ATM Card: " + amount);
    }
}