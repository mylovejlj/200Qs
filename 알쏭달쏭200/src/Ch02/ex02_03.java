package Ch02;
//ex02_02와 동일한 프로그램의 변수 x,y에 실숫값을 대입하고 그 결과를 알아보자
//결과:콤파일 에러가 납니다
public class ex02_03 {

	public static void main(String[] args) {
		int x, y;
		
		x=81.0;
		y=38.7;
		
		System.out.println("x의 값은"+x+"입니다");
		System.out.println("y의 값은"+y+"입니다");
		System.out.println("합계는"+(x+y)+"입니다");
		System.out.println("평균은"+(x+y)/2+"입니다");
	

	}

}
