package Ch02;

import java.util.Random;

//���ڸ� ���� ������, ���ڸ� ���� ������, �� �ڸ� ���� �������� �������� �����ؼ� ǥ��
public class ex02_11 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int x = 1 + rnd.nextInt(9);
		int y = -1 - rnd.nextInt(9);
		int z = 10 + rnd.nextInt(90);
		
		
		System.out.println("3���� ������ �����߽��ϴ�.");
		System.out.println("�� �ڸ� ���� ����:"+x);
		System.out.println("�� �ڸ� ���� ����:"+y);
		System.out.println("�� �ڸ� ���� ����"+z);
		

	}

}
