package Ch04;
//���� ���������� �о �ش��ϴ� ���� ������ ǥ���ϴ� ���α׷��� �ۼ�����. 

//���ϴ� ��ŭ �Է� �� Ǯ���� �� �ְ� �ϸ�, 1-12 �̿��� ���� �Էµ� ��쿡�� ���Է� �ϵ��� �Ұ�
//do�� �ȿ� do���� ���� ���� ������ �ȴ�.

import java.util.Scanner;

public class ex04_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int month;
		int retry;
		System.out.println("���� ã���ϴ�.");
		
		do{
			
			do {
				System.out.println("�� ���Դϱ�?");
				month = sc.nextInt();
			} while (month < 1 || month > 12);
	
			
				if (3 <= month && month <= 5) {
					System.out.println("���Դϴ�.");
				} else if (6 <= month && month <= 8) {
					System.out.println("�����Դϴ�.");
				} else if (9 <= month && month <= 11) {
					System.out.println("�����Դϴ�.");
				} else{
					System.out.println("�ܿ��Դϴ�.");
				}
				
				System.out.println("�ٽ� �Ͻðڽ��ϱ�? 1.YES 0.NO");
	
				retry = sc.nextInt();
				
		}while(retry==1);
		System.out.println("�������ϴ�.");
	}

}
