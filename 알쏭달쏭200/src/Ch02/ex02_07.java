package Ch02;

import java.util.Scanner;

//Ű���忡�� �Է��� �������� 10�� ���Ѱ��� 10�� �� ���� �������
public class ex02_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������:");
		
		int x = sc.nextInt();
		System.out.println("������ �ڸ����� ������ ����" + (x/10) + "�Դϴ�.");
		System.out.println("������ �ڸ�����" + (x%10) + "�Դϴ�.");
	}

}
