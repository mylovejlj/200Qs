package Ch04;

import java.util.Scanner;

//양의 정숫값을 읽어서 그 자릿수를 출력하는 프로그램을 만들자
public class ex04_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수값의 자릿수를 표시합니다.");
		
		int x;
		
		do {
			System.out.println("양의 정숫값:");
			x = sc.nextInt();
		}while(x<=0);
		
		int digit=0;
		
		while(x>0) {
			x /= 10;
			digit++;
		};
		System.out.println("입력한 숫자는"+ digit +"자리입니다.");
		
	}

}
