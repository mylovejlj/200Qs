package Ch08;

//Ŭ����(Ʋ) ����
class Human2 {
	String name;
	int height;
	int weight;
}

//public�� ���⸸ �� �� �ִ�. ���ϸ��� ���� �� Ŭ����!
public class ex08_01 {

	public static void main(String[] args) {
		// Ŭ������ ������, �ν��Ͻ�(Ŭ������ ��ü)��ü�� ����
		Human2 gildong = new Human2();
		Human2 chulsu = new Human2();

		gildong.name = "�浿";
		gildong.height = 184;
		gildong.weight = 65;

		chulsu.name = "ö��";
		chulsu.height = 180;
		chulsu.weight = 75;

		System.out.println("�̸�:" + gildong.name);
		System.out.println("����:" + gildong.height);
		System.out.println("ü��:" + gildong.weight);

		System.out.println("�̸�:" + chulsu.name);
		System.out.println("����:" + chulsu.height);
		System.out.println("ü��:" + chulsu.weight);
		
	}


}
