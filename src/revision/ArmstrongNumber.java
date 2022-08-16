package revision;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int org =153; //0,153,371,1,370,407,1634,8208
		int sum =0;
		
		for(int i=org;i>0;i=i/10)
		
		{
			int rem =i % 10;
			sum =sum+(rem*rem*rem); //for power of 4 multi rem*rem*rem*rem   depnds on power multi rem 
	
		}

		if(org==sum)
		
		{
			System.out.println("It's Armstrong no.");
		}
		else
		{
			System.out.println("It's not an Armstrong no.");
		}

	}

}
