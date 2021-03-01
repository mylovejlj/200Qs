package Ch03;
//0,1,2 중 하나의 난수를 생성해서 0이면 "가위", 1이면 "바위", 2이면 "보"를 출력하는 프로그램을 만드시오.
public class ex03_20 {

	public static void main(String[] args) {

		System.out.println("컴퓨터가 낸 것 :");
		int rnd = (int) (Math.random()*(2-0+1)+0);
		
		switch(rnd) {
			case 0: System.out.println("가위");
				break;
			case 1: System.out.println("바위");
				break;
			case 2: System.out.println("보");
				break;
		}

	}

}
