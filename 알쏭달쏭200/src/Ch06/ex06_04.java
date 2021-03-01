package Ch06;

import java.util.Random;
import java.util.Scanner;

//int형 배열의 각 요소에 1~!0의 난수를 대입하고 각 요소의 값을 막대그래프로 표시해보자
public class ex06_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("요소수:");
		// 배열 요소의 수
		int n = sc.nextInt();
		// 배열 생성
		int[] arr = new int[n];

		// 난수 생성해서 배열에 대입
		for (int i = 0; i < n; i++) {
			arr[i] = 1 + rnd.nextInt(10);
		}

		//
		for (int i = 10; i >= 1; i--) {
			for (int j = 0; j < n; j++) {
				if (arr[j] >= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		//줄 표시
		for (int i = 0; i < (2 * n); i++) {
			System.out.print('-');
		}
		System.out.println();

		//배열 인덱스를 10으로 나눈 나머지 표시
		for (int i = 0; i < n; i++) {
			System.out.print(i % 10 + " ");
		}
		System.out.println();
	}

}
