package Ch04;

import java.util.Random;
import java.util.Scanner;

//2�ڸ��� ������(10-99)�� ���ߴ� '���� ���߱� ����'�� ������. ���� ������ if�� �׸��� do���� ����� ��.
public class ex04_03 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int rnd = (int) (Math.random()*(99-10+1)+10);
		
		System.out.println("���� ���߱� ���� ����!");
		
		System.out.println("10���� 99������ ���ڸ� ���߼���.");
		
		System.out.println("� ���� �ϱ��?");
	
		int x;
	
	do {
		x = sc.nextInt();
		
		if (x > rnd)
			System.out.println("�� ���� �����Դϴ�.");
		else if(x < rnd)
			System.out.println("�� ū �����Դϴ�.");
		
	}while(x != rnd);
	
		System.out.println("�����Դϴ�!");
	}

}
