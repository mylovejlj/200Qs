package Ch03;

import java.util.Scanner;

//정숫값을 읽어서 절대값을 구하자
public class ex03_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("정숫값:");

		int a = sc.nextInt();
		
		int abs;
		
		if(a<0) {
			abs = -a;
		}else {
			abs = a;
		}
		
		System.out.println("절대값은"+ abs + "입니다.");
	}

}
