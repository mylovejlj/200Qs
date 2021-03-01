package Ch07;

import java.util.Scanner;

public class ex07_17 {
	// �տ��� ���� Ž��
	static int linearSearch(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	// �ڿ��� ���� Ž��
	static int linearSearchR(int[] arr, int key) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
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

		System.out.println("ã�� �� :");
		int key = sc.nextInt();

		int idxTop = linearSearch(arr, key);
		int idxBtm = linearSearchR(arr, key);

		if (idxTop == -1) {
			System.out.println("�ش簪�� �������� �ʽ��ϴ�.");
		} else if (idxTop == idxBtm) {

			System.out.println("�ش簪��arr[" + idxTop + "]��  �����մϴ�.");
		} else {

			System.out.println("�ش簪�� ��Ұ� ������ �����մϴ�.");
			System.out.println("���� �տ� ��ġ�� ����arr[" + idxTop + "]�� �ֽ��ϴ�.");
			System.out.println("���� �ڿ� ��ġ�� ����arr[" + idxBtm + "]�� �ֽ��ϴ�.");
		}
	}

}
