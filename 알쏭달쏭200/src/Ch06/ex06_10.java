package Ch06;

import java.util.Random;
import java.util.Scanner;

//����� ���� int���� �迭�� ���� ��� ��ҿ� 1-10�� ������ ��������.
public class ex06_10 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("��� ��:");
		
		int n = sc.nextInt();
		int[] arr = new int[n];

		//�迭 ����
		for (int i = 0; i < n; i++) {
			arr[i] = 1 + rd.nextInt(10);
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		
	}

}
