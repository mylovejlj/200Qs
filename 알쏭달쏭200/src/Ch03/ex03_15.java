package Ch03;

import java.util.Scanner;

//Ű���忡�� �Է��� 3���� ���� �� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class ex03_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����a:");
		int a = sc.nextInt();
		
		System.out.println("����b:");
		int b = sc.nextInt();
		
		System.out.println("����c");
		int c = sc.nextInt();
		
		int min = a; 
		
		if (b < min) 
			min = b;
		else if (c < min)
			min = c;
		
		System.out.println("�ּ� ����" + min + "�Դϴ�");

	}

}
