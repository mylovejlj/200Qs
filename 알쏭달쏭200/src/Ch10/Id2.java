package Ch10;

//Ŭ����(Ʋ) ����
public class Id2{
	
	private static int counter = 0;	
	private int id;

	public Id2() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}
	
	public static int getMaxId() {
		return counter;
	}
}

class IdTester2 {

	public static void main(String[] args) {
		
		// Ŭ������ ������, �ν��Ͻ�(Ŭ������ ��ü)��ü�� ����
		Id2 a = new Id2();
		Id2 b = new Id2();
		
		System.out.println("a�� �ĺ���ȣ:" + a.getId());
		System.out.println("b�� �ĺ���ȣ:" + b.getId());
		
		System.out.println("���������� �ο��� �ĺ� ��ȣ:" + Id2.getMaxId());
		System.out.println("���������� �ο��� �ĺ� ��ȣ:" + a.getMaxId());
		System.out.println("���������� �ο��� �ĺ� ��ȣ:" + b.getMaxId());
	}
}
