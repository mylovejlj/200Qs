package Ch03;

import java.util.Scanner;

//�������� �о� ��ȣ(���/����/0)�� �����ϴ� ���α׷��� ������.
public class ex03_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������:");
		int a = sc.nextInt();
		
		if (a < 0) {
			System.out.println("���� �����Դϴ�.");
		}else if ( a > 0) {
			System.out.println("���� ����Դϴ�.");
		}else {
			System.out.println("���� 0�Դϴ�.");
		}

	}

}
