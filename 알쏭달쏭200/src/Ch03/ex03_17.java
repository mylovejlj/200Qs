package Ch03;

import java.util.Scanner;

//Ű���忡�� �Է��� 2���� ������ �� ���� ���� ū ���� ǥ���ϴ� ���α׷��� �ۼ�����. 
// �� �������� ������ "�� ���� �����ϴ�"��� ǥ���Ѵ�.
public class ex03_17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("����a:");
		int a = sc.nextInt();
		
		System.out.println("����b:");
		int b = sc.nextInt();
		
//		if(a==b) {
//			System.out.println("�� ���� �����ϴ�.");
//		}else if(a>b){
//			System.out.println("ū ����"+ a +"�Դϴ�.");
//			System.out.println("���� ����"+ b +"�Դϴ�.");
//		}else {
//			System.out.println("ū ����"+ b +"�Դϴ�.");
//			System.out.println("���� ����"+ a +"�Դϴ�.");
//		}
			
		
		if(a==b) {
			System.out.println("�� ���� �����ϴ�.");
		}else{
			int min, max;
			
			if(a<b) {
				min=a; max=b;
			}else {
				min=b; max=a;
			}
			System.out.println("ū ����"+ max +"�Դϴ�.");
			System.out.println("���� ����"+ min +"�Դϴ�.");
		}
		
	}
}
