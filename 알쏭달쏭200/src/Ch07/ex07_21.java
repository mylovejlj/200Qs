package Ch07;

import java.util.Scanner;

public class ex07_21 {

	// 값 입력 메소드
	static void aryExchng(int[] aryA, int[] aryB) {
		
		int n = aryA.length > aryB.length ? aryB.length : aryA.length;
		int tmp;
		for (int i = 0; i < n; i++) {
			tmp = aryA[i];
			aryA[i] = aryB[i];
			aryB[i] = tmp;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 배열A 생성
		System.out.print("배열 A의 요소 수:");
		int numA = sc.nextInt();
		int[] arrA = new int[numA];

		for (int i = 0; i < numA; i++) {
			System.out.print("arrA[" + i + "]=");
			arrA[i] = sc.nextInt();
		}

		// 배열B 생성
		System.out.print("배열 B의 요소 수:");
		int numB = sc.nextInt();
		int[] arrB = new int[numB];

		for (int i = 0; i < numB; i++) {
			System.out.print("arrB[" + i + "]=");
			arrB[i] = sc.nextInt();
		}

		System.out.println("배열 A와 B를 교환했습니다.");

		// 교환 작업
		aryExchng(arrA, arrB);

		// 출력
		for (int i = 0; i < numA; i++) {
			System.out.println("arrA[" + i + "]=" + arrA[i]);
		}
		System.out.println("-----------------------------------");
		// 출력
		for (int i = 0; i < numB; i++) {
			System.out.println("arrB[" + i + "]=" + arrB[i]);
		}
	}

}
