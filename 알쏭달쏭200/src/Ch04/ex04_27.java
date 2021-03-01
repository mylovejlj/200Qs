package Ch04;

import java.util.Scanner;

//정숫값을 읽어서 합계와 평균을 구하는 프로그램을 작성하자. 단, 정숫값의 입력은 합계가 1,000을 넘지 않은 범위에서 이루어 질 것.
public class ex04_27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 더합니다.");
		System.out.println("몇개를 더할까요?");

		int n = sc.nextInt();
		int i;
		int k;
		int sum = 0;

		for (i = 0; i < n; i++) {
			
			System.out.println("정수:");
			k = sc.nextInt();

			

			if (sum + k >= 1000) {
				System.out.println("합계가 1000을 넘었습니다.");
				System.out.println("마지막 값은 무시합니다.");

				break;

			}
			sum += k;
		}

		System.out.println("합계는:" + sum + "입니다");
		if( i != 0)
		System.out.println("평균은:" + sum / i + "입니다");

	}

}
