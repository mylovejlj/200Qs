package Ch03;

import java.util.Scanner;

//2���� �Ǽ��� �� ū ���� ǥ������
public class ex03_12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Ǽ�a:");
		double a = sc.nextDouble();
		
		System.out.println("�Ǽ�b:");
		double b = sc.nextDouble();
		
		double max = a>b ? a : b;
		
		System.out.println("ū ����"+ max +"�Դϴ�.");
		
	}

}
