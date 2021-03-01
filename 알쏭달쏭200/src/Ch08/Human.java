package Ch08;

//클래스(틀) 생성
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

//public은 여기만 쓸 수 있다. 파일명이 정의 된 클래스!
class HumanTester {

	public static void main(String[] args) {
		
		// 클래스형 변수로, 인스턴스(클래스의 실체)객체를 생성
		Human gildong = new Human("길동",170,60);
		Human chulsu = new Human("철수",180,70);

		gildong.gainWeight(3);
		chulsu.reduceWeight(3);

		System.out.println("이름:" + gildong.getName());
		System.out.println("신장:" + gildong.getHeight());
		System.out.println("체중:" + gildong.getWeight());

		System.out.println("이름:" + chulsu.getName());
		System.out.println("신장:" + chulsu.getHeight());
		System.out.println("체중:" + chulsu.getWeight());
		
	}
}
