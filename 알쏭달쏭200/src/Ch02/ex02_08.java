package Ch02;

import java.util.Scanner;

//2���� �Ǽ����� �Է¹޾� �հ� ����� ������
public class ex02_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Ǽ���1:");
		double x = sc.nextDouble();
		
		System.out.println("�Ǽ���2:");
		double y = sc.nextDouble();
		
		System.out.println("�հ��" + (x+y) + "�Դϴ�.");
		System.out.println("�����" + (x+10)/2 + "�Դϴ�.");
	}

}
