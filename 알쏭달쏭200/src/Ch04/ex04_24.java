package Ch04;

import java.util.Scanner;

//n���� ���� �Ƕ�̵带 ǥ���ϴ� ���α׷��� �ۼ��϶�.
//i��° �࿡�� i%10�� ǥ���� ��
public class ex04_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		 System.out.println("���� �Ƕ�̵带 ǥ���մϴ�.");
		 System.out.println("�ܼ���?");
		  
		 int n = sc.nextInt();
		 
		 for(int i=1; i <= n; i++) {
		 
			 for(int j=1; j <= (n-i); j++) {
				 System.out.print(" ");
			 }
			 for(int j=1; j <= (2*i-1); j++) {
				 System.out.print(i%10);
			 }			
		 System.out.println();
		 }
	}

}
