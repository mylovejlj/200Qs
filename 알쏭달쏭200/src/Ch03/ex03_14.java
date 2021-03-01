package Ch03;

import java.util.Scanner;

//두 정숫값의 차가 10이하인 경우 "두 값의 차는 10이하입니다."라고 표시하고, 
//그렇지 않으면 "두 값의 차는 11이상입니다"라고 표시하는 프로그램을 만드시오
public class ex03_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수a:");
		int a = sc.nextInt();
		
		System.out.println("정수b:");
		int b = sc.nextInt();
		
		int diff = a-b < 0 ? b-a : a-b; 
				
		System.out.println("두 값의 차는"+ (diff <= 10 ? "10이하" : "11이상") + "입니다");
	}

}
