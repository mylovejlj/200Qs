package Ch06;

import java.util.Random;
import java.util.Scanner;

//요일을 표시하고 해당 요일의 영어 단어를 입력하는 영어학습 프로그램을 만들자
public class ex06_16 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		String[] dayKor = { "일","월","화","수","목","금","토" };
		String[] dayEng = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		
		System.out.println("요일 명을 영어소문자로 입력하세요.");

		int retry;
		int last = -1;

		do {
			//문제 출제 부분
			int day;

			do {
				day = rd.nextInt(7);
			} while (day == last);
			last = day;

			//정답 입력 및 판정 부분
			while (true) {
				
				System.out.println(dayKor[day]+ "요일:");
				String answer = sc.next();

				if (answer.equals(dayEng[day])) {
					break;
				}
				System.out.println("틀렸습니다.");

			}
			System.out.println("정답입니다! 다시 한번?  YES-1, NO-0");
			retry = sc.nextInt();

		} while (retry == 1);

	
}

}
