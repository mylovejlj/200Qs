package Ch03;
//0,1,2 �� �ϳ��� ������ �����ؼ� 0�̸� "����", 1�̸� "����", 2�̸� "��"�� ����ϴ� ���α׷��� ����ÿ�.
public class ex03_20 {

	public static void main(String[] args) {

		System.out.println("��ǻ�Ͱ� �� �� :");
		int rnd = (int) (Math.random()*(2-0+1)+0);
		
		switch(rnd) {
			case 0: System.out.println("����");
				break;
			case 1: System.out.println("����");
				break;
			case 2: System.out.println("��");
				break;
		}

	}

}
