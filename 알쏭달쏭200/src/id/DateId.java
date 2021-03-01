package id;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

import Ch10.Id2;

//Ŭ����(Ʋ) ����
public class DateId{
	
	private static int counter;
	private int id;
	
	// Ŭ���� �ʱ�ȭ
	static {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);
		int m = today.get(MONTH);
		int d = today.get(DATE);
		
		System.out.printf("������ %04d�� %02d�� %02d���Դϴ�.\n",y,m,d);
	
		counter = y * 1000000 + m * 10000 + d * 100;
	}
	
	// ������
	public DateId() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}
	
}
