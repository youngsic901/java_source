package pack4extends;

public class Ex17PolyBus extends Ex17PolyCar{
	private int passenger = 10;

	public Ex17PolyBus() {
//		super(); // 생성자 내부에서 super 클래스의 생성자를 다시 호출함
		System.out.println("Bus 생성자 시작");
	}

	@Override
	public void dispData() { // super 클래스에서 상속 받은 메소드
		System.out.println("버스 승객 수 : " + passenger);
		System.out.println("버스 속도는 " + speed);
	}

	public void show() { // Ex17PolyBus 클래스의 고유 메소드
		System.out.println("버스 고유 메소드 show");
	}
}
