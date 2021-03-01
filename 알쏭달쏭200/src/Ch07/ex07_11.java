package Ch07;

import java.util.Scanner;

public class ex07_11 {

	static int pow2(int no) {

		int pw = 1;

		while (no-- > 0)
			pw *= 2;

		return pw;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("������ n��Ʈ ����Ʈ �մϴ�.");
		System.out.println("x:");
		int x = sc.nextInt();
		System.out.println("n:");
		int n = sc.nextInt();

		int mPower = x * pow2(n);
		int dPower = x / pow2(n);
		int lShift = x << n;
		int rShift = x >> n;

		System.out.printf("[a] x x (2�� %d��) = %d\n", n, mPower);
		System.out.printf("[b] x / (2�� %d��) = %d\n", n, dPower);
		System.out.printf("[c] x << %d = %d\n", n, lShift);
		System.out.printf("[d] x >> %d = %d\n", n, rShift);

		System.out.println("[a]��[c]�� ���� ��ġ" + ((mPower == lShift) ? "�մϴ�" : "���� �ʽ��ϴ�"));
		System.out.println("[b]��[d]�� ���� ��ġ" + ((dPower == rShift) ? "�մϴ�" : "���� �ʽ��ϴ�"));
	}

}
