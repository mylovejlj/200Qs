package Ch06;

import java.util.Scanner;

//학급 수, 각 학급의 학생 수, 그리고 모든 학생의 점수를 읽어서 
//합계와 평균을 구하는 프로그램을 작성하자. 
//합계와 평균은 학급 단위와 전교생을 대항으로 하는 것을 각각 구하자.
public class ex06_21 {

	public static void main(String[] args) {

		System.out.print("학급 수:");
		Scanner sc = new Scanner(System.in);
		int classNum = sc.nextInt();
		int[][] point = new int[classNum][];
		int totNumber = 0;

		for (int i = 0; i < point.length; i++) {
			System.out.printf("\n%d반의 학생 수:", i + 1);
			int num = sc.nextInt();
			point[i] = new int[num];
			totNumber += num;
			for (int j = 0; j < point[i].length; j++) {
				System.out.printf("%d반%d번의 점수:", i + 1, j + 1);
				point[i][j] = sc.nextInt();
			}
		}
		
		System.out.printf("  반 | 합계   평균");
		System.out.println("------------------------");
		int total = 0;
		for (int i = 0; i < point.length; i++) {
			int sum = 0;
			for (int j = 0; j < point[i].length; j++) {
				sum += point[i][j];
			}
			total += sum;
			System.out.printf(" %2d반   |%7d%7.1f\n", i + 1, sum, (double) sum / point[i].length);
		}
		System.out.println("------------------------");
		System.out.printf("  합 |%7d%7.1f\n", total, (double) total / totNumber);
	}

}
