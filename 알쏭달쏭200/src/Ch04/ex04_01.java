package Ch04;

import java.util.Scanner;

//�������� ��ȣ�� �����ؼ� ǥ���ϴ� Sign���α׷��� ����3-5�� ���ϴ� ��ŭ �ݺ��ؼ� �Է� �� ǥ���ϵ��� ��������.
public class ex04_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int retry;
		
		do {
			
			System.out.println("������:");
			int a = sc.nextInt();
			
			if (a < 0) {
				System.out.println("���� �����Դϴ�.");
			}else if ( a > 0) {
				System.out.println("���� ����Դϴ�.");
			}else {
				System.out.println("���� 0�Դϴ�.");
			}
			
			System.out.println("�ٽ� �ѹ��Ͻðڽ��ϱ�? 1-YES. 2-NO");
			
			retry=sc.nextInt();
			
		}while(retry==1);

	}

}
