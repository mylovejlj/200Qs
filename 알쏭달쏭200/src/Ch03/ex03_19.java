package Ch03;

import java.util.Scanner;

//3개의 정숫값을 오름차순(작은 순)으로 정렬하는 프로그램을 작성하자.
public class ex03_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수a:");
		int a = sc.nextInt();
		
		System.out.println("정수b:");
		int b = sc.nextInt();
		
		System.out.println("정수c:");
		int c = sc.nextInt();
		
		int tmp;
		
		if(a>b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		
		if(b>c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		
		if(a>b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		
		System.out.println("a<=b<=c가 되도록 정렬했습니다.");
		System.out.println("변수a는"+ a +"입니다.");
		System.out.println("변수b는"+ b +"입니다.");
		System.out.println("변수c는"+ c +"입니다.");

	}
}