
public class Checking_Account implements Bank_Account
{
	private int accountNumber;
	private double balance;
	
	public Checking_Account(int accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
		
	}
	
	public double getBalance()
	{
		return balance;
		
	}
	@Override
	public void deposit(double amount) 
	{
		// TODO Auto-generated method stub
		balance = amount;
		
	}

	@Override
	public void withdraw(double amount) 
	{
		// TODO Auto-generated method stub
		balance = amount;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Checking_Account obj = new Checking_Account(98546, 10000);
		
		System.out.println("Initial balance :" +obj.getBalance());
		
		obj.deposit(5000);
		System.out.println("Balance after deposit :" +obj.getBalance());
		
		obj.withdraw(2000);
		System.out.println("Balance after withdraw :" +obj.getBalance());
	}

}
