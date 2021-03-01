package Ch07;

import java.util.Scanner;

public class ex07_17 {
	// 앞에서 부터 탐색
	static int linearSearch(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	// 뒤에서 부터 탐색
	static int linearSearchR(int[] arr, int key) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("요소 수:");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		System.out.println("찾는 값 :");
		int key = sc.nextInt();

		int idxTop = linearSearch(arr, key);
		int idxBtm = linearSearchR(arr, key);

		if (idxTop == -1) {
			System.out.println("해당값은 존재하지 않습니다.");
		} else if (idxTop == idxBtm) {

			System.out.println("해당값은arr[" + idxTop + "]에  존재합니다.");
		} else {

			System.out.println("해당값의 요소가 여러개 존재합니다.");
			System.out.println("가장 앞에 위치한 값은arr[" + idxTop + "]에 있습니다.");
			System.out.println("가장 뒤에 위치한 값은arr[" + idxBtm + "]에 있습니다.");
		}
	}

}
