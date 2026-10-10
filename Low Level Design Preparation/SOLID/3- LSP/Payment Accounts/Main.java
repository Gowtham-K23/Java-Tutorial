public class Main
{
    public static void main(String[] args) 
    {
        PaymentAccount savings = new SavingsAccount(5000);
        PaymentAccount current = new CurrentAccount(50000);

        savings.deposit(40000);
        savings.withdraw(15000);
        System.out.println("Savings account balance: " + savings.getBalance());

        current.deposit(4000);
        current.withdraw(60000);
        System.out.println("Current account balance: " + current.getBalance());

        Account readOnly = new ReadOnlyAccount(2500.0);
        System.out.println("ReadOnly Balance: $" + readOnly.getBalance());
    }
}