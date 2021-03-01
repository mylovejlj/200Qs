package Ch06;

import java.util.Scanner;

//배열의 요소 수와 개별 요소의 값을 입력 받아서 표시하는 프로그램을 작성하자. 
//표시 형식은 배열 초깃값과 같은 형식으로, 각 요소의 값을 쉽표로 연결하고 {}로 감싼 형태이다.
public class ex06_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("요소 수:");

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		int a;
		System.out.print("arr={");

		for (int i = 0; i < n; i++) {
			
			if (i == n - 1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.print("}");
	}

}
