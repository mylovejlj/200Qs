package Ch07;

import java.util.Scanner;

public class ex07_23 {

	// �޼ҵ�
	static int[] arySearch(int[] ary, int key) {

		int cnt = 0;

		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == key) {
				cnt++;
			}
		}
		
		int[] aryIdx = new int[cnt--];
		for (int i = ary.length-1; cnt >=0; i--) {
			if (ary[i] == key) {
				aryIdx[cnt--] = i;
			}
		}
		return aryIdx;
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

		System.out.println("Ž���� ��:");
		int key = sc.nextInt();
		// Ž�� �۾�
		int[] aryIdx = arySearch(ary, key);

		System.out.println("��ġ�ϴ� ����� �ε���");

		// ���
		for (int i = 0; i < aryIdx.length; i++) {
			System.out.println(aryIdx[i]);
		}
	}
}
