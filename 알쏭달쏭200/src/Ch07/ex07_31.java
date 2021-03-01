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

		System.out.println("int형 정수 a의 값:");
		int a = sc.nextInt();
		System.out.println("long형 정수 b의 값:");
		long b = sc.nextLong();
		System.out.println("float형 실수의 값:");
		float c = sc.nextFloat();
		System.out.println("double형 실수 d의 값:");
		double d = sc.nextDouble();

		System.out.println("a의 절댓값은" + absolute(a) + "입니다.");
		System.out.println("b의 절댓값은" + absolute(b) + "입니다.");
		System.out.println("c의 절댓값은" + absolute(c) + "입니다.");
		System.out.println("d의 절댓값은" + absolute(d) + "입니다.");

	}

}
