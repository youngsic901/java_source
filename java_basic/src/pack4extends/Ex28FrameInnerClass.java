package pack4extends;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex28FrameInnerClass extends Frame{
	int x, y;

	public Ex28FrameInnerClass() {
		setTitle("내부 클래스 사용");
		setSize(400, 300);
		setLocation(200, 200);
		setVisible(true);

//		Wevent wevent = new Wevent();
//		addWindowListener(wevent);
		addWindowListener(new Wevent()); // 사용자가 입력할 때까지 대기
		addMouseListener(new Mevent());
	}

	class Wevent extends WindowAdapter { // 내부 클래스(extends 여러번 사용)
		@Override
		public void windowClosing(WindowEvent e) { // 이벤트가 발생하면 자동으로 실행(call back)
			System.exit(0); // 해당 메소드로 무한루프 종료
		}
	}

	class Mevent extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) { // 사용자가 이벤트를 발생시킴 => 매개변수 e에 저장됨
//			setBackground(new Color(255, 255, 0));
//			System.out.println(e.getX() + " " + e.getY());
//			setTitle(e.getX() + " " + e.getY());

			x = e.getX();
			y = e.getY();

			paint(getGraphics());
		}
	}

	@Override
	public void paint(Graphics g) { // Frame은 paint() 를 처음 실행 시 한번만 호출한다.
		g.drawString("홍길동", x, y);
	}

	public static void main(String[] args) {
		new Ex28FrameInnerClass();
	}
}
