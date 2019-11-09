package Activities;

import java.util.Scanner;

public class Savingsaccount {
private double balance;
private double interest;
public int accountnum;
Scanner sc=new Scanner(System.in);
{
	System.out.println("enter account num");
accountnum=sc.nextInt();
}
public Savingsaccount()
{
	balance = 0;
	interest = 0;
}
		public Savingsaccount(double initialBalance, double initialInterest)

		{

			balance = initialBalance;

			interest = initialInterest;

		}



		public void deposit(double amount)

		{

			balance = balance + amount;

		}



		public void withdraw(double amount)

		{

			balance = balance - amount;

		}



		public void addInterest()

		{

			balance = balance + balance * interest;

		}



		public double getBalance()
		{

			return balance;

		


	
	}
}
