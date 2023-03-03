package Simple_Banking_Application;
import java.util.Scanner;
public class Deposite extends Bank_System {
	Scanner sc=new Scanner(System.in); 	
	public int Add_money(int Bal)
	{
		System.out.println("Enter Ammount to be added");
		Add_Money=sc.nextInt();
		Bal=Bal+Add_Money;
		System.out.println("Your Balance is :"+Bal);
		return Bal;
	}

}
