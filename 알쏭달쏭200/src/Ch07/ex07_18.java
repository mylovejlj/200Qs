package Ch07;

import java.util.Scanner;

public class ex07_18 {

	// �տ��� ���� Ž��
	static void aryRmv(int[] arr, int tgtIdx) {

		for (int i = tgtIdx; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("��� ��:");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		int tgtIdx;
		do {
			System.out.println("������ ����� �ε��� :");
			tgtIdx = sc.nextInt();
		} while (tgtIdx < 0 || tgtIdx >= num);

		aryRmv(arr, tgtIdx);

		for (int i = 0; i < num; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

}
