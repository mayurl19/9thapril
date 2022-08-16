package loop;

public class Mother {
public void rahul() {
	
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
		System.out.println(i);
		i++;
	}
}
}
