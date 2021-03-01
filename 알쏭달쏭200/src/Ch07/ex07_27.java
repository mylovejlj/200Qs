package Ch07;

//행렬의 합 구하기
public class ex07_27 {

	static boolean addMatrix(int[][] a, int[][] b, int[][] c) {
		if (a.length != b.length || b.length != c.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length || b[i].length != c[i].length) {
				return false;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + a[i][j];
			}
		}
		return true;
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

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 6, 3, 4 }, { 5, 1, 2 } };
		int[][] c = new int[2][3];

		if (addMatrix(a, b, c)) {
			System.out.println("행렬a");
			printMatrix(a);
			System.out.println();

			System.out.println("행렬b");
			printMatrix(b);
			System.out.println();

			System.out.println("행렬c");
			printMatrix(c);
			System.out.println();
		}

	}

}
