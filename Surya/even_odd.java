package Surya;

import java.util.Scanner;

public class even_odd extends Single_Inherit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		even_odd obj=new even_odd();
		obj.accept();

	}
	public void accept()
	{
		int num;
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter the number");
		num=ac.nextInt();
		fact(num);
		demo_evn(num);
		
	}
	
	public void demo_evn(int num)
	{
		if(num%2==0)
		{
			System.out.println("It is even No:"+num);
		}
		else
		{
			System.out.println("It is odd NO."+num);
		}
		
	}

}
