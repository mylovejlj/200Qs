package Ch11;

import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.in;
import static java.lang.System.out;


public class ex11_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(in);
		
		out.print("½Ç ¼ö:");
	
		double x = sc.nextDouble();
		
		out.print("Àý´ñ°ª:"+abs(x));
		out.print("Á¦°ö±Ù:"+sqrt(x));
		out.print("³Ð  ÀÌ:"+PI*x*x);

		
	}

}
