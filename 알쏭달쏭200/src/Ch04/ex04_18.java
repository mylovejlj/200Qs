package Ch04;

import java.util.Scanner;

//입력한 정숫값의 모든 약수와 그 개수를 표시하는 프로그램을 작성하자
public class ex04_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력한 정숫값?");
		
		int x = sc.nextInt();
		
		
		System.out.println("약수는:");
		int cnt=0;
		for(int i=1; i<=x; i++) {
			if(x%i == 0) {
				System.out.print(i +",");
				cnt++;
			}
		}
		System.out.println("약수의 총 갯수는"+cnt+"개 입니다"); 

	}

}
