import java.util.Scanner;

public class Add_using_parameter {
	
	/*int num1,num2;*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function_Return_type obj=new Function_Return_type();
		System.out.println("the add is ="+obj.add());
		System.out.println("the sub is ="+obj.sub());
		System.out.println("the multi is ="+obj.multi());
		System.out.println("the div is ="+obj.div());
		System.out.println("the mod is ="+obj.mod());

	}
	void accept()
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		add(num1,num2);
		sub(num1,num2);
		multi(num1,num2);
		div(num1,num2);
		mod(num1,num2);
		
	}
	void add(int num1,int num2)
	{
		System.out.println("the add is ="+(num1+num2));
	}
	void sub(int num1,int num2)
	{
		System.out.println("the sub is ="+(num1-num2));
	}
	void multi(int num1,int num2)
	{
		System.out.println("the multi is ="+(num1*num2));
	}
	void div(int num1,int num2)
	{
		System.out.println("the div is ="+(num1/num2));
	}
	void mod(int num1,int num2)
	{
		System.out.println("the mod is ="+(num1%num2));
	}

}
