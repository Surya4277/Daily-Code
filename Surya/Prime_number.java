package Surya;

public class Prime_number extends even_odd
{
	public static void prime()
	{
		try
		{
		int num = 20, count;

		  for (int i = 1; i <= num; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i+"");
		   }
		  }
		}
		catch(Exception e)
		{
			System.out.println("");
		}
	}
}
