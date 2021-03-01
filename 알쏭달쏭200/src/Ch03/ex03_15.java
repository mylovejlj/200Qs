package Ch03;

import java.util.Scanner;

//키보드에서 입력한 3개의 정수 중 최솟값을 구하는 프로그램을 작성하시오.
public class ex03_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수a:");
		int a = sc.nextInt();
		
		System.out.println("정수b:");
		int b = sc.nextInt();
		
		System.out.println("정수c");
		int c = sc.nextInt();
		
		int min = a; 
		
		if (b < min) 
			min = b;
		else if (c < min)
			min = c;
		
		System.out.println("최솟 값은" + min + "입니다");

	}

}
