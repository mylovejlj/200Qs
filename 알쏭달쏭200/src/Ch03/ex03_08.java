package Ch03;

import java.util.Scanner;

//입력한 정숫값이 5로 나누어 떨어지면 "이 값을 5로 나누어집니다"라고 표시하고 
//그렇지 않으면 "이 값은 5로 나누어지지 않습니다"라고 표시하는 프로그램을 만들자
//음수를 입력한 경우에는 음의 정숫값을 입력했습니다 라고 표시할 것
public class ex03_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("정숫값:");
		int a = sc.nextInt();
		
		if(a>0) {
			if (a%5 == 0) {
				System.out.println("이 값은 5로 나누어집니다.");
			}else {
				System.out.println("이 값은 5로 나누어지지 않습니다.");
			}
		}else {
			System.out.println("음의 정숫값을 입력했습니다.");
		}
	}
}
