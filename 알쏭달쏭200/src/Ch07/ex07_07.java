package Ch07;

import java.util.Scanner;

public class ex07_07 {

	static void putChars(char c, int n) {
		while (n-- > 0) {
			System.out.print(c);
		}
	}

	static void putStars(int n) {
		putChars('*', n);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�.");
		System.out.println("�� ���� �Է��ϼ���.");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}

	}

}
