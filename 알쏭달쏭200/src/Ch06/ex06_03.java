package Ch06;
//��� ������ 5�� double�� �迭�� ����� �տ������� 1.1, 2.2, 3.3, 4.4, 5.5�� �����غ���
public class ex06_03 {

	public static void main(String[] args) {
		
		double[] arr = new double[5];

		for (int i = 1; i <= arr.length; i++) {
			
			arr[i-1] += i*1.1; 

			System.out.println("arr[" + (i-1) + "]=" + arr[i-1]);
		}
	}

}
