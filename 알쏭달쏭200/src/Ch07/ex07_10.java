package Ch07;

import java.util.Random;
import java.util.Scanner;

public class ex07_10 {

	static Scanner sc = new Scanner(System.in);

	static boolean confirmRetry() {

		int retry;

		do {

			System.out.println("�ٽ� �Ͻðڽ��ϱ�? YES-1 NO-0");

			retry = sc.nextInt();

		} while (retry != 0 && retry != 1);

		return (retry == 1);
	}

	public static void main(String[] args) {

		Random rd = new Random();
		System.out.println("�ϻ��Ʒ�");

		do {

			int x = rd.nextInt(900) + 100;
			int y = rd.nextInt(900) + 100;
			int z = rd.nextInt(900) + 100;
			int pattern = rd.nextInt(4);

			int answer;
			
			switch (pattern) {
			case 0:
				answer = x + y + z;
				break;
			case 1:
				answer = x + y - z;
				break;
			case 2:
				answer = x - y + z;
				break;
			default:
				answer = x - y - z;
				break;
			}

			while (true) {
				System.out.print(
						x + ((pattern < 2) ? "+" : "-") + 
						y + ((pattern % 2) == 0 ? "+" : "-") + 
						z + "="
				);
				
				int k = sc.nextInt();
				if ( k==answer) {
					break;
				}System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		} while (confirmRetry());
	}

}
