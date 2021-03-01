package Ch04;

import java.util.Scanner;

//기호 문자를 임의의 개수만큼 출력했던 [문제 4-7]을 for문으로 작성하자
public class ex04_11 {

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
