package Ch03;

import java.util.Scanner;

//2개의 실숫값 중 큰 값을 표시하자
public class ex03_12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실수a:");
		double a = sc.nextDouble();
		
		System.out.println("실수b:");
		double b = sc.nextDouble();
		
		double max = a>b ? a : b;
		
		System.out.println("큰 값은"+ max +"입니다.");
		
	}

}
