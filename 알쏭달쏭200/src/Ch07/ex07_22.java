package Ch07;

import java.util.Scanner;

public class ex07_22 {

	// 값 입력 메소드
	static int[] aryCopy(int[] A) {

		int[] C = new int[A.length];
		
		for (int i = 0; i < C.length; i++) {
			C[i] = A[i];
		}
		return C;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 배열A 생성
		System.out.print("배열 A의 요소 수:");
		int num = sc.nextInt();
		int[] aryA = new int[num];
		

		for (int i = 0; i < num; i++) {
			System.out.print("ary[" + i + "]=");
			aryA[i] = sc.nextInt();
		}

		System.out.println("배열 A를 복사했습니다.");

		// 교환 작업
		int[] aryB = aryCopy(aryA);

		// 출력
		for (int i = 0; i < num; i++) {
			System.out.println("aryB[" + i + "]=" + aryB[i]);
		}
	}

}
