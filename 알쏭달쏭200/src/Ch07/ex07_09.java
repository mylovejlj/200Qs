package Ch07;

import java.util.Scanner;

public class ex07_09 {

	static int readPlusInt() {

		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.println("양의 정숫값:");
			n = sc.nextInt();
		} while (n <= 0);

		return n;

	}

	public static void main(String[] args) {

		int retry;
		do {

			int target = readPlusInt();

			System.out.print("반대로 읽으면");

			do {
				System.out.print(target % 10);
				target /= 10;
			} while (target > 0);
			System.out.println();

			do {
				Scanner sc = new Scanner(System.in);

				System.out.println("다시 하시겠습니까? YES-1 NO-0");
				retry = sc.nextInt();
			} while (retry != 0 && retry != 1);

		} while (retry == 1);
	}

}
