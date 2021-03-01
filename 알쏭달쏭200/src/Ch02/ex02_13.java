package Ch02;

import java.util.Random;
import java.util.Scanner;

//0.0이상 1.0미만의 실숫값을 랜덤으로 생성해서 표시
//0.0이상 10.0미만의 실숫값을 랜덤으로 생성해서 표시
//-1.0이상 1.0미만의 실숫값을 랜덤으로 생성해서 표시
public class ex02_13 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		double r1 = rnd.nextDouble();
		double r2 = rnd.nextDouble() * 10; //이부분 정답 자신 없습니다.
		double r3 = -1 + 2 * rnd.nextDouble();
		
		System.out.println("3개의 난수를 생성했습니다.");
		System.out.println("0.0이상 1.0미만:" + r1);
		System.out.println("0.0이상 10.0미만:" + r2);
		System.out.println("-1.0이상 1.0미만:" + r3);
		
		
	
	}

}
