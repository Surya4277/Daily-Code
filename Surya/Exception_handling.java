package Surya;

import java.util.Scanner;

public class Exception_handling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		exception();

	}
	
	public static void exception()
	{
		int num1,num2,res;
		try
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Two numbers ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			res = num1/num2;
			System.out.println("Div is="+res);
			
			res = num1+num2;
			System.out.println("Add is="+res);
		}
		catch(Exception e)
		{
			System.out.println("You can not divide by Zero");
		}
		finally
		{
			System.out.println("This is not fair");
		}
	}

}
