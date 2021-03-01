package Ch04;

import java.util.Scanner;

//2개의 정숫값을 읽어서 두 정수 사이에 있는 모든 정숫값을, 작은 것부터 큰 순으로 표시하는 프로그램을 작성하자.
public class ex04_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정숫 값 x:");
		int x = sc.nextInt();
		
		System.out.println("정숫 값 y:");
		int y = sc.nextInt();
		
		int tmp;
		
		//일단, 두 수를 정렬
		if(x>y) {
			tmp = x;
			x = y;
			y = tmp;
		}
		
		//작은 수를 기준으로 1씩 더해가면서 출력하기
		do {
			System.out.print(x+",");
			x = x+1;
			
		}while(x<=y);			//작은수가 큰수보다 작거나 같을 동안 반복하기
		
	}

}
