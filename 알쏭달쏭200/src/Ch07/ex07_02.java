package Ch07;
//�ּڰ� ���ϱ�
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

		System.out.println("����a:");
		int a = sc.nextInt();
		System.out.println("����b:");
		int b = sc.nextInt();
		System.out.println("����c:");
		int c = sc.nextInt();

		System.out.println("�ּڰ���" + min(a, b, c) + "�Դϴ�.");
	}

}
