public class NetBanking implements Payment
{
    public void pay(double amount) {
        System.out.println("Paid using Net Banking: " + amount);
    }
}