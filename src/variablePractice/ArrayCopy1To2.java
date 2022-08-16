package variablePractice;

import java.util.Arrays;

public class ArrayCopy1To2 {
	public static void main(String[] args) {
		int a[] = { 1, 4, 75, 32 };
		int b[] = new int[a.length];

		// 1. for loop
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		System.out.println("+++++++++++");

//	 using clone method
		a = b.clone();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		System.out.println("+++++++++++");

//	 using arrays.copy method
		b = Arrays.copyOf(a, a.length);

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
