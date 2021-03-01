package Ch08;

public class Car {

	private String name;
	private String number;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double tankage;
	private double fuel;
	private double sfc;

	public Car(String name, String number, int width, int height, int length, double tankage, double fuel, double sfc) {

		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.tankage = tankage;
		this.fuel = (fuel <= tankage) ? fuel : tankage;
		this.sfc = sfc;
		x = y = 0.0;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getFuel() {
		return fuel;
	}

	void putSpec() {
		System.out.println("�̸�:" + name);
		System.out.println("��ȣ:" + number);
		System.out.println("����:" + width + "mm");
		System.out.println("����:" + height + "mm");
		System.out.println("����:" + length + "mm");
		System.out.println("��ũ:" + tankage + "����");
		System.out.println("����:" + sfc + "km/����");
	}

	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);
		double f = dist / sfc;

		if (f > fuel) {
			return false;
		} else {
			fuel -= f;
			x += dx;
			y += dy;
			return true;
		}
	}

	void refuel(double df) {
		if (df > 0) {
			fuel += df;
			if (fuel > tankage) {
				fuel = tankage;
			}
		}
	}
}
