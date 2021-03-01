package Ch06;

import java.util.Scanner;

//배열에서 특정 값을 가지는 요소를 찾아라. 
//동일 값의 요소가 여러 개 있으면 가장 뒤에있는 요소를 찾는 프로그램을 만들자.
public class ex06_08_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("요소 수:");

		int n = sc.nextInt();
		int[] arr = new int[n];

		// 배열에 값 입력
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		System.out.println("찾을 숫자:");
		int target = sc.nextInt();

		int i;
		
		// 찾을 숫자 탐색
		for ( i = (n-1); i >= 0; i--) {
			if (arr[i] == target) {
				break;
			}
		}
		
		//포인트!
		//i가 마지막 인덱스까지 가지 않았을 경우, 즉 탐색이 끝나기 전 찾았을 경우
		if (i >= 0) {
			System.out.println("그 값은 arr[" + i + "]에 있습니다.");
		} else {
			System.out.println("그 값은 존재하지 않습니다.");
		}

	}

}
