package Ch04;

import java.util.Scanner;

//����4-3�� ���� ���߱� ���ӿ��� ������ ������ 0-99�� �����ϰ� �÷��̾ �Է��� �� �ִ� Ƚ���� ���� �ϵ��� ���α׷��� ��������. 
//���� Ƚ�� ���� ������ ���� ��쿡�� ������ ǥ���ϰ� ������ ������ ��.
public class ex04_30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rnd = (int) (Math.random() * (99 - 0 + 1) + 0);

		System.out.println("���� ���߱� ���� ����!");

		System.out.println("0���� 99������ ���ڸ� ���߼���.");

		int x;
		final int maxInt = 6;
		int cnt = maxInt;

		do {

			System.out.println("���� Ƚ��" + (cnt--) + "ȸ,� ���� �ϱ��?");

			x = sc.nextInt();

			if (x > rnd) {
				System.out.println("�� ���� �����Դϴ�.");
			} else if (x < rnd) {
				System.out.println("�� ū �����Դϴ�.");
			}

		} while (x != rnd && cnt > 0);

		if (x == rnd) {
			System.out.println("�����Դϴ�!");
			System.out.println((maxInt-cnt)+"ȸ ���� ���߼̳׿�.");
		} else {
			System.out.println("�ƽ��׿�.������"+rnd+"�Դϴ�");
		}
	}
}
