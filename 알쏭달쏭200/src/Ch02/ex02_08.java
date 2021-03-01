package Ch02;

import java.util.Scanner;

//2개의 실숫값을 입력받아 합과 평균을 구하자
public class ex02_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실숫값1:");
		double x = sc.nextDouble();
		
		System.out.println("실숫값2:");
		double y = sc.nextDouble();
		
		System.out.println("합계는" + (x+y) + "입니다.");
		System.out.println("평균은" + (x+10)/2 + "입니다.");
	}

}
