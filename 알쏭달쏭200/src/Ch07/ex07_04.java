package Ch07;

//정수의 합 구하기.
import java.util.Scanner;

public class ex07_04 {

	static int sum(int x) {

		int sum = 0;

		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 x까지의 합을 구하자.");

		int x;
		do {

			System.out.println("x의 값:");
			x = sc.nextInt();

		} while (x <= 0);

		System.out.println("1부터" + x + "까지의 합은" + sum(x) + "입니다.");

	}

}
