package Ch04;

import java.util.Scanner;

//읽은 값의 개수만큼 *와 +를 번갈아 가며 표시하는 프로그램을을 작성하자
//(마지막에는 줄 바꿈 문자를 출력 할 것)
public class ex04_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {

			if (i % 2 == 0) { // 짝수이면
				System.out.print('*');
			} else { // 홀수이면
				System.out.print('+');
			}
		}

		System.out.println();

	}

}
