package star;

public class R14_______CristmasTree {

	public static void main(String[] args) {
		System.out.println("star pattrn 14 means R14");
		int k,i,j;
		for (i=1;i<=6;i++)                      //row
		{
		for(j=2;j<=i;j++)                   //space
		{
		System.out.print(" ");
		}
		for (k=11;k>=(2*i-1);k--)            //column
		{
		System.out.print("*");
		}
		System.out.println();
		}
		for (i=1;i<=6;i++)                       //row
		{
		for(j=5;j>=i;j--)                   //space
		{
		System.out.print(" ");
		}
		for (j=0;j<(2*i)-1;j++)              //column
		{
		System.out.print("*");         
		}
		System.out.println();
		}
		System.out.println("==================***************=====================");
		System.out.println("cristmas tree program");
		for (i=1;i<=6;i++)                       //row
		{
		for(j=5;j>=i;j--)                   //space
		{
		System.out.print(" ");
		}
		for (j=0;j<(2*i)-1;j++)              //column
		{
		System.out.print("*");         
		}
		System.out.println();
		}

		for (i=2;i<=6;i++)                       //row
		{
		for(j=5;j>=i;j--)                   //space
		{
		System.out.print(" ");
		}
		for (j=0;j<(2*i)-1;j++)              //column
		{
		System.out.print("*");         
		}
		System.out.println();
		}

		for (i=2;i<=6;i++)                       //row
		{
		for(j=5;j>=i;j--)                   //space
		{
		System.out.print(" ");
		}
		for (j=0;j<(2*i)-1;j++)              //column
		{
		System.out.print("*");         
		}
		System.out.println();
		}
		
		for (i=1;i<=5;i++)
		{
			for(j=2;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(k=2;k>=0;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}

