package Ch03;

import java.util.Scanner;

//�� �������� ���� 10������ ��� "�� ���� ���� 10�����Դϴ�."��� ǥ���ϰ�, 
//�׷��� ������ "�� ���� ���� 11�̻��Դϴ�"��� ǥ���ϴ� ���α׷��� ����ÿ�
public class ex03_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����a:");
		int a = sc.nextInt();
		
		System.out.println("����b:");
		int b = sc.nextInt();
		
		int diff = a-b < 0 ? b-a : a-b; 
				
		System.out.println("�� ���� ����"+ (diff <= 10 ? "10����" : "11�̻�") + "�Դϴ�");
	}

}
