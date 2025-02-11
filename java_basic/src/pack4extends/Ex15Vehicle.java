package pack4extends;

public class Ex15Vehicle {
	protected String brand; // 해당 클래스가 부모 클래스임을 암시
	protected int speed;

	public Ex15Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	public void describe() {
		System.out.println("This is a vehicle");
	}
}
