package Ch04;

import java.util.Scanner;

//��ȣ ���ڸ� ������ ������ŭ ����ߴ� [���� 4-7]�� for������ �ۼ�����
public class ex04_11 {

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
