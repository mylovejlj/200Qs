package Ch10;


public class Account2 {

	private static int counter = 0;

	private String name;
	private String no;
	private long balance;
	private Day2 openDay;
	private int id;
	
	// �ν��Ͻ� �ʱ�ȭ
	{
		id = ++counter;
		System.out.println("���� ���¸� �������ּż� �����մϴ�.");
	}

	// ������(���ݾ��� 0�̰� ���� �������� ����)
	public Account2(String name, String no) {
		this(name, no, 0, new Day2());
	}

	// ������
	public Account2(String name, String no, long balance, Day2 day) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.openDay = day;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public long getBalance() {
		return balance;
	}

	public Day2 getOpenDay() {
		return openDay;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", no=" + no + ", balance=" + balance + "]";
	}

	// �Ա�
	void deposit(long k) {
		balance += k;
	}

	// ���
	void withdraw(long k) {
		balance -= k;
	}

}
