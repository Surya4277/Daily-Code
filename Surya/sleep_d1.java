package Surya;

public class sleep_d1 extends Thread 
{
	public void run()
	{
		int i;
		
		for(i=1;i<=10;i++)
		{
			System.out.println("J="+i);
			if(i%2==0)
			{
				try 
				{
					Thread.sleep(300);
				}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
