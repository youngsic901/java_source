package pack4extends;

public class Ex18JepumTv extends Ex18Jepum{
	public Ex18JepumTv() {
//		super();
		System.out.println("TV 생성자");
	}

	@Override
	public void volumeControl() { // jepum클래스의 추상메소드에 의해 해당 메소드는 강제로 오버라이딩 된다.
		// 메소드 오버라이딩 해야 함(추상클래스)
		System.out.println("TV 소리 조절");
	}
}
