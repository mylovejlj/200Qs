package Ch06;

import java.util.Scanner;

//시험 점수의 합계, 평균, 최고점, 최저점을 구하자.
public class ex06_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("사람 수:");

		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "번 점수:");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		System.out.println("합계는" + sum + "입니다.");
		System.out.println("평균은" + (double)sum / n + "입니다.");

		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < n; i++) {
			
			
			if (arr[i] >= max) {
				max = arr[i];
			}

			if (arr[i] <= min) {

				min = arr[i];
			}
		}
		System.out.println("최고점은" + max + "입니다.");
		System.out.println("최저점은" + min + "입니다.");
	}

}
