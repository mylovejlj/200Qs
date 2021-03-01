package Ch05;

import java.util.Scanner;

//10진 정수를 8진수와 16진수로 표시하는 프로그램을 만들자
public class ex05_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수:");
		int x = sc.nextInt();
		
		
		System.out.printf("8진수는 %o입니다.\n",x);
		System.out.printf("16진수는 %x입니다.\n",x);
		
	}

}
