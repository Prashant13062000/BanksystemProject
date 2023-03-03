package Simple_Banking_Application;
import java.util.Scanner;
public class Account extends Bank_System{
	Scanner sc=new Scanner(System.in); 	
	public void Creat_Account()
	{
		int Account_No;
	
		
		
		System.out.println("Enter Account Number");
		Account_No=sc.nextInt();
		System.out.println("Creat new Id");
		Id=sc.nextInt();
		System.out.println("Creat new Password");
		Password=sc.nextInt();
		System.out.println("###### Account Created Succesfully #######"+"\n"+" Do Not Shere Account Detail,Id,Password,Otp With Other");
		
	
	}

}
