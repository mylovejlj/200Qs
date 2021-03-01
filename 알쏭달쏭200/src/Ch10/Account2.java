package Ch10;


public class Account2 {

	private static int counter = 0;

	private String name;
	private String no;
	private long balance;
	private Day2 openDay;
	private int id;
	
	// 인스턴스 초기화
	{
		id = ++counter;
		System.out.println("은행 계좌를 개설해주셔서 감사합니다.");
	}

	// 생성자(예금액은 0이고 계좌 개설일은 오늘)
	public Account2(String name, String no) {
		this(name, no, 0, new Day2());
	}

	// 생성자
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

	// 입금
	void deposit(long k) {
		balance += k;
	}

	// 출금
	void withdraw(long k) {
		balance -= k;
	}

}
