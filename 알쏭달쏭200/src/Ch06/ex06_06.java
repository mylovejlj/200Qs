package Ch06;

import java.util.Scanner;

//�迭�� ��� ���� ���� ����� ���� �Է� �޾Ƽ� ǥ���ϴ� ���α׷��� �ۼ�����. 
//ǥ�� ������ �迭 �ʱ갪�� ���� ��������, �� ����� ���� ��ǥ�� �����ϰ� {}�� ���� �����̴�.
public class ex06_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("��� ��:");

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		int a;
		System.out.print("arr={");

		for (int i = 0; i < n; i++) {
			
			if (i == n - 1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.print("}");
	}

}
