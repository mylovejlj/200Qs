package Ch06;

import java.util.Scanner;

//�迭���� Ư�� ���� ������ ��Ҹ� ã�ƶ�. 
//���� ���� ��Ұ� ���� �� ������ ���� �տ� ��ġ�� ��Ҹ� ã�� ���α׷��� ������.
public class ex06_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("��� ��:");

		int n = sc.nextInt();
		int[] arr = new int[n];

		// �迭�� �� �Է�
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		System.out.println("ã�� ����:");
		int target = sc.nextInt();

		int i;
		
		// ã�� ���� Ž��
		for ( i = 0; i < n; i++) {
			if (arr[i] == target) {
				break;
			}
		}
		
		//����Ʈ!
		//i�� ������ �ε������� ���� �ʾ��� ���, �� Ž���� ������ �� ã���� ���
		if (i < n) {
			System.out.println("�� ���� arr[" + i + "]�� �ֽ��ϴ�.");
		} else {
			System.out.println("�� ���� �������� �ʽ��ϴ�.");
		}

	}

}
