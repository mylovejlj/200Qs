package Ch10;

import java.util.Scanner;

public class AccountTester2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("계좌 개설 수:");
		int n = sc.nextInt();
		Account2[] a = new Account2[n];

		for (int i = 0; i < a.length; i++) {
			System.out.println("[0]..간이  [1]..상세:");
			int type = sc.nextInt();

			System.out.println("계좌 정보를 입력하세요.");
			System.out.print("명  의:");
			String name = sc.next();
			System.out.println("번  호:");
			String no = sc.next();
			
			if(type==0) {
				a[i] = new Account2(name, no);
			}else {
				System.out.println("잔    고:");
				long balance = sc.nextLong();
				
				System.out.println("개설 연도:");
				int y = sc.nextInt();
				
				System.out.println("개설 월:");
				int m = sc.nextInt();
				
				System.out.println("개설 일:");
				int d = sc.nextInt();
				
				a[i] = new Account2(name, no, balance, new Day2(y,m,d));
			}
			
			System.out.println("계좌 기본 정보:"+a[i]);
			System.out.println("식별 번호:"+a[i].getId());
			System.out.println("개설 일:"+a[i].getOpenDay().toString()	);

		
		}
		
	}

}
