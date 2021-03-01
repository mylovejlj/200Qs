package Ch04;

import java.util.Scanner;

//n단의 숫자 피라미드를 표시하는 프로그램을 작성하라.
//i번째 행에는 i%10을 표시할 것
public class ex04_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		 System.out.println("숫자 피라미드를 표시합니다.");
		 System.out.println("단수는?");
		  
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
