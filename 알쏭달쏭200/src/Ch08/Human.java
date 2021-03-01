package Ch08;

//Ŭ����(Ʋ) ����
public class Human {
	private String name;
	private int height;
	private int weight;
	
	public Human(String n, int h, int w) {
		name = n;
		height = h;
		weight = w;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}

	
	void gainWeight(int w) {
		weight += w;
	}
	void reduceWeight(int w) {
		weight -= w;
	}
	
}

//public�� ���⸸ �� �� �ִ�. ���ϸ��� ���� �� Ŭ����!
class HumanTester {

	public static void main(String[] args) {
		
		// Ŭ������ ������, �ν��Ͻ�(Ŭ������ ��ü)��ü�� ����
		Human gildong = new Human("�浿",170,60);
		Human chulsu = new Human("ö��",180,70);

		gildong.gainWeight(3);
		chulsu.reduceWeight(3);

		System.out.println("�̸�:" + gildong.getName());
		System.out.println("����:" + gildong.getHeight());
		System.out.println("ü��:" + gildong.getWeight());

		System.out.println("�̸�:" + chulsu.getName());
		System.out.println("����:" + chulsu.getHeight());
		System.out.println("ü��:" + chulsu.getWeight());
		
	}
}
