import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo();
		/*arr_accept();*/
		arr_sum();

	}
	
	public static void demo()
	{
		int arr[];
		
		int[]arr1=new int[10];
		
		int []arr2= {2,4,6,8,10};
		System.out.println("Array location "+arr2[4]);
	}
	public static void arr_accept()
	{
		String[] name=new String[10];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 Names :");
		for(i=0;i<=10;i++)
		{
			name[i]=sc.nextLine();
		}
		System.out.println("The names are :");
		for(i=0;i<=10;i++)
		{
			System.out.println(name[i]);
		}
	}
	public static void arr_sum()
	{
		int size,i,sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size :");
		size = sc.nextInt();
		
		int[] num=new int[size];
		System.out.println("Enter "+size+" number :");
		for(i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("The "+size+" number are :");
		for(i=0;i<size;i++)
		{
			System.out.println(num[i]);
			sum=sum+num[i];
		}
		System.out.println("The add is="+sum);
		
	}

}
