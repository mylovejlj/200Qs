package Ch04;

import java.util.Scanner;

//��ȣ���� *�� �����ؼ� n���� �������� ǥ���ϴ� ���α׷��� �ۼ�����
public class ex04_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���Դϱ�?");
		int n = sc.nextInt();

		for(int i = 1 ; i <= n; i++) {
			for(int j = 1 ; j <= n; j++) {
				System.out.print("*");
				
			}
		System.out.println();
		}
	}

}
