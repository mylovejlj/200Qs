package Ch04;

import java.util.Scanner;

//5���� ������ ������ �׷��� ��ü �հ�(�׷� ���� �ƴ� ��ü �׷��� ��)�� ���ϴ� ���α׷��� �ۼ�����. 
//��ü 10���� �׷��� ������ �� �������� Ű���带 ���� �Է��Ѵ�. 
//��, 99999�� �Է��ϸ� ��ü �Է��� �����ϰ� 88888�� �Է��ϸ� ���� �а��ִ� �׷��� �Է��� ������ ��)
public class ex04_29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("������ ���մϴ�.");

		int i;
		int k;
		int sum = 0;
	
	Outer:
		for (i = 1; i <= 10; i++) {

			System.out.println(i + "�׷�");

			for (int j = 0; j<=5; j++) {
				
				System.out.println("����:");

				k = sc.nextInt();
			
				if(k==88888) {
					continue Outer; //Outer���� ������ �ǳʶپ�!
				}else if(k==99999) {
					break Outer; //Outer�������� ���!
				}
			
				sum += k;
			}

		}

		System.out.println("�հ��:" + sum + "�Դϴ�");
		
	}

}
