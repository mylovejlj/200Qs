package Ch03;

import java.util.Scanner;

//2개의 정숫값을 내림차순(큰 순)으로 정렬하는 프로그램을 작성하자
public class ex03_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수a:");
		int a = sc.nextInt();
		
		System.out.println("정수b:");
		int b = sc.nextInt();
		
		if(a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		System.out.println("a>=b가 되도록 정렬했습니다.");
		System.out.println("변수a는"+ a +"입니다.");
		System.out.println("변수b는"+ b +"입니다.");
	}

}

