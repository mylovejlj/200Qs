package Ch03;

import java.util.Scanner;

//2개의 양의 정숫값을 읽어서, 후자가 전자의 약수이면 
//"B는 A의 약수이다"라고 표시하고 그렇지 않으면 
//"B는 A의 약수가 아니다"라고 표시하자.
public class ex03_03 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("변수A:");
		int a = sc.nextInt();
		
		System.out.println("변수B:");
		int b = sc.nextInt();
		
		if (a % b == 0) {
			System.out.println("B는 A의 약수이다.");
		}else {
			System.out.println("B는 A의 약수가 아니다.");
		}
		
	}

}
