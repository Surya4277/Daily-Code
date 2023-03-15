
public class EvenNumbers implements Runnable  //implements Runnable interface
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.println("This is Even numbers = "+i);
			}
		}
		
	}

}
