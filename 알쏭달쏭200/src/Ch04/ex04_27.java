package Ch04;

import java.util.Scanner;

//�������� �о �հ�� ����� ���ϴ� ���α׷��� �ۼ�����. ��, �������� �Է��� �հ谡 1,000�� ���� ���� �������� �̷�� �� ��.
public class ex04_27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("������ ���մϴ�.");
		System.out.println("��� ���ұ��?");

		int n = sc.nextInt();
		int i;
		int k;
		int sum = 0;

		for (i = 0; i < n; i++) {
			
			System.out.println("����:");
			k = sc.nextInt();

			

			if (sum + k >= 1000) {
				System.out.println("�հ谡 1000�� �Ѿ����ϴ�.");
				System.out.println("������ ���� �����մϴ�.");

				break;

			}
			sum += k;
		}

		System.out.println("�հ��:" + sum + "�Դϴ�");
		if( i != 0)
		System.out.println("�����:" + sum / i + "�Դϴ�");

	}

}
