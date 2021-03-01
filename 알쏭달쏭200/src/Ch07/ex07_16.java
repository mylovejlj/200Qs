package Ch07;

import java.util.Scanner;

public class ex07_16 {

	static int minOf(int[] arr) {

		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("사람 수:");
		int num = sc.nextInt();
		int[] height = new int[num];
		int[] weight = new int[num];

		System.out.println(num + "명의 신장과 체중을 입력하자");

		for (int i = 0; i < num; i++) {
			System.out.print(i + 1 + "번의 신장:");
			height[i] = sc.nextInt();
			System.out.print(i + 1 + "번의 체중:");
			weight[i] = sc.nextInt();

		}

		System.out.println("가장 키가 작은 사람의 신장 :" + minOf(height) + "입니다.");
		System.out.println("가장 키가 작은 사람의 신장 :" + minOf(weight) + "입니다.");
	}

}
