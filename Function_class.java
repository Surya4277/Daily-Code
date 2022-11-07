
public class Function_class {

	public static void main(String[] args) 
	{
		Function_class obj=new Function_class();
		obj.demo_1();
		demo();
	}
	
	public static void display()
	{
		System.out.println("Good Morning");
	}
	
	public static void demo()
	{
		System.out.println("Good Afternoon");
	}
	
	void demo_1()
	{
		System.out.println("Inside");
		display();
	}

}
