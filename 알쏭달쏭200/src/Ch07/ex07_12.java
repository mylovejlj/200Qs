package Ch07;

import java.util.Scanner;

public class ex07_12 {

	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	static int rRotate(int x, int n) {
		if (n < 0)
			return lRotate(x, -n);
		n %= 32;
		return (n == 0 ? x : (x << n) | (x >>> (32 - n)));
	}

	static int lRotate(int x, int n) {
		if (n < 0)
			return rRotate(x, -n);
		n %= 32;
		return (n == 0 ? x : (x << n) | (x >>> (32 - n)));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("����x�� n��Ʈ ȸ�� �մϴ�.");
		System.out.println("x:");
		int x = sc.nextInt();
		System.out.println("n:");
		int n = sc.nextInt();

		System.out.println("ȸ�� �� =");
		printBits(x);

		System.out.println("\n������ ȸ�� =");
		printBits(rRotate(x, n));
		System.out.println("\n���� ȸ��");
		printBits(lRotate(x, n));
	}

}
