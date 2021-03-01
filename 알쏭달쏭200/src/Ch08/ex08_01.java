package Ch08;

//클래스(틀) 생성
class Human2 {
	String name;
	int height;
	int weight;
}

//public은 여기만 쓸 수 있다. 파일명이 정의 된 클래스!
public class ex08_01 {

	public static void main(String[] args) {
		// 클래스형 변수로, 인스턴스(클래스의 실체)객체를 생성
		Human2 gildong = new Human2();
		Human2 chulsu = new Human2();

		gildong.name = "길동";
		gildong.height = 184;
		gildong.weight = 65;

		chulsu.name = "철수";
		chulsu.height = 180;
		chulsu.weight = 75;

		System.out.println("이름:" + gildong.name);
		System.out.println("신장:" + gildong.height);
		System.out.println("체중:" + gildong.weight);

		System.out.println("이름:" + chulsu.name);
		System.out.println("신장:" + chulsu.height);
		System.out.println("체중:" + chulsu.weight);
		
	}


}
