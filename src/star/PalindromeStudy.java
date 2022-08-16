package star;
import java.util.*;
public class PalindromeStudy {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
 System.out.println("enter the String");
String scr = sc.nextLine();
StringBuffer sb = new StringBuffer(scr);
sb.reverse();
String rev = sb.toString();
 System.out.println("Reverse string "+rev);
if (scr.toLowerCase().equals(rev.toLowerCase()))
{ System.out.println("It is Palindrome");}
else{
System.out.println("It is not Palindrome");}
sc.close();


	}

}
