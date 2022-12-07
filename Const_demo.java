import java.util.Scanner;

public class Const_demo {
	
	public Const_demo()
	{
		int num1, num2, res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("Num1 is greater="+num1);
		}
		else
		{
			System.out.println("Num2 is greater="+num2);
		}
		
	}
	
	public void demo()
	{
		int num1, num2, res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		res=num1+num2;
		System.out.println("The add is ="+res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Const_demo obj = new Const_demo(); //object creation
		obj.demo();

	}

}
