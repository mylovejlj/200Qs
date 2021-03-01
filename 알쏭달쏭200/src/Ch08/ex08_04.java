package Ch08;

//public은 여기만 쓸 수 있다. 파일명이 정의 된 클래스!
public class ex08_04 {
	
	public static void main(String[] args) {
		
		Car k3 = new Car("k3","서울999-99",1660,1500,3640,40.0,35.0,12.0);
		Car k5 = new Car("k5","서울999-98",1660,1525,3695,41.0,35.0,12.0);
		
		k3.putSpec();
		System.out.println();
		k5.putSpec();
	}

}
