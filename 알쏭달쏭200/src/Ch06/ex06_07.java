package Ch06;

import java.util.Scanner;

//���� ������ �հ�, ���, �ְ���, �������� ������.
public class ex06_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("��� ��:");

		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "�� ����:");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		System.out.println("�հ��" + sum + "�Դϴ�.");
		System.out.println("�����" + (double)sum / n + "�Դϴ�.");

		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < n; i++) {
			
			
			if (arr[i] >= max) {
				max = arr[i];
			}

			if (arr[i] <= min) {

				min = arr[i];
			}
		}
		System.out.println("�ְ�����" + max + "�Դϴ�.");
		System.out.println("��������" + min + "�Դϴ�.");
	}

}
