package Ch02;

import java.util.Random;
import java.util.Scanner;
//Ű���忡�� �Է��� �������� +5 �Ǵ� -5������ ���� �������� ��������.
public class ex02_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("������:");
		int x = sc.nextInt();
		
		System.out.println("�Է� ���� +-5 ������ ������ �����߽��ϴ�.");
		//nextInt(n) : 0 ~ n-1 ������ ���� ����. �� n-1�� ����.
		System.out.println("����"+(x-5 + rnd.nextInt(11) + "�Դϴ�."));
		
	
	}

}
