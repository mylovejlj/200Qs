package Ch09;

import java.util.Scanner;

public class CordinateTester1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("��ǥ p�� �Է��ϼ���.");
		System.out.println("X��ǥ:");
		double x = sc.nextDouble();
		System.out.println("Y��ǥ:");
		double y = sc.nextDouble();

		Cordinate p = new Cordinate(x, y);
		System.out.println("p=(" + p.getX() + ", " + p.getY() + ")");
		Cordinate q = p;
		q.set(9.9, 9.9);
		System.out.println("q=(" + p.getX() + ", " + p.getY() + ")");
		System.out.println("p=(" + p.getX() + ", " + p.getY() + ")");
	}

}
