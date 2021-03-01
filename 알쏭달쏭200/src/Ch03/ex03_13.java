package Ch03;

import java.util.Scanner;

//2개의 정숫값을 읽어서 두 값의 차를 표시하는 프로그램을 작성하자.
public class ex03_13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수a:");
		int a = sc.nextInt();
		
		System.out.println("정수b:");
		int b = sc.nextInt();
		
		int diff = a-b < 0 ? b-a : a-b; 
		
		System.out.println("두 값의 차는"+ diff +"입니다.");
	
	}

}
