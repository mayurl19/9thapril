package revision;

public class PrimeNOSTUDY {

	public static void main(String[] args) {
		
		int number =12;
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
				
			}
		}
		if(count==2)
		{
			System.out.println("it is a prime no.");
		}
		else 
		{
			System.out.println("it is not a prime no.");
		}
	}

}
