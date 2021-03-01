package Ch02;

import java.util.Scanner;

//2개의 실숫값을 입력받아 합과 평균을 구하자
public class ex02_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형의 넓이를 구합니다.");
		System.out.println("밑변:");
		double x = sc.nextDouble();
		
		System.out.println("높이:");
		double y = sc.nextDouble();
		
		System.out.println("넓이는" + (x*y)/2 + "입니다.");
	}

}
