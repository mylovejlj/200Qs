package Ch02;

import java.util.Random;
import java.util.Scanner;

//0.0�̻� 1.0�̸��� �Ǽ����� �������� �����ؼ� ǥ��
//0.0�̻� 10.0�̸��� �Ǽ����� �������� �����ؼ� ǥ��
//-1.0�̻� 1.0�̸��� �Ǽ����� �������� �����ؼ� ǥ��
public class ex02_13 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		double r1 = rnd.nextDouble();
		double r2 = rnd.nextDouble() * 10; //�̺κ� ���� �ڽ� �����ϴ�.
		double r3 = -1 + 2 * rnd.nextDouble();
		
		System.out.println("3���� ������ �����߽��ϴ�.");
		System.out.println("0.0�̻� 1.0�̸�:" + r1);
		System.out.println("0.0�̻� 10.0�̸�:" + r2);
		System.out.println("-1.0�̻� 1.0�̸�:" + r3);
		
		
	
	}

}
