package Ch07;
//최솟값 구하기
import java.util.Scanner;

public class ex07_02 {

	static int min(int a, int b, int c) {

		int min = a;

		if (min > b) {
			min = b;
		} else if (min > c) {
			min = c;
		}

		return min;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수a:");
		int a = sc.nextInt();
		System.out.println("정수b:");
		int b = sc.nextInt();
		System.out.println("정수c:");
		int c = sc.nextInt();

		System.out.println("최솟값은" + min(a, b, c) + "입니다.");
	}

}
