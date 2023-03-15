
public class EvenOdd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Thread thread1 = new Thread( new EvenNumbers());   // Make Thread to call the Even class method
	      Thread thread2 = new Thread( new OddNumbers());   // Make Thread to call the Odd class method
	      
			thread1.start();
			thread2.start();

	}

}
