package Ch10;


//Ŭ����(Ʋ) ����
public class Human4 {
	private static int counter = 0;	
	private String name;
	private int height;
	private int weight;
	private int id;
	

	public Human4(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		id= ++counter;
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

	public int getId() {
		return id;
	}
	
	void gainWeight(int w) {
		weight += w;
	}
	void reduceWeight(int w) {
		weight -= w;
	}
	
	public void putData() {
		System.out.println("�̸�:" +name);
		System.out.println("����:" +height);
		System.out.println("ü��:" +weight);
	}
	
}

class HumanTester {

	public static void main(String[] args) {
		
		// Ŭ������ ������, �ν��Ͻ�(Ŭ������ ��ü)��ü�� ����
		Human4 gildong = new Human4("�浿",170,60);
		Human4 chulsu = new Human4("ö��",180,70);

		gildong.putData();
		System.out.println("��ȣ:" + gildong.getId());

		chulsu.putData();
		System.out.println("��ȣ:" + chulsu.getId());
		
		
	}
}
