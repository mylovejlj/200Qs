package Ch04;

import java.util.Scanner;

//�������� ���޾� �о ������ �ƴ� ���� �հ�� ����� ������. ������ ������ ����� ���� �� �и𿡼� ������ ��.
public class ex04_28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("������ ���մϴ�.");
		System.out.println("��� ���ұ��?");

		int n = sc.nextInt();
		int i;
		int k;
		int sum = 0;
		int cnt = 0;

		for (i = 0; i < n; i++) {
			
			System.out.println("����:");
			k = sc.nextInt();

			
			//���1.
//			if (k < 0) {
//				System.out.println("������ ������ �ʽ��ϴ�.");
//			}else {
//				sum += k;
//				cnt++;
//			}

			//���2.
			if (k < 0) {
				System.out.println("������ ������ �ʽ��ϴ�.");
				continue;
			}
				sum += k;
				cnt++;
		}

		System.out.println("�հ��:" + sum + "�Դϴ�");
		if( i != 0)
		System.out.println("�����:" + sum / cnt + "�Դϴ�");
	}

}
