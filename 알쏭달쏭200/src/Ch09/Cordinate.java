package Ch09;

public class Cordinate {

	private double x;
	private double y;
	
	public Cordinate(double x, double y) {
		this.x = x;
		this.y = y;
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
	
	void set(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
}
