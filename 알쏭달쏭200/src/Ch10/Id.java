package Ch10;

//클래스(틀) 생성
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

		// 클래스형 변수로, 인스턴스(클래스의 실체)객체를 생성
		Id a = new Id();
		Id b = new Id();

		System.out.println("a의 식별번호:" + a.getId());
		System.out.println("b의 식별번호:" + b.getId());

		System.out.println("Id.counter:" + Id.counter);
		System.out.println("a.counter:" + a.counter);
		System.out.println("b.counter:" + b.counter);
	}
}
