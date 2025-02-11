package pack4extends;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex23FrameInterface extends Frame implements WindowListener, MouseListener{ // implements 다음엔 인터페이스를 여러개 상속할 수 있음

	public Ex23FrameInterface() {
		super.setTitle("이벤트 처리 창");

		setSize(400, 300);
		setLocation(200, 200);
		setVisible(true);

		// 윈도우 관련 이벤트 처리를 하려면 윈도우 리스너를 Frame에 장착해야 한다.
//		super.addWindowListener(this); // 윈도우 리스너 인수 => 현재 클래스
		addWindowListener(this);
		addMouseListener(this);
	}

	public static void main(String[] args) {
//		Ex23FrameInterface frameInterface = new Ex23FrameInterface();
		new Ex23FrameInterface();
	}

	// WindowListener 인터페이스에 정의된 모든 메소드를 오버라이딩 해야 한다.
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우 종료 처리 메소드");
		System.exit(0); // 응용프로그램 강제 종료
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}

	// 마우스 이벤트 관련
	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("mouseClicked 메소드 수행");
//		System.out.println((int)(Math.random() * 256)); // random 은 static 메소드
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		setBackground(new Color(r, g, b));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
