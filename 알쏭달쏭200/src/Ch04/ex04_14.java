package Ch04;

import java.util.Scanner;

//1���� n������ ���� ���ϴ� ���α׷��� for���� ����ؼ� ������
public class ex04_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� x������ ���� ���մϴ�.");
		
		int x ;
		
		do {
			System.out.println("x�ǰ�:");
			x = sc.nextInt();
		}while(x<=0);
			
		int sum =0;
		
		for(int i=0; i<=x; i++) {
			sum += i;
		}
		System.out.println("1����"+x+"������ ����"+sum+"�Դϴ�");
	}

}
