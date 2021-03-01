package Ch03;

import java.util.Scanner;

//키보드에서 입력한 3개의 정숫값 중 중앙값을 구해서 표시하는 프로그램을 작성하자. 
//예를 들어 2,3,1의 중앙값은 2이고 1,2,1의 중앙값은 1이고, 3, 3, 3의 중앙값은 3이다.
public class ex03_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수a:");
		int a = sc.nextInt();
		
		System.out.println("정수b:");
		int b = sc.nextInt();
		
		System.out.println("정수c");
		int c = sc.nextInt();
		
		int mid;
		
		if( ( a<=b && b<=c) || ( c<=b && b<=a ) )
			mid = b;
		else if ( ( a>=b && a<=c) || (c<=a && a<=b) )
			mid = a;
		else
			mid = c;
		
		System.out.println("중앙 값은" + mid + "입니다");

	}

}
