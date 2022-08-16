package homeWork;

public class AdditionOfOddNo40To50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new isssu
		int i=40;
		int sum =0;
		while(i<=50)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				sum=sum+i;	
			}
			
			i++;
			
		}
		System.out.println("===========");
		System.out.println(sum);

	}

}
