package Ch04;

import java.util.Scanner;

//1부터 n까지의 합을 구하는 프로그램을 for문을 사용해서 만들자
public class ex04_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 x까지의 합을 구합니다.");
		
		int x ;
		
		do {
			System.out.println("x의값:");
			x = sc.nextInt();
		}while(x<=0);
			
		int sum =0;
		
		for(int i=0; i<=x; i++) {
			sum += i;
		}
		System.out.println("1부터"+x+"까지의 합은"+sum+"입니다");
	}

}
