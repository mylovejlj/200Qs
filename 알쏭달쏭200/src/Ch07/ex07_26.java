package Ch07;

import java.util.Scanner;

public class ex07_26 {

	// 메소드
	static int[] aryInsOfN(int[] ary, int keyIdx, int n) {

		if (keyIdx < 0 || keyIdx >= ary.length) {

			return ary.clone();

		} else {

			int[] c = new int[ary.length + 1];
			int i = 0;
			for (; i < keyIdx; i++) {
				c[i] = ary[i];
			}
			
			c[keyIdx] = n;
			
			for (; i < ary.length; i++) {
				c[i+1] = ary[i];
			}
			return c;
		}
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

		System.out.println("삽입 할 요소의 인덱스:");
		int keyIdx = sc.nextInt();
		System.out.println("삽입 할 요소의 값 :");
		int n = sc.nextInt();

		int[] y = aryInsOfN(ary, keyIdx, n);

		// 출력
		for (int i = 0; i < y.length; i++) {
			System.out.println("y[" + i + "]=" + y[i]);
		}
	}
}
