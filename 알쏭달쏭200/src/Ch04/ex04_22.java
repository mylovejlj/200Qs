package Ch04;

import java.util.Scanner;

//��ȣ���� *�� �����ؼ� ������ �̵ �ﰢ���� ǥ���ϴ� ���α׷��� �ۼ�����. 
//������ ��ġ�� ���� �Ʒ�, ���� ��, ������ �Ʒ�, ��� ���� ǥ���ϴ� ���α׷��� ���� �ۼ��� ��
public class ex04_22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		 System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�.");
		 System.out.println("�ܼ���?");
		  
		  int n1 = sc.nextInt();
		  
		  for(int i = 1 ; i <= n1; i++) { 
		 	 for(int j = 1 ; j <= i; j++){
		  		System.out.print("*");
		  
		  	 } 
		    System.out.println(); 
		  }
		 
		
		  System.out.println("���� ���� ������ �̵ �ﰢ���� ǥ���մϴ�."); 
		  System.out.println("�ܼ���?");
		  
		  int n2 = sc.nextInt();
		  
		  for(int i = 1 ; i <= n2; i++) { 
			  
			  for(int j = 0 ; j <= (n2-i); j++){
				  System.out.print("*");		  
			  } 
			  System.out.println(); 
		  }
		
		System.out.println("���� �� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�."); 
		System.out.println("�ܼ���?");
		  
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
		
		
		System.out.println("������ ���� ������ �̵ �ﰢ���� ǥ���մϴ�."); 
    	System.out.println("�ܼ���?");
		  
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
