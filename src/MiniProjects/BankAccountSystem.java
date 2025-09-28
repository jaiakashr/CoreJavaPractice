package MiniProjects;

import java.util.Scanner;

abstract class BankAccount{
	private String AccountHolder;
	private String AccountNumber;
	private String Password;
	private double Balance;
	
	
	public BankAccount(String AccountHolder, String AccountNumber, String Password, double Balance) {
		this.AccountHolder = AccountHolder;
		this.AccountNumber = AccountNumber;
		this.Password = Password;
		this.Balance = Balance;
	}
	
	public String GetAccountHolder() {
		return AccountHolder;
	}
	
	public String GetAccountNumber() {
		return AccountNumber;
	}
	
	public boolean Login(String AccNo, String Pass) {
		return AccountNumber.equals(AccNo)&&Password.equals(Pass);
	}
	
	public double GetBalance() {
		return Balance;
	}
	
	public void Deposit(double Amount) {
		if (Amount>0) {
			Balance += Amount;
			System.out.println("Deposited: " + Amount);
		}
		else {
			System.out.println("Invalid Deposit Amounnt! ");
		}
		
//		System.out.println("Now, Your Account Balance is "+Balance);
	}
	
	public void Withdraw(double Amount) {
		if (Amount>0 && Amount<=Balance ) {
			Balance -= Amount;
			System.out.println("Withdrawn Successfully : "+ Amount);
		}
		else {
			System.out.println("Invalid or InSufficient Amounnt! ");
		}
		
//		System.out.println("Now, Your Account Balance is "+Balance);

	}
	
	abstract public void AccountType();
}

class SavingsAccount extends BankAccount{
	public SavingsAccount(String AccountHolder, String AccountNumber, String Password, double Balance) {
		super(AccountHolder, AccountNumber, Password,Balance);
	}
	
	public void AccountType() {
		System.out.println("Account type : Saving Account");
	}
}

class CurrentAccount extends BankAccount{
	public CurrentAccount(String AccountHolder, String AccountNumber, String Password, double Balance) {
		super(AccountHolder, AccountNumber, Password, Balance);
	}
	
	public void AccountType() {
		System.out.println("Account type : CurrentAccount");
	}
}


public class BankAccountSystem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BankAccount account1 = new SavingsAccount("Akash","IOB2203","akash2203",10000);
		BankAccount account2 = new CurrentAccount("Nandy","SBI0322","Nands0322",8000);
		
		System.out.println("Welcome to ATM ");
		System.out.println("Enter Account Number : ");
		String AccountNumber = scan.nextLine();
		System.out.println("Enter Password : ");
		String Password = scan.nextLine();
		
		BankAccount LoggedIn = null;
		if (account1.Login(AccountNumber, Password)) {
			LoggedIn = account1;
		}
		else if (account2.Login(AccountNumber, Password)) {
			LoggedIn = account2;
		}
		else if (LoggedIn == null){
			System.out.println("❌ Login Failed! Invalid account or password.");
			return;
		}
		
		System.out.println("LogIn Successful!, Welcome " +LoggedIn.GetAccountHolder());
		LoggedIn.AccountType();
		
		System.out.println("----ATM Menu----");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.println("Enter Your Choice :");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			 System.out.println("💰 Balance: " + LoggedIn.GetBalance());
             break;
			
		case 2:
			System.out.println("Enter amount to Deposit : ");
			Double deb = scan.nextDouble();
			LoggedIn.Deposit(deb);
			break;
			
		case 3:
			System.out.println("Enter amount to withdraw : ");
			Double wd = scan.nextDouble();
			LoggedIn.Withdraw(wd);
			break;
			
		case 4:
			System.out.println("Thank you for your visit!. ");
			break;
			
			default:
				System.out.println("❌ Invalid choice, try again.");
		}
		
//		account1.AccountType();
//		System.out.println("AccountHolder: " + account1.GetAccountHolder());
//		System.out.println("AccountNumber: " + account1.GetAccountNumber());
//		System.out.println("Balance: " + account1.GetBalance());
//		account1.Deposit(4000);
//		account1.Withdraw(13000);;
//		System.out.println("Now, Your Account Balance is "+account1.GetBalance());
//		System.out.println();
		
//		BankAccount account2 = new CurrentAccount("Nandy","SBI0322","Nands0322",8000);
//		System.out.println("AccountHolder: " + account2.GetAccountHolder());
//		System.out.println("Balance: " + account2.GetBalance());
//		account2.Withdraw(13000);;
//		System.out.println("Now, Your Account Balance is "+account2.GetBalance());
//		System.out.println();
		

	}

}
