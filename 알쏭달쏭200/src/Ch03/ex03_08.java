package Ch03;

import java.util.Scanner;

//�Է��� �������� 5�� ������ �������� "�� ���� 5�� ���������ϴ�"��� ǥ���ϰ� 
//�׷��� ������ "�� ���� 5�� ���������� �ʽ��ϴ�"��� ǥ���ϴ� ���α׷��� ������
//������ �Է��� ��쿡�� ���� �������� �Է��߽��ϴ� ��� ǥ���� ��
public class ex03_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("������:");
		int a = sc.nextInt();
		
		if(a>0) {
			if (a%5 == 0) {
				System.out.println("�� ���� 5�� ���������ϴ�.");
			}else {
				System.out.println("�� ���� 5�� ���������� �ʽ��ϴ�.");
			}
		}else {
			System.out.println("���� �������� �Է��߽��ϴ�.");
		}
	}
}
