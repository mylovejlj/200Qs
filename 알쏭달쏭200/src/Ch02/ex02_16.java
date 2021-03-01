package Ch02;

import java.util.Scanner;

//String형의 변수를 초기화하거나 변수에 문자열을 대입하는 프로그램을 만드세요.
public class ex02_16 {

	public static void main(String[] args) {

		String s1 = "ABC";
		String s2 = "XYZ";
		
		System.out.println("문자열 s1은"+ s1 +"입니다.");
		System.out.println("문자열 s2은"+ s2 +"입니다.");
		
		s1 = "abc"; //대입. 참조 위치 변경
		System.out.println("문자열 s1은"+ s1 +"입니다.");
		System.out.println("문자열 s2은"+ s2 +"입니다.");
		
	}

}
