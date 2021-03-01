package Ch04;

import java.util.Scanner;

//기호문자 *를 나열해서 n단의 정방향을 표시하는 프로그램을 작성하자
public class ex04_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 단입니까?");
		int n = sc.nextInt();

		for(int i = 1 ; i <= n; i++) {
			for(int j = 1 ; j <= n; j++) {
				System.out.print("*");
				
			}
		System.out.println();
		}
	}

}
