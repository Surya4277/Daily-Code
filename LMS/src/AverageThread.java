
public class AverageThread implements Runnable  //implements Runnable interface
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		int sum=0,i;      // initialize the variable
	    double avg;    // variable and data type
	 
	    for(i=0;i<=10;i++) {    // for loop to Print and sum number between 1 to 10
		  sum=sum+i;
	   }
	 
	   avg= sum/10; // Average of sum
	   System.out.println("Average of the num ="+avg);
		
	}

}
