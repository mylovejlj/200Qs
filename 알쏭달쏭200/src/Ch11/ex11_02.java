package Ch11;

import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.in;
import static java.lang.System.out;


public class ex11_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(in);
		
		out.print("�� ��:");
	
		double x = sc.nextDouble();
		
		out.print("����:"+abs(x));
		out.print("������:"+sqrt(x));
		out.print("��  ��:"+PI*x*x);

		
	}

}
