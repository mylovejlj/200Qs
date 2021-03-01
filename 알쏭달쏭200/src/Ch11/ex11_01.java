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
		System.out.printf("오늘은 %04d년 %02d월 %02d일입니다.\n", y, m, d);

		Random rd = new Random();

		int k = rd.nextInt(10);

		switch (k) {
		case 0:
			System.out.print("대길");
			break;
		case 1:
		case 2:
		case 3:
			System.out.print("길");
			break;
		case 4:
		case 5:
		case 6:
			System.out.print("중길");
			break;
		case 7:
		case 8:
			System.out.print("소길");
			break;
		case 9:
			System.out.print("굿럭!");
			break;
		}

		System.out.println("입니다.");
	}

}
