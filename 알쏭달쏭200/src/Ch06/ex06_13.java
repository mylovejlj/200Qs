package Ch06;

import java.util.Random;
import java.util.Scanner;

//�迭�� ���� ������ ���� ���α׷��� ������
public class ex06_13 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		// ��� �� �б�
		System.out.print("��� ��:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		// �迭 ����
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int idx1 = 0 + rd.nextInt(n);
			int idx2 = 0 + rd.nextInt(n);

			int tmp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = tmp;
		}

		// ���
		for (int i = 0; i < n; i++) {
			System.out.println("��Ҹ� �������ϴ�.");
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

}
