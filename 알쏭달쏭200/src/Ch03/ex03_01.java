package Ch03;

import java.util.Scanner;

//키보드로 입력한 정숫값이 음이면 '이 값은 음의 값입니다'라고 표시하자.
public class ex03_01 {
//ctrl+shift+M 클래스 생성 단축키
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정숫값:");
		
		int a = sc.nextInt();
		
		if(a<0) {
			System.out.println("이 값은 음의 값입니다");
		}
	}

}
