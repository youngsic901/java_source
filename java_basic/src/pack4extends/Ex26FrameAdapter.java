package pack4extends;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex26FrameAdapter extends WindowAdapter{ // 상속
	private Frame frame; // 클래스의 포함관계

	public Ex26FrameAdapter() {
		frame = new Frame("어댑터 사용");
		frame.setSize(400, 300);
		frame.setLocation(200, 200);
		frame.setVisible(true);

		frame.addWindowListener(this);
	}

	@Override
	public void windowClosing(WindowEvent e) { // 콜백 메소드(이벤트 발생시 처리되는 메소드)
		// 윈도우 이벤트 관련 메소드 중 원하는 메소드만 오버라이딩 가능함
		System.exit(0);
	}

	public static void main(String[] args) { // main 메소드도 콜백 메소드중 하나이다
		new Ex26FrameAdapter();
	}
}