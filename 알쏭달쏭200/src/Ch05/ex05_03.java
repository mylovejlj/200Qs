package Ch05;

import java.util.Scanner;

//float�� ������ double�� ������ ���� �о ǥ���ϴ� ���α׷��� ������.
public class ex05_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���� x�� float���Դϴ�. ���� y�� double�� �Դϴ�.");
		
		System.out.println("x : ");
		float x = sc.nextFloat();
		
		System.out.println("y : ");
		double y = sc.nextDouble();

		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}

}
