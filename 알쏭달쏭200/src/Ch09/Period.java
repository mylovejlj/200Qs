package Ch09;

public class Period {

	private Day from;
	private Day to;
	
	public Period(Day from, Day to) {
		this.from = new Day(from);
		this.to = new Day(to);
	}

	public Day getFrom() {
		return new Day(from);
	}

	public void setFrom(Day from) {
		this.from = from;
	}

	public Day getTo() {
		return new Day(to);
	}

	public void setTo(Day to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "{" + from + "~" + to+"}";
	}
	
}

class PeriodTester {

	public static void main(String[] args) {

		Period taejo = new Period(new Day(2021,02,10),new Day(2021,2,11));
		System.out.println("еба╤"+taejo);
	}

}