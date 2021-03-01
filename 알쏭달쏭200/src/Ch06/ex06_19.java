package Ch06;

import java.util.Scanner;

//6명의 두 과목 점수(국어, 수학)을 읽어 과목별 평균과 학생별 평균을 구하자.
public class ex06_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int number = 3;
		int[][] point = new int[number][2];
		int[] sumStudent = new int[number];
		int[] sumSubject = new int[2];

		System.out.printf("%d명의 국어, 수학 점수를 립력하세요\n", number);

		for (int i = 0; i < number; i++) {
			System.out.printf("%2d번 국어:", i + 1);
			point[i][0] = sc.nextInt();
			System.out.println("       수학:");
			point[i][1] = sc.nextInt();

			sumStudent[i] = point[i][0] + point[i][1];
			sumSubject[0] += point[i][0];
			sumSubject[1] += point[i][1];
		}

		System.out.println("NO. 국어    수학    평균");
		for (int i = 0; i < number; i++) {
			System.out.printf("%2d%6d%6d%6.1f\n", i + 1, point[i][0], point[i][1], (double) sumStudent[i] / 2);
		}
		System.out.printf("평균%6.1f%6.1f\n", (double) sumSubject[0] / number, (double) sumSubject[1] / number);

	}

}
