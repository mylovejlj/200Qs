package Ch03;

import java.util.Scanner;

//����3-3�� ���α׷��� �����������ڸ� ����ؼ� ��������.
public class ex03_04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("����A:");
		int a = sc.nextInt();
		
		System.out.println("����B:");
		int b = sc.nextInt();
		
		if (a % b != 0) {
			System.out.println("B�� A�� ����� �ƴϴ�.");
		}else {
			System.out.println("B�� A�� ����̴�.");
		}
	}

}
