package Ch03;

import java.util.Scanner;

//문제3-3의 프로그램을 논리부정연산자를 사용해서 수정하자.
public class ex03_04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("변수A:");
		int a = sc.nextInt();
		
		System.out.println("변수B:");
		int b = sc.nextInt();
		
		if (a % b != 0) {
			System.out.println("B는 A의 약수가 아니다.");
		}else {
			System.out.println("B는 A의 약수이다.");
		}
	}

}
