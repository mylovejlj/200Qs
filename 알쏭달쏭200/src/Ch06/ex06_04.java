package Ch06;

import java.util.Random;
import java.util.Scanner;

//int�� �迭�� �� ��ҿ� 1~!0�� ������ �����ϰ� �� ����� ���� ����׷����� ǥ���غ���
public class ex06_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("��Ҽ�:");
		// �迭 ����� ��
		int n = sc.nextInt();
		// �迭 ����
		int[] arr = new int[n];

		// ���� �����ؼ� �迭�� ����
		for (int i = 0; i < n; i++) {
			arr[i] = 1 + rnd.nextInt(10);
		}

		//
		for (int i = 10; i >= 1; i--) {
			for (int j = 0; j < n; j++) {
				if (arr[j] >= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		//�� ǥ��
		for (int i = 0; i < (2 * n); i++) {
			System.out.print('-');
		}
		System.out.println();

		//�迭 �ε����� 10���� ���� ������ ǥ��
		for (int i = 0; i < n; i++) {
			System.out.print(i % 10 + " ");
		}
		System.out.println();
	}

}
