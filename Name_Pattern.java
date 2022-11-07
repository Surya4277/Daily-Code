
public class Name_Pattern {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=7;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==1||i==4||i==7||(i==2&j==1)||(i==3&j==1)||(i==5&j==5)||(i==6&j==5))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
