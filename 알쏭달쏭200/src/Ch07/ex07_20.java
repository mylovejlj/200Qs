package Ch07;

import java.util.Scanner;

public class ex07_20 {

	// �� �Է� �޼ҵ�
	static void aryIns(int[] arr, int idx, int x) {

		for (int i = arr.length-1; i > idx; i--) {
			arr[i] = arr[i - 1];
		}
		arr[idx] = x;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// �迭 ����
		System.out.println("a��� ��:");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		// �ε����� �� �Է� �κ�
		int idx;
		do {
			System.out.println("������ ����� �ε��� :");
			idx = sc.nextInt();
		} while (idx < 0 || idx >= num);

		System.out.println("������ �� :");
		int x = sc.nextInt();

		// ���� �۾�
		aryIns(arr, idx, x);

		// ���
		for (int i = 0; i < num; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}
}
