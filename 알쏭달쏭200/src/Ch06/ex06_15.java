package Ch06;

import java.util.Random;
import java.util.Scanner;

//���� 1~12�� ���ڷ� ǥ���ϰ� �ش� ���� ����ܾ �Է�����.
public class ex06_15 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		String[] monthArr = { "January", " February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		System.out.println("�ش� ���� ����ܾ �Է��ϼ���.");
		System.out.println("ù ���ڴ� �빮��, �������� �ҹ��ڷ� �Է��ϼ���.");

		int retry;
		int last = -1;

		do {
			//���� ���� �κ�
			int month;

			do {
				month = rd.nextInt(12);
			} while (month == last);
			last = month;

			//���� �Է� �� ���� �κ�
			while (true) {
				
				System.out.println(month + "��:");
				String answer = sc.next();

				if (answer.equals(monthArr[month - 1])) {
					break;
				}
				System.out.println("Ʋ�Ƚ��ϴ�.");

			}
			System.out.println("�����Դϴ�! �ٽ� �ѹ�?  YES-1, NO-0");
			retry = sc.nextInt();

		} while (retry == 1);

	}

}
