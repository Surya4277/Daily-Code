package Surya;

import java.util.Scanner;

public class even_odd 
{
	public static void demo()
	{
		try
		{
			int num;
	
			Scanner sc = new Scanner(System.in);
	
			System.out.println("Enter a number:");
			num = sc.nextInt();
	
			if(num % 2 == 0)
			{
				System.out.println("Number is Even");
			}
			else
			{
				System.out.println("Number is Odd");
			}
		}
		catch(Exception e)
		{
			System.out.println();
		}
}
}
