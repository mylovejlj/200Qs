package Ch06;

import java.util.Random;
import java.util.Scanner;

//배열 a의 모든 요소를 역순으로 배열 b에 복사하는 프로그램을 만들자. 두 배열의 요소수는 동일하다해도 좋다.
public class ex06_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 요소 수 읽기
		System.out.print("요소 수:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		int[] arr_copy = new int[n];

		// 배열 생성
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			
				arr_copy[i] = arr[n-1-i];
		
		}		
		
		// 출력
		for (int i = 0; i < n; i++) {
			System.out.println("요소를 역순으로 배열했습니다.");
			System.out.println("arr_copy[" + i + "]=" + arr_copy[i]);
		}
	}

}
