package Ch10;

import java.util.Scanner;

public class ex10_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Ǽ���:");
		double x = sc.nextDouble();
		
		System.out.println("����:"+Math.abs(x));
		System.out.println("������:"+Math.sqrt(x));
		System.out.println("����:"+Math.PI*x*x);

		
	}

}
