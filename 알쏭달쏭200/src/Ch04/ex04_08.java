package Ch04;

import java.util.Scanner;

//���� ���� ������ŭ *�� +�� ������ ���� ǥ���ϴ� ���α׷����� �ۼ�����
//(���������� �� �ٲ� ���ڸ� ��� �� ��)
public class ex04_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���");
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {

			if (i % 2 == 0) { // ¦���̸�
				System.out.print('*');
			} else { // Ȧ���̸�
				System.out.print('+');
			}
		}

		System.out.println();

	}

}
