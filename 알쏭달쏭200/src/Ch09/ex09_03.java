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

		// 1차원 배열
		Human[] p = { new Human("철수", 170, 70), new Human("길동", 160, 59) };

		System.out.println("배열 q의 요소 수:");
		n = sc.nextInt();

		Human[] q = new Human[n];
		for (int i = 0; i < q.length; i++) {
			System.out.println("q[" + i + "]");

			System.out.println("이름:");
			String name = sc.next();

			System.out.println("신장:");
			int height = sc.nextInt();

			System.out.println("체중:");
			int weight = sc.nextInt();

			q[i] = new Human(name, height, weight);
		}

		// 2차원 배열
		Human[][] x = { { new Human("김철수", 175, 52), new Human("김영희", 169, 60) },
				{ new Human("홍길동", 178, 70), new Human("이철수", 172, 61) },
				{ new Human("이영희", 168, 59), new Human("김길동", 165, 59) }, };

		System.out.println("배열 y의 행 수:");
		n = sc.nextInt();

		Human[][] y = new Human[n][];
		for (int i = 0; i < y.length; i++) {
			System.out.println("y[" + i + "]의 열 수:");
			n = sc.nextInt();
			y[i] = new Human[n];
			for (int j = 0; i < y[i].length; j++) {
				System.out.println("이름:");
				String name = sc.next();

				System.out.println("신장:");
				int height = sc.nextInt();

				System.out.println("체중:");
				int weight = sc.nextInt();

				y[i][j] = new Human(name, height, weight);
			}
		}
		
		//1차원 배열
		System.out.println("----배열 p");
		printHumanArray(p);
		System.out.println("----배열 q");
		printHumanArray(q);
		
		//2차원 배열
		System.out.println("----배열 x");
		for(int i=0; i<x.length; i++) {
			System.out.printf("%d행\n",i);
			printHumanArray(x[i]);	
		}
		
		System.out.println("----배열 y");
		for(int i=0; i<y.length; i++) {
			System.out.printf("%d행\n",i);
			printHumanArray(y[i]);	
		}
		
	}

}
