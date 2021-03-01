package Ch04;

import java.util.Scanner;

//정숫값을 연속해서 입력을 받아 합계와 평균을 구하는 프로그램을 작성하자.(0입력 시 프로그램 종료)
public class ex04_26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.println("몇개를 더할까요?");
		
		int n = sc.nextInt();
		int i;
		int sum = 0;

		for (i = 0; i < n; i++) {
			System.out.println("정수(0으로 종료):");
			
			int k = sc.nextInt();
			sum += k;
			
			if (k == 0) {
				break;
			}
		}

		System.out.println("합계는:" + sum + "입니다");
		System.out.println("평균은:" + sum / i + "입니다");
	}

}
