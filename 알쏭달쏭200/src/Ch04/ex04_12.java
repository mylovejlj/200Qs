package Ch04;

import java.util.Scanner;

//양의 정숫값을 0까지 카운트 다운하는 [묹[4-5]를 for문으로 작성하가
//단, 반복 종료 후의 x값은 표시하지 않아도 된다.
public class ex04_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("카운트다운 합니다.");
		
		int x ;
		
		do {
			System.out.println("양의 정숫값:");
			x = sc.nextInt();
		}while(x<=0);
		
		for(x=x; x>=0; x--) {
			System.out.println(x);
		}
		
	}

}
