package Ch03;

import java.util.Scanner;

//�Է��� �������� 3���� ������. �׸��� �� ����� ���� "�� ���� 3���� ���������ϴ�"
//"�� ���� 3���� ���� �������� 1�Դϴ�", "�� ���� 3���� ���� �������� 2�Դϴ�" �� �ϳ��� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//(��, ����� �ƴ� ��� "����� �ƴ� ���� �Է��߽��ϴ�"��� ǥ���� ��)"
public class ex03_10 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������:");
		int a = sc.nextInt();
		
		int na = a%3; 
		
		if(a>0) {
			if (na == 0) {
				System.out.println("�� ���� 3���� ������ ���ϴ�.");
			}else if (na == 1)  {
				System.out.println("�� ���� 3���� ���� �������� 1�Դϴ�.");
			}else {
				System.out.println("�� ���� 3���� ���� �������� 2�Դϴ�.");
			}				
		}else {
			System.out.println("���� �������� �Է��߽��ϴ�.");
		}
	}
}