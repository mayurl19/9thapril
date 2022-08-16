package star;

public class R7 {

	public static void main(String[] args) {
		int i,j,k;
		// for R5
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//for R6
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(k=9;k>=(2*i-1);k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
