package Ch04;

import java.util.Scanner;

//�� ������ �ݴ�� 0���� ���� �������� ī��Ʈ���ϴ� ���α׷��� ������
public class ex04_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ī��Ʈ�ٿ� �մϴ�.");
		
		int x ;
		
		do {
			System.out.println("���� ������:");
			x = sc.nextInt();
		}while(x<=0);
		
		for(int i = 0; i <= x; i++) {
			System.out.println(i);
		}
		
	}


}
