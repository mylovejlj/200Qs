package Ch03;

import java.util.Scanner;

//입력한 정숫값을 3으로 나누다. 그리고 그 결과에 따라 "이 값은 3으로 나누어집니다"
//"이 값을 3으로 나눈 나머지는 1입니다", "이 값을 3으로 나눈 나머지는 2입니다" 중 하나를 표시하는 프로그램을 작성하시오.
//(단, 양수가 아닌 경우 "양수가 아닌 값을 입력했습니다"라고 표시할 것)"
public class ex03_10 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정숫값:");
		int a = sc.nextInt();
		
		int na = a%3; 
		
		if(a>0) {
			if (na == 0) {
				System.out.println("이 값은 3으로 나누어 집니다.");
			}else if (na == 1)  {
				System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
			}else {
				System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
			}				
		}else {
			System.out.println("음의 정숫값을 입력했습니다.");
		}
	}
}