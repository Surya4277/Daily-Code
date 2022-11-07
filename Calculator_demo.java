import java.util.Scanner;

public class Calculator_demo {
	int num1,num2,res;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator_demo obj=new Calculator_demo();
		obj.add();
		obj.sub();
		obj.multi();
		obj.div();
		obj.mod();

	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
	}
	void add()
	{
		accept();
		res = num1+num2;
		System.out.println("the add is ="+res);
	}
	void sub()
	{
		accept();
		res = num1-num2;
		System.out.println("the sub is ="+res);
	}
	void multi()
	{
		accept();
		res = num1*num2;
		System.out.println("the multi is ="+res);
	}
	void div()
	{
		accept();
		res = num1/num2;
		System.out.println("the div is ="+res);
	}
	void mod()
	{
		accept();
		res = num1%num2;
		System.out.println("the mod is ="+res);
	}


}
