package Ch07;

import java.util.Random;
import java.util.Scanner;

public class ex07_08 {

	static int random(int min, int max) {
		
		Random rand = new Random();
		
		if (min>=max) {
			return min;
		}else {
			return min + rand.nextInt(max-min+1);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("������ �����մϴ�.");
		System.out.println("���� ��:");
		int min = sc.nextInt();

		System.out.println("���� ��:");
		int max = sc.nextInt();

		
		System.out.println(random(min, max));
	}

}
