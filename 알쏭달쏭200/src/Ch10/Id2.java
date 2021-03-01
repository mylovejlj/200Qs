package Ch10;

//클래스(틀) 생성
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
		
		// 클래스형 변수로, 인스턴스(클래스의 실체)객체를 생성
		Id2 a = new Id2();
		Id2 b = new Id2();
		
		System.out.println("a의 식별번호:" + a.getId());
		System.out.println("b의 식별번호:" + b.getId());
		
		System.out.println("마지막으로 부여한 식별 번호:" + Id2.getMaxId());
		System.out.println("마지막으로 부여한 식별 번호:" + a.getMaxId());
		System.out.println("마지막으로 부여한 식별 번호:" + b.getMaxId());
	}
}
