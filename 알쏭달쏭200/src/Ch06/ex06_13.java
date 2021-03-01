package Ch06;

import java.util.Random;
import java.util.Scanner;

//배열의 나열 순서를 섞는 프로그램을 만들자
public class ex06_13 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		// 요소 수 읽기
		System.out.print("요소 수:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		// 배열 생성
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int idx1 = 0 + rd.nextInt(n);
			int idx2 = 0 + rd.nextInt(n);

			int tmp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = tmp;
		}

		// 출력
		for (int i = 0; i < n; i++) {
			System.out.println("요소를 섞었습니다.");
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

}
