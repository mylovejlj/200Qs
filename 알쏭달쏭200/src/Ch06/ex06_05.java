package Ch06;
//배열의 요소수가 5인 int형 배열을 5,4,3,2,1순으로 초기화해서 표시하는 프로그램을 작성하자
public class ex06_05 {

	public static void main(String[] args) {

		//요소 수 5인 배열이 생성된 걸 arr가 참조한다.
		//둘 다 가능
		int[] arr = new int[]{5,4,3,2,1};
		//int[] arr = {5,4,3,2,1};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		
		
		
		
	}

}
