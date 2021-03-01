package Ch07;

import java.util.Scanner;

public class ex07_29 {


	static int[][] aryClone(int[][] ary) {

		int c[][] = new int[ary.length][];
		
		for (int i = 0; i < ary.length; i++) {
			c[i] = new int[ary[i].length];
		
			for (int j = 0; j < ary[i].length; j++) {
				c[i][j] = ary[i][j];
			}

		}

		return c;
	}

	static void printMatrix(int[][] arr) {

		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				System.out.print(arr[x][y] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("행렬의 행 수:");
		int height = sc.nextInt();
		System.out.println("행렬의 열 수:");
		int width = sc.nextInt();

		int[][] a = new int[height][width];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("a[%d][%d]", i, j);
				a[i][j] = sc.nextInt();
			}
		}
		
		int[][] c = aryClone(a);

		System.out.println("행렬a");
		printMatrix(a);

		System.out.println("\n행렬a의 복사본");
		printMatrix(c);
	}


}
