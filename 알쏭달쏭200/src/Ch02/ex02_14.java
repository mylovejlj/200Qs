package Ch02;

import java.util.Scanner;

//키보드로 입력한 성과 이름으로 인사하는 프로그램을 만들어 보세요.
public class ex02_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성:");
		String lName = sc.next();
		
		System.out.println("이름:");
		String fName = sc.next();
		
		System.out.println("안녕하세요."+ lName + fName +" 씨.");

	}

}
