package Simple_Banking_Application;
import java.util.Scanner;
public class Withdraw extends Bank_System {
	Scanner sc=new Scanner(System.in); 	
	public int Remove_Money(int Balance)
	{
		System.out.println("Enter Ammount To be Withdrow");
		Withdrow_Money=sc.nextInt();
		Balance=Balance-Withdrow_Money;
		System.out.println(" Your Balance is:"+Balance);
		
		return Balance;
	}

}
