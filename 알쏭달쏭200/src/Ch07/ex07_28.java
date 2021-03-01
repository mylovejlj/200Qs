package Ch07;

import java.util.Scanner;

public class ex07_28 {

	static int[][] addMatrix(int[][] a, int[][] b) {

		int c[][] = new int[a.length][];
		
		for (int i = 0; i < a.length; i++) {
			c[i] = new int[a[i].length];
		
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
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
		int[][] b = new int[height][width];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("a[%d][%d]", i, j);
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("b[%d][%d]", i, j);
				b[i][j] = sc.nextInt();
			}
		}

		int[][] c = addMatrix(a, b);

		System.out.println("행렬a");
		printMatrix(a);

		System.out.println("\n행렬b");
		printMatrix(b);

		System.out.println("\n행렬c");
		printMatrix(c);
	}

}
