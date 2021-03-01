package Ch04;

import java.util.Scanner;

//문제 4-5에서 x-- 를 --x 고치면 어떻게 출력이 바뀌는지 검증하자. 프로그램을 작성해서 실행 결과를 확인할 것.
//답: x의 값이 감소 된 후 출력되므로 입력한 값보다 1작은수부터 -1까지 출력된다.
public class ex04_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카운트 다운 합니다.");
		
		int x;
		
		do {	
			
			System.out.println("양의 정숫 값 x:");
			x = sc.nextInt();
			
		}while(x<=0);
		
		
		while(x>=0)						//while 문에서 실행될 명령문이 한 줄 뿐이라면 중괄호({}) 생략가능.
			System.out.println(--x);	//x값 감소 후 출력. 후위 감소 연산자
			
		System.out.println("x의 값이"+ x +"가 되었습니다.");
		
	}

}
