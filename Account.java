package bank;

public class Account
{
    int accountNo;
    String name;
    double balance;

    public Account(int accountNo, String name, double balance)
    {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance()
    {
        System.out.println("Account No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}