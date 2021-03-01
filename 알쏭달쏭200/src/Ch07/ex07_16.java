package Ch07;

import java.util.Scanner;

public class ex07_16 {

	static int minOf(int[] arr) {

		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("��� ��:");
		int num = sc.nextInt();
		int[] height = new int[num];
		int[] weight = new int[num];

		System.out.println(num + "���� ����� ü���� �Է�����");

		for (int i = 0; i < num; i++) {
			System.out.print(i + 1 + "���� ����:");
			height[i] = sc.nextInt();
			System.out.print(i + 1 + "���� ü��:");
			weight[i] = sc.nextInt();

		}

		System.out.println("���� Ű�� ���� ����� ���� :" + minOf(height) + "�Դϴ�.");
		System.out.println("���� Ű�� ���� ����� ���� :" + minOf(weight) + "�Դϴ�.");
	}

}
