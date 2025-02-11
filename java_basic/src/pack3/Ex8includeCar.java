package pack3;

public class Ex8includeCar { // 여러 개의 부품 클래스를 불러 완성차를 생산하기 위한 클래스
	int speed = 0; // 클래스 고유 멤버
	String ownerName;
	String turnShow;
	// 클래스의 포함관계(has a)
	Ex8Handle handle = new Ex8Handle(); // 외부 클래스를 현재 클래스의 멤버처럼 사용하기 위함
	// 엔진, 타이어, 램프 등등을 클래스에 포함관계로 호출해서 사용. 객체지향적인 프로그래밍(OOP) 철학

	public Ex8includeCar() {

	}

	public Ex8includeCar(String ownerName) {
		this.ownerName = ownerName;
		handle = new Ex8Handle();
	}

	void driveTurnHandle(int q) { // q : 회전량을 의미(약속)
		if(q > 0) {
			turnShow = handle.rightTurn(q);
		}
		if(q < 0) {
			turnShow = handle.leftTurn(q);
		}
		if(q == 0) {
			turnShow = handle.straight(q);
		}
	}
}
