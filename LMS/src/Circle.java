
public class Circle extends Shape
{
	private double radius;
	
	public Circle(double radius) 
	{
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() 
	{
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
	
}
