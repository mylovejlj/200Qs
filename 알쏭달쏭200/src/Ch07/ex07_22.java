package Ch07;

import java.util.Scanner;

public class ex07_22 {

	// �� �Է� �޼ҵ�
	static int[] aryCopy(int[] A) {

		int[] C = new int[A.length];
		
		for (int i = 0; i < C.length; i++) {
			C[i] = A[i];
		}
		return C;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// �迭A ����
		System.out.print("�迭 A�� ��� ��:");
		int num = sc.nextInt();
		int[] aryA = new int[num];
		

		for (int i = 0; i < num; i++) {
			System.out.print("ary[" + i + "]=");
			aryA[i] = sc.nextInt();
		}

		System.out.println("�迭 A�� �����߽��ϴ�.");

		// ��ȯ �۾�
		int[] aryB = aryCopy(aryA);

		// ���
		for (int i = 0; i < num; i++) {
			System.out.println("aryB[" + i + "]=" + aryB[i]);
		}
	}

}
