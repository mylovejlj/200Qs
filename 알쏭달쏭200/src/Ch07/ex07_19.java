package Ch07;

import java.util.Scanner;

public class ex07_19 {

	static void aryRmvN(int[] arr, int idx, int n) {

		if (n > 0 && idx >= 0 && idx + n < arr.length) {

			int idx2 = idx + n - 1;

			if (idx2 > arr.length - n - 1) {
				idx2 = arr.length - n - 1;
			}

			for (int i = idx; i <= idx2; i++) {
				arr[i] = arr[i + n];
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("요소 수:");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		int idx;
		do {
			System.out.println("삭제를 시작할 인덱스 :");
			idx = sc.nextInt();
		} while (idx < 0 || idx >= num);

		int n;
		do {
			System.out.println("삭제 할 요소의 수 :");
			n = sc.nextInt();
		} while (n >= arr.length - idx);

		aryRmvN(arr, idx, n);

		for (int i = 0; i < num; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

}
