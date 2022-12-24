package Surya;

public class t_demo extends Thread {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		t_demo obj=new t_demo();
		obj.start();
		
		t_demo obj1=new t_demo();
		obj1.start();
	}
	public  void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("i="+i);
		}
	}

}
