package star;

public class R12_R13 {

	public static void main(String[] args) {
	int i,j,k;
	System.out.println("R12");
	for(i=0;i<5;i++)
	{
		for(j=4;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
		
	for(i=1;i<5;i++)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("========*******===========");
	System.out.println("R13");
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
	for(i=1;i<5;i++)
	{
		for(j=i;j<=3;j++)
		{
			System.out.print(" ");
		}
		for(k=0;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	
	}

}
