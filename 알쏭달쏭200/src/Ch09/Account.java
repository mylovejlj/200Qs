package Ch09;

public class Account {

	private String name;
	private String no;
	private long balance;
	private Day openDay;
	
	public Account(String name, String no, long balance, Day openDay) {
		super();
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.openDay = openDay;
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
	
	public Day getOpenDay() {
		return openDay;
	}
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", no=" + no + ", balance=" + balance + "]";
	}

	//입금
	void deposit(long k) {
		balance += k;
	}
	//출금
	void withdraw(long k) {
		balance -= k;
	}
	

}
