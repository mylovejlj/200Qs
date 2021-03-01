package Ch03;

import java.util.Scanner;

//정숫값을 읽어 부호(양수/음수/0)를 판정하는 프로그램을 만들자.
public class ex03_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정숫값:");
		int a = sc.nextInt();
		
		if (a < 0) {
			System.out.println("값이 음수입니다.");
		}else if ( a > 0) {
			System.out.println("값이 양수입니다.");
		}else {
			System.out.println("값이 0입니다.");
		}

	}

}
