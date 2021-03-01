package Ch04;

import java.util.Scanner;

//5개의 정수로 구성된 그룹의 전체 합계(그룹 별이 아닌 전체 그룹의 합)를 구하는 프로그램을 작성하자. 
//전체 10개의 그룹이 있으며 각 정숫값은 키보드를 통해 입력한다. 
//단, 99999를 입력하면 전체 입력을 종료하고 88888을 입력하면 현재 읽고있는 그룹의 입력을 종료할 것)
public class ex04_29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 더합니다.");

		int i;
		int k;
		int sum = 0;
	
	Outer:
		for (i = 1; i <= 10; i++) {

			System.out.println(i + "그룹");

			for (int j = 0; j<=5; j++) {
				
				System.out.println("정수:");

				k = sc.nextInt();
			
				if(k==88888) {
					continue Outer; //Outer문의 끝으로 건너뛰어!
				}else if(k==99999) {
					break Outer; //Outer루프문을 벗어나!
				}
			
				sum += k;
			}

		}

		System.out.println("합계는:" + sum + "입니다");
		
	}

}
