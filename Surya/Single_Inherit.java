package Surya;

public class Single_Inherit 
{
	public void fact(int num)
	{
		int f=1;
		while(num>0)
		{
			f=f*num;
			num--;
		}
		System.out.println("The fact is ="+f);
	}
}
