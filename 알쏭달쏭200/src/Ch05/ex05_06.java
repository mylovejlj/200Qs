package Ch05;

import java.util.Scanner;

//3개의 정숫값의 합계와 평균을 구하는 프로그램을 만들자.
//평균은 캐스트 연산자를 이용해서 구하고 실수로 표시할 것
public class ex05_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("정숫값 x, y, z의 평균을 구합니다.");
		System.out.println("x값:");
		int x = sc.nextInt();
		System.out.println("y값:");
		int y = sc.nextInt();
		System.out.println("z값:");
		int z = sc.nextInt();
		
		double avg = (double)(x+y+z)/3;
		System.out.printf("x,y,z의 평균은 %.3f입니다",avg);
	}

}
