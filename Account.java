import java.util.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Account
{   
     NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
     static long acctNumber;
     static int balance;
     String name;
     static int x;
     static int remain;
     int account;
     static int cash;
     static int amount;
     static int current;
     static int money;
     static int transact;

    

     public void entry()
     {
     
     Scanner sc=new Scanner(System.in);
     System.out.print("Please enter the pin code: " + x);
     x=sc.nextInt();
     System.out.print("Enter the withdrawal amount: " + amount); 
     amount=sc.nextInt();
     
     }
    

     public Account (String owner,int initial)
     {   
        Scanner sc=new Scanner(System.in);
        name = owner;
        acctNumber = account;
        balance = initial;
        System.out.print("Enter your account number: "+ acctNumber);
        acctNumber=sc.nextInt();
     }
   
     
     public int withdraw (int amount)
     {
        
        if(amount < balance) //withdraw value is in the range
        {
        System.out.println();
        System.out.println("Account Number: "+ acctNumber);
        System.out.println("Amount processing: "+ fmt.format(amount));
        System.out.println("Request accepted! Please wait a few seconds...");
        System.out.println("Your amount has been successfully withdrawn..Thank you for using Atm services");
        remain = balance - amount;
        System.out.println("Your remaining amount is: "+remain);
        }
        else if (amount < 0) // withdraw value is negative
        {
        System.out.println ();
        System.out.println ("Error: Withdraw amount is invalid.");
        System.out.println ("Account Number: " + acctNumber);
        System.out.println ("Requested amount: " + fmt.format(amount));
        }
        else 
        if (amount > balance) // withdraw value exceeds balance
        {
        System.out.println ();
        System.out.println ("Error: Insufficient funds.");
        System.out.println ("Account Number: " + acctNumber);
        System.out.println ("Requested amount: " + fmt.format(amount));
        System.out.println ("Available amount: " + fmt.format(balance));
        }
       
        
        return balance;
     }

        
        
        public int deposit (int cash)
        {   
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the deposition amount: " + cash);
        cash=sc.nextInt();
        if (cash > 300000) // deposit value is invalid
        {
            System.out.println();
            System.out.println("Error: Deposit amount is invalid.");
            System.out.println(acctNumber + "    " + fmt.format(cash));
        }
        else if(cash >= 100)
        {   current=remain+cash;
            System.out.println();
            System.out.println("Congrats!! Your amount has been successfully deposited");
            System.out.println("Your current amount after deposition is: "+current);
        
        }
        else if(cash < 100)
        {  System.out.println();
           System.out.println("Sorry.The minimum amount to be deposited should be 100");
        }   
        return balance;

       }



    public int transfer(int money)
    {
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the amount to be transferred: "+money);
    money=sc.nextInt();
    
    if(money < current)
    {    
        System.out.println("Your amount has been transferred in Kalpana Baingne's Account");
        remain = current-money;
        System.out.println("Money left in your Account: "+ remain);
    }
    else if(money > current)
    {
       System.out.println("Sorry.You have insufficient amount: ");
       System.out.println("Access denied.");
    }
    return current;

   
    }

      

    public double getBalance ()
    {
        return balance;
    }
    


    public long getAccountNumber ()
    {
        return acctNumber;
    }


    
    public static void main(String[] args)
    {
        Account a = new Account("Tanushree Baingne", 3000);
      
        System.out.println(a.name);
        System.out.println("Your current balance is: "+ a.getBalance());
        
        a.entry();
        a.withdraw(amount);

        a.deposit(cash);
        a.transfer(money);
        
          
    }
    
}