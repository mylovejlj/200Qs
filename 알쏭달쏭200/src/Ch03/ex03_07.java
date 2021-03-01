package Ch03;

import java.util.Scanner;

//2개의 변수 a,b에 값을 읽어서a,b의 대소 관계를 다음과 같이 표시하는 프로그램을 작성하자.
//"a가 크다","b가 크다","a와 b가 같다"
public class ex03_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("변수a:");
		int a = sc.nextInt();
		
		System.out.println("변수b:");
		int b = sc.nextInt();
		
		if (a<b) {
			System.out.println("b가 크다.");
		}else if ( a>b) {
			System.out.println("a가 크다.");
		}else {
			System.out.println("a와 b는 같다.");
		}

	}

}
