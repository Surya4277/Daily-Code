
public class Nested_pattern {

	public static void main(String[] args) {
		int i,j;
	     for(i=1;i<=5;i++)
	     {
	    	 for(j=1;j<=1;j++)
	    	 /*for(j=4;j>=i;j--)*/
	    	 {
	    		/*System.out.print("*");*/
	    		System.out.print("");
	    	 }
	    	 for(j=5;j>=i;j--)
	    	 /*for(j=1;j<=i;j++)*/
	    	 /*for(j=1;j<2*i;j++)*/
		     /*for(j=1;j<=2*i-1;j++)*/
		    	 {
		    		 System.out.print("*");
		    	 }
	    	 System.out.println();
	     }

	}

}
