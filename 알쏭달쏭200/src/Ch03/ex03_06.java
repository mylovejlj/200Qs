package Ch03;

import java.util.Scanner;

//����3-5�� ���α׷����� ������ ELSE�� ELSE IF (n==0)���� �����ϸ� ��� �Ǵ��� Ȯ������.
public class ex03_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("������:");
		int a = sc.nextInt();
		
		if (a < 0) {
			System.out.println("���� �����Դϴ�.");
		}else if ( a > 0) {
			System.out.println("���� ����Դϴ�.");
		}else if(a == 0) {
			System.out.println("���� 0�Դϴ�.");
		}
		//����� �����ϴ�.

	}

}
