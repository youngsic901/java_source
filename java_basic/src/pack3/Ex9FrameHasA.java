package pack3;

import java.awt.Frame;

public class Ex9FrameHasA {
	String name = "신기해";
	private Frame frame; // 외부 클래스를 사용

	public Ex9FrameHasA() {
		frame = new Frame("포함 연습용"); // 클래스의 포함관계

//		frame.setSize(500, 300);
//		frame.setLocation(200, 150);
//		frame.setVisible(true);
	}

	public void frameVisible() { // 생성자는 초기화 및 전체 윤곽만 적고, 나머지(처리로직)는 별도 메소드로 작성하는것이 좋음
		frame.setSize(500, 300);
		frame.setLocation(200, 150);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
//		new Ex9FrameHasA(); // 생성자에서 모든 일이 처리될 때는 객체변수가 굳이 필요하지않음
		Ex9FrameHasA frameHas = new Ex9FrameHasA();
		frameHas.frameVisible();
		// 위 두 줄을 한 줄로 표현

		new Ex9FrameHasA().frameVisible();
	}
}
