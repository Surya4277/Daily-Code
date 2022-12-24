package Surya;

public class sleep_demo implements Runnable
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sleep_demo obj = new sleep_demo();
		Thread t1 = new Thread(obj);
		
		t1.start();
		
		sleep_d1 obj2 = new sleep_d1();
		obj2.start();

	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		int i;
		
		for(i=1;i<=10;i++)
		{
			System.out.println("I="+i);
			if(i%2==0)
			{
				try 
				{
					Thread.sleep(2000);
				}
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}