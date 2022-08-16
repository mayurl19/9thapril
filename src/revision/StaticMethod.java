package revision;

public class StaticMethod {
	public static void addition(int a,int b) 
	{
		int addition;

		addition = a+b ;

		System.out.println("a+b="+addition);
		
	}
	public void mul() 
	{ int h=56;
	int j=90;
		int k =h*j; 
		System.out.println("multiple ="+k);
	}
	public void divide(float p,float e) {
		System.out.println("division is "+p/e);
	}
	
	public static void main(String[] args) {
	
		addition(10,12);
		Package.sub();
	StaticMethod m=new StaticMethod();
	m.mul(); 
	m.divide(23,67);
	}

}
