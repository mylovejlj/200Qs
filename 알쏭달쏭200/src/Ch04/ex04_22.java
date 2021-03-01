package Ch04;

import java.util.Scanner;

//기호문자 *를 나열해서 직각의 이등변 삼각형을 표시하는 프로그램을 작성하자. 
//직각의 위치가 왼쪽 아래, 왼쪽 위, 오른쪽 아래, 어른쪽 위에 표시하는 프로그램을 각각 작성할 것
public class ex04_22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		 System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		 System.out.println("단수는?");
		  
		  int n1 = sc.nextInt();
		  
		  for(int i = 1 ; i <= n1; i++) { 
		 	 for(int j = 1 ; j <= i; j++){
		  		System.out.print("*");
		  
		  	 } 
		    System.out.println(); 
		  }
		 
		
		  System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다."); 
		  System.out.println("단수는?");
		  
		  int n2 = sc.nextInt();
		  
		  for(int i = 1 ; i <= n2; i++) { 
			  
			  for(int j = 0 ; j <= (n2-i); j++){
				  System.out.print("*");		  
			  } 
			  System.out.println(); 
		  }
		
		System.out.println("오른 쪽 아래가 직각인 이등변 삼각형을 표시합니다."); 
		System.out.println("단수는?");
		  
		  int n3 = sc.nextInt();
		  
		  for(int i = 1 ; i <= n3; i++) { 
			  
			  for(int j = 1 ; j <= (n3-i); j++){
				  System.out.print(" ");		  
			  } 
			  for(int j= 1; j <= i; j++) {
				  System.out.print("*"); 
				    
			  }
			  System.out.println(); 
		  }
		
		
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다."); 
    	System.out.println("단수는?");
		  
		  int n4 = sc.nextInt();
		  
		  for(int i = 1 ; i <= n4; i++) { 
			  
			  for(int j = 1 ; j <= i; j++){
				  System.out.print(" ");		  
			  } 
			  for(int j= 0; j <= (n4-i); j++) {
				  System.out.print("*"); 
				    
			  }
			  System.out.println(); 
		  }

	}
	
}
