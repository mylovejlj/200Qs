package Ch06;
//요소 개수가 5개인 int형 배열에 순서대로 5,4,3,2,1을 대입해보자
public class ex06_02 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];

		int k = 5;
		for (int i = 0; i <= arr.length - 1; i++) {
		
			arr[i] = k;
			k--;
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

}
