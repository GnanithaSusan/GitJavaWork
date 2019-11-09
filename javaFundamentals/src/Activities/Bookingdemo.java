package Activities;

public class Bookingdemo {
public static void main(String args[])
{
	int a=0;
	int b=0;
	if(args.length!=0)
	{
		//unboxing..
		//convert String object into int value to stor it in a
		a=Integer.parseInt(args[0]);
		//convert String object into int value to store it in b
		b=Integer.parseInt(args[1]);
		Integer result=a+b;
		
		System.out.print(result);
	}
	else
	{
		System.out.println("please pass two integers as arguments!");
	}
}
}
