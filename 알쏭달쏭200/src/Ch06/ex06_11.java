package Ch06;

import java.util.Random;
import java.util.Scanner;

//�����ϴ� ��Ұ� ������ ���� ������ �ʵ��� 6-10�� ���α׷��� ��������. 
//���� ���{1,3,5,5,3,2}�� �ż��� �ȵȴ�.
public class ex06_11 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("��� ��:");

		int n = sc.nextInt();
		int[] arr = new int[n];

		// 0��° �� ���� ����
		arr[0] = 1 + rd.nextInt(10);

		// 1��° ���� ���������� �� ����
		for (int i = 1; i < n; i++) { 
			do {
				arr[i] = 1 + rd.nextInt(10);
			} while (arr[i] == arr[i - 1]); // ���ǹ��� ���̶�� do�� �ѹ� �� ����
		}

		// ���
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

}
