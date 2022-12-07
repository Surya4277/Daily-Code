import java.util.Scanner;

public class Atm_withdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int balance = 5000, withdraw, deposit;
	        Scanner sc = new Scanner(System.in);
	        while(true)
	        {
	            System.out.println("Welcome to ATM Machine...");
	            System.out.println("Choose 1 for Withdraw");
	            System.out.println("Choose 2 for Deposit");
	            System.out.println("Choose 3 for Check Balance");
	            System.out.println("Choose 4 for EXIT");
	            System.out.print("Choose the operation you want to perform:");
	            int num = sc.nextInt();
	            switch(num)
	            {
	                case 1:
	                System.out.print("Enter money to be withdrawn:");
	                withdraw = sc.nextInt();
	                if(balance >= withdraw)
	                {
	                    balance = balance - withdraw;
	                    System.out.println("Please collect your money");
	                }
	                else
	                {
	                    System.out.println("Insufficient Balance");
	                }
	                System.out.println("");
	                break;
	 
	                case 2:
	                System.out.print("Enter money to be deposited:");
	                deposit = sc.nextInt();
	                balance = balance + deposit;
	                System.out.println("Your Money has been successfully depsited");
	                System.out.println("");
	                break;
	 
	                case 3:
	                System.out.println("Balance : "+balance);
	                System.out.println("");
	                break;
	 
	                case 4:
	                System.exit(0);
	            }
	        }
		}
}
