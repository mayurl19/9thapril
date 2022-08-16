package revision;

public class StringCHr_count {

	public static void main(String[] args) {
		String s= "my name is mayur ";
		int count = 0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)!=' ')
				count++;	}
		System.out.println(count);
      //if we want index of y
	//	System.out.println(s.lastIndexOf('y'));
	System.out.println("===================================================");	
	// revers name print for sprint 
		String s1="name is mayur";
		String[] a = s1.split(" ");
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+"  ");
		}
	System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++  ");
		String s2 ="my name is mayur";
		StringBuffer sbr = new StringBuffer(s2);
		System.out.println(sbr.reverse());
	    System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++  ");
		//for checking vowels 
		String r= "my name is mayur ";
		int co = 0;
		for(int i=0;i<r.length()-1;i++)
		{
			if(r.charAt(i)=='a'||r.charAt(i)=='e'||r.charAt(i)=='i'|| r.charAt(i)=='o'||r.charAt(i)=='u')
			{co++;
				System.out.print(r.charAt(i));}
		}
		System.out.println(co);
		System.out.println("=====================================================");
		//revers char 
		String y= "my name is mayur";
		for(int i=y.length()-1;i>=0;i--)
		{
			System.out.print(y.charAt(i));
			
		}		
	}

}
