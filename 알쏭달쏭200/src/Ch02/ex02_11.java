package Ch02;

import java.util.Random;

//한자리 양의 정숫값, 한자리 음의 정숫값, 두 자리 양의 정숫값을 랜덤으로 생성해서 표시
public class ex02_11 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int x = 1 + rnd.nextInt(9);
		int y = -1 - rnd.nextInt(9);
		int z = 10 + rnd.nextInt(90);
		
		
		System.out.println("3개의 난수를 생성했습니다.");
		System.out.println("한 자리 양의 정수:"+x);
		System.out.println("한 자리 양의 정수:"+y);
		System.out.println("두 자리 양의 정수"+z);
		

	}

}
