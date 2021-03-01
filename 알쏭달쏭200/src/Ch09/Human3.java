package Ch09;

//클래스(틀) 생성
public class Human3 {
	private String name;
	private int height;
	private int weight;
	private Day birthday;
	
	public Human3(String n, int h, int w, Day b) {
		name = n;
		height = h;
		weight = w;
		birthday = new Day(b);
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

	public Day getBirthday() {
		return new Day(birthday);
	}
	
	void gainWeight(int w) {
		weight += w;
	}
	void reduceWeight(int w) {
		weight -= w;
	}

	@Override
	public String toString() {
		return "Human3 [name=" + name + ", height=" + height + ", weight=" + weight + ", birthday=" + birthday + "]";
	}
	
}

class HumanTester {

	public static void main(String[] args) {
		
		Day day = new Day();
		
		day.set(2017, 5, 5);
		Human3 gildong = new Human3("길동",170,60,day);
		
		day.set(1999, 9, 9);
		Human3 chulsu = new Human3("철수",180,70,day);

		gildong.gainWeight(3);
		chulsu.reduceWeight(3);

		System.out.println("gildong:" + gildong);
		System.out.println("chulsu:" + chulsu.toString());		
		
	}
}

