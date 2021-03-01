package Ch10;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Point2D {

	private static int counter = 0;
	private static int day;

	private int x = 0;
	private int y = 0;

	//클래스 초기화. 클래스 변수에 값이 대입 될 때.
	static {
		GregorianCalendar today = new GregorianCalendar();
		day = today.get(DATE);
	}
	//인스턴스 초기화
	{
		if(++counter == day) {
			System.out.print("당첨!!");
			System.out.printf("오늘 %d개의 좌표가 생겼습니다.\n ",counter);
		}
	}
	
	public Point2D() {
	}

	public Point2D(int x) {
		this.x = x;
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
