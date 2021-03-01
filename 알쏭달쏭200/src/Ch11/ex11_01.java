package Ch11;

import java.util.GregorianCalendar;
import java.util.Random;

class LuckyDraw {

	public static void main(String[] args) {

		GregorianCalendar today = new GregorianCalendar();

		// int y = today.get(YEAR);
		int y = today.get(GregorianCalendar.YEAR);
		int m = today.get(GregorianCalendar.MONTH);
		int d = today.get(GregorianCalendar.DATE);
		System.out.printf("������ %04d�� %02d�� %02d���Դϴ�.\n", y, m, d);

		Random rd = new Random();

		int k = rd.nextInt(10);

		switch (k) {
		case 0:
			System.out.print("���");
			break;
		case 1:
		case 2:
		case 3:
			System.out.print("��");
			break;
		case 4:
		case 5:
		case 6:
			System.out.print("�߱�");
			break;
		case 7:
		case 8:
			System.out.print("�ұ�");
			break;
		case 9:
			System.out.print("�·�!");
			break;
		}

		System.out.println("�Դϴ�.");
	}

}
