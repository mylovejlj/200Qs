package Ch04;

import java.util.Scanner;

// 입력한 값의 개수만큼 '*'를 표시하는 프로그램을 작성하자. 마지막에는 줄 바꿈 문자를 출력할 것. 단, 읽은 값이 1미만이면 줄 바꿈 문자를 표시해서는 안된다.
public class ex04_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 개의 별을 출력할까요?");
		
		int x = sc.nextInt();
		
		if(x>0) {
			for(int i=0; i<x; i++) {
				System.out.print('*');		//문자 리터럴 ''사용
			}
			System.out.println();
		}
	}

}
