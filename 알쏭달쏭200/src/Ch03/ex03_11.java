package Ch03;

import java.util.Scanner;

//�Է��� ������ ���� ��,��,��,��,���� �����ϴ� ���α׷��� �ۼ����� (&&�̿�)
public class ex03_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����:");
		int a = sc.nextInt();
		
		if (80 <=a && a <= 100) {
			System.out.println("��");
		}else if (70 <=a && a <= 79)  {
			System.out.println("��");
		}else if (60 <=a && a <= 69)  {
			System.out.println("��");
		}else if (50 <=a && a <= 59)  {
			System.out.println("��");
		}else if (0 <=a && a <= 49)  {
			System.out.println("��");
		}else {
			System.out.println("�߸� �� �����Դϴ�.");
		}
	}
}
