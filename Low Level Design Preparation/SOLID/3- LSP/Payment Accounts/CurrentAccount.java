public class CurrentAccount implements PaymentAccount
{
    private double balance;
    
    CurrentAccount(double initialAmount) {
        if(initialAmount < 0) {
            System.out.println("Initial Amount cannot be negative...");
            this.balance = 0;
        }
        else
        {
            this.balance = initialAmount;
        }
    }

    @Override 
    public void deposit(double depAmount) {
        if(depAmount <= 0) {
            System.out.println("Cannot deposit amount into current account...");
            return;
        }
        balance += depAmount;
    }

    @Override 
    public double withdraw(double withAmount) {
        if(balance < withAmount) {
            System.out.println("Cannot withdraw amount from current account...");
            return 0;
        }
        balance -= withAmount;
        return balance;
    }

    @Override 
    public double getBalance() {
        return balance;
    }
}