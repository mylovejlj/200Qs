package Ch04;

import java.util.Scanner;

//3�ڸ��� ���� ������(100~999)�� �д� ���α׷��� �ۼ��϶�.
//(�Է��� ���� 3�ڸ��� ���� �������� �ƴϸ� �ٽ� �Է��ϰ� �� ��)
public class ex04_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		
		do {
			
			System.out.println("�� �ڸ��� ������:");
			
			x = sc.nextInt();
		
		}while(x < 100 || 999 < x);
		
		System.out.println("�Է��� ����:"+ x +"�Դϴ�.");
	}

}
