package Ch04;

import java.util.Scanner;

//양의 정숫값을 읽어서 소수인지를 판정하는 프로그램을 작성하자. 소수란 2이상 n미만인 수중 어떤 수로도 나누어지지 않는 정숫값n이다.(즉, 자기 자신과 1로만 나누어지는 수)
public class ex04_25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.println("2이상의 정숫값:");
			n = sc.nextInt();
		} while (n < 2);
		
		
		int i;
		
		for(i=2; i<n; i++) {
			
			if(n%i==0) {
				break;
			}
		}
		
		
		if ( i == n) {
			System.out.println("소수입니다");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}

}
