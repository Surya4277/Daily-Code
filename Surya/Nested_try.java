package Surya;

import java.util.Scanner;

public class Nested_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exception();

	}
	
	public static void exception()
	{
		try
		{
			int num1,num2,res;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two number");
			
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			res = num1/num2;
			System.out.println("Div is ="+res);
			
			try
			{
				res = num1+num2;
				System.out.println("Add is="+res);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("This is valid ="+ae.getMessage());
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is invalid ="+e.getMessage());
		}
		finally
		{
			System.out.println("Not fair");
		}
	}

}
