package Ch07;

import java.util.Scanner;

public class ex07_24 {

	// �޼ҵ�
	static int[] aryRmvOf(int[] ary, int keyIdx) {

		if (keyIdx < 0 || keyIdx >= ary.length) {
			return ary.clone();

		} else {
			int[] c = new int[ary.length - 1];
			int i = 0;
			for (; i < keyIdx; i++) {
				c[i] = ary[i];

			}
			for (; i < ary.length - 1; i++) {
				c[i] = ary[i + 1];
			}
			return c;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// �迭A ����
		System.out.print("��� ��:");
		int num = sc.nextInt();
		int[] ary = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("ary[" + i + "]=");
			ary[i] = sc.nextInt();
		}

		System.out.println("���� �� ����� �ε���:");
		int keyIdx = sc.nextInt();
		int[] y = aryRmvOf(ary, keyIdx);

		// ���
		for (int i = 0; i < y.length; i++) {
			System.out.println("y[" + i + "]=" + y[i]);
		}
	}

}
