package Ch02;

import java.util.Random;
import java.util.Scanner;
//키보드에서 입력한 정숫값을 +5 또는 -5범위의 랜덤 정숫값을 생성하자.
public class ex02_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("정숫값:");
		int x = sc.nextInt();
		
		System.out.println("입력 값의 +-5 범위의 난수를 생성했습니다.");
		//nextInt(n) : 0 ~ n-1 까지의 난수 생성. 즉 n-1개 생성.
		System.out.println("값은"+(x-5 + rnd.nextInt(11) + "입니다."));
		
	
	}

}
