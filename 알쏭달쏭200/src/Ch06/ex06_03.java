package Ch06;
//요소 개수가 5인 double형 배열을 만들고 앞에서부터 1.1, 2.2, 3.3, 4.4, 5.5를 대입해보자
public class ex06_03 {

	public static void main(String[] args) {
		
		double[] arr = new double[5];

		for (int i = 1; i <= arr.length; i++) {
			
			arr[i-1] += i*1.1; 

			System.out.println("arr[" + (i-1) + "]=" + arr[i-1]);
		}
	}

}
