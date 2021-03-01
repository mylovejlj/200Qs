package Ch03;

import java.util.Scanner;

//문제3-5의 프로그램에서 마지막 ELSE를 ELSE IF (n==0)으로 변경하면 어떻게 되는지 확인하자.
public class ex03_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("정숫값:");
		int a = sc.nextInt();
		
		if (a < 0) {
			System.out.println("값이 음수입니다.");
		}else if ( a > 0) {
			System.out.println("값이 양수입니다.");
		}else if(a == 0) {
			System.out.println("값이 0입니다.");
		}
		//결과는 동일하다.

	}

}
