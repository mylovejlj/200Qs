package Ch04;

import java.util.Scanner;

//���� 4-5���� x-- �� --x ��ġ�� ��� ����� �ٲ���� ��������. ���α׷��� �ۼ��ؼ� ���� ����� Ȯ���� ��.
//��: x�� ���� ���� �� �� ��µǹǷ� �Է��� ������ 1���������� -1���� ��µȴ�.
public class ex04_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ī��Ʈ �ٿ� �մϴ�.");
		
		int x;
		
		do {	
			
			System.out.println("���� ���� �� x:");
			x = sc.nextInt();
			
		}while(x<=0);
		
		
		while(x>=0)						//while ������ ����� ��ɹ��� �� �� ���̶�� �߰�ȣ({}) ��������.
			System.out.println(--x);	//x�� ���� �� ���. ���� ���� ������
			
		System.out.println("x�� ����"+ x +"�� �Ǿ����ϴ�.");
		
	}

}
