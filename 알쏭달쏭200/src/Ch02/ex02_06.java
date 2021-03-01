package Ch02;

import java.util.Scanner;

//키보드에서 입력한 정숫값에 10을 더한값과 10을 뺀 값을 출력하자
public class ex02_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정숫값:");
		
		int x = sc.nextInt();
		System.out.println("10을 더한 값은" + (x+10) + "입니다.");
		System.out.println("10을 뺀 값은" + (x-10) + "입니다.");
	}

}
