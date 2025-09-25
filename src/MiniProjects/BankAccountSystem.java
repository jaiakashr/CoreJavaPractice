package MiniProjects;

abstract class BankAccount{
	private String AccountHolder;
	private double Balance;
	
	public BankAccount(String AccountHolder, double Balance) {
		this.AccountHolder = AccountHolder;
		this.Balance = Balance;
	}
	
	public String GetAccountHolder() {
		return AccountHolder;
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
	public SavingsAccount(String AccountHolder, double Balance) {
		super(AccountHolder, Balance);
	}
	
	public void AccountType() {
		System.out.println("Account type : Saving Account");
	}
}

class CurrentAccount extends BankAccount{
	public CurrentAccount(String AccountHolder, double Balance) {
		super(AccountHolder, Balance);
	}
	
	public void AccountType() {
		System.out.println("Account type : CurrentAccount");
	}
}


public class BankAccountSystem {
	public static void main(String[] args) {
		BankAccount account1 = new SavingsAccount("Akash",10000);
		account1.AccountType();
		System.out.println("AccountHolder: " + account1.GetAccountHolder());
		System.out.println("Balance: " + account1.GetBalance());
		account1.Deposit(4000);
		account1.Withdraw(13000);;
		System.out.println("Now, Your Account Balance is "+account1.GetBalance());
		System.out.println();
		
		BankAccount account2 = new CurrentAccount("Abi",8000);
		System.out.println("AccountHolder: " + account2.GetAccountHolder());
		System.out.println("Balance: " + account2.GetBalance());
		account2.Withdraw(13000);;
		System.out.println("Now, Your Account Balance is "+account2.GetBalance());
		System.out.println();
		

	}

}
