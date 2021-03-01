package Ch04;

import java.util.Scanner;

//양의 정숫값n을 읽어서 1부터 n까지의 곱을 구하는 프로그램을 작성하자.
public class ex04_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		do {
			System.out.println("양의 정숫값:");
			x = sc.nextInt();
		}while(x<=0);
		
		
		int factorial=1;
		int i=1;
		
		while(i<=x) {
			factorial *= i;
			i++;
		}
		//아 이렇게 간단한 것을. 다시 풀어보기!!
	System.out.println(factorial);
	}

}
