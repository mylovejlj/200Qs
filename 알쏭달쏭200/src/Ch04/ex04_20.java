package Ch04;
//달을 정숫값으로 읽어서 해당하는 달의 계절을 표시하는 프로그램을 작성하자. 

//원하는 만큼 입력 및 풀력할 수 있게 하며, 1-12 이외의 값이 입력된 경우에는 재입력 하도록 할것
//do문 안에 do문이 들어가는 이중 루프가 된다.

import java.util.Scanner;

public class ex04_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int month;
		int retry;
		System.out.println("계절 찾습니다.");
		
		do{
			
			do {
				System.out.println("몇 월입니까?");
				month = sc.nextInt();
			} while (month < 1 || month > 12);
	
			
				if (3 <= month && month <= 5) {
					System.out.println("봄입니다.");
				} else if (6 <= month && month <= 8) {
					System.out.println("여름입니다.");
				} else if (9 <= month && month <= 11) {
					System.out.println("가을입니다.");
				} else{
					System.out.println("겨울입니다.");
				}
				
				System.out.println("다시 하시겠습니까? 1.YES 0.NO");
	
				retry = sc.nextInt();
				
		}while(retry==1);
		System.out.println("끝났습니다.");
	}

}
