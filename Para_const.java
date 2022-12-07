import java.util.Scanner;

public class Para_const {
	
	public Para_const()
	{
		//add two num
		int num1, num2, res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		res=num1+num2;
		System.out.println("The add is ="+res);
		Para_const obj = new Para_const(res);
	}
	
	public Para_const(int a)
	{
		//factorial
		int f=1;
		while(a>0)
		{
			f=f*a;
			a--;
		}
		System.out.println("The factorial is="+f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Para_const obj = new Para_const();

	}

}
