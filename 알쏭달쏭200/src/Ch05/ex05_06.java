package Ch05;

import java.util.Scanner;

//3���� �������� �հ�� ����� ���ϴ� ���α׷��� ������.
//����� ĳ��Ʈ �����ڸ� �̿��ؼ� ���ϰ� �Ǽ��� ǥ���� ��
public class ex05_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("������ x, y, z�� ����� ���մϴ�.");
		System.out.println("x��:");
		int x = sc.nextInt();
		System.out.println("y��:");
		int y = sc.nextInt();
		System.out.println("z��:");
		int z = sc.nextInt();
		
		double avg = (double)(x+y+z)/3;
		System.out.printf("x,y,z�� ����� %.3f�Դϴ�",avg);
	}

}
