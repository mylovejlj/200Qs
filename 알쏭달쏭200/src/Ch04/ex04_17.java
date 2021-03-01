package Ch04;

import java.util.Scanner;

//읽은 개수만큼 *를 표시하는 문제 4-11을 변경해서 5개 단위로 줄 바꿈해서 표시하는 프로그램을 만들자
public class ex04_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 개의 별을 출력할까요?");
		
		int x = sc.nextInt();
		
		if(x>0) {
			for(int i=1; i <= x; i++) {
			
				if(i%5==0) {
					System.out.println('*');
				}else{
					System.out.print('*');		//문자 리터럴 ''사용
				}
		
			}
		
		}
	}

}
