package Ch05;
//0.0.부터 1.0까지 0.001단위로 증가시키면서 해당 값의 제곱을 표시하자.
public class ex05_09 {

	public static void main(String[] args) {
		
		System.out.println("x        x의 제곱");
		System.out.println("--------------------");
		
		
		for(float x= 0.0F; x<= 1.0F; x+=0.001F) {
			System.out.printf("%5.3f      %10.7f\n",x,x*x);
		}
	}

}
