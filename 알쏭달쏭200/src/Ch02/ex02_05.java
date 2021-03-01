package Ch02;

import java.util.Scanner;

//키보드에서 입력한 정숫값을 표시하는 프로그램을 작성하자
public class ex02_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정숫값:");
		
		int x = sc.nextInt();
		System.out.println(x+ "을(를)88 입력하셨습니다.");
	}

}
