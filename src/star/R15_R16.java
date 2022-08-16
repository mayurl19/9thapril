package star;

public class R15_R16 {

	public static void main(String[] args) {

		System.out.println("R15");
		int i,j,k;
		
		 for (i=1; i<=5; i++)   
		        {
		            for ( j=1; j<=i; j++)
		            {
		                if( j == 1 || j == i || i == 5)
		                    System.out.print("*");
		                else
		                    System.out.print(" ");
		            }
		            System.out.println();
		        }
		 System.out.println("======******======");


		 for ( i=1; i<=5; i++)   
		        {
			 for(j=4;j>=i;j--)
			 {
				 System.out.print(" ");
			 }
		            for (k=1; k<=i; k++)
		            {
		                if( k == 1 || k == i || i == 5)
		                    System.out.print("*");
		                else
		                    System.out.print(" ");
		            }
		            System.out.println();
		        }

	}
}


