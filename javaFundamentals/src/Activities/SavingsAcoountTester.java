package Activities;

public class SavingsAcoountTester {

		public static void main(String[] args)

		{

			Savingsaccount susanSavings = new Savingsaccount(1000, 0.10);
          
            
			susanSavings.withdraw(250);

			susanSavings.deposit(400);

			susanSavings.addInterest();

			System.out.println(susanSavings.getBalance());

			System.out.println("Expected: 1265.0");

			//1000-250=750 => 750+400=1150 => 1150+1150*0.10=1265.0

		}
}
