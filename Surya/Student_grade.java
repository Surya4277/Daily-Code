package Surya;

import java.util.Scanner;

public class Student_grade {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			grade();
		}
		catch(user_exp e)
		{
			System.out.println(e.getMessage());
		}

	}

	public static void grade() throws user_exp
	{
		String st_name;
		int roll_no,per,total=0;
		int[] marks = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		st_name = sc.next();
		
		System.out.println("Enter your Roll Number");
		roll_no = sc.nextInt();
		
		System.out.println("Enter marks of five subject");
		
		for(int i=0; i<5; i++)
		{
			marks[i] = sc.nextInt();
			total +=marks[i];
		}
		
		System.out.println("The total out of 500 is="+total);
		
		per = (total*100)/500;
		
		System.out.println("You got "+per+"%");
		
		if(per>100)
		{
			throw new user_exp("The Percentage should not be greater than 100%.");
		}
		else if(per>=35 || per<=100)
		{
			System.out.println("You are Passed the Examination");
		}
		else
		{
			System.out.println("You are Fail in the Examinaton");
		}
	}
}
