package Ch04;

import java.util.Scanner;

//1부터 n까지의 정숫값에 각 값을 제곱해서 표시하는 프로그램을 작성하라.(n값을 입력받을 것)
public class ex04_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("입력한 정숫값?");

		int x = sc.nextInt();
		
		for(int i=1, j=1; i<=x; i++,j=i*i) {
			System.out.println(i +"의 제곱은"+ j +"입니다.");
		}
	}

}
