
public class S_Pattern {

	public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=7;i++)
		{
			for(j=1;j<=6;j++)
			{
				if(i==1||i==4||i==7)
				{
					if(j==1||j==6)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
		  			}
				}
				else if(i==2||i==3)
				{
					if(j==1||j==1)
					{
					System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else if(i==5||i==6)
				{
					if(j==6||j==6)
					{
					System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
