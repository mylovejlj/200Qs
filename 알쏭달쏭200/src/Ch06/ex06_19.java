package Ch06;

import java.util.Scanner;

//6���� �� ���� ����(����, ����)�� �о� ���� ��հ� �л��� ����� ������.
public class ex06_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int number = 3;
		int[][] point = new int[number][2];
		int[] sumStudent = new int[number];
		int[] sumSubject = new int[2];

		System.out.printf("%d���� ����, ���� ������ �����ϼ���\n", number);

		for (int i = 0; i < number; i++) {
			System.out.printf("%2d�� ����:", i + 1);
			point[i][0] = sc.nextInt();
			System.out.println("       ����:");
			point[i][1] = sc.nextInt();

			sumStudent[i] = point[i][0] + point[i][1];
			sumSubject[0] += point[i][0];
			sumSubject[1] += point[i][1];
		}

		System.out.println("NO. ����    ����    ���");
		for (int i = 0; i < number; i++) {
			System.out.printf("%2d%6d%6d%6.1f\n", i + 1, point[i][0], point[i][1], (double) sumStudent[i] / 2);
		}
		System.out.printf("���%6.1f%6.1f\n", (double) sumSubject[0] / number, (double) sumSubject[1] / number);

	}

}
