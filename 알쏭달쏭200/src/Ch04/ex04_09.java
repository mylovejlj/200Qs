package Ch04;

import java.util.Scanner;

//���� �������� �о �� �ڸ����� ����ϴ� ���α׷��� ������
public class ex04_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �������� �ڸ����� ǥ���մϴ�.");
		
		int x;
		
		do {
			System.out.println("���� ������:");
			x = sc.nextInt();
		}while(x<=0);
		
		int digit=0;
		
		while(x>0) {
			x /= 10;
			digit++;
		};
		System.out.println("�Է��� ���ڴ�"+ digit +"�ڸ��Դϴ�.");
		
	}

}
