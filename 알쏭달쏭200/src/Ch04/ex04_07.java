package Ch04;

import java.util.Scanner;

// �Է��� ���� ������ŭ '*'�� ǥ���ϴ� ���α׷��� �ۼ�����. ���������� �� �ٲ� ���ڸ� ����� ��. ��, ���� ���� 1�̸��̸� �� �ٲ� ���ڸ� ǥ���ؼ��� �ȵȴ�.
public class ex04_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ���� ����ұ��?");
		
		int x = sc.nextInt();
		
		if(x>0) {
			for(int i=0; i<x; i++) {
				System.out.print('*');		//���� ���ͷ� ''���
			}
			System.out.println();
		}
	}

}
