package Ch07;

import java.util.Scanner;

public class ex07_06 {

	static void printSeason(int m) {

		switch (m) {
		case 3:
		case 4:
		case 5:
			System.out.println("���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�����Դϴ�.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�����Դϴ�.");
			break;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int month;

		do {
			System.out.println("�� ���Դϱ�?(1~12):");
			month = sc.nextInt();
		} while (1 > month || month > 12);

		printSeason(month);
	}

}
