package Ch03;

import java.util.Scanner;

//2���� ���� a,b�� ���� �оa,b�� ��� ���踦 ������ ���� ǥ���ϴ� ���α׷��� �ۼ�����.
//"a�� ũ��","b�� ũ��","a�� b�� ����"
public class ex03_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("����a:");
		int a = sc.nextInt();
		
		System.out.println("����b:");
		int b = sc.nextInt();
		
		if (a<b) {
			System.out.println("b�� ũ��.");
		}else if ( a>b) {
			System.out.println("a�� ũ��.");
		}else {
			System.out.println("a�� b�� ����.");
		}

	}

}
