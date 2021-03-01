package Ch04;

import java.util.Scanner;

//정숫값의 부호를 판정해서 표시하는 Sign프로그램인 문제3-5를 원하는 만큼 반복해서 입력 및 표시하도록 수정하자.
public class ex04_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int retry;
		
		do {
			
			System.out.println("정숫값:");
			int a = sc.nextInt();
			
			if (a < 0) {
				System.out.println("값이 음수입니다.");
			}else if ( a > 0) {
				System.out.println("값이 양수입니다.");
			}else {
				System.out.println("값이 0입니다.");
			}
			
			System.out.println("다시 한번하시겠습니까? 1-YES. 2-NO");
			
			retry=sc.nextInt();
			
		}while(retry==1);

	}

}
