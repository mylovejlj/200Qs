package Ch04;

import java.util.Scanner;

//1���� n������ �������� �� ���� �����ؼ� ǥ���ϴ� ���α׷��� �ۼ��϶�.(n���� �Է¹��� ��)
public class ex04_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("�Է��� ������?");

		int x = sc.nextInt();
		
		for(int i=1, j=1; i<=x; i++,j=i*i) {
			System.out.println(i +"�� ������"+ j +"�Դϴ�.");
		}
	}

}
