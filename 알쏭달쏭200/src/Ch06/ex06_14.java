package Ch06;

import java.util.Random;
import java.util.Scanner;

//�迭 a�� ��� ��Ҹ� �������� �迭 b�� �����ϴ� ���α׷��� ������. �� �迭�� ��Ҽ��� �����ϴ��ص� ����.
public class ex06_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// ��� �� �б�
		System.out.print("��� ��:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		int[] arr_copy = new int[n];

		// �迭 ����
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			
				arr_copy[i] = arr[n-1-i];
		
		}		
		
		// ���
		for (int i = 0; i < n; i++) {
			System.out.println("��Ҹ� �������� �迭�߽��ϴ�.");
			System.out.println("arr_copy[" + i + "]=" + arr_copy[i]);
		}
	}

}
