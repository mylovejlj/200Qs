package Ch04;

import java.util.Scanner;

//입력받은 정숫값부터 0까지 카운트다운하는 프로그램을 작성하자. 카운트다운 종료 후 변숫값을 확인할 수 있게 할 것.
public class ex04_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("카운트 다운 합니다.");
		
		int x;
		
		do {	
			
			System.out.println("양의 정숫 값 x:");
			x = sc.nextInt();
			
		}while(x<=0);
		
		
		while(x>=0)						//while 문에서 실행될 명령문이 한 줄 뿐이라면 중괄호({}) 생략가능.
			System.out.println(x--);	//x값 출력 후 x값 감소. 후위 감소 연산자
			
		System.out.println("x의 값이"+ x +"가 되었습니다.");
	
	}

}
