package Ch04;

import java.util.Scanner;

//�Է��� �������� ��� ����� �� ������ ǥ���ϴ� ���α׷��� �ۼ�����
public class ex04_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է��� ������?");
		
		int x = sc.nextInt();
		
		
		System.out.println("�����:");
		int cnt=0;
		for(int i=1; i<=x; i++) {
			if(x%i == 0) {
				System.out.print(i +",");
				cnt++;
			}
		}
		System.out.println("����� �� ������"+cnt+"�� �Դϴ�"); 

	}

}
