package Ch03;

import java.util.Scanner;

//3���� �������� ��������(���� ��)���� �����ϴ� ���α׷��� �ۼ�����.
public class ex03_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("����a:");
		int a = sc.nextInt();
		
		System.out.println("����b:");
		int b = sc.nextInt();
		
		System.out.println("����c:");
		int c = sc.nextInt();
		
		int tmp;
		
		if(a>b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		
		if(b>c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		
		if(a>b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		
		System.out.println("a<=b<=c�� �ǵ��� �����߽��ϴ�.");
		System.out.println("����a��"+ a +"�Դϴ�.");
		System.out.println("����b��"+ b +"�Դϴ�.");
		System.out.println("����c��"+ c +"�Դϴ�.");

	}
}