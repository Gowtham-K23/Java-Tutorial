public interface PaymentAccount extends Account
{
    void deposit(double amount);
    double withdraw(double amount);
}