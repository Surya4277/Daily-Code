
public class CheckingAccount extends BankAccount 
{

	public CheckingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void deposit(double amount) 
	{
		// TODO Auto-generated method stub
		double newBalance = getBalance() + amount;
		System.out.println(" Depositing " +amount+ " to account " +getAccountNumber() + ".");
		System.out.println("New balance is " +newBalance+ ".");
		
	}

	@Override
	void withdraw(double amount) 
	{
		// TODO Auto-generated method stub
		if(amount > getBalance())
		{
			System.out.println("Insuffient funds.");
		}
		else
		{
			double newBalance = getBalance() - amount;
			System.out.println(" Withdrawing " +amount+ " from account " +getAccountNumber()+ ".");
			System.out.println("New Balance is " +newBalance+ ".");
		}
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CheckingAccount obj = new CheckingAccount("0987654321", 10000);
		obj.deposit(5000);
		obj.withdraw(2000);
	}
	
	
}
