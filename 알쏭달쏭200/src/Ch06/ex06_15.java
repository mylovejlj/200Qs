package Ch06;

import java.util.Random;
import java.util.Scanner;

//월욜 1~12의 숫자로 표시하고 해당 월의 영어단어를 입력하자.
public class ex06_15 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		String[] monthArr = { "January", " February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		System.out.println("해당 월의 영어단어를 입력하세요.");
		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");

		int retry;
		int last = -1;

		do {
			//문제 출제 부분
			int month;

			do {
				month = rd.nextInt(12);
			} while (month == last);
			last = month;

			//정답 입력 및 판정 부분
			while (true) {
				
				System.out.println(month + "월:");
				String answer = sc.next();

				if (answer.equals(monthArr[month - 1])) {
					break;
				}
				System.out.println("틀렸습니다.");

			}
			System.out.println("정답입니다! 다시 한번?  YES-1, NO-0");
			retry = sc.nextInt();

		} while (retry == 1);

	}

}
