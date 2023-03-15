
abstract class BankAccount 
{
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}
