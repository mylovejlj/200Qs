package Ch03;

import java.util.Scanner;

//2���� �������� ��������(ū ��)���� �����ϴ� ���α׷��� �ۼ�����
public class ex03_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����a:");
		int a = sc.nextInt();
		
		System.out.println("����b:");
		int b = sc.nextInt();
		
		if(a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		System.out.println("a>=b�� �ǵ��� �����߽��ϴ�.");
		System.out.println("����a��"+ a +"�Դϴ�.");
		System.out.println("����b��"+ b +"�Դϴ�.");
	}

}

