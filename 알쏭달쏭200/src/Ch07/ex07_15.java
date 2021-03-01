package Ch07;

import java.util.Scanner;

public class ex07_15 {

	static int sumOf(int[] a) {

		int sum = 0;

		/*
		 * for (int i = 0; i < a.length; i++) { sum += a[i]; }
		 */
		for(int i:a) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("요소 수:");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("arr[" + i + "]:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("합계는"+sumOf(arr)+"입니다.");
	}

}
