package Ch04;

import java.util.Scanner;

//3자리의 양의 정숫값(100~999)를 읽는 프로그램을 작성하라.
//(입력한 값이 3자리의 양의 정숫값이 아니면 다시 입력하게 할 것)
public class ex04_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		
		do {
			
			System.out.println("세 자리의 정숫값:");
			
			x = sc.nextInt();
		
		}while(x < 100 || 999 < x);
		
		System.out.println("입력한 값은:"+ x +"입니다.");
	}

}
