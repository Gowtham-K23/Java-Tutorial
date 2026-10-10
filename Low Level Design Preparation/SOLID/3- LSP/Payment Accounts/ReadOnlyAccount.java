public class ReadOnlyAccount implements Account
{
    private double balance;

    ReadOnlyAccount(double balance) {
        this.balance = balance;
    }

    @Override 
    public double getBalance() {
        return balance;
    }    
}