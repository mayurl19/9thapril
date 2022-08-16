package star;

public class StarPractice {

	public static void main(String[] args) {
		///////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("star pattern of 1,2,3,4,5");
		for( int i=1 ;i<=6;i++)
		{for(int m=6;m>i;m--) {
			System.out.print(" ");
		}
		for (int j=1;j<i;j++) {System.out.print("*");
		}System.out.println();
		}
		System.out.println("===============================");
////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("star pattern of 3,5,7");
		for (int i=1;i<=3;i++)//common for row just check condition how much row we have.
		{//for spacing
			for(int m=3;m>i;m--) {// for Incremental spaces
				System.out.print(" ");
			}
			for (int j=1;j<(i*2)+2;j++) {// j<(i*2)+2= is always greater than +1 for ascending that set in * first no.
				System.out.print("*");
			}System.out.println();
		}
System.out.println("===============================");
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
System.out.println("star pattern of 7,5,3");
for (int i=1;i<=3;i++)
{//for spacing
	for(int m=1 ;m<i;m++) {//for decremental spaces
		System.out.print(" ");
	}
	for (int j=7;j>(i*2)-2;j--) {//j <(i*2)-2= is always greater than +1 for ascending that set in * first no.
		System.out.print("*");
	}System.out.println();
}
System.out.println("===============================");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
System.out.println("star pattern of1,3,5,7");
for (int i=1;i<=4;i++)//common for row just check condition how much row we have.
{//for spacing
	for(int m=4;m>i;m--) {// for Incremental spaces
		System.out.print(" ");
	}
	for (int j=1;j<(i*2);j++) {// j<(i*2) is always greater than +1 for ascending that set in * first no.
		System.out.print("*");
	}System.out.println();
}
System.out.println("===============================");
////////////////////////////////////////////////////////////////////////////////////////

	}

}
