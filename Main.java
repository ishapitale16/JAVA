import bank.Account;

public class Main
{
    public static void main(String args[])
    {
        Account a1 = new Account(101, "Rachit", 5000);
        Account a2 = new Account(102, "Rahul", 8000);

        System.out.println("Account 1");
        a1.checkBalance();
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.checkBalance();

        System.out.println();

        System.out.println("Account 2");
        a2.checkBalance();
        a2.deposit(3000);
        a2.withdraw(2000);
        a2.checkBalance();
    }
}