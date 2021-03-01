package Ch06;

//요소 수가 5인 배열을 생성하고 이 배열의 모든 요소를 표시하자
public class ex06_01 {

	public static void main(String[] args) {

		double[] arr = new double[5];

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}
}
