package Ch05;
//0.0.���� 1.0���� 0.001������ ������Ű�鼭 �ش� ���� ������ ǥ������.
public class ex05_09 {

	public static void main(String[] args) {
		
		System.out.println("x        x�� ����");
		System.out.println("--------------------");
		
		
		for(float x= 0.0F; x<= 1.0F; x+=0.001F) {
			System.out.printf("%5.3f      %10.7f\n",x,x*x);
		}
	}

}
