package Ch04;

import java.util.Random;
import java.util.Scanner;

//2자리의 정숫값(10-99)을 맞추는 '숫자 맞추기 게임'을 만들자. 난수 생성과 if문 그리고 do문을 사용할 것.
public class ex04_03 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int rnd = (int) (Math.random()*(99-10+1)+10);
		
		System.out.println("숫자 맞추기 게임 시작!");
		
		System.out.println("10부터 99까지의 숫자를 맞추세요.");
		
		System.out.println("어떤 숫자 일까요?");
	
		int x;
	
	do {
		x = sc.nextInt();
		
		if (x > rnd)
			System.out.println("더 작은 숫자입니다.");
		else if(x < rnd)
			System.out.println("더 큰 숫자입니다.");
		
	}while(x != rnd);
	
		System.out.println("정답입니다!");
	}

}
