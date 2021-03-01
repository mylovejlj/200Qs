package Ch07;

import java.util.Scanner;

public class ex07_30 {

	static int min(int x, int y) {
		/*
		 * int min = x; if (min > y) { min = y; }
		 */
		return x > y ? y : x;
	}

	static int min(int x, int y, int z) {

		
		int min = x;
		
		if (min > y) { 
			min = y; 
		} else if(min > z) {
			min = z; 
		}
		 
		return min;
	}

	static int min(int[] a) {

		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x��:");
		int x = sc.nextInt();
		System.out.println("y��:");
		int y = sc.nextInt();
		System.out.println("z��:");
		int z = sc.nextInt();

		System.out.println("�迭 a�� ��� ��:");
		int num = sc.nextInt();
		int[] a = new int[num];
		// �迭 ����
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}

		// ���
		System.out.println("x,y�� �ּڰ���" + min(x, y) + "�Դϴ�.");
		System.out.println("x,y,z�� �ּڰ���" + min(x, y, z) + "�Դϴ�.");
		System.out.println("�迭 a�� �ּڰ���" + min(a) + "�Դϴ�.");

	}

}
