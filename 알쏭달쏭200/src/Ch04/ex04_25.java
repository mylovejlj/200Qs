package Ch04;

import java.util.Scanner;

//���� �������� �о �Ҽ������� �����ϴ� ���α׷��� �ۼ�����. �Ҽ��� 2�̻� n�̸��� ���� � ���ε� ���������� �ʴ� ������n�̴�.(��, �ڱ� �ڽŰ� 1�θ� ���������� ��)
public class ex04_25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.println("2�̻��� ������:");
			n = sc.nextInt();
		} while (n < 2);
		
		
		int i;
		
		for(i=2; i<n; i++) {
			
			if(n%i==0) {
				break;
			}
		}
		
		
		if ( i == n) {
			System.out.println("�Ҽ��Դϴ�");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
	}

}
