package star;

public class R10_R11 {

	public static void main(String[] args) {
		int i,j,k;
		System.out.println("R10");
		for(i=0;i<5;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=4;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====*********======");
		System.out.println("R11");
		for(i=0;i<5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<=4;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
				}

}
