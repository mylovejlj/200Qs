package Ch06;

import java.util.Scanner;

//�������� �迭�� ��� ����� �հ� ����� ������.
public class ex06_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("��� ��:");

		int n = sc.nextInt();
		double[] arr = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=");
			arr[i] = sc.nextDouble();

		}
		
		double sum = 0;
		for (double i : arr) {
			sum += i;
		}

		System.out.println("�հ��" + sum + "�Դϴ�.");
		System.out.println("�����" +sum / n + "�Դϴ�.");

	}

}
