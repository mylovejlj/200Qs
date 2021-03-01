package Ch07;

import java.util.Scanner;

public class ex07_25 {

	// 메소드
	static int[] aryRmvOfN(int[] ary, int keyIdx, int n) {

		if (keyIdx < 0 || keyIdx >= ary.length || n < 0) {

			return ary.clone();

		} else {

			if(keyIdx+n>ary.length) {
				n=ary.length-keyIdx;
			}
			
			int[] c = new int[ary.length - n];
			int i = 0;
			for (; i < keyIdx; i++) {
				c[i] = ary[i];
			}
			for (; i < ary.length - n; i++) {
				c[i] = ary[i + n];
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

		System.out.println("삭제 할 요소의 인덱스:");
		int keyIdx = sc.nextInt();
		System.out.println("삭제 할 요소의 개수 :");
		int n = sc.nextInt();

		int[] y = aryRmvOfN(ary, keyIdx, n);

		// 출력
		for (int i = 0; i < y.length; i++) {
			System.out.println("y[" + i + "]=" + y[i]);
		}
	}

}
