package Ch02;

import java.util.Scanner;

//2���� �Ǽ����� �Է¹޾� �հ� ����� ������
public class ex02_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ﰢ���� ���̸� ���մϴ�.");
		System.out.println("�غ�:");
		double x = sc.nextDouble();
		
		System.out.println("����:");
		double y = sc.nextDouble();
		
		System.out.println("���̴�" + (x*y)/2 + "�Դϴ�.");
	}

}
