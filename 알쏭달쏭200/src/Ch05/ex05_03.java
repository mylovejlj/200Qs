package Ch05;

import java.util.Scanner;

//float형 변수와 double형 변수에 값을 읽어서 표시하는 프로그램을 만들자.
public class ex05_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("변수 x는 float형입니다. 변수 y는 double형 입니다.");
		
		System.out.println("x : ");
		float x = sc.nextFloat();
		
		System.out.println("y : ");
		double y = sc.nextDouble();

		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}

}
