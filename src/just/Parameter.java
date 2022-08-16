package just;

public class Parameter {
	 String name = "mayur" ;
	 String identity="lambat";

	public Parameter(String call, String surname) {
	name=call;
	identity=surname;
		System.out.println("FULL NAME");
	}

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parameter ZP=new Parameter("raj"," mehta");
		ZP.add();
		
		
	}

	public void add () {
		
		System.out.println(name);
		System.out.println(identity);
	}
}
