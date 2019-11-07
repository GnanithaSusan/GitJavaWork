package controlStatements;

import java.util.Scanner;

public class BiggerNo {
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of x");
	int x=sc.nextInt();
	System.out.println("enter the value of y");

	int y=sc.nextInt();
	System.out.println("enter the value of z");
int z=sc.nextInt();

if((x>y)&&(x>z))
{
	System.out.println("x is the biggest");

}
else if(y>z)
{
	System.out.println("y is the biggest");
}
else
	System.out.println("z is the biggest");
}
}


