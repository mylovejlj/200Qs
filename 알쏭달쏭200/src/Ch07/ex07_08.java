package Ch07;

import java.util.Random;
import java.util.Scanner;

public class ex07_08 {

	static int random(int min, int max) {
		
		Random rand = new Random();
		
		if (min>=max) {
			return min;
		}else {
			return min + rand.nextInt(max-min+1);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("난수를 생성합니다.");
		System.out.println("하한 값:");
		int min = sc.nextInt();

		System.out.println("상한 값:");
		int max = sc.nextInt();

		
		System.out.println(random(min, max));
	}

}
