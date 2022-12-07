package Surya;

public class use_of_mutiple implements Surya1_inf,Surya2_inf  
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		use_of_mutiple obj=new use_of_mutiple();
		obj.demo();
		obj.disp();

	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("Hiiii from interface of Surya2 :)");
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Hiiii from interface of Surya1 :)");
		
	}

}
