package Ch04;

import java.util.Scanner;

//�Է¹��� ���������� 0���� ī��Ʈ�ٿ��ϴ� ���α׷��� �ۼ�����. ī��Ʈ�ٿ� ���� �� �������� Ȯ���� �� �ְ� �� ��.
public class ex04_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ī��Ʈ �ٿ� �մϴ�.");
		
		int x;
		
		do {	
			
			System.out.println("���� ���� �� x:");
			x = sc.nextInt();
			
		}while(x<=0);
		
		
		while(x>=0)						//while ������ ����� ��ɹ��� �� �� ���̶�� �߰�ȣ({}) ��������.
			System.out.println(x--);	//x�� ��� �� x�� ����. ���� ���� ������
			
		System.out.println("x�� ����"+ x +"�� �Ǿ����ϴ�.");
	
	}

}
