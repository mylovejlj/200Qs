package Ch09;

public class Cordinate2 {

	private double x = 0.0;
	private double y = 0.0;
	
	public Cordinate2() {}
	public Cordinate2(double x, double y) {
		set(x,y);
	}
	public Cordinate2(Cordinate2 c) {
		this(c.x, c.y);
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public boolean equalTo(Cordinate2 c) {
		return x == c.x && y == c.y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
}
