package Ch03;

import java.util.Scanner;

//�������� �о ���밪�� ������
public class ex03_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("������:");

		int a = sc.nextInt();
		
		int abs;
		
		if(a<0) {
			abs = -a;
		}else {
			abs = a;
		}
		
		System.out.println("���밪��"+ abs + "�Դϴ�.");
	}

}
