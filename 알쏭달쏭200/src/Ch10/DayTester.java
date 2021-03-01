package Ch10;

import java.util.Scanner;

public class DayTester {

	static Scanner sc = new Scanner(System.in);

	// ��¥ ���� ǥ��
	static void display(Day2 day) {
		System.out.println(day + "�� ���� ����");
		System.out.println("����" + (day.isLeap() ? "�Դϴ�." : "�� �ƴմϴ�."));
		System.out.println("���� �� ��� �ϼ�:" + day.dayOfYear());
		System.out.println("���� �� �ܿ� �ϼ�:" + day.leftDayOfYear());
	}

	// ��¥ ����
	static void change(Day2 day) {
		System.out.println("[1]�������� ����  [2]���� ����");
		System.out.println("[3]���� ����  [4]���� ����");
		System.out.println("[5]1�� ��  [6]1�� ��");
		System.out.println("[7]n�� ��  [8]n�� ��");

		int change = sc.nextInt();
		
		int y = 0, m = 0, d = 0, n = 0;
		
		if (change == 1 || change == 2) {
			System.out.println("��:");
			y = sc.nextInt();
		}
		if (change == 1 || change == 3) {
			System.out.println("��:");
			m = sc.nextInt();
		}
		if (change == 1 || change == 4) {
			System.out.println("��:");
			d = sc.nextInt();
		}
		if (change == 7 || change == 8) {
			System.out.println("��ĥ:");
			n = sc.nextInt();
		}

		switch (change) {
		case 1:
			day.set(y, m, d);
			break;
		case 2:
			day.setYear(y);
			break;
		case 3:
			day.setMonth(m);
			break;
		case 4:
			day.setDate(m);
			break;
		case 5:
			day.succeed();
			break;
		case 6:
			day.precede();
			break;
		case 7:
			day.succeedDays(n);
			;
			break;
		case 8:
			day.precedeDays(n);
			break;
		}
		System.out.println(day + "�� ����ƽ��ϴ�.");
	}

	// �ٸ� ��¥�� ��
	static void compare(Day2 day) {
		System.out.println("�� ��� ��¥�� �Է�����.");
		System.out.print("��:");
		int y = sc.nextInt();
		System.out.print("��:");
		int m = sc.nextInt();
		System.out.print("��:");
		int d = sc.nextInt();

		Day2 d2 = new Day2(y, m, d);

		int comp = day.compareTo(d2);
		System.out.print(day);
		
		switch (comp) {
		case -1:
			System.out.println("�� ��");
			break;
		case 1:
			System.out.println("�� ��");
			break;
		case 0:
			System.out.println("�� ����.");
			break;

		}
	}

	// ���� ��¥
	static void beforeAfter(Day2 day) {
		System.out.print("[1]���� [2]���� [3]n�� �� [4]n�� ��:");
		int type = sc.nextInt();
		int n = 0;
		
		if (type == 3 || type == 4) {
			System.out.println("��ĥ:");
			n = sc.nextInt();
		}

		System.out.print("�� ����");
		switch (type) {
		case 1:
			System.out.print(day.succeedingDay());
			break;
		case 2:
			System.out.print(day.precedingDay());
			break;
		case 3:
			System.out.print(day.after(n));
			break;
		case 4:
			System.out.print(day.before(n));
			break;

		}
		System.out.println("�Դϴ�.");
	}

	public static void main(String[] args) {
		
		System.out.println("��¥�� �Է��ϼ���.");
		System.out.println("��:");
		int y = sc.nextInt();
		System.out.println("��:");
		int m = sc.nextInt();
		System.out.println("��:");
		int d = sc.nextInt();

		Day2 day = new Day2(y, m, d);

		while (true) {
			System.out.print("[1]��¥ ���� ���� ǥ�� [2]��¥ ���� [3]�ٸ� ��¥�� ��\n [4]���� ��¥ [5]����:");
			int menu = sc.nextInt();
			
			if (menu == 5)
				break;
			
			switch (menu) {
			case 1:
				display(day);
				break;
			case 2:
				change(day);
				break;
			case 3:
				compare(day);
				break;
			case 4:
				beforeAfter(day);
				break;
			}

		}
	}
}
