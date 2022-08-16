package star;

public class R1_R2_R3_R4 {

	public static void main(String[] args) {
		int i,j,k;
		System.out.println("R1");
		for(i=0;i<5;i++)
		{
			for(j=0;j<=i;j++)
			{System.out.print("*");
		}
			System.out.println();
	}
		System.out.println("==========******************===========");
		System.out.println("R2");
		for(i=0;i<5;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print(" ");
		}
			for(k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		
	}
		System.out.println("==========******************===========");
		System.out.println("R3");
		for(i=0;i<5;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========******************===========");
		System.out.println("R4");
		
		for(i=0;i<5;i++) 
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
}
}
	
