package Ch04;

import java.util.Scanner;

//문제 4-14 프로그램을 수정하여 결과뿐만 아니라 계산식까지 표시하는 프로그램을 만들자
public class ex04_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 x까지의 합을 구합니다.");
		
		int x ;
		
		do {
			System.out.println("x의값:");
			x = sc.nextInt();
		}while(x<=0);
			
		int sum =0;
		
		for(int i=1; i<x; i++) {
			
			System.out.print(i+"+");
			sum += i;
		}
		System.out.print(x + "=");
		sum += x;
		System.out.print(sum);
		
	}

}
