package Ch06;

import java.util.Scanner;

//더블형인 배열의 모든 요소의 합과 평균을 구하자.
public class ex06_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("요소 수:");

		int n = sc.nextInt();
		double[] arr = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=");
			arr[i] = sc.nextDouble();

		}
		
		double sum = 0;
		for (double i : arr) {
			sum += i;
		}

		System.out.println("합계는" + sum + "입니다.");
		System.out.println("평균은" +sum / n + "입니다.");

	}

}
