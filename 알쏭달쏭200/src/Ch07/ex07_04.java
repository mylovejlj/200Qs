package Ch07;

//������ �� ���ϱ�.
import java.util.Scanner;

public class ex07_04 {

	static int sum(int x) {

		int sum = 0;

		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1���� x������ ���� ������.");

		int x;
		do {

			System.out.println("x�� ��:");
			x = sc.nextInt();

		} while (x <= 0);

		System.out.println("1����" + x + "������ ����" + sum(x) + "�Դϴ�.");

	}

}
