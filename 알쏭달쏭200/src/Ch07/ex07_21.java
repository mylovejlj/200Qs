package Ch07;

import java.util.Scanner;

public class ex07_21 {

	// �� �Է� �޼ҵ�
	static void aryExchng(int[] aryA, int[] aryB) {
		
		int n = aryA.length > aryB.length ? aryB.length : aryA.length;
		int tmp;
		for (int i = 0; i < n; i++) {
			tmp = aryA[i];
			aryA[i] = aryB[i];
			aryB[i] = tmp;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// �迭A ����
		System.out.print("�迭 A�� ��� ��:");
		int numA = sc.nextInt();
		int[] arrA = new int[numA];

		for (int i = 0; i < numA; i++) {
			System.out.print("arrA[" + i + "]=");
			arrA[i] = sc.nextInt();
		}

		// �迭B ����
		System.out.print("�迭 B�� ��� ��:");
		int numB = sc.nextInt();
		int[] arrB = new int[numB];

		for (int i = 0; i < numB; i++) {
			System.out.print("arrB[" + i + "]=");
			arrB[i] = sc.nextInt();
		}

		System.out.println("�迭 A�� B�� ��ȯ�߽��ϴ�.");

		// ��ȯ �۾�
		aryExchng(arrA, arrB);

		// ���
		for (int i = 0; i < numA; i++) {
			System.out.println("arrA[" + i + "]=" + arrA[i]);
		}
		System.out.println("-----------------------------------");
		// ���
		for (int i = 0; i < numB; i++) {
			System.out.println("arrB[" + i + "]=" + arrB[i]);
		}
	}

}
