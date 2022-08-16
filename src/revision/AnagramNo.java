package revision;

import java.util.Arrays;

public class AnagramNo {

	public static void main(String[] args) {
		String str1 = "recitals";
		String str2 = "krticles";
		boolean s;
		if (str1.length() == str2.length()) {
			char[] arr1 = str1.toCharArray();
			Arrays.sort(arr1);
			System.out.println(arr1);

			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr2);
			System.out.println(arr2);
			s = Arrays.equals(arr1, arr2);

			if (s) {
				System.out.println("Given strings are anagrams");
			} else {
				System.out.println("Given strings are not anagrams");
			}
		}

	}

}
