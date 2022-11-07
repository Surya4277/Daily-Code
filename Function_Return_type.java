import java.util.Scanner;

public class Function_Return_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function_Return_type obj=new Function_Return_type();
		System.out.println("the add is ="+obj.add());
		System.out.println("the sub is ="+obj.sub());
		System.out.println("the multi is ="+obj.multi());
		System.out.println("the div is ="+obj.div());
		System.out.println("the mod is ="+obj.mod());
		/* int res=obj.add();
		   System.out.println("The square is ="+(res*res));
		 */
	}
	     
	int add()
	{
		int num1,num2,res;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();

		res=num1+num2;
		return res;
		
	}
	int sub()
	{
		int num1,num2,res;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();

		res=num1-num2;
		return res;
		
	}
	int multi()
	{
		int num1,num2,res;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();

		res=num1*num2;
		return res;
		
	}
	int div()
	{
		int num1,num2,res;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();

		res=num1/num2;
		return res;
		
	}
	int mod()
	{
		int num1,num2,res;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();

		res=num1%num2;
		return res;
		
	}

}
