package Ch04;

import java.util.Scanner;

//���� �������� 0���� ī��Ʈ �ٿ��ϴ� [�L[4-5]�� for������ �ۼ��ϰ�
//��, �ݺ� ���� ���� x���� ǥ������ �ʾƵ� �ȴ�.
public class ex04_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ī��Ʈ�ٿ� �մϴ�.");
		
		int x ;
		
		do {
			System.out.println("���� ������:");
			x = sc.nextInt();
		}while(x<=0);
		
		for(x=x; x>=0; x--) {
			System.out.println(x);
		}
		
	}

}
