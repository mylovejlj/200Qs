package Ch04;

import java.util.Scanner;

//���庰 ǥ�� ü�� ����ǥ�� ǥ���ϴ� ���α׷��� �ۼ�����. ǥ���� ������ ����(���۰�,���ᰪ,������)�� ���������� �Է��� ��
public class ex04_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� cm����:");
		int hMin = sc.nextInt();
	
		System.out.println("�� cm����:");
		int hMax = sc.nextInt();
	
		System.out.println("�� cm����:");
		int step = sc.nextInt();
	
		System.out.println("���� ǥ�� ü��");
		System.out.println("-------------------");
	
		for(int i = hMin; i <= hMax; i += step) {
			
			System.out.println(i + " " + (i - 100)*0.9);
		}
	}

}
