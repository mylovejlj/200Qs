package Ch10;

import java.util.Scanner;

public class AccountTester2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ��:");
		int n = sc.nextInt();
		Account2[] a = new Account2[n];

		for (int i = 0; i < a.length; i++) {
			System.out.println("[0]..����  [1]..��:");
			int type = sc.nextInt();

			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print("��  ��:");
			String name = sc.next();
			System.out.println("��  ȣ:");
			String no = sc.next();
			
			if(type==0) {
				a[i] = new Account2(name, no);
			}else {
				System.out.println("��    ��:");
				long balance = sc.nextLong();
				
				System.out.println("���� ����:");
				int y = sc.nextInt();
				
				System.out.println("���� ��:");
				int m = sc.nextInt();
				
				System.out.println("���� ��:");
				int d = sc.nextInt();
				
				a[i] = new Account2(name, no, balance, new Day2(y,m,d));
			}
			
			System.out.println("���� �⺻ ����:"+a[i]);
			System.out.println("�ĺ� ��ȣ:"+a[i].getId());
			System.out.println("���� ��:"+a[i].getOpenDay().toString()	);

		
		}
		
	}

}
