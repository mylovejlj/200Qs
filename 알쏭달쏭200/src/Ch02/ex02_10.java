package Ch02;

import java.util.Scanner;

//���� �ѳ��̿� ���Ǹ� ���մϴ�.
public class ex02_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final double PI = 3.1416;
		
		System.out.println("���� �ѳ��̿� ���Ǹ� ���մϴ�.");
		System.out.println("������:");
		double r = sc.nextDouble();
				
		System.out.println("�ѳ��̴�" + (4*PI*r*r) + "�Դϴ�.");
		System.out.println("���Ǵ�" + (4/3.0*PI*r*r*r) + "�Դϴ�.");

	}

}
