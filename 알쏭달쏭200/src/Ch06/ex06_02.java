package Ch06;
//��� ������ 5���� int�� �迭�� ������� 5,4,3,2,1�� �����غ���
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
