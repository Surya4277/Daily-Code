
public class Car extends Vehicle
{
	String color = "Black"; // Initializing of an color.
	
	public void honk() // Creating a Non-static method.
	{
		System.out.println("The Color of Car is : "+color);
		System.out.println("Honking the Car...");
	}
	
	public static void main(String[] args) 
	{
		Car obj = new Car(); // Creating constructor of class.
		obj.drive();
		obj.honk();
	}
}

