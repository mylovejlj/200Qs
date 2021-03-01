package Ch02;

import java.util.Scanner;

//입력한 주소를 표시하는 프로그램을 작성해보세요.
public class ex02_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("주소:");
		String addr = sc.nextLine();
		
		System.out.println("주소는"+ addr +"입니다.");
	}

}
