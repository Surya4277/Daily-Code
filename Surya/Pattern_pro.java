package Surya;

public class Pattern_pro extends Multilevel_inherit 
{
	public void pat()
	{
		accept();
		int i,j;
		
		for(i=1;i<=num1;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
