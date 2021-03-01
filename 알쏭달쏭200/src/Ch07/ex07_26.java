package Ch07;

import java.util.Scanner;

public class ex07_26 {

	// �޼ҵ�
	static int[] aryInsOfN(int[] ary, int keyIdx, int n) {

		if (keyIdx < 0 || keyIdx >= ary.length) {

			return ary.clone();

		} else {

			int[] c = new int[ary.length + 1];
			int i = 0;
			for (; i < keyIdx; i++) {
				c[i] = ary[i];
			}
			
			c[keyIdx] = n;
			
			for (; i < ary.length; i++) {
				c[i+1] = ary[i];
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
		System.out.println("���� �� ����� �� :");
		int n = sc.nextInt();

		int[] y = aryInsOfN(ary, keyIdx, n);

		// ���
		for (int i = 0; i < y.length; i++) {
			System.out.println("y[" + i + "]=" + y[i]);
		}
	}
}
