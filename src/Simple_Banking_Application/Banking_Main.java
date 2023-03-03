package Simple_Banking_Application;
import java.util.Scanner;
public class Banking_Main {
	public static void main(String[] args) {
		int Balance=0;
	 int choice;
	do{		
		
		System.out.println("****Welcome to Banking System****");
	System.out.print("==========  Main Menu ============ \n");
	System.out.print("press #1. Creat Account.   \n");
	System.out.print("press #2. Deposite Money Into Account   .\n");
	System.out.print("press #3. Withdrow Money Into Account        \n");
	System.out.print("press #4. View Account Balance    \n");

	System.out.print("press #5. Exit                 \n");
	Bank_System bs=new Bank_System();
	System.out.print("Enter your Menu choice: ");		
	Scanner sc=new Scanner(System.in); 		
	choice=sc.nextInt();	
			switch (choice) {
			
			case 1:
				Account a=new Account();
				a.Creat_Account();
		    break;
			case 2:
				
				bs.Add_money(Balance);
				System.out.println(Balance);
				break;
			case 3:
				Withdraw w=new Withdraw();
				w.Remove_Money(Balance);
				break;
			case 4:
				Cheak_Balance c=new Cheak_Balance();
				c.View_Balance(Balance);
	}
			
	}
	while(choice!=5);	
	
		}
	
	
}
