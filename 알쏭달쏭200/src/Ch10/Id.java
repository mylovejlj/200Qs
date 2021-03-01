package Ch10;

//Ŭ����(Ʋ) ����
public class Id {
	
	static int counter = 0;
	private int id;

	public Id() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}

}

class IdTester {

	public static void main(String[] args) {

		// Ŭ������ ������, �ν��Ͻ�(Ŭ������ ��ü)��ü�� ����
		Id a = new Id();
		Id b = new Id();

		System.out.println("a�� �ĺ���ȣ:" + a.getId());
		System.out.println("b�� �ĺ���ȣ:" + b.getId());

		System.out.println("Id.counter:" + Id.counter);
		System.out.println("a.counter:" + a.counter);
		System.out.println("b.counter:" + b.counter);
	}
}
