package Ch07;

import java.util.Scanner;

public class ex07_31 {

	static int absolute(int x) {
		return x < 0 ? -x : x;
	}

	static long absolute(long x) {
		return x < 0 ? -x : x;
	}

	static float absolute(float x) {
		return x < 0 ? -x : x;
	}

	static double absolute(double x) {
		return x < 0 ? -x : x;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("int�� ���� a�� ��:");
		int a = sc.nextInt();
		System.out.println("long�� ���� b�� ��:");
		long b = sc.nextLong();
		System.out.println("float�� �Ǽ��� ��:");
		float c = sc.nextFloat();
		System.out.println("double�� �Ǽ� d�� ��:");
		double d = sc.nextDouble();

		System.out.println("a�� ������" + absolute(a) + "�Դϴ�.");
		System.out.println("b�� ������" + absolute(b) + "�Դϴ�.");
		System.out.println("c�� ������" + absolute(c) + "�Դϴ�.");
		System.out.println("d�� ������" + absolute(d) + "�Դϴ�.");

	}

}
