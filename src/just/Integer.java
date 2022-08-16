package just;

public class Integer {

	int a;
	int b;
	
	public Integer (int c,int d) {
		a=c;
		b=d;
		System.out.println("Addition of two a & b is ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i=new Integer( 17,48);
		i.addition();
	}
 public void addition () {
	 int sum = a+b ;
	 System.out.println(sum);
 }
}
