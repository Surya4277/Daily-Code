
public class OddNumbers implements Runnable	 //implements Runnable interface
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		 try {
			Thread.sleep(1000); // sleep method for execute Prime number first
			int i;
			for(i=0;i<=100;i++) 
			{
				if(i%2!=0) 
				{
					System.out.println("This is Odd numbers = "+i);
				}
			}
		} 
		 catch (Exception e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
