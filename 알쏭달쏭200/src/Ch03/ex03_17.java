package Ch03;

import java.util.Scanner;

//키보드에서 입력한 2개의 정숫값 중 작은 값과 큰 값을 표시하는 프로그램을 작성하자. 
// 두 정숫값이 같으면 "두 값이 같습니다"라고 표시한다.
public class ex03_17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수a:");
		int a = sc.nextInt();
		
		System.out.println("정수b:");
		int b = sc.nextInt();
		
//		if(a==b) {
//			System.out.println("두 값은 같습니다.");
//		}else if(a>b){
//			System.out.println("큰 값은"+ a +"입니다.");
//			System.out.println("작은 값은"+ b +"입니다.");
//		}else {
//			System.out.println("큰 값은"+ b +"입니다.");
//			System.out.println("작은 값은"+ a +"입니다.");
//		}
			
		
		if(a==b) {
			System.out.println("두 값은 같습니다.");
		}else{
			int min, max;
			
			if(a<b) {
				min=a; max=b;
			}else {
				min=b; max=a;
			}
			System.out.println("큰 값은"+ max +"입니다.");
			System.out.println("작은 값은"+ min +"입니다.");
		}
		
	}
}
