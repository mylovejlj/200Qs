package Ch03;

import java.util.Scanner;

//Ű���忡�� �Է��� 3���� ������ �� �߾Ӱ��� ���ؼ� ǥ���ϴ� ���α׷��� �ۼ�����. 
//���� ��� 2,3,1�� �߾Ӱ��� 2�̰� 1,2,1�� �߾Ӱ��� 1�̰�, 3, 3, 3�� �߾Ӱ��� 3�̴�.
public class ex03_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����a:");
		int a = sc.nextInt();
		
		System.out.println("����b:");
		int b = sc.nextInt();
		
		System.out.println("����c");
		int c = sc.nextInt();
		
		int mid;
		
		if( ( a<=b && b<=c) || ( c<=b && b<=a ) )
			mid = b;
		else if ( ( a>=b && a<=c) || (c<=a && a<=b) )
			mid = a;
		else
			mid = c;
		
		System.out.println("�߾� ����" + mid + "�Դϴ�");

	}

}
