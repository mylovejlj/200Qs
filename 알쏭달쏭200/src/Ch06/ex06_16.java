package Ch06;

import java.util.Random;
import java.util.Scanner;

//������ ǥ���ϰ� �ش� ������ ���� �ܾ �Է��ϴ� �����н� ���α׷��� ������
public class ex06_16 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		String[] dayKor = { "��","��","ȭ","��","��","��","��" };
		String[] dayEng = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		
		System.out.println("���� ���� ����ҹ��ڷ� �Է��ϼ���.");

		int retry;
		int last = -1;

		do {
			//���� ���� �κ�
			int day;

			do {
				day = rd.nextInt(7);
			} while (day == last);
			last = day;

			//���� �Է� �� ���� �κ�
			while (true) {
				
				System.out.println(dayKor[day]+ "����:");
				String answer = sc.next();

				if (answer.equals(dayEng[day])) {
					break;
				}
				System.out.println("Ʋ�Ƚ��ϴ�.");

			}
			System.out.println("�����Դϴ�! �ٽ� �ѹ�?  YES-1, NO-0");
			retry = sc.nextInt();

		} while (retry == 1);

	
}

}
