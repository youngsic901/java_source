package pack4extends;

// parent, super, 부모, 원형 클래스 ...
public class Ex17PolyCar { // 모든 자동차들이 공통으로 가져야할 멤버(필드, 메소드) 선언
	protected int speed = 100;

	public Ex17PolyCar() {
		System.out.println("나는 자동차 원형 클래스야");
	}

	public void dispData() {
		System.out.println("속도 : " + speed);
	}

	public int getSpeed() {
		return speed;
	}
}
