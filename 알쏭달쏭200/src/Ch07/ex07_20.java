package Ch07;

import java.util.Scanner;

public class ex07_20 {

	// 값 입력 메소드
	static void aryIns(int[] arr, int idx, int x) {

		for (int i = arr.length-1; i > idx; i--) {
			arr[i] = arr[i - 1];
		}
		arr[idx] = x;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 배열 생성
		System.out.println("a요소 수:");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		// 인덱스와 값 입력 부분
		int idx;
		do {
			System.out.println("삽입할 요소의 인덱스 :");
			idx = sc.nextInt();
		} while (idx < 0 || idx >= num);

		System.out.println("삽입할 값 :");
		int x = sc.nextInt();

		// 삽입 작업
		aryIns(arr, idx, x);

		// 출력
		for (int i = 0; i < num; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}
}
