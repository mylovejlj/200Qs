package Ch07;

import java.util.Scanner;

//�߰��� ���ϱ�
public class ex07_03 {

	static int med(int a, int b, int c) {

		if (a >= b) {
			if (b >= c) {
				return b;
			} else if (a <= c) {
				return a;
			} else {
				return c;
			}
		} else if (a > c) {
			return a;
		} else if (b > c) {
			return c;
		} else {
			return b;
		}

		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("����a:");
		int a = sc.nextInt();
		System.out.println("����b:");
		int b = sc.nextInt();
		System.out.println("����c:");
		int c = sc.nextInt();

		System.out.println("�߰�����" + med(a, b, c) + "�Դϴ�.");
	}

}
