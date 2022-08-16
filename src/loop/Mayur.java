package loop;

public class Mayur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=6;i++) 
		{
			
			for(int j=1;j<=i;j++) 
			{
				if (i==1)System.out.print("M");
				else if (i==2)System.out.print("O "); 
				else if(i==3)System.out.print("T ");
				else if (i==4)System.out.print("H ");
				else if (i==5)System.out.print("E ");
				else if (i==6)System.out.print("R ");
			}
			System.out.println();
			
		}
		for (int i=1;i<=6;i++) 
		{
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		for (int i=1;i<=6;i++) 
		{
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
			}
		 
		System.out.println("=======================");
		for (int a=1;a<=6;a++) 
		{
		     for(int b=a;b<6;b++) {
	         System.out.print("  ");	// double space
			}
		     for (int c=1;c<=a;c++)
		     {
			System.out.print(" *");
			}
		System.out.println();
	}
		for (int a=1;a<=6;a++) 
		{
		     for(int b=a;b<6;b++) {
	         System.out.print(" ");	// singl space diff 
			}
		     for (int c=1;c<=a;c++)
		     {
			System.out.print(" *");
			}
		System.out.println();
	}

	}
}
