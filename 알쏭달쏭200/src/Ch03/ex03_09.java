package Ch03;

import java.util.Scanner;

//�Է��� �������� 10�� ����̸� '�� ���� 10�� ����Դϴ�'��� ǥ���ϰ�, �׷��� ������ '�� ���� 10�� ����� �̴մϴ�'��� ǥ���ϴ� ���α׷��� �ۼ��϶�
//(������ ���� ��� '���� �������� �Է��߽��ϴ�'��� ǥ���� ��)
public class ex03_09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������:");
		int a = sc.nextInt();
		
		if(a>0) {
			if (a%10 == 0) {
				System.out.println("�� ���� 10�� ����Դϴ�.");
			}else {
				System.out.println("�� ���� 10�� ����� �ƴմϴ�.");
			}
		}else {
			System.out.println("���� �������� �Է��߽��ϴ�.");
		}
	}
}