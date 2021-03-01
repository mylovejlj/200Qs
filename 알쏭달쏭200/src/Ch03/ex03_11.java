package Ch03;

import java.util.Scanner;

//입력한 정수에 따라 수,우,미,양,가를 판정하는 프로그램을 작성하자 (&&이용)
public class ex03_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수:");
		int a = sc.nextInt();
		
		if (80 <=a && a <= 100) {
			System.out.println("수");
		}else if (70 <=a && a <= 79)  {
			System.out.println("우");
		}else if (60 <=a && a <= 69)  {
			System.out.println("미");
		}else if (50 <=a && a <= 59)  {
			System.out.println("양");
		}else if (0 <=a && a <= 49)  {
			System.out.println("가");
		}else {
			System.out.println("잘못 된 점수입니다.");
		}
	}
}
