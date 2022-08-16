package star;

public class R9 {

	public static void main(String[] args) {
//		int i,j;
//		for (i=0;i<=5;i++)                   
//		{
//			for (j=i;j<=4;j++)            
//			{
//			System.out.print(" ");
//			}
//
//		for (j=0;j<=i;j++)  
//		{           
//		System.out.print("*");
//		}	
//		System.out.println();
//	}
//		for (i=0;i<=5;i++)
//		{
//			for(j=1;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(j=5;j>=i;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//	new logic
		int star=1;
		int space=5;
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
		System.out.println();
		if(i<6)
		{
			space--;
			star++;
		}
		else
		{
			space++;
			star--;
			
		}
		}
		
	}
}
