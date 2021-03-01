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
		System.out.println("x값:");
		int x = sc.nextInt();
		System.out.println("y값:");
		int y = sc.nextInt();
		System.out.println("z값:");
		int z = sc.nextInt();

		System.out.println("배열 a의 요소 수:");
		int num = sc.nextInt();
		int[] a = new int[num];
		// 배열 생성
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}

		// 출력
		System.out.println("x,y의 최솟값은" + min(x, y) + "입니다.");
		System.out.println("x,y,z의 최솟값은" + min(x, y, z) + "입니다.");
		System.out.println("배열 a의 최솟값은" + min(a) + "입니다.");

	}

}
