package Ch07;

import java.util.Scanner;

public class ex07_13 {

	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	static int set(int x, int pos) {
		return x | (1 << pos);
	}

	static int reset(int x, int pos) {
		return x & ~(1 << pos);
	}

	static int inverse(int x, int pos) {
		return x ^ (1 << pos);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("����x�� pos��° ��Ʈ�� �����մϴ�.");
		System.out.println("x:");
		int x = sc.nextInt();
		System.out.println("pos:");
		int pos = sc.nextInt();

		System.out.print("x                   =");
		printBits(x);
		System.out.print("\nset(x,pos)        =");
		printBits(set(x, pos));
		System.out.print("\nreset(x,pos)        =");
		printBits(reset(x, pos));
		System.out.print("\ninverse(x,pos)        =");
		printBits(inverse(x, pos));
	}

}
