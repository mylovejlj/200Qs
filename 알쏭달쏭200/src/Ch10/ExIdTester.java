package Ch10;

//Ŭ����(Ʋ) ����
class ExId {

	static int counter = 0;
	private static int step = 1;

	private int id;

	public ExId() {
		id = counter += step;
	}

	public int getId() {
		return id;
	}

	public static int getStep() {
		return step;
	}

	public static int setStep(int s) {
		step = (s >= 1) ? s : 1;
		return step;
	}

	public static int getMaxId() {
		return counter;
	}
}

public class ExIdTester {

	public static void main(String[] args) {

		// Ŭ������ ������, �ν��Ͻ�(Ŭ������ ��ü)��ü�� ����
		ExId a = new ExId();
		ExId b = new ExId();
		ExId c = new ExId();
		ExId.setStep(4);
		ExId d = new ExId();
		ExId e = new ExId();
		ExId f = new ExId();

		System.out.println("a�� �ĺ���ȣ:" + a.getId());
		System.out.println("b�� �ĺ���ȣ:" + b.getId());
		System.out.println("c�� �ĺ���ȣ:" + c.getId());
		System.out.println("d�� �ĺ���ȣ:" + d.getId());
		System.out.println("e�� �ĺ���ȣ:" + e.getId());
		System.out.println("f�� �ĺ���ȣ:" + f.getId());

		int max = ExId.getMaxId();
		System.out.println("���������� �ο��� �ĺ� ��ȣ:" + max);
		System.out.println("������ �ο��� �ĺ� ��ȣ:" + (max + ExId.getStep()));
	}
}