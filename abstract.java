import java.util.Scanner;

abstract class BankAccount
{
    private static int accnum;
    private static float balance;
    static int intrestrate=5;
    double interest;
    BankAccount()
    {
        accnum=100123;
        balance=5000.0f;
        interest=balance*intrestrate;
        
    }
    abstract void calculateInterest();
    static void display()
    {
        System.out.println("Account Number : "+accnum);
        System.out.println("balance : "+balance);
    }
}
class SavingsAccount extends BankAccount
{
    SavingsAccount()
    {
        super();
    }
    public void calculateInterest()
    {
        interest=interest/365;
    }
    void display1()
    {
        System.out.println("interest : "+interest);
    }
    
}

public class abstract{
    
        public static void main(String[] args) {
          SavingsAccount a=new SavingsAccount();
          a.calculateInterest();
          a.display1();
          BankAccount.display();
		
	}
	
}
	
