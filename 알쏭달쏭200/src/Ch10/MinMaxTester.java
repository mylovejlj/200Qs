package Ch10;

import java.util.Scanner;

public class MinMaxTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("x��:");
		int x = sc.nextInt();
		System.out.println("y��:");
		int y = sc.nextInt();
		System.out.println("z��:");
		int z = sc.nextInt();

		System.out.println("�迭a�� ��� �� : ");
		int num = sc.nextInt();
		int[] a = new int[num];

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]:");
			a[i] = sc.nextInt();
		}

		System.out.printf("x,y�� �ּڰ��� %d�Դϴ�.\n", MinMax.min(x, y));
		System.out.printf("x,y�� �ִ밪�� %d�Դϴ�.\n", MinMax.max(x, y));
		System.out.printf("x,y,z�� �ּڰ��� %d�Դϴ�.\n", MinMax.min(x, y, z));
		System.out.printf("x,y,z�� �ִ밪�� %d�Դϴ�.\n", MinMax.max(x, y, z));

		System.out.printf("�迭 a�� �ּڰ��� %d�Դϴ�.\n", MinMax.min(a));

		int xmin[] = MinMax.minIndexArray(a);
		System.out.print("�ε�����{");
		for (int i = 0; i < xmin.length; i++) {
			System.out.print(xmin[i] + " ");

		}
		System.out.print("}�Դϴ�.");

		System.out.printf("���� a�� �ִ��� %d�Դϴ�.\n", MinMax.max(a));

		int xmax[] = MinMax.maxIndexArray(a);
		System.out.print("�ε�����{");
		for (int i = 0; i < xmax.length; i++) {
			System.out.print(xmax[i] + " ");

		}
		System.out.print("}�Դϴ�.");
	}

}
