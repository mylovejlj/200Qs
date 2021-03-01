package Ch04;

import java.util.Scanner;

//정숫값을 연달아 읽어서 음수가 아닌 값의 합계와 평균을 구하자. 음수의 개수는 평균을 구할 때 분모에서 제외할 것.
public class ex04_28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 더합니다.");
		System.out.println("몇개를 더할까요?");

		int n = sc.nextInt();
		int i;
		int k;
		int sum = 0;
		int cnt = 0;

		for (i = 0; i < n; i++) {
			
			System.out.println("정수:");
			k = sc.nextInt();

			
			//방법1.
//			if (k < 0) {
//				System.out.println("음수는 더하지 않습니다.");
//			}else {
//				sum += k;
//				cnt++;
//			}

			//방법2.
			if (k < 0) {
				System.out.println("음수는 더하지 않습니다.");
				continue;
			}
				sum += k;
				cnt++;
		}

		System.out.println("합계는:" + sum + "입니다");
		if( i != 0)
		System.out.println("평균은:" + sum / cnt + "입니다");
	}

}
