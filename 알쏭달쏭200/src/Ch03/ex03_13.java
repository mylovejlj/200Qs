package Ch03;

import java.util.Scanner;

//2���� �������� �о �� ���� ���� ǥ���ϴ� ���α׷��� �ۼ�����.
public class ex03_13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("����a:");
		int a = sc.nextInt();
		
		System.out.println("����b:");
		int b = sc.nextInt();
		
		int diff = a-b < 0 ? b-a : a-b; 
		
		System.out.println("�� ���� ����"+ diff +"�Դϴ�.");
	
	}

}
