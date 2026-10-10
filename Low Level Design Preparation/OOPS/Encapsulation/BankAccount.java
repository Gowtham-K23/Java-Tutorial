public class BankAccount
{
    private String accNumber;
    private String name;
    private double balance;  
    
    BankAccount(String accNumber, String name, double balance)
    {
        this.accNumber = accNumber;
        this.name = name;

        if(balance >= 0)
        {
            this.balance = balance;
        }
        else
        {
            throw new IllegalArgumentException("Negative values cannot be accessed");
        }
    }

    public void getDetails()
    {
        System.out.println("Account Number: " + accNumber + "\nAccount Holder Name: " + name + "\nCurrent Balance: " + balance + "\n");
    }

    public void deposit(int amount)
    {
        if(amount <= 0)
        {
            System.out.println("Amount cannot be deposited");
        }
        else
        {
            balance += amount;
            System.out.println("Amount deposited successfully");
        }
    }

    public void withdraw(int amount)
    {
        if(balance < amount)
        {
            System.out.println("Amount cannot be withdrawn");
        }
        else
        {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
        }
    }
    public static void main(String[] args)
    {
        BankAccount acc1 = new BankAccount("AAC12345", "Gowtham K", 50000);
        acc1.getDetails();

        acc1.deposit(-100);
        acc1.deposit(45000);

        acc1.getDetails();

        acc1.withdraw(200000);
        acc1.withdraw(5000);

        acc1.getDetails();
    }
}