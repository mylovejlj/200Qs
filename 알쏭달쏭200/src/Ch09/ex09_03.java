package Ch09;

import java.util.Scanner;

import Ch08.Human;

public class ex09_03 {

	static void printHumanArray(Human[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("No.%d %s %3dcm %3dkg\n", i, a[i].getName(), a[i].getHeight(), a[i].getWeight());
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		// 1���� �迭
		Human[] p = { new Human("ö��", 170, 70), new Human("�浿", 160, 59) };

		System.out.println("�迭 q�� ��� ��:");
		n = sc.nextInt();

		Human[] q = new Human[n];
		for (int i = 0; i < q.length; i++) {
			System.out.println("q[" + i + "]");

			System.out.println("�̸�:");
			String name = sc.next();

			System.out.println("����:");
			int height = sc.nextInt();

			System.out.println("ü��:");
			int weight = sc.nextInt();

			q[i] = new Human(name, height, weight);
		}

		// 2���� �迭
		Human[][] x = { { new Human("��ö��", 175, 52), new Human("�迵��", 169, 60) },
				{ new Human("ȫ�浿", 178, 70), new Human("��ö��", 172, 61) },
				{ new Human("�̿���", 168, 59), new Human("��浿", 165, 59) }, };

		System.out.println("�迭 y�� �� ��:");
		n = sc.nextInt();

		Human[][] y = new Human[n][];
		for (int i = 0; i < y.length; i++) {
			System.out.println("y[" + i + "]�� �� ��:");
			n = sc.nextInt();
			y[i] = new Human[n];
			for (int j = 0; i < y[i].length; j++) {
				System.out.println("�̸�:");
				String name = sc.next();

				System.out.println("����:");
				int height = sc.nextInt();

				System.out.println("ü��:");
				int weight = sc.nextInt();

				y[i][j] = new Human(name, height, weight);
			}
		}
		
		//1���� �迭
		System.out.println("----�迭 p");
		printHumanArray(p);
		System.out.println("----�迭 q");
		printHumanArray(q);
		
		//2���� �迭
		System.out.println("----�迭 x");
		for(int i=0; i<x.length; i++) {
			System.out.printf("%d��\n",i);
			printHumanArray(x[i]);	
		}
		
		System.out.println("----�迭 y");
		for(int i=0; i<y.length; i++) {
			System.out.printf("%d��\n",i);
			printHumanArray(y[i]);	
		}
		
	}

}
