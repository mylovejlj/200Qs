package Ch04;

import java.util.Scanner;

//2���� �������� �о �� ���� ���̿� �ִ� ��� ��������, ���� �ͺ��� ū ������ ǥ���ϴ� ���α׷��� �ۼ�����.
public class ex04_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �� x:");
		int x = sc.nextInt();
		
		System.out.println("���� �� y:");
		int y = sc.nextInt();
		
		int tmp;
		
		//�ϴ�, �� ���� ����
		if(x>y) {
			tmp = x;
			x = y;
			y = tmp;
		}
		
		//���� ���� �������� 1�� ���ذ��鼭 ����ϱ�
		do {
			System.out.print(x+",");
			x = x+1;
			
		}while(x<=y);			//�������� ū������ �۰ų� ���� ���� �ݺ��ϱ�
		
	}

}
