package Ch06;

import java.util.Random;
import java.util.Scanner;

//���� �ٸ� ��Ұ� ������ ���� ������ �ʵ��� 6-10�� ���α׷��� ��������.
public class ex06_12 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		//��� �� �б�
		int n;
		do {
			System.out.print("��� ��:");
			n = sc.nextInt();
		} while (n > 10);

		
		int[] arr = new int[n];
		
		// �迭 ����
		int j;
		for (int i = 0; i < n; i++) {

			do {
				
				arr[i] = 1 + rd.nextInt(10);
				for(j=0; j<i;j++) {
					if(arr[j]==arr[i]) {
						break;
					}
				}
			} while (i>j);

		}

		// ���
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}

	}

}
