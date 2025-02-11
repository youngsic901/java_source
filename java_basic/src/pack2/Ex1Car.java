package pack2;

// 클래스 형식 : [접근지정자] class 클래스명
public class Ex1Car { // Car 객체(Object)를 생산하기 위한 설계도 : class
	// 새로운 타입(type, 형)을 만들기 위함
	//field 와 method 를 멤버로 가질 수 있다.
	// 동일한 field와 method를 수행하는 객체의 집합을 설계

	int wheel;	// 멤버 필드 [접근지정자] type 필드명
	private int airBag = 1; // 캡슐화 : 멤버 접근지정자가 private인 경우
	private int speed;
	public String name;

	public Ex1Car() { // 특별한 메소드(클래스와 메소드명이 일치) => 생성자(Constructor)
		System.out.println("객체 생성시 생성자가 가장 먼저 수행 : 초기화를 담당");
		wheel = 4;
		name = "그랜저";
	}

	private void abc() { // 멤버 메소드. [접근지정자] 반환형 메소드명(매개변수...) { ... }
		System.out.println("abc 메소드 실행");
	}

	void def() { // 메소드 수행 후 반환값이 없이 돌아갈 경우에는 void
		System.out.println("def 메소드 실행");
		System.out.println("바퀴수는 " + wheel);
		System.out.println("에어백 수는 " + airBag);
		abc(); // 각각 private 필드, 메소드이나 현재 클래스 내에서 호출 가능
	}

	public String driving() { // 메소드 수행 후 String 타입의 반환값
		System.out.println("운전하기");
		return "현재 고속도로 운전 중";
	}

	public int drivingStop() { // 메소드 수행 후 int 타입의 반환값이 있는 경우는 int
		System.out.println("운전 멈추기");
		return speed; // 정수 return
	}

	// 참고 : 변수에 값을 저장하는 방법은 두가지.
	// 1) 변수 = 리터럴;
	// 2) 매개변수를 이용. 메소드명(타입 매개변수){...} 하고 메소드명(값)한다.
	public void drivingGood(int w) { // w => 파라미터
		wheel = w;
		System.out.println(wheel + "개의 바퀴를 가진 이동수단 사용");
	}
}

// 클래스를 공부하는 이유
// 1) 직접 객체를 생성 후 사용하기 위함
// 2) 다른 사람이 만든 클래스를 활용하기 위함