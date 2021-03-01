package Ch07;

import java.util.Scanner;

public class ex07_23 {

	// 메소드
	static int[] arySearch(int[] ary, int key) {

		int cnt = 0;

		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == key) {
				cnt++;
			}
		}
		
		int[] aryIdx = new int[cnt--];
		for (int i = ary.length-1; cnt >=0; i--) {
			if (ary[i] == key) {
				aryIdx[cnt--] = i;
			}
		}
		return aryIdx;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 배열A 생성
		System.out.print("요소 수:");
		int num = sc.nextInt();
		int[] ary = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("ary[" + i + "]=");
			ary[i] = sc.nextInt();
		}

		System.out.println("탐색할 값:");
		int key = sc.nextInt();
		// 탐색 작업
		int[] aryIdx = arySearch(ary, key);

		System.out.println("일치하는 요소의 인덱스");

		// 출력
		for (int i = 0; i < aryIdx.length; i++) {
			System.out.println(aryIdx[i]);
		}
	}
}
