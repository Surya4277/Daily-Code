package Surya;

public class Armstrong_number extends Prime_number
{
	public static void arm()
	{
		try
		{
		 int n; 
		 System.out.println("Armstrong Numbers from 1 to 1000:");
	  
	      for (int i = 1; i<=1000; i++) //looping
	      {
	         int check, rem, sum = 0;
	         check = i;
	         while(check != 0) {
	            rem = check % 10;
	            sum = sum + (rem * rem * rem);
	            check = check / 10;
	         }
	         if(sum == i)
	         {
	        	 System.out.println(i+"");
	         }
	     }
		} 
		catch(Exception e)
		{
			System.out.println();
		}
	}
}
