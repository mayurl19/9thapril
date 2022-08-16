package revision;

public class NoreversStudy {

	public static void main(String[] args) {

		int org = 153;
		int sum = 0;

		for (int i = org; i > 0; i = i / 10)

		{
			int rem = i % 10;
			sum = sum * 10 + rem; //10 use for specing 
		}
		System.out.println(sum);

		System.out.println("========++++++++++++=========");

		int orgg = 196;
		String no = Integer.toString(orgg);
		String rev = "";
		for (int i = no.length() - 1; i >= 0; i--) {
			rev = rev + no.charAt(i);
		}

		int revNo = Integer.parseInt(rev);
		System.out.println(revNo);
		
		}

}
