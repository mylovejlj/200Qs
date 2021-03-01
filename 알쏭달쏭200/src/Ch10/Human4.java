package Ch10;


//클래스(틀) 생성
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
		System.out.println("이름:" +name);
		System.out.println("신장:" +height);
		System.out.println("체중:" +weight);
	}
	
}

class HumanTester {

	public static void main(String[] args) {
		
		// 클래스형 변수로, 인스턴스(클래스의 실체)객체를 생성
		Human4 gildong = new Human4("길동",170,60);
		Human4 chulsu = new Human4("철수",180,70);

		gildong.putData();
		System.out.println("번호:" + gildong.getId());

		chulsu.putData();
		System.out.println("번호:" + chulsu.getId());
		
		
	}
}
