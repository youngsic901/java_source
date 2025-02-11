package pack2;

public class Ex1Main {

	public static void main(String[] args) { // Ex1Main은 main 메소드를 실행하기 위한 클래스이다.
		// main 은 응용 프로그램의 시작을 위해 정해진 method 이다.
		// Ex1Car 설계도로 객체를 생성. 이 과정을 '객체를 instance 한다' 라고 함
		// 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화라고 하며, 어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라고 한다. => 객체는 모든 인스턴스를 대표하는 포괄적 의미이다.
		// 클래스 --> 인스턴스화 --> 객체

		// Ex1Car.class를 주기억장치로 읽은 후 car1이란 객체변수를 선언.
		// new 키워드로 인스턴스를 진행. 이 때 Ex1Car()이라는 생성자를 호출
		Ex1Car car1 = new Ex1Car(); // => 해당 명령어로 heap에 instance가, stack에 해당 인스턴스의 주소가 저장된다. class는 static에 만들어진다.

		// Ex1Car 멤버필드(전역변수) 호출 ------
		System.out.println(car1.wheel); // 접근지정자가 default 이므로 호출 가능
//		System.out.println(car1.airBag); // private 멤버이므호 호출 불가
		System.out.println(car1.name); // String은 참조형 변수인데 아무것도 참조하지 않아서 null값이 찍힌다.

		// Ex1Car 메소드 호출 ------
//		car1.abc(); // private 메소드이므로 호출 불가
		car1.def();

		System.out.println();
		String ss = car1.driving();
		System.out.println(ss);

		System.out.println(car1.driving());

		System.out.println();
		car1.drivingGood(2); // 2 => 아규먼트 // 매개변수가 있는 메소드를 호출 객체변수 메소드명(값)한다.

		System.out.println();
		System.out.println("===================================");
		Ex1Car car2 = new Ex1Car();
		System.out.println(car2.wheel);
		car2.def();
	}

}
