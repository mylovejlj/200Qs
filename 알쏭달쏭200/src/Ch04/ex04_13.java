package Ch04;

import java.util.Scanner;

//앞 문제와 반대로 0부터 양의 정수까지 카운트업하는 프로그램을 만들자
public class ex04_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카운트다운 합니다.");
		
		int x ;
		
		do {
			System.out.println("양의 정숫값:");
			x = sc.nextInt();
		}while(x<=0);
		
		for(int i = 0; i <= x; i++) {
			System.out.println(i);
		}
		
	}


}
