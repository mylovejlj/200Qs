package Ch06;

import java.util.Random;
import java.util.Scanner;

//인접하는 요소가 동일한 값을 가지지 않도록 6-10의 프로그램을 수정하자. 
//예를 들어{1,3,5,5,3,2}가 돼서는 안된다.
public class ex06_11 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("요소 수:");

		int n = sc.nextInt();
		int[] arr = new int[n];

		// 0번째 값 먼저 생성
		arr[0] = 1 + rd.nextInt(10);

		// 1번째 부터 마지막까지 값 생성
		for (int i = 1; i < n; i++) { 
			do {
				arr[i] = 1 + rd.nextInt(10);
			} while (arr[i] == arr[i - 1]); // 조건문이 참이라면 do를 한번 더 실행
		}

		// 출력
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

}
