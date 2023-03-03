package Simple_Banking_Application;
import java.util.Scanner;
public  class Bank_System implements Bank {
	Scanner sc=new Scanner(System.in); 	
	
	int Id;
    int Password;
    int Account_No;
    int Add_Money;
    int Withdrow_Money;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public int getPassword() {
		return Password;
	}
	public void setPassword(int Password) {
		this.Password = Password;
	}
	public int getAccount_No() {
		return Account_No;
	}
	public void setAccount_No(int account_No) {
		Account_No = account_No;
	}
	public int getAdd_Money() {
		return Add_Money;
	}
	public void setAdd_money(int add_Money) {
		Add_Money = add_Money;
	}
	public int getWithdrow_Money() {
		return Withdrow_Money;
	}
	public void setWithdrow_Money(int withdrow_Money) {
		Withdrow_Money = withdrow_Money;
	}
    void Display()
    {
    	System.out.println(" Your Balance is");
    }
    
    
    

		
	
	@Override
	public int Withdrow_Money() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int Balance_Cheak() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int Add_money(int Balance) {
		System.out.println("Enter Ammount to be added");
		Add_Money=sc.nextInt();
		Balance=Balance+Add_Money;
		System.out.println("Your Balance is :"+Balance);
		return Balance;
	}
    

}
