package Ch04;

import java.util.Scanner;

//n단 피라미드를 표시하는 프로그램을 작성하자. i형째에는 (i-1)*2+1개의 *기호를 표시하고 
//마지막 n형쨰에는 (n-1)*2+1개의 *를 표시할 것
public class ex04_23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		 System.out.println("피라미드를 표시합니다.");
		 System.out.println("단수는?");
		  
		 int n = sc.nextInt();
		 
		 for(int i=1; i <= n; i++) {
		 
			 for(int j=1; j <= (n-i); j++) {
				 System.out.print(" ");
			 }
			 for(int j=1; j <= (2*i-1); j++) {
				 System.out.print("*");
			 }			
		 System.out.println();
		 }
	}

}
