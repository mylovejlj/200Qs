package Ch04;

import java.util.Scanner;

//신장별 표준 체중 대응표를 표시하는 프로그램을 작성하자. 표시할 신장의 범위(시작값,종료값,증가값)는 정숫값으로 입력할 것
public class ex04_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 cm부터:");
		int hMin = sc.nextInt();
	
		System.out.println("몇 cm까지:");
		int hMax = sc.nextInt();
	
		System.out.println("몇 cm단위:");
		int step = sc.nextInt();
	
		System.out.println("신장 표준 체중");
		System.out.println("-------------------");
	
		for(int i = hMin; i <= hMax; i += step) {
			
			System.out.println(i + " " + (i - 100)*0.9);
		}
	}

}
