package Ch04;

import java.util.Scanner;

//���� 4-14 ���α׷��� �����Ͽ� ����Ӹ� �ƴ϶� ���ı��� ǥ���ϴ� ���α׷��� ������
public class ex04_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� x������ ���� ���մϴ�.");
		
		int x ;
		
		do {
			System.out.println("x�ǰ�:");
			x = sc.nextInt();
		}while(x<=0);
			
		int sum =0;
		
		for(int i=1; i<x; i++) {
			
			System.out.print(i+"+");
			sum += i;
		}
		System.out.print(x + "=");
		sum += x;
		System.out.print(sum);
		
	}

}
