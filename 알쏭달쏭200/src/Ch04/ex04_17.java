package Ch04;

import java.util.Scanner;

//���� ������ŭ *�� ǥ���ϴ� ���� 4-11�� �����ؼ� 5�� ������ �� �ٲ��ؼ� ǥ���ϴ� ���α׷��� ������
public class ex04_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ���� ����ұ��?");
		
		int x = sc.nextInt();
		
		if(x>0) {
			for(int i=1; i <= x; i++) {
			
				if(i%5==0) {
					System.out.println('*');
				}else{
					System.out.print('*');		//���� ���ͷ� ''���
				}
		
			}
		
		}
	}

}
