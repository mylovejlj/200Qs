package Ch04;

import java.util.Scanner;

//���� ������n�� �о 1���� n������ ���� ���ϴ� ���α׷��� �ۼ�����.
public class ex04_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		do {
			System.out.println("���� ������:");
			x = sc.nextInt();
		}while(x<=0);
		
		
		int factorial=1;
		int i=1;
		
		while(i<=x) {
			factorial *= i;
			i++;
		}
		//�� �̷��� ������ ����. �ٽ� Ǯ���!!
	System.out.println(factorial);
	}

}
