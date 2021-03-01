package Ch06;

import java.util.Random;
import java.util.Scanner;

//서로 다른 요소가 동일한 값을 지니지 않도록 6-10의 프로그램을 수정하자.
public class ex06_12 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		//요소 수 읽기
		int n;
		do {
			System.out.print("요소 수:");
			n = sc.nextInt();
		} while (n > 10);

		
		int[] arr = new int[n];
		
		// 배열 생성
		int j;
		for (int i = 0; i < n; i++) {

			do {
				
				arr[i] = 1 + rd.nextInt(10);
				for(j=0; j<i;j++) {
					if(arr[j]==arr[i]) {
						break;
					}
				}
			} while (i>j);

		}

		// 출력
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}

	}

}
