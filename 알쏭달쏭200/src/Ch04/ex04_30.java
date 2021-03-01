package Ch04;

import java.util.Scanner;

//문제4-3의 숫자 맞추기 게임에서 숫자의 범위를 0-99로 변경하고 플레이어가 입력할 수 있는 횟수를 제한 하도록 프로그램을 수정하자. 
//제한 횟수 내에 맞추지 못한 경우에는 정답을 표시하고 게임을 종료할 것.
public class ex04_30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rnd = (int) (Math.random() * (99 - 0 + 1) + 0);

		System.out.println("숫자 맞추기 게임 시작!");

		System.out.println("0부터 99까지의 숫자를 맞추세요.");

		int x;
		final int maxInt = 6;
		int cnt = maxInt;

		do {

			System.out.println("남은 횟수" + (cnt--) + "회,어떤 숫자 일까요?");

			x = sc.nextInt();

			if (x > rnd) {
				System.out.println("더 작은 숫자입니다.");
			} else if (x < rnd) {
				System.out.println("더 큰 숫자입니다.");
			}

		} while (x != rnd && cnt > 0);

		if (x == rnd) {
			System.out.println("정답입니다!");
			System.out.println((maxInt-cnt)+"회 만에 맞추셨네요.");
		} else {
			System.out.println("아쉽네요.정답은"+rnd+"입니다");
		}
	}
}
