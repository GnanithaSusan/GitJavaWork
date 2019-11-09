package Poly;

import java.util.Scanner;
import static java.lang.System.out;
import java.text.DecimalFormat;
public class Polydemo {
static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	
{
int x=0,y=0;
float a=0,b=0;
int choice=0;
double result=0.0;
DecimalFormat df=new DecimalFormat("##.00");


out.println("1. add two integers\n2.Add two real numbers\n3.Exit");
out.println("Enter your choice(1-3):");
choice=sc.nextInt();
switch(choice)
{
case 1: result=add(x,y);
out.println(df.format(result));
break;
case 2: result=add(a,b);
out.println(df.format(result));
break;

case 3: break;

}
}
public static int add(int x,int y)
{
	out.println("enter first integer");
	x=sc.nextInt();
	out.println("enter second integer");
	y=sc.nextInt();
	return x+y;
	
	}
public static float add(float a,float b)
{
	out.println("enter first integer");
	a=sc.nextFloat();
	out.println("enter second integer");
	b=sc.nextFloat();
	return a+b;
	
	}

}


