package Ch04;

import java.util.Scanner;

//�������� �����ؼ� �Է��� �޾� �հ�� ����� ���ϴ� ���α׷��� �ۼ�����.(0�Է� �� ���α׷� ����)
public class ex04_26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���մϴ�.");
		System.out.println("��� ���ұ��?");
		
		int n = sc.nextInt();
		int i;
		int sum = 0;

		for (i = 0; i < n; i++) {
			System.out.println("����(0���� ����):");
			
			int k = sc.nextInt();
			sum += k;
			
			if (k == 0) {
				break;
			}
		}

		System.out.println("�հ��:" + sum + "�Դϴ�");
		System.out.println("�����:" + sum / i + "�Դϴ�");
	}

}
