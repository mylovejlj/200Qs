package Ch07;
//��ȣ �Ǻ��ϱ�
import java.util.Scanner;

public class ex07_01 {

	static int signOf(int n) {
		
		int sign = 0;
		
		if(n>0)
			sign =1;
		else if (n<0)
			sign = -1;
		
		return sign;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� x:");
		int x = sc.nextInt();
		
		int s = signOf(x);
		System.out.println("signOf(x)��"+s+"�Դϴ�.");
	}

}
