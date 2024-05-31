package boi.com.a;
class Account
{
	String name="shwetha";
	int Account_number=12345;
	int balance=10000;
	public void display()
	{
		System.out.println("\nEmpName:" +name+ "\nEmp account number:" +Account_number+ 
				"\n Available_balance:" +balance);
	}
	
}
class LoanAccount extends Account
{
	int loan_amount=1000;
	public void displayloan() {
		int available_balance=balance-loan_amount;
		System.out.println("My loan amount is"+available_balance);
	}
	
}
public class Emp_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LoanAccount emp1=new LoanAccount();
     emp1.display();
     emp1.displayloan();
	}

}
