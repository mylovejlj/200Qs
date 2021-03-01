package Ch06;

import java.util.Random;
import java.util.Scanner;

//요소의 형이 int형인 배열을 만들어서 모든 요소에 1-10의 난수를 대입하자.
public class ex06_10 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("요소 수:");
		
		int n = sc.nextInt();
		int[] arr = new int[n];

		//배열 생성
		for (int i = 0; i < n; i++) {
			arr[i] = 1 + rd.nextInt(10);
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		
	}

}
